package com.muj_unity_fest_member_2025.serviceimpl;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.muj_unity_fest_member_2025.dto.MessageDto;
import com.muj_unity_fest_member_2025.entity.Message;
import com.muj_unity_fest_member_2025.exception.NotFoundException;
import com.muj_unity_fest_member_2025.mapper.MessageAutoMapper;
import com.muj_unity_fest_member_2025.repository.MessageRepository;
import com.muj_unity_fest_member_2025.service.MessageService;

import jakarta.mail.internet.MimeMessage;
@Service
public class MessageServiceImpl implements MessageService{

	private MessageRepository messageRepository;
	private JavaMailSender javaMailSender;
	private Logger LOGGER = Logger.getLogger(getClass().getName());
	@Autowired
	public MessageServiceImpl(MessageRepository messageRepository, JavaMailSender javaMailSender) {
		super();
		this.messageRepository = messageRepository;
		this.javaMailSender = javaMailSender;
	}

	@Override
	public MessageDto saveMessage(MessageDto messageDto) {
		Message message= MessageAutoMapper.MAPPER.mapToMessage(messageDto);
		Message savedMessage = messageRepository.save(message);
		String subject = "Contact Us Email";
		String messages = "Dear "+messageDto.getFirstName()+",<br>  You have submitted your questions successfully to MUJ Unity Fest 2025 Committee team. Someone will contact you within the next 24 hours about your query.   "
				+ "<br>  Kind Regards,<br> MUJUnityFest Team 2025";
		sendEmail(message, subject, messages);
		LOGGER.info("Executing the saveMessage component in the MessageService class");
		MessageDto savedDto = MessageAutoMapper.MAPPER.mapToMessageDto(savedMessage);
		return savedDto;
	}

	@Override
	public List<MessageDto> getAllList() {
		List<Message> list = messageRepository.findAll();
		return list.stream().map((l)->(MessageAutoMapper.MAPPER.mapToMessageDto(l))).collect(Collectors.toList());
	}

	@Override
	public MessageDto getMessageById(Integer id) {
		Message message = messageRepository.findById(id).get();
		if(message == null )
			throw new NotFoundException("Message not found");
		MessageDto messageDto = MessageAutoMapper.MAPPER.mapToMessageDto(message);
		return messageDto;
	}

	@Override
	public void sendEmail(Message messageDto, String subject, String message) {
		String from = "suman.talukdar53@gmail.com";
		String to = messageDto.getEmail();
		Assert.notNull(to, "Recipient email must not be null");
	    if (to.trim().isEmpty()) {
	        throw new IllegalArgumentException("Recipient email must not be empty");
	    }
		try {
			MimeMessage msg = javaMailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(msg);
			helper.setFrom(from, "MujUnityFest 2025");
			helper.setTo(to);
			helper.setSubject(subject);
			helper.setText(message,true);
			javaMailSender.send(msg);
			LOGGER.info("Executing the sendEmail component in the MessageService class");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	
}
