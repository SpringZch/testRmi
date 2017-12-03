package com.ch.practice.rmi;

import java.rmi.registry.*;
public class RegisterWithRMIServer {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//创建服务器对象
			StudentServerInterface objInterface = new StudentServerInterfaceImpl();
			//获得RMI注册处的引用
			Registry registry = LocateRegistry.getRegistry(1091);
			//在注册处注册对象
			registry.rebind("studentInterfaceImpl", objInterface);
			System.out.println("server"+objInterface+"registered");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
