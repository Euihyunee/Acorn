package DesignPattern.FactoryPattern;

/**
 * 
 */
public abstract class AbstractFactory {

	public AbstractFactory() {}
	/**
	 * @return
	 */
	//  필드 영역

	// 생성자 영역

	// 메소드 영역
	public abstract Shape getShape(String type);
}
