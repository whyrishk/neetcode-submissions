
class Solution {
    public boolean isValidSudoku(char[][] board) {
               Set<String> seen = new HashSet<>(); 

               for(int row=0;row< 9;row++){
               for(int col=0;col<9;col++){
                char num = board[row][col];

                if (num != '.') {

                      String rowKey = num + " found in row " + row;
                         String colKey = num + " found in col " + col;
                         String boxkey = num +"found in box " + (row / 3) + "-" + (col / 3);

                              if (!seen.add(rowKey) || !seen.add(colKey) || !seen.add(boxkey)) {
                        return false;
               }
               }
    }
}
return true;
                }
                }