
public class Articulo{
	private persona Vendedor;
	private pujas ArrayList<Integer>;
	private descripcion String;
	private nombre String;
	private precio int;
	private disponible boolean;

	public Articulo(Vendedor v,String d,String n,String p){
		persona=v;
		pujas=new ArrayList();
		descripcion=d;
		nombre=n;
		precio=p;
		disponible=true;

	}

}