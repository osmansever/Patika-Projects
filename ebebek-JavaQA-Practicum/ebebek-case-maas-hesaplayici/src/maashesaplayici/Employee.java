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
			Maaþa uygulanan vergiyi hesaplayacaktýr.
			Çalýþanýn maaþý 1000 TL'den az ise vergi uygulanmayacaktýr.
			Çalýþanýn maaþý 1000 TL'den fazla ise maaþýnýn %3'ü kadar vergi uygulanacaktýr.

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
    	 * Eðer çalýþan haftada 40 saatten fazla çalýþmýþ ise fazladan çalýþtýðý her 
    	 * saat baþýna 30 TL olacak þekilde bonus ücretleri hesaplayacaktýr.
    	 */
    	
    	if (_workHours > 40) {
        	bonus = (_workHours - 40)*30;
        }
	}
    
    public void raiseSalary(int _hireYear, double _salary) {
    	
    	/*
    	 *  Çalýþanýn iþe baþlangýç yýlýna göre maaþ artýþýný hesaplayacaktýr.
    	 *   Þuan ki yýlý 2021 olarak alýn.
			Eðer çalýþan 10 yýldan az bir süredir çalýþýyorsa maaþýna %5 zam yapýlacaktýr.
			Eðer çalýþan 9 yýldan fazla ve 20 yýldan az çalýþýyorsa maaþýna 
			%10 zam yapýlacaktýr.
			Eðer çalýþan 19 yýldan fazla çalýþýyorsa %15 zam yapýlacaktýr.
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
		
    	//Çalýþana ait bilgileri ekrana bastýrýr.

		System.out.println("Adý: " + this.name);
		System.out.println("Maaþý: " + this.salary); 
		System.out.println("Çalýþma Saati: " + this.workHours);	
		System.out.println("Baþlangýç Yýlý: " + this.hireYear);
		
		tax(this.salary);
		System.out.println("Vergi: " + String.format("%.2f", tax) );
		
		bonus(this.workHours);
		System.out.println("Bonus: " + String.format("%.2f", bonus) );
		
		raiseSalary(this.hireYear,this.salary );
		System.out.println("Maaþ Artýþý: " + String.format("%.2f", raiseSalary) );
		System.out.println("Vergi ve Bonuslar ile birlikte maaþ : " + String.format("%.2f", (this.salary + bonus - tax)) );
		System.out.println("Toplam maaþ : " + String.format("%.2f", (this.salary + bonus + raiseSalary - tax)) );
		System.out.println(" ");

	}
}
