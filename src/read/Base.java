package read;

import bean.Score;
import bean.Student;
import util.ReadUtil;

import java.util.HashMap;
import java.util.List;

/**
 * Base提取公共的部分
 */
public class Base {
    //定义变量
    static List<Score> scores=null;
    static List<Student> students =null;

    static{
        //在静态代码块里面不能抛出异常
        try{
            scores=ReadUtil.readData("data/score.txt",Score.class);
            students =ReadUtil.readData("data/students.txt",Student.class);
        }catch(Exception e){
            e.printStackTrace();
        }
    }



    /**
     * 计算学生总分
     * 创建hashmap，学号对应总分
     */
    public HashMap<String,Integer> comSumScore(){
        HashMap<String,Integer> hashMap=new HashMap<>();
        //循环分数表，对每一科的分数累加
        for(Score score :scores){
            Integer integer=hashMap.get(score.getStudentid());
            if(integer==null){
                hashMap.put(score.getStudentid(),score.getScore());
            }else{
                //相同的key后面put会覆盖前面的
                hashMap.put(score.getStudentid(),integer+score.getScore());
            }
        }
        return hashMap;
    }



}
