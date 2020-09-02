package com.laioffer.tinnews2;

import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.fragment.app.FragmentContainerView;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

@RunWith(value = AndroidJUnit4.class)
public class TinNewsMainActivityTest {

    @Rule
    public ActivityTestRule<TinNewsMainActivity> activityRule = new ActivityTestRule<>(TinNewsMainActivity.class);

    @Test
    public void test_basicViewsIsPresent() {
        TinNewsMainActivity activity = activityRule.getActivity();

        View fragmentView = activity.findViewById(R.id.nav_host_fragment);
        assertNotNull(fragmentView);
        assertThat(fragmentView, instanceOf(FragmentContainerView.class));

        View bottomNavView = activity.findViewById(R.id.bottom_nav_view);
        assertNotNull(bottomNavView);
        assertThat(bottomNavView, instanceOf(BottomNavigationView.class));

        View homeView = activity.findViewById(R.id.navigation_home);
        View profileView = activity.findViewById(R.id.navigation_profile);
        View saveView = activity.findViewById(R.id.navigation_save);
        View searchView = activity.findViewById(R.id.navigation_search);
        assertNotNull(homeView);
        assertNotNull(profileView);
        assertNotNull(saveView);
        assertNotNull(searchView);
    }
}