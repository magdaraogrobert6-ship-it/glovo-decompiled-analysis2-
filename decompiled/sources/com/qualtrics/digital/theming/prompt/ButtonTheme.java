package com.qualtrics.digital.theming.prompt;

import bo.app.af$$ExternalSyntheticOutline0;
import com.qualtrics.digital.R;
import com.qualtrics.digital.ThemingUtils;
import com.qualtrics.digital.theming.fonts.FontTheme;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class ButtonTheme {
    private final int backgroundColor;
    private final int borderColor;
    private final FontTheme font;
    private final int labelColor;
    private final int linkColor;

    private final int component1() {
        return this.labelColor;
    }

    private final int component3() {
        return this.backgroundColor;
    }

    private final int component4() {
        return this.borderColor;
    }

    private final int component5() {
        return this.linkColor;
    }

    public final FontTheme component2() {
        return this.font;
    }

    public final FontTheme getFont() {
        return this.font;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.labelColor);
        return Integer.hashCode(this.linkColor) + af$$ExternalSyntheticOutline0.m(this.borderColor, af$$ExternalSyntheticOutline0.m(this.backgroundColor, (this.font.hashCode() + (iHashCode * 31)) * 31, 31), 31);
    }

    public final int getBackgroundColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.backgroundColor);
    }

    public final int getBorderColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.borderColor);
    }

    public final int getLabelColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.labelColor);
    }

    public final int getLinkColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.linkColor);
    }

    public /* synthetic */ ButtonTheme(int i, FontTheme fontTheme, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? R.color.qualtricsDefaultButton : i, (i5 & 2) != 0 ? new FontTheme(0, 18, 1, null) : fontTheme, (i5 & 4) != 0 ? R.color.white : i2, (i5 & 8) != 0 ? R.color.qualtricsDefaultButton : i3, (i5 & 16) != 0 ? R.color.qualtricsDefaultButton : i4);
    }

    public static /* synthetic */ ButtonTheme copy$default(ButtonTheme buttonTheme, int i, FontTheme fontTheme, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = buttonTheme.labelColor;
        }
        if ((i5 & 2) != 0) {
            fontTheme = buttonTheme.font;
        }
        FontTheme fontTheme2 = fontTheme;
        if ((i5 & 4) != 0) {
            i2 = buttonTheme.backgroundColor;
        }
        int i6 = i2;
        if ((i5 & 8) != 0) {
            i3 = buttonTheme.borderColor;
        }
        int i7 = i3;
        if ((i5 & 16) != 0) {
            i4 = buttonTheme.linkColor;
        }
        return buttonTheme.copy(i, fontTheme2, i6, i7, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonTheme)) {
            return false;
        }
        ButtonTheme buttonTheme = (ButtonTheme) obj;
        if (this.labelColor != buttonTheme.labelColor) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.font, buttonTheme.font}, getCieXyz.write())).booleanValue() && this.backgroundColor == buttonTheme.backgroundColor && this.borderColor == buttonTheme.borderColor && this.linkColor == buttonTheme.linkColor;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ButtonTheme(labelColor=");
        sb.append(this.labelColor);
        sb.append(", font=");
        sb.append(this.font);
        sb.append(", backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", borderColor=");
        sb.append(this.borderColor);
        sb.append(", linkColor=");
        return af$$ExternalSyntheticOutline0.m(sb, this.linkColor, ')');
    }

    public final ButtonTheme copy(int i, FontTheme fontTheme, int i2, int i3, int i4) {
        fontTheme.getClass();
        return new ButtonTheme(i, fontTheme, i2, i3, i4);
    }

    public ButtonTheme(int i, FontTheme fontTheme, int i2, int i3, int i4) {
        fontTheme.getClass();
        this.labelColor = i;
        this.font = fontTheme;
        this.backgroundColor = i2;
        this.borderColor = i3;
        this.linkColor = i4;
    }

    public ButtonTheme() {
        this(0, null, 0, 0, 0, 31, null);
    }
}
