package com.alfy.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Author: Alan Created: 12/12/2014.
 */

@XmlRootElement
public class Test {
  private long id;
  private String value;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
