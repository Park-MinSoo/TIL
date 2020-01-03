# [ DAY 21 ]



## [ HTML 특징 ]

```html
<h1> - 시작태그, content
    
</h1> - 종료태그, 
```



- http://localhost:8000/edu/imsi.html 에서  'edu/imsi.html' 부분을 URI 라고한다.
- Web content가 루트 디렉토리에 있어야한다.
- HTML을 읽어 오는것을 'Parsing' 이라고 한다.

- HTTP 상태
  - 404 에러 - 파일명을 찾을 수 없는 것이다.

- 백그라운드 칼라는 기본으로 흰색, 텍스트 칼라는 기본으로 검은색이다.

  

- 이미지의 확장자 종류

  - gif - 해상도가 낮지만 사이즈가 낮다.
  - jpg - 해상도가 높아 주로 사진에 쓰인다. 사이즈가 크기에 모바일 환경에서 안좋다
  - png - 해상도도 적당하고 사이즈도 적당하다.

  

  ## [ HTML 명령어 ] 

  ```html
  <br> - 행바꿈 태그이다.
  <hr> - horizontal이라고 수평선을 (즉, 분리선) 그려줄수 있게 된다.
  <!-- --> - 주석 태그이다.
  <a href="A">	B	</a>
  ----> 하이퍼 링크 태그이다. A에는 하이퍼링크를 걸어주고 B자리에는 글자나 이미지를 넣는다.
  
  ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
  리스트 태그 하는 방법!
  
  <ul>	</ul> - un ordered list 순서가 없는 리스트가 나온다.
  
  <ol>	</ol> - ordered lsit 1. 2. 3. 4. ... 순서가 달려서 리스트가 나온다.
  
  ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
  테이블 태그 하는 방법!
  
  <table border="1">		</table> - border를 주면 선을 주게 된다. 
  <th>	</th> - 제목 행이다. 굵은 폰트 스타일, 가운데 정렬이 되어진다.
  <tr>	</tr> - 내용 행이다.
  <td>	</td> - 사이사이 들어갈 말을 적는다. 일반 폰트 스타일, 왼쪽정렬이 되어진다.
  
  ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
  입력 폼 태그 하는 방법!
  
  <form action=""method="">
  	<input type="text" placeholder="이름을 입력하세요..." required name= "gname">
  	<input type="submit" value="전송">
  ```

  

- Query String 

  - Web Client 가 Web Server 에게 정보(페이지)를 요청할 때, 함께 전달 가능한 name 과 value로 구성되는 문자열

  - ***W3C가 정의해 놓기를***  --------> Query String Encoding 규칙

    1. name = value 로 구성되어야 한다.

    2. 여러개의  name = value를 전달하는 경우에는 & 기호로 분리해야 한다.
    3. 영문과 숫자 그리고 일부 특수문자를 제외하고는 %기호와 코드 값으로 전달된다.
    4. 공백은 + 기호로 전달된다.

[http://localhost:8000/edu/htmlexam/...?gname=%EA%B0%80&gage=10](http://localhost:8000/edu/htmlexam/...?gname=가&gage=10)

[http://localhost:8000/edu/htmlexam/...?gname=%EA%B0%80+asd123&gage=10](http://localhost:8000/edu/htmlexam/...?gname=가+asd123&gage=10)

[http://localhost:8000/edu/htmlexam/...?gname=%EA%B0%80&gage=1&gdate=2019-04-29](http://localhost:8000/edu/htmlexam/...?gname=가&gage=1&gdate=2019-04-29)



- radio 와 check box

```html
성별을 선택하세요:<br>
	남성<input type="radio" name="gender">
<!-- radio는 동그라미로 표현되며 여러가지중 하나 선택하게 하는것이다.  -->
	여성<input type="radio" name="gender">
	<br>
	좋아하는 음식을 선택하세요:<br>
	떡볶이<input type="checkbox" name="food">
<!-- checkbox는 동그라미로 표현되며 여러개를 선택하게 하는것이다.  -->
	오뎅<input type="checkbox" name="food">
	튀김<input type="checkbox" name="food">
	순대<input type="checkbox" name="food">
	김밥<input type="checkbox" name="food">

```

[http://localhost:8000/edu/htmlexam/...?gname=%E3%85%87&gage=1&gdate=2020-01-23&gender=on&food=on&food=on&food=on&food=on&food=on](http://localhost:8000/edu/htmlexam/...?gname=ㅇ&gage=1&gdate=2020-01-23&gender=on&food=on&food=on&food=on&food=on&food=on)

--> 이렇게 되면 남성인지 여성인지, 떡볶이인지 순대인지 등 구분을 못하고 그저 on으로만 나타나게된다.

sol)  Value 값을 지정해 주어 무엇이 선택되었는지 알려줘야 한다.

```html
	성별을 선택하세요:<br>
	남성<input type="radio" name="gender" value="male">
	여성<input type="radio" name="gender" value="female">
	<br>
	좋아하는 음식을 선택하세요:<br>
	떡볶이<input type="checkbox" name="food" value="떡볶이">
	오뎅<input type="checkbox" name="food" value="오뎅">
	튀김<input type="checkbox" name="food" value="튀김">
	순대<input type="checkbox" name="food" value="순대">
	김밥<input type="checkbox" name="food" value="김밥">
```

[http://localhost:8000/edu/htmlexam/...?gname=%E3%85%87%E3%84%B4%E3%85%87&gage=1&gdate=2020-01-09&gender=male&food=%ED%8A%80%EA%B9%80&food=%EC%88%9C%EB%8C%80&food=%EA%B9%80%EB%B0%A5](http://localhost:8000/edu/htmlexam/...?gname=ㅇㄴㅇ&gage=1&gdate=2020-01-09&gender=male&food=튀김&food=순대&food=김밥)

- radio나 checkbox의 경우 value 사용이 필수이다.
- IE는 HTML5를 완벽히 지원하지 않는다.

