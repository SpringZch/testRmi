package com.ch.practice.rmi;

import java.rmi.*;
/*
 * 任何能够远程使用的对象必须定义在扩展接口java.rmi.Remote的接口中，
 * 该接口的每个方法必须声明为可能抛出异常java.rmi.RemoteException
 * 因此客户调用每个方法的代码必须准备在try-catch块中捕获这个异常
 */
public interface StudentServerInterface extends Remote{
	public double findScore(String name) throws RemoteException;
}
