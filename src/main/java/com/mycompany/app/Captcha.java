package com.mycompany.app;

public class Captcha {

  private int leftOperand;
  private int rightOperand;

  public Captcha(int pattern, int leftOperand, int operator, int rightOperand) {
    this.leftOperand = leftOperand;
    this.rightOperand = rightOperand;
  }

  public String getLeft() {
    return String.valueOf(this.leftOperand);
  }

  public String getRight() {
    if(this.rightOperand == 1)
      return "One";
    if(this.rightOperand == 5)
      return "Five";
    return "Nine";
  }
}
