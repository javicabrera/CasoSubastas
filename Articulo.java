import java.util.ArrayList;
import java.util.Scanner;
public class Articulo{
	public Observado persona r;
	public ArrayList<Puja>  pujas ;
	public String descripcion ;
	public String nombre ;
	public int precio ;
	public boolean disponible ;
	public Scanner sc= new Scaner(System.in);

	public Articulo(Observador v,String d,String n,String p){
		persona=v;
		pujas=new ArrayList();
		descripcion=d;
		nombre=n;
		precio=p;
		disponible=true;

	}

	public void mostrarPujas(){
		for(int i=0;i<pujas.size();i++){
			System.out.println(i".- "+pujas.get(i).o.nombre);
			System.out.println("    "+pujas.get(i).monto);
		}	
	}
	public void modificar(){
		descripcion=sc.nextLine();
		monto=sc.nextInt();
	}
	public void asignar(Observador o){
		this.persona=o;
	}

}
