package com.qualtrics.digital.theming.embedded;

import bo.app.af$$ExternalSyntheticOutline0;
import com.qualtrics.digital.R;
import com.qualtrics.digital.ThemingUtils;
import com.qualtrics.digital.theming.fonts.FontTheme;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class MultipleChoiceTheme {
    private final int otherAnswerBackgroundColor;
    private final int otherAnswerTextColor;
    private final FontTheme otherAnswerTextFont;
    private final FontTheme questionTextFont;
    private final RadioButtonsTheme radioButtonsTheme;

    private final int component2() {
        return this.otherAnswerTextColor;
    }

    private final int component4() {
        return this.otherAnswerBackgroundColor;
    }

    public final FontTheme component1() {
        return this.questionTextFont;
    }

    public final FontTheme component3() {
        return this.otherAnswerTextFont;
    }

    public final RadioButtonsTheme component5() {
        return this.radioButtonsTheme;
    }

    public final FontTheme getOtherAnswerTextFont() {
        return this.otherAnswerTextFont;
    }

    public final FontTheme getQuestionTextFont() {
        return this.questionTextFont;
    }

    public final RadioButtonsTheme getRadioButtonsTheme() {
        return this.radioButtonsTheme;
    }

    public int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(this.otherAnswerTextColor, this.questionTextFont.hashCode() * 31, 31);
        return this.radioButtonsTheme.hashCode() + af$$ExternalSyntheticOutline0.m(this.otherAnswerBackgroundColor, (this.otherAnswerTextFont.hashCode() + iM) * 31, 31);
    }

    public final MultipleChoiceTheme copy(FontTheme fontTheme, int i, FontTheme fontTheme2, int i2, RadioButtonsTheme radioButtonsTheme) {
        fontTheme.getClass();
        fontTheme2.getClass();
        radioButtonsTheme.getClass();
        return new MultipleChoiceTheme(fontTheme, i, fontTheme2, i2, radioButtonsTheme);
    }

    public final int getOtherAnswerBackgroundColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.otherAnswerBackgroundColor);
    }

    public final int getOtherAnswerTextColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.otherAnswerTextColor);
    }

    public static /* synthetic */ MultipleChoiceTheme copy$default(MultipleChoiceTheme multipleChoiceTheme, FontTheme fontTheme, int i, FontTheme fontTheme2, int i2, RadioButtonsTheme radioButtonsTheme, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            fontTheme = multipleChoiceTheme.questionTextFont;
        }
        if ((i3 & 2) != 0) {
            i = multipleChoiceTheme.otherAnswerTextColor;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            fontTheme2 = multipleChoiceTheme.otherAnswerTextFont;
        }
        FontTheme fontTheme3 = fontTheme2;
        if ((i3 & 8) != 0) {
            i2 = multipleChoiceTheme.otherAnswerBackgroundColor;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            radioButtonsTheme = multipleChoiceTheme.radioButtonsTheme;
        }
        return multipleChoiceTheme.copy(fontTheme, i4, fontTheme3, i5, radioButtonsTheme);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultipleChoiceTheme)) {
            return false;
        }
        MultipleChoiceTheme multipleChoiceTheme = (MultipleChoiceTheme) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.questionTextFont, multipleChoiceTheme.questionTextFont}, getCieXyz.write())).booleanValue() || this.otherAnswerTextColor != multipleChoiceTheme.otherAnswerTextColor) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.otherAnswerTextFont, multipleChoiceTheme.otherAnswerTextFont}, getCieXyz.write())).booleanValue() || this.otherAnswerBackgroundColor != multipleChoiceTheme.otherAnswerBackgroundColor) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.radioButtonsTheme, multipleChoiceTheme.radioButtonsTheme}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "MultipleChoiceTheme(questionTextFont=" + this.questionTextFont + ", otherAnswerTextColor=" + this.otherAnswerTextColor + ", otherAnswerTextFont=" + this.otherAnswerTextFont + ", otherAnswerBackgroundColor=" + this.otherAnswerBackgroundColor + ", radioButtonsTheme=" + this.radioButtonsTheme + ')';
    }

    public /* synthetic */ MultipleChoiceTheme(FontTheme fontTheme, int i, FontTheme fontTheme2, int i2, RadioButtonsTheme radioButtonsTheme, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? new FontTheme(0, 20, 1, null) : fontTheme, (i3 & 2) != 0 ? R.color.qualtricsDefaultTextInput : i, (i3 & 4) != 0 ? new FontTheme(0, 18, 1, null) : fontTheme2, (i3 & 8) != 0 ? R.color.qualtricsDefaultTextInputBackground : i2, (i3 & 16) != 0 ? new RadioButtonsTheme(null, 0, 0, 0, 15, null) : radioButtonsTheme);
    }

    public MultipleChoiceTheme(FontTheme fontTheme, int i, FontTheme fontTheme2, int i2, RadioButtonsTheme radioButtonsTheme) {
        fontTheme.getClass();
        fontTheme2.getClass();
        radioButtonsTheme.getClass();
        this.questionTextFont = fontTheme;
        this.otherAnswerTextColor = i;
        this.otherAnswerTextFont = fontTheme2;
        this.otherAnswerBackgroundColor = i2;
        this.radioButtonsTheme = radioButtonsTheme;
    }

    public MultipleChoiceTheme() {
        this(null, 0, null, 0, null, 31, null);
    }
}
