package com.xxjqr.multiple_modules;

import com.xxjqr.multiple_modules.core.article.mapper.ArticleMapper;
import com.xxjqr.multiple_modules.core.article.po.Article;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppApplicationTests {
	@Resource
	private ArticleMapper articleMapper;
	@Resource
	private RedisTemplate redisTemplate;

	@Test
	@Ignore
	public void contextLoads() {

	}

	@Test
	@Ignore
	public void testMapper(){
		articleMapper.selectAll();
	}

	@Test
	@Ignore
	public void testUtil(){
		List<Integer> a = Arrays.asList(2,3);
	}

	@Test
	public void testRedis(){
		Article article = new Article();

//		article.setId(1L);
//		article.setSummary("asdf");
//		article.setTitle("测试标题");
//		article.setText("<p>asdf</p>");
//		redisTemplate.opsForValue().set("cur_article",article);

		article = (Article) redisTemplate.opsForValue().get("cur_article");
		System.out.println(article);
	}
}
