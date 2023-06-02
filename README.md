# Nhật kí học tự học Spring boot.
_Trước khi học mình đã cũng có ôn lại những kiến thức cơ bản nhất của Java (Chủ yếu thông qua việc đọc document)_

_Lưu ý: Những chữ in nghiên sẽ mang thiên hướng chủ quan, cá nhân như một cách để mình học và tự củng cố kiến thức.
Còn lại, nó đến từ việc luyện tập và thu thập dữ liệu của mình rồi trình bày nó dưới dạng text hoặc coding thông qua cái bài viết.
Mình làm những điều trên để sau này mình có thể ôn lại._

_Khi có một thông tin gì đó mới, mình sẽ áp dụng cấu trúc: What? Why? How? Cho 1 vấn đề_
## Core concept

#### Hạn chế của DI
Như ví dụ footballPlayer. Ta có thể thấy được nhiệm việc sử dụng Shoe ở nhiều chỗ khác nhau

##### Ưu điểm
###### 1. Giảm sự phụ thuộc
###### 2. Thấy được các sự phụ thuộc rõ ràng.

*Chương trình cũng rất khó khăn khi cần thay thế một service cho toàn bộ hệ thống (Chưa hiểu vế sau này lắm) ???
Mình cũng **chưa đánh giá được khuyết điểm** của nó. Nhưng có thể thấy được ưu điểm
Để giải quyết vấn đề này, chúng ta có thể áp dụng Inversion of Control Container (IoC container)*

### IoC – Inversion of Control
#### Inversion of Control (IoC) là gì?
Inversion of Control (IoC) là pattern tuân theo Dependency inversion principle.

Inversion of Control (IoC) dịch là đảo ngược điều khiển.

Ý của nó là làm thay đổi luồng điều khiển của ứng dụng, giúp tăng tính mở rộng của một hệ thống.
#### Inversion of Control Container (IoC container) là gì ?
Vấn đề: Làm thế nào để biết một class nào phụ thuộc vào một class khác để khởi tạo ?

Giải quyết: Cần một nơi để quản lí các thành phần khi class đó dựa vào những thông tin từ các file cấu hình ?

Lúc này ta có thể thấy được ưu điểm thông qua việc phát triển IoC để trở thành một framework chứ không phải một thư viện. Về cơ bản thư viện giải quyết một task, sau đó trả ngược kết quả về cho người dùng.
Còn đối với framework thể hiện được tính thiết kế của mình hơn, trừu tượng hơn, dễ mở rộng dựa trên một nguyên lí cụ thể. Và code của chúng ta sẽ được plugin vào trong một class cụ thể khi cần.
Xem thêm bài viết [tại đây](https://gpcoder.com/4975-huong-dan-java-design-pattern-dependency-injection)
###### Lưu ý, hiện tại bị lỗi init() constructor. Do ở Java 11 không còn hỗ trợ newInstance() nữa. Thế nên instance chưa được khởi tạo. Mặc dù đã thử bỏ constructor không tham số vào rồi. Nhưng kết quả vẫn không thay đổi.
###### Chưa fix được. Nên mình vẫn sẽ để đây và tiếp tục với các khái niệm khác

#### Java Configuration & Spring Context.
Bài viết tham khảo: 
1. [Baeldung](https://www.baeldung.com/spring-application-context#applicationContext)
2. [Viblo](https://viblo.asia/p/bean-va-applicationcontext-la-gi-trong-spring-boot-Ljy5Vjwj5ra)
3. [Document](https://docs.spring.io/spring-framework/reference/core/beans/basics.html)

*Đừng nhầm lẫn giữa 2 khái niệm IoC (Principle) và IoC Container (Được implement theo IoC)*

Chức năng chính của Spring framework là IoC Container.
Vậy IoC Container là gì? 
- Dùng để quản lí các object trong ứng dụng.
- ApplicationContext present IoC Container. (for instantiating - Khởi tạo, configuring - Cấu hình, and assembling -Lắp ráp the beans) thông qua việc đọc bởi  **configuration metadata**. `ApplicationContext` cũng là một sub-interface được kế thừa và mở rộng từ `Bean-Factory`
- Configuration metadata gồm: Java Annotation, XML, Java code 
- Chức năng chính của Application Context
  - Resolving messages 
  - Supporting internationalization
  - Publishing events
  - Application-layer specific contexts.

Khái niệm khác
#### Bean là gì 
A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container. 

_Theo mình, để có thể tạo ra được một sản phẩm nào đấy, chúng ta bắt buộc phải có những thành phần để cấu hình nên sản phẩm đó.
Đối với ứng dụng cũng vậy, chúng ta cũng phải cấu hình trước, để có những kết nối và chạy được sản phẩm
Tương tự, vậy làm gì để chúng ta có thể cấu hình Bean._

#### 1. Java-Based Configuration
- `@Bean`, `@Configuration`
  - `@Bean`: Được áp dụng trên một phương thức và đánh dấu nó sẽ được quản lí bởi Spring Container.
  - `@Configuration`: Chứa các cấu hình Spring Bean. Cho biết đây là nơi sẽ định nghĩa các Bean.
#### 2. Annotation Configuration
- _Thay vì việc phải dùng một file `compareAnnotationWithXMLConfig.xml` để định nghĩa dài dòng một **component** (sẽ nhắc trong các phần sau), thì chúng ta chỉ cần một `@Component` để đánh dấu là xong. Việc này cho thấy được sự **tiện lợi** khi sử dụng annotation_
#### 3. XML Configuration
- _Mình sẽ bỏ qua phần thực hành của XML Configuration này và đọc lý thuyết của nó để biết thêm. Tại vì mình thấy ít tương tác với chúng trong quá trình làm_

***Ngày 2***

#### Bean life cycle, Component scanning. 
Bài viết tham khảo
- [Geeks for geeks](https://www.geeksforgeeks.org/bean-life-cycle-in-java-spring/)
- [Viblo](https://viblo.asia/p/vong-doi-cac-loai-bean-va-co-che-component-scan-L4x5x6BrZBM)
- [Spring Document](https://docs.spring.io/spring-framework/reference/core/beans/definition.html)

##### 1.1 Bean Life Cycle
###### 1.1.1 Init
_Có nhiều cách để chúng ta có thể khởi tạo một Bean, Ở đây mình sẽ đọc cách sử dụng constructor_
- _Constructor_
- _Static Factory Method_
- _Instance Factory Method_
- _Determining a Bean’s Runtime Type_

_Đọc thêm_ [_DI_](https://docs.spring.io/spring-framework/reference/core/beans/dependencies/factory-collaborators.html)

Lý thuyết: Dependency injection (DI) is a process whereby **objects define their dependencies** (that is, the other objects with which they work) only through **constructor arguments, arguments to a factory method, or properties** that are set on the object instance after it is constructed or returned from a factory method.

Tức là các object sẽ làm việc cùng với những constructor,... properties sau khi constructor được tạo hoặc trả về một factory method.
Và Container sẽ inject những dependencies này khi tạo ra bean (IoC).

[//]: # (Ở ví dụ này mình sẽ sử dụng constructor để demo. Còn một cách khác nữa là chúng ta sẽ sử dụng setter)
- Example 1: `ioc_container.beans.life_cycle`. 
- Example 2: `core_tech.DI`

###### 1.1.2 Các method khởi tạo khác được gọi.
Ở phần này - khi xem sơ qua các phần có trong document thì nó quá sâu đối với mình. Từ [quá trình nó init]("https://docs.spring.io/spring-framework/reference/core/beans/factory-nature.html#beans-factory-lifecycle-initializingbean"), đến [quá trình destroy]("https://docs.spring.io/spring-framework/reference/core/beans/factory-nature.html#beans-factory-lifecycle-disposablebean") một bean.
Và một đống các method khác nữa. Quá nhiều, và mình cảm thấy không phù hợp với mình ở thời điểm hiện tại. Vậy nên mình quyết định bỏ qua phần này. Thay vào đó mình sẽ có một tập trung vào các event chính của sự kiện như là `@PostConstructor` và `@PreDestroy` (Được giới thiệu ở Spring 2.5)

_Đi lại tuần tự các bước. Như từ việc cấu hình `@Configuration` để định nghĩa ra các `@Bean` rồi từ đó implement các method dựa trên một sự kiện ngoài đời mà mình muốn đưa vào. Cụ thể ở đây là xem phim._


##### 1.2 Bean Scopes

_Tại sao lại có bean scopes ?_

_Mình sẽ tham chiếu về java code. Khi chúng ta khởi tạo một đối tượng, các field trong đối tượng đó có thể access được hay không là nhờ những **Access Modifiers** (public, protected, default, private).
Tương tự như vậy khi mình đọc bean scopes, nó cũng có những cách thức để chúng ta có thể sử dụng **bean** trong một phạm vi nào đấy (cụ thể ở đây là scope).
Phần nào đấy có những level nhất định_ 

***"The Spring Framework supports six scopes,  four of which are available only if you use a web-aware"***
1. singleton
2. prototype
3. request
4. session
5. application 
6. websocket

Trong phần này, mình được gợi ý nên tập trung vào phần singleton.

**Vậy trước hết, Singleton là gì ?**

Bài viết tham khảo tại [Guru](https://refactoring.guru/design-patterns/singleton), [Viblo](https://viblo.asia/p/hoc-singleton-pattern-trong-5-phut-4P856goOKY3)



#### File properties.
lưu trữ dữ liệu cấu hình dự án hoặc các thông số cài đặt. Gồm các cặp key/value


