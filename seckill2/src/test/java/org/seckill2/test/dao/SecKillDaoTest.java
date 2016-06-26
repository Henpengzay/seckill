package org.seckill2.test.dao;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.seckill2.dao.SecKillDao;
import org.seckill2.entity.Seckill;

public class SecKillDaoTest extends BaseTest{
	
	@Resource
	private SecKillDao secKillDao;

	@Test
	public void testReduceNumber() {
		int i = secKillDao.reduceNumber(1000, new Date());
		System.out.println(i);
	}

	@Test
	public void testQueryById() {
		Seckill s =secKillDao.queryById(1000);
		System.out.println(s);
	}

	@Test
	public void testQueryAll() {
		List<Seckill> list = secKillDao.queryAll(0, 2);
		for(Seckill s:list){
			System.out.println("seckillId :" + s.getSeckillId());
			System.out.println(s);
		}
	}

}
