package com.qualtrics.digital.theming.embedded.response;

import bo.app.af$$ExternalSyntheticOutline0;
import com.qualtrics.digital.R;
import com.qualtrics.digital.ThemingUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class ThumbsButtonsTheme {
    private final int thumbDownBorderColor;
    private final int thumbDownFillColor;
    private final int thumbUpBorderColor;
    private final int thumbUpFillColor;

    private final int component1() {
        return this.thumbUpBorderColor;
    }

    private final int component2() {
        return this.thumbUpFillColor;
    }

    private final int component3() {
        return this.thumbDownBorderColor;
    }

    private final int component4() {
        return this.thumbDownFillColor;
    }

    public final ThumbsButtonsTheme copy(int i, int i2, int i3, int i4) {
        return new ThumbsButtonsTheme(i, i2, i3, i4);
    }

    public int hashCode() {
        return Integer.hashCode(this.thumbDownFillColor) + af$$ExternalSyntheticOutline0.m(this.thumbDownBorderColor, af$$ExternalSyntheticOutline0.m(this.thumbUpFillColor, Integer.hashCode(this.thumbUpBorderColor) * 31, 31), 31);
    }

    public final int getThumbDownBorderColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.thumbDownBorderColor);
    }

    public final int getThumbDownFillColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.thumbDownFillColor);
    }

    public final int getThumbUpBorderColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.thumbUpBorderColor);
    }

    public final int getThumbUpFillColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.thumbUpFillColor);
    }

    public /* synthetic */ ThumbsButtonsTheme(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? R.color.qualtricsDefaultButton : i, (i5 & 2) != 0 ? R.color.qualtricsDefaultBackground : i2, (i5 & 4) != 0 ? R.color.qualtricsDefaultButton : i3, (i5 & 8) != 0 ? R.color.qualtricsDefaultBackground : i4);
    }

    public static /* synthetic */ ThumbsButtonsTheme copy$default(ThumbsButtonsTheme thumbsButtonsTheme, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = thumbsButtonsTheme.thumbUpBorderColor;
        }
        if ((i5 & 2) != 0) {
            i2 = thumbsButtonsTheme.thumbUpFillColor;
        }
        if ((i5 & 4) != 0) {
            i3 = thumbsButtonsTheme.thumbDownBorderColor;
        }
        if ((i5 & 8) != 0) {
            i4 = thumbsButtonsTheme.thumbDownFillColor;
        }
        return thumbsButtonsTheme.copy(i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThumbsButtonsTheme)) {
            return false;
        }
        ThumbsButtonsTheme thumbsButtonsTheme = (ThumbsButtonsTheme) obj;
        return this.thumbUpBorderColor == thumbsButtonsTheme.thumbUpBorderColor && this.thumbUpFillColor == thumbsButtonsTheme.thumbUpFillColor && this.thumbDownBorderColor == thumbsButtonsTheme.thumbDownBorderColor && this.thumbDownFillColor == thumbsButtonsTheme.thumbDownFillColor;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ThumbsButtonsTheme(thumbUpBorderColor=");
        sb.append(this.thumbUpBorderColor);
        sb.append(", thumbUpFillColor=");
        sb.append(this.thumbUpFillColor);
        sb.append(", thumbDownBorderColor=");
        sb.append(this.thumbDownBorderColor);
        sb.append(", thumbDownFillColor=");
        return af$$ExternalSyntheticOutline0.m(sb, this.thumbDownFillColor, ')');
    }

    public ThumbsButtonsTheme(int i, int i2, int i3, int i4) {
        this.thumbUpBorderColor = i;
        this.thumbUpFillColor = i2;
        this.thumbDownBorderColor = i3;
        this.thumbDownFillColor = i4;
    }

    public ThumbsButtonsTheme() {
        this(0, 0, 0, 0, 15, null);
    }
}
