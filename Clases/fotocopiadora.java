public class fotocopiadora{
//atributos de la clase	
	private String nombre; 
	private int ubicacion[] = new int[2]; //ubicacion[0]= longitud ---- ubicacion[1]=latitud
	private int horarios[][] = new int[8][4]; //posibilidad de tener horarios cortados distintos para los 7 dias y feriados
	private producto prod = new producto();

//constructor
public fotocopiadora(String nomb,int ubi[],int hora[][],producto pro) {
	this.nombre=nomb;
	this.ubicacion=ubi;
	this.horarios=hora;
	this.prod=pro;
	}


//métodos
public getNombre(){return this.nombre;}
public getUbicacion(){return this.ubicacion;}
public getHorarios(){return this.horarios;}
public getProducto(){return this.prod;}
}