import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
import java.util.Arrays;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class App {
   
    public static int[] createRandomArray(int arrayLength)
    {
        int max = 99;
        int min = 1;
        int[] marray = new int[arrayLength];

        Random rando = new Random();

        for(int ii = 0; ii<arrayLength;ii++)
        {
            marray[ii] = rando.nextInt((max - min + 1) + min);
        }

        return marray;

    }

    public static void readArrayToFile(int[] array, String filename) throws IOException
    {
        try {
            File myObjj = new File("t.txt");
            Scanner myReader = new Scanner(myObjj);
            while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
            }
            myReader.close();
        }finally{};
    }
/* 
   
    {

    
    }
 */
public static void bubbleSort(int[] array)
{
    for(int bb = array.length-1; bb>= 1; bb--){
        for(int j = 0;j<1;j++){
            if(array[j] > array[j]+1){
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
                
             
            }
        }

    }
   /*//*/Arrays.sort(array);
     // System.out.print(" " + mm[]);
}

    public static void main(String[] args) throws Exception
    {
        int[] mm = createRandomArray(100);
        bubbleSort(mm);

        try{
            FileWriter fileWriter = new FileWriter("t.txt");

            
            for(int ii = 0; ii<mm.length;ii++)
            {
                fileWriter.write(mm[ii]+"\n");     
            }
            fileWriter.close();
        }
        finally{};

        for(int i = 0; i<=mm.length -1;i++)
        {
            System.out.print(" " + mm[i]);

        }
    }
    
}
