public class Strings {
    public static void main(String args[]){
        //concetenation

        String firstName = "Grishma";
        String lastName = "Golla";
        String fullName = firstName +" " +lastName;
        System.out.println(fullName);

        //1.length()
        System.out.println(fullName.length());

        //2.charAt()
        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }

        //3.compareTo(to compare String this is the best way)
        //s1>s2 then +ve
        //s1==s2 then 0
        //s1<s2 then -ve

        String name1 = "Janu";
        String name2 = "Janu2";

        if(name1.compareTo(name2) == 0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        //4.SubStrings
        //beginIndex – the beginning index, inclusive.
        //endIndex – the ending index, exclusive.
        String sentence = "My name is Grishma";
        String name = sentence.substring(10,sentence.length());
        System.out.println(name);


    }
}
