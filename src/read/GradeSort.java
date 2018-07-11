package read;

import bean.Student;
import compare.SortGradeScore;
import util.Utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class GradeSort extends Base {
    public  void gradeSort() throws Exception{
        /**
         * 循环学生信息表，每次去分数表里面查询学生总分
         *
         */
        //调用父类计算总分的方法
        HashMap<String,Integer> hashMap=super.comSumScore();
        //文科
        ArrayList<String> wen=new ArrayList<>();
        //理科
        ArrayList<String> li=new ArrayList<>();
        for(Student student:students){
            //获取该学生的总分
            Integer sumScore=hashMap.get(student.getId());
            String str=student.getId()+"\t"+student.getName()+"\t"+student.getGender()+"\t"+student.getClazz()+"\t"+sumScore;
            //按文科理科分开，判断学生是文科还是理科
            if(student.getClazz().startsWith("文科")){
                wen.add(str);
            }else{
                li.add(str);
            }
        }
        /**
         * 按总分降序排序
         */
        Collections.sort(wen,new SortGradeScore());
        Collections.sort(li,new SortGradeScore());

        //增加名次
        Utils.addRank(wen);
        Utils.addRank(li);

        //保存数据到文件
        Utils.saveDataByFile(wen,"outData/文科.txt");
        Utils.saveDataByFile(li,"outData/理科.txt");
    }
}
