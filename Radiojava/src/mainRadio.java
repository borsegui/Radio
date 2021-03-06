

/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * @author   CHISTOPHER CHIROY, BORIS CIFUENTES,DIEGO DE LE�N 
 *
 * Es� clase es el menu que va interactuar de manera amistosa con el usiario,
  pra que pueda realizar cada una de las funciones que se pueden realizar
  en un radio.
 */

import java.util.Scanner;


public class mainRadio {
	/**
	 * @param arg
	 * Se declaran cada uno de los atributos y variables
	 */
	/**
	 * @param arg
	 */
	public static void main(String[] arg){
		int n1, n2, n3, n4;
		/**
		 * Se crea el objeto de tipo Scanner para leer lo que se ingresa	
		 */
		Scanner teclado = new Scanner(System.in);	
		Radio radio = new Radio();
		/**
		 * Se imprimen mensajes para que el usuario pueda seleccionar las opciones	
		 */
		
		System.out.println("--------------RADIO--------------");
		System.out.println("1. Encender");
		n1=teclado.nextInt();
		/**
		 * 	 programaci�n defensiva, en caso de que presione cualquier teval distinta a 1
		 */
		while(n1!=1){
			System.out.println("Opcion no Valida");
			System.out.println("1. Encender");
			n1=teclado.nextInt();
		}
		/**
		 * 	  programaci�n defensiva, en caso de que presione cualquier teval distinta a 0
		 * cambia frecuencia de AM A FM 
		 */
		
		while(n1!=0){
			/**
			 * 	Despliega el menu para seleccionaruna de las opciones
			 */
			System.out.println("0. Apagar"+"\n1. Frecuencia: "+radio.getFrec()+"\n2. Emisora: "+radio.getEmisora()+"\n3. Guardar Emisora"+
							   "\n4. Seleccionar emisora"+"\n5. Volumen: "+radio.getVolumen());
			n1=teclado.nextInt();
			/**
			 * programaci�n defensiva,no puede ingresar n�meros mayores que 5
			 */
	
			while(n1>5){
				/**
				 * despliega mensaje de error al cumplirse el la condicion del while
				 */	
				System.out.println("Opcion no valida, Vuelva a intentar");
				n1=teclado.nextInt();
			}
			/**
			 * Condicion de n1=1 cambai de frecuencia
			 */	
			if(n1==1){
				radio.cambiarFrec();
			}
			/**
			 * de cumplirse la condion se imprime mensaje al usuario para adelantar y atrasera emisora
			 */	
			
			else if(n1==2){
				n2=1;
				while(n2!=0){
					System.out.println("1. Adelantar Emisora \n2. Atrasar Emisora \n0. Listo");
					n2=teclado.nextInt();
					if(n2==1){
						radio.adelantarEmisora();
						System.out.println("Emisora: "+radio.getEmisora());
					}
					else if(n2==2){
						radio.atrasarEmisora();
						System.out.println("Emisora: "+radio.getEmisora());
					}
					else if(n2>2)
						System.out.println("Vuelva a intentar");
				}
			}
			/**
			 * de cumplirse la condion se imprime mensaje al usuario para adelantar y atrasera emisora
			 */	
	
			else if(n1==3){
				System.out.println("Seleccione el boton en el que desea guardar la emisora del 1 al 12");
				n3=teclado.nextInt();
				/**
				 *  programaci�n defensiva al presionar un boton mayor de 12, no existen
				 */	
				
				while(n3>12){
					System.out.println("Boton no existente, vuelva a intentar");
				}
				radio.guardarEmisora(radio.getEmisora(), n3);
			}

			else if(n1==4){
				System.out.println("Seleccione el boton de la emisora que desea escuchar");
				n3=teclado.nextInt();
				/**
				 *  programaci�n defensiva , si n3> 3 al presionar un boton mayor de 12, no existen
				 */	
				
				while(n3>12){
					System.out.println("Boton no existente, vuelva a intentar");
				}
				radio.cargarEmisora(n3);	
			}
			
			else if(n1==5){
				n2=1;
				while(n2!=0){
					System.out.println("1. Subir Volumen \n2. Bajar Volumen \n0. Listo");
					n2=teclado.nextInt();
					if(n2==1){
						radio.subirVolumen();
						System.out.println("Volumen: "+radio.getVolumen());
					}
					else if(n2==2){
						radio.bajarVolumen();
						System.out.println("Volumen: "+radio.getVolumen());
					}
					else if(n2>2)
						System.out.println("Vuelva a intentar");
				}
			}
		}
			
	}

}