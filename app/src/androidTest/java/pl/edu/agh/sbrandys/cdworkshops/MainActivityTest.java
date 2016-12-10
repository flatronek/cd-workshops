package pl.edu.agh.sbrandys.cdworkshops;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

/**
 * Created by Sebo on 2016-12-10.
 */

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> rule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void shouldDisplay_HelloWorld() {
        Espresso
                .onView(ViewMatchers.withId(R.id.text_view))
                .check(ViewAssertions.matches(ViewMatchers.withText("Hello World!")));
    }
}
