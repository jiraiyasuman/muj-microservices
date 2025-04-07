package com.muj_unity_fest_member_2025.exception;

import lombok.Data;

@Data
public class ErrorResponse {

	private int status;
	private long timestamp;
	private String message;
}
