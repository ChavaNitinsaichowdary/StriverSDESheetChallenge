import java.util.ArrayList;
public class searchIn2D {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        if(mat.size() == 0) {
            return false;
        }
        
        int rows = mat.size();
        int cols = mat.get(0).size();
        int left = 0;
        int right = (rows * cols) - 1;
        
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(mat.get(mid / cols).get(mid % cols) == target) {
                return true;
            }
            else if(mat.get(mid / cols).get(mid % cols) < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return false;
    }
}