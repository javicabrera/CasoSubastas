import java.util.ArrayList;

public class Articulo{
	private Observado persona r;
	private ArrayList<Integer>  pujas ;
	private String descripcion ;
	private String nombre ;
	private int precio ;
	private boolean disponible ;

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
			System.out.println(pujas.get(i));
		}	
	}
	public void modificar(){

	}
	public void asignar(Observador o){
		this.persona=o;
	}

}
