package util;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Utils {
    /*
    增加名次
     */
    public static void addRank(ArrayList list){
        for(int i=0;i<list.size();i++){
            String s=(String) list.get(i);
            s=s+"\t"+(i+1);
            //替换原来位置的元素
            list.set(i,s);
        }
    }

    /*
    保存文件
     */

    public static void saveDataByFile(ArrayList<String> list,String fileName)throws Exception{
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));
        for(String s:list){
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
}
