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
 * sw: Swahili/qwerty
 */
@SmallTest
public final class TestsSwahili extends LayoutTestsBase {
    private static final Locale LOCALE = new Locale("sw");
    private static final LayoutBase LAYOUT = new Qwerty(new SwahiliCustomizer(LOCALE));

    @Override
    LayoutBase getLayout() { return LAYOUT; }

    private static class SwahiliCustomizer extends LayoutCustomizer {
        SwahiliCustomizer(final Locale locale) { super(locale); }

        @Override
        public ExpectedKeyboardBuilder setAccentedLetters(final ExpectedKeyboardBuilder builder) {
            return builder
                    // U+00E8: "è" LATIN SMALL LETTER E WITH GRAVE
                    // U+00E9: "é" LATIN SMALL LETTER E WITH ACUTE
                    // U+00EA: "ê" LATIN SMALL LETTER E WITH CIRCUMFLEX
                    // U+00EB: "ë" LATIN SMALL LETTER E WITH DIAERESIS
                    // U+0113: "ē" LATIN SMALL LETTER E WITH MACRON
                    .setMoreKeysOf("e", "\u00E8", "\u00E9", "\u00EA", "\u00EB", "\u0113")
                    // U+00FB: "û" LATIN SMALL LETTER U WITH CIRCUMFLEX
                    // U+00FC: "ü" LATIN SMALL LETTER U WITH DIAERESIS
                    // U+00F9: "ù" LATIN SMALL LETTER U WITH GRAVE
                    // U+00FA: "ú" LATIN SMALL LETTER U WITH ACUTE
                    // U+016B: "ū" LATIN SMALL LETTER U WITH MACRON
                    .setMoreKeysOf("u", "\u00FB", "\u00FC", "\u00F9", "\u00FA", "\u016B")
                    // U+00EE: "î" LATIN SMALL LETTER I WITH CIRCUMFLEX
                    // U+00EF: "ï" LATIN SMALL LETTER I WITH DIAERESIS
                    // U+00ED: "í" LATIN SMALL LETTER I WITH ACUTE
                    // U+012B: "ī" LATIN SMALL LETTER I WITH MACRON
                    // U+00EC: "ì" LATIN SMALL LETTER I WITH GRAVE
                    .setMoreKeysOf("i", "\u00EE", "\u00EF", "\u00ED", "\u012B", "\u00EC")
                    // U+00F4: "ô" LATIN SMALL LETTER O WITH CIRCUMFLEX
                    // U+00F6: "ö" LATIN SMALL LETTER O WITH DIAERESIS
                    // U+00F2: "ò" LATIN SMALL LETTER O WITH GRAVE
                    // U+00F3: "ó" LATIN SMALL LETTER O WITH ACUTE
                    // U+0153: "œ" LATIN SMALL LIGATURE OE
                    // U+00F8: "ø" LATIN SMALL LETTER O WITH STROKE
                    // U+014D: "ō" LATIN SMALL LETTER O WITH MACRON
                    // U+00F5: "õ" LATIN SMALL LETTER O WITH TILDE
                    .setMoreKeysOf("o",
                            "\u00F4", "\u00F6", "\u00F2", "\u00F3", "\u0153", "\u00F8", "\u014D",
                            "\u00F5")
                    // U+00E1: "á" LATIN SMALL LETTER A WITH ACUTE
                    // U+00E2: "â" LATIN SMALL LETTER A WITH CIRCUMFLEX
                    // U+00E4: "ä" LATIN SMALL LETTER A WITH DIAERESIS
                    // U+00E6: "æ" LATIN SMALL LETTER AE
                    // U+00E3: "ã" LATIN SMALL LETTER A WITH TILDE
                    // U+00E5: "å" LATIN SMALL LETTER A WITH RING ABOVE
                    // U+0101: "ā" LATIN SMALL LETTER A WITH MACRON
                    .setMoreKeysOf("a",
                            "\u00E0", "\u00E1", "\u00E2", "\u00E4", "\u00E6", "\u00E3", "\u00E5",
                            "\u0101")
                    // U+00DF: "ß" LATIN SMALL LETTER SHARP S
                    .setMoreKeysOf("s", "\u00DF")
                    .setMoreKeysOf("g", "g'")
                    // U+00E7: "ç" LATIN SMALL LETTER C WITH CEDILLA
                    .setMoreKeysOf("c", "\u00E7")
                    // U+00F1: "ñ" LATIN SMALL LETTER N WITH TILDE
                    .setMoreKeysOf("n", "\u00F1");
        }
    }
}
