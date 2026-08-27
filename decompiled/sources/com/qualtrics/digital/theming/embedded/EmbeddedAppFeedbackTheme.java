package com.qualtrics.digital.theming.embedded;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import com.qualtrics.digital.R;
import com.qualtrics.digital.ThemingUtils;
import com.qualtrics.digital.theming.embedded.response.EmojiTheme;
import com.qualtrics.digital.theming.embedded.response.StarTheme;
import com.qualtrics.digital.theming.embedded.response.TextInputTheme;
import com.qualtrics.digital.theming.embedded.response.ThumbsButtonsTheme;
import com.qualtrics.digital.theming.embedded.response.YesNoButtonsTheme;
import com.qualtrics.digital.theming.fonts.FontTheme;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class EmbeddedAppFeedbackTheme {
    private final int closeButtonBackgroundColor;
    private final int closeButtonColor;
    private final int dialogBackgroundColor;
    private final EmojiTheme emojiTheme;
    private final FollowupQuestionTheme followupQuestionTheme;
    private final InitialQuestionTheme initialQuestionTheme;
    private final MultipleChoiceTheme multipleChoiceTheme;
    private final StarTheme starTheme;
    private final SubmitButtonTheme submitButtonTheme;
    private final TextInputTheme textInputTheme;
    private final ThankYouTheme thankYouTheme;
    private final ThumbsButtonsTheme thumbsButtonsTheme;
    private final YesNoButtonsTheme yesNoButtonsTheme;

    private final int component1() {
        return this.dialogBackgroundColor;
    }

    private final int component2() {
        return this.closeButtonColor;
    }

    private final int component3() {
        return this.closeButtonBackgroundColor;
    }

    public final StarTheme component10() {
        return this.starTheme;
    }

    public final MultipleChoiceTheme component11() {
        return this.multipleChoiceTheme;
    }

    public final SubmitButtonTheme component12() {
        return this.submitButtonTheme;
    }

    public final TextInputTheme component13() {
        return this.textInputTheme;
    }

    public final InitialQuestionTheme component4() {
        return this.initialQuestionTheme;
    }

    public final FollowupQuestionTheme component5() {
        return this.followupQuestionTheme;
    }

    public final ThankYouTheme component6() {
        return this.thankYouTheme;
    }

    public final YesNoButtonsTheme component7() {
        return this.yesNoButtonsTheme;
    }

    public final ThumbsButtonsTheme component8() {
        return this.thumbsButtonsTheme;
    }

    public final EmojiTheme component9() {
        return this.emojiTheme;
    }

    public final EmojiTheme getEmojiTheme() {
        return this.emojiTheme;
    }

    public final FollowupQuestionTheme getFollowupQuestionTheme() {
        return this.followupQuestionTheme;
    }

    public final InitialQuestionTheme getInitialQuestionTheme() {
        return this.initialQuestionTheme;
    }

    public final MultipleChoiceTheme getMultipleChoiceTheme() {
        return this.multipleChoiceTheme;
    }

    public final StarTheme getStarTheme() {
        return this.starTheme;
    }

    public final SubmitButtonTheme getSubmitButtonTheme() {
        return this.submitButtonTheme;
    }

    public final TextInputTheme getTextInputTheme() {
        return this.textInputTheme;
    }

    public final ThankYouTheme getThankYouTheme() {
        return this.thankYouTheme;
    }

    public final ThumbsButtonsTheme getThumbsButtonsTheme() {
        return this.thumbsButtonsTheme;
    }

    public final YesNoButtonsTheme getYesNoButtonsTheme() {
        return this.yesNoButtonsTheme;
    }

    public int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(this.closeButtonBackgroundColor, af$$ExternalSyntheticOutline0.m(this.closeButtonColor, Integer.hashCode(this.dialogBackgroundColor) * 31, 31), 31);
        int iHashCode = this.initialQuestionTheme.hashCode();
        int iHashCode2 = this.followupQuestionTheme.hashCode();
        int iHashCode3 = this.thankYouTheme.hashCode();
        int iHashCode4 = this.yesNoButtonsTheme.hashCode();
        int iHashCode5 = this.thumbsButtonsTheme.hashCode();
        int iHashCode6 = this.emojiTheme.hashCode();
        int iHashCode7 = this.starTheme.hashCode();
        int iHashCode8 = this.multipleChoiceTheme.hashCode();
        return this.textInputTheme.hashCode() + ((this.submitButtonTheme.hashCode() + ((iHashCode8 + ((iHashCode7 + ((iHashCode6 + ((iHashCode5 + ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + ((iHashCode + iM) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final EmbeddedAppFeedbackTheme copy(int i, int i2, int i3, InitialQuestionTheme initialQuestionTheme, FollowupQuestionTheme followupQuestionTheme, ThankYouTheme thankYouTheme, YesNoButtonsTheme yesNoButtonsTheme, ThumbsButtonsTheme thumbsButtonsTheme, EmojiTheme emojiTheme, StarTheme starTheme, MultipleChoiceTheme multipleChoiceTheme, SubmitButtonTheme submitButtonTheme, TextInputTheme textInputTheme) {
        initialQuestionTheme.getClass();
        followupQuestionTheme.getClass();
        thankYouTheme.getClass();
        yesNoButtonsTheme.getClass();
        thumbsButtonsTheme.getClass();
        emojiTheme.getClass();
        starTheme.getClass();
        multipleChoiceTheme.getClass();
        submitButtonTheme.getClass();
        textInputTheme.getClass();
        return new EmbeddedAppFeedbackTheme(i, i2, i3, initialQuestionTheme, followupQuestionTheme, thankYouTheme, yesNoButtonsTheme, thumbsButtonsTheme, emojiTheme, starTheme, multipleChoiceTheme, submitButtonTheme, textInputTheme);
    }

    public final int getCloseButtonBackgroundColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.closeButtonBackgroundColor);
    }

    public final int getCloseButtonColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.closeButtonColor);
    }

    public final int getDialogBackgroundColor(ThemingUtils themingUtils) {
        themingUtils.getClass();
        return themingUtils.getColorByResource(this.dialogBackgroundColor);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmbeddedAppFeedbackTheme)) {
            return false;
        }
        EmbeddedAppFeedbackTheme embeddedAppFeedbackTheme = (EmbeddedAppFeedbackTheme) obj;
        if (this.dialogBackgroundColor != embeddedAppFeedbackTheme.dialogBackgroundColor || this.closeButtonColor != embeddedAppFeedbackTheme.closeButtonColor || this.closeButtonBackgroundColor != embeddedAppFeedbackTheme.closeButtonBackgroundColor) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.initialQuestionTheme, embeddedAppFeedbackTheme.initialQuestionTheme}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.followupQuestionTheme, embeddedAppFeedbackTheme.followupQuestionTheme}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.thankYouTheme, embeddedAppFeedbackTheme.thankYouTheme}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.yesNoButtonsTheme, embeddedAppFeedbackTheme.yesNoButtonsTheme}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.thumbsButtonsTheme, embeddedAppFeedbackTheme.thumbsButtonsTheme}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.emojiTheme, embeddedAppFeedbackTheme.emojiTheme}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.starTheme, embeddedAppFeedbackTheme.starTheme}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.multipleChoiceTheme, embeddedAppFeedbackTheme.multipleChoiceTheme}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.submitButtonTheme, embeddedAppFeedbackTheme.submitButtonTheme}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.textInputTheme, embeddedAppFeedbackTheme.textInputTheme}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "EmbeddedAppFeedbackTheme(dialogBackgroundColor=" + this.dialogBackgroundColor + ", closeButtonColor=" + this.closeButtonColor + ", closeButtonBackgroundColor=" + this.closeButtonBackgroundColor + ", initialQuestionTheme=" + this.initialQuestionTheme + ", followupQuestionTheme=" + this.followupQuestionTheme + ", thankYouTheme=" + this.thankYouTheme + ", yesNoButtonsTheme=" + this.yesNoButtonsTheme + ", thumbsButtonsTheme=" + this.thumbsButtonsTheme + ", emojiTheme=" + this.emojiTheme + ", starTheme=" + this.starTheme + ", multipleChoiceTheme=" + this.multipleChoiceTheme + ", submitButtonTheme=" + this.submitButtonTheme + ", textInputTheme=" + this.textInputTheme + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ EmbeddedAppFeedbackTheme(int i, int i2, int i3, InitialQuestionTheme initialQuestionTheme, FollowupQuestionTheme followupQuestionTheme, ThankYouTheme thankYouTheme, YesNoButtonsTheme yesNoButtonsTheme, ThumbsButtonsTheme thumbsButtonsTheme, EmojiTheme emojiTheme, StarTheme starTheme, MultipleChoiceTheme multipleChoiceTheme, SubmitButtonTheme submitButtonTheme, TextInputTheme textInputTheme, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        InitialQuestionTheme initialQuestionTheme2;
        ThankYouTheme thankYouTheme2;
        int i5 = (i4 & 1) != 0 ? R.color.qualtricsDefaultBackground : i;
        int i6 = (i4 & 2) != 0 ? R.color.qualtricsDefaultCloseButton : i2;
        int i7 = (i4 & 4) != 0 ? R.color.transparent : i3;
        int i8 = 3;
        int i9 = 0;
        FontTheme fontTheme = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if ((i4 & 8) != 0) {
            initialQuestionTheme2 = new InitialQuestionTheme(i9, fontTheme, i8, objArr3 == true ? 1 : 0);
        } else {
            initialQuestionTheme2 = initialQuestionTheme;
        }
        FollowupQuestionTheme followupQuestionTheme2 = (i4 & 16) != 0 ? new FollowupQuestionTheme(0, null, null, 7, null) : followupQuestionTheme;
        if ((i4 & 32) != 0) {
            thankYouTheme2 = new ThankYouTheme(i9, objArr2 == true ? 1 : 0, i8, objArr == true ? 1 : 0);
        } else {
            thankYouTheme2 = thankYouTheme;
        }
        this(i5, i6, i7, initialQuestionTheme2, followupQuestionTheme2, thankYouTheme2, (i4 & 64) != 0 ? new YesNoButtonsTheme(0, 0, 0, null, 0, 0, 0, null, 255, null) : yesNoButtonsTheme, (i4 & Fields.SpotShadowColor) != 0 ? new ThumbsButtonsTheme(0, 0, 0, 0, 15, null) : thumbsButtonsTheme, (i4 & Fields.RotationX) != 0 ? new EmojiTheme(0, 0, 0, 7, null) : emojiTheme, (i4 & Fields.RotationY) != 0 ? new StarTheme(0, 1, null) : starTheme, (i4 & Fields.RotationZ) != 0 ? new MultipleChoiceTheme(null, 0, null, 0, null, 31, null) : multipleChoiceTheme, (i4 & Fields.CameraDistance) != 0 ? new SubmitButtonTheme(0, 0, null, 7, null) : submitButtonTheme, (i4 & Fields.TransformOrigin) != 0 ? new TextInputTheme(0, 0, 3, null) : textInputTheme);
    }

    public EmbeddedAppFeedbackTheme(int i, int i2, int i3, InitialQuestionTheme initialQuestionTheme, FollowupQuestionTheme followupQuestionTheme, ThankYouTheme thankYouTheme, YesNoButtonsTheme yesNoButtonsTheme, ThumbsButtonsTheme thumbsButtonsTheme, EmojiTheme emojiTheme, StarTheme starTheme, MultipleChoiceTheme multipleChoiceTheme, SubmitButtonTheme submitButtonTheme, TextInputTheme textInputTheme) {
        initialQuestionTheme.getClass();
        followupQuestionTheme.getClass();
        thankYouTheme.getClass();
        yesNoButtonsTheme.getClass();
        thumbsButtonsTheme.getClass();
        emojiTheme.getClass();
        starTheme.getClass();
        multipleChoiceTheme.getClass();
        submitButtonTheme.getClass();
        textInputTheme.getClass();
        this.dialogBackgroundColor = i;
        this.closeButtonColor = i2;
        this.closeButtonBackgroundColor = i3;
        this.initialQuestionTheme = initialQuestionTheme;
        this.followupQuestionTheme = followupQuestionTheme;
        this.thankYouTheme = thankYouTheme;
        this.yesNoButtonsTheme = yesNoButtonsTheme;
        this.thumbsButtonsTheme = thumbsButtonsTheme;
        this.emojiTheme = emojiTheme;
        this.starTheme = starTheme;
        this.multipleChoiceTheme = multipleChoiceTheme;
        this.submitButtonTheme = submitButtonTheme;
        this.textInputTheme = textInputTheme;
    }

    public EmbeddedAppFeedbackTheme() {
        this(0, 0, 0, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }
}
