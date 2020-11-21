package tarefa1;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Marconi
 */
import java.io.*;
import java.net.*;
 
class UDPServer {
	public static void main(String args[]) throws Exception {
 
		int porta = 8080;
		int numConn = 1;
		
		DatagramSocket serverSocket = new DatagramSocket(porta);
 
		byte[] receiveData = new byte[1024];
		byte[] sendData = new byte[1024];
 
		while (true) {
 
			DatagramPacket receivePacket = new DatagramPacket(receiveData,
					receiveData.length);
			System.out.println("Esperando por datagrama UDP na porta " + porta);
			
			serverSocket.receive(receivePacket);
			
			System.out.print("Datagrama UDP [" + numConn + "] recebido...");
 
			String sentence = new String(receivePacket.getData());
			System.out.println(sentence);
			
			//InetAddress IPAddress = receivePacket.getAddress();
 
			//int port = receivePacket.getPort();
 
			//String capitalizedSentence = sentence.toUpperCase();
 
			//sendData = capitalizedSentence.getBytes();
 
			//DatagramPacket sendPacket = new DatagramPacket(sendData,
				//	sendData.length, IPAddress, port);
			
			//System.out.print("Enviando " + capitalizedSentence + "...");
 
			//serverSocket.send(sendPacket);
			System.out.println("OK\n");
		}
	}
}