class Solution {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex == 0)
            return new ArrayList<>(Arrays.asList(1));
        if(rowIndex == 1)
            return new ArrayList<>(Arrays.asList(1,1));
        
        List<Integer> list = getRow(rowIndex-1);
        List<Integer> currentRow = new ArrayList<>();
        
        currentRow.add(1);
        
        for(int i = 1; i < rowIndex; i++){
            currentRow.add(list.get(i-1)+list.get(i));
        }
        
        currentRow.add(1);
        
        return currentRow;
    }
}