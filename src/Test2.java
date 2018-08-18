import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {
// i am from branch
	public static void main(String[] args) {
		System.out.println("welcome to project ");
		System.out.println("Enter Folloing Deetails");
		System.out.println("1) Customer Info");
		System.out.println("2) Customer Edit");
		System.out.println("3) Customer Entry");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Option from above ");
		int d=sc.nextInt();
		switch(d){
		case 1 :
			System.err.println("Urr here noW 1 ");
			break;
		case 2 :
			System.out.println("Ur here now 2");
			break;
			
		case 3: 
			System.out.println("Welcome to customer entry ");
			System.out.println("Enter customer total count to add");
			int count=sc.nextInt();
			for(int i =1;i==count;i++){
			System.err.println("Enter the Name of Customer "+i);
			String name=sc.next();
			System.out.println("Enter mob nno. of customer "+i);
			int mob=sc.nextInt();
			System.out.println("Enter the native placee of customer "+i);
			String nativeplace=sc.next();
			savedata(name,mob,nativeplace);
			System.out.println("Data Adding to file is Successful of "+ i+" Customer");
			System.err.println("Name ::"+name+"mob no."+mob+"Address"+nativeplace);
			System.out.println("Add data of "+i+1+"Customer ");
			}
			break;
		}
				
		
		

	}

	private static void savedata(String name,int mob,String nativeplace) {
		
		try {
			File f=new File("C:\\Users\\HP\\Desktop\\SaveData");
			BufferedWriter out=new BufferedWriter(new FileWriter(f));
			out.write("Name"+"  "+"mob no."+"  "+"address");
			out.newLine();
			out.write(name+"  "+mob+"  "+nativeplace);
			out.flush();
			out.close();
			
		} catch (IOException e) {
			System.out.println(" # # Exception @ saving file # #");
			e.printStackTrace();
		}
		
		
	}

}
