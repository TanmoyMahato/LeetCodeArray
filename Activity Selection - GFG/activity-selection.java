//{ Driver Code Starts
import java.io.*; 
import java.util.*; 
import java.lang.*;

class Main
{
    public static void main (String[] args) throws IOException  
    {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//testcases
		int t = Integer.parseInt(br.readLine().trim());
		
		while(t-- > 0)
		{
		    String inputLine[] = br.readLine().trim().split(" ");
		    //size of array
		    int n = Integer.parseInt(inputLine[0]);
		    int start[] = new int[n];
		    int end[] = new int[n];
		    
		    //adding elements to arrays start and end
		    inputLine = br.readLine().trim().split(" ");
		    for(int i = 0; i < n; i++)
		     start[i] = Integer.parseInt(inputLine[i]);
		    
		    inputLine = br.readLine().trim().split(" ");
		    for(int i= 0; i < n; i++)
		      end[i] = Integer.parseInt(inputLine[i]);
		    
		    //function call
		    System.out.println(new Solution().activitySelection(start, end, n));
		}
    }
}


// } Driver Code Ends


class Solution
{
    public static int activitySelection(int start[], int end[], int n)
    {
        int output = 0;
        
        //create 2d-array and store indeces, start, end values of activities
        int arr[][] = new int[n][3];
        for(int i=0; i<n; i++){ 
            arr[i][0] = i;
            arr[i][1] = start[i];
            arr[i][2] = end[i];
        }
        
        //sort 2d-array on the basis of end time in ascending order
        Arrays.sort(arr, Comparator.comparingInt(o -> o[2]));
        
        int endTime = arr[0][2];
        output++;
        for(int i=0; i<n; i++){
            int startTime = arr[i][1];
            if(startTime > endTime){
                output++;
                endTime = arr[i][2];
            }
        }
        
        return output;
    }
}