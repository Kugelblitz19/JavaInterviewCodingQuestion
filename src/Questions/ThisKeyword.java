package Questions;

public class ThisKeyword {
    int i;

    void setValue(int i) {
        this.i = i;


    }

    void show() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        ThisKeyword thisKeyword = new ThisKeyword();
        thisKeyword.setValue(10);
        thisKeyword.show();

    }
}