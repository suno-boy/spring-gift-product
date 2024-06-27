package gift;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(ProductController controller) {
        return args -> {
            controller.addProduct(new Product(8146027L, "아이스 카페 아메리카노 T", 4500, "https://st.kakaocdn.net/product/gift/product/20231010111814_9a667f9eccc943648797925498bdd8a3.jpg"));
            controller.addProduct(new Product(8146028L, "따뜻한 카페 라떼 T", 5000, "https://img.danawa.com/prod_img/500000/059/749/img/13749059_1.jpg?_v=20220524145210"));
            controller.addProduct(new Product(8146029L, "콜드 브루 T", 4800, "https://img.danawa.com/prod_img/500000/658/896/img/17896658_1.jpg?_v=20220923092758"));
        };
    }
}
