package com.cold.test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	private static List<Integer> find(String s,String srcLan,String source){
		List<Integer> list = new ArrayList<Integer>();
		String reg = s;
		if(srcLan.equals("en")){
			reg = "\\b"+s+"\\b";
		}
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(source);
		
		while(matcher.find()){
			int index = matcher.start();
			list.add(index);
		}
		return list;
	}
public static void main(String[] args) {
	String source = "测试采用包括以稀土元素或稀土化合物作添加剂或涂层的NiOOH作为正电极活性材料";
	String s = "测试";
	List<Integer> list = find(s, "zh", source);
	for (Integer integer : list) {
		System.out.println(integer);
	}
}
}
