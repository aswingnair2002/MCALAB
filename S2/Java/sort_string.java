public class sort_string {
	public static void main(String []args){
        String temp;
        int i,j;
        String str[] = new String[5];
        str[0] = "Abel";
        str[1] = "Aju";
        str[2] = "Ram";
        str[3] = "Sasi";
        str[4] = "Lalu";
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
