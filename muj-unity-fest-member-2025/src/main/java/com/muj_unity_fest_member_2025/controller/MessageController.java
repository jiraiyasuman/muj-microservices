package com.muj_unity_fest_member_2025.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.muj_unity_fest_member_2025.dto.MessageDto;
import com.muj_unity_fest_member_2025.service.MessageService;

import jakarta.validation.Valid;
@Controller
@RequestMapping("mujunityfestmember")
public class MessageController {

	private MessageService messageService;

	@Autowired
	public MessageController(MessageService messageService) {
		super();
		this.messageService = messageService;
	}
	@PostMapping("saveMessage")
	public String saveMessage(@Valid @ModelAttribute("Message") MessageDto messageDto) {
		MessageDto savedMessageDto = messageService.saveMessage(messageDto);
		return "redirect:/contact-us";
	}
	@GetMapping("getMessageList")
	public String getMessage(Model model) {
		List<MessageDto> getList = messageService.getAllList();
		model.addAttribute("Messages", getList);
		return "display-message-member";
	}
	@GetMapping("getMessageList/{id}")
	public String getMessageById( @PathVariable("id") Integer id,Model model) {
		MessageDto messageDto = messageService.getMessageById(id);
		model.addAttribute("MessageInd", messageDto);
		return "get-individual-member";
	}
	
}
