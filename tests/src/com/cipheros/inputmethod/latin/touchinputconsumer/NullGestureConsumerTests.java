/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cipheros.inputmethod.latin.touchinputconsumer;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;

import androidx.test.filters.SmallTest;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Tests for GestureConsumer.NULL_GESTURE_CONSUMER.
 */
@SmallTest
@RunWith(AndroidJUnit4.class)
public class NullGestureConsumerTests {
    /**
     * Tests that GestureConsumer.NULL_GESTURE_CONSUMER indicates that it won't consume gesture data
     * and that its methods don't raise exceptions even for invalid data.
     */
    @Test
    public void testNullGestureConsumer() {
        assertFalse(GestureConsumer.NULL_GESTURE_CONSUMER.willConsume());
        GestureConsumer.NULL_GESTURE_CONSUMER.onInit(null, null);
        GestureConsumer.NULL_GESTURE_CONSUMER.onGestureStarted(null, null);
        GestureConsumer.NULL_GESTURE_CONSUMER.onGestureCanceled();
        GestureConsumer.NULL_GESTURE_CONSUMER.onGestureCompleted(null);
        GestureConsumer.NULL_GESTURE_CONSUMER.onImeSuggestionsProcessed(null, -1, -1, null);
    }

    /**
     * Tests that newInstance returns NULL_GESTURE_CONSUMER for invalid input.
     */
    @Test
    public void testNewInstanceGivesNullGestureConsumerForInvalidInputs() {
        assertSame(GestureConsumer.NULL_GESTURE_CONSUMER,
                GestureConsumer.newInstance(null, null, null, null));
    }
}
