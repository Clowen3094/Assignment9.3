package session8_assignment3;

//creating thread and passing deposit and withdraw amount through it
class MyThread1 extends Thread{  
	OnlineBanking t;  
	MyThread1(OnlineBanking t){  
	this.t=t;  
}  
public void run(){  
	t.deposite(2000);
	t.withdraw(2000);  
}  

}