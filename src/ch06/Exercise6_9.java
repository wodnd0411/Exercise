package ch06;

// static을 붙여야 하는 멤버와 그 이유(단, 모든 병사의 공격력과 방어력은 같아야 한다.)?
// 답 : weapon, armor, weaponUp(), armorUp()
//     -> 모든 병사의 공격력과 방어력은 같아야 하므로 static, static변수를 사용하는 메서드도 static 붙여야 함
public class Exercise6_9 {
	
	public static void main(String[] args) {
		
	}
	
}

class Marine {
	
	// Marine의 위치 좌표 (x, y)
	int x = 0;
	int y = 0;
	
	int hp = 60; // 현재 체력
	int weapon = 6; // 공격력
	int armor = 0; // 방어력
	
	void weaponUp() {
		weapon++;
	}
	
	void armorUp() {
		armor++;
	}
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}