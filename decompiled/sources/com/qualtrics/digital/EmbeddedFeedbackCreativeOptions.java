package com.qualtrics.digital;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.isAppSetIdReadingEnabled;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes5.dex */
class EmbeddedFeedbackCreativeOptions implements Cloneable {
    List<EmbeddedFeedbackCreativeQuestion> Questions;
    EmbeddedFeedbackSubmitButtonAppearance SubmitButtonAppearance;
    String SurveyVersionId;
    Map<String, Map<String, String>> Translations;

    @SerializedName("ThemeOverriddenThroughSdk")
    Boolean themeOverriddenThroughSdk = Boolean.FALSE;

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public EmbeddedFeedbackCreativeOptions m4843clone() {
        try {
            EmbeddedFeedbackCreativeOptions embeddedFeedbackCreativeOptions = (EmbeddedFeedbackCreativeOptions) super.clone();
            embeddedFeedbackCreativeOptions.Questions = new ArrayList();
            Iterator<EmbeddedFeedbackCreativeQuestion> it = this.Questions.iterator();
            while (it.hasNext()) {
                embeddedFeedbackCreativeOptions.Questions.add(it.next().m4844clone());
            }
            embeddedFeedbackCreativeOptions.SubmitButtonAppearance = this.SubmitButtonAppearance.m4846clone();
            return embeddedFeedbackCreativeOptions;
        } catch (CloneNotSupportedException unused) {
            int iSerializer = isAppSetIdReadingEnabled.serializer();
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], 873218597, isAppSetIdReadingEnabled.serializer(), -873218597, iSerializer);
            return null;
        }
    }
}
