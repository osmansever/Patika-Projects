package maashesaplayici;

public class MaasHesapla {
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee1 = new Employee("Osman Sever",2000.0,50,2015);
		Employee employee2 = new Employee("Ahmet Keser",950.0,40,2015);
		Employee employee3 = new Employee("Berna Uslanmaz",1500.0,45,2005);
		Employee employee4 = new Employee("Kerem Sular",2500.0,60,2010);
		Employee employee5 = new Employee("Kemal Java",2000.0,45,1985);

		
		employee1.toString(employee1);
		employee2.toString(employee2);
		employee3.toString(employee3);
		employee4.toString(employee4);
		employee5.toString(employee5);

	}
}
