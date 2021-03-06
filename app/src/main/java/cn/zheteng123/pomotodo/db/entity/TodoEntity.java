package cn.zheteng123.pomotodo.db.entity;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * <pre>
 *     author : learner1999
 *     e-mail : roadoflearning@live.com
 *     time   : 2017/04/08
 *     desc   : 数据库 todo任务 实体类
 *     version: 1.0
 * </pre>
 */
public class TodoEntity extends RealmObject {

    private String name;
    private int category;

    @PrimaryKey
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "TodoEntity{" +
                "name='" + name + '\'' +
                ", category=" + category +
                ", id='" + id + '\'' +
                '}';
    }
}
