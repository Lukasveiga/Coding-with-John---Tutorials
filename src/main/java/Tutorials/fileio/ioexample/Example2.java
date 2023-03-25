package Tutorials.fileio.ioexample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example2 {

    private static List<Cliente> clientes = new ArrayList<Cliente>();
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            CadastrarCliente(clientes);
        }

        SalvarDadosCliente(clientes);

        LerDadosCliente("src/Tutorials/fileio/ioexample/clientdata.txt");
        
    }

    private static void CadastrarCliente(List<Cliente> clientes) {
        System.out.println("Informe o nome do cliente que deseja cadastrar: ");
        clientes.add(Cliente.ClienteEmailAutomatico(scan.nextLine()));
    }

    private static void SalvarDadosCliente(List<Cliente> clientes) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/Tutorials/fileio/ioexample/clientdata.txt"))) {

            for (Cliente cliente : clientes) {
                writer.write(cliente.getName() + "," + cliente.getEmail() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static void LerDadosCliente(String path){
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String input;
            while ((input = reader.readLine()) != null) {
                String[] data = input.split(",");
                System.out.println("Cliente: " + data[0] + " - Email: " + data[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
