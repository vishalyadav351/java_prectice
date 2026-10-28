class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
         
                int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

       for (int i = 0; i < n; i++) {
          ans.add(-1);
       }

        for (int i = 0 ; i < arr.length; i++) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans.set(i, -1);
            } else {
                ans.set(i, st.peek());
            }

            st.push(arr[i]);
        }

        return ans;
        
    }
}