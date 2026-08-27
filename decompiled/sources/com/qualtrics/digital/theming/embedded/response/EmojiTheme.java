package com.qualtrics.digital.theming.embedded.response;

import bo.app.af$$ExternalSyntheticOutline0;
import com.qualtrics.digital.R;
import com.qualtrics.digital.ThemingUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class EmojiTheme {
    private final int borderColor;
    private final int fillColor;
    private final int tintColor;

    public final int component1() {
        return this.borderColor;
    }

    public final int component2() {
        return this.fillColor;
    }

    public final int component3() {
        return this.tintColor;
    }

    public final EmojiTheme copy(int i, int i2, int i3) {
        return new EmojiTheme(i, i2, i3);
    }

    public int hashCode() {
        return Integer.hashCode(this.tintColor) + af$$ExternalSyntheticOutline0.m(this.fillColor, Integer.hashCode(this.borderColor) * 31, 31);
    }

    public final int getBorderColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.borderColor);
    }

    public final int getFillColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.fillColor);
    }

    public final int getTintColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.tintColor);
    }

    public /* synthetic */ EmojiTheme(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? R.color.qualtricsDefaultCustomEmojiBorder : i, (i4 & 2) != 0 ? R.color.qualtricsDefaultCustomEmojiFill : i2, (i4 & 4) != 0 ? R.color.qualtricsDefaultCustomEmojiBorder : i3);
    }

    public static /* synthetic */ EmojiTheme copy$default(EmojiTheme emojiTheme, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = emojiTheme.borderColor;
        }
        if ((i4 & 2) != 0) {
            i2 = emojiTheme.fillColor;
        }
        if ((i4 & 4) != 0) {
            i3 = emojiTheme.tintColor;
        }
        return emojiTheme.copy(i, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmojiTheme)) {
            return false;
        }
        EmojiTheme emojiTheme = (EmojiTheme) obj;
        return this.borderColor == emojiTheme.borderColor && this.fillColor == emojiTheme.fillColor && this.tintColor == emojiTheme.tintColor;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EmojiTheme(borderColor=");
        sb.append(this.borderColor);
        sb.append(", fillColor=");
        sb.append(this.fillColor);
        sb.append(", tintColor=");
        return af$$ExternalSyntheticOutline0.m(sb, this.tintColor, ')');
    }

    public final int getBorderColor() {
        return this.borderColor;
    }

    public final int getFillColor() {
        return this.fillColor;
    }

    public final int getTintColor() {
        return this.tintColor;
    }

    public EmojiTheme(int i, int i2, int i3) {
        this.borderColor = i;
        this.fillColor = i2;
        this.tintColor = i3;
    }

    public EmojiTheme() {
        this(0, 0, 0, 7, null);
    }
}
