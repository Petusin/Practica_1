package bank;

public class Accounts {

	public static void main(String[] args) {
		
		//creo los objetos
		Account peter = new Account("Peter",1000.25);
		Account john = new Account("John",2000.52);
		Account karen = new Account("Karen",1500.15);
		
		//sistema println
		System.out.println(peter);
		System.out.println(john);
		System.out.println(karen);
		
		//utilizo metodo transfer de Peter a Karen	
		transfer(peter,karen, 100.20);
		System.out.println("-----------");
		System.out.println(peter);
		System.out.println(john);
		System.out.println(karen);
		
		//utilizo metodo personalCredit para aumentar credito a John
		personalCredit(john,500.50);
		System.out.println("-----------");
		System.out.println(john);
		//utilizo metodo maiMethod para restar credito a Karen
		maiMethod(karen,1000.00);
		System.out.println("-----------");
		System.out.println(karen);
	}
	
	//metodos statics de la clase Accounts
	public static void transfer(Account first, Account third, double amount) {
		if(first.getBalance() > amount){
			first.withdrawal(amount);
			third.deposit(amount);
		}else {
			return;
		}
	}
	
	public static void personalCredit(Account user,double balance) {
		user.deposit(balance);
		
	}
	public static void maiMethod(Account user,double balance) {
		//restar para obtener balance
		user.withdrawal(balance);
		
	}
	
}
