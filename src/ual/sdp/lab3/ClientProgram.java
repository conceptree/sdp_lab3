package ual.sdp.lab3;

import java.io.*;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ClientProgram {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        Client client = new Client();
        MyLinkedMap<Integer, Double> x =  new MyLinkedMap<Integer,Double>();

        String line  = "";
        String splitBy = ";";
        try {
            BufferedReader br = new BufferedReader(new FileReader("./out/production/sdp_lab3/ual/sdp/lab3/data.csv"));
            br.readLine();
            while((line = br.readLine()) != null){
                String[] file  = line.split(splitBy);
                Double value = Double.parseDouble(file[1]);
                Integer key = Integer.parseInt(file[0]);
                x.put(key, value);
            }
            System.out.println("---------- From CSV File----------");
            System.out.println("Time series Maximum value " + client.max(x));
            System.out.println("Time series Minimum value " + client.min(x));
            System.out.println("Time series Average value " + client.avg(x));
            System.out.println("Time series Standard Deviation value " + client.sd(x));

        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    }


