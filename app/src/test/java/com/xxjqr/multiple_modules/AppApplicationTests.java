package com.xxjqr.multiple_modules;

import com.xxjqr.multiple_modules.core.article.mapper.ArticleMapper;
import com.xxjqr.multiple_modules.core.article.po.Article;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppApplicationTests {

	@Resource
	private ArticleMapper articleMapper;

	@Test
	@Ignore
	public void contextLoads() {

	}

	@Test
	@Ignore
	public void testMapper(){
		articleMapper.selectAll();
	}

}
