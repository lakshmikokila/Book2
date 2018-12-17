
public class GMainThread implements Runnable{
	public void run()
	{
		System.out.println("Thread Running");
		for(int i=0;i<10;i++)
		{
			System.out.println(i +" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		GMainThread g1=new GMainThread();
		GMainThread g2=new GMainThread();
		Thread t1=new Thread(g1);
		Thread t2=new Thread(g2);
		System.out.println("-->"+t1.getName());
		t1.start();
		t1.join(1000);
		System.out.println("-->"+t2.getName());
		t2.start();
	}

}
