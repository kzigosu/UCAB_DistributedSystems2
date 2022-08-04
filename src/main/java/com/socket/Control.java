// A Java program for a Server
package com.socket;

import java.net.ServerSocket;
import java.net.Socket;

// A Java program for a Server
import java.net.*;
import java.io.*;

public class Control
{
	//initialize socket and input stream
	private Socket		 socket = null;
	private ServerSocket server = null;
	private DataInputStream in	 = null;

	// constructor with port
	public Control(int port)
	{
		// starts server and waits for a connection
		try
		{
			server = new ServerSocket(port);
			System.out.println("Servidor iniciado");

			System.out.println("Esperando...");

			socket = server.accept();
			System.out.println("Conectado a cliente");

			// takes input from the client socket
			in = new DataInputStream(
				new BufferedInputStream(socket.getInputStream()));

			String line = "";

			// reads message from client until "Over" is sent
			while (!line.equals("Over"))
			{
				try
				{
					line = in.readUTF();
					System.out.println(line);

				}
				catch(IOException i)
				{
					System.out.println(i);
				}
			}
			System.out.println("Cerrando conexion");

			// close connection
			socket.close();
			in.close();
		}
		catch(IOException i)
		{
			System.out.println(i);
		}
	}

	public void start(int port) throws IOException{
		server = new ServerSocket(port);
		while(true)
			new Manejador(server.accept()).start();
	}

	public void stop() throws IOException{
		server.close();
	}
}