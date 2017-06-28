package session8_assignment3;

//creating thread and passing deposit and withdraw amount through it
class MyThread2 extends Thread{  
	OnlineBanking t;  
	MyThread2(OnlineBanking t){  
	this.t=t;  
}  
public void run(){  
		t.deposite(100);
		t.withdraw(2000);
	}  
}