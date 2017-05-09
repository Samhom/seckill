package com.sanhu.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sanhu.dao.SuccessKilledDao;
import com.sanhu.entity.SuccessKilled;

/**
 * Created by zhangbx on 16/11/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring的配置文件
@ContextConfiguration({ "classpath:spring/spring-dao.xml" })
public class SuccessKilledDaoTest {

	@Autowired
	private SuccessKilledDao successKilledDao;

	@Test
	public void insertSuccessKilled() throws Exception {
		long seckillId = 1000L;
		long userPhone = 13476191877L;
		int insertCount = successKilledDao.insertSuccessKilled(seckillId, userPhone);
		System.out.println("insertCount=" + insertCount);
	}

	@Test
	public void queryByIdWithSeckill() throws Exception {
		long seckillId = 1000L;
		long userPhone = 13476191877L;
		SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(seckillId, userPhone);
		System.out.println(successKilled);
		if(null != successKilled) {
			System.out.println(successKilled.getSeckill());
		}
	}

}