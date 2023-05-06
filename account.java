
package palntworldstage2;
/**
 *
 * public class take and store information of the user and displaying it
 */
public class account {

    public String name;
    private String number;
    private String gender;
    private int age;

    /**
     * Default Constructor #1.
     */
    public account() {
        this.name = "";
        this.number = "";
        this.gender = "";
        this.age = 0;
    }

    /**
     * * Constructor #2.
     *
     * @param name
     * @param number
     * @param gender
     * @param age
     */
    public account(String name, String number, String gender, int age) {
        this.name = name;
        this.number = number;
        this.gender = gender;
        this.age = age;

    }

    /**
     * * Constructor #3.
     *
     * @param name
     * @param number
     * @param gender
     */
    public account(String name, String number, String gender) {
        this.name = name;
        this.number = number;
        this.gender = gender;
    }

    /**
     * method getAge @return age.
     */
    public int getAge() {
        return age;
    }

    /**
     * method setAge take @param age .
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * method getName @return name.
     */
    public String getName() {
        return name;
    }

    /**
     * method setName take @param name .
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * method getName @return name.
     */
    public String getNumber() {
        return number;
    }

    /**
     * method setNumber @return number.
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * method getGender @return gender.
     */
    public String getGender() {
        return gender;
    }

    /**
     * method setGender @return gender.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    /**
     * method toString @return text to need print.
     */

    public String toString() {
        return "Name:" + name + "\tNumber:" + number
                + "\nGender:" + gender + "\tAge:" + age;
    }

}
