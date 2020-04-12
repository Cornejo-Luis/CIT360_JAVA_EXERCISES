package com.cornejo.client;

import com.cornejo.bean.Client;
import com.cornejo.util.JsonUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client=new Client();
		client.setId(1);
		client.setFirst_name("Luis");
		client.setLast_name("Cornejo");
		client.setEmail("cor16037@byui.edu");
		
		String jsonClient =JsonUtil.convertJavaToJson(client);
		
		System.out.println(jsonClient);
		
		System.out.println("==============================================");
		
		Client client1 = JsonUtil.convertJsonToJava(jsonClient, Client.class);
		System.out.println(client1.getId()+" "+client1.getFirst_name()+" "+client1.getLast_name()+" "+client1.getEmail());
	}

}
