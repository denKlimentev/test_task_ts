package page;

import page.st.*;
import page.st.StMainMenu;


public class Pages {

    private static ThreadLocal<Pages> instance = new ThreadLocal<Pages>();

    public static Pages get() {
        if (instance.get() == null) {
            instance.set(new Pages());
        }
        return instance.get();
    }
    public final StMainMenu stMainMenu;
    public final Contacts contactPage;

    private Pages() {
        stMainMenu =  new StMainMenu();
        contactPage = new Contacts();
    }

}
