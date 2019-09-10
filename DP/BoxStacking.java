package New;

import java.util.Arrays;

public class BoxStacking 
{

    public int maxHeight(Dimension[] input) 
    {
        //get all rotations of box dimension.
        Dimension[] allRotationInput = new Dimension[input.length * 3];
        createAllRotation(input, allRotationInput);
        
        //sort these boxes in non increasing order by their base area.(length X width)
        Arrays.sort(allRotationInput);

        //Take T[] and result[] array of same size as total boxes after all rotations are done
        int T[] = new int[allRotationInput.length];
        int result[] = new int[allRotationInput.length];

        //T[i] is filled with the height of the rotated dimension
        for (int i = 0; i < T.length; i++) 
        {
            T[i] = allRotationInput[i].height;
            
        // results filled with the index of the i 
            result[i] = i;
        }

        for (int i = 1; i < T.length; i++) 
        {
            for (int j = 0; j < i; j++) 
            {
            	//check if the length of i and j 
                if (allRotationInput[i].length < allRotationInput[j].length && allRotationInput[i].width < allRotationInput[j].width) 
                {
                    if( T[j] + allRotationInput[i].height > T[i])
                    {   
                    	//add he height of the rotated dimensions and add the value of j 
                        T[i] = T[j] + allRotationInput[i].height;
                        
                        // fill the result with theindex of j 
                        result[i] = j;
                    }
                }
            }
        }
       
        //find max in T[] and that will be our max height.
        
        int max = Integer.MIN_VALUE;
        for(int i=0; i < T.length; i++)
        {
            if(T[i] > max){
                max = T[i];
            }
        }
        
        return max;
    }

    //create all rotations of boxes, always keeping length greater or equal to width
    private void createAllRotation(Dimension[] input,Dimension[] allRotationInput) {
        int index = 0;
        for (int i = 0; i < input.length; i++) 
        {
            allRotationInput[index++] = Dimension.createDimension(input[i].height, input[i].length, input[i].width);
            allRotationInput[index++] = Dimension.createDimension(input[i].length, input[i].height, input[i].width);
            allRotationInput[index++] = Dimension.createDimension(input[i].width, input[i].length, input[i].height);

        }
    }

    public static void main(String args[]) 
    {
        BoxStacking bs = new BoxStacking();
        Dimension input[] = { new Dimension(3, 2, 5), new Dimension(1, 2, 4) };
        int maxHeight = bs.maxHeight(input);
        System.out.println("Max height is " + maxHeight);

    }
}


	class Dimension implements Comparable<Dimension> 
{
    int height;
    int length;
    int width;

    Dimension(int height, int length, int width) 
    {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    Dimension() {}

    static Dimension createDimension(int height, int side1, int side2) 
    {
        Dimension d = new Dimension();
        d.height = height;
        if (side1 >= side2) 
        {
            d.length = side1;
            d.width = side2;
        } 
        else 
        {
            d.length = side2;
            d.width = side1;
        }
        return d;
    }

    
     //Sorts by base area(length X width)
    
    public int compareTo(Dimension d) 
    {
        if (this.length * this.width >= d.length * d.width) 
        {
            return -1;
        } 
        else 
        {
            return 1;
        }
    }

    
    public String toString() 
    {
        return "Dimension [height=" + height + ", length=" + length
                + ", width=" + width + "]";
    }
}
	 
	 //Max height is 11