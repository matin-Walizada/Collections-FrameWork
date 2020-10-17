package com.inheritance;

public class AllBirdsInfo {

	public static void main(String[] args) {
	 
		Eagle theEagle = new Eagle();
		
		System.out.println(theEagle.highFligh);
		
		System.out.println(theEagle.product);
		System.out.println(theEagle.outerCover);
		theEagle.flyUp();
		theEagle.flyDown();
		
		
		System.out.println("=====================\n");
		
		EagleChild theEagleChild = new EagleChild();
		System.out.println(theEagleChild.hunt);
		System.out.println(theEagleChild.highFligh);
		System.out.println(theEagleChild.product);
		System.out.println(theEagleChild.outerCover);
		
		theEagleChild.flyUp();
		theEagleChild.flyDown();
		
		System.out.println("==============\n");
		
		Parote theParote = new Parote();
		System.out.println(theParote.couldTalk);
		System.out.println(theParote.product);
		System.out.println(theParote.outerCover);
		
		theParote.flyUp();
		theParote.flyDown();
		
		
	}

}
