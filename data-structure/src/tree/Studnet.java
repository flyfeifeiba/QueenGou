package tree;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/6/14 16:03
 * @Description: ${description}
 */
public class Studnet {
    private String name;
    private Integer grade;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Studnet(String name, Integer grade) {
        this.name = name;
        this.grade = grade;
    }
}
