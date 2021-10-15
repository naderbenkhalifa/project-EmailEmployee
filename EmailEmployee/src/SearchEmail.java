import java.util.Scanner;

public class SearchEmail {

	
		public static void main(String[] args) {
			int m=-1;
			
			
				String[] arr= {"nader@gmail.com","adnane@gmail.com","mouna@gmail.com","nizar@gmail.com","nadra@gmail.com"};
				
				
				System.out.println("Enter Email");
				Scanner sc= new Scanner(System.in);
				  String S=sc.nextLine();
				
				for(int i=0;i< arr.length;i++) {
			 		if(S.equals(arr[i])) {
			 			m=i;
			 			
			 			System.out.println("email:("+S+")  found for Employee with Id ="+ (i+1));	
			 			
			 			
			 		}
				}
				if(m==-1) {
					System.out.println("email:("+S+") not found");	
		 			
					
					
				}
				

	}

}
