package 接口连同抽象类;

public interface MyList {
    void pushFront(int element);
    void pushBack(int element);
    void insert(int index,int element);
}
abstract class AbstractList implements MyList{
    protected  int size;

    @Override
    public void pushBack(int element) {

    }

    @Override
    public void pushFront(int element) {

    }

    @Override
    public void insert(int index, int element) {

    }
}
class MyArrayList extends AbstractList{
    @Override
    public void insert(int index, int element) {
        super.insert(index, element);
    }
}