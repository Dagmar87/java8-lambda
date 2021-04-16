
public class Main {

	public static void main(String[] args) {
				
		System.out.println("=== Inicio do teste ===");
		
		//Implementa��o da classe anonima Runnable
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("Estudando a express�o lambda 1.");
								
			}
		};
		
		Runnable r2 = () -> System.out.println("Estudando a express�o lambda 2.");
		
		r1.run();
		r2.run();

	}

}
