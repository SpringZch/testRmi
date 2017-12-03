package com.ch.practice.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;

/*
 * 服务器接口实现类，该类必须扩展java.rmi.server.RemoteServer或其子类，定义创建和发送对象的所需要的方法
 * UnicastRemoteObject是其子类，其实现了remoteserver的所有抽象方法
 */
public class StudentServerInterfaceImpl extends UnicastRemoteObject implements StudentServerInterface{

	private HashMap scores = new HashMap<>();
	public StudentServerInterfaceImpl() throws RemoteException{
		
	}
	
	protected void init() {
		scores.put("hong", 100);
		scores.put("xx", 99);
		scores.put("nn", 199);
	}
	public double findScore(String name) throws RemoteException{
		System.out.println("request name"+name);
		Double d = (Double)scores.get(name);
		if (d==null) {
			System.out.println("name not found");
			return -1;
		}
		else{
			return d.doubleValue();
		}
			
	}
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

}
