# Day 6

```java
System.out.println(), System.out.print()
```

(1) 출력 데이터를 한 개만

(2) 출력 데이터 여러개일 때는 + 연산자로 결합하여 한 개로 전달

(3) 출력하려는 데이터의 타입에 따라 출력 형식이 정해진다.

​	int -> 10진수 숫자

​	char -> 문자

​	double -> 소수점 이하의 자리수를 설정불가



### Java 5 (JDK 1.5)		※ JDK = 개발자 버전이다.

```java
System.out.printf()
System.out.printf("출력하려는 포맷 문자열")
System.out.printf("가나다")
System.out.printf("가나다\n")	->> 행단위로 내보내고 싶을 때 (계행 처리)
System.out.printf("가나다%n")	->>	행단위로 내보내고 싶을 때 (계행 처리)
System.out.printf("가나다\n")
System.out.printf("가나다")
    
System.out.printf("가나%d다", sum)	
    ->> %d 같은 애를 '포멧 문자' 라고한다.
System.out.printf("가나%.2f다", avg)	
    ->> t%.2f는 소숫점 2째자리까지 표시
System.out.printf("가%d나%.3f다", sum,avg)
    ->> 변수들의 순서에 매칭되게 동시에 여러개 구현가능
System.out.printf("가%d나%.3f다", 100,99.56789)	
    ->> 이런식으로 리터럴 값을 줄수도 있고, 소수점은 반올림되어서 나타내진다.

System.out.printf("%s%s%s","java","c#","c++")	
System.out.printf("%s %s %s","java","c#","c++")
System.out.printf("%s  %s  %s","java","c#","c++")
System.out.printf("%10s%10s%10s","java","c#","c++")
	->> 이렇게 문자열 사이에 간격을 띄워 줄 수 있다.

System.out.printf("%,d원\n", 1000000);
	->>%,d원으로 1000단위 마다 , 알아서 찍어준다.

```

Sun Microsystems ---> 2010 ---> Oracle



JDK 1.0 -> JDK 1.1 -> JDK 1.2 -> JDK 1.3 -> JDK 1.4 -> JDK 1.5 (Java 5)

​																						C#

​																						(MS)

## [메서드]

- 수행 코드(수행 명령, 수행 문장)를 정의하는 단위 : 기능
- main도 메서드이다.
- 클래스 안에 정의된다.
- 하나의 클래스 안에는 0개 이상의 매서드가 정의될 수 있다.
- 메서드를 생성하는 방법
- 메서드를 사용하는 방법 - 호출



## [메서드를 생성하는 방법]

- 메서드명 

  - (1) 소문자로 시작하고 새로운 워드 등장시 첫 글자만 대문자로

  - (2) 식별자(명명) 규칙 적

  - (3) 동사로 시작

    

- 메서드 호출시 전달 받을 데이터의 유무

  - 有 : 몇 개, 어떤 타입 ----->> 매개 변수 선언

- 호출된 후에 호출한 곳으로 값을 줄 것인지의 여부를 결정 -- 리턴값

  - return 이라는 구문을 사용한다.



```java
[제어자] 리턴값의 타입	메서드명([매게변수 선언]) {
	지역변수 선언:
    수행 문장....
        
    [return 리턴값:]
}
```

## [메서드를 사용하는 방법 - 호출]

- 기능

- 헤더를 보고

  - 메서드명

  - 호출시 전달할 데이터(argument)의 유무

  - 리턴값의 유무에 따라서 리턴값을 사용

    변수 = 식

    ```java
    result = System.out.println();	->> 안된다.
    rand = Math.random()
    ```




run 옆의 박스 -> run configuration -> arguments -> program arguments -> apply -> run

프로그램을 시작할 때 수행시키는 데이터



## [프로그램 아규먼트] (명령행 데이터)

- 프로그램 수행 시작시키면서 최초에 한번만 전달되는 데이터를 main(String[] args) 단, 무조건 문자열로 저장됨

- 숫자를 사용할 경우 (정수) Inter.parslnt()를 이용해서, (실수일 경우) Double.parseDouble()를 이용해서 숫자로 변환하여 사용

