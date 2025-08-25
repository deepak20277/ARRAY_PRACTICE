package third;
import java.util.*;

public class third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		        Scanner input = new Scanner(System.in);
//		        int[] ages = new int[10];
//
//		        System.out.println("Enter the age of 10 students:");
//		        for (int i = 0; i < ages.length; i++) {
//		            ages[i] = input.nextInt();
//		        }
//
//		        for (int i = 0; i < ages.length; i++) {
//		            if (ages[i] < 0) {
//		                System.out.println("Student " + (i + 1) + ": Invalid Age");
//		            } else if (ages[i] >= 18) {
//		                System.out.println("Student " + (i + 1) + " with age " + ages[i] + " can vote.");
//		            } else {
//		                System.out.println("Student " + (i + 1) + " with age " + ages[i] + " cannot vote.");
//		            }
//		        }
//		        input.close();
		
		
		
		
		
		
		
		
//		        Scanner input = new Scanner(System.in);
//		        int[] numbers = new int[5];
//
//		        System.out.println("Enter 5 numbers:");
//		        for (int i = 0; i < numbers.length; i++) {
//		            numbers[i] = input.nextInt();
//		        }
//
//		        for (int num : numbers) {
//		            if (num > 0) {
//		                if (num % 2 == 0)
//		                    System.out.println(num + " is Positive and Even");
//		                else
//		                    System.out.println(num + " is Positive and Odd");
//		            } else if (num < 0) {
//		                System.out.println(num + " is Negative");
//		            } else {
//		                System.out.println(num + " is Zero");
//		            }
//		        }
//
//		        if (numbers[0] == numbers[numbers.length - 1])
//		            System.out.println("First and Last are Equal");
//		        else if (numbers[0] > numbers[numbers.length - 1])
//		            System.out.println("First is Greater than Last");
//		        else
//		            System.out.println("First is Less than Last");
//
//		        input.close();
		
		
		
		 Scanner input = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = input.nextInt();

	        int maxFactor = 10;
	        int[] factors = new int[maxFactor];
	        int index = 0;

	        for (int i = 1; i <= number; i++) {
	            if (number % i == 0) {
	                if (index == factors.length) {
	                    int[] temp = new int[factors.length * 2];
	                    for (int j = 0; j < factors.length; j++) {
	                        temp[j] = factors[j];
	                    }
	                    factors = temp;
	                }
	                factors[index++] = i;
	            }
	        }

	        System.out.print("Factors: ");
	        for (int i = 0; i < index; i++) {
	            System.out.print(factors[i] + " ");
	        }

	        input.close();
		
		
		
		
		
		
		
		
		
		//Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = input.nextInt();
//
//        int[] table = new int[10];
//        for (int i = 0; i < table.length; i++) {
//            table[i] = number * (i + 1);
//        }
//
//        for (int i = 0; i < table.length; i++) {
//            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
//        }
//
//        input.close();
		
		
		
		
		
		
//		
//		        Scanner input = new Scanner(System.in);
//		        double[] numbers = new double[10];
//		        double total = 0.0;
//		        int index = 0;
//
//		        while (true) {
//		            System.out.print("Enter a number: ");
//		            double num = input.nextDouble();
//
//		            if (num <= 0 || index == 10)
//		                break;
//
//		            numbers[index++] = num;
//		        }
//
//		        for (int i = 0; i < index; i++) {
//		            total += numbers[i];
//		        }
//
//		        System.out.println("Sum of numbers = " + total);
//		        input.close();
		
		
		
		
		
		
		
//		
//		 Scanner input = new Scanner(System.in);
//	        double[] heights = new double[11];
//	        double sum = 0.0;
//
//	        System.out.println("Enter the height of 11 players:");
//	        for (int i = 0; i < heights.length; i++) {
//	            heights[i] = input.nextDouble();
//	            sum += heights[i];
//	        }
//
//	        double mean = sum / heights.length;
//	        System.out.println("Mean Height of the team: " + mean);
//
//	        input.close();
//	
		
		
		
		
		
		
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter size of array ");
//		int n=sc.nextInt();
//		int[] arr=new int[n];
//		System.out.println("ENTER ELEMENT");
//		for(int i=0;i<n;i++)
//		{
//			arr[i]=sc.nextInt();
//		}
//				
//		List<Integer> odd=new ArrayList<>();
//		List<Integer> even=new ArrayList<>();
//	
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]%2==0)
//			{
//				even.add(arr[i]);
//			}
//			else
//			{
//				odd.add(arr[i]);
//			}
//		}
//		System.out.print("ODD ");
//
//		System.out.println(odd);
//		System.out.print("EVEN ");
//		System.out.print( even);
		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int[][] arr=new int[n][n];
//		System.out.print("ENTER ELEMENT");
//		for(int i=0;i<n;i++)
//		{
//			for(int j=0;j<n;j++)
//			{
//				arr[i][j]=sc.nextInt();
//			}
//		}
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=0;j<arr.length;j++)
//			{
//				System.out.print(arr[i][j]+" ");
//
//			}
//			System.out.println();
//		}
		
//		int[] arr= {16,17,4,3,5,2};
//        List<Integer> res=new ArrayList<>();
//
//        for(int i=0;i<arr.length;i++)
//        {
//            int j;
//            for(j=i+1;j<arr.length;j++)
//            {
//                if(arr[i] < arr[j]) 
//                {
//                    break; 
//                }
//            }
//            if(j==arr.length) 
//            {
//                res.add(arr[i]);
//            }
//        }
//
//        System.out.println(res);
//		
//		int[] arr= {1,5,6,1,8,1,1,9,8,9,2,2};
//		int target=1;
//		int ans=0;
//		List<Object> mod=new ArrayList<>();
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]!=target)
//			{
//				ans++;
//				mod.add(arr[i]);
//				
//			}
// 
//		}
//		while(mod.size()<arr.length)
//		{
//			mod.add("_");
//		}
//		System.out.println(ans);
//		System.out.print(mod);
		
		
		
		
		
		
		
//		int[] arr= {1,2,3,-4,-1,4};
//		List<Integer> neg=new ArrayList<>();
//		List<Integer> pos=new ArrayList<>();
//		List<Integer> ans=new ArrayList<>();
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]>0)
//			{
//				pos.add(arr[i]);
//			}
//			else
//			{
//				neg.add(arr[i]);
//			}
//		}int i = 0;
//		int p = 0;
//		int n = 0;
//        boolean turnPos = true; 
//
//        while (p < pos.size() && n < neg.size()) {
//            if (turnPos) {
//                arr[i++] = pos.get(p++);
//            } else {
//                arr[i++] = neg.get(n++);
//            }
//            turnPos = !turnPos;
//        }
//        while (p < pos.size()) {
//            arr[i++] = pos.get(p++);
//        }
//        while (n < neg.size()) {
//            arr[i++] = neg.get(n++);
//        }
//        System.out.println(Arrays.toString(arr));
//		
		
		
		
		
		

		

		
		
		
		
		
		
		
	}

}
