package com.myemqtt.publisher;

import org.eclipse.paho.client.mqttv3.MqttConnectOptions;


public class Publisher {
	
	public static void main(String[] args) {
			//定义服务器地址
			String broker="tcp://127.0.0.1:1883";
			//定义消息主题
			String topic="emqtt/test/chanel/1";
			//定义ID，ID不相同
			String ClientId="publisher";
			MqttConnectOptions mqttConnectOptions = new MqttConnectOptions();
	}
}
