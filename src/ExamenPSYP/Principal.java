package ExamenPSYP;

import java.util.concurrent.Semaphore;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Semaphore [] semaforos = new Semaphore[10];
		Hilos [] hilos = new Hilos[8];
		for(int i=0; i<10;i++) {
			semaforos[i] = new Semaphore(1);
		}
		
		for(int i=0; i<8;i++) {
			hilos[i] =new Hilos(semaforos,i);
			hilos[i].start();
		}
		
		for(int i =0;i<8;i++) {
			try {
				hilos[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int suma =0;
		
		for(int i=0; i<10;i++) {
			suma=suma+Recursos.arrayNumeros[i];
			System.out.println("En la posicion "+i+" hay la siguiente cantidad de ocurrencias: "+Recursos.arrayNumeros[i]);
	
			
		}
		System.out.println("Total: "+suma);

	}

}
