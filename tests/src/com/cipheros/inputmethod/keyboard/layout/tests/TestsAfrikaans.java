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

import com.cipheros.inputmethod.keyboard.layout.LayoutBase;
import com.cipheros.inputmethod.keyboard.layout.Qwerty;
import com.cipheros.inputmethod.keyboard.layout.customizer.LayoutCustomizer;
import com.cipheros.inputmethod.keyboard.layout.expected.ExpectedKeyboardBuilder;

import java.util.Locale;

/**
 * af: TestsAfrikaans/qwerty
 */
@SmallTest
public final class TestsAfrikaans extends LayoutTestsBase {
    private static final Locale LOCALE = new Locale("af");
    private static final LayoutBase LAYOUT = new Qwerty(new AfrikaansCustomizer(LOCALE));

    @Override
    LayoutBase getLayout() { return LAYOUT; }

    private static class AfrikaansCustomizer extends LayoutCustomizer {
        AfrikaansCustomizer(final Locale locale) { super(locale); }

        @Override
        public ExpectedKeyboardBuilder setAccentedLetters(final ExpectedKeyboardBuilder builder) {
            return builder
                    // U+00E9: "é" LATIN SMALL LETTER E WITH ACUTE
                    // U+00E8: "è" LATIN SMALL LETTER E WITH GRAVE
                    // U+00EA: "ê" LATIN SMALL LETTER E WITH CIRCUMFLEX
                    // U+00EB: "ë" LATIN SMALL LETTER E WITH DIAERESIS
                    // U+0119: "ę" LATIN SMALL LETTER E WITH OGONEK
                    // U+0117: "ė" LATIN SMALL LETTER E WITH DOT ABOVE
                    // U+0113: "ē" LATIN SMALL LETTER E WITH MACRON
                    .setMoreKeysOf("e",
                            "\u00E9", "\u00E8", "\u00EA", "\u00EB", "\u0119", "\u0117", "\u0113")
                    // U+00FA: "ú" LATIN SMALL LETTER U WITH ACUTE
                    // U+00FB: "û" LATIN SMALL LETTER U WITH CIRCUMFLEX
                    // U+00FC: "ü" LATIN SMALL LETTER U WITH DIAERESIS
                    // U+00F9: "ù" LATIN SMALL LETTER U WITH GRAVE
                    // U+016B: "ū" LATIN SMALL LETTER U WITH MACRON
                    .setMoreKeysOf("u", "\u00FA", "\u00FB", "\u00FC", "\u00F9", "\u016B")
                    // U+00FD: "ý" LATIN SMALL LETTER Y WITH ACUTE
                    // U+0133: "ĳ" LATIN SMALL LIGATURE IJ
                    .setMoreKeysOf("y", "\u00FD", "\u0133")
                    // U+00ED: "í" LATIN SMALL LETTER I WITH ACUTE
                    // U+00EC: "ì" LATIN SMALL LETTER I WITH GRAVE
                    // U+00EF: "ï" LATIN SMALL LETTER I WITH DIAERESIS
                    // U+00EE: "î" LATIN SMALL LETTER I WITH CIRCUMFLEX
                    // U+012F: "į" LATIN SMALL LETTER I WITH OGONEK
                    // U+012B: "ī" LATIN SMALL LETTER I WITH MACRON
                    // U+0133: "ĳ" LATIN SMALL LIGATURE IJ
                    .setMoreKeysOf("i",
                            "\u00ED", "\u00EC", "\u00EF", "\u00EE", "\u012F", "\u012B", "\u0133")
                    // U+00F3: "ó" LATIN SMALL LETTER O WITH ACUTE
                    // U+00F4: "ô" LATIN SMALL LETTER O WITH CIRCUMFLEX
                    // U+00F6: "ö" LATIN SMALL LETTER O WITH DIAERESIS
                    // U+00F2: "ò" LATIN SMALL LETTER O WITH GRAVE
                    // U+00F5: "õ" LATIN SMALL LETTER O WITH TILDE
                    // U+0153: "œ" LATIN SMALL LIGATURE OE
                    // U+00F8: "ø" LATIN SMALL LETTER O WITH STROKE
                    // U+014D: "ō" LATIN SMALL LETTER O WITH MACRON
                    .setMoreKeysOf("o",
                            "\u00F3", "\u00F4", "\u00F6", "\u00F2", "\u00F5", "\u0153", "\u00F8",
                            "\u014D")
                    // U+00E1: "á" LATIN SMALL LETTER A WITH ACUTE
                    // U+00E2: "â" LATIN SMALL LETTER A WITH CIRCUMFLEX
                    // U+00E4: "ä" LATIN SMALL LETTER A WITH DIAERESIS
                    // U+00E0: "à" LATIN SMALL LETTER A WITH GRAVE
                    // U+00E6: "æ" LATIN SMALL LETTER AE
                    // U+00E3: "ã" LATIN SMALL LETTER A WITH TILDE
                    // U+00E5: "å" LATIN SMALL LETTER A WITH RING ABOVE
                    // U+0101: "ā" LATIN SMALL LETTER A WITH MACRON
                    .setMoreKeysOf("a",
                            "\u00E1", "\u00E2", "\u00E4", "\u00E0", "\u00E6", "\u00E3", "\u00E5",
                            "\u0101")
                    // U+00F1: "ñ" LATIN SMALL LETTER N WITH TILDE
                    // U+0144: "ń" LATIN SMALL LETTER N WITH ACUTE
                    .setMoreKeysOf("n", "\u00F1", "\u0144");
        }
    }
}
