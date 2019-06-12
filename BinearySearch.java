import java.util.Scanner;

class BinearySearch
{
	public static void main(String[] args)
	{ 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of String: ");
		int n = scanner.nextInt();
		String str[] = new String[n];
		System.out.println("Enter the String: ");
		scanner.nextLine();
		for (int i = 0; i<n; i++) {
			str[i] = scanner.nextLine();
		}
		System.out.println("Enter the Searching Strings:");
		String search = scanner.nextLine();
		int length = str.length-1;
		BinearySearch bin = new BinearySearch();
		int i = bin.find(str, 0, length, search);
		System.out.println(i);
	}
	public int find(String first[], int start, int end, String searchString)
	{
		int mid = start + (end-start)/2;
		if(first[mid].compareTo(searchString)==0)
		{
			return mid;
		}
		if(first[mid].compareTo(searchString)>0)
		{
			return find(first, start, mid-1,searchString);
		}
		else if(first[mid].compareTo(searchString)<0);
		{
			return find(first, mid+1, end, searchString);
		}
	}
}