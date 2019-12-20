# DAY 14

## [ 해쉬 테이블]

- 직접 작성한 클래스를 해쉬 테이블의 키로 사용하려면?

  - hashCode 메서드를 오버라이드 해야한다.

  - 방법

    ```java
    public int hashCode() {
        return firstName.hashCode() + lastName.hashCode();
    }
    ```

    

import java.util.*;



## [ 문자셋(charset) ]

ASCII : 0x00 ~ 0x7f(1byte)

​			0x41 ~ 영문 대문자, 0x61~ 영문 소문자...



~ 1986 년 : 표준화된 한글 코드가 없었다.

 				   컴퓨터마다 한글 코드가 달랐다.

~ 1987 년 : 표준화된 한글 코드 : 완성형 한글 코드 : KSC5601 : 영문(1byte : ASCII) , 한글(2byte)

​																						( EUC-KR, MS949(CP949) )

​																						0xB0A1~ : 가....

​																						native code

~~............

1950 년 : 전세계의 나라언어 코드를 통일하자!  -----> unicode : 2바이트 : utf - 16, utf16

​																											A : 0x0041, 가 : 0xAC00

​																											1~4바이트 : utf - 8, utf8

​																											A : 0x41, 가 : 0xEAB080

OS - MS949

Java - utf - 16

Web - utf - 8



## [ 입출력(I/O) 프로그래밍 API]

- Java.io.javax.nio

  -----------------------

- File : 시스템에 존재하는 파일에 대한 처리, 정보 추출....

- 입력용 API, 출력용 API

- 입력 단위 : 바이트 단위, 문자 단위

  ​					(Java 1.0)     (Java 1.1)

  ​					   -----------------------> InputStreamReader

  

- 스트림 이라는 논리적인 구조를 이용한다.

  - 입력 스트림과 출력 스트림으로 구분한다.
    - xxxInputStream, xxxOutputStream : 바이트 스트림
    - xxxReader, xxxWriter : 문자 스트림

  

- 문자 스트림

  - fileReader, FileWriter - 파일 오픈 기능
  - BufferedReader, BufferedWriter

  

- 바이트 스트림

  - FileInputStream, FileOutputStream - 파일 오픈 기능

  - DataInputStream, DataOutputStream

  - ObjectinputStream, objectOutputStream

    

- InputStreamReader, OutputStreamWriter



## [ 정규표현식 ]

```java
\s : 공백
* : 0개 이상
ab* : b는 0개 이상(을 찾는다.)
```

