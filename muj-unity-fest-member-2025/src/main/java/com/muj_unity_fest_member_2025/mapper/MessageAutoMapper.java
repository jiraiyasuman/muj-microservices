package com.muj_unity_fest_member_2025.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.muj_unity_fest_member_2025.dto.MessageDto;
import com.muj_unity_fest_member_2025.entity.Message;

@Mapper
public interface MessageAutoMapper {

	MessageAutoMapper MAPPER = Mappers.getMapper(MessageAutoMapper.class);
	public Message mapToMessage(MessageDto messageDto);
	
	public MessageDto mapToMessageDto(Message message);
}
