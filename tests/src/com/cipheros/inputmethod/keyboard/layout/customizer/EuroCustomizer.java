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

package com.cipheros.inputmethod.keyboard.layout.customizer;

import com.cipheros.inputmethod.keyboard.layout.Symbols;
import com.cipheros.inputmethod.keyboard.layout.SymbolsShifted;
import com.cipheros.inputmethod.keyboard.layout.expected.ExpectedKey;

import java.util.Locale;

/**
 * The layout customize class for countries that use Euro.
 */
public class EuroCustomizer extends LayoutCustomizer {
    public EuroCustomizer(final Locale locale) {
        super(locale);
    }

    @Override
    public final ExpectedKey getCurrencyKey() { return Symbols.CURRENCY_EURO; }

    @Override
    public final ExpectedKey[] getOtherCurrencyKeys() {
        return SymbolsShifted.CURRENCIES_OTHER_THAN_EURO;
    }
}
