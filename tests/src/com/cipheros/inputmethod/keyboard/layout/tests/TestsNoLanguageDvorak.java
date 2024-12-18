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

import com.cipheros.inputmethod.keyboard.layout.Dvorak;
import com.cipheros.inputmethod.keyboard.layout.LayoutBase;
import com.cipheros.inputmethod.keyboard.layout.customizer.DvorakCustomizer;
import com.cipheros.inputmethod.keyboard.layout.customizer.NoLanguageCustomizer;
import com.cipheros.inputmethod.keyboard.layout.expected.ExpectedKeyboardBuilder;

import java.util.Locale;

/**
 * zz: Alphabet/dvorak
 */
@SmallTest
public final class TestsNoLanguageDvorak extends LayoutTestsBase {
    private static final Locale LOCALE = new Locale("zz");
    private static final LayoutBase LAYOUT = new Dvorak(new NoLanguageDvorakCustomizer(LOCALE));

    @Override
    LayoutBase getLayout() { return LAYOUT; }

    private static class NoLanguageDvorakCustomizer extends DvorakCustomizer {
        private final NoLanguageCustomizer mNoLanguageCustomizer;

        NoLanguageDvorakCustomizer(final Locale locale) {
            super(locale);
            mNoLanguageCustomizer = new NoLanguageCustomizer(locale);
        }

        @Override
        public ExpectedKeyboardBuilder setAccentedLetters(final ExpectedKeyboardBuilder builder) {
            return mNoLanguageCustomizer.setAccentedLetters(builder);
        }
    }
}
