public class WelcomeScreen {
    private String developerName;
    private String applicationName;
    public WelcomeScreen(){
        this.applicationName = "List Guidance";
        this.developerName = "Aliasghar Asgharinia";
    }
    public String getDeveloperName(){
        return developerName;
    }
    public String getApplicationName(){
        return applicationName;
    }
    public void welcomeMassage(){
        System.out.println("\nHi Dear User, Lockers Pvt. Ltd is happy to welcome newly developed application");
        System.out.println(applicationName+" was developed by "+developerName);
    }
}
