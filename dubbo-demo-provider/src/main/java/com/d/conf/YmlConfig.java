package com.d.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author d
 */
@Component
@ConfigurationProperties(prefix = "server")
public class YmlConfig {
	private int port;

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
