package com.generic;

public class TestRun {

	
	public void getDuplicate (int [] a) {
		
		for(int i = 0; i< a.length; i++) {
			for(int j =(i+1); j<a.length; j++){
				
				if (a[i]==a[j]) {
					
					System.out.println(a[i]+"===="+a[j]);
					System.out.println(a[j]);
				}
			}		
	}

}

	
public static void main(String[] args) {
	TestRun obj =new TestRun();
	int [] a = {2,2,4,4,6,7,8,7,6};
obj.getDuplicate(a);

}

}