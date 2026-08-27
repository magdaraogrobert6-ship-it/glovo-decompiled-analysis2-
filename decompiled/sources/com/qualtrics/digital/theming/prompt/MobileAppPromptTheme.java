package com.qualtrics.digital.theming.prompt;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import com.qualtrics.digital.R;
import com.qualtrics.digital.ThemingUtils;
import com.qualtrics.digital.theming.fonts.FontTheme;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class MobileAppPromptTheme {
    private final int backgroundColor;
    private final ButtonTheme buttonOneTheme;
    private final ButtonTheme buttonTwoTheme;
    private final int closeButtonBackgroundColor;
    private final int closeButtonColor;
    private final FontTheme descriptionFont;
    private final int descriptionTextColor;
    private final FontTheme headlineFont;
    private final int headlineTextColor;

    public final int component1() {
        return this.backgroundColor;
    }

    public final int component2() {
        return this.headlineTextColor;
    }

    public final FontTheme component3() {
        return this.headlineFont;
    }

    public final int component4() {
        return this.descriptionTextColor;
    }

    public final FontTheme component5() {
        return this.descriptionFont;
    }

    public final int component6() {
        return this.closeButtonColor;
    }

    public final int component7() {
        return this.closeButtonBackgroundColor;
    }

    public final ButtonTheme component8() {
        return this.buttonOneTheme;
    }

    public final ButtonTheme component9() {
        return this.buttonTwoTheme;
    }

    public final ButtonTheme getButtonOneTheme() {
        return this.buttonOneTheme;
    }

    public final ButtonTheme getButtonTwoTheme() {
        return this.buttonTwoTheme;
    }

    public final FontTheme getDescriptionFont() {
        return this.descriptionFont;
    }

    public final FontTheme getHeadlineFont() {
        return this.headlineFont;
    }

    public int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(this.headlineTextColor, Integer.hashCode(this.backgroundColor) * 31, 31);
        int iM2 = af$$ExternalSyntheticOutline0.m(this.descriptionTextColor, (this.headlineFont.hashCode() + iM) * 31, 31);
        int iM3 = af$$ExternalSyntheticOutline0.m(this.closeButtonBackgroundColor, af$$ExternalSyntheticOutline0.m(this.closeButtonColor, (this.descriptionFont.hashCode() + iM2) * 31, 31), 31);
        return this.buttonTwoTheme.hashCode() + ((this.buttonOneTheme.hashCode() + iM3) * 31);
    }

    public final MobileAppPromptTheme copy(int i, int i2, FontTheme fontTheme, int i3, FontTheme fontTheme2, int i4, int i5, ButtonTheme buttonTheme, ButtonTheme buttonTheme2) {
        fontTheme.getClass();
        fontTheme2.getClass();
        buttonTheme.getClass();
        buttonTheme2.getClass();
        return new MobileAppPromptTheme(i, i2, fontTheme, i3, fontTheme2, i4, i5, buttonTheme, buttonTheme2);
    }

    public final int getBackgroundColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.backgroundColor);
    }

    public final int getCloseButtonBackgroundColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.closeButtonBackgroundColor);
    }

    public final int getCloseButtonColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.closeButtonColor);
    }

    public final int getDescriptionTextColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.descriptionTextColor);
    }

    public final int getHeadlineTextColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.headlineTextColor);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileAppPromptTheme)) {
            return false;
        }
        MobileAppPromptTheme mobileAppPromptTheme = (MobileAppPromptTheme) obj;
        if (this.backgroundColor != mobileAppPromptTheme.backgroundColor || this.headlineTextColor != mobileAppPromptTheme.headlineTextColor) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.headlineFont, mobileAppPromptTheme.headlineFont}, getCieXyz.write())).booleanValue() || this.descriptionTextColor != mobileAppPromptTheme.descriptionTextColor) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.descriptionFont, mobileAppPromptTheme.descriptionFont}, getCieXyz.write())).booleanValue() || this.closeButtonColor != mobileAppPromptTheme.closeButtonColor || this.closeButtonBackgroundColor != mobileAppPromptTheme.closeButtonBackgroundColor) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.buttonOneTheme, mobileAppPromptTheme.buttonOneTheme}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.buttonTwoTheme, mobileAppPromptTheme.buttonTwoTheme}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "MobileAppPromptTheme(backgroundColor=" + this.backgroundColor + ", headlineTextColor=" + this.headlineTextColor + ", headlineFont=" + this.headlineFont + ", descriptionTextColor=" + this.descriptionTextColor + ", descriptionFont=" + this.descriptionFont + ", closeButtonColor=" + this.closeButtonColor + ", closeButtonBackgroundColor=" + this.closeButtonBackgroundColor + ", buttonOneTheme=" + this.buttonOneTheme + ", buttonTwoTheme=" + this.buttonTwoTheme + ')';
    }

    public /* synthetic */ MobileAppPromptTheme(int i, int i2, FontTheme fontTheme, int i3, FontTheme fontTheme2, int i4, int i5, ButtonTheme buttonTheme, ButtonTheme buttonTheme2, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        ButtonTheme buttonTheme3;
        ButtonTheme buttonTheme4;
        int i7 = (i6 & 1) != 0 ? R.color.qualtricsDefaultBackground : i;
        int i8 = (i6 & 2) != 0 ? R.color.qualtricsDefaultText : i2;
        FontTheme fontTheme3 = (i6 & 4) != 0 ? new FontTheme(0, 17, 1, null) : fontTheme;
        int i9 = (i6 & 8) != 0 ? R.color.qualtricsDefaultText : i3;
        FontTheme fontTheme4 = (i6 & 16) != 0 ? new FontTheme(0, 13, 1, null) : fontTheme2;
        int i10 = (i6 & 32) != 0 ? R.color.qualtricsDefaultCloseButton : i4;
        int i11 = (i6 & 64) != 0 ? R.color.transparent : i5;
        if ((i6 & Fields.SpotShadowColor) != 0) {
            int i12 = R.color.qualtricsDefaultButton;
            buttonTheme3 = new ButtonTheme(i12, null, R.color.white, i12, i12, 2, null);
        } else {
            buttonTheme3 = buttonTheme;
        }
        if ((i6 & Fields.RotationX) != 0) {
            int i13 = R.color.white;
            int i14 = R.color.qualtricsDefaultButton;
            buttonTheme4 = new ButtonTheme(i13, null, i14, i14, i14, 2, null);
        } else {
            buttonTheme4 = buttonTheme2;
        }
        this(i7, i8, fontTheme3, i9, fontTheme4, i10, i11, buttonTheme3, buttonTheme4);
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getCloseButtonBackgroundColor() {
        return this.closeButtonBackgroundColor;
    }

    public final int getCloseButtonColor() {
        return this.closeButtonColor;
    }

    public final int getDescriptionTextColor() {
        return this.descriptionTextColor;
    }

    public final int getHeadlineTextColor() {
        return this.headlineTextColor;
    }

    public MobileAppPromptTheme(int i, int i2, FontTheme fontTheme, int i3, FontTheme fontTheme2, int i4, int i5, ButtonTheme buttonTheme, ButtonTheme buttonTheme2) {
        fontTheme.getClass();
        fontTheme2.getClass();
        buttonTheme.getClass();
        buttonTheme2.getClass();
        this.backgroundColor = i;
        this.headlineTextColor = i2;
        this.headlineFont = fontTheme;
        this.descriptionTextColor = i3;
        this.descriptionFont = fontTheme2;
        this.closeButtonColor = i4;
        this.closeButtonBackgroundColor = i5;
        this.buttonOneTheme = buttonTheme;
        this.buttonTwoTheme = buttonTheme2;
    }

    public MobileAppPromptTheme() {
        this(0, 0, null, 0, null, 0, 0, null, null, 511, null);
    }
}
