public class ValueDemo2 {
    public static void main(String[] args) {
        // 目标：熟悉制表符的用法

        // 特殊字符 \t
        System.out.println("name" + "age");
        System.out.println("Bob" + "18");
        // 输出结果 nameage
        // Bob18

        // 加入 \t
        System.out.println("name" + '\t' + "age");
        System.out.println("Bob" + '\t' + "18");
        // 输出结果 name age
        // Bob 18
    }
}
