import java.util.*;
public class KolejApp {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Kolej []arr = new Kolej[1];
		for (int i = 0; i<arr.length; i++){
			System.out.print("Enter Program Code: ");
			String code = input.nextLine();
			System.out.print("Enter Program Description: ");
			String desc = input.nextLine();
			System.out.print("Enter Program Duration: ");
			String dur = input.nextLine();
			System.out.print("Enter Program Faculty: ");
			String fac = input.nextLine();
			System.out.print("Enter Program Head: ");
			String head = input.nextLine();
			arr[i] = new Kolej(code, desc, dur, fac, head);
		}
		input.close();
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i].toString());
			System.out.print(arr[i].getProgramLevel());
		}
	}
}
