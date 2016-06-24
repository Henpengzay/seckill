package org.seckill2.dao;

import org.seckill2.entity.SuccessKilled;

/**
 * 
 * @author zpLuo(13826033294@163.com)
 *
 */
public interface SuccessKilledDao {
	
	/**
	 * 插入购买明细，可过滤重复
	 * @param seckillId
	 * @param userPhone
	 * @return
	 */
	public int insertSuccessKilled(long seckillId ,long userPhone);
	
	/**
	 * 根据id查询SuccessKilled并携带秒杀产品对象实体
	 * @param seckillId
	 * @return
	 */
	public SuccessKilled queryByIdWithSeckill(long seckillId);
}
