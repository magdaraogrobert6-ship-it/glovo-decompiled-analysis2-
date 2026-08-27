package com.qualtrics.digital;

import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes5.dex */
class QualtricsSurveyExpression extends Expression {
    public static final long TIME_BETWEEN_SURVEYS = 15552000000L;
    private String SurveyID;
    private Properties properties;

    public QualtricsSurveyExpression(String str, String str2, String str3, String str4) {
        super(str, str2, str3);
        this.SurveyID = str4;
        this.properties = Qualtrics.instance().properties;
    }

    @Override // com.qualtrics.digital.Expression, com.qualtrics.digital.IEvaluable
    public boolean evaluate() {
        try {
            long surveyHasBeenTaken = this.properties.getSurveyHasBeenTaken(this.SurveyID);
            String lowerCase = getOperator().toLowerCase();
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != -1493909823) {
                if (iHashCode == 686969410 && lowerCase.equals("hasnotbeentaken")) {
                    return !surveyHasBeenTaken(surveyHasBeenTaken);
                }
            } else if (lowerCase.equals("hasbeentaken")) {
                return surveyHasBeenTaken(surveyHasBeenTaken);
            }
            SentryLogcatAdapter.serializer("Qualtrics", "Unexpected variable operator: " + getOperator());
            return false;
        } catch (NullPointerException unused) {
            SentryLogcatAdapter.serializer("Qualtrics", "Unable to evaluate QualtricsSurveyExpression for " + this.SurveyID);
            return false;
        }
    }

    private boolean surveyHasBeenTaken(long j) {
        if (j != 0) {
            if (j + TIME_BETWEEN_SURVEYS <= System.currentTimeMillis()) {
                this.properties.removeSurveyHasBeenTaken(this.SurveyID);
                return false;
            }
        }
        return j != 0;
    }
}
