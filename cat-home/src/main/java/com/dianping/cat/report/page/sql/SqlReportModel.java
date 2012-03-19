package com.dianping.cat.report.page.sql;

import com.dianping.cat.job.sql.dal.SqlReportRecord;

public class SqlReportModel {
	private SqlReportRecord m_record;


	public SqlReportModel(SqlReportRecord record) {
		m_record = record;
	}

	public double getFailurePercent() {
		return (double)m_record.getFailures() / (double)m_record.getTotalCount();
	}

	public double getLongPercent() {
		return (double)m_record.getLongSqls() / (double)m_record.getTotalCount();
	}

	public double getAvg() {
		return (double)m_record.getSumvalue() / (double)m_record.getTotalCount();
	}

	public double getStd() {
		double sum2 = m_record.getSum2value();
		int count = m_record.getTotalCount();
		double avg = m_record.getSumvalue() / m_record.getTotalCount();
		return Math.sqrt(sum2 / count - avg * avg);
	}

	public SqlReportRecord getRecord() {
		return m_record;
	}

	public void setRecord(SqlReportRecord record) {
		m_record = record;
	}

}
