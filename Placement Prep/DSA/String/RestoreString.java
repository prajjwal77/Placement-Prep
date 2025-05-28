public class RestoreString {
     //Important for placement point of view
     public static  String restoreString(String s, int[] indices) {
      int length=s.length();
        StringBuilder sb=new StringBuilder("");
         char c[]=new char[length];
       
        for(int i=0;i<length;i++){
          // Place each character at its corresponding index
          // using the indices array
          // indices[i] gives the position where s.charAt(i) should go
          // c[indices[i]] = s.charAt(i) places the character at the correct index
          // in the new character array c
            c[indices[i]]=s.charAt(i);

        }
        sb.append(c);
        return sb.toString();  
    }
     
     public static void main(String[] args) {
          String s = "codeleet";
          int[] indices = {4,5,6,7,0,2,1,3};
          
          
          System.out.println("Original String: " + s);
          System.out.println("Restored String: " + restoreString(s, indices));
     }
}
