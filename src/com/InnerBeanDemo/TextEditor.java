package com.InnerBeanDemo;

public class TextEditor {
	private SpellChecker spellCheckObj;
	public void setspellCheckObj(SpellChecker obj){
		 System.out.println("Inside setSpellChecker." );
		this.spellCheckObj = obj;
	}
	public SpellChecker getspellCheckObj(){
		return this.spellCheckObj;
	}
	public void spellCheck() {
	      this.spellCheckObj.checkSpelling();
	}
}
