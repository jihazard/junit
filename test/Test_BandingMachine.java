import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gmail.yoon.BandingMachine;

public class Test_BandingMachine {
    
	private BandingMachine bm;
	
	
	@Before
	public void setUp() throws Exception {
		 bm=new BandingMachine();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_coinTest() {
		//1.동전 넣는것 부터 구현
		bm.insertCoin(500);
		bm.insertCoin(100);
		bm.insertCoin(100);
		//700눤 넣었을 경우 가정함  
		//단위테스트는 메소드를 마들고 bandingmachine 클래스로가서 메소드를 구현해서 에러와 버그를 없애나감.
		
		//700원 이 정상적으로 들어가 있는 지확인
		assertEquals(700, bm.getCurrentMoney());
		//getCurrentMoney() 호출은 700원이 반환되어야 한다는 의미  왼쪽은 개가 기대하는 값, 오른쪽은 반환값 임으로 두 값이 같아야 합니다.
		
		//expected : <700> but was 0   = 700을 기대했는데 0을 받았다는 뜻입니다.
		
		//예외 처리도 진행해야함
		
	}
	@Test(expected=RuntimeException.class)
	public void test_errorValue(){
		//테스트 원칙!
		//하나의 테스트 메소드에서는 한가지만 테스트합니다.
		//test_insertCoin()은 금액을 넣을 경우 잘나오는지
		//
		
		bm.insertCoin(-100);
		//-100을 입력할 경우
		//예외를 던지도록 합니다. 음수입력은 자판기에서 불가능하기 때문에 예외를 던집니다.
		//다시 테스트 진행
		//@Test(expected=RuntimeException.class)  예외가 던져지는게 예상된다는 뜻임 
		//이렇게 하면 0보다 작거나 같은 숫자를 걸러내는 테스트를 완료 했습니다.
	}
	//5000원 이상일 경우 
	@Test(expected=RuntimeException.class)
	public void test_errorUpValue(){
	 		
		bm.insertCoin(5001);
		
	}
}
