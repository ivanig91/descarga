package ExamenPSYP;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Hilos extends Thread implements Runnable{
	Semaphore [] semaforos;
	int id;
	public Hilos(Semaphore[] semaforos, int id) {
		this.semaforos = semaforos;
		this.id = id;
	}
	
	public void run() {
		int num;
		
			try {
				for(int i=0;i<100;i++) {
					Random random = new Random();
					num = random.nextInt(100);
					if(num>=0 && num<=9) {
						semaforos[0].acquire();
						Recursos.arrayNumeros[0]=Recursos.arrayNumeros[0]+1;
						semaforos[0].release();
						
					}else {
						if(num>=10 && num<=19) {
							semaforos[1].acquire();
							Recursos.arrayNumeros[1]=Recursos.arrayNumeros[1]+1;
							semaforos[1].release();
							
						}else {
							if(num>=20 && num<=29) {
								semaforos[2].acquire();
								Recursos.arrayNumeros[2]=Recursos.arrayNumeros[2]+1;
								semaforos[2].release();
								
							}else {
								if(num>=30 && num<=39) {
									semaforos[3].acquire();
									Recursos.arrayNumeros[3]=Recursos.arrayNumeros[3]+1;
									semaforos[3].release();
									
								}else if(num>=40 && num <=49){
									
									semaforos[4].acquire();
									Recursos.arrayNumeros[4]=Recursos.arrayNumeros[4]+1;
									semaforos[4].release();
									
								}else if (num>=50 && num <=59) {
									semaforos[5].acquire();
									Recursos.arrayNumeros[5]=Recursos.arrayNumeros[5]+1;
									semaforos[5].release();
									
								}else if (num>=60 && num <=69) {
									semaforos[6].acquire();
									Recursos.arrayNumeros[6]=Recursos.arrayNumeros[6]+1;
									semaforos[6].release();
									
								}else if(num>=70 && num<=79) {
									semaforos[7].acquire();
									Recursos.arrayNumeros[7]=Recursos.arrayNumeros[7]+1;
									semaforos[7].release();
									
								}else if(num>=80 && num <=89) {
									
									semaforos[8].acquire();
									Recursos.arrayNumeros[8]=Recursos.arrayNumeros[8]+1;
									semaforos[8].release();
									
								}else if (num>=90 && num <=100) {
									semaforos[9].acquire();
									Recursos.arrayNumeros[9]=Recursos.arrayNumeros[9]+1;
									semaforos[9].release();
									
								}
							}
						}
					}
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		
		
	}
	
	

}
