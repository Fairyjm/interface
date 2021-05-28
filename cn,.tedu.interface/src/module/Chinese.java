package module;
/*
 * 定义一个实现类，实现接口
 * 
 * 
 */

public  class Chinese implements Person{

	@Override
	public void speak() {
		
		System.out.println("中国人说汉语");		
	}

	@Override
	public void eat() {
		System.out.println("中国人吃面条");	
		
	}
	

}
