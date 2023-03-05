package class17;

public class MPractice6 {//eCreate a method createEmail().
    // Based on values of users name, lastName and email type,
    // your method should return complete email Address.
    // Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or

    String createEmail(String firstName, String lastName, String emailType){
        return firstName+lastName+"@"+emailType+".com";
    }

    public static void main(String[] args) {
        MPractice6 task=new MPractice6();
        System.out.println(task.createEmail("zahra","sadeghi","gmail"));

    }



}
