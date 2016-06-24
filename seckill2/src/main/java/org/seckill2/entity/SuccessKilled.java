package org.seckill2.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 秒杀成功明细表对应的实体类
 * @author zpLuo(13826033294@163.com)
 *
 */
public class SuccessKilled implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/* 秒杀商品ID */
	private long seckillId;

	/* 用户手机号 */
	private long userPhone;
	
	/* 状态表示:-1:无效 0 成功 1 已付款 2 已发货' */
	private short state;
	
	/* 创建时间  */
	private Date createTime;

	// 变通
	// 多对一
	private Seckill seckill;

	/**
	 * @return the seckillId
	 */
	public long getSeckillId() {
		return seckillId;
	}

	/**
	 * @param seckillId the seckillId to set
	 */
	public void setSeckillId(long seckillId) {
		this.seckillId = seckillId;
	}

	/**
	 * @return the userPhone
	 */
	public long getUserPhone() {
		return userPhone;
	}

	/**
	 * @param userPhone the userPhone to set
	 */
	public void setUserPhone(long userPhone) {
		this.userPhone = userPhone;
	}

	/**
	 * @return the state
	 */
	public short getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(short state) {
		this.state = state;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the seckill
	 */
	public Seckill getSeckill() {
		return seckill;
	}

	/**
	 * @param seckill the seckill to set
	 */
	public void setSeckill(Seckill seckill) {
		this.seckill = seckill;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SuccessKilled [seckillId=" + seckillId + ", userPhone=" + userPhone + ", state=" + state
				+ ", createTime=" + createTime + ", seckill=" + seckill + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
		result = prime * result + ((seckill == null) ? 0 : seckill.hashCode());
		result = prime * result + (int) (seckillId ^ (seckillId >>> 32));
		result = prime * result + state;
		result = prime * result + (int) (userPhone ^ (userPhone >>> 32));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SuccessKilled other = (SuccessKilled) obj;
		if (createTime == null) {
			if (other.createTime != null)
				return false;
		} else if (!createTime.equals(other.createTime))
			return false;
		if (seckill == null) {
			if (other.seckill != null)
				return false;
		} else if (!seckill.equals(other.seckill))
			return false;
		if (seckillId != other.seckillId)
			return false;
		if (state != other.state)
			return false;
		if (userPhone != other.userPhone)
			return false;
		return true;
	}
}
