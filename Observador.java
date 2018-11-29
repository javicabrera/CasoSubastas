import java.util.Scanner;

public class Observador(){
    public String nombre ;
    public boolean vende ;
    public Scanner sc = new Scanner(System.in);

    public Observador(String nombre, vende boolean){
        this.nombre=nombre;
        this.vende=vende;
    }
    public Articulo registrar(Observador o){
        String n=sc.nextLine();
        String d=sc.nextLine();
        int p=sc.nextInt();
        Articulo a=new Articulo(o,d,n,p);
        return a;
    }
    public Puja pujar(Observador o){
        int m=sc.nextInt();
        Puja p=new Puja(m,o);
        return p;
    }
}