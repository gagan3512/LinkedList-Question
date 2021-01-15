import java.util.*;

public class reversea_linkedlist 
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> homeDress = new ArrayList<>();
        ArrayList<Integer> guestDress = new ArrayList<>();
        int c=0;
        while(n-->0)
        {
            homeDress.add(s.nextInt());
            guestDress.add(s.nextInt());
        }
        for(int i=0;i<homeDress.size();i++)
        {
            for(int j=0;j<guestDress.size();j++)
            {
                if(guestDress.get(j)==homeDress.get(i))
                {
                    c++;
                }
            }
        }
        System.out.println(c);
        
    }
    
    
    
    
    
    
}