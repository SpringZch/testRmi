package com.ch.practice.rmiClient;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import org.omg.CORBA.PRIVATE_MEMBER;

public class StudentServerInterfaceClient {
	
	private StudentServerInterface student;
	
	private void getScore(String s){
		try {
			double score = student.findScore(s);
			if (score < 0) {
				System.out.println("not found");
			}else {
				System.out.println("score is"+(new Double(score).toString()));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void initializeRMI() {
		String host="127.0.0.1";
		try {
			Registry registry = LocateRegistry.getRegistry(host);
			student = (StudentServerInterface)registry.lookup("studentInterfaceImpl");
			System.out.println("zhucufuwuqizhaodao");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentServerInterfaceClient ssic= new StudentServerInterfaceClient();
		ssic.initializeRMI();
		System.out.println("main");
		ssic.getScore("nn");
	}

}
