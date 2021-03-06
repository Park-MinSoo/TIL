# [ DAY 16 ]



## [ SQL 주의사항 ]

- SQL은 기본적으로 대 소문자 구분을 하지 않는다.
- result set = 추출된 결과들의 집합.
-  별칭에 공백이나 숫자, 특수 문자를 사용하고 싶으면 더블 인용부호("")를 사용한다.
- Character 문자 데이터는 길이에 상관없이 무조건 단일 인용부호('')이다.
- 연도를 표현할때에도 / 와 단일 인용부호('')를 사용한다.
- BETWEEN A AND B 의 경우, A와 B 값을 포함하며 반드시 A는 B보다 작아야한다.
- SQL은 대 소문자 구분을 하지 않지만 Character 안에서는 대 소문자 구분을 한다.
- _ 는 어떤 값이든 상관없이 한 개의 문자 데이터를  의미한다.

- % 는 길이와 상관없이 (문자 없는 경우도 포함) 모든 문자 데이터를 의미한다.

  

```sql
where name like '김%'  // %란 ??? -> 0개 이상의 모든 문자(들)을 의미한다. -meta character !!
where addr like '%강남구%'    // 강남구 앞이나 뒤에 뭐라고 써있든 상관이 없다.
where addr like '강남구%'    // 강남구로 시작해야 하고 그 뒤에 뭐라고 써있든 상관이 없다.
where addr like '%강남구'   // 강남구 앞에 뭐라고 써있든 상관이 없다.
where name like '김__'	// 임의의 문자 1개
where ssn like '______-2______'	// 여성의 주민등록번호(ssn)를 추출한다.
```



- Null 과 연산하면 무조건 결과는 Null이 나오게 된다.
- SQL은 -- 가 주석이다.
- rr/mm/dd -----> 기본 설정된 날짜 포멧이다. (1~49는 19xx년 을 표시하고, 50~99는 20xx년을 표시한다.)
- yy/mm/dd -----> yy는 기본으로 20xx년(현재 세기)으로 설정 되어 진다.

- Union (All), Minus, Intersect 같은 집합 연산자들은 추출되는 열의 갯수(타입)이 똑같아야 쓸 수 있다.



## [ 내장 함수 ]

- 단일행 함수

  - 입련된 한 행당 결과가 하나씩 나오는 함수

- 다중행 함수(= 그룹함수)

  - 여러 행이 입력되어 하나의 행으로 결과가 반환되는 함수

    

## [ 함수들의 종류 ]

- 문자 관련된 함수들

  - UPPER(문자열) - 괄호 안 문자 데이터를 모두 대문자로 변환하여 변환

  - LOWER(문자열) - 괄호 안 문자 데이터를 모두 소문자로 변환하여 변환

  - INITCAP(문자열) - 괄호 안 문자 데이터 중 ***첫 글자는 대문자***로, 나머지 문자를 소문자로 변환 후 반환

  - LENGTH(문자열) - 특정 문자열 길이를 구할때 사용, (한문이던 영문이던 1로 계산한다.)

    

  - LENGTHB(문자열) - 문자열의 바이트 수를 반환한다.

    - ※ utf - 8 을 이용중이기 때문에 한글의 바이트수가 (x2)가 아닌 (x3)이 나오게 된다.

      

  - SUBSTR(문자열 데이터, 시작 위치, 추출길이) - 문자열 데이터의 시작 위치부터 추출 길이만큼 추출

    - ※ 시작 위치가음수일 경우에는 마지막 위치부터 거슬러 올라간 위치에서 시작합니다.

      

  - INSTR([대상 문자열 데이터(필수)]

    ​				,[위치를 찾으려는 부분 문자(필수)]

    ​				,[위치 찾기를 시작할 대상 문자열 데이터 위치(선택, 기본값은 1)]

    ​				,[시작 위치에서 찾으려는 문자가 몇 번째인지 지정(선택, 기본값은 1)])

    - 문자열 데이터 안에서 특정 문자 위치를 찾는 함수이다.

      

  - REPLACE([문자열 데이터 또는 열 이름(필수)]

    ​					,[찾는 문자(필수)]

    ​					,[대처할 문자+(선택)])

    - 특정 문자를 다른 문자로 바꾸는 함수이다.

    - 만약 대체할 문자를 입력하지 않는다면 찾는 문자로 지정한 문자는 문자열 데이터에서 삭제된다.

      

  - LPAD, RPAD([문자열 데이터 또는 열이름(필수)]

    ​					,[데이터의 자릿수(필수)]

    ​					,[빈 공간에 채울 문자(선택)]) 

    - 왼쪽 또는 오른쪽에 데이터의 빈 공간을 특정 문자(기본은 공백)로 채우는 함수

      

  - CONCAT - 두 문자열 데이터를 합치는 함수

  - TRIM - (앞이나 뒤에) 문자열 데이터 내에서 특정 문자를 지우기 위해 사용

    - LTRIM - 왼쪽 위치

    - RTRIM - 오른쪽 위치

    - 주로 앞뒤에 쓸데 없는 공백을 삭제하는데 많이 사용한다.

      

- 숫자 관련된 함수들

  - ROUND - 지정된 숫자의 특정 위치에서 반올림한 값을 반환

    - 반올림 위치를 지정하지 않으면 소수점 첫 번째 자리에서 반올림이 수행된다.

      

  - TRUNC - 지정된 숫자의 특정 위치에서 버림한 값을 반환 (절삭)

    - 반올림 위치를 지정하지 않으면 소수점 첫 번째 자리에서 반올림이 수행된다.

      

  - CEIL - 지정된 숫자보다 큰 정수 중 가장 작은 정수를 반환

  - FLOOR - 지정된 숫자보다 작은 정수 중 가장 큰 정수를 반환

  - MOD - 지정된 숫자를 나눈 나머지 값을 반환



- 날짜 관련된 함수들

  - ADD_MONTHS - 특정 날짜에 지정한 개월 수 이후 날짜 데이터를 반환

  - MONTHS_BETWEEN - 두 개의 날짜 데이터를 입력하고 두 날짜 간의 개월 수 차이를 구하는데 사용

  - NEXT_DAY - 날짜 데이터와 요일 문자열을 입력, 입력한 날짜 데이터에서 돌아오는 요일의 날짜 반환

  - LAST_DAY - 입력 날짜 데이터가 속한 달의 마지막 날짜를 반환해주는 함수

  - ROUND 나 TRUNK 또한 날짜 데이터에서 사용 가능하다.

    

- 변환 관련된 함수들
  - TO_CHAR - 숫자 또는 날짜 데이터를 문자 데이터로 변환
    - 9 : 숫자의 한자리를 의미함(빈 자리를 채우지 않음)
    - 0 : 빈자리를 0으로 채움을 의미함
  - TO_NUMBER - 문자 데이터를 숫자 데이터로 변환
  - TO_DATE - 문자 데이터를 날짜 데이터로 변환