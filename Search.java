import java.util.HashMap;
import java.util.Map;

class Search
{
  public static void main(String[] args)
  {
     HashMap <String, String> map = new HashMap <> ();
     print(map);
     map.put("FirstString","a");
     map.put("SecondString","b");
	 map.put("ThirdString","c");
	 map.put("fourthString","d");
	 map.put("FifthString","e");
	 System.out.println("Size of map is:"+map.size());
	 print(map);
	 if(map.containsKey("FirstString") )
	 {
		 String a = map.get("FirstString");
		 System.out.println("Value for key First String is : "+a);
	 }
	 map.clear();
	 print(map);
  }
  public static void print(Map <String,String> map)
  {
    if(map.isEmpty())
	{
	  System.out.println("map is empty");
	}
	else
	{
	 System.out.println(map);
	}
  }
}