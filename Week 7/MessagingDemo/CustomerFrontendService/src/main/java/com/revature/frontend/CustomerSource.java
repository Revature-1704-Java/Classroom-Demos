package com.revature.frontend;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface CustomerSource {
	
	@Output("customerChannel")
	MessageChannel customerChan();

}
