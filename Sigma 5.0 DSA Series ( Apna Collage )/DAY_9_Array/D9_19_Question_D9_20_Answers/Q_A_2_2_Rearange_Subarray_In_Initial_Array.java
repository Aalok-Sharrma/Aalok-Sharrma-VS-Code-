package DAY_9_Array.D9_19_Question_D9_20_Answers;

import java.util.Arrays;

// It is a Shradha Kapara Ma'am code For Rearange_Subarray_In_Initial_Array.

/* In this code we use a logic of HashMap Data Structure and till today I don't know 
   the concept of HashMap Data Structure that's why I'm not sure that the code of 
   " public static void main(String[] args) " Function is correct or not after Learning 
   the concept of HashMap Data Structure I will revist this code and make changes. */

public class Q_A_2_2_Rearange_Subarray_In_Initial_Array {
    
public static int search(int[] nums, int target) {
//min will have index of minimum element of nums
int min = minSearch(nums);
//find in sorted left
if(nums[min] <= target && target <= nums[nums.length-1]){
return search(nums,min,nums.length-1,target);
}
//find in sorted right
else{
return search(nums,0,min,target);
}
}
//binary search to find target in left to right boundary
public static int search(int[] nums,int left,int right,int target){
int l = left;
int r = right;
// System.out.println(left+" "+right);
while(l <= r){
int mid = l + (r - l)/2;
if(nums[mid] == target){
return mid;
}
else if(nums[mid] > target){
r = mid-1;
}
else{
l = mid+1;
}
}
return -1;
}
//smallest element index
public static int minSearch(int[] nums){
int left = 0;
int right = nums.length-1;
while(left < right){
int mid = left + (right - left)/2;
if(mid > 0 && nums[mid-1] > nums[mid]){
return mid;
}
else if(nums[left] <= nums[mid] && nums[mid] > nums[right]){
left = mid+1;
}
else{
right = mid-1;
}
}
return left;
}
public static void main(String[] args) {
    
        int[] a={-1,0,1,2,-1,-4};
        int left=0;
        int right=0;
        int target = 3;
        System.out.println(search(a,target));
        System.out.println(search(a,left,right,target));
        System.out.println(minSearch(a));
    }

}
