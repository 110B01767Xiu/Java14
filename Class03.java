import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
	public static void main(String args[]) throws IOException {
		int n, sum = 0;
		BufferedReader buf;
		String str;
		buf = new BufferedReader(new InputStreamReader(System.in));
		str = buf.readLine();
		n = Integer.parseInt(str);
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
