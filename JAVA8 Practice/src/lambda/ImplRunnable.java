package lambda;

public class ImplRunnable {
	public static void main(String[] args) {
		//Prior java 8
		Runnable runnable=new Runnable()
				{
			@Override
			public void run()
			{
				System.out.println("anonymous");
			}
				};
				new Thread(runnable).start();
				
				//after java 8 lambda syntax
				Runnable runnable1=()->{System.out.println("lambda");};
				new Thread(runnable1).start();
				
				//sec impl of lambda
				Runnable runnable2=()->System.out.println("lambda2");
				new Thread(runnable2).start();
				
				
		
	}
	
}
