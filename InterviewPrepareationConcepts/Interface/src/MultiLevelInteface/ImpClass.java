package MultiLevelInteface;

public class ImpClass implements Sample3 {

	@Override
	public void doop2() {
		// TODO Auto-generated method stub
		System.out.println("doop2 starts");
	}

	@Override
	public void doop1() {
		// TODO Auto-generated method stub
		System.out.println("doop1 starts");
	}

	@Override
	public void doop3() {
		// TODO Auto-generated method stub
		System.out.println("doop3 starts");
	}

}
