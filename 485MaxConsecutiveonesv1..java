class 485MaxConsecutiveonesv1 {
    public int findMaxConsecutiveOnes(int[] nums) {
        	public static void main(String args[])
	{
		int[] nums = {1,1,0,1,1,1};
	findMaxConsecutiveOnes(nums);
	}
	
        int maxCount=0;
        int tmpCount=0;
        int backCount=0;
        int currentCount=0;
       for(int i=0,backPointer=nums.length-1;i<=backPointer;i++,backPointer--){
        if(i==backPointer){
            if(nums[i]==1){
                currentCount=tmpCount+backCount+1;
                if(currentCount>maxCount){
                    maxCount=currentCount;
                }
            }
            break;
        }
        if( (i+1)== backPointer){

            if(nums[i]==1){
               tmpCount++;
               if(tmpCount>maxCount) maxCount=tmpCount;
            }
            else if(nums[i]==0){
                if(tmpCount>maxCount){
                maxCount=tmpCount;
                }
                tmpCount=0;
            }
            
            if(nums[backPointer]==1){
               backCount++;
               if(backCount>maxCount) maxCount=backCount;
           }
            else if(nums[backPointer]==0){
                if(backCount>maxCount){
                   maxCount=backCount;
                }
                backCount=0;
            }
            if(tmpCount+backCount > maxCount) maxCount=tmpCount+backCount;
            break;
         }
        else{

            if(nums[i]==1){
               tmpCount++;
                if(tmpCount>maxCount) maxCount=tmpCount;
            }
            else if(nums[i]==0){
                if(tmpCount>maxCount){
                maxCount=tmpCount;
                }
                tmpCount=0;
            }
            
            if(nums[backPointer]==1){
               backCount++;
               if(backCount>maxCount) maxCount=backCount;
           }
            else if(nums[backPointer]==0){
                if(backCount>maxCount){
                   maxCount=backCount;
                }
                backCount=0;
            }
         }
            
            
    } 
    return maxCount; 
    }
}
