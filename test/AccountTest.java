import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	@Test
	public void 계좌테스트() {
		계좌 account = new 계좌();
		double current = account.get잔액();
		assertEquals(0,current,0.00001);
	}
	
	@Test
	public void 인출테스트() {
		계좌 account = new 계좌();
		account.set저금함(1000);
		account.get인출(100);
		assertEquals(900,account.get잔액(),0.00001);
		account.set저금함(1000);
		 assertEquals(1900,account.get잔액(),0.00001);
	}
	@Test
	public void 저금테스트() {
		계좌 account= new 계좌();
		account.set저금함(1000);
		account.get인출(100);
		assertEquals(900, account.get잔액(),0.0001);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void 예외처리테스트(){
		계좌 account = new 계좌();
		account.set저금함(10);
		account.get인출(100);
		
		
	}

}
