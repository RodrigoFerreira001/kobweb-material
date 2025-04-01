package com.catbit.mwckobweb.components.buttons.common_buttons

import androidx.compose.runtime.Composable
import com.catbit.mwckobweb.components.buttons.common_buttons.BaseButton
import com.catbit.mwckobweb.foundation.text.FontFamily
import com.catbit.mwckobweb.foundation.theme.MaterialTheme
import com.varabyte.kobweb.compose.foundation.layout.RowScope
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.styleModifier
import org.jetbrains.compose.web.css.CSSColorValue

@Composable
fun TextButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    enabled: Boolean = true,
    contentColor: CSSColorValue = MaterialTheme.colorScheme.primary,
    font: FontFamily? = MaterialTheme.typography.labelLarge.fontFamily,
    content: @Composable RowScope.() -> Unit
) {
    BaseButton(
        modifier = modifier.styleModifier {
            property("--md-text-button-label-text-color", contentColor)
            font?.let { property("--md-text-button-label-text-font", font.name) }
        },
        onClick = onClick,
        buttonStyle = "md-text-button",
        enabled = enabled,
        content = content
    )
}