package product.repository;

import com.example.product.server.dataobject.ProductInfo;
import com.example.product.server.repository.ProductInfoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * All rights Reserverd,Designed By xxxx.
 *
 * @author: 陈嘉欣
 * @date: 2018/9/13 11:08
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void findByProductStatus() {
        List<ProductInfo> list = productInfoRepository.findByProductStatus(0);
        assertTrue(list.size() > 0);
    }

    @Test
    public void findByProductIdIn() throws Exception{
        List<ProductInfo> list = productInfoRepository.findByProductIdIn(Arrays.asList("157875196366160022","157875227953464068"));
        assertTrue(list.size() > 0);
    }
}