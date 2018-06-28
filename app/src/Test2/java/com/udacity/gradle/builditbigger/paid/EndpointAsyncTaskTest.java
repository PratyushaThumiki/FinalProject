package com.udacity.gradle.builditbigger.paid;

import android.support.test.rule.ActivityTestRule;

import com.udacity.gradle.builditbigger.EndpointAsyncTask;
import com.udacity.gradle.builditbigger.MainActivity;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

import java.util.concurrent.ExecutionException;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {
    @Test
    public void iTest() throws Exception {
        EndpointsAsyncTaskTest Test1 =  new EndpointsAsyncTaskTest();
        Test1.execute(InstrumentationRegistry.getContext());
        String joke = Test1.get(5, TimeUnit.SECONDS);
        Assert.assertEquals(5,joke.length());
    }
}

