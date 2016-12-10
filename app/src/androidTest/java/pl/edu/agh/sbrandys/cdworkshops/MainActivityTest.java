package pl.edu.agh.sbrandys.cdworkshops;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;

import org.junit.Test;

/**
 * Created by Sebo on 2016-12-10.
 */

public class MainActivityTest {

    @Test
    public void shouldDisplay_HelloWorld() {
        Espresso
                .onView(ViewMatchers.withId(R.id.text_view))
                .check(ViewAssertions.matches(ViewMatchers.withText("Hello World!")));
    }
}
