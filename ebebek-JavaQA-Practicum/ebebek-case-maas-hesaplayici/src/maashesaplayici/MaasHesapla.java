package maashesaplayici;

import java.util.ArrayList;
import java.util.Scanner;

public class MaasHesapla {
		
	
	public static void main(String[] args) {
		
		//Declare an arraylist
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		//creating objects that belongs Employee class
		Employee employee1 = new Employee("Osman Sever",2000.0,50,2015);
		Employee employee2 = new Employee("Ahmet Keser",950.0,40,2015);
		Employee employee3 = new Employee("Berna Uslanmaz",1500.0,45,2005);
		Employee employee4 = new Employee("Kerem Sular",2500.0,60,2010);
		Employee employee5 = new Employee("Kemal Java",2000.0,45,1985);

		//adding objects to arraylist
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		
		
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			int employeeNumber;
			
			{		
				System.out.println("Fabrikadaki toplam çalýþan sayýsý: " + employees.size() );
				System.out.print("Bilgileri istenen çalýþan numarasýný giriniz (1 - " + employees.size() + "): ");
				
				try {
					
					//get input from user and print employee informations to console
					employeeNumber = sc.nextInt();
					employees.get(employeeNumber-1).toString(true);
				
				}
				catch(Exception e){
					
					//throws an error when input type or scale is wrong
					System.out.println(" ");
					System.out.println("Hatalý giriþ yapýldý! Tekrar deneyiniz.");
					System.out.println(" ");

				}
			}
		}
	}
}