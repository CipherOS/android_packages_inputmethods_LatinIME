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

package com.cipheros.inputmethod.keyboard.layout.tests;

import androidx.test.filters.SmallTest;

import com.cipheros.inputmethod.keyboard.layout.LayoutBase;
import com.cipheros.inputmethod.keyboard.layout.Qwerty;
import com.cipheros.inputmethod.keyboard.layout.customizer.TurkicCustomizer;

import java.util.Locale;

/**
 * az_AZ: Azerbaijani (Azerbaijan)/qwerty
 */
@SmallTest
public final class TestsAzerbaijaniAZ extends LayoutTestsBase {
    private static final Locale LOCALE = new Locale("az", "AZ");
    private static final LayoutBase LAYOUT = new Qwerty(new TurkicCustomizer(LOCALE));

    @Override
    LayoutBase getLayout() { return LAYOUT; }
}