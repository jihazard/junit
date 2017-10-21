
public class 계좌 {
	private double 잔액 = 0;
	public double get잔액() {
		// TODO Auto-generated method stub
		return 잔액;
	}
	public double get인출(int i) {
		// TODO Auto-generated method stub
		this.잔액-=i;
		return 잔액;
	}
	public void set저금함(int i) {
		// TODO Auto-generated method stub
		if(잔액 < i){
			throw new IllegalArgumentException("j돈이 없어요!");
		}
		this.잔액 += i;
	}

}
