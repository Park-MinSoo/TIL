# [Day 9]



## scanner 

- next()
- nextint()
- nextDouble()
- nextLine()



※ 그전까지는

```java
readLine([매개변수]) : String
```

를 사용해왔다.



## [ 상속 ]

- 자바의 모든 객체들은 상속이라는 객체지향언어의 특징을 지원한다.

- 자바에서 생성되는 모든 객체들은 기본적으로 java.lang.Object 이라는 객체를 상속하게 된다.

- 클래스 헤더에 extends 라는 절을 사용하는 부모 클래스를 설정하는데

  ***하나의 부모 클래스만 설정 가능***하다.

- 조상부터 물려받은 메서드들은 필요에 따라 대체할 수 있다. 

  - 이를  메서드 오버라이딩(Method Overriding)이라 한다.
  - ***오버라이딩시에는 반드시 리턴타입을 동일***하게 해야한다.

- 어떤 클래스든 객체를 생성하면 해당 클래스만 메모리 할당하는 것이 아니라

  조상 클래스들도 메모리 할당한다.

- 자손 클래스의 객체 생성시 생성자 메서드가 호출되면 바로 조상 클래스의 생성자도 호출된다.

  내부적으로는 아규먼트 없는 생성자가 호출 되는데 다른 생성자를 호출하려는 경우

  super()라는 메서드를 사용한다.

- 객체를 참조하는 용도 : this, super

- 객체를 초기화하는 용도로 사용되는 생성자 메서드 호출에 : this(), super()

- this(), super() : 생성자 안에서만 호출 가능하다.

- this, super : 객체 생성 시점에 초기화 된다. static 메서드에서는 사용 불가하다.

  ​					non-static 매서드와 생성자 매서드에서만 사용 가능하다.



## [ 제어자 : modifier(수정자, 한정자, 제어자) ]

1. 접근 제어자 : public, protected, (default), private

2. 활용 제어자 : final, static, abstract, transient, synchronized, .....



- 제어자란  클래스, 메서드, 변수앞에 설정되어 접근 가능 여부와 사용 방식을 제어하는 구문

  ```java
  [제어자] class 클래스명 extends 부모클래스명 {
     		 [제어자]멤버변수 선언;
      
     		 [제어자]생성자 메서드 정의
          
           [제어자]메서드 정의
  }
  
  public, final, abstract class 클래스명 extends 부모클래스명 {
     		 모든접근제어자, final, static 멤버변수 선언;
      
     		 모든접근제어자 생성자 메서드 정의
          
           모든접근제어자, static, final, abstract 메서드 정의
  }
  ```

- 클래스에는 접근제어자를 두 가지만 설정 가능 : public, (default)

  -   public   클래스 : 누구나
  - (default) 클래스 : 동일 패키지내의 클래스

  

- **종류에 따른 설명 1**

  - final 
    - 변경할 수 없는
    -  마지막의
  - abstract
    - 반드시 변경해야 하는
    -  마지막이 아닌
    - 미완성의

```java
final 클래스 : 상속 불가, 객체 생성 가능
abstract 클래스 : 객체 생성 불가, 상속만 가능
```

- **종류에 따른 설명 2**

  - public

    - 누구나 접근가능

  - protected

    - 동일 패키지 이거나 자손이면 접근 가능

  - (default)

    - 동일 패키지 접근 가능

  - private

    - 자손이든 객체 생성한 클래스든 접근 불가

    - 맴버가 정의된 클래스 내에서만 사용 가능

      

  ```java
  + ----> public
  # ----> protected
  (), ~ ----> (default)
  - -----> private
  ```

  

- static, final을 함께 지정하여 상수를 만든다.

```java
public class Math {
    		public final static double PI = 3.1452;
    
}

Math.PI
Integer.MAX_VALUE

```

- 매서드에
    
	- final
	  - 자손에 의해 오버라이딩이 불가능한 메서드를 정의
	- abstract
	  - 자손에 의해 반드시 오버라이딩 해야 하는 메서드를 정의
	  - 메서드의 헤더만 정의되고 바디가 없는 메서드
	
	​		

## [ 상속 Review ]

- 기존의 클래스를 재사용해서 새로운 클래스를 작성하는 것.
- 두 클래스를 조상과 자손으로 관계를 맺어주는 것.
- 자손은 조상의 모든 멤버를 상속받는다.(생성자, 초기화블럭 제외)
- 자손의 멤버개수는 조상보다 적을 수 없다.(같거나 많다.)
- Java는 단일상속만을 허용한다.(C++ 는 다중상속 허용)



## ★ static은 객체생성 필요없이 바로 호출 가능하다!!

