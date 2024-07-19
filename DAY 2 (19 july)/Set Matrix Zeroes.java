class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Tuple> hs=new HashSet<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                hs.add(new Tuple(i,j));
            }
        }
        
        for(Tuple ele:hs)
        {
            System.out.println(ele.row+" "+ele.col);
            for(int i=0;i<matrix[ele.row].length;i++)
            {
                matrix[ele.row][i]=0;
            }
             for(int i=0;i<matrix.length;i++)
            {
                matrix[i][ele.col]=0;
            }
        }
    }
}
class Tuple
{
    int row;
    int col;
    Tuple(int row,int col)
    {
        this.row=row;
        this.col=col;
    }
}