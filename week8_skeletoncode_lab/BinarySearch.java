/**
 *
 * @author Luis Mendez
 */
public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    } 
    
        public static void main(String[] args) {
            int[] sortedArray = {1, 2, 3, 4, 5};
            int key = 10;
            int low = 0;
            int high = sortedArray.length - 1;

            int index = runBinarySearchIteratively(sortedArray, key, low, high);

            if (index != Integer.MAX_VALUE) {
                System.out.println("The key is in index " + index);
            } else {
                System.out.println("The key is not in the list.");
            }
        }

}

/*
 The time complexity for this algorithm is O(log n). This is because Each time that a while loop is entered, 
the amount of elements that are search through his halved So that the amount of operations that the algorithm
goes through is log_2_n + 1 for the assignment of index. Which in big o notation is O(log n).

The space complexity is O(1) because the function only uses a few variables to keep track of the data needs to 
function. The number of these variables which are index, low, high, mid, and the key doesn't change as the function runs.
 */
