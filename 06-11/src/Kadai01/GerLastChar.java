package Kadai01;

abstract class AbstDisplay {
    abstract void print(String str);
}

public class GerLastChar extends AbstDisplay{
    private int length;
    private char[] moji = new char[10];

    public void print(String str) {
        try {
            // 例外送出
            if (str.length() > 10) {
                ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException();
                throw e;
            }
            this.moji = str.toCharArray();
            this.length = str.length();
            System.out.println(moji[length-1]);
            System.out.println(length);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("10 文字を超えるため配列の要素数を超えています。");
        }
    }
}