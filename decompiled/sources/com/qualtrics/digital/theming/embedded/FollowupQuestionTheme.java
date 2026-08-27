package com.qualtrics.digital.theming.embedded;

import com.qualtrics.digital.R;
import com.qualtrics.digital.ThemingUtils;
import com.qualtrics.digital.theming.fonts.FontTheme;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class FollowupQuestionTheme {
    private final int color;
    private final FontTheme followupQuestionFont;
    private final FontTheme followupQuestionTextInputFont;

    private final int component1() {
        return this.color;
    }

    public final FontTheme component2() {
        return this.followupQuestionFont;
    }

    public final FontTheme component3() {
        return this.followupQuestionTextInputFont;
    }

    public final FontTheme getFollowupQuestionFont() {
        return this.followupQuestionFont;
    }

    public final FontTheme getFollowupQuestionTextInputFont() {
        return this.followupQuestionTextInputFont;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.color);
        return this.followupQuestionTextInputFont.hashCode() + ((this.followupQuestionFont.hashCode() + (iHashCode * 31)) * 31);
    }

    public final FollowupQuestionTheme copy(int i, FontTheme fontTheme, FontTheme fontTheme2) {
        fontTheme.getClass();
        fontTheme2.getClass();
        return new FollowupQuestionTheme(i, fontTheme, fontTheme2);
    }

    public final int getColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.color);
    }

    public /* synthetic */ FollowupQuestionTheme(int i, FontTheme fontTheme, FontTheme fontTheme2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? R.color.qualtricsDefaultText : i, (i2 & 2) != 0 ? new FontTheme(0, 20, 1, null) : fontTheme, (i2 & 4) != 0 ? new FontTheme(0, 18, 1, null) : fontTheme2);
    }

    public static /* synthetic */ FollowupQuestionTheme copy$default(FollowupQuestionTheme followupQuestionTheme, int i, FontTheme fontTheme, FontTheme fontTheme2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = followupQuestionTheme.color;
        }
        if ((i2 & 2) != 0) {
            fontTheme = followupQuestionTheme.followupQuestionFont;
        }
        if ((i2 & 4) != 0) {
            fontTheme2 = followupQuestionTheme.followupQuestionTextInputFont;
        }
        return followupQuestionTheme.copy(i, fontTheme, fontTheme2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowupQuestionTheme)) {
            return false;
        }
        FollowupQuestionTheme followupQuestionTheme = (FollowupQuestionTheme) obj;
        if (this.color != followupQuestionTheme.color) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.followupQuestionFont, followupQuestionTheme.followupQuestionFont}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.followupQuestionTextInputFont, followupQuestionTheme.followupQuestionTextInputFont}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "FollowupQuestionTheme(color=" + this.color + ", followupQuestionFont=" + this.followupQuestionFont + ", followupQuestionTextInputFont=" + this.followupQuestionTextInputFont + ')';
    }

    public FollowupQuestionTheme(int i, FontTheme fontTheme, FontTheme fontTheme2) {
        fontTheme.getClass();
        fontTheme2.getClass();
        this.color = i;
        this.followupQuestionFont = fontTheme;
        this.followupQuestionTextInputFont = fontTheme2;
    }

    public FollowupQuestionTheme() {
        this(0, null, null, 7, null);
    }
}
