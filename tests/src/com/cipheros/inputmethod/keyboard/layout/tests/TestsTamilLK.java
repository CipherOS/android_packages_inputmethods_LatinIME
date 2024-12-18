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

import android.test.suitebuilder.annotation.Suppress;

import com.cipheros.inputmethod.keyboard.layout.LayoutBase;
import com.cipheros.inputmethod.keyboard.layout.Symbols;
import com.cipheros.inputmethod.keyboard.layout.SymbolsShifted;
import com.cipheros.inputmethod.keyboard.layout.Tamil;
import com.cipheros.inputmethod.keyboard.layout.customizer.TamilCustomizer;
import com.cipheros.inputmethod.keyboard.layout.expected.ExpectedKey;

import java.util.Locale;

/**
 * ta_LK: Tamil (Sri Lanka)/tamil
 */
@Suppress
public final class TestsTamilLK extends LayoutTestsBase {
    private static final Locale LOCALE = new Locale("ta", "LK");
    private static final LayoutBase LAYOUT = new Tamil(new TamilLKCustomizer(LOCALE));

    @Override
    LayoutBase getLayout() { return LAYOUT; }

    private static class TamilLKCustomizer extends TamilCustomizer {
        TamilLKCustomizer(final Locale locale) { super(locale); }

        @Override
        public ExpectedKey getCurrencyKey() { return CURRENCY_RUPEE; }

        @Override
        public ExpectedKey[] getOtherCurrencyKeys() {
            return SymbolsShifted.CURRENCIES_OTHER_GENERIC;
        }

        // U+0DBB/U+0DD4: "රු" SINHALA LETTER RAYANNA/SINHALA VOWEL SIGN KETTI PAA-PILLA
        private static final ExpectedKey CURRENCY_RUPEE = key("\u0DBB\u0DD4",
                Symbols.CURRENCY_GENERIC_MORE_KEYS);
    }
}
