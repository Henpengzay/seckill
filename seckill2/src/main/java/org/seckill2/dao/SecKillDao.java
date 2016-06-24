package org.seckill2.dao;

import java.util.Date;
import java.util.List;

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
	public int reduceNumber(long seckillId,Date killTime);
	
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
	public List<Seckill> queryAll(int offet,int limit);
}
