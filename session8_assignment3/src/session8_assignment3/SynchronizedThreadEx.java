package session8_assignment3;

public class SynchronizedThreadEx {
	public static void main(String args[]){
		//creating object and passing it to the thread object
		OnlineBanking obj = new OnlineBanking();//only one object  
		MyThread1 t1=new MyThread1(obj);  
		MyThread2 t2=new MyThread2(obj);  
		t1.start();  
		t2.start();  
		}  
}

