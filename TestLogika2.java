import java.util.Arrays;
import java.util.List;

public class Main
{

	public static void pecah(List<String> dict, String str, String out)
	{
		if (str.length() == 0)
		{
			System.out.println(out);
			return;
		}
		for (int i = 1; i <= str.length(); i++) {
			String prefix = str.substring(0, i);

			if (dict.contains(prefix)) {
				pecah(dict, str.substring(i), out + " " + prefix);
			}
		}
	}
	public static void main(String[] args)
	{
		List<String> dict = Arrays.asList("pro", "gram", "merit", "program", "it", 
										"programmer");
		// Contoh inputan
		String str = "programit";

		pecah(dict, str, "");
	}
}
