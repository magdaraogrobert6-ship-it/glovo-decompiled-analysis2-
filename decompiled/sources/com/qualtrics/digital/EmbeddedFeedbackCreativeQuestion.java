package com.qualtrics.digital;

import java.util.List;
import o.isAppSetIdReadingEnabled;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes5.dex */
class EmbeddedFeedbackCreativeQuestion implements Cloneable {
    EmbeddedFeedbackQuestionAppearance Appearance;
    List<EmbeddedFeedbackChoice> Choices;
    String Format;
    String QID;
    String QuestionText;
    String Style;
    String SurveyQuestionId;

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public EmbeddedFeedbackCreativeQuestion m4844clone() {
        try {
            EmbeddedFeedbackCreativeQuestion embeddedFeedbackCreativeQuestion = (EmbeddedFeedbackCreativeQuestion) super.clone();
            embeddedFeedbackCreativeQuestion.Appearance = this.Appearance.m4845clone();
            return embeddedFeedbackCreativeQuestion;
        } catch (CloneNotSupportedException unused) {
            int iSerializer = isAppSetIdReadingEnabled.serializer();
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, iSerializer);
            return null;
        }
    }
}
