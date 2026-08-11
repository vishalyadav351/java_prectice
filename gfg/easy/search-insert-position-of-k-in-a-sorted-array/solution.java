class Solution {
    public int searchInsertK(int arr[], int k) {
        int mid;
        int right=0;
        int left = arr.length-1;
        
        while(right<=left)
        {
            mid = (right+left)/2;
            
            if (arr[mid]== k)
            return mid;
            else if (arr[mid]<k)
             right = mid +1;
             
            else
             left=mid-1;
             
        }
        return right;
        
    }
}