
public class Radio implements InterfazRadio{
	private double estacion;
	private int volumen;
	private boolean estado;
	private boolean frecuencia;
	private double[][] favoritos;
	
	public Radio(){
		favoritos = new double[2][12];
		estacion = MIN_AM;
		volumen = 0;
		estado = false;
		frecuencia = false;
	}
	
	
	public double getEstacion() {
		return estacion;
	}
	public int getVolumen() {
		return volumen;
	}
	public boolean getEstado() {
		return estado;
	}
	public boolean getFrecuencia() {
		return frecuencia;
	}
	public double[][] getFavoritos(){
		return favoritos;
	}


	public void setEstacion(double estacion) {
		this.estacion = estacion;
	}
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public void setFrecuencia(boolean frecuencia) {
		this.frecuencia = frecuencia;
	}
	public void setFavoritos(double[][] favoritos){
		this.favoritos = favoritos;
	}


	@Override
	public void encenderApagar() {
		if (estado==false)
			estado=true;
		else
			estado = false;
	}
	@Override
	public void cambiarFrec() {
		if (frecuencia==false){
			frecuencia=true;
			estacion=MIN_FM;
		}
		else{
			frecuencia = false;
			estacion=MIN_AM; 
		}
	}
	@Override
	public void cargarEmisora(double emisora) {
		estacion=emisora;
		
	}
	@Override
	public void adelantarEmisora() {
		if (frecuencia==true){
			estacion=estacion+CONST_CAMBIO_FM;
			if(estacion>MAX_FM)
				estacion=MIN_FM;
		}
		else{
			estacion=estacion+CONST_CAMBIO_AM;
			if(estacion>MAX_AM)
				estacion=MIN_AM;
		}
	}
	@Override
	public void atrasarEmisora() {
		if (frecuencia==true){
			estacion=estacion-CONST_CAMBIO_FM;
			if(estacion<MIN_FM)
				estacion=MAX_FM;
		}
		else{
			estacion=estacion-CONST_CAMBIO_AM;
			if(estacion<MIN_AM)
				estacion=MAX_AM;
		}
	}
	@Override
	public void guardarEmisora(double emisora, int posicion) {
		if (frecuencia==true)
			favoritos[0][posicion-1]=estacion;
		else{
			favoritos[1][posicion-1]=estacion;
		}
		
	}
	@Override
	public void subirVolumen() {
		// TODO Auto-generated method stub
		volumen = volumen+1;
		if(volumen>15)
			volumen=15;
	}
	
	@Override
	public void bajarVolumen() {
		// TODO Auto-generated method stub
		volumen = volumen-1;
		if(volumen<0)
			volumen=0;
	} 
}
