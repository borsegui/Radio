/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * @author   CHISTOPHER CHIROY, BORIS CIFUENTES,DIEGO DE LEÓN 
 *
 * Esta clase  a cada uno de los metodos se crean los sets ylos gets 
para poderlos utilizar en otra clases , también crean constructores cony sin
atributos
 */


/**
 * @author
 *se declaran las variables, listas con sus caracteristicas
 */

public class Radio implements InterfazRadio{
	private double emisora;
	private int volumen;
	private boolean encendido;
	private String frecuencia;
	private double[][] favoritos;
	
	public Radio(){
		favoritos = new double[2][12];
		emisora = MIN_AM;
		volumen = 0;
		encendido = false;
		frecuencia = "AM";
	}
	
	/**
	 * @author 
	 * se decalran sets y gets
	 */
	
	
	/* (non-Javadoc)
	 * @see InterfazRadio#getVolumen()
	 */
	public int getVolumen() {
		return volumen;
	}
	/**
	 * @return
	 */
	public double[][] getFavoritos(){
		return favoritos;
	}
	/* (non-Javadoc)
	 * @see InterfazRadio#getEmisora()
	 */
	public double getEmisora() {
		return emisora;
	}
	/* (non-Javadoc)
	 * @see InterfazRadio#getEncendido()
	 */
	public boolean getEncendido() {
		return encendido;
	}
	/* (non-Javadoc)
	 * @see InterfazRadio#getFrec()
	 */
	public String getFrec(){
		// TODO Auto-generated method stub
		return frecuencia;
	} 
	
	/**
	 * @param favoritos se crea favoritos con sus parametros
	 */
	public void setFavoritos(double[][] favoritos){
		this.favoritos = favoritos;
	}


	/* (non-Javadoc)
	 * @see InterfazRadio#encenderApagar()
	 */
	@Override
	public void encenderApagar() {
		if (encendido==false)
			encendido=true;
		else
			encendido = false;
	}
	/* (non-Javadoc)
	 * @see InterfazRadio#cambiarFrec()
	 */
	@Override
	public void cambiarFrec() {
		if (frecuencia.equals("AM")){
			frecuencia="FM";
			emisora=MIN_FM;
		}
		else{
			frecuencia ="AM";
			emisora=MIN_AM; 
		}
	}
	/* (non-Javadoc)
	 * @see InterfazRadio#cargarEmisora(int)
	 * estacion=emisora;
	 */
	@Override
	public void cargarEmisora(int posicion) {
		double est=0;
		if (frecuencia.equals("FM"))
			est=favoritos[0][posicion-1];
		else{
			est=favoritos[1][posicion-1];
		}
		if (est!=0){
			emisora=est;
		}
		
	}
	/* (non-Javadoc)
	 * @see InterfazRadio#adelantarEmisora()
	 */
	@Override
	public void adelantarEmisora() {
		if (frecuencia.equals("FM")){
			emisora=emisora+CONST_CAMBIO_FM;
			if(emisora>MAX_FM)
				emisora=MIN_FM;
		}
		else{
			emisora=emisora+CONST_CAMBIO_AM;
			if(emisora>MAX_AM)
				emisora=MIN_AM;
		}
	}
	/* (non-Javadoc)
	 * @see InterfazRadio#atrasarEmisora()
	 */
	@Override
	public void atrasarEmisora() {
		if (frecuencia=="FM"){
			emisora=emisora-CONST_CAMBIO_FM;
			if(emisora<MIN_FM)
				emisora=MAX_FM;
		}
		else{
			emisora=emisora-CONST_CAMBIO_AM;
			if(emisora<MIN_AM)
				emisora=MAX_AM;
		}
	}
	/* (non-Javadoc)
	 * @see InterfazRadio#guardarEmisora(double, int)
	 */
	@Override
	public void guardarEmisora(double emisora, int posicion) {
		if (frecuencia.equals("FM"))
			favoritos[0][posicion-1]=this.emisora;
		else{
			favoritos[1][posicion-1]=this.emisora;
		}
		
	}
	/* (non-Javadoc)
	 * @see InterfazRadio#subirVolumen()
	 */
	@Override
	public void subirVolumen() {
		// TODO Auto-generated method stub
		volumen = volumen+1;
		if(volumen>15)
			volumen=15;
	}
	
	/* (non-Javadoc)
	 * @see InterfazRadio#bajarVolumen()
	 */
	@Override
	public void bajarVolumen() {
		// TODO Auto-generated method stub
		volumen = volumen-1;
		if(volumen<0)
			volumen=0;
	}
}