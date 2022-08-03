package assissted;

public class Matmult{  
public static void main(String args[]){  
   
int a[][]={{4,5,1},{2,4,2},{3,4,3}};    
int b[][]={{4,5,1},{4,4,2},{3,4,3}};    
    
   
int c[][]=new int[3][3];   
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
c[i][j]=0;      
for(int k=0;k<3;k++)      
{      
c[i][j]+=a[i][k]*b[k][j];      
}//end of k loop  
System.out.print(c[i][j]+" ");  }
System.out.println();  
}    
}}  
