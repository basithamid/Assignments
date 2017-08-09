public class SortWrapperTest{
	public static void main(String args[]){
		int num[] = new int[args.length];
		for(int i = 0; i<args.length;i++){
			num[i]=Integer.parseInt(args[i]);
		}
		for(int i=0; i < num.length; i++){  
            for(int j=1; j < (num.length-i); j++){  
            	if(num[j-1] > num[j]){  
                //swap elements  
                    int temp = num[j-1];  
                    num[j-1] = num[j];  
                    num[j] = temp;  
                }  
            }  
        } 
        for(int i = 0; i<args.length;i++){
			//num[i]=Integer.parseInt(args[i]);
			System.out.println(num[i]);
		} 
	}
}