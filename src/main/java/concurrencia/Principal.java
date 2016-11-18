/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencia;

/**
 *
 * @author T-107
 */
public class Principal implements Runnable {
    /*Segunsa forma de crear threads implementando la interface
      Runnable usando polimorfismo
    */
    
    public static void main(String[] args) {
       Runnable r=new Principal();//runnable es referencia de la interfaz 
       Thread t1=new Thread(r);
       t1.setName("Juan");
       Thread t2=new Thread(r);
       t2.setName("Ana");
       //t1.start();
       //t2.start();
       
       //la tercera forma que viene en el examen 
       //usando clases internas anonimas
       
       Thread t3=new Thread(new Runnable() {//se crea su propio metodo run
           @Override
           public void run() {
               System.out.println("Soy un background thread");
           }
       }); 
       t3.start();
       
       
    }

    @Override
    public void run() {
        /*
        System.out.println("Soy un thread y me llamo: "+Thread.currentThread().getName());
     
      if(Thread.currentThread().getName().equals("Juan")){
          System.out.println("Soy Hombre");
      } else {
          System.out.println("Soy Mujer");
      }  */   
        }
    }
