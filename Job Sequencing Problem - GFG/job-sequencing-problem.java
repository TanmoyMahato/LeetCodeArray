//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

class GfG {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            
            //size of array
            int n = Integer.parseInt(inputLine[0]);
            Job[] arr = new Job[n];
            inputLine = br.readLine().trim().split(" ");
            
            //adding id, deadline, profit
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            
            Solution ob = new Solution();
            
            //function call
            int[] res = ob.JobScheduling(arr, n);
            System.out.println (res[0] + " " + res[1]);
        }
    }
}
// } Driver Code Ends


class Solution
{
    int[] JobScheduling(Job arr[], int n)
    {
        Arrays.sort(arr, (obj1,obj2) -> (obj2.profit-obj1.profit));
        
        //get maximum deadline 
        int maxDeadline = 0;
        for(int i=0; i<arr.length; i++){
            maxDeadline = Math.max(maxDeadline,arr[i].deadline);
        }
            
        //new array to store jobs that can be done
        int jobDone[] = new int[maxDeadline+1];
        for(int i=1; i<jobDone.length; i++){
            jobDone[i] = -1;
        }
        
        //count no. of Jobs that can be done and maximum profit that can be made
        int noOfJob=0, totalProfit=0;
        for(int i=0; i<arr.length; i++){
            for(int j=arr[i].deadline; j>0; j--){  //search free slot for arr[i].deadline
                if(jobDone[j] == -1){  //free slot found
                    jobDone[j] = i;
                    noOfJob++;
                    totalProfit += arr[i].profit;
                    break;
                }
            }
        }
        
        int result[] = new int[2];
        result[0] = noOfJob;
        result[1] = totalProfit;
        return result;
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/