public class edabit{
    public static void main(String[] args) {

        // "cat rat eat pat eat sat", "at"

    String chars = "at"; 
    String str = "cat rat eat pat eat sat"; 

    String temp = ""; 
    String charTemp = ""; 

    int counter = 0; 
    String newStr = ""; 
    for(int x = 0; x < str.length(); x++)
    {
        temp = str.substring(x,x+1); 

        for(int i = 0; i < chars.length();i++)
        {
            charTemp = chars.substring(i,i+1); 
            if(temp.equals(charTemp))
            {
                break; 
            }
            else
            {
                counter++; 
            }
        }
        if(counter == chars.length())
        {
            newStr += temp; 
        }
    }

    System.out.println(newStr); 
        








        

        


    }
}