package com.laioffer.tinnews2;

import android.view.View;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import static org.junit.Assert.assertNotNull;

@RunWith(value = AndroidJUnit4.class)
public class TinNewsMainActivityTest {

    @Rule
    public ActivityTestRule<TinNewsMainActivity> activityRule = new ActivityTestRule<>(TinNewsMainActivity.class);

    @Test
    public void test_bottomNavBarIsPresent() {
        TinNewsMainActivity activity = activityRule.getActivity();
        View bottomNavView = activity.findViewById(R.id.bottom_nav_view);
        View homeView = activity.findViewById(R.id.navigation_home);
        View profileView = activity.findViewById(R.id.navigation_profile);
        View saveView = activity.findViewById(R.id.navigation_save);
        View searchView = activity.findViewById(R.id.navigation_search);

        assertNotNull(bottomNavView);
        assertNotNull(homeView);
        assertNotNull(profileView);
        assertNotNull(saveView);
        assertNotNull(searchView);
    }
}