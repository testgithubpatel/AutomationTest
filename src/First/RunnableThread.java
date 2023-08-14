package First; 

 class RunnableThread extends Object implements Runnable{
	
		@Override
		public void run() {
			for(int i=1;i<=5;i++) {
				System.out.println(i);
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println("Main Threads");
		}
		
	}
	class ThreadByClass extends Thread{
		public void call() {
			for(int i=1;i<=5;i++) {
				System.out.println(i);
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println("Main Threads");
		}
	}
	
