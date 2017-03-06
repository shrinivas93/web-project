package com.foo.bar.util.response;

import java.io.IOException;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResponseUtil {

	@Autowired
	private ObjectMapper objectMapper;

	public Response getSuccessResponse(String message, int code) {
		return getSuccessResponse(null, message, code);
	}

	public Response getSuccessResponse(Object object, String message, int code) {
		ResponseStatus status = new ResponseStatus(ResponseType.SUCCESS, code, message);
		ResponseEntity responseEntity = new ResponseEntity(object, status, null);
		String response = null;
		try {
			response = objectMapper.writeValueAsString(responseEntity);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Response.status(code).type(MediaType.APPLICATION_JSON).entity(response).build();
	}

	public Response getErrorResponse(String message, int code) {
		return getErrorResponse(null, message, code);
	}

	public Response getErrorResponse(Object object, String message, int code) {
		ResponseStatus status = new ResponseStatus(ResponseType.ERROR, code, message);
		ResponseEntity responseEntity = new ResponseEntity(object, status, null);
		String response = null;
		try {
			response = objectMapper.writeValueAsString(responseEntity);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Response.status(code).type(MediaType.APPLICATION_JSON).entity(response).build();
	}

}
