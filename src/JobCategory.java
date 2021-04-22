
/**
 * Enumeration class JobCategory
 *
 * @author Arvalinno
 * @version 25.03.2021
 */
public enum JobCategory {
    WebDeveloper("Web Developer"), FrontEnd("Front End"), BackEnd("Back End"),
    UI("UI"), UX("UX"), Devops("Devops"), DataScientist("Data Scientist"), DataAnalyst("Data Analyst");

    private String jobcategory;

    private JobCategory(String category) {
        this.jobcategory = category;

    }

    @Override
    public String toString() {
        return jobcategory;
    }

}