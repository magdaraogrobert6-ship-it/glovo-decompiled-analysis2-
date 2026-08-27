package com.qualtrics.digital.theming.embedded;

import bo.app.af$$ExternalSyntheticOutline0;
import com.qualtrics.digital.R;
import com.qualtrics.digital.ThemingUtils;
import com.qualtrics.digital.theming.fonts.FontTheme;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class SubmitButtonTheme {
    private final int fillColor;
    private final FontTheme font;
    private final int textColor;

    private final int component1() {
        return this.textColor;
    }

    private final int component2() {
        return this.fillColor;
    }

    public final FontTheme component3() {
        return this.font;
    }

    public final FontTheme getFont() {
        return this.font;
    }

    public int hashCode() {
        return this.font.hashCode() + af$$ExternalSyntheticOutline0.m(this.fillColor, Integer.hashCode(this.textColor) * 31, 31);
    }

    public final int getFillColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.fillColor);
    }

    public final int getTextColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.textColor);
    }

    public /* synthetic */ SubmitButtonTheme(int i, int i2, FontTheme fontTheme, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? R.color.qualtricsDefaultBackground : i, (i3 & 2) != 0 ? R.color.qualtricsDefaultButton : i2, (i3 & 4) != 0 ? new FontTheme(0, 14, 1, null) : fontTheme);
    }

    public static /* synthetic */ SubmitButtonTheme copy$default(SubmitButtonTheme submitButtonTheme, int i, int i2, FontTheme fontTheme, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = submitButtonTheme.textColor;
        }
        if ((i3 & 2) != 0) {
            i2 = submitButtonTheme.fillColor;
        }
        if ((i3 & 4) != 0) {
            fontTheme = submitButtonTheme.font;
        }
        return submitButtonTheme.copy(i, i2, fontTheme);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitButtonTheme)) {
            return false;
        }
        SubmitButtonTheme submitButtonTheme = (SubmitButtonTheme) obj;
        if (this.textColor != submitButtonTheme.textColor || this.fillColor != submitButtonTheme.fillColor) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.font, submitButtonTheme.font}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "SubmitButtonTheme(textColor=" + this.textColor + ", fillColor=" + this.fillColor + ", font=" + this.font + ')';
    }

    public final SubmitButtonTheme copy(int i, int i2, FontTheme fontTheme) {
        fontTheme.getClass();
        return new SubmitButtonTheme(i, i2, fontTheme);
    }

    public SubmitButtonTheme(int i, int i2, FontTheme fontTheme) {
        fontTheme.getClass();
        this.textColor = i;
        this.fillColor = i2;
        this.font = fontTheme;
    }

    public SubmitButtonTheme() {
        this(0, 0, null, 7, null);
    }
}
