package com.sanhu.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sanhu.dao.SeckillDao;
import com.sanhu.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * Created by zhangbx on 16/11/27. 配置spring和junit整合，这样junit在启动时就会加载spring容器
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring的配置文件
@ContextConfiguration({ "classpath:spring/spring-dao.xml" })
public class SeckillDaoTest {

	// 注入Dao实现类依赖
	@Autowired
	private SeckillDao seckillDao;

	@Test
	public void queryById() throws Exception {
		long seckillId = 1000;
		Seckill seckill = seckillDao.queryById(seckillId);
		System.out.println(seckill.getName());
		System.out.println(seckill);
	}

	@Test
	public void queryAll() throws Exception {
		List<Seckill> seckills = seckillDao.queryAll(1, 3);
		for (Seckill seckill : seckills) {
			System.out.println(seckill);
		}
	}

	@Test
	public void reduceNumber() throws Exception {
		long seckillId = 1000;
		Date date = new Date();
		int updateCount = seckillDao.reduceNumber(seckillId, date);
		System.out.println(updateCount);
	}
}