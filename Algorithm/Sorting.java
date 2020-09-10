public class sorting{
 public static void Main(String[] args){
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int[] a = new int[n];
	for(int i =0;i<n;i++){
	a[i] = scan.nextInt();}
	for(int i =0;i<n;i++){
	  for(int j=0;j<n-1;j++){
		if(a[j]>a[j+1]){
int temp = a[j+1];
	a[j+1]=a[j];
	a[j]=temp;
}
else{
break;}}}

	for(int k=0;k<n;k++){
	System.out.println(a[k] +"\n");}}}
	
	
