package project.client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import project.data.Pergunta;

public class Client {
    

    public void iniciaADM(String senha) throws ClassNotFoundException {
		
        System.out.println(senha);

		Scanner entrada = new Scanner(System.in);
		
		try {
			// cria conex�o entre client, sevidor 
			System.out.println("Estabelecendo conexao...");
			Socket socketAdm = new Socket("localhost", 5555);//192.168.2.11
			System.out.println("Conexao Estabelecida.");
			
			// cria��o dos streams de entrada e saida
			ObjectOutputStream output = new ObjectOutputStream(socketAdm.getOutputStream());
			ObjectInputStream input = new ObjectInputStream(socketAdm.getInputStream());
			//System.out.println("Enviando menssagem...");
			// manda msg 
			String msg = senha;
			output.writeUTF(msg);
			output.flush();
			System.out.println("Menssagem " + msg + " enviada");
			// recebe msg
			msg = (String) input.readObject();
			System.out.println("Respota do Server: "+ msg);
			//Runtime.getRuntime().exec("cls");
			if(msg.equals("Conex�o negada.")) {
				System.exit(0);
			}else{
				
			}
			input.close();
			output.close();
			socketAdm.close();
		} catch (IOException e) {
			System.err.println("ERRO no cliente: " + e);
			Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, e);
		}
		
	}
	
	private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
