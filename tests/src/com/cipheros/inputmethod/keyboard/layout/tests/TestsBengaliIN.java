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

import android.test.suitebuilder.annotation.SmallTest;

import com.cipheros.inputmethod.keyboard.layout.Bengali;
import com.cipheros.inputmethod.keyboard.layout.LayoutBase;
import com.cipheros.inputmethod.keyboard.layout.Symbols;
import com.cipheros.inputmethod.keyboard.layout.customizer.BengaliCustomizer;
import com.cipheros.inputmethod.keyboard.layout.expected.ExpectedKey;

import java.util.Locale;

/**
 * bn_IN: Bengali (India)/bengali
 */
@SmallTest
public final class TestsBengaliIN extends LayoutTestsBase {
    private static final Locale LOCALE = new Locale("bn", "IN");
    private static final LayoutBase LAYOUT = new Bengali(new BengaliINCustomzier(LOCALE));

    @Override
    LayoutBase getLayout() { return LAYOUT; }

    private static class BengaliINCustomzier extends BengaliCustomizer {
        BengaliINCustomzier(final Locale locale) { super(locale); }

        @Override
        public ExpectedKey[] getLeftShiftKeys(final boolean isPhone) { return EMPTY_KEYS; }

        @Override
        public ExpectedKey getCurrencyKey() { return CURRENCY_RUPEE; }

        // U+20B9: "₹" INDIAN RUPEE SIGN
        private static final ExpectedKey CURRENCY_RUPEE = key("\u20B9",
                Symbols.CURRENCY_GENERIC_MORE_KEYS);
    }
}
