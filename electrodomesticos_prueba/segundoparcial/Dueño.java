package segundoparcial;
import java.io.*;

public class Dueño {
    protected long id;
    public Dueño(long id)
    {
        this.id = id;
    }
    
    /*void setId(long id) {
        
        BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduzca su numero de identificacion");
        try {
            this.id=Integer.parseInt(leer.readLine());
        } catch (NumberFormatException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }*/

    void setId(long id) throws NumberFormatException, IOException
    {
        if (id!=619)
        {
            BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Introduzca su numero de identificacion");
            this.id=Integer.parseInt(leer.readLine());
        }
        
    }
   
     
}
