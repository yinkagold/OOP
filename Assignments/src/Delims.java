
public class Delims {

	public static void main(String[] args) {
		/*String phrase = "Smith,Katie,3014,,8.25,6.5,,,10.75,8.5";
		String delims = "[,]";
		String[] token = phrase.split(delims) ;
		for(int i = 0;i<token.length;i++){
			System.out.println(token[i]);
		}
		char letter = 'a';
		char anotherLetter = 98;
		letter += 2;
		System.out.println(letter);
		System.out.println(anotherLetter);
		System.out.println("using characters" + " "+ "she\r" +" "+ "family\"s");
		double x = 1.0, y=2.0;
		System.out.println(x/y);
		int i = 3;
		double f;
		f = (double)i;
		System.out.println(f);
		int sum = 0;
		double average;
		int num = 1;
		while(num<100){
			sum +=num;
			num++;
		}
		average = sum/100;
		System.out.println(average);*/
		int [][] arrayNums = {{1,2,3,4},{5,6,7,9},{12,3,4,14}};
		boolean found = false;
		int magicNum = 12;
		for(int i=0;i<arrayNums.length;i++){
			for(int j=0;j<arrayNums[i].length;j++){
				if(arrayNums[i][j] == magicNum){
					found = true;
				}
				
			}
		}
		 System.out.println("Magic Number " + (found?  "found" : "Not found"));
	}

}
