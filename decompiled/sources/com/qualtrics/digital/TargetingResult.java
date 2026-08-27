package com.qualtrics.digital;

/* JADX INFO: loaded from: classes3.dex */
public class TargetingResult {
    private String mActionSetID;
    private String mCreativeID;
    private CreativeType mCreativeType;
    private Exception mError;
    private String mInterceptID;
    private String mSurveyUrl;
    private TargetingResultStatus mTargetingResult;

    public CreativeType getCreativeType() {
        return this.mCreativeType;
    }

    public Exception getError() {
        return this.mError;
    }

    public String getInterceptID() {
        return this.mInterceptID;
    }

    public String getSurveyUrl() {
        return this.mSurveyUrl;
    }

    public TargetingResultStatus getTargetingResultStatus() {
        return this.mTargetingResult;
    }

    public boolean passed() {
        return this.mTargetingResult == TargetingResultStatus.passed;
    }

    public void recordClick() {
        if (this.mTargetingResult == TargetingResultStatus.passed) {
            try {
                SiteInterceptService.instance().recordClick(this.mInterceptID, this.mCreativeID, this.mActionSetID);
            } catch (Exception e) {
                CrashReporter.logCrash(e);
            }
        }
    }

    public void recordImpression() {
        if (this.mTargetingResult == TargetingResultStatus.passed) {
            try {
                SiteInterceptService.instance().recordImpression(this.mInterceptID, this.mCreativeID, this.mActionSetID);
            } catch (Exception e) {
                CrashReporter.logCrash(e);
            }
        }
    }

    public TargetingResult(TargetingResultStatus targetingResultStatus, String str, Exception exc, String str2, String str3, String str4, CreativeType creativeType) {
        this(targetingResultStatus, str, exc);
        this.mInterceptID = str2;
        this.mCreativeID = str3;
        this.mActionSetID = str4;
        this.mCreativeType = creativeType;
    }

    public void setLastDisplayedTime() {
        if (this.mInterceptID != null) {
            Qualtrics.instance().properties.setLastDisplayTimeForIntercept(this.mInterceptID);
        }
    }

    public TargetingResult(TargetingResultStatus targetingResultStatus, String str, Exception exc) {
        this.mTargetingResult = targetingResultStatus;
        this.mSurveyUrl = str;
        this.mError = exc;
    }
}
