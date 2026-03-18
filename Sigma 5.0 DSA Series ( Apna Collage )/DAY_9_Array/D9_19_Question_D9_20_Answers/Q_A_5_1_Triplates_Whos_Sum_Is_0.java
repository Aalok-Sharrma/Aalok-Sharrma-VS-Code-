package DAY_9_Array.D9_19_Question_D9_20_Answers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

// It is a Shradha Kapara Ma'am code For Q_A_5_1_Triplates_Whos_Sum_Is_0.

// This code contains the concept of ArrayList and till now I don't know the concept of ArrayList 
// that's why I'm not sure about " public static void main(String[] args) " function code is 
// correct or not so, when i will going to complete learning the concept of ArrayList I will 
// revist this code and correct or update it.


/* Approach
Let us try to understand the problem statement. The first part of the problem statement is clear, we 
are asked to find out all the triplets in the given array whose sum is equal to zero. A triplet is nothing
but a set of three numbers in the given array. For example, if nums=[1,2, 3,4] is the given array,[1,2,3]
[2,3,4][1,3,4]etc are its triplets.
What does the condition i != j,i != k, and j != k mean?

It means that we are not allowed to reuse any number from the array within a triplet. Example, for the
given array nums = [1,2,3,4], triplets [1,1,1] or [1,1,2] or [1,2,2] etc are not considered validtriplets.
The last condition that we need to consider is that we cannot have duplicate triplets in our final result.
Example if[-2,-2,0,2] is the given array, we can only consider one of[-2,0,2] from indexes 0, 2, 3 and [-
2,0,2] from indexes 1, 2, 3 in ourfinalresult.
BRUTE FORCE -The simple solution to this problem is to find every possible triplet from the given
array, see if its sum is equal to zero and return the result (ensuring there are no duplicatetriplets in the
result).
This algorithm involves the followingsteps:
1. Use three loops to generate all possible triplets for the given array, with each loop
variable keeping trackof 1 triplet element each.
2. Next we calculate the sum for each triplet generated in step 1.
3. If the sum is equal to 0 we need to check if it is a unique triplet (not already in our result 
set). We can ensure the triplets in our result set are unique by sorting the triplets and
adding itto a hashmap (hashmap overwrites data ifthe same value iswritten to the
same key multiple times thereby eliminating duplicates).
4. Oncewehave added allthe triplets whose sum is equalto 0into thehashmap,we
iterate through thehashmap and add itto ourresult array.
5. Finallywe return the result array. */

public class Q_A_5_1_Triplates_Whos_Sum_Is_0 {

public List<List<Integer>> threeSum(int nums[]) {
List<List<Integer>> result = new ArrayList <List<Integer>> ();
for(int i=0; i<nums.length; i++) {
for(int j=i+1; j<nums.length; j++) {
for(int k=j+1; k<nums.length; k++) {
if(nums[i] + nums[j] + nums[k] == 0) {
List<Integer> triplet = new ArrayList < Integer > ();
triplet.add(nums[i]);
triplet.add(nums[j]);
triplet.add(nums[k]);
Collections.sort(triplet);
result.add(triplet);
}
}
}
}
result = new ArrayList<List<Integer>> (new LinkedHashSet<List<Integer>> (result));
return result;
}

public static void main(String[] args) {
    
    int n[]={5,3,7,9,1,0};
    
    //System.out.println(threeSum(n));
}
}
