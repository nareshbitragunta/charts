package com.vaadin.addon.charts.model;

import com.vaadin.addon.charts.model.style.Color;
public class PlotLine extends AbstractConfigurationObject {

	private static final long serialVersionUID = 1L;
	private Color color;
	private String dashStyle;
	private String id;
	private Label label;
	private Number value;
	private Number width;
	private Number zIndex;

	public PlotLine() {
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String getDashStyle() {
		return dashStyle;
	}

	public void setDashStyle(String dashStyle) {
		this.dashStyle = dashStyle;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	public Number getValue() {
		return value;
	}

	public void setValue(Number value) {
		this.value = value;
	}

	public Number getWidth() {
		return width;
	}

	public void setWidth(Number width) {
		this.width = width;
	}

	public Number getZIndex() {
		return zIndex;
	}

	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
	}

	public PlotLine(Number value, Number width, Color color) {
		this.value = value;
		this.width = width;
		this.color = color;
	}
}