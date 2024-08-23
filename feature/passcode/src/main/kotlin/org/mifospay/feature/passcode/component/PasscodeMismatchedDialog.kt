/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/mobile-wallet/blob/master/LICENSE.md
 */
package org.mifospay.feature.passcode.component

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import org.mifos.mobilewallet.mifospay.feature.passcode.R

@Composable
internal fun PasscodeMismatchedDialog(
    visible: Boolean,
    onDismiss: () -> Unit,
) {
    if (visible) {
        AlertDialog(
            shape = MaterialTheme.shapes.large,
            containerColor = Color.White,
            title = {
                Text(
                    text = stringResource(R.string.passcode_do_not_match),
                    color = Color.Black,
                )
            },
            confirmButton = {
                TextButton(onClick = onDismiss) {
                    Text(text = stringResource(R.string.try_again), color = Color.Black)
                }
            },
            onDismissRequest = onDismiss,
        )
    }
}