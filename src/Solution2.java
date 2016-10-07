import java.util.ArrayList;
//import java.util.Vector;


public class Solution2 {
    public void reOrderArray(int [] array) {
       //Vector v=new Vector();
    	
        ArrayList<Integer> v=new ArrayList<Integer>();
        for(int i=0;i<array.length;i++)
            {
            if(array[i]%2==1)
                {
                v.add(array[i]);
            }
             
        }
        for(int j=0;j<array.length;j++)
            {
            if(array[j]%2==0)
                {
                v.add(array[j]);
            }
        }
        for(int i=0;i<array.length;i++)
        {
         array[i]=(int)v.get(i);
        }
    }
}