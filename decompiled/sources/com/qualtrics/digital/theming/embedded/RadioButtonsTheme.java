package com.qualtrics.digital.theming.embedded;

import bo.app.af$$ExternalSyntheticOutline0;
import com.qualtrics.digital.R;
import com.qualtrics.digital.ThemingUtils;
import com.qualtrics.digital.theming.fonts.FontTheme;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class RadioButtonsTheme {
    private final int selectedBackgroundColor;
    private final int selectedCircleColor;
    private final FontTheme textFont;
    private final int unselectedCircleColor;

    private final int component2() {
        return this.selectedCircleColor;
    }

    private final int component3() {
        return this.selectedBackgroundColor;
    }

    private final int component4() {
        return this.unselectedCircleColor;
    }

    public final FontTheme component1() {
        return this.textFont;
    }

    public final FontTheme getTextFont() {
        return this.textFont;
    }

    public int hashCode() {
        return Integer.hashCode(this.unselectedCircleColor) + af$$ExternalSyntheticOutline0.m(this.selectedBackgroundColor, af$$ExternalSyntheticOutline0.m(this.selectedCircleColor, this.textFont.hashCode() * 31, 31), 31);
    }

    public final int getSelectedBackgroundColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.selectedBackgroundColor);
    }

    public final int getSelectedCircleColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.selectedCircleColor);
    }

    public final int getUnselectedCircleColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.unselectedCircleColor);
    }

    public static /* synthetic */ RadioButtonsTheme copy$default(RadioButtonsTheme radioButtonsTheme, FontTheme fontTheme, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            fontTheme = radioButtonsTheme.textFont;
        }
        if ((i4 & 2) != 0) {
            i = radioButtonsTheme.selectedCircleColor;
        }
        if ((i4 & 4) != 0) {
            i2 = radioButtonsTheme.selectedBackgroundColor;
        }
        if ((i4 & 8) != 0) {
            i3 = radioButtonsTheme.unselectedCircleColor;
        }
        return radioButtonsTheme.copy(fontTheme, i, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadioButtonsTheme)) {
            return false;
        }
        RadioButtonsTheme radioButtonsTheme = (RadioButtonsTheme) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.textFont, radioButtonsTheme.textFont}, getCieXyz.write())).booleanValue() && this.selectedCircleColor == radioButtonsTheme.selectedCircleColor && this.selectedBackgroundColor == radioButtonsTheme.selectedBackgroundColor && this.unselectedCircleColor == radioButtonsTheme.unselectedCircleColor;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RadioButtonsTheme(textFont=");
        sb.append(this.textFont);
        sb.append(", selectedCircleColor=");
        sb.append(this.selectedCircleColor);
        sb.append(", selectedBackgroundColor=");
        sb.append(this.selectedBackgroundColor);
        sb.append(", unselectedCircleColor=");
        return af$$ExternalSyntheticOutline0.m(sb, this.unselectedCircleColor, ')');
    }

    public final RadioButtonsTheme copy(FontTheme fontTheme, int i, int i2, int i3) {
        fontTheme.getClass();
        return new RadioButtonsTheme(fontTheme, i, i2, i3);
    }

    public /* synthetic */ RadioButtonsTheme(FontTheme fontTheme, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? new FontTheme(0, 18, 1, null) : fontTheme, (i4 & 2) != 0 ? R.color.qualtricsDefaultMultipleChoiceSelection : i, (i4 & 4) != 0 ? R.color.qualtricsDefaultMultipleChoiceSelectionBackground : i2, (i4 & 8) != 0 ? R.color.qualtricsDefaultMultipleChoiceUnselectedCircle : i3);
    }

    public RadioButtonsTheme(FontTheme fontTheme, int i, int i2, int i3) {
        fontTheme.getClass();
        this.textFont = fontTheme;
        this.selectedCircleColor = i;
        this.selectedBackgroundColor = i2;
        this.unselectedCircleColor = i3;
    }

    public RadioButtonsTheme() {
        this(null, 0, 0, 0, 15, null);
    }
}
