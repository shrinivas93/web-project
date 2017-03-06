package com.foo.bar.exception.mapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.foo.bar.util.response.ResponseUtil;

@Provider
public class ThrowableMapper implements ExceptionMapper<Throwable> {

	@Autowired
	ResponseUtil responseUtil;

	private static final Logger LOGGER = LogManager.getLogger(ThrowableMapper.class.getName());

	@Override
	public Response toResponse(Throwable exception) {
		LOGGER.error(exception);
		return responseUtil.getErrorResponse(exception.getMessage(), Status.INTERNAL_SERVER_ERROR.getStatusCode());
	}

}
