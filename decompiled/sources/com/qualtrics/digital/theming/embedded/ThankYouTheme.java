package com.qualtrics.digital.theming.embedded;

import com.qualtrics.digital.R;
import com.qualtrics.digital.ThemingUtils;
import com.qualtrics.digital.theming.fonts.FontTheme;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class ThankYouTheme {
    private final int color;
    private final FontTheme thankYouTextFont;

    private final int component1() {
        return this.color;
    }

    public final FontTheme component2() {
        return this.thankYouTextFont;
    }

    public final FontTheme getThankYouTextFont() {
        return this.thankYouTextFont;
    }

    public int hashCode() {
        return this.thankYouTextFont.hashCode() + (Integer.hashCode(this.color) * 31);
    }

    public final int getColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.color);
    }

    public /* synthetic */ ThankYouTheme(int i, FontTheme fontTheme, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? R.color.qualtricsDefaultText : i, (i2 & 2) != 0 ? new FontTheme(0, 20, 1, null) : fontTheme);
    }

    public static /* synthetic */ ThankYouTheme copy$default(ThankYouTheme thankYouTheme, int i, FontTheme fontTheme, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = thankYouTheme.color;
        }
        if ((i2 & 2) != 0) {
            fontTheme = thankYouTheme.thankYouTextFont;
        }
        return thankYouTheme.copy(i, fontTheme);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThankYouTheme)) {
            return false;
        }
        ThankYouTheme thankYouTheme = (ThankYouTheme) obj;
        if (this.color != thankYouTheme.color) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.thankYouTextFont, thankYouTheme.thankYouTextFont}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "ThankYouTheme(color=" + this.color + ", thankYouTextFont=" + this.thankYouTextFont + ')';
    }

    public final ThankYouTheme copy(int i, FontTheme fontTheme) {
        fontTheme.getClass();
        return new ThankYouTheme(i, fontTheme);
    }

    public ThankYouTheme(int i, FontTheme fontTheme) {
        fontTheme.getClass();
        this.color = i;
        this.thankYouTextFont = fontTheme;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThankYouTheme() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }
}
