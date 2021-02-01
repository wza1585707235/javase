package Day15.CollectionDemo1;

import java.util.Collection;
import java.util.Collections;

public class MyList<E>{
    //该方法中使用的泛型和E类型不一致，该未知类型只在method方法内使用
    public void method(Collection<?extends Demo3> collection) {

    }
}
