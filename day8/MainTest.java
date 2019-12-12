package day8;
public class MainTest {

	public static void main(String[] args) {
		main(null);	// ---->> 자기 자신을 계~~~~속 호출만 하기만하고 'Call Stack'에 정보만 쌓이다가 에러가 나게 될것이다.(StackOverFlow = 스텍이 꽉차서 넘쳤다)
	}
}
