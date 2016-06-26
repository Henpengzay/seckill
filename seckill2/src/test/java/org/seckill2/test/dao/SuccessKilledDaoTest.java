package org.seckill2.test.dao;

import javax.annotation.Resource;

import org.junit.Test;
import org.seckill2.dao.SuccessKilledDao;
import org.seckill2.entity.SuccessKilled;

public class SuccessKilledDaoTest extends BaseTest {

	@Resource
	private SuccessKilledDao SuccessKilledDao;
	
	@Test
	public void testInsertSuccessKilled() {
		int i = SuccessKilledDao.insertSuccessKilled(1000, 13826033294l);
		System.out.println(i);
	}

	@Test
	public void testQueryByIdWithSeckill() {
		SuccessKilled s = SuccessKilledDao.queryByIdWithSeckill(1000, 13826033294l);
		System.out.println(s);
	}

}
