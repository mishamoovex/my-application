package com.mishamoovex.tesring.myapplication.presentation.features

import androidx.appcompat.app.AppCompatActivity
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import com.mishamoovex.tesring.myapplication.R
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test


@HiltAndroidTest
@LargeTest
class MainActivityTest{

    @get:Rule
    var hiltRule = HiltAndroidRule(this)

    @Before
    fun setup(){
        hiltRule.inject()
    }

    @Test
    fun createNewTask() = runActivityTest<MainActivity> {
        onView(withId(R.id.fab_tasks_add)).perform(click())
        onView(withId(R.id.et_create_task_title)).perform(typeText("Task title"))
        onView((withId(R.id.et_create_task_description))).perform(typeText("Some description"))
        onView((withId(R.id.fab_create_task))).perform(click())

        //Then verify is task displayed on the screen
        onView(withText("Task title")).check(matches(isDisplayed()))
    }
}

inline fun <reified A : AppCompatActivity> runActivityTest(test: (ActivityScenario<A>.() -> Unit)){
    val activityScenario = ActivityScenario.launch(A::class.java)

    activityScenario.use { scenario ->
        test.invoke(scenario)
    }
}