package product.sevice;

import com.example.product.server.dataobject.ProductCategory;
import com.example.product.server.sevice.CategoryService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import product.ProductApplicationTests;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * @author: 陈嘉欣
 * @date: 2018/9/13 14:37
 */
@Component
public class CategoryServiceTest extends ProductApplicationTests {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> list = categoryService.findByCategoryTypeIn(Arrays.asList(11, 22));
        assertTrue(list.size() > 0);
    }
}