package org.seckill2.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.seckill2.entity.Seckill;

/**
 * 
 * @author zpLuo(13826033294@163.com)
 *
 */
public interface SecKillDao {
	/**
	 * 减库存
	 * @param seckillId
	 * @param killTime
	 * @return
	 */
	public int reduceNumber(@Param("seckillId")long seckillId,@Param("killTime")Date killTime);
	
	/**
	 * 根据id查询秒杀对象
	 * @param seckillId
	 * @return
	 */
	public Seckill queryById(long seckillId);
	
	/**
	 * 根据偏移量查询秒杀商品列表
	 * @param offet
	 * @param limit
	 * @return
	 */
	public List<Seckill> queryAll(@Param("offset")int offset,@Param("limit")int limit);
	
	/**
	 * 使用存储过程执行秒杀
	 * 
	 * @param paramMap
	 */
	void killByProcedure(Map<String, Object> paramMap);
}
