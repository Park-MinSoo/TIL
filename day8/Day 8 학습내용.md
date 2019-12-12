# Day 8



## [외부 class에서 가져오기]

- 방법 1

  ```java
  import day6.MethodLab3;
  class 클래스명 {
      main() 메서드 헤더{
          int month = MethodLab3.getRandom(12)
      }
  }
  ```

- 방법 2

  ```java
  clas 클래스명 {
      main() 메서드 헤더 {
          int month = day6.MethodLab3.getRandom(12);
      }
  }
  ```



## [ static(정적, 고정, 공유)]

- 제어자

- 멤버변수와 메서드 앞에 지정 가능하다.

- static을 설정한 멤버변수와 메서드는 ***객체생성을 하지 않아도 자동으로***

  ***메모리 영역을 할당하거나 호출 가능한 상태***가 된다.

- 다른 클래스에서 또 다른 클래스의 static 타입의 멤버를 사용할 때는

  클래스명.멤버명 으로 사용한다.

- 클래스에 정의되는 멤버들중 어떤 멤버에 static 부여 하는가?

  - 변수(맴버)
  - 메서드

- - 어차피 동일한 값만을 갖는 애는 static을 붙이는 것이 더 효율적이다.



## [ JVM 옵션]

- 클래스 로딩 정보를 보여주면서 자바 프로그램을 수행시켜라!!



## [블록 스코프 ]

```java
메서드 헤더 {
    int a;	//-----> a는 밑에서도 쓸 수 잇고 if문 안에서도 쓸 수 있다.
    
    if( .... ) {
        int b;	//-----> b는 if문안에서 밖에 못쓴다.
    }
    
    int c;	//-----> c는 위에서는 못쓰고 선언 위치로부터 밑까지는 쓸 수 있다.
    int b; //-------> 여기부터 b는 다시 사용 가능해지게 된다.
}
```



## [표준 입력]

- 프로그램이 수행하는 동안 필요로 하는 데이터를 시스템의 표준 입력 장치로 부터 

  받아 오는 것.

  - 표준 입력 장치 - 키보드
  - 시스템 - 컴퓨터

- Java에서는 표준 입력을 어떻게 처리 하느냐... --> System.in

```java
System.in.read()
```

Java 5 (JDK 1.5) 부터

java.util.Scanner 클래스를 제공하여 좀더 편하게 데이터를 입력 받을 수 있게 API를 추가했다.

```java
Scanner scan = new Scanner{System.in}	
// System.in이 아닌 file의 경우 파일에서 읽어온다.

scan.next() 
// ----> blank, tab 같은 분리 문자 데이터 전까지 값을 읽는다. (word 단위)
scan.nextLine()
// ----> Enter 같은 계행 문자 데이터 전까지 값을 읽는다. (행 단위)
scan.nextInt()
// ----> 정수형 숫자를 읽어들인다.
scan.nextDouble()
// ----> double형 숫자를 읽어들인다.
    :
```

