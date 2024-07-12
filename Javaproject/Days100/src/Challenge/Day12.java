package Challenge;

public class Day12 {
public static void main(String[] args) {
	int num =123;
	int ans=0;
	int digit;
	while(num>0) {
		digit = num%10;
		ans=ans*10+digit;
		num=num/10;
	}
	System.out.println(ans);
}
}
