package com.otoprak;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

@ManagedBean
@SessionScoped
public class ChartView implements Serializable {

	private LineChartModel areaModel;

	@PostConstruct
	public void init() {
		createAreaModel();
	}

	public LineChartModel getAreaModel() {
		return areaModel;
	}

	private void createAreaModel() {
		areaModel = new LineChartModel();

		LineChartSeries boys = new LineChartSeries();
		boys.setFill(true);
		boys.setLabel("Dolar");
		boys.set("2004", 2.0);
		boys.set("2005", 2.2);
		boys.set("2006", 2.4);
		boys.set("2007", 2.6);
		boys.set("2017", 3.55);

		LineChartSeries girls = new LineChartSeries();
		girls.setFill(true);
		girls.setLabel("Euro");
		girls.set("2004", 2);
		girls.set("2005", 2.3);
		girls.set("2006", 2.6);
		girls.set("2007", 2.8);
		girls.set("2017", 3.8);

		areaModel.addSeries(boys);
		areaModel.addSeries(girls);

		areaModel.setTitle("Area Chart");
		areaModel.setLegendPosition("ne");
		areaModel.setStacked(true);
		areaModel.setShowPointLabels(true);

		Axis xAxis = new CategoryAxis("Yýl");
		areaModel.getAxes().put(AxisType.X, xAxis);
		Axis yAxis = areaModel.getAxis(AxisType.Y);
		yAxis.setLabel("Artýþ");
		yAxis.setMin(2);
		yAxis.setMax(4);
	}
	
	public void setAreaModel(LineChartModel areaModel) {
		this.areaModel = areaModel;
	}

}
