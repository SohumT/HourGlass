/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counsellorapp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author sohumsanjaythadani
 */
public class SerialiseDeserialise {
    
    public static void writeToFile(storagelist list) throws IOException, ClassNotFoundException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("counselloractivity.bin"));
        objectOutputStream.writeObject(list);
    }
    
    public static void readFile() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream ("counselloractivity.bin"));
        
        storagelist list2 = (storagelist) objectInputStream.readObject();
    }
	

    
    
}
