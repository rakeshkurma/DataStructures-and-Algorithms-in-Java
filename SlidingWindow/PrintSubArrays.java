//Note : here i print start end index of the subarray
import java.util.*;
public class PrintSubArrays
{
	public static void main(String[] args) {
		HashMap<Integer,ArrayList<Integer>> hm = new HashMap<>();
		int arr[] = {1,2,3,-3};
		int k = 3;
		int n = arr.length;
		int sum = 0;
		for(int i=0;i<n;i++)
	    {
	        sum = sum+arr[i];
	        
	        if(hm.containsKey(sum-k))
	        {
	            ArrayList<Integer> al = hm.get(sum-k);
	            for(int j=0;j<al.size();j++)
	            {
	                int start = al.get(j)+1;
	                System.out.println(start+" : "+i);
	            }
	        }
	         if(hm.containsKey(sum))
	            {
	               ArrayList<Integer> tmp = hm.get(sum);
	               tmp.add(i);
	               hm.put(sum,tmp);
	            }
	            else{
	                ArrayList<Integer> tmp = new ArrayList<Integer>();
	                tmp.add(i);
	                hm.put(sum,tmp);
	            }
	    }
		
	}
}