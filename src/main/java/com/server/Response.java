package com.server;

public class Response {
  String message;
  boolean ok;

  public String getMessage() { return this.message; }

  public void setMessage(String message) { this.message = message; }

  public boolean getOK() { return this.ok; }

  public void setOK(boolean ok) { this.ok = ok; }

  public String toString() {
    return "[" + message + "," + Boolean.toString(ok) + "]";
  }
}
