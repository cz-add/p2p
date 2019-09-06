package com.zking.p2p.util;

import lombok.ToString;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 分页工具类
 *
 */
public class PageBean {

	private int page = 1;// 页码

	private int rows = 1;// 页大小

	private int total = 0;// 总记录数

	private boolean pagination = true;// 是否分页

	private String url;
	
	private Map<String,String[]> parameterMap=new HashMap<String,String[]>();
	
	public PageBean() {
		super();
	}
	
	public void setRequest(HttpServletRequest request){
		String page = request.getParameter("page");
		String rows = request.getParameter("rows");
		String pagination = request.getParameter("pagination");
		this.setPage(page);
		this.setRows(rows);
		this.setPagination(pagination);
		this.url=request.getContextPath()+request.getServletPath();
		this.parameterMap=request.getParameterMap();
	}
	
	public int getPreviousPage(){
		int previousPage=this.page-1;
		if(0==previousPage){
			previousPage=1;
		}
		return previousPage;
	}
	
	public int getNextPage(){
		int nextPage=this.page+1;
		if(nextPage>this.getMaxPage()){
			nextPage=this.getMaxPage();
		}
		return nextPage;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Map<String, String[]> getParameterMap() {
		return parameterMap;
	}

	public void setParameterMap(Map<String, String[]> parameterMap) {
		this.parameterMap = parameterMap;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public void setPage(String page) {
		if(null!=page&&!"".equals(page.trim())){
			this.page = Integer.parseInt(page);
		}
	}
	
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}
	
	public void setRows(String rows) {
		if(null!=rows&&!"".equals(rows.trim())){
			this.rows = Integer.parseInt(rows);
		}
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void setTotal(String total) {
		this.total = Integer.parseInt(total);
	}

	public boolean isPagination() {
		return pagination;
	}

	public void setPagination(boolean pagination) {
		this.pagination = pagination;
	}
	
	public void setPagination(String pagination) {
		if("false".equals(pagination)){
			this.pagination = false;
		}
	}

	/**
	 * 获得起始记录的下标
	 * 
	 * @return
	 */
	public int getStartIndex() {
		return (this.page - 1) * this.rows;
	}
	
	public int getMaxPage(){
		int maxpage=this.total/this.rows;
		if(0!=this.total%this.rows){
			maxpage=maxpage+1;
		}
		return maxpage;
	}
	@Override
	public String toString() {
		return "PageBean [page=" + page + ", rows=" + rows + ", total=" + total + ", pagination=" + pagination + "]";
	}

}
