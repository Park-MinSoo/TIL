# Day 12

## [ java.lang]

```java
java.lang - Object, Math, Integer, String, StringBuffer, Character ...

```

- String

  - 문자열 처리와 관련된 메서드들을 가지고 있다.
  - String 객체가 생성된 이후 초기화된 문자열 내용은 변경 불가하다.
  - 읽기 용도로만 사용가능하다.

  ```java
  "abc" + "가나다" -----> "abc가나다"
  "a" + "b" + "c" +"d"
  ```

- StringBuffer

  - 문자열 내용을 계속 변경해야 하는경우. (편집 용도)

    ```java
    StringBuffer sb = new StringBuffer()"";
    sb.append("a");
    sb.append("b");
    sb.append("c");
    sb.append("d");
    ```

  - equals() : Object 클래스 : == 연산과 동일 

    - String형은 == 연산자 비교가 불가능하므로, equals 연산자를 사용하여 비교한다.

```java
Book b1 = new Book("짱구", "xxx", 100000 );
Book b2 = new Book("짱구", "xxx", 100000 );
Book b3 = b2;


b1 == b2 ??
-----> false, 다른 객체를 참조하기 때문
b3 == b2 ??
-----> true, 같은 객체를 참조하기 때문
b1.equals(b2) ??
-----> false
b3.equals(b2) ??
-----> true
    
```

## [ API ]

- Application Programing Interface (라이브러리, 패키지)
  - 자주 사용되는 기능을 미리 만들어 놓은 프로그램
  - 자바 : 클래스, abstract 클래스, 인터페이스..
  - C : 함수

