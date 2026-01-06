public class StringBuilderDemo {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Grishma");
        System.out.println(sb);

        //1.char at index
        System.out.println(sb.charAt(0));

        //2.set char at index
        sb.setCharAt(0, 'S');
        System.out.println(sb);

        //3.To insert a character
        sb.insert(0,'G');
        System.out.println(sb);

        //4.Delete a charcter
        sb.delete(0,1);
        System.out.println(sb);

        //5.To Attach at the end
        sb.append(" ");
        sb.append('G');
        sb.append('o');
        sb.append('l');
        sb.append('l');
        sb.append('a');
        System.out.println(sb);

        //6.length
        System.out.println(sb.length());

        //7.

    }
}
