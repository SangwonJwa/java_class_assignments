package assignments;
import java.util.Scanner;

public class StringRotation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str;
				
		str = scanner.nextLine();
		
		StringBuffer sb = new StringBuffer(str);
		
		for(int i = 0 ; i < sb.length() ; i++) {
			char c = sb.charAt(0);
			sb.append(c);
			sb.delete(0, 1);
			System.out.println(sb);
		}
		
		scanner.close();
	}
}
