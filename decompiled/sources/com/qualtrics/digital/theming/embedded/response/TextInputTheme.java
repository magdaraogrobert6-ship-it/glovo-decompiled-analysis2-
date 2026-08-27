package com.qualtrics.digital.theming.embedded.response;

import bo.app.af$$ExternalSyntheticOutline0;
import com.qualtrics.digital.R;
import com.qualtrics.digital.ThemingUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class TextInputTheme {
    private final int multilineTextInputBackgroundColor;
    private final int multilineTextInputColor;

    private final int component1() {
        return this.multilineTextInputColor;
    }

    private final int component2() {
        return this.multilineTextInputBackgroundColor;
    }

    public final TextInputTheme copy(int i, int i2) {
        return new TextInputTheme(i, i2);
    }

    public int hashCode() {
        return Integer.hashCode(this.multilineTextInputBackgroundColor) + (Integer.hashCode(this.multilineTextInputColor) * 31);
    }

    public final int getMultilineTextInputBackgroundColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.multilineTextInputBackgroundColor);
    }

    public final int getMultilineTextInputColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.multilineTextInputColor);
    }

    public /* synthetic */ TextInputTheme(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? R.color.qualtricsDefaultTextInput : i, (i3 & 2) != 0 ? R.color.qualtricsDefaultTextInputBackground : i2);
    }

    public static /* synthetic */ TextInputTheme copy$default(TextInputTheme textInputTheme, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = textInputTheme.multilineTextInputColor;
        }
        if ((i3 & 2) != 0) {
            i2 = textInputTheme.multilineTextInputBackgroundColor;
        }
        return textInputTheme.copy(i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextInputTheme)) {
            return false;
        }
        TextInputTheme textInputTheme = (TextInputTheme) obj;
        return this.multilineTextInputColor == textInputTheme.multilineTextInputColor && this.multilineTextInputBackgroundColor == textInputTheme.multilineTextInputBackgroundColor;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TextInputTheme(multilineTextInputColor=");
        sb.append(this.multilineTextInputColor);
        sb.append(", multilineTextInputBackgroundColor=");
        return af$$ExternalSyntheticOutline0.m(sb, this.multilineTextInputBackgroundColor, ')');
    }

    public TextInputTheme(int i, int i2) {
        this.multilineTextInputColor = i;
        this.multilineTextInputBackgroundColor = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputTheme() {
        int i = 0;
        this(i, i, 3, null);
    }
}
