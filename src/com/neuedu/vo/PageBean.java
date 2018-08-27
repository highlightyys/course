package com.neuedu.vo;

import java.util.List;

import com.neuedu.commons.Commons;

public class PageBean<T> {
	private int nowPage; //��ǰҳ
	private int record; //ÿҳ��ʾ�ļ�¼��
	private int totalPage; //��ҳ��
	private int count; //�ܼ�¼��
	
	private List<T> list; //��ѯ�ķ�ҳ��¼

	public PageBean() {}
	public PageBean(int nowPage, int record) {
		super();
		this.nowPage = nowPage;
		this.record = record;
	}

	public int getNowPage() {
		return nowPage;
	}

	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}

	public int getRecord() {
		return record;
	}

	public void setRecord(int record) {
		this.record = record;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
		totalPage = count == 0 ? 0 : (count - 1) / Commons.RECORD + 1;		
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	
	

}
