package demoPackage;

import RevisionSelenium.RevisionSeleniumTime.AccessModifier;
import RevisionSelenium.RevisionSeleniumTime.AccessModifier_Protected;
import RevisionSelenium.RevisionSeleniumTime.AccessModifier_Public;

public class AccessModifier_1 extends AccessModifier_Protected{

	public static void main(String[] args) {
		
		AccessModifier_1 accessModifier = new AccessModifier_1();
		
		System.out.println(accessModifier.i);
		
		accessModifier.getData();
		
		
		
		AccessModifier_Public publicModifier = new AccessModifier_Public();
		
		System.out.println(publicModifier.i);
		
		publicModifier.getSum();
		
	}
}
