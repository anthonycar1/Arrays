package myHomework;

public class Work {

	public static void main(String[] args) {
		
		double[] arr = {10, 11, 5, 9, 3, 8};
		double total = 0;
		double min = arr[0];
		double high = 0;
		boolean highfilled = false;
		double checknum;
		
		String[] names = {"Jinny", "Dom", "Meg", "Tung", "Claire", "Alec", "Anthony", "Chris"};
		String names2[] = new String[names.length * 2];
		int nameCounter = 0;
		int longName = 0;
		int longNameIndex = 0;
		
		//Questions 1 + 2
		for(int i = 0; i < arr.length; i++){
			total += arr[i];
		}
		System.out.println("#1: The sum of all the numbers in this array is: "+ total);
		System.out.println("#2: The average of the number in this array is: "+ total/arr.length);
		
		
		//Question 3
		for(int i = 0; i< arr.length; i++){
		if(arr[i] < min){
			min = arr[i];
			}			
		}
		System.out.println("#3: The minimum value of this array is: "+ min);
		
		
		//Question 4
		for(int i = 0; i< arr.length - 1; i++){
			checknum = arr[i + 1];
			if(checknum < arr[i]){
				if(highfilled == false){
					high = i;
					highfilled = true;
				}else{
					
				}
			}
		}
		System.out.println("#4: The index of the first number to decrease in value is: " + high);
		
		
		//Question 5
		for(int i = 0; i< names.length; i++){
			if (names[i].startsWith("A")){
				nameCounter++;
			}else{
				
			}
		}
		System.out.println("#5: The number of strings that start with 'A' is: " + nameCounter);
		
		
		//Question 6
		for(int i = 0; i< names.length; i++){
			if (names[i].length() > longName){
				longNameIndex = i;
				longName = names[i].length();
			}else {
				
			}
		}
		System.out.println("#6: The index of the longest string in this array is: " + longNameIndex);
		
		
		//Question 7
		for(int i = 0; i< names.length; i++){
			names2[i] = names[i];
		}
		System.out.println("#7: Check code commented 'Question 7' to see the copied array");
		
		
		//Question 8
		for(int i = 7; i >= 2; i--){
			names2[i + 1] = names2[i];
		}
		names2[2] = "Alyssa";
		System.out.println("#8: The name " + names2[2]+" has been added to the third spot in the array. Necessary strings moved.");
		
		//Question 9 and 10
		System.out.println("#9: see code");
		System.out.println("#10: ");
		for(int i = 0; i< names2.length - 8; i++){
			if ((names2[i].startsWith("C")) && (names2[i +1].startsWith("C"))){
				names2[i] = null;
				names2[i+1] = null;
			}else if (names2[i].startsWith("C")){
				names2[i] = names2[i +1];
				names2[i + 1] = names2[i +2];
			}else if(names2[i] == names2[i + 1]){
				names2[i + 1] = names2[i + 2];
			}
			if (names2[i] != null){
			System.out.println(names2[i]);
			}
		}		
	}

}
