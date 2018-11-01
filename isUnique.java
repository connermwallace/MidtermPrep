public class isUnique{
public static void main(String[] args){

int[] list = new int[]{1,2,3};

isUnique(list);
}

public static boolean isUnique(int[] list){
boolean flag=true;
   for(int i=0;i<list.length;i++){
   
      for(int j=i+1;j<list.length;j++){
      
         if(list[i]==list[j]){
            flag=false;
         
      } 
   
   }
   
  

}


System.out.print(flag);
return flag;



   }
}