import java.io.*;
class Bufer{
public static void main(String args[]){
  FileWriter writer=new FileWriter("C:\Users\Dell\Desktop\my details\text.txt");
   BufferedWriter buffer=new BufferedWriter(writer);
   buffer.write("welcome to jaav");
   buffer.close();
   System.out.println("ducess");  
   System.out.println("ducess");  
 
}

}