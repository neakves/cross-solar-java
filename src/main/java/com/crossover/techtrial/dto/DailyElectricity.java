package com.crossover.techtrial.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DailyElectricity class will hold sum, average,minimum and maximum electricity for a given day.
 * @author Crossover
 *
 */

public class DailyElectricity implements Serializable {
  
  private static final long serialVersionUID = 3605549122072628877L;

  @JsonProperty("date") 
  private LocalDate date;
  
  @JsonProperty("sum") 
  private Long sum;
  
  @JsonProperty("average") 
  private Double average;
  
  @JsonProperty("min") 
  private Long min;
  
  @JsonProperty("max") 
  private Long max;

  public DailyElectricity() {
	  this.sum = 0l;
	  this.min = 0l;
	  this.max = 0l;
	  this.average = 0.0;
  }
  
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public Long getSum() {
    return sum;
  }

  public void setSum(Long sum) {
    this.sum = sum;
  }

  public Double getAverage() {
    return average;
  }

  public void setAverage(Double average) {
    this.average = average;
  }

  public Long getMin() {
    return min;
  }

  public void setMin(Long min) {
    this.min = min;
  }

  public Long getMax() {
    return max;
  }

  public void setMax(Long max) {
    this.max = max;
  }

  @Override
  public String toString() {
    return "DailyElectricity [date=" + date + ", sum=" + sum + ", average="
        + average + ", min=" + min + ", max=" + max + "]";
  }

}
