package session8_assignment3;

/* an application to implement the basic functions for the Online Banking Application (Use synchronized).*/
class OnlineBanking{ 
	double amount;
	//constructor to initialize amount with 20000
	public OnlineBanking(){
		this.amount = 20000;
	}
	//without synchronized method of deposit
   void deposite (double amt){  
     try{  
    	 this.amount = this.amount + amt;
    	 System.out.println("deposited amount is :"+ amt);
    	 Thread.sleep(400);
    	 System.out.println("Total balance is after depositing  :"+ this.amount);
    	   
     }catch(Exception e){System.out.println(e);}  
 } 
   //without synchronized method of withdraw
   void withdraw (double amt){  
	   
	     try{ 
	    	 if(this.amount>amt){
	    		 
	    	 
		    	 this.amount = this.amount - amt;
		    	 System.out.println("withdraw amount is :"+ amt);
		    	 Thread.sleep(400);
		    	 System.out.println("Total balance is after withdrawl  :"+ this.amount);	    	 }
	     }catch(Exception e){System.out.println(e);}  
	   }  
}