package com.company;
import java.io.FileInputStream;
import java.io.IOException;


public class Task2 {
    public static void main(String[] args){
        int bajt;

        try (FileInputStream fs = new FileInputStream("ELTON.txt")) {

            do{bajt = fs.read();
                if (bajt != -1) System.out.println((char) bajt);
            } while (bajt != 1);
        } catch (IOException ex) {
            System.out.println("Error can't create file");
            ex.printStackTrace();
            }
        }
}

