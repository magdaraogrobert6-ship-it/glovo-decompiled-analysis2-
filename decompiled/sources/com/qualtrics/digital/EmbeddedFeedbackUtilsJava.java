package com.qualtrics.digital;

import android.content.res.ColorStateList;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.qualtrics.digital.utils.TranslationUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes5.dex */
class EmbeddedFeedbackUtilsJava {
    static final String MULTIPLE_CHOICE_KEY_PREFIX = "MultipleChoiceChoicesText_";
    static final String MULTIPLE_CHOICE_OTHER_TEXT_KEY = "MultipleChoiceOtherText";
    private static final String QUESTION_FORMAT_DISPLAY_TEXT = "embedded-feedback-question-format-display-text";
    private static final String QUESTION_FORMAT_MULTIPLE_CHOICE = "embedded-feedback-question-format-multiple-choice";
    private static final String QUESTION_FORMAT_OPEN_TEXT = "embedded-feedback-question-format-open-text";

    public static int getRadioGroupBottomPadding(List<EmbeddedFeedbackCreativeQuestion> list) {
        return getFollowupQuestion(list) == null ? 20 : 40;
    }

    public static List<String> getActiveLocalizedMultipleChoices(EmbeddedFeedbackCreativeQuestion embeddedFeedbackCreativeQuestion, Map<String, Map<String, String>> map, String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < embeddedFeedbackCreativeQuestion.Choices.size()) {
            EmbeddedFeedbackChoice embeddedFeedbackChoice = embeddedFeedbackCreativeQuestion.Choices.get(i);
            i++;
            String strM = c8$$ExternalSyntheticOutline0.m(i, MULTIPLE_CHOICE_KEY_PREFIX);
            if (embeddedFeedbackChoice.Active && !embeddedFeedbackChoice.CId.equals("Other")) {
                arrayList.add(getTranslation(embeddedFeedbackChoice.Display, map, str, strM));
            }
        }
        return arrayList;
    }

    public static String getTranslation(String str, Map<String, Map<String, String>> map, String str2, String str3) {
        try {
            Map<String, String> translationsInSupportedLang = new TranslationUtils().getTranslationsInSupportedLang(map, str2);
            if (translationsInSupportedLang != null && translationsInSupportedLang.get("A") != null && Boolean.parseBoolean(translationsInSupportedLang.get("A")) && translationsInSupportedLang.get(str3) != null) {
                return translationsInSupportedLang.get(str3);
            }
        } catch (Exception unused) {
        }
        return str;
    }

    public static String getTranslatedMultipleChoiceOtherOption(EmbeddedFeedbackCreativeQuestion embeddedFeedbackCreativeQuestion, Map<String, Map<String, String>> map, String str) {
        if (((EmbeddedFeedbackChoice) r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer(1, embeddedFeedbackCreativeQuestion.Choices)).CId.equals("Other") && ((EmbeddedFeedbackChoice) r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer(1, embeddedFeedbackCreativeQuestion.Choices)).Active) {
            return getTranslation(((EmbeddedFeedbackChoice) r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer(1, embeddedFeedbackCreativeQuestion.Choices)).Display, map, str, MULTIPLE_CHOICE_OTHER_TEXT_KEY);
        }
        return null;
    }

    public static EmbeddedFeedbackCreativeQuestion getFollowupQuestion(List<EmbeddedFeedbackCreativeQuestion> list) {
        for (EmbeddedFeedbackCreativeQuestion embeddedFeedbackCreativeQuestion : list) {
            if (embeddedFeedbackCreativeQuestion.Format.equals(QUESTION_FORMAT_OPEN_TEXT)) {
                return embeddedFeedbackCreativeQuestion;
            }
        }
        return null;
    }

    public static EmbeddedFeedbackCreativeQuestion getMultipleChoiceQuestion(List<EmbeddedFeedbackCreativeQuestion> list) {
        for (EmbeddedFeedbackCreativeQuestion embeddedFeedbackCreativeQuestion : list) {
            if (embeddedFeedbackCreativeQuestion.Format.equals(QUESTION_FORMAT_MULTIPLE_CHOICE)) {
                return embeddedFeedbackCreativeQuestion;
            }
        }
        return null;
    }

    public static EmbeddedFeedbackCreativeQuestion getThankYouMessage(List<EmbeddedFeedbackCreativeQuestion> list) {
        for (EmbeddedFeedbackCreativeQuestion embeddedFeedbackCreativeQuestion : list) {
            if (embeddedFeedbackCreativeQuestion.Format.equals(QUESTION_FORMAT_DISPLAY_TEXT)) {
                return embeddedFeedbackCreativeQuestion;
            }
        }
        return null;
    }

    public static ColorStateList getRadioButtonColorList(int i, int i2) {
        return new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{android.R.attr.state_checked}}, new int[]{i2, i});
    }
}
