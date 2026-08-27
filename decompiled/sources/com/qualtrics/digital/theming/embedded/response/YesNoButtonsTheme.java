package com.qualtrics.digital.theming.embedded.response;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import com.qualtrics.digital.R;
import com.qualtrics.digital.ThemingUtils;
import com.qualtrics.digital.theming.fonts.FontTheme;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class YesNoButtonsTheme {
    private final int noButtonBorderColor;
    private final int noButtonFillColor;
    private final FontTheme noButtonFont;
    private final int noButtonTextColor;
    private final int yesButtonBorderColor;
    private final int yesButtonFillColor;
    private final FontTheme yesButtonFont;
    private final int yesButtonTextColor;

    private final int component1() {
        return this.yesButtonTextColor;
    }

    private final int component2() {
        return this.yesButtonBorderColor;
    }

    private final int component3() {
        return this.yesButtonFillColor;
    }

    private final int component5() {
        return this.noButtonTextColor;
    }

    private final int component6() {
        return this.noButtonBorderColor;
    }

    private final int component7() {
        return this.noButtonFillColor;
    }

    public final FontTheme component4() {
        return this.yesButtonFont;
    }

    public final FontTheme component8() {
        return this.noButtonFont;
    }

    public final FontTheme getNoButtonFont() {
        return this.noButtonFont;
    }

    public final FontTheme getYesButtonFont() {
        return this.yesButtonFont;
    }

    public int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(this.yesButtonFillColor, af$$ExternalSyntheticOutline0.m(this.yesButtonBorderColor, Integer.hashCode(this.yesButtonTextColor) * 31, 31), 31);
        return this.noButtonFont.hashCode() + af$$ExternalSyntheticOutline0.m(this.noButtonFillColor, af$$ExternalSyntheticOutline0.m(this.noButtonBorderColor, af$$ExternalSyntheticOutline0.m(this.noButtonTextColor, (this.yesButtonFont.hashCode() + iM) * 31, 31), 31), 31);
    }

    public final YesNoButtonsTheme copy(int i, int i2, int i3, FontTheme fontTheme, int i4, int i5, int i6, FontTheme fontTheme2) {
        fontTheme.getClass();
        fontTheme2.getClass();
        return new YesNoButtonsTheme(i, i2, i3, fontTheme, i4, i5, i6, fontTheme2);
    }

    public final int getNoButtonBorderColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.noButtonBorderColor);
    }

    public final int getNoButtonFillColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.noButtonFillColor);
    }

    public final int getNoButtonTextColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.noButtonTextColor);
    }

    public final int getYesButtonBorderColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.yesButtonBorderColor);
    }

    public final int getYesButtonFillColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.yesButtonFillColor);
    }

    public final int getYesButtonTextColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.yesButtonTextColor);
    }

    public /* synthetic */ YesNoButtonsTheme(int i, int i2, int i3, FontTheme fontTheme, int i4, int i5, int i6, FontTheme fontTheme2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? R.color.qualtricsDefaultButton : i, (i7 & 2) != 0 ? R.color.qualtricsDefaultButton : i2, (i7 & 4) != 0 ? R.color.qualtricsDefaultBackground : i3, (i7 & 8) != 0 ? new FontTheme(0, 16, 1, null) : fontTheme, (i7 & 16) != 0 ? R.color.qualtricsDefaultButton : i4, (i7 & 32) != 0 ? R.color.qualtricsDefaultButton : i5, (i7 & 64) != 0 ? R.color.qualtricsDefaultBackground : i6, (i7 & Fields.SpotShadowColor) != 0 ? new FontTheme(0, 16, 1, null) : fontTheme2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YesNoButtonsTheme)) {
            return false;
        }
        YesNoButtonsTheme yesNoButtonsTheme = (YesNoButtonsTheme) obj;
        if (this.yesButtonTextColor != yesNoButtonsTheme.yesButtonTextColor || this.yesButtonBorderColor != yesNoButtonsTheme.yesButtonBorderColor || this.yesButtonFillColor != yesNoButtonsTheme.yesButtonFillColor) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.yesButtonFont, yesNoButtonsTheme.yesButtonFont}, getCieXyz.write())).booleanValue() || this.noButtonTextColor != yesNoButtonsTheme.noButtonTextColor || this.noButtonBorderColor != yesNoButtonsTheme.noButtonBorderColor || this.noButtonFillColor != yesNoButtonsTheme.noButtonFillColor) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.noButtonFont, yesNoButtonsTheme.noButtonFont}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "YesNoButtonsTheme(yesButtonTextColor=" + this.yesButtonTextColor + ", yesButtonBorderColor=" + this.yesButtonBorderColor + ", yesButtonFillColor=" + this.yesButtonFillColor + ", yesButtonFont=" + this.yesButtonFont + ", noButtonTextColor=" + this.noButtonTextColor + ", noButtonBorderColor=" + this.noButtonBorderColor + ", noButtonFillColor=" + this.noButtonFillColor + ", noButtonFont=" + this.noButtonFont + ')';
    }

    public YesNoButtonsTheme(int i, int i2, int i3, FontTheme fontTheme, int i4, int i5, int i6, FontTheme fontTheme2) {
        fontTheme.getClass();
        fontTheme2.getClass();
        this.yesButtonTextColor = i;
        this.yesButtonBorderColor = i2;
        this.yesButtonFillColor = i3;
        this.yesButtonFont = fontTheme;
        this.noButtonTextColor = i4;
        this.noButtonBorderColor = i5;
        this.noButtonFillColor = i6;
        this.noButtonFont = fontTheme2;
    }

    public YesNoButtonsTheme() {
        this(0, 0, 0, null, 0, 0, 0, null, 255, null);
    }
}
