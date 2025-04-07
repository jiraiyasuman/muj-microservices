package com.muj_unity_fest_member_2025.service;

import java.util.List;

import com.muj_unity_fest_member_2025.dto.MessageDto;
import com.muj_unity_fest_member_2025.entity.Message;

public interface MessageService {

	public MessageDto saveMessage(MessageDto messageDto);
	
	public List<MessageDto> getAllList();
	
	public MessageDto getMessageById(Integer id);
	
	public void sendEmail(Message messageDto,String subject,String message);
}
