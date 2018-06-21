/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author guilherme
 */
public class FileHandler implements Serializable {
    
    public static void saveObject(Object obj, String path) {
        File file = new File(path);
        file.delete();
        
        try {
            file.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(FileHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ObjectOutputStream out;
        
        try {
            out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(obj);
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(FileHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Object loadObject(String path) {
        File file = new File(path);
        if (!file.exists()) {
            JOptionPane.showMessageDialog(null, "File does't exist");
            return null;
        }
        ObjectInputStream input;
        try {
            input = new ObjectInputStream(new FileInputStream(file));
            Object response = input.readObject();
            return response;
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(FileHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static void exportObject(Object obj, String path) throws IOException {
        FileWriter fWriter = new FileWriter(path);
        PrintWriter arq = new PrintWriter(fWriter);
        
        arq.printf("Republica:\n%s", obj.toString());
        
        arq.close();
    }
    
}
