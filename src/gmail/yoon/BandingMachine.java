/**
 * Copyright 2017 (C) by yoon   All right reserved.
 *
 * @FileName  BandingMachine.java
 * @Discription : 
 *
 * @Modification Information
 * @
 * @  수정일                  수정자                     수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2017. 10. 22.      jihwan      최초생성
 *
 *
 * @author yoon
 * @since  2017. 10. 22.
 * @version 1.0
 * @see
 */
package gmail.yoon;

import javax.management.RuntimeErrorException;

/**
 * @Project  : yoon
 * @author   : jihwan
 * 
 */
public class BandingMachine {

	private int money; //이 변수는 현재 자판기에 입력된 돈을 담는 용도로 사용됩니다.	
	public void insertCoin(int money) {
		
		if(money <= 0 ){
			throw new RuntimeException("0원 이상만 입력가능합니다. : " + money);
		}else if(money > 5000){	
			throw new RuntimeException("5000원 이하만 입력가능합니다. : " + money);
			
		}
		
		this.money += money;
		//입력된 돈 누적
		// insert 코인 메서드 생성, 
		
	}

	public Object getCurrentMoney() {
		// TODO Auto-generated method stub
		
		return this.money;
	}

}
