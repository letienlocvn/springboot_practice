package loclt.com.basic_springboot.core_tech.ioc_container.beans.life_cycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

/**
 * @param movie Giả sử. Chúng ta đang cần xem một bộ phim. Nhưng khi xem phim, chúng ta cần có thêm bỏng ngô và pepsi.
 */
public record WatchMovie(Movie movie) implements Services {
    // To control Life Cycle.
    // Public record thì mình được IDE Inteliji gợi ý. Thế thì thử qua. Thấy chạy cũng được và trông khá là oke.
    // Mình thấy 1 kiểu khá mới là record này khởi tạo Constructor ở trên phần khai báo của class luôn.
    // Trông khá dị.
    // Chứ nguyên bản thì mình sẽ tạo một constructor có tham số với với movie.
    @PostConstruct
    @Override
    public void preparedPepsiAndPopCorn() {
        System.out.println("Oke, Đã chuẩn bị Pepsi và PopCorn");
    }

    public void watchingMovie() {
        System.out.println("You're watching movie");
    }

    @PreDestroy
    @Override
    public void movieEnd() {
        System.out.println("Vứt Pepsi và Popcorn vào sọt rác");
    }


}
