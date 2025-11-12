package e.generic;

class Box {
    private Object item;

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }
}

class StringBox {
    private String item;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}

public class WithoutGeneric {
    public static void main(String[] args) {
        Box box = new Box();
        box.setItem("hello");
        //System.out.println(box.getItem());
        String str = (String) box.getItem(); //부모 클래스 Object는 자식 클래스 String에 넣을 수 없음. 강제 형변환 해야 함.

        box.setItem(123);
        //System.out.println(box.getItem());
        int i = (int)box.getItem();

        StringBox stringBox = new StringBox();
        stringBox.setItem("hello");
//        stringBox.setItem(123);
        String str2 = stringBox.getItem();


    }
}
