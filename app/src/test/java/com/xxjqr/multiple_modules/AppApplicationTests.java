package com.xxjqr.multiple_modules;



import com.xxjqr.multiple_modules.core.article.mapper.ArticleMapper;
import com.xxjqr.multiple_modules.core.article.po.Article;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppApplicationTests {
	@Resource
	private ArticleMapper articleMapper;
	@Resource
	private RedisTemplate redisTemplate;

	@Resource
	private StringRedisTemplate stringRedisTemplate;

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
	public void testRedis(){
//		stringRedisTemplate.opsForValue().set("key","value2");
//		stringRedisTemplate.opsForHash().put("user","3","iphone");
//		stringRedisTemplate.opsForHash().put("user","4","hw");
		Map<Object,Object> map = stringRedisTemplate.opsForHash().entries("user");
		for (Object in : map.keySet()) {
			//map.keySet()返回的是所有key的值
			String str = (String) map.get(in);//得到每个key多对用value的值
			System.out.println(in + "     " + str);
		}
	}

	@Test
	@Ignore
	public void testUtil(){
		List<Integer> tmp = Arrays.asList(2,3);
		System.out.println(tmp);
	}

	@Test
	public void testRedis2(){
		Article article = new Article();

//		Article.setId(1L);
//		Article.setSummary("asdf");
//		Article.setTitle("测试标题");
//		Article.setText("<p>asdf</p>");
//		redisTemplate.opsForValue().set("cur_article",Article);

		article = (Article) redisTemplate.opsForValue().get("cur_article");
		System.out.println(article);
	}
}
