sts3 > 스프링
sts4 > 스푸링 부트

sts3 
https://github.com/spring-attic/toolsuite-distribution/wiki/Spring-Tool-Suite-3

sts3는 jdk 11 버전 2항 


스프링공식사이트
https://spring.io/
https://docs.spring.io/sts/nan/v3915/NewAndNoteworthy.html

스프링 (sts3)
sts3  prferences  설정 --------------------------------------------

pre 
 gene
  work 
   other 
     utf-8


  java
    compiler
        compiler level :  11     < jdk 11
    installed jres    > 기본 폴더 확인 
    
web
  css , html, jsp 
    utf -8  변경  < 셀렉트에 맨 위에 있음

-----------------------------------------------------------------
서버 삭제
sever 
  vmware > delet

-----------------------------------------------------------------
톰캣 9.0 설치
https://tomcat.apache.org/download-90.cgi

다운버전
32-bit/64-bit Windows Service Installer (pgp, sha512) 

shutdown port8005
connector port 8888

next  >  C:\Program Files\Java\jdk-11.0.12 위치확인

설치 후
작업표시줄 스탑버튼 활성화 시 stop

type : manual

확인후 작업표시줄 톰켓  exit 클릭



-----------------------------------------------------------------
아파치 톰캣 9 선택  < 스프링이라 구버전 사용
  노서버 클릭
     아파치 톰캣 9  > next
      brower > bin폴더가 보이는 폴더 선택

      jre > jdk 11 또는 디폴트 
     
-----------------------------------------------------------------


JSTL ------------------------------------------------------------
톰캣서버에 JSTL 파일 붙여넣기

jstl.jar
standard.jar
파일 2개 복사

복사한 파일을 톰캣 lib 에 붙여넣기
C:\Program Files\Apache Software Foundation\Tomcat 9.0\lib


-------------------------------------------------------------------------



sts3 > 스프링
sts4 > 스푸링 부트

sts3 
https://github.com/spring-attic/toolsuite-distribution/wiki/Spring-Tool-Suite-3

sts3는 jdk 11 버전 2항 


스프링공식사이트
https://spring.io/
https://docs.spring.io/sts/nan/v3915/NewAndNoteworthy.html

스프링 (sts3)
sts3  prferences  설정 --------------------------------------------

pre 
 gene
  work 
   other 
     utf-8


  java
    compiler
        compiler level :  11     < jdk 11
    installed jres    > 기본 폴더 확인 
    
web
  css , html, jsp 
    utf -8  변경  < 셀렉트에 맨 위에 있음

-----------------------------------------------------------------
서버 삭제
sever 
  vmware > delet

-----------------------------------------------------------------
톰캣 9.0 설치
https://tomcat.apache.org/download-90.cgi

다운버전
32-bit/64-bit Windows Service Installer (pgp, sha512) 

shutdown port8005
connector port 8888

next  >  C:\Program Files\Java\jdk-11.0.12 위치확인

설치 후
작업표시줄 스탑버튼 활성화 시 stop

type : manual

확인후 작업표시줄 톰켓  exit 클릭



-----------------------------------------------------------------
아파치 톰캣 9 선택  < 스프링이라 구버전 사용
  노서버 클릭
    > 아파치 톰캣 9  
        > next
      		brower > bin폴더가 보이는 폴더 선택

	      jre > jdk 11 또는 디폴트 
     
-----------------------------------------------------------------


JSTL ------------------------------------------------------------
톰캣서버에 JSTL 파일 붙여넣기

jstl.jar
standard.jar
파일 2개 복사

복사한 파일을 톰캣 lib 에 붙여넣기
C:\Program Files\Apache Software Foundation\Tomcat 9.0\lib


-------------------------------------------------------------------------


프로젝트 시작

file 
  > new 
     > spring legacy project
	> 프로젝트명 작성 후 Refresh 클릭!! (템플릿 다운로드 됨)
            (2024년 이후 템플릿 설치가 필요) 

        구글 검색 sts https-content.xml  검색
        https://it-luvbit.com/entry/Spring-Install  블로그 참고
	탐색기에서 https-content.xml 파일을 
스프링 워크스페이스의  .metadata\.plugins\org.springsource.ide.eclipse.commons.content.core  에 붙여넣기


스프링 재시작
포르젝트 새로 만들기 하면 템플 다운됨 

파일명 작성 
MVC 선택
next 클릭
 > yes 클릭
 > 다시 mvc 선택 
 > next 클릭
    > project settings - Spring mvc project 열림
         > 도메인 주소를 거꾸로 com.jbedu.0000
            
에러 
<%@  이 부분 에러는 버그 
프로젝트 
  > 프로퍼티스 
     > project Facets   java 11 선택
     탭메뉴 > runtime > apache tomcat 9 선택
     apply

------------------------------
스프링 SPRING 프레임 워크


run 실행
controller의 value에서 요청 작명
value ="/"  <- 요청 작명

return "파일명"  <- views 안에 파일명

스프링에서는 jsp 파일 직접 실행해도 404가 뜬다
>> 파일의 위치를 찾아서 바로 실행하는 것을 스프링에서 막아둠 - 보안 문제
>> 컨트롤러에 실행을 매핑(등록)한다 (request 매핑)
>> 컨트롤러를 통한 실행만 가능하므로 프로젝트에서 run


-----------------------------------------------------------------------------------------------------
servlet-context.xml

실제 실행 할 파일의 정보를 저장해 둠
value="/WEB-INF/views/"  -> jsp 저장위치
value=".jsp"                    -> 파일확장자  

둘다 원하는 것으로 변경이 가능하다


<!-- Resolves views selected for rendering by @Controllers to .jsp resources in the /WEB-INF/views directory -->
	<beans:bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<beans:property name="prefix" value="/WEB-INF/views/" /> 
		<beans:property name="suffix" value=".jsp" />
	</beans:bean>




-----------------------------------------------------------------------------------------------------
1.컨트롤러에서 파일요청 만들기 (매핑)
2. jsp 파일 만들기 - 하이퍼링크
3. 확인 > 프로젝트 실행후 링크 실행  > 잘 나오면 ok
            에러의 경우 컨트롤러와 링크의 오타 여부 확인


1.컨트롤러에서 파일요청 만들기 (매핑) ---------------------------------------------
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {  
	
		return "index";  // jsp 파일명
	}
	

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {  
	
		return "hello";  // jsp 파일명
	}
	
	
	
//      RequestMapping -> 자동완성 사용
//      임포트
//      import org.springframework.web.bind.annotation.RequestMapping;
//      import org.springframework.web.bind.annotation.RequestMethod;
	
	
//	 public String hello(매개변수) {
//	 접근지정자  타입  밸류이름과 같음
//	}
}


jsp 파일 만들기 - 하이퍼링크 --------------------------------------------------------------------

하이퍼링크에 이름만 작성 -> 확장자 제외

	<a href="hello">hello 바로가기</a>     
	<!-- controller의 value = "/hello"
              return "hello"; --> 
	<br><br>
	<a href="team/rank">home 바로가기</a>
	<!-- controller의 value = "/"
	     return "index"; -->


--------------------------------------------------------------------------------------

스프링

 
@Controller // 서버가 제일 먼저 찾는 애 

프로젝트 폴더 설명 --------------------------------------------
src/main/java > 자바파일 실제 작업파일 폴더

src/test/java   > 자바 디비에서 잘 오나 테스트 할때 이용
        
 
Maven Dependencies ---   라이브러리  ------  중요
    스프링 라이브러리 있음 + jstl

Server

src 폴더  - 중요
   > main 
	> web-inf    -- 구조가 jsp랑 다름.
             > views   폴더에 jsp 작성.      --------중요


target - 건드릴 일 없음


jsp 파일 만드는 법 ---------------------------------
new 
	> other 
		> jsp 작성 next 클릭
			> 파일명 작성     

---------------------------------------------------------


xml 파일 보기
xml 파일 선택후  source 클릭 


--------------------------------------------------------

pom.xml   - 라이브러리 관련      --------중요

1. Dependencies 를 관리함
2.  파일내 스프링 버전 확인가능
    <org.springframework-version>3.1.1.RELEASE</org.springframework-version>

3. 디펜던시 태그 안에 있는 태그들이 디펜던시폴더 내용

4. 프로젝트 시작시 pom.xml 을 읽고 프로젝트에 쓰라고 되어있는 것

5. 추가시 형식 복사 후 작성하면 알아서 "라이브러리"를 다운로드 후 추가됨

-----------------------------------------------------------------------------------------
실행 방법 Run
프로젝트 >마우스 우클릭 run 에서 실행한다 

http://localhost:8888/test/    
test 는 프로젝트 패키지 명


컨트롤러 자바 파일에서  ------------------------------------------

@RequestMapping(value = "/", method = RequestMethod.GET)

return "home"  

위 2개가 중요 

value = "/"  ->   http://localhost:8888/"프로젝트_패키지명"/   

return "home" 를 실행시켜라는 뜻 ( home.jsp ) 



