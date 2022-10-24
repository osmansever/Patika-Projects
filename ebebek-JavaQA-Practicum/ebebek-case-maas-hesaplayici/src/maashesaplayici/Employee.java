package maashesaplayici;

public class Employee {

	private String name;
    private int workHours, hireYear;
    private double tax, bonus, raiseSalary, salary;
    
	/* if there is no constructor java will use the default constructor,
	 * default values for string is null, for int is 0
    */
	
    public Employee()
    {
	   	name = "nameless";
	   	salary =  -1;
	   	workHours = -1;
	   	hireYear = -1;
	   	tax = -1;
	   	bonus = -1;
	   	raiseSalary = -1;
    }
    
    public Employee(String _name, double _salary, int _workHours, int _hireYear)
    {
	   	 this.name = _name;
	   	 this.salary = _salary;
	   	 this.workHours = _workHours;
	   	 this.hireYear = _hireYear;
    }
    
    public void tax(double _tax) {
    	/*
			Maa�a uygulanan vergiyi hesaplayacakt�r.
			�al��an�n maa�� 1000 TL'den az ise vergi uygulanmayacakt�r.
			�al��an�n maa�� 1000 TL'den fazla ise maa��n�n %3'� kadar vergi uygulanacakt�r.

    	 */
    	if (_tax <= 1000.0) {
    		tax = 0.0;
    	}
    	else if (_tax > 1000.0) {
    		tax = _tax*0.03;
    	}
	}

    public void bonus(int _workHours) {
    	
    	/*
    	 * E�er �al��an haftada 40 saatten fazla �al��m�� ise fazladan �al��t��� her 
    	 * saat ba��na 30 TL olacak �ekilde bonus �cretleri hesaplayacakt�r.
    	 */
    	
    	if (_workHours > 40) {
        	bonus = (_workHours - 40)*30;
        }
	}
    
    public void raiseSalary(int _hireYear, double _salary) {
    	
    	/*
    	 *  �al��an�n i�e ba�lang�� y�l�na g�re maa� art���n� hesaplayacakt�r.
    	 *   �uan ki y�l� 2021 olarak al�n.
			E�er �al��an 10 y�ldan az bir s�redir �al���yorsa maa��na %5 zam yap�lacakt�r.
			E�er �al��an 9 y�ldan fazla ve 20 y�ldan az �al���yorsa maa��na 
			%10 zam yap�lacakt�r.
			E�er �al��an 19 y�ldan fazla �al���yorsa %15 zam yap�lacakt�r.
    	 */
    	
    	if ((2021-_hireYear) <= 10) {
        	raiseSalary = (_salary + bonus - tax)*0.05;
        }
        else if ((2021-_hireYear) > 9 && (2021-_hireYear) < 20)  {
            raiseSalary = (_salary + bonus - tax)*0.10;
        }
        else if ((2021-_hireYear) > 19)   {
            raiseSalary = (_salary + bonus - tax)*0.15;
        }
	}
    
	public void toString(Employee _employee) {
		
    	//�al��ana ait bilgileri ekrana bast�r�r.

		System.out.println("Ad�: " + this.name);
		System.out.println("Maa��: " + this.salary); 
		System.out.println("�al��ma Saati: " + this.workHours);	
		System.out.println("Ba�lang�� Y�l�: " + this.hireYear);
		
		tax(this.salary);
		System.out.println("Vergi: " + String.format("%.2f", tax) );
		
		bonus(this.workHours);
		System.out.println("Bonus: " + String.format("%.2f", bonus) );
		
		raiseSalary(this.hireYear,this.salary );
		System.out.println("Maa� Art���: " + String.format("%.2f", raiseSalary) );
		System.out.println("Vergi ve Bonuslar ile birlikte maa� : " + String.format("%.2f", (this.salary + bonus - tax)) );
		System.out.println("Toplam maa� : " + String.format("%.2f", (this.salary + bonus + raiseSalary - tax)) );
		System.out.println(" ");

	}
}
