public class sort_string {
	public static void main(String []args){
        String temp;
        int i,j;
        String str[] = new String[5];
        str[0] = "Cheriyan";
        str[1] = "Aswin";
        str[2] = "Mehafil";
        str[3] = "Bibin";
        str[4] = "Alwin";
         System.out.println("The strings before sorting:");
        for(i=0;i<5;i++)
         {
             System.out.println(str[i]);
         }
        
        for (i=0; i<5; i++)
          {
              for(j=i+1;j<5;j++)
                {
                    if((str[i].compareTo(str[j]))>0)
                      {
                          temp=str[i];
                          str[i]=str[j];
                          str[j]=temp;
                      }
                }
              
          }
        System.out.println("\nThe strings after sorting:");
        for(i=0;i<5;i++)
         {
             System.out.println(str[i]);
         }
	}
}
