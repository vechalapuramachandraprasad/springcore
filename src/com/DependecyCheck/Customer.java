package com.DependecyCheck;

public class Customer {
	private Person person;
	  private int type;
	  private String action;

	  public Person getPerson() {
	    return person;
	  }

	  public void setPerson(Person person) {
	    this.person = person;
	  }

	  public int getType() {
	    return type;
	  }

	  public void setType(int type) {
	    this.type = type;
	  }

	  public String getAction() {
	    return action;
	  }

	  public void setAction(String action) {
	    this.action = action;
	  }
	  public void dispaly()
	  {
		  System.out.println(this.toString());
	  }

	  @Override
	  public String toString() {
	    return "Customer [person=" + person + ", type=" + type + ", action="
	        + action + "]";
	  }
}

