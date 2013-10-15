package com.dianping.cat.report.page.metric;

import org.unidal.web.mvc.ActionContext;
import org.unidal.web.mvc.payload.annotation.FieldMeta;

import com.dianping.cat.report.ReportPage;
import com.dianping.cat.report.page.AbstractReportPayload;

public class Payload extends AbstractReportPayload<Action> {
	private ReportPage m_page;

	@FieldMeta("op")
	private Action m_action;

	@FieldMeta("product")
	private String m_product;

	@FieldMeta("frequency")
	private int m_frequency = 10;

   @FieldMeta("refresh")
   private boolean m_refresh = false;

	@FieldMeta("test")
	private String m_test = "-1";
	
	@FieldMeta("timeRange")
	private int m_timeRange = 2;
   
   @FieldMeta("fullScreen")
   private boolean m_fullScreen = false;
	public Payload() {
		super(ReportPage.METRIC);
	}

	@Override
	public Action getAction() {
		return m_action;
	}

	@Override
	public ReportPage getPage() {
		return m_page;
	}

	public void setAction(String action) {
		m_action = Action.getByName(action, Action.METRIC);
	}

	@Override
	public void setPage(String page) {
		m_page = ReportPage.getByName(page, ReportPage.METRIC);
	}

	public String getProduct() {
		return m_product;
	}

	public void setProduct(String product) {
		m_product = product;
	}

	public String getTest() {
		return m_test;
	}

	public void setTest(String test) {
		m_test = test;
	}
	
	public int getTimeRange() {
		return m_timeRange;
	}
	
	public int getFrequency() {
   	return m_frequency;
   }

	public void setFrequency(int frequency) {
   	m_frequency = frequency;
   }

	public boolean isRefresh() {
   	return m_refresh;
   }

	public void setRefresh(boolean refresh) {
   	m_refresh = refresh;
   }

	public boolean isFullScreen() {
   	return m_fullScreen;
   }

	public void setFullScreen(boolean fullScreen) {
   	m_fullScreen = fullScreen;
   }

	@Override
	public void validate(ActionContext<?> ctx) {
		if (m_action == null) {
			m_action = Action.METRIC;
		}
	}
	
	
}
