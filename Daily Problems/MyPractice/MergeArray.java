import java.util.*;
public class MergeArray {
    public static void main(String[] args){
        int[] nums1={3, 1, 2};
        int[] nums2={6, 5, 4};
        int[] ans=merge(nums1,nums2);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] merge(int[] nums1,int[] nums2){
        int n=nums1.length;
        int m=nums2.length;
        int[] res = new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                res[k++]=nums1[i++];
            }
            else{
                res[k++]=nums2[j++];
            }
        }
        while(i<n){
            res[k++]=nums1[i++];
        }
        while(j<m){
            res[k++]=nums2[j++];
        }
        return res;
    }
}
