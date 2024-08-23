/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/mobile-wallet/blob/master/LICENSE.md
 */
package org.mifospay.feature.passcode.theme

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import org.mifos.mobilewallet.mifospay.feature.passcode.R

internal val LatoFonts = FontFamily(
    Font(
        resId = R.font.lato_regular,
        weight = FontWeight.Normal,
        style = FontStyle.Normal,
    ),
    Font(
        resId = R.font.lato_bold,
        weight = FontWeight.Bold,
        style = FontStyle.Normal,
    ),
    Font(
        resId = R.font.lato_black,
        weight = FontWeight.Black,
        style = FontStyle.Normal,
    ),
)