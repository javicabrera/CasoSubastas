import java.util.Scanner;

public class Observador(){
    public String nombre ;
    public boolean vende ;
    public int identificador;
    public Scanner sc = new Scanner(System.in);

    public Observador(String nombre, vende boolean,int id){
        this.nombre=nombre;
        this.vende=vende;
        this.identificador=id;
    }
    public Articulo registrar(Observador o){
        String n=sc.nextLine();
        String d=sc.nextLine();
        int p=sc.nextInt();
        Articulo a=new Articulo(o,d,n,p);
        return a;
    }
    public Puja pujar(Observador o){
        System.out.println("Ingreseel monto con el cual puja en CLP");
        int m=sc.nextInt();
        Puja p=new Puja(m,o);
        return p;
    }
}