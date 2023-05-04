package day07;

class Weapon {
	int fire() {
		return 1;
	}
	int fire(int demage) {//이게 메서드 오버로드
		return demage;
	}
}
//메서드 오버라이징 하려면 조건이 정확하게 일치해야만 사용가능
class Canon extends Weapon{
	@Override// 부모껄 덮어쓰고있구나 내부적으로 처리됨
	int fire() {
		return 10;
	}
}

public class OverridingTest {
	public static void main(String[] args) {
		Weapon weapon = new Weapon();
		int weaponDamage = weapon.fire();
		System.out.println("weapon의 데미지는 " + weaponDamage);
		
		//동적 바인딩. 메인메서드 실행단계에서 
		weapon = new Canon();
		int canonDamage =weapon.fire();
		System.out.println("canon의 데미지는 " + canonDamage);
		
	}
}
