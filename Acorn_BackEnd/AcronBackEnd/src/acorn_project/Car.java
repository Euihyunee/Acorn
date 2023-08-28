package acorn_project;

public class Car {
	//  필드 영역
	String 	sManufacturer; 		// null
	float 	fFuel;				// 0.0
	float 	fSpeed;				// 0.0
	int 	IRegistrationNum;	// 0
	boolean bRunning;			// false 주행여부
	
	// 생성자 영역
	public Car() {}
	public Car(String sManufacturer, 
			float fFuel) {
		this.sManufacturer = sManufacturer;
		this.fFuel = fFuel;
	}
	
	// 메소드 영역
	public String getsManufacturer() {
		return sManufacturer;
	}
	public void setsManufacturer(String sManufacturer) {
		this.sManufacturer = sManufacturer;
	}
	public float getfFuel() {
		return fFuel;
	}
	public void setfFuel(float fFuel) {
		this.fFuel = fFuel;
	}
	public float getfSpeed() {
		return fSpeed;
	}
	public void setfSpeed(float fSpeed) {
		this.fSpeed = fSpeed;
	}
	public int getIRegistrationNum() {
		return IRegistrationNum;
	}
	public void setIRegistrationNum(int iRegistrationNum) {
		IRegistrationNum = iRegistrationNum;
	}
	public boolean isbRunning() {
		return bRunning;
	}
	public void setbRunning(boolean bRunning) {
		this.bRunning = bRunning;
	}
	void switchOff() {
		bRunning = false;
	}
	
	
	
	
	void switchOn() {
		bRunning =  true;
	}
	
	
	
	void accerlate() {
		// 속도 변화
		if(!bRunning) return; 
		
		fSpeed += 20;
		if(fFuel > 0.f) {
			fFuel -= 1.0;
			if(fFuel < 0) {
				fFuel = 0.f;
				_break();
			}
		}	
	}
	
	void _break() {
		// 속도 변화
		fSpeed = 0.f;
	}
	
	
}
