import java.util.Scanner;

public class Observador(){
    private nombre String;
    private vende boolean;
    private Scanner sc = new Scanner(System.in);

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

}