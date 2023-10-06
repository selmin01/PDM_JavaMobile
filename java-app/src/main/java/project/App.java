package project;

import java.util.Scanner;

import project.client.Client;

/**
 * Hello world!
 *
 */
public class App 
{

    public static Scanner input = new Scanner(System.in);
	public static Client client = new Client();

    public static void main( String[] args ) throws ClassNotFoundException
    {
        System.out.println( "Hello World!" );

        System.out.println("Ola digite a senha de ADM:");
        String senhaAdm = input.next();
        client.iniciaADM(senhaAdm);
    }
}
