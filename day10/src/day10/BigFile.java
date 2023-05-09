package day10;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class BigFile {
    public static void main(String[] args) {
    	//c디렉토리 안에 있는 모든파일 중에 용량이 가장 큰 파일 찾아보기
        File file = new File("C:\\"); // 대상 디렉토리 경로
        
        File[] files = file.listFiles(); // 파일 리스트 가져오기 listFiles()자체가 배열형
        long bigSize = 0;
        File bigFile = null;
        
        for (int i = 0; i<files.length;i++) {
            File tempFile = files[i];
            //System.out.println(tempFile.getName());
            if(tempFile.isDirectory())continue;//건너뛰기
            long fileSize = tempFile.length();
            if(fileSize > bigSize) {
            	bigSize = fileSize;
            	bigFile = tempFile;
            }
        }
        System.out.println("가장 큰 파일은"+bigFile.getPath());

        
    }
}
