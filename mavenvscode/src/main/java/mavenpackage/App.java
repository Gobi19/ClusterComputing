package mavenpackage;
import java.io.IOException;
/**
 * Hello world!
 */
public final class App {

        public static void main(String[] args) {
        // System.out.println("hello world"); 
        for (int i=1; i<=10; i++){
            try{
                Thread.sleep(i*1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            } 
            new Thread(new Runnable(){
                public void run(){
                    // System.err.println("Howdy world!");
                    System.err.println("Thread id: "+ Thread.currentThread().getId());
                }
            }).start();  
        }

    } 
}

