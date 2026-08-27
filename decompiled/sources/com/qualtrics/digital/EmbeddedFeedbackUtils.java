package com.qualtrics.digital;

import android.content.res.ColorStateList;
import com.qualtrics.digital.theming.embedded.EmbeddedAppFeedbackTheme;
import com.qualtrics.digital.theming.embedded.response.YesNoButtonsTheme;
import com.qualtrics.digital.theming.fonts.FontTheme;
import com.qualtrics.digital.utils.TranslationUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class EmbeddedFeedbackUtils {
    public static final int BORDER_CORNER_RADIUS = 4;
    public static final int BORDER_WIDTH = 2;
    public static final int BUTTON_BORDER_MARGIN = 10;
    public static final int BUTTON_FONT_SIZE = 16;
    public static final int BUTTON_PADDING = 12;
    public static final int CUSTOM_EMOJI_BORDER = 40;
    public static final String EMBEDDED_FEEDBACK_BACKGROUND_COLOR = "#f5f5f5";
    public static final String END_QUESTIONS_TAG = "End";
    public static final String FOLLOW_UP_QUESTION_KEY = "FollowUpQuestionText";
    public static final String MAIN_QUESTION_KEY = "MainQuestionText";
    public static final int MAIN_QUESTION_PADDING = 16;
    public static final int MAIN_QUESTION_TOP_PADDING = 8;
    public static final int MULTIPLE_CHOICE_OTHER_OPTION_HEIGHT = 40;
    public static final int MULTIPLE_CHOICE_OTHER_OPTION_LEFT_PADDING = 30;
    public static final int MULTIPLE_CHOICE_OTHER_OPTION_RIGHT_PADDING = 20;
    public static final int MULTIPLE_CHOICE_PADDING = 10;
    public static final int MULTIPLE_CHOICE_QUESTION_BOTTOM_PADDING = 10;
    public static final String MULTIPLE_CHOICE_QUESTION_KEY = "MultipleChoiceQuestionText";
    public static final int MULTIPLE_CHOICE_RADIO_GROUP_LEFT_MARGIN = 18;
    public static final int MULTIPLE_CHOICE_RADIO_GROUP_TOP_MARGIN = 10;
    public static final int MULTIPLE_CHOICE_TEXT_SIZE = 18;
    public static final int MULTIPLE_CHOICE_TOP_PADDING = 10;
    public static final String NO_BUTTON_KEY = "NoButtonText";
    public static final String QUESTION_ID_FOLLOW_UP_QUESTION = "embedded-feedback-question-id-follow-up-question";
    public static final String QUESTION_ID_MULTIPLE_CHOICE = "embedded-feedback-question-id-multiple-choice-question";
    public static final String QUESTION_ID_THANK_YOU_MESSAGE = "embedded-feedback-question-id-thank-you-message";
    public static final String QUESTION_STYLE_CUSTOM = "embedded-feedback-emoji-style-custom";
    public static final String QUESTION_STYLE_DEFAULT = "embedded-feedback-emoji-style-default";
    public static final String QUESTION_STYLE_EMOJI = "embedded-feedback-question-style-emoji";
    public static final String QUESTION_STYLE_STARS = "embedded-feedback-question-style-stars";
    public static final String QUESTION_STYLE_THUMBS = "embedded-feedback-question-style-thumbs";
    public static final String QUESTION_STYLE_YES_NO = "embedded-feedback-question-style-yes-no";
    public static final String SUBMIT_BUTTON_TEXT_KEY = "SubmitButtonText";
    public static final String THANK_YOU_KEY = "ThankYouMessage";
    public static final String THUMBS_DOWN = "ThumbsDown";
    public static final String THUMBS_UP = "ThumbsUp";
    public static final int THUMB_HEIGHT = 44;
    public static final int THUMB_WIDTH = 52;
    public static final String YES_BUTTON_KEY = "YesButtonText";
    public static final EmbeddedFeedbackUtils INSTANCE = new EmbeddedFeedbackUtils();
    public static final String EXTREMELY_UNHELPFUL = "ExtremelyUnhelpful";
    public static final String SOMEWHAT_UNHELPFUL = "SomewhatUnhelpful";
    public static final String NEITHER_HELPFUL_NOR_UNHELPFUL = "NeitherHelpfulNorUnhelpful";
    public static final String SOMEWHAT_HELPFUL = "SomewhatHelpful";
    public static final String EXTREMELY_HELPFUL = "ExtremelyHelpful";
    public static final String[] FIVE_POINT_QUESTION_OPTIONS = {EXTREMELY_UNHELPFUL, SOMEWHAT_UNHELPFUL, NEITHER_HELPFUL_NOR_UNHELPFUL, SOMEWHAT_HELPFUL, EXTREMELY_HELPFUL};
    private static final TranslationUtils translationUtils = new TranslationUtils();

    private EmbeddedFeedbackUtils() {
    }

    public static final String getCloseTranslation(String str, String str2) {
        EmbeddedFeedbackUtils embeddedFeedbackUtils = INSTANCE;
        Map<String, String> map = EmbeddedFeedbackAccessibilityConstants.CLOSE_LANGUAGES;
        map.getClass();
        return embeddedFeedbackUtils.translateOrDefault(map, str2, str);
    }

    public static final String getThumbsDownTranslation(String str, String str2) {
        EmbeddedFeedbackUtils embeddedFeedbackUtils = INSTANCE;
        Map<String, String> map = EmbeddedFeedbackAccessibilityConstants.THUMBS_DOWN_LANGUAGES;
        map.getClass();
        return embeddedFeedbackUtils.translateOrDefault(map, str2, str);
    }

    public static final String getThumbsUpTranslation(String str, String str2) {
        EmbeddedFeedbackUtils embeddedFeedbackUtils = INSTANCE;
        Map<String, String> map = EmbeddedFeedbackAccessibilityConstants.THUMBS_UP_LANGUAGES;
        map.getClass();
        return embeddedFeedbackUtils.translateOrDefault(map, str2, str);
    }

    private final String translateOrDefault(Map<String, String> map, String str, String str2) {
        return translationUtils.getTranslationFromMapOrDefault(map, str, str2);
    }

    public static final String getTranslation(String str, Map<String, ? extends Map<String, String>> map, String str2, String str3) {
        if (map != null) {
            try {
                Map<String, String> translationsInSupportedLang = translationUtils.getTranslationsInSupportedLang(map, str2);
                if (translationsInSupportedLang != null && translationsInSupportedLang.get(str3) != null) {
                    return translationsInSupportedLang.get(str3);
                }
            } catch (Exception unused) {
            }
        }
        return str;
    }

    public static final FontTheme getButtonFontTheme(EmbeddedAppFeedbackTheme embeddedAppFeedbackTheme, boolean z) {
        YesNoButtonsTheme yesNoButtonsTheme;
        YesNoButtonsTheme yesNoButtonsTheme2;
        if (z) {
            if (embeddedAppFeedbackTheme == null || (yesNoButtonsTheme2 = embeddedAppFeedbackTheme.getYesNoButtonsTheme()) == null) {
                return null;
            }
            return yesNoButtonsTheme2.getYesButtonFont();
        }
        if (embeddedAppFeedbackTheme == null || (yesNoButtonsTheme = embeddedAppFeedbackTheme.getYesNoButtonsTheme()) == null) {
            return null;
        }
        return yesNoButtonsTheme.getNoButtonFont();
    }

    public static final ColorStateList getRadioButtonColorList(int i, int i2) {
        return new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{android.R.attr.state_checked}}, new int[]{i2, i});
    }

    public static final String getFivePointChoiceTranslation(int i, String str, String str2) {
        if (i == 0) {
            EmbeddedFeedbackUtils embeddedFeedbackUtils = INSTANCE;
            Map<String, String> map = EmbeddedFeedbackAccessibilityConstants.ExtremelyUnhelpful_LANGUAGES;
            map.getClass();
            return embeddedFeedbackUtils.translateOrDefault(map, str2, str);
        }
        if (i == 1) {
            EmbeddedFeedbackUtils embeddedFeedbackUtils2 = INSTANCE;
            Map<String, String> map2 = EmbeddedFeedbackAccessibilityConstants.SomewhatUnhelpful_LANGUAGES;
            map2.getClass();
            return embeddedFeedbackUtils2.translateOrDefault(map2, str2, str);
        }
        if (i == 2) {
            EmbeddedFeedbackUtils embeddedFeedbackUtils3 = INSTANCE;
            Map<String, String> map3 = EmbeddedFeedbackAccessibilityConstants.NeitherHelpfulNorUnhelpful_LANGUAGES;
            map3.getClass();
            return embeddedFeedbackUtils3.translateOrDefault(map3, str2, str);
        }
        if (i == 3) {
            EmbeddedFeedbackUtils embeddedFeedbackUtils4 = INSTANCE;
            Map<String, String> map4 = EmbeddedFeedbackAccessibilityConstants.SomewhatHelpful_LANGUAGES;
            map4.getClass();
            return embeddedFeedbackUtils4.translateOrDefault(map4, str2, str);
        }
        if (i != 4) {
            return str;
        }
        EmbeddedFeedbackUtils embeddedFeedbackUtils5 = INSTANCE;
        Map<String, String> map5 = EmbeddedFeedbackAccessibilityConstants.ExtremelyHelpful_LANGUAGES;
        map5.getClass();
        return embeddedFeedbackUtils5.translateOrDefault(map5, str2, str);
    }
}
