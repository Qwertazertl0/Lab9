/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/9/">Lab 9 Description</a>
 */
public class Employee {

    /**
     * The employee's name.
     */
    private String name;
    /**
     * The manager's name.
     */
    private String manager;

    /**
     * Constructor for initialization.
     * @param aname the name of the employee
     * @param amanager the name of the employee's manager
     */
    public Employee(final String aname, final String amanager) {
        this.name = aname;
        this.manager = amanager;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param aname name to be set as new name
     */
    public void setName(final String aname) {
        this.name = aname;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param amanager sets the manager's name
     */
    public void setManager(final String amanager) {
        this.manager = amanager;
    }
}
