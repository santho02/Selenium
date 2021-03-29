package week3.day1;

public class Ios {
public void swipeLeft() {
	System.out.println("SwipeLeft");
}

public void fingerPrint() {
	System.out.println("Unlock");
}

public class iphone extends Ios{
	public void faceRecognition() {
		System.out.println("Recognize");
	}
	public string darkmode()
	{
		System.out.println("same");
	}
	public int lightmode() {
		System.out.println(1);
	}	
}
public class Myphone{
	public void main(String[] args) {
		iphone obj=new iphone();
		obj.fingerPrint();
		obj.swipeLeft();
		obj.faceRecognition();
		
	}
}
}

