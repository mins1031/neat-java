# neat-java
> Java 개념 및 원리 정리. 우연히 개발에 필요한 개념들을 잘 정리해 깃헙에 올려주신 분을 보아 정리해본다.

## 1. Java의 대표적 특징
 * OOP(객체지향 프로그래밍)이다.
 * '가비지 컬렉션'에 의해 메모리가 자동 관리 된다.
 * '멀티 쓰레드'를 지원한다.
 * JVM위에서 동작하기 때문에 특정 OS에 종속적이지 않고 이식성이 좋으며 보안성이 좋다.
## 2. OOP(객체지향 프로그램)
 * 예전 '순차적,비구조적 프로그래밍' 방식은 규모가 점점 커지면 goto문을 남발해 코드의 흐름 파악에 너무 많은 힘을 들이는 경우가 많았다. 
 * 그래서 탄생한 것이 '절차적,구조적 프로그래밍이다'
   * 반복될 가능성이 있는 것 들을 재사용이 가능한 함수로 만들어 사용하는 프로그래밍 방식이다.
   * 다만 너무 추상적인것이 단점이다. 예를 들어 회원에 해당 하는 필드를 구현해야 하는 경우 회원을 구현해야 하고 또 회원에 대한 다른 함수들을 따로 만들어 줘야하기에 코드가 더러워지고 비효율적으로 코딩할 가능성이 높아진다.
 * 따라서 위의 것들을 한번에 묶기 위한 패러다임이 바로 '객체지향 프로그래밍' OOP이다.
    * 특정 클래스마다 필요한 필드를 만들고 getter/setter 필요하다면 함수도 넣어서 함께 관리 할 수 있다
    * **객체 내부에 필드와 함수가 같이 존재하는 것**이 중요한 점이다.
    * 이제 회원의 필드와 함수를 따로따로가 아닌 하나의 개체에 묶어서 저정 가능해졌다.
  **이렇게 가능한 모든 물리적, 논리적 요소를 객체로 만들려는 것이 '객체지향 프로그래밍'이다** 
  * **객체지향 프로그램의 장점**
    1) 프로그램 코드의 재사용성이 높고 개발 속도가 향상 된다.
    2) 프로그램을 간결하고 보기 용이하게 만든다
    3) 프로그램의 개발과 유지보수를 간편하게 만든다.
    4) 직관적인 코드 분석을 가능하게 한다.
    5) 객체지향 프로그래밍의 경우 하나의 문제를 해결하기 위해 데이터를 모아 놓은 객체를 활용한 프로그래밍을 지향함으로 응집력을 강하게 하고 클래스간 독립적으로 설계함으로써 결합도를 약하게 할 수 있다.
## 3. OOP의 특징
> OOP가 생겨나면서 크게 4가지의 특징을 갖추게 되었다. 이 4가지 특성을 잘 이해하고 구현해야 객체를 통한 효율적인 구현이 가능해진다.
  ### 추상화
  
  > 필요로 하는 속성이나 행동을 추출하는 작업
  **추상적인 개념에 의존하여 설계해야 유연함을 갖출 수 있다.**
  **즉 세부적인 사물들의 공통적이 특징을 파악한 후 하나의 집합으로 만들어 내는 것이 추상화 이다.**
  
  '''
  ex.  k3,아반떼,테슬라 모델3 는 모두 '자동차'라는 공통 특징이 있다. 
  자동차 라는 추상화 집합을 만들어 두고 자동차들이 가진 공통적이 특징들을 구현해 활용하는것.
  만약 자동차에 쏘렌토 같은 다른 차가 추가 될 수 있기 때문에 자동차라는 추상화를 구현 해놓으면 다른 코드는 수정할 필요 없이 추   가로 구현할 부분을 구현하는 것이 객체지향스럽다. 
  '''
  
  **즉 개체가 아닌 개체의 역할에 집중해서 구현해야 하는 것이다!!**
  ### 캡슐화
  
  > 높은 응집력과 낮은 결합도를 유지할 수 있도록 설계하는것
  =>  **한 곳에서 변화가 일어나도 다른 곳에 미치는 영향을 최소화 시키는것**을 말한다.= 객체가 내부적으로 기능을 어떻게 구현하는지 감추는 것!
  결합도가 낮게 만들어야 하는 이유는 **결합도란 어떤 기능을 실행할때 다른 클래스나 모듈에 얼마나 의존적인가를 나타내는 말이다.**. 즉 독립적으로 만들어진 객체간의 의존도를 초대한 낮게 만드는 것이 중요하다. 객체간의 의존도가 높아지면 굳이 객체 지향으로 설계하는 의미가 없어진다.
  ==> 캡슐화는 높은 응집력과 낮은 결합도를 갖게 하는 것을 **정보은닉**을 활용한다. 외부에서 접근할 필요가 없는 것들은 private으로 접근하지 못하게 제한을 두는것이다.
  ### 상속
  
  > 일반화 관계 라고도 하며 여러 개체들이 지닌 공통된 특성을 부각시켜 하나의 개념이나 법칙으로 성립하는 과정.부모클래스의 필드나 메서드를 자식클래스가 물려받는 기능이다. 상속받은 자식클래스는 부모클래스의 필드와 메서드를 정의하지 않아도 사용할수 있다. 상속은 또 다른 '캡슐화' 이고 **자식 클래스를 외부로부터 은닉하는 캡슐화의 일종**이라고 말할 수 있다.
  
  * 추상화에서 예시를 '자동차'로 들었는데 추가로 운전자 클래스가 있다고 하고 자동차의 자식클래스인 k3,아반떼 등은 캡슐화로 은닉해둔 상태이다.
  * 운전자 클래스의 관점으로는 구체적 자동차의 종류가 숨겨져 있지만 자동차의 종류가 운전에 큰 영향을 끼치진 않는다
  * 새로운 자동차들이 추가되어도 운전자 클래스는 영향을 받지 않는것이 중요하다 그래서 캡슐화를 통해 운전자클래스입장에서 확인할 수 없도록 구현하는 것이다.
  * 이처럼, 상속관계에서는 단순히 하나의 클래스 안에서 속성 및 연산들의 캡슐화에 한정되지 않는다. 즉, 자식클래스 자체를 캡슐화 하여 운전자 클래스 같은 외부에 은닉하는 것으로 확장되는 것이다.
  * 이렇게 자식클래스를 캡슐화 해두면 외부에선 이런 클래스들에 영향을 받지 않고 개발을 이어갈 수 있는 장점이 있다.
  ### 상속 재사용의 단점
   상속을 통한 재사용을 할 때 나타나는 단점도 존재한다.
      1) 부모 클래스의 변경이 어려워진다
        > 부모 클래스에 의존하는 자식클래스가 많을 때 부모 클래스의 변경이 필요하게 되면 이를 의존하는 자식클래스 들이 영향을 받게 된다.
      2) 불필요한 클래스가 증가할 수 있다.
        > 유사기능 확장시 필요이상의 불필요한 클래스를 만들어야 하는 상황이 발생할 수 있다.
      3) 상속이 잘못 사용될 수 있다.
 **해결책?**
 => 객체 조립, 컴포지션이라고 부르기도 한다.
 객체 조림은 **필드에서 다른 객체를 참조하는 방식으로 구현 된다.** 
 상속에 비해 런타임 구조가 복잡하고 구현이 어려운 단점이존재하지만 변경시 유연함을 확보하는데 장점이 매우 크다
 따라서 같은 종류가 아닌 클래스를 상속하고 싶을 때는 객체 조립을 우선적으로 적용하는 것이 좋다.
 
 ### 다형성
 
 > 서로다른 클래스의 객체가 같은 메시지를 받았을 떄 각자의 방식으로 동작하는 능력

 * 객체지향의 핵심. 다형성은 상속과 함깨 활용할때 큰힘을 발휘한다. 코드를 간결하게 해주고, 유연함을 갖추게 해준다. 
 * 즉 **부모클래스의 메서드를 자식클래스가 오버라이딩 해서 자신의 역할에 맞게 활용하는 것이 다형성이다.**
 * 다형성을 사용하면 하나의 타입으로 다양한 실행결과를 얻을 수 있어 객체를 **부품화**해 유지보수를 용이하게 한다..

## 4. 객체 지향 설계 과정
  * 제공해야 할 기능을 찾고 세분화한다. 그리고 그 기능을 알맞은 객체에 할당한다.
  * 기능을 구현하는데 필요한 데이터를 객체에 추가한다.
  * 그 데이터를 이용하는 기능을 넣는다.
  * 기능은 최대한 캡술화하여 구현한다.
  * 객체간에 어떻게 메서드 요청을 주고받을지 결정한다.
 
## 객체지향 설계 원칙
SOLID라고 하는 5가지 설계 원칙이 존재한다
  ### SPR 단일 책임 원칙
   * 하나의 클래스는 하나의 책임만 가져야 한다
   * 하나의 책임이라는 것은 모호하다
     * 클 수도 있고, 작을 수도 있다
     * 문맥과 상황에 따라 다르다.
   * 중요한 기준은 변경이다. 변경이 있을때 파급 효과가 적으면 단일책임 원칙을 잘 따른것
   * 개인적으로 클래스뿐만
   * 아니라 메서드도 같은 선상에서 바라봐야 한다고 생각한다.
  ### OCP 개방-폐쇄 원칙
   * 소프트웨어 요소는 확장에는 열려 있으나 변경에는 닫혀 있어야 한다.
   * 다형성을 잘 활용해서 설계해야 한다.
   * 즉 기능을 변경하거나 확장할 수 있으면서 그 기능을 사용하는 코드는 수정하지 않아야 된다.
   * 다만 다형성을 사용해도 OCP를 웬만하면 지키기 힘들다. 그래서 별로 객체 생성, 연관관계 맺어주는 설정자(=Spring)이 필요하다
  ### LSP 리스코프 치환 원칙
   * 프로그램의 객체는 프로그램의 정확성을 꺠뜨리지 않으면서 하위 타입의 인스턴스로 바꿀수 있어야 한다.
   * 쉽게 말해서 자동차 인터페이스와 k3 구현체가 있다. 구현체의 엑셀기능은 앞으로 가라는 기능이다. 이 기능이 뒤로가게 할 수도 있지만 이것은 기존기능을 위배하는 기능이다.
   * 즉 인터페이스를 구현한 구현체를 믿고 사용하려면 이 원칙이 지켜져야 한다는 이야기 이다.
  ### ISP 인터페이스 분리 원칙
   * 특정 클라이언트를 위한 인터페이스 여러개가 범용 인터페이스 하나보다 낫다.
   * 자동차 인터페이스 -> 운전,정비 인터페이스로 분리
   * 사용자 클라이언트 -> 운전자,정비사 클라이언트로 분리
   * 이렇게 분리해 놓으면 정비사 클라이언트가 변해도 운전자 클라이언트에 영향을 주지 않는다(내용,기능이 변하지 않는다) 
   * 인터페이스가 명확해지고 대체 가능성이 높아진다.
  ### DIP 의존역전 원칙
   * 프로그래머는 추상화에 의존해야지 구체화에 의존하면 안된다. 의존성 주입은 이 원칙을 따르는 방법중 하나다.
   * 쉽게 클래스에 의존하지 말고 인터페이스에 의존하라는 뜻이다.
   * 위에서 이야기한 **역할에 의존하게 해야한다는 것과 같다**. 객체 세상도 클라이언트가 인터페이스에 의존해야 유연하게 구현체를 변경할 수 있다. 구현체에 의존하게 되면 변경이 아주 어려워 진다.
## 5. JVM (자바 가상 머신)
 JVM은 다른 프로그램을 실행시키는 것이 목적이다. 갖춘기능으로는 크게 2가지로 말할 수 있다
 1. 자바 프로그램이 어느기기나 운영체제에서도 실행될 수 있도록 하는것.
 2. 프로그램 메모리를 관리하고 최적화 하는것.
 **자바 어플리케이션을 클래스 로더를 통해 읽어 들이고 자바 API와 함꼐 실행하는 역할, 자바와 OS사이에서 중개자 역할을 수행하며 OS에 제한되지 않고 재사용을 가능하게 한다.**
 
 ### 5-1 자바 컴파일 과정
 > 자바는 OS에 독립적인 특징을 가지고 있다. 운영체제 위에서 메모리를 할당받아 동작하는 JVM 덕분인데 어떤 기능,어떤 원리로 이렇게 OS에 독립적일 수 일까?
 <img src = "https://camo.githubusercontent.com/af3d43865302485f944cbc6a7a7c3fcb27d3227320e5bf0b2cd8013d76507c07/687474703a2f2f7463707363686f6f6c2e636f6d2f6c656374757265732f696d675f6a6176615f70726f6772616d6d696e672e706e67" />
 
 <img src = "https://camo.githubusercontent.com/9ada78092a3d1fd3e81574ad2b48baf0db97baced4d4a3e0eca1b0d014152ae4/68747470733a2f2f74312e6461756d63646e2e6e65742f6366696c652f746973746f72792f393931443036344235414539393944353132" />
 
  #### 자바 컴파일 순서
   1) 자바 소스 코드(.java)를 작성.
   2) 자바 컴파일러가 자바 소스파일을 컴파일한다. 이때 컴파일후 결과 파일을 '자바 바이트 코드'(.class)파일로 아직 컴퓨터가 읽을수 없고 JVM이 읽을 수 있는 코드이다.
   3) 컴파일된 바이트 코드를 JVM의 '클래스로더'에게 전달한다.
   4) 클래스로더는 동적로딩을통해 필요한 클래스들을 로딩 및 링크하여 런타임 데이터 영역즉 JVM의 메모리에 올린다. 
   5) 실행엔진은 JVM메모리에 올라온 바이트 코드들은 명령어 단위로 하나씩 가져와서 실행한다. 이떄 실행엔진은 두가지방식으로 변경한다.
     * 인터프리터 : 바이트코드 명령어를 하나씩 읽어서 해석하고 실행한다. 하나하나의 실행은 빠르나 전체적인 실행 속도가 느리다는 단점이 있다
     * JIT 컴파일러 : 인터프리터의 단점을 보완하기 위해 도입된 방식으로 바이트 코드 전체를 컴파일하여 바이너리 코드로 변경하고 이후에는 해당 메서드를 더이상 인터프리팅 하지 않고 바이너리 코드로 직접 실행하는 방식, 바이트코드 전체가 컴파일된 바이너리 코드를 실행하는 것이기 때문에 전체적 실행속도는 인터프리팅 방식보다 빠르다.
 
 ### 5-2 JVM 실행과정
   1) 프로그램이 실행되면 JVM은 OS로부터 프로그램이 필요로하는 메모리를 할당 받고 이 메모리를 용도에 따라 여러 영역으로 나누어 관리함.
   2) 자바 컴파일러(JAVAC)가 자바 소스코드를 읽고 자바 바이트코드(.class)로 변환 시킴 
   3) 컴파일된 class파일들을 클래스 로더로 전달하고 클래스 로더가 JVM의 메모리 영역으로 로딩한다. + JVM은 런타임시에 처음으로 클래스를 참조할때 클래스를 로드하고 메모리 영역에 배치시키는데 이 동적로딩을 해주는것이 **클래스로더**이다.
   4) 로딩된 class파일들은 Execution engine을 통해 해석됨
   5) 해석된 바이트 코드는 메모리 영역에 배치되어 실질적인 수행이 이루어진다. 이러한 실행과정 속 JVM은 필요에 따라 스레드 동기화나 가비지 컬렉션 같은 메모리 관리 작업을 수행한다.
<img src = "https://camo.githubusercontent.com/ffc29b7d559030c287454c8d784d8d2f80e8e46cfe4d36069f27e749ee2cd76a/68747470733a2f2f692e696d6775722e636f6d2f5679314a4331622e706e67" />

 #### Runtime Data area 
 JVM이 운영체제 위에서 실행하면 할당 받는 메모리 영역이다. PC레지스터, JVM스택, 네이티브 메서드 스택,힙,메서드  영역 총 5가지 영역으로 나누어진다. 이 중 **힙과 메서드 영역은 모든 스레드가 공유해서 사용한다.**
  * PC 레지스터 : 스레드가 어떤 명령어로 실행되어야 할지 기록하는 부분(JVM 명령의 주소를 가진다.)
  * 스택 area : 지역변수 , 매개변수, 메서드 정보, 임시 데이터 등을 빠르게 생성되고 사라지는 내용들을 저장한다. 즉 기본타입의 데이터들과 stack영역에 생성된 객체들의 참조타입 데이터(주소값)들 역시 관리하고 있다.
    * 만약 foo() 메서드 내의 boo()메서드를 호출하고 boo()의 } 가 실행된경우 stack에 생성되었던 boo()메서드의 지역변수들은 모두 pop되어 stack에서 사라진다. 또한 stack 메모리는 Thread당 하나씩 생성되며 각 스레드에서 다른 스레드의 stack에 접근할수 없다.
    * 만약 heap영역에 생성된 객체의 경우 힙에 객체의 정보들이 있고 해당 객체를 사용시 객체의 참조값을 stack영역이 받아서 사용하게 되는 것이다
    * 또한 해당 스레드에서 사용하는 일반 원시타입의 데이터들도 stack에 올라오는데 원시타입의 경우 참조값이 아닌 실제 값을 직접 stack에 저장하게 된다.
  * 네이티브 메서드 스택 : 실제 실행할 수 있는 기계어로 작성된 프로그램을 실행시키는 영역, 주로 바이트코드로 넘어온게 아닌 기계어로 넘어온 내역들을 저장하고 실행시키는 영역. C/C++코드를 수행하기 위한 공간
  * 힙 : 런타임에 동적으로 할당되는 데이터가 저장되는 영역. 객체나 배열 생성이 여기에 해당한다. (또한 힙에 할당된 데이터들은 가비지 컬렉터의 대상이 된다. JVM성능 이슈에서 가장 많이 언급되는 공간이다.) new연산자로 생성되는 클래스를저장
  * 메서드 영역 : JVM이 시작될때 생성되고
    Class Loader가 적재한 클래스(또는 인터페이스)에 대한 메타데이터 정보가 저장된다. Non-Heap 영역으로 Permanent 영역에 저장된다. JVM 옵션 중 PermSize (Permanent Generation의 크기)를 지정할 때 고려해야 할 요소이다. Method Area는 아래의 정보들을 저장한다. 즉 어플리케이션으 실행될때 전역성이 있어야하는 내역들 예를들어 클래스,인터페이스, static, 
  1) Type Information
  - Interface 여부
  - 패키지 명을 포함한 Type 이름
  - Type의 접근 제어자
  - 연관된 Interface 리스트
  
  2) Runtime Constant Pool
  - Type, Field, Method로의 모든 레퍼런스를 저장
  - JVM은 Runtime Constant Pool을 통해 실제 메모리 상 주소를 찾아 참조한다.
  
  3) Field Information
  - Field의 타입
  - Field의 접근 제어자
  
  4) Method Information
  - Constructor를 포함한 모든 Method의 메타데이터를 저장
  - Method의 이름, 파라미터 수와 타입, 리턴 타입, 접근 제어자, 바이트 코드, 지역 변수 section의 크기 등을 저장

  5) Class Variable
  - static 키워드로 선언된 변수를 저장
  - 기본형이 아닌 static 변수의 실제 인스턴스는 Heap 메모리에 저장 -> static으로 생성되는 클래스역시 new로 치부되어 heap에 저장된다는 의미이다.
 <img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=http%3A%2F%2Fcfile21.uf.tistory.com%2Fimage%2F2308964B58C579C033A482"/>
  + 메모리 상수풀 영역 : 힙 영역에서 생성되고 자바 프로세스 종료까지 계속 유지된는 메모리 영역. 기본적으로 JVM에서 관리하고 각 클래스, 인터페이스 상수, 메서드 필드와 모든 레퍼런스가 담겨있디. 런타임 상수 풀의 역할은 이미 있는 메소드나 필드의 참조를 통해 중복을 막음.

#### 가비지 컬렉션
 * 자바 이전에는 프로그래머가 모든 프로그램 메모리를 관리했다. 하지만 자바에서는 JVM이 프로그램 메모리를 관리한다.
 * JVM은 가비지 컬렉션이라는 프로세스를 통해 메모리를 관리한다. 가비지 컬렉션은 자바 프로그램에서 사용되지 않는 메모리를 지속적으로 찾아 제거하는 역할을 한다.
 * 실행순서 : 참조되지 않은 객체들을 탐색후 삭제 -> 삭제된 객체의 메모리를 반환 -> 힙 메모리 재사용
 ```
 예를 들어
 Member member = new Member();
 member.setName("min")
 member = null
 
 //가비지 발생
 member = new Member();
 member.setName("min Y")
 ```
 위의 코드에서도 볼수 있듯이 기존 min으로 생성된 member객체는 더이상 참조를 받지 않고 사용되지 않아 '가비지'가 되었다. java에선 이런 메모리 누수를 방지하기 위해 '가비지 컬렉터'가 주기적으로 검사해 메모리를 청소해준다
 
 1) Minor Gc와 Major GC
   * jvm의 heap영역은 처음 설계될때 다음 2가지를 전제로 설계 되었다
     * 대부분의 객체는 금방 접근 불가능한 상태(Unreachable)가 된다
     * 오래된 객체에서 새로운 객체로의 참조는 아주 적게 존재한다.
   * 즉 `객체는 대부분 일회성이며 메모리에 오랫동안 남아있는 경우는 드물다`라는 것이다. 그렇기에 객체의 생존기간에 따라 물리적인 heap영역을 Young, Old 총 2가지 영역으로 나누게 되었다. 
 <img src="https://donghyeon.dev/img/gc/JVMMemory.png"/>
 
   * Young 영역 (Young Generation)
     * 새롭게 생성되 객체가 할당 되는 영역
     * 대부분의 객체가 금방 Unreachable 상태가 되기 때문에 많은 객체가 Young 영역에 생성되었다가 사라진다
     * Young영역에 대한 가비지 컬렉션을 Minor Gc라고 부른다
   * Old 영역 (Old Generation)
     * Young 영역에서 Reachable 상태를 유지하여 살아남은 객체가 복사되는 영역
     * 복사되는 과정에서 대부분 Young영역보다 크게 할당되며 크기가 큰만큼 가비지는 적게 발생
     * Old 영역에 대한 가비지 컬렉션을 Major Gc or Full GC라고 부른다. 
    <img src ="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fva8qQ%2FbtqUSpSocbS%2FkxTvtnmrdhf4bnVPXth0UK%2Fimg.png"/>

   * 그런데 예외적 상황으로 old영역에 있는 객체가 Young 영역의 객체를 참조하는 경우도 존재할 것이다. 이러한 경우를 대비해 Old영역에는 512 bytes덩어리로 되어있는 카드 테이블이 존재한다
   * 카드 테이블에는 Old 영역에 있는 객체가 Young영역의 객체를 참조할 떄 마다 그에 대한 정보가 표기 된다.
   * 그래서 Young 영역에서 가비지 컬렉션이 실행될때 모든 Old 영역에 존재하는 객체를 검사하여 참조되지 않는 Young 영역의 객체를 식별하는 것이 `비효율`적이기 때문이다. 
   * 그렇기에 Young 영역에서 가비지 컬렉션이 진행될때 **카드 테이블만 조회하여 GC의 대상인지 식별** 할 수 있도록 하고 있다.
  
  2) 가비지 컬렉션의 동작 방식
  > Young 영역과 Old 영역은 서로 다른 메모리 구조로 되어있기 때문에 세부적인 동작 방식은 다르다. 하지만 기본적으로 가비지 컬렉션이 실행된다고 하면 다음의 2가지 공통적인 단계를 따르게 된다
  <img src="https://donghyeon.dev/img/gc/JVMMemory.png"/>
  
  1) Stop The World
  * Stop The World는 가비지 컬랙션을 실행하기 위해 `JVM이 어플리케이션의 실행을 멈추는 작업`이다 GC가 실행될때는 `GC를 실행하는 쓰레드를 제외한 모든 쓰레드들의 작업이 중단`되고 Gc가 완료되면 작업이 재개 된다. 
  * 보통 GC의 성능 개선을 위해 튜닝한다고 하면 보통 Stop The World의 시간을 줄이는 작업을 말하는 것이다.
  2) Mark and Sweep  
  * Mark : 사용되는 메모리와 사용되지 않는 메모리를 식별하는 작업
  * Sweep : Mark 단계에서 사용되지 않는것으로 식별된 메모리를 해제하는 작업 
  * Stop The World를 통해 모든 작업을 중단시키면 GC는 스택의 모든 변수 또는 Reachable객체를 스캔하면서 각각이 어떤 객체를 참조하고 있는지 탐색하게 된다.
  * 그리고 `사용되고 있는 메모리를 식별`하는데 이런 과정을 Mark라고 한다
  * 이후에 Mark가 되지 않은 객체들을 메모리에서 제거하는데 이 과정을 Sweep이라고 한다.  
   
  3) Minor GC의 동작 방식
  > Minor GC를 정확히 이해하기 위해선 Young 영역의 구조에 대해 이해를 해야한다. Young 영역은 1개의 Eden 영역과 2개의 Survivor 영역, 총 3가지로 나뉜다.
  * Eden 영역 : 새로 생성된 객체가 할당되는 영역 
  * Survivor 영역 : 최소 1번의 GC 이상 살아남은 객체가 존재하는 영역
    1) 객체가 새롭게 생성되면 Young 영역 중에서도 Eden 영역에 할당 된다
    2) Eden 영역이 꽉차면 Minor GC가 발생하는데 사용되지 않는 메모리는 해제되고 Eden영역에 존재하는 객체는 Survivor 영역으로 옮겨지게 된다.
    3) Survivor 영역은 총 2개 지만 반드시 1개의 영역에만 데이터가 존재해야한다
      동작 순서를 조금더 자세하게 보자면
      1) 새로 생성된 객체가 Eden 영역에 할당
      2) 객체가 계속 생성되어 Eden영역이 꽉차 Minor GC가 실행
        1) Eden 영역에서 사용되지 않는 객체의 메모리가 해제된다
        2) Eden 영역에서 살아남은 객체는 1개의 Survivor 영역으로 이동된다.
      3) 1~2 의 과정이 반복되다 Survivor 영역이 가득차게 되면 Survivor 영역의 살아남은 객체를 다른 Survivor 영역으로 이동시킨다(1개의 Survivor 영역은 반드시 빈상태가 된다)
      4) 이러한 과정을 반복하여 계속해서 살아남은 객체는 Old영역으로 이동된다
        * 객체의 생존 횟수를 카운트하기위해 Minor GC에서 객체가 살아남은 횟수를 의미하는 age를 Object Header에 기록한다.
        * 그리고 Minor GC 때 Object Header에 기록된 age를 보고 Old 영역으로 이동여부를 결정한다.
        * 또한 Survivor 영역중 1개는 반드시 사용이 되어야 한다. 만약 두 Survivor 영역에 모두 데이터가 존재하거나 모두 사용량이 0이면 시스템에 문제가 있다는것이다.
   * 추가적으로 Eden영역에 할당시 싱글 스레드는 상관 없지만 멀티스레드의 경우 메모리 겹침 문제가 발생할 수 있어 Eden영역에 할당할때 락을 걸어 동기화를 해주어야 하지만 동기화는 어플리케이션의 속도저하를 야기하기 때문에 `각 쓰레드 마다 객체를 할당하기 위한 일정 크기의 Eden영역 주소를 부여함으로서 동기화 작업 없이 빠르게 메모리를 할당하도로고 하는 기술`을 사용한다고 한다.   

  4) Major GC(FULL GC)의 방식
  * Young 영역에서 오래 살아남은 객체는 Old 영역으로 이동된다.
  * 그리고 Major GC는 `객체들이 계속 이동되어 Old영역의 메모리가 부족해지면` 발생하게 된다
  * Young 영역은 Old 영역보다 크기가 작기 때문에 GC가 보통 0.5~1초 사이에 끝나서 어플리케이션에 크게 영향을 주지 않는다. 
  * 하지만 Old영역은 Young 영역보다 크며 Young 영역을 참조할 수도 있다. 그렇기 때문에 Major GC는 일반적ㅇ로 Minor GC 보다 시간이 오래걸리며 10배 이상의 시간을 사용한다.
 
  5) 다양한 가비지 컬렉션 알고리즘
  > JVM이 메모리를 자동으로 관리해주는 것은 개발자의 입장에선 좋은 메리트지만 문제는 GC를 수행하기 위해 Stop The World에 의해 어플리케이션이 중지되는 것이다. 힙의 사이즈가 커지면서 지연 현상이 두드러지게 되었고 이를 막기위해 다양한 GC 알고리즘을 지원하고 있다
    
   1) Serial GC 
     * Serial GC의 Young 영역은 앞서 Mark Sweep 대로 수행되고 Old 영역에서는 `Mark Sweep Compact 알고리즘`이 사용 되는데 Compact는 힙 영역을 정리하기 위한 단계이다
     * 유효한 객체들이 연속되게 쌓이도록 합의 가장 앞부분부터 채워 객체가 존재하는 부분과 객체가 존재하지 않는 부분으로 나누는 것이다.
     * Serial GC는 서버의 CPU코어가 1개일때 사용하기 위해 개발되었으며 가비지 컬렉션을 위한 쓰레드도 1개만 사용하기 때문에 CPU의 코어가 여러개인 서버에선 사용하면 안된다.
   2) Parallel GC
     * Parallel GC의 기본적인 처리과정은 Serial GC와 동일하다
     * 하지만 Parallel GC는 `여러개의 쓰레드를 통해 Parallel하게 GC를 수행함`으로써 GC의 오버헤드를 상당히 줄여준다
      * Parallel GC는 멀티프로세서 or 멀티 쓰레드 머신에서 중간~대규모 데이터를 처리하는 애플리케이션을 위해 고안 되었으며 옵션을 통해 GC를 수행할 쓰레드의 갯수등을 설정할 수 있다.
      * Parallel GC가 오버헤드를 상당히 줄여주었음에도 어플리케이션의 지연형상을 피할 수 없었고 개선을 위해 다른 알고리즘이 나오게 되었다
    3) CMS GC
      * CMS GC는 Parallel GC와 마찬가지로 여러개의 쓰레드를 이용한다.
      * 다만 기존 알고리즘과는 다르게 Mark Sweep알고리즘을 Concurrent하게 수행한다고 한다
      * 어플리케이션이 구동중일때 `프로세스의 자원을 공유받아` 이용하기 때문에 응답시간이 느려질순 있지만 멈추지는 않는다
      * 다만 Compaction 단계가 수행되지 않아 장기적으로는 조각난 부스러기 메모리가 많아지고 Compaction단계가 수행되면 오히려 Stop The World 시간이 길어지는 문제가 발생할 수 있다
      * 현재 java14부터 사용중지되었다.
    4) G1 GC
    <img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FdHxPiT%2FbtqU0xWGaDI%2FwriFcFKPHND5pTAsyn47X1%2Fimg.png"/>
      * G1 GC는 장기적으로 많은 문제를 야기할 수 있는 CMS GC를 대체하기 위해 개발되었고 java7부터 도입되었다.
      * 기존의 GC 알고리즈에선 힙영역을 물리적으로 Young 영역(Eden, Survivor영역 2개)과 Old영역으로 나누어 사용하였다.
      * G1 Gc는 Eden 영역에 할당하고 Survivor로 카피하는 등의 과정을 사용하지만 물리적으로 메모리 공간을 나누지는 않는다. 대신 Region이라는 개념을 새로 도입해 힙을 균등하게 여러개의 지역으로 나누고 각 지역을 역할과 함께 논리적으로 구분하여 객체를 할당한다.
      * 핵심은 **Heap을 동일한 크기의 Region으로 나누고, 가비지가 많은 Region에 대해 우선적으로 GC를 수행하는 것이다.** 그리고 G1 GC도 다른 가비지 컬렉션과 마찬가지로 2가지 GC(Minor, Major GC)로 나누어 수행된다.
        * Minor GC : 한 지역에 객체를 할당하다가 해당 지역이 꽉 차면 다른 지역에 객체를 할당하고, Minor GC가 실행된다. G1 GC는 각 지역을 추적하고 있기 때문에, 가비지가 가장 많은(Garbage First) 지역을 찾아서 Mark and Sweep를 수행한다.
	* Major GC(Full GC) : 시스템이 계속 운영되다가 객체가 너무 많아 빠르게 메모리를 회수 할 수 없을 때 Major GC(Full GC)가 실행된다. 그리고 여기서 G1 GC와 다른 GC의 차이점이 보인다.기존의 다른 GC 알고리즘은 모든 Heap의 영역에서 GC가 수행되었으며, 그에 따라 처리 시간이 상당히 오래 걸렸다. 하지만 G1 GC는 어느 영역에 가비지가 많은지를 알고 있기 때문에 GC를 수행할 지역을 조합하여 해당 지역에 대해서만 GC를 수행한다. 그리고 이러한 작업은 Concurrent하게 수행되기 때문에 애플리케이션의 지연도 최소화할 수 있는 것이다.
      * 이러한 구조의 G1 GC는 당연히 앞의 어떠한 GC 방식보다 처리 속도가 빠르며 큰 메모리 공간에서 멀티 프로레스 기반으로 운영되는 애플리케이션을 위해 고안되었다. 또한 G1 GC는 다른 GC 방식의 처리속도를 능가하기 때문에 Java9부터 기본 가비지 컬렉터(Default Garbage Collector)로 사용되게 되었다.

 
## 6. 자바 기본
  ### 참조와 참조 변수(항상 햇갈려하던 부분 정리)
  * 생활코딩 참조와 gyubgyub님 블로그 참고
  ```
  int a = 1;
  int b = a;
  System.out.print(a);
  ```
  위의 값은 1이 나와야한다. a의 값이 b에 **'복제'** 되기 때문이다. 참고로 자바에서 **기본자료형을 제외한 모든데이터 타입은 참조 자료형이라고 명명한다.** 기본자료형은 '복제'되지만 참조 자료형은 '참조'된다. new 를 이용해 객체를 만드는 모든 타입이 참조 자료형이라고 보아도 무방(String 제외)
 <img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FOY6Qz%2Fbtq0UcfI7Kj%2FHnGwk2yFJosYuYN0xYRKX0%2Fimg.png"/>
 
 그렇다면 객체는? 
```
 class A {
	public int myId;
    
    A(int myId) {
    	this.myId = myId;
    }
 }


  A a = new A(4);
  A b = a;
  b.myId = 5;

  int d = 5;
  System.out.println(a.myId)
```
 위의 출력값은 5가 나온다
 <img src = "https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FcObBUA%2Fbtq0SkZUo0y%2FdpT32AtY8HtTlHKVDNE1z1%2Fimg.png" />
 즉, a(참조변수)는 new 생성자로 만들어진 클래스 A의 인스턴스가 있는 주소값을 갖게 된다.
 **이것을 '참조'라고 하고 위의 주소값을 참조값이라고 한다.**
 그래서 b에 a를 할당하게 되면 a가 참조한 A클래스를 b역시 참조하게 되는 형태이고 b.myId(5)를 하게 되면 a,b모두 참조한 A클래스의 myId가 바뀌게 된다.
 **여기서 주소값은 메모리의 주소를 말하는것이 아니다. 자바의 기본타입은 JVM의 stack영역에 직접 값을 갖고 있고 참조타입은 heap영역에 생성되 인스턴스의 주소값을 stack영역에서 가지고 있게 된다. 그래서 위에서 말한 주소값은 'heap영역에 생성된 A인스턴스의 주소값이다.'**
 
  ### static
  * static을 왜 사용할까? 
  => static은 고정. 즉 변하지 않는값을 정의할때 사용한다(ex 성씨, 카드의크기등). JVM의 메서드 영역에 클래스 로드시 함꼐 정의 되 한번만 올라가기 때문에 메모리 절약에도 좋다.
  * 인스턴스변수 vs 클래스(static)변수 : 의미 그대로 인스턴스 변수는 클래스를 인스턴스화 시킬시 메모리에 올라가는 변수들을 말하고 클래스 변수는 클래스가 올라갈때 함께 올라가 정의되는 static변수 들을 일컫는다
  ex) 
  ``` 포커카드를 예시로 적용
  class Card{
    private int cardNum;  //카드 숫자 - 고정값 x. 인스턴스변수
    private String cardShape; //카드의 모양(다이아, 클로버등) 고정값 x. 인스턴스변수
    private static int width = 100; //카드의 폭 - 고정값 o. 클래스변수
    private static int height = 250; //카드 높이 - 고정값 o. 클래스변수
  }
  ```
  * static이 붙은 메서드에서는 인스턴스 변수를 사용할 수 없다
    > static이 붙은 메서드에서 인스턴스 변수를 사용할 경우 인스턴스변수가 아직 생성이 안되 JVM메모리에 올라와있지 않은 경우가 있기 떄문에 애초에 사용할수 없는 경우를 상정해 static메서드에서 인스턴스 변수사용을 허용하지 않고 있다. 다만 반대의 경우 원활히 사용가능.
  * 메서드 내에서 인스턴스 변수를 사용하지 않는다면, static붙이는 것이 좋다.
  > 메서드 작업 내용중 인스턴스 변수를 필요로 한다면 static을 붙일 수 없다. 반대로 인스턴스 변수를 사용하지 않는다면 static붙이는 것이 좋다. 메서드 호출시간이 짧아지고 메모리에 한번만 적재하기에 효율적이다.
  ===> 다만 static은 객체지향적이기 보단 절차지향적인 느낌이 강하다... 또한 메모리에 한번만 올라가는 점은 효율적이지만 프로그램 종료시까지 메모리에 살아있기 때문에 다른문제를 야기할 수도 있다. 결론: static은 자주사용되는곳의 클래스변수로 할만한 곳에 선언하자.아니면 싱글톤을 활용하는것도 훌륭한 대안이 될 수 있다.

## ==,equals,instanceOf
* 자바에서 == 은 기본타입인 int,double,char등에서는 '값'이 같은가를 비교하고 객체(참조타입)의 경우 주소값이 같은가를 비교하게 된다
* equals의 경우도 기본적으로 내부 로직은 == 비교를 하고 있도록 구현되어있지만 클래스를 구현시 해당 클래스에 맞게 오버라이딩 하고 String의 경우 equals를 값이 동일하면 true를 리턴하도록 오버라이딩 해놓았기 때문에 '문자열 값'자체를 비교하게 된다. 객체 비교의 경우 비교하는 Object의 equals는 같은 주소값의 객체만 true이기 때문에 비교 객체 내에 equals를 오버라이딩 해줘야 객체의 '값'을 비교할수 있다고 하며 IDE에서 제공하는 equals를 사용하는것도 괜찮은 방법이라고한다.
```
String a = new String("a");
String b = new String("b");
String c = new String("a");
System.out.println(a.equals(b)); // a와 b는 내용이 다르기 때문에 false
System.out.println(a == b); // a와 b는 각자 다른 String 객체기 때문에 false
System.out.println(a.equals(c));// a와 b는 서로 내용이 같기 때문에 true
```
## Collections
> 자바에서 배열은 연관된 데이터를 관리하기 위한 수단이었다. 하지만 배열은 불편한점이 몇가지 있는데 그중 하나가 한번 정해진 배열의 크기를 변경할 수 없다는 점이다. 컬렉션즈 프레임워크를 사용하면 이런 불편함이 줄어든다.
 ### 컬렉션즈 프레임워크
> 컬렉션즈 프레임워크는 컨테이너라고도 부른다. 즉 값을 담는 그릇이다는 의미이다. 그런데 그 값의 성격에 따라 컨테이너의 성격이 조금씩 달라진다. 자바에서는 다양한 상황에서 사용할 수 있는 다양한 컨테이너를 제공하는데 이것을 컬렉션즈 프래임워크 라고 부른다.
<img src ="https://s3.ap-northeast-2.amazonaws.com/opentutorials-user-file/module/516/2154.png"/>
* 위그림은 컬렉션즈 프래임워크의 구성을 보여준다 .Collection과 Map이라는 최상위 카테고리가 있고, 그 아래 다양한 컬렉션(=컨테이너)가 존재한다.
<img src = "https://s3.ap-northeast-2.amazonaws.com/opentutorials-user-file/module/516/2160.png" />
* List, Set , Queue는 모두 인터페이스 이다. ArrayList,vector,LinkedList모두 List인터페이스를 구현하기 때문에 공통의 조작 방법을 가지고 있는것이다.

```
ArrayList<String> al = new ArrayList<String>();
        al.add("one");
        al.add("two");
        al.add("two");
        al.add("three");
        al.add("three");
        al.add("five");
        System.out.println("array");
        Iterator ai = al.iterator();
        while(ai.hasNext()){
            System.out.println(ai.next());
        }
	
HashSet<String> hs = new HashSet<String>();
        hs.add("one");
        hs.add("two");
        hs.add("two");
        hs.add("three");
        hs.add("three");
        hs.add("five");
        Iterator hi = hs.iterator();
        System.out.println("\nhashset");
        while(hi.hasNext()){
            System.out.println(hi.next());
        }
=> 코드의 결과
array
one
two
two
three
three
five
 
hashset
two
five
one
three
```
> 메서드 iterator는 인터페이스 Collection에 정의 되어있어 Collection을 구현하고 있는 모든 컬렉션즈 프레임 워크는 이 메서드를 구현하고 있음을 보증한다. iterato의 호출 결과는 인터페이스 iterator를 구현한 객체를 리턴한다. 인터페이스 iterator는 아래 hasNext(뒤에 반복할 데이터가 있으면 true, 없으면 false 리턴)와 next(hasNext가  true라는건 next가 리턴할 데이터가 존재한다는 의미. 결국 다음 데이터 출력이다.)를 가지고 있고 이 기능을 사용하면 for문 처럼 데이터를 순차접근 가능.
* 위 결과처럼 Set은 중복을 허용하지 않고 순서가 없지만 List는 중복을 허용하고 순서가 유지된다는 것을 알 수 있다.
 ### Set
 > Set은 우리말로 집합이라는 뜻이다. 집합은 순서가 없고 중복되지 않는 특성이있다.마찬가지로 set에서도 교집합,차집합, 합집합과 같은 연산을 할 수 있다.
 ```
 //집합 h1,h2,h3가 있고 h1 = 1,2,3  h2 = 3,4,5  h3 = 1,2로 구성되어있다.
 public static void main(String[] args) {
        HashSet<Integer> A = new HashSet<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);
         
        HashSet<Integer> B = new HashSet<Integer>();
        B.add(3);
        B.add(4);
        B.add(5);
         
        HashSet<Integer> C = new HashSet<Integer>();
        C.add(1);
        C.add(2);
         
        System.out.println(A.containsAll(B)); // false
        System.out.println(A.containsAll(C)); // true
         
        //A.addAll(B);
        //A.retainAll(B);
        //A.removeAll(B);
         
        Iterator hi = A.iterator();
        while(hi.hasNext()){
            System.out.println(hi.next());
        }
    }
 ```
  #### 부분집합
  ```
  System.out.println(A.contailsAll(B));
  System.out.println(A.contailsAll(C));
  ```
  <img src="https://s3.ap-northeast-2.amazonaws.com/opentutorials-user-file/module/516/2155.png"/>
  
  #### 합집합
  ```
  A.addAll(B);
  ```
  <img src="https://s3.ap-northeast-2.amazonaws.com/opentutorials-user-file/module/516/2156.png"/>
  
  #### 교집합
  ```
  A.retainAll(B);
  ```
  <img src="https://s3.ap-northeast-2.amazonaws.com/opentutorials-user-file/module/516/2157.png"/>
  
  #### 차집합
  ```
  A.removeAll(B);
  ```
  <img src="https://s3.ap-northeast-2.amazonaws.com/opentutorials-user-file/module/516/2158.png"/>
  
  #### HashSet
  > HashSet클래스는 해시 알고리즘을 사용하여 **검색속도가 매우 빠르다**. 내부적으로 HashMap인스턴스를 이용하여 요소를 저장한다.
  * Set인터페이스를 구현하기에 **요소를 순서에 상관없이 저장하고 중복된 값을 저장하지 못한다**.
  * 중복된 값을 add()하게 되면 false를 반환한다. 이떄 내부적으로는 1) 해당 요소에서 hashCode()메서드를 호출해 반환된 해시값으로 검색할 범위를 결정, 2) 해당 범위내의 요소들을 equals()로 비교. => 따라서 hashCode()와 equals()를 상황에 맞게 오버라이딩 해야한다.
  * 해시코드와 equals로 이중으로 검사하는 이유는 
    1) 우선 hashCode()가 빠르기 때문에 객체의 동일여부를 빠르게 판단할 수 있다
    2) 또한 해시코드는 둘의 해시코드가 다르면 무조건 다른 객체지만 같다고해서 무조건 같은 객체는 아니기 떄문에 equals로 한번더 검증해준다.
    => 해시코드를 '이름'이라고 생각하면 이름이 다르면 다른사람이지만 동명이인도 있기 때문에 이경우 얼굴로 비교를해주는 것을 생각해보면 된다. 
  ```
  예제로 작성하던 Point(좌표) 클래스의 hashCode,equals
  @Override
    public boolean equals(Object o) {
        if (o instanceof Point){
            Point p = (Point) o;
            return this.x == p.getX() && this.y == p.getY();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
  ```
 ### Map
 > Map 인터페이스는 Collection 인터페이스와는 다른 저장방식을 가진다. Map 인터페이스를 구현한 Map컬렉션 클래스들을 키와 값을 하나의 쌍으로 저장하는방식인 key-value 방식을 사용한다.
 * Map인터페이스를 구현한 Map컬렉션 클래스들은 다음과 같은 특징을 가진다
   1) 요소의 저장순서를 유지하지 않는다.
   2) 키는 중복을 허용하지 않지만, 값의 중복은 가능.
   3) 대표적인 Map컬렉션클래스에 속하는 클래스는
     1) HashMap<K,V>
     2) HashTable<K,V> : 자바의 버전호환성을 위해 남아있고 HashMap사용 권장.
     3) TreeMap<K,V> : 이진검색 트리의 형태로 저장한다. 추가,삭제등의 기본동작속도가 매우 빠르다.
 
  #### HashMap <K,V>클래스
  > Map 컬렉션 클래스에서 가장 많이 사용되는 클래스이고 역시 해시 알고리즘을 사용해 검색 속도가 매우 빠르다. HashMap의 경우 HashSet과 다르게 이미 값의 식별자가 존재하기에 동일여부를 판단하기 위한 추가 작업이 필요하지 않다.
  ```
  public static void main(String[] args) {
        Map<String, String> dic = new HashMap<>();

        dic.put("baby","아기");
        dic.put("love","사랑");
        dic.put("apple","사과");

        //모든 엔트리 꺼내기 1
        Set<String> ketSet = dic.keySet();
        for (String key : ketSet){
            String value = dic.get(key);
            System.out.println("key:"+key+ ", value:"+value);
        }
        System.out.println("=====================================");

        //모든 엔트리 꺼내기 2
        Set<Map.Entry<String,String>> entrySet = dic.entrySet();
        for (Map.Entry<String ,String> map : entrySet){
            System.out.println("key:"+map.getKey()+ ", value:"+map.getValue());
        }
    }
=> key:love, value:사랑
key:apple, value:사과
key:baby, value:아기
=====================================
key:love, value:사랑
key:apple, value:사과
key:baby, value:아기
  ```
  이러하게 저장되고 출력해준다.
### List

> 기존의 배열은 데이터를 담는데 유용했지만 배열의 초기 길이를 지정해줘야하며 생성된 배열의 길이는 동적으로 변경할 수 없다는 점 때문에 특정한 상황에 사용되어야 했다.이러한 배열의 단점을 개선하기 위해 나온것이 List인터페이스이다.
> List인터페이스를 구현한 모든 List컬렉션 클래스는 다음과 같은 특징을 가진다. 
  1) 요소의 저장순서가 유지 된다.
  2) 같은 요소의 중복저장을 허용한다.
* 대표적 List컬렉션 클래스에 속하는 클래스는 다음과 같다.
  1) ArrayList
  2) LinkedList
  3) Vector
  4) Stack
 
  #### Vector
  * 처음 List 인터페이스의 구현체는 vector이다. 
  * 하지만 Vector역시 디폴트 용량이 10개로 정해져있어 리스트의 갯수가 10이상이 되면 두배씩 늘려나가는 전략을 사용했다
  * 현재는 다수의 Thread에 대한 접근에 동기화를 보장하는 등 성능 이슈로 인해 java1.2이후 부터는 호환성을 위해 제공하는 정도이며 List인터페이스를 구현한 리스트로 대체되어졌다.
  #### ArrayList
  > ArrayList는 내부적으로 데이터를 '배열'에서 관리하며 데이터의 추가, 삭제를 위해 임시배열을 생성해 추가,삭제시 데이터를 복사하는 방법을 사용하고 있다. 대량의 자료를 추가,삭제하는 경우엔 그만큼 데이터 복제가 많이 일어나게되어 성능 저하를 일으킬수 있다. 반면 각 데이터는 인덱스를 가지고 있기 때문에 한번에 참조가 가능해 데이터의 검색에는 유리한 구현체이다.
  * ArrayList에는 생성자가 3개 있다. 
  * 1) 기본 디폴트생성자 : 이렇게 생성하면 배열의 크기가 10으로 지정되어 생성된다. 
  *  2) 매개변수로 최대용량값을 받아주는 생성자 : 이렇게 되면 처음에 최대용량의 크기로 배열이 생성된다. 생성할때 쉽지 않겠지만 대략적으로 최대 용량을 생각해 생성해주면 배열의 복사빈도를 줄일수 있어 더 효율적일 수도 있을 것 같다는 생각이 든다
  *  3) Collection타입을 매개변수로 하는 생성자 : 이것 같은 경우... 다른 List의 복사본을 만들때 사용하는 것 같다.
  <img src="https://lh5.googleusercontent.com/7pSzmL9zBHuRuDAbWV6NjmYEx2otpkTVCA5aStNUESja4KAhPCllb8Dc277BRSaLEmy4Q-y1GS2X5WwLtylnxWo3q4CkcJRo4DA9PEesAX04HEZmaL9pOIqvlyQ8fWakBg" />
  
  #### LinkedList
  > LinkedList는 데이터를 저장하는 각 노드가 해당 노드의 데이터,이전 노드와 다음노드의 상태만 알고 있다. ArrayList와 같이 데이터의 추가,삭제시 불필요한 데이터 복사가 일어나지 않기 때문에 추가,삭제 기능시 유리한 반면 검색시에는 처음노드부터 리스트를 순회해야 하기 때문에 검색기능에선 성능 저하가 있을 수 있다. 
  
 <img src="http://tcpschool.com/lectures/img_java_doubly_linked_list.png"/>
 
 #### ArrayList(A) vs LinkedList(L)
 * 순차적으로 추가,삭제하는 경우 A가 L보다 빠르다.
 * 중간 데이터를 추가,삭제하는 경우 L가 A보다 빠르다
 * 결론적으로는 서술된 내용처럼 A는 일반적으로 검색시 빠르고 추가,삭제는 L보다 대체적으로 느리고 L은 검색시엔 A보다 느리지만 일반적으로 추가,삭제시는 빠르다. 
 
## Thread
> 집에 사람이 한명 살고 일을 한다. 집은 화장실,부엌, 침실등 한사람이 살기 완벽한 환경을 제공. 그런데 일을 더 하기위해 사람을 열명 늘리고 집을 열채 늘린다면? -> 비효율적임...  집 한채로 열명을 커버하면 통신도 쉽고 훨씬 적은 공간으로, 적은 자원을 소모하며 많은 일을 할 수 있다.(악덕..?)  이렇게 한집에 한명이 사는건 싱글 스레드, 한집에 열명이 있는건 멀티 스레드이다.

  * 프로세스
    * 프로세스는 자신만의 메모리 공간을 포함한 완벽한 자신만의 실행 환경을 갖고 있다.
    * 프로세스는 프로그램이나 애플리케이션과 비슷한 말 같지만 한개의 어플리케이션이 여러 개의 프로세스로 이루어질수 있다
    * 대부분의 OS는 파이프나, 소켓 같은 내부 프로세스 통신을 지원한다.
    * 대부분의 JVM은 싱글 프로세스로 동작한다.
  * 스레드
    * 스레드는 경량 프로세스로 불리기도한다
    * 프로세스와 스레드는 모두 실행환경을 제공하지만 스레드를 만드는 것이 프로세스를 만드는 것보다 더 적은 자원을 필요로 한다
    * 스레드들은 프로세스 안에 존재하고 모든 프로세스들은 적어도 하나의 스레드를 가지고 있다. 스레드들은 메모리나 파일같은 프로세스의 자원을 공유한다. 이것은 효율적이지만 잠재적으로 스레드들간의 통신문제를 야기한다. -> 두사람이 동시에 화장실을 사용하는 경우...?
    * 모든 자바 어플리케이션은 Main 스레드라는 한 스레드에서 시작한다. main스레드는 추가적인 스레드들을 만들수 있다.
  
  ### java에서 스레드를 만드는 방법
  1) Thread 클래스를 extends해 run()메서드를 오버라이드해 스레드로 동작할 코드를 구현하고 인스턴스화 해서 start()메서드로 시작시켜준다.
 
  ```
   public class SomeThread extends Thread{
        @Override
        public void run() {
            //TODO: 스레드로 동작할 코드
            //super.run();
        }
    }
    ...
    
    public static void main(String [] args){

        Thread t = new SomeThread();
        t.start();
    }
  ```
  
  2) Runnable 인터페이스를 implements해서 Thread의 생성자에 넣어 생성.
  ```
  public class SomeRunnable implements Runnable{
        @Override
        public void run() {
            //TODO: 스레드로 동작할 코드
        }
    }

    public static void main(String [] args){

        //Thread t = new SomeThread();
        //t.start();
        
        Runnable r = new SomeRunnable();
        Thread t = new Thread(r) ;
        t.start();
    }
  ```
  
 아래와 같은 이유로 2번이 더 효율적이다
   1) Runnable 오브젝트를 사용하면 Thread클래스가 아닌 다른 클래스를 상속해서 사용할 수 있다.
   2) 태스크 클래스가 Thread 클래스를 상속할 필요없이 태스크와 Thread오브젝트를 분리시킬수 있다.=>  run() 의 내용이 태스크인데 1번은 Thread를 상속받아 run()이 스레드의 태스크 그자체인 반면 Runnable로 만든 클래스 자체는 쓰레드가 아닐뿐 더러 태크스와 스레드가 분리되어있다.즉 스레드 내에 태스크를 넣어서 사용하는 것이다 => '축구를 하기위해선 축구선수 아들일 필요는 없다.'
  
 ### 동기화
  * 스레드 간섭 : 만약 프린터라는 공유 자원이 있는 경우 스레드A가 프린터에 접근해 프린트중 스레드B가 프린터에 접근해 원하는 내용을 프린트한다면 서로 내용이 꼬여버린다. 이것을 스레드 간섭이라고 한다
 
  ```
  public class Printer {

    public void print(String str){
        for (char c: str.toCharArray()) {
            System.out.print(c); //한글자씩 출력
            try {
                Thread.sleep(1000); //스레드 간섭을 보기 위해 sleep을 둠
            } catch (InterruptedException e){}
        }
        System.out.println('\n');
    }
}
public static void main(String[] args){
        Printer printer = new Printer();

        new Thread(() -> printer.print("ABCDE")).start();
        new Thread(() -> printer.print("abcde")).start();
}
  ```
  
  * 위의 두 스레드는 밑처럼 하나의 명령이 끝나고 다음 동작이 실행되는것이 아니다
  * 
   ```
   printer.print("ABCDE");
   printer.print("abcde");
   ```
   
   * 첫 스레드 start()후 바로 밑의 스레드가 실행되는 것이기 때문에 서로 독립적으로 동시에 동작하고 있는것이다. **다만 여기서 문제는'printer라는 공유자원을 둘이 동시에 사용한다는것'이다**
   
   => 그래서 이것을 막아주는 것이 **'동기화(Synchromization)'** 이다
   
    ```
    public class Printer {
	    public synchronized void print(String str){
		for (char c: str.toCharArray()) {
		    System.out.print(c); //한글자씩 출력
		    try {
			Thread.sleep(1000); //스레드 간섭을 보기 위해 sleep을 둠
		    } catch (InterruptedException e){}
		}
		System.out.println('\n');
	    }
    } 
    ```
    
   * print()메서드에 synchronized를 명시해 동기화를 시켜주면 위의 처음 스레드가 먼저 키를 쥐고 걸어잠궜기에 밑의 스레드는 동작할수 없고 처음 스레드가 끝난후 밑의 스레드가 사용하게 된다.
   * 다만 동기화는 적절한곳(하나의 동작이 진행될때 간섭되면 안되는경우)에 주의해서 사용해야한다.
     * ex) 어떤 파일을 읽는경우는 내가읽을 때 다른사람이 읽어도 상관x, 하지만 파일 쓰기 경우엔 내가쓸때 다른 사람이 쓰게되면 내용이 이상해 지기 때문에 동기화 해줘야 한다.
   * 또한 동기화는 꼭 메서드 전체에 할필요 없이 
  
    ```
    public void print(String str){
      synchronized(this){
	for (char c: str.toCharArray()) {
	     System.out.print(c); //한글자씩 출력
	 try {
		Thread.sleep(1000); //스레드 간섭을 보기 위해 sleep을 둠
	 } catch (InterruptedException e){}
	}
      }	
	System.out.println('프린트');
	    }
    ```
    
   * 위처럼 일정 부분에 동기화할 수 있다.
    => 동기화는 필요한 부분에 최소한으로 해줘야 속도저하 없이 서버를 운영할 수 있다.
    
  ### 스레드 풀
  > 실제로는 위에서 보았던것 처럼 스레드를 생성하지 않는다. 스레드를 생성하고 해제하는 과정은 메모리에 공간받아 올렸다 해제시 메모리에서 내리는 이런과정은 상당한 메모리 관리 오버헤드가 발생한다.
   * 예시로 웹서버의 경우 하나의 request는 하나의 스레드가 처리하는데 요청이 올떄마다 생성,해제하면 서버가 엄청 느려지게된다.
  > 그래서 스레드를 미리 많이 만들어 놓은 다음 요청이 오면 그 스레드에 태스크를 할당하고 태스크가 끝나도 스레드는 죽지않고 대기하다가 다른 요청이오면 또 처리하는 이러한 과정을 거치고 이렇게 스레드를 많이 만들어 놓은 것을 '스레드 풀'이라고 한다. 또한 스레드 풀에서 동작하는 스레드를 '워크 스레드'라고 한다.
  * ExecutorService : 자바의 기본 스레드풀 인터페이스 이다.
  ```
   public static void main(String[] args){
        RestRoom restRoom = new RestRoom();

        Runnable r = () -> restRoom.use();
        //워크 스레드 2개의 풀 생성
        ExecutorService service = Executors.newFixedThreadPool(2);
        //스레드 4개가 돌려야 할것 같지만 2개가 번갈아서 돌려줌.
        service.execute(r);
        service.execute(r);
        service.execute(r);
        service.execute(r);

        //ExecutorService는 shutdown()해주지 않으면 스레드 풀은 계속 돌고 있다.
        service.shutdown();
    }
  => 
  pool-1-thread-2 : 화장실에 들어갔다.
pool-1-thread-2: 화잘실에서 나왔다.
pool-1-thread-1 : 화장실에 들어갔다.
pool-1-thread-2: 손을 씻었다.
pool-1-thread-1: 화잘실에서 나왔다.
pool-1-thread-2 : 화장실에 들어갔다.
pool-1-thread-2: 화잘실에서 나왔다.
pool-1-thread-1: 손을 씻었다.
pool-1-thread-1 : 화장실에 들어갔다.
pool-1-thread-1: 화잘실에서 나왔다.
pool-1-thread-2: 손을 씻었다.
pool-1-thread-1: 손을 씻었다.
  ```
  * ScheduledExecutorService : 위의 ExecutorService를 상속받은 스레트풀 스케쥴러. 깊이있게는 추후 공부.
  ```
   public static void main(String[] args){
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        Runnable beeper = () -> System.out.println("beep");

        //scheduleAtFixedRate(태스크, 처음 실행 딜레이, 간격, 딜레이,간격에 대한 단위)
        // beeper 태스크를 1초후 부터 1초 단위로 실행
        // 일정간격 규칙적으로 어떤것을 하고 싶을때 사용할수 있다. 스레드의 실행을 체계적으로 적용가능.
        scheduler.scheduleAtFixedRate(beeper, 1,1, TimeUnit.SECONDS);
    }
  ```
## String 과 StringBuffer
> String : java에서 String 인스턴스는 한번 생성되면 그값을 읽기만 할 수 있고 변경(가공)할 수는 없다. 이러한 객체를 자바에선 '불변객체' 라고 한다. concat이나 +연산자로 문자열 결합은 할수 있지만 기존 문자열내용이 변경되는 것이 아닌 내용이 합쳐진 새로운 String 인스턴스가 생성되는 것이다. 다만 이 방식의 경우 많이 결합하면 할 수록 공간낭비,속도저하를 야기한다.
> StringBuffer : StringBuffer클래스의 인스턴스는 그 값을 변경할 수도 있고 추가할 수도 있다. 이것을 위해 StringBuffer 내부적으로 버퍼를 가지고 있는데 버퍼 크기는 16개의 문자를 저장할 수있는 기본값을 가지고 있으며 생성자를 통해 크기를 별도 설정할수 있지만 별도 설정한 값+16개를 같이 생성해줘 여유있는 크기고 생성된다. 
  ### 불변 클래스 vs 가변 클래스
  * String과 같이 인스턴스가 한번 생성되면 그값을 변경할 수 없는 클래스를 **'불변 클래스'** 라고 한다.
  * StringBuffer과 같이 자유롭게 인스턴스의 값을 변경할 수 있는 클래스를 **'가변 클래스'** 라고 한다.
  * 불변 클래스는 기본적으로 값을 변경하는 set메서드를 포함하지 않는다.
    * 불변 클래스를 사용하는 이유는 멀티스레드 환경에서 하나의 객체에 접근하면서 각각의 객체가 서로 영향을 주어서는 안되는 경우에 불변 인스턴스를 사용하면 값이 변하지 않는다는 점이 보장 된다.
 ```
 //append()메서드를 통해 StringBuffer 학습
 StringBuffer str = new StringBuffer("Java");
 System.out.println("원본 문자열 : " + str);

 System.out.println(str.append("수업"));
 System.out.println("append() 메소드 호출 후 원본 문자열 : " + str);
 => 
 원본 문자열 : Java
 Java수업
 append() 메소드 호출 후 원본 문자열 : Java수업
 ```
 + 추가적으로 StringBuilder는 StringBuffer보다 성능은 좋지만 StringBuffer가 동기화가 되어 멀티스레드 환경에서 안정적이기에 멀티스레드 환경이라면 StringBuffer, 그 외엔 StringBuilder를 사용하는 편이 더 낫다고 한다.
## 람다
 ### Funtional interface
  * 추상메서드를 1개만 갖고 있는 인터페이스.
  * 메서드의 인자로 메서드를 전달하는 것이 목적이다.

> funtional interface를 구현한 익명클래스를 람다식으로 바꿀수 있다(= 인터페이스이름과 추상메서드 이름을 생략). 개인적으로 람다를 쓰기 위해 funtional interface를 구현해 사용해줘야 하는데 그럼 어떤경우에 사용을 하게될까? 라는 생각엔 같은 역할을 하지만 내용은 다른 코드들을 간결하게 표현하기 위해 사용할것같다.
```
public class GreetingEx {

    public void sayHello(Greeting greeting){
        greeting.greet();
    }

    public void go(){
        // 1. 영어 인사 클래스
        class EnglishGreeting implements Greeting{
            @Override
            public void greet() {
                System.out.println("Hello");
            }
        }
        Greeting englishGreeting = new EnglishGreeting();
        sayHello(englishGreeting);
        //위를 보면 구지 Hello라는 문자열 출력하는 동작을 동작시키기 위해 인터페이스 생성해 동작시키는
        //방식은 너무 번거롭다.

        // 2. 프랑스 인사는 익명 클래스로 구현
        Greeting frenchGreeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Bonjour");
            }
        };
        sayHello(frenchGreeting);

        //3. 스페인어 인사는 익명클래스를 메서드에 직접 삽입
        sayHello(new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hola");
            }
        });

        //4. 한국어 인사는 람다식 사용
        //람다식은 funtional 인터페이스 구현체의 메서드 내부
        Greeting koreanGreetin = () -> {
            System.out.println("안녕");
        };
        sayHello(koreanGreetin);
        //위의 내용은 밑처럼 줄일수 있다.

        sayHello( () -> {
            System.out.println("안녕");
        });
        /**
         * funtional 인터페이스를 보면  인터페이스 이름과 내부의 메서드 이름은 중요하지않고 해당 인터페이스의
         * 구현체가 중요한 것이기 떄문에 인자값과 메서드 내부만을 표기해 코드를 간결하게 하였다
         * */
    }
    public static void main(String[] args){
        new GreetingEx().go();
    }
}
```
* 자바에서 람다 표현식을 작성할때 유의점
  1) 매개변수의 타입을 추론 할 수 있는 경우에는 타입을 생략할 수 있다.
  2) 매개변수가 하나인 경우에는 괄호를 생략할 수 있다 ex) p -> {}
  3) 함수의 몸체가 하나의 명령문만으로 이루어진경우 중괄호 {} 를 생략할 수 있다. if나 for도 마찬가지다
  4) 함수의 몸체가 하나의 return문으로만 이루어진 경우엔 중괄호를 생략할 수 없다.
  5) return문대신 표현식을 사용할 수 있으며 이때 반환값은 표현식의 결과값이 된다.
## Stream API
**http://tcpschool.com/java/java_stream_intermediate** 을 참고하여 공부후 복기형식으로 필기했다.

> 스트림 API는 java SE 8 부터 추가되었다. 자바에서는 많은 양의 데이터를 저장하기 위해 배열이나 컬렉션을 사용하는데 이 데이터들에 접근하기 위해서 반복문이나 반복자(iterator)를 사용하여 매번 새 코드를 작성해야 한다. 이렇게 작성된 코드는 길이가 너무길고 가독성도 떨어지며 코드재사용이 거의불가능하다. 이러한 문제점을 극복하기 위해 나온것이 Stream API이다.
* Stream API의 특징
  1) 스트림은 외부 반복을 통해 작업하는 컬렉션과 달리 내부 반복을 통해 작업을 수행.
  2) 스트림은 재사용이 가능한 컬렉션과는 달리 단 한번만 사용할 수 있다. 이후 사용하면 예외발생
  3) 스트림은 원본데이터를 변경하지 않는다
  4) 연산은 필터-맵 기반으니 API를 사용하여 지연연산을 통해 성능을 최적화 한다.
  5) 스트림은 parallelStream() 메서드를 통한 손쉬운 병렬 처리를 지원한다.
 * Stream API의 동작 흐름
 > Stream API는 세가지 단계에 걸쳐 동작한다.
   1) Stream의 생성
   2) Stream의 중개연산(Stream의 변환)
   3) Stream의 최종연산(Stream의 사용)
   <img src="http://tcpschool.com/lectures/img_java_stream_operation_principle.png" />
  
  ### Stream의 생성
  > Stream API는 다음과 같은 다양한 데이터 소스에서 생성 가능
    1) 컬렉션
    2) 배열
    3) 가변 매개변수
    4) 지정된 범위의 연속된 정수
    5) 특정 타입의 난수
    6) 람다 표현식
    7) 파일
    8) 빈 스트림
 
 ### Stream의 중개연산
  > Stream API에 의해 생성된 초기 스트림은 중개연산을 통해 또 다른 스트림으로 변환된다. 중개연산은 스트림을 전달받아 스트림을 반환하므로 중개연산은 연속으로 . 로 연결해 사용가능하다.
  * Stream API에서 사용할 수 있는 대표적 중개연산과 그에 따른 메서드
    1) Stream 필터링 : filter(), distinct()
    2) Stream 변환 : map(), flatMap()
    3) Stream 제한 : limit(), skip()
    4) Stream 정렬 : sorted()
    5) Stream 연산결과 확인 : peek()
  
  ### Stream의 최종연산
  > Stream API에서 중개연산을 통해 변환된 스트림은 마지막으로 최종 연산을 통해 각 요소를 소모하여 결과를 표시한다. 즉 지연되었던 모든 중개연산들이 최종연산시에 모두 수행되는 것이다. 이렇게 최종연산시에 모든 요소를 소모한 해당 스트림은 더는사용x
  * Stream API에서 사용할 수 있는 대표적이최종 연산과 그에 따른 메소드는 다음과 같다.
    1) 요소의 출력: forEach()
    2) 요소의 소모 : resuduce()
    3) 요소의 검색 : findFirst(), findAny()
    4) 요소의 검사 : anyMatch(), allMatch(), noneMatch()
    5) 요소의 통계 : count(),min(),max()
    6) 요소의 연산 : sum(),average()
    7) 요소의 수집 : collect()
## JAVA에서의 다중상속
* https://siyoon210.tistory.com/125 참고하여 공부하였다. 

> 자바는 클래스는 다중상속이 불가능하지만 인터페이스는 가능하다. 바꿔말하면 구현체는 다중상속이 불가능 하지만 추상객체는 가능하다.왜 클래스는 다중상속이 불가능할까?
### 다이아몬드 문제
> 다중상속을 지원하게 되면 하나의 클래스가 여러상위 클래스를 상속 받을 수 있다. 이러면 문제가 발생하는데 이 문제를 '다이아몬드 문제' 라고한다

<img src="https://t1.daumcdn.net/cfile/tistory/995652405C723D2216"/>
위의 클래스다이어그램과 같은 상속구조에서 발생되는 문제가 다이아몬드 문제인데 GrandFather에 speak()이라는 메서드를 Father클래스들이 오버라이딩하여 구현하였을때 Son클래스는 어떤 부모의 speak메서드를 사용해야하는가?-> 여기서 충돌이 나게된다.

```
class GrandFather{
  void speak(){
    ..println("grand speak")
  }
}

class FatherA extends GrandFather{
  @Overrride
  void speak(){
    ..println("fatherA speak")
  }
}

class FatherB extends GrandFather{
  @Overrride
  void speak(){
    ..println("fatherB speak")
  }
}

class Son extends FatherA,FatherB{ //상속할수 있다는 가정하!
   super.speak()...??
}
// Son의 입장에선 같은 이름의 speak메서드가 상위클래스 두개에 다 
// 정의되어있기 때문에 어떤 메서드를 실행해야할지 알수 없다
```

### 인터페이스 다중상속

> 그런데 인터페이스는 다중상속이 가능하다. 클래스의 다중상속은 정의한 메서드가 충돌하는 문제가 생겨 불가했지만 인터페이스의 경우는 기능에대한 선언만 해두기 때문에 다이아몬드 문제가 발생해도 충돌이 발생하지 않아 문제가 없다.

> 그런데 자바8 의default method는 인터페이스 내부에 코드를 구현하게 되는데 이렇게 내부에 코드를 구현해버리면 인터페이스의 다중상속은 불가해 진다.

## Error vs Exceoption
 ### Error 와 Exceoption
   * Error는 컴파일시에 문법적이 오류와 런타임시 널포인트 참조와 가튼 오류로 프로세스에 심각한 문제를 야기시켜 프로세스를 종료시킬수 있다.개발자가 미리 예측해 방지 할 수 없다. 주로 메모리 부족이나 스택오버플로우 같은 심각한 오류다.
  <img src = "https://github.com/GimunLee/tech-refrigerator/raw/master/Language/JAVA/resources/java-error-exception-003.png"/>
  
   * Exception는 개발자가 구현한 로직에서 발생한 실수나 사용자의 영향에 의해 발생한다. Error와 달리 개발자가 미리 예측해 방직할 수 있기 때문에 상황에 맞게 try-catch문으로 예외처리가 필요하다.
  
  <img src="https://github.com/GimunLee/tech-refrigerator/raw/master/Language/JAVA/resources/java-error-exception-002.png"/>
 ### Throwable 클래스
  <img src="https://github.com/GimunLee/tech-refrigerator/raw/master/Language/JAVA/resources/java-error-exception-001.png" />
  > Throwable 클래스는 예외처리를 할 수 있는 최상위 클래스다. Throwable은 에러나 예외에 대한 메시지를 담고 예외가 연결될때 연결된 예외의 정보들을 기록한다고 한다. Throwable객체가 가진 정보와 할 수 있는 행위는 getMessage()와 printStackTrace()라는 메서드로 구현되어 있는데 이 둘을 이용해서 자주 예외처리를 해준다. 
  => 즉 오류와 예외는 메세지를 담을수 있고 어떠한 원인에 의해 발생되었는지를 여결해 출력해줄수 있다.
  * printStackTrace() : 발생한 Exception의 출처를 메모리상에서 추적하면서 결과를 알려준다. 발생한 위치를 정확히 출력하기에 제일 많이 사용되며 void를 반환
  * getMessage() : 한줄로 요약된 메세지를 String으로 반환해 줍니다.
  * getStackTrace() : jdk1.4부터 지원, printStackTrace()를 보완, StackTraceElement[]라는 문자열 배열로 변경해서 출력하고 저장한다.
  
 ### 예외처리 (Exception Handling)
 > 잘못된 하나로 인해 전체 시스템이 무너지는 결과를 방지하기 위한 기술적인 처리입니다. java에서는 예외와 에러도 객체로 처리한다.
 * 예외가 주로 발생하는 원인
   * 사용자의 잘못된 데이터 입력
   * 잘못된 연산
   * 개발자가 로직을 잘못작성..^^
   * 하드웨어, 네트워크 오작동
   * 시스템 과부하
  * 예외를 처리하는 방식
    1) 직접 try-catch를 이요해서 예외에 대한 최종적인 책임을 지고 처리하는 방식
    2) throw Exception을 이용해서 발생한 예외의 책임을 호출하는 쪽이 책임지도록 하는 방식(주로 호출하는 쪽에 예외를 보고하는 경우 사용)
    + 타 메소드의 일부분으로 동작하는 경우 throw를 추천.
 ### Exception의 2가지 종류
 1. Checked Exception : 예외처리가 필수이며, 처리하지 않으면 컴파일 되지 않습니다.JVM외부와 통신(네트워크, 파일시스템 등)할때 주로 쓰인다.
   * RuntimeException 이외에 있는 모든 예외
   * IOException, SQLException 등
 2. Unchecked Exception : 컴파일 때 체크되지 않고, Runtime에 발생하는 Exception을 말한다.
   * RuntimeException 하위의 모든 예외
   * NullPointerException, IndexOutOfBoundException 등

