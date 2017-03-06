package com.foo.bar.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.foo.bar.util.response.ResponseUtil;

@Component
public abstract class UtilHelper {

	@Autowired
	public ResponseUtil responseUtil;
}
