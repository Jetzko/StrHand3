public class Start {
    public static void main(String[] args) {
        String[] array1 = {" I want ", " to learn ", " how to code! "};
        String str1 = array1[0].trim();
        String str2 = array1[1].trim();
        String str3 = array1[2].trim();
        String[] array2 = {str1, str2, str3};
        boolean statement1 = array2[0].equals("I want");
        boolean statement2 = array2[1].equals("To Learn");
        System.out.println(!(statement1 > statement2));
    }
}
