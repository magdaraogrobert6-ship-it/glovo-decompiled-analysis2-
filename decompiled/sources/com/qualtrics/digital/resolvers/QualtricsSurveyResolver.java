package com.qualtrics.digital.resolvers;

import com.qualtrics.digital.Properties;
import com.qualtrics.digital.Qualtrics;
import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes3.dex */
public class QualtricsSurveyResolver {
    static final long TIME_BETWEEN_SURVEYS = 15552000000L;
    String mSurveyID;
    private final Properties properties = Qualtrics.instance().properties;

    public QualtricsSurveyResolver(String str) {
        this.mSurveyID = str;
    }

    public boolean evaluateQualtricsSurvey(String str) {
        try {
            long surveyHasBeenTaken = this.properties.getSurveyHasBeenTaken(this.mSurveyID);
            int iHashCode = str.hashCode();
            if (iHashCode != -1959833159) {
                if (iHashCode == 673079365 && str.equals("HAS_NOT_BEEN_TAKEN")) {
                    return !surveyHasBeenTaken(surveyHasBeenTaken);
                }
            } else if (str.equals("HAS_BEEN_TAKEN")) {
                return surveyHasBeenTaken(surveyHasBeenTaken);
            }
            SentryLogcatAdapter.serializer("Qualtrics", "Unexpected variable operator: ".concat(str));
            return false;
        } catch (NullPointerException unused) {
            SentryLogcatAdapter.serializer("Qualtrics", "Unable to evaluate Qualtrics Survey Expression for " + this.mSurveyID);
            return false;
        }
    }

    private boolean surveyHasBeenTaken(long j) {
        if (j == 0 || j + 15552000000L > System.currentTimeMillis()) {
            return j != 0;
        }
        this.properties.removeSurveyHasBeenTaken(this.mSurveyID);
        return false;
    }
}
