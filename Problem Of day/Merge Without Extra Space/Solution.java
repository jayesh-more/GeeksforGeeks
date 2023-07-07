class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        int p1=n-1,p2=0;
        while(p1>=0&&p2<m)
        {
            if(arr1[p1]>arr2[p2])
            {
               long temp=arr1[p1];
               arr1[p1]=arr2[p2];
               arr2[p2]=temp;
               p1--;
               p2++;
            }
            else break;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return;
    }
}
