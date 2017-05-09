package com.sanhu.dao;

import org.apache.ibatis.annotations.Param;

import com.sanhu.entity.SuccessKilled;

/**
 * Created by zhangbx on 16/11/27.
 */
public interface SuccessKilledDao {

	/**
	 * 插入购买明细,可过滤重复
	 * 
	 * @param seckillId
	 * @param userPhone
	 * @return 插入的行数
	 */
	int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

	/**
	 * 根据秒杀商品的id查询明细SuccessKilled对象(该对象携带了Seckill秒杀产品对象)
	 * 
	 * @param seckillId
	 * @return SuccessKilled对象(该对象携带了Seckill秒杀产品对象)
	 */
	SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

}
