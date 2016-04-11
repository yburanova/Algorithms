/**
 *
 * @author buranova
 */
public class BubbleSorting {
    
           int[] myMassive = new int[]{5, 10, 15, 9, 4, 3, 6, 8, 22, 1}; 
           int i,j;
           int temp;
           
           void Sort(){
               for(i=0; i<10; i++){
                   for(j=0; j<9-i; j++){
                       if (myMassive[j]>myMassive[j+1]) {
                           temp=myMassive[j];
                           myMassive[j]=myMassive[j+1];
                           myMassive[j+1]=temp;
                       }
                   }                 
               }
           }
           
           void Printing(){
               for(i=0;i<10;i++){
                   System.out.print(myMassive[i] + ", "); //printing of the sorted array to standart output
               }
           }
           
    public static void main(String[] args) {
        
        BubbleSorting bubbles = new BubbleSorting();
        bubbles.Sort();
        bubbles.Printing();
        
    }
}
