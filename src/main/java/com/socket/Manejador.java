package com.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Manejador extends Thread{
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;

    public Manejador(Socket socket){
        this.socket = socket;
    }
    public void run(){
        try {
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null){
                if (".".equals(inputLine)){
                    out.println("Fin");
                    break;
                }
                out.println(inputLine);
            }
            in.close();
            out.close();
        socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}