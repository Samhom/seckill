package com.sanhu.dao;

import org.apache.ibatis.annotations.Param;

import com.sanhu.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * Created by zhangbx on 16/11/26.
 */
public interface SeckillDao
{

    /**
     * 减库存
     * @param seckillId
     * @param killTime
     * @return 如果影响行数>1，表示更新库存的记录行数
     */
    int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

    /**
     * 根据id查询秒杀的商品信息
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     * 根据偏移量查询秒杀商品列表
 所谓偏移量就是按照id从第offset条数据往后查limit条，也就是查询的条数为limit条
     * @param offset
     * @param limit
     * @return
     */
    List<Seckill> queryAll(@Param("offset") int offset,@Param("limit") int limit);



}
