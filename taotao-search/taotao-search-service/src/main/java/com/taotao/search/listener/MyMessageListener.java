package com.taotao.search.listener;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
/**
 * 接受mq发出的消息
 * @author jun
 *
 */
public class MyMessageListener implements MessageListener {

	@Override
	public void onMessage(Message message) {
		try {
			//接收到消息
			TextMessage textMessage = (TextMessage) message;
			String text = textMessage.getText();
			System.out.println(text);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
