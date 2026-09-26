class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int arr[] = new int[2];
        int n = grid[0].length;
        int count[] = new int [n*n];

        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){

                if(count[grid[i][j]-1] == 1){
                    arr[0] = grid[i][j];
                    
                }else{
                    count[grid[i][j]-1]++;
                }
            }
        }

        for(int i = 0 ; i < count.length ; i++){
            if(count[i] == 0){
                arr[1] = i+1;
                break;
            }
        }

        return arr;
        
    }
}