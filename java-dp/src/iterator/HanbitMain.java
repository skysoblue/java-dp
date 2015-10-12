package iterator;

public class HanbitMain {
	public static void main(String[] args) {
		HanbitEni hb = new HanbitEni(); // 총 정원수 10명.반은 2개
		hb.add(new Student("빅데이터","길동"));
		hb.add(new Student("빅데이터","유신"));
		hb.add(new Student("빅데이터","순신"));
		hb.add(new Student("자바","순환"));
		hb.add(new Student("자바","준규"));
		hb.add(new Student("자바","성한"));
		hb.add(new Student("자바","혜숙"));
		
		while (true) {
			System.out.println("1.학생추가 2.학생조회(유일한값이름) 3.학생조회(과목) 4.총학생수 5.종료");
		}
		/**
		 * 1.HanbitEni 의 배열 버전 
		 * 2.HanbitEni 의 ArrayList 버전..성공한 분은 학생탈퇴 기능 추가 바람
		 * 3.HanbitEni 의 HashMap 버전..성공한 분은 학생탈퇴 기능 추가 바람
		 */
	}
}
