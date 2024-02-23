import java.util.ArrayList;

public class Demo {

			
			public static void main(String[] args) {
				String str = "m%y---_%___     897384         ((** 943-1230 jo__-lhli %sgbh%'gk nn[]{}.<>/??dle 8**72742))(((   ";
				String [] Strarr = str.split("");
				String[] Arr = {"0","9","8","7","6","5","4","3","2","1","%","-","_","(",")","*","[","]","","<" ,">","/","{","}",".","?","'"};
				
				ArrayList<String> list = new ArrayList<>();
				for (String string : Strarr) {
					list.add(string);
				}
				
				ArrayList<String> list1 = new ArrayList<>();
				for (String string : Arr) {
					list1.add(string);
				}
				
				list.removeAll(list1);
				str ="";
				for (String string : list) {
					str = str.concat(string);
				}
				str = str.replaceAll("\\s+", " ");
				Strarr = str.split("");
				str = "";
				for (int i = 0; i < Strarr.length; i++) {
					String first = String.valueOf(Strarr[i].charAt(0)).toUpperCase();
					String mid = Strarr[i].substring(0,Strarr[i].length()-1).toLowerCase();
					System.out.println(mid);
					String last = String.valueOf(Strarr[i].charAt(Strarr[i].length()-1)).toUpperCase();
					str = str + (first+mid+last);
					}
				System.out.println(str);
			}	
}
	
