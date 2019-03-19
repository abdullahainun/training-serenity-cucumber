package starter.navigation;

import net.thucydides.core.annotations.Step;

public class NavigateTo {

    DuckDuckGoHomePage duckDuckGoHomePage;
    KasirSakuHomePage kasirSakuHomePage;

    @Step("Open the DuckDuckGo home page")
    public void theDuckDuckGoHomePage() {
        duckDuckGoHomePage.open();
    }

    @Step("Open the kasirsaku home page")
    public void theKasirSakuHomePage() {
        kasirSakuHomePage.open();
    }
}
