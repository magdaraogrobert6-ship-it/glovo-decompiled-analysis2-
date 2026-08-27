package com.qualtrics.digital.theming.embedded.response;

import bo.app.af$$ExternalSyntheticOutline0;
import com.qualtrics.digital.R;
import com.qualtrics.digital.ThemingUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class StarTheme {
    private final int borderColor;

    private final int component1() {
        return this.borderColor;
    }

    public final StarTheme copy(int i) {
        return new StarTheme(i);
    }

    public int hashCode() {
        return Integer.hashCode(this.borderColor);
    }

    public final int getBorderColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.borderColor);
    }

    public /* synthetic */ StarTheme(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? R.color.qualtricsDefaultStartBorder : i);
    }

    public static /* synthetic */ StarTheme copy$default(StarTheme starTheme, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = starTheme.borderColor;
        }
        return starTheme.copy(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StarTheme) && this.borderColor == ((StarTheme) obj).borderColor;
    }

    public String toString() {
        return af$$ExternalSyntheticOutline0.m(new StringBuilder("StarTheme(borderColor="), this.borderColor, ')');
    }

    public StarTheme(int i) {
        this.borderColor = i;
    }

    public StarTheme() {
        this(0, 1, null);
    }
}
