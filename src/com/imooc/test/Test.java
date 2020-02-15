package com.imooc.test;

public class Test {
	
	public void testSong() {
		
		Songs song1=new Songs("1001","征服","那英");
		Songs song2=new Songs("1002","沉默","那英");
		Songs song3=new Songs("1003","大海","王晨");
		Songs song4=new Songs("1001","征服","那英");

		
		System.out.println(song3.equals(song2));
		System.out.println(song1.equals(song4));

	}
	//测试播放列表
	public void testPlayList() {
		
		PlayLIst pl=new PlayLIst("轻音乐");
		Songs song4=new Songs("1001","征服","那英");
		Songs song2=new Songs("1002","沉默","那英");


		pl.addToPlayList(song4);
		pl.addToPlayList(song2);
		pl.disPlayList();
	}

	public static void main(String[] args) {
		
		Test test=new Test();
//		test.testSong();
		test.testPlayList();

	}

}
