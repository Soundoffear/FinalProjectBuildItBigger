package com.udacity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.v4.util.Pair;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)

public class EndpointsAsyncTaskTest {

    EndpointsAsyncTask endpointsAsyncTask;

    @Before
    public void instantiateEndpointClass() {
        endpointsAsyncTask = new EndpointsAsyncTask();
    }

    @Test
    public void testStringNotNull() {
        endpointsAsyncTask.execute(new Pair<>(InstrumentationRegistry.getTargetContext(), "Test string"));

        String stringToValidate = null;

        try {
            stringToValidate = endpointsAsyncTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        assert stringToValidate != null;
        assertTrue(stringToValidate.length() > 0);
    }

}