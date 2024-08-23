class Solution {
    public List<Integer> getRow(int rowIndex) {
     
        int numRows=rowIndex+1;
        List<List<Integer>> pascal = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> sublist = new ArrayList<>(Collections.nCopies(i, 1));
            pascal.add(sublist);
        }

        for (int j = 2; j < numRows; j++) {
            List<Integer> previous = pascal.get(j - 1);
            List<Integer> list = pascal.get(j);
            for (int i = 1; i < list.size() - 1; i++) {
                list.set(i, previous.get(i - 1) + previous.get(i));
            }
        }
        return pascal.get(rowIndex);
    }
}