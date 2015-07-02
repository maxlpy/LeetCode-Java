package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CombinationSumII {
	public List<ArrayList<Integer>> combinationSum2(int[] num, int target) {  
	    List<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();  
	    if(num == null || num.length==0)  
	        return res;  
	    Arrays.sort(num);  
	    helper(num,0,target,new ArrayList<Integer>(),res);  
	    return res;  
	}  
	private void helper(int[] num, int start, int target, ArrayList<Integer> item,  
	List<ArrayList<Integer>> res)  
	{  
	    if(target == 0)  
	    {  
	        res.add(new ArrayList<Integer>(item));  
	        return;  
	    }  
	    if(target<0 || start>=num.length)  
	        return;  
	    for(int i=start;i<num.length;i++)  
	    {  
	        if(i>start && num[i]==num[i-1]) continue;  
	        item.add(num[i]);  
	        helper(num,i+1,target-num[i],item,res);  
	        item.remove(item.size()-1);  
	    }  
	} 
}
