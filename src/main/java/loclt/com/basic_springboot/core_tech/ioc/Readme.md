### Hạn chế của DI
Như ví dụ footballPlayer. Ta có thể thấy được nhiệm việc sử dụng Shoe ở nhiều chỗ khác nhau

#### Ưu điểm
##### 1. Giảm sự phụ thuộc
##### 2. Thấy được các sự phụ thuộc rõ ràng.

#### Chương trình cũng rất khó khăn khi cần thay thế một service cho toàn bộ hệ thống (Chưa hiểu vế sau này lắm) ???
#### Mình cũng chưa đánh giá được khuyết điểm của nó. Nhưng có thể thấy được ưu điểm
Để giải quyết vấn đề này, chúng ta có thể áp dụng Inversion of Control Container (IoC container),

## IoC – Inversion of Control
### Inversion of Control (IoC) là gì?
Inversion of Control (IoC) là pattern tuân theo Dependency inversion principle.

Inversion of Control (IoC) dịch là đảo ngược điều khiển.

Ý của nó là làm thay đổi luồng điều khiển của ứng dụng, giúp tăng tính mở rộng của một hệ thống.
### Inversion of Control Container (IoC container) là gì ?
Vấn đề: Làm thế nào để biết một class nào phụ thuộc vào một class khác để khởi tạo ?

Giải quyết: Cần một nơi để quản lí các thành phần khi class đó dựa vào những thông tin từ các file cấu hình ?

Lúc này ta có thể thấy được ưu điểm thông qua việc phát triển IoC để trở thành một framework chứ không phải một thư viện. Về cơ bản thư viện giải quyết một task, sau đó trả ngược kết quả về cho người dùng.
Còn đối với framework thể hiện được tính thiết kế của mình hơn, trừu tượng hơn, dễ mở rộng dựa trên một nguyên lí cụ thể. Và code của chúng ta sẽ được plugin vào trong một class cụ thể khi cần.
Xem thêm bài viết [tại đây]("https://gpcoder.com/4975-huong-dan-java-design-pattern-dependency-injection) 
###### Lưu ý, hiện tại bị lỗi init() constructor. Do ở Java 11 không còn hỗ trợ newInstance() nữa. Thế nên instance chưa được khởi tạo. Mặc dù đã thử bỏ constructor không tham số vào rồi. Nhưng kết quả vẫn không thay đổi.
###### Chưa fix được. Nên mình vẫn sẽ để đây và tiếp tục với các khái niệm khác