package org.lang;

public class LanguageInfo extends StateDetails{
private void tamilLanguage() {
	// TODO Auto-generated method stub
System.out.println("Tamil is my mother language");
}
private void englishLanguage() {
	// TODO Auto-generated method stub
System.out.println("English is global language");
}
private void hindiLanguage() {
	// TODO Auto-generated method stub
System.out.println("Hindi is the official language of Bihar, Delhi");
}
public static void main(String[] args) {
	LanguageInfo la = new LanguageInfo();
	la.tamilLanguage();
	la.englishLanguage();
	la.hindiLanguage();
	la.southIndia();
	la.northIndia();
}
}
