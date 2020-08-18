package eds;

public class Condicionais {

	public static void main(String[] args) {
		
		int x, y, m, n;
		
		x = 10;
		y = 20;
		m = 80;
		n = 100;
		
		if(x > y) {
			System.out.println("ok!");
		}else if(x == y){
			System.out.println("segundo ok!");
		}else {
			System.out.println("terceiro ok");
		}
		
		if(x < y) {
			System.out.println("cumpriu com a primeira condição");
			if(m < n) {
				System.out.println("cumpriu com a segunda condição");
			}
		}
		
		
		String palavra = "quatro";
		
		switch(palavra) {
			case "um":
				System.out.println("primeiro caso");
				break;
			case "dois":
				System.out.println("segundo caso");
				break;
			case "tres":
				System.out.println("terceiro caso");
				break;
			default:
				System.out.println("default..");
		}

		
		
		
	}

}
