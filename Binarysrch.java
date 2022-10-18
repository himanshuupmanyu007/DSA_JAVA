
public class Binarysrch {
    public static void main(String[] args) 
    {
        int[] a={2,3,4,7,9,11,13,14,16,19,20,22,23,25,27,29};
        
        int srch=22;
        int li=0;
        int hi=a.length-1;
        int mi=(li+hi)/2;
        while(li<=hi)
        {
           if(a[mi]==srch)
           {
               System.out.println("element is at "+mi+" index position ");
               break;
           }
           else if(mi<srch)
           {
               li=mi+1;
           }
           else
           {
               hi=mi-1;
           }
           mi=(li+hi)/2;
           
        }
        
        if(li>hi)
        {
            System.out.println("element is not found");
        }
    }
}
