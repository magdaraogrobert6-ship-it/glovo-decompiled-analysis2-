package com.qualtrics.digital;

import android.content.Context;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
class InterceptDefinition {
    ArrayList<ActionSet> ActionSets;
    DisplayOptions DisplayOptions;
    String InterceptID;
    Logic Logic;
    boolean actionSetEvaluate;
    boolean displayRateSampling;
    boolean logicEvaluate;
    private String mSurveyBaseUrl;
    ActionSet mTriggeredActionSet;
    boolean shouldDisplay;

    public String getSurveyBaseUrl() {
        return this.mSurveyBaseUrl;
    }

    public void setSurveyBaseUrl(String str) {
        this.mSurveyBaseUrl = str;
    }

    public boolean shouldDisplayIntercept() {
        return Properties.instance(null).getLastDisplayTime() + ((long) ((((this.DisplayOptions.getPreventRepeatedDisplayInDays() * 24.0d) * 60.0d) * 60.0d) * 1000.0d)) <= System.currentTimeMillis();
    }

    public InterceptDefinition(Logic logic, ArrayList<ActionSet> arrayList, DisplayOptions displayOptions, String str) {
        this.Logic = logic;
        this.ActionSets = arrayList;
        this.DisplayOptions = displayOptions;
        this.InterceptID = str;
    }

    private boolean evaluate() {
        this.shouldDisplay = shouldDisplayIntercept();
        Logic logic = this.Logic;
        this.logicEvaluate = logic != null && logic.evaluate();
        boolean zCheckSampling = SamplingUtil.checkSampling(Double.valueOf(this.DisplayOptions.getSamplingRate()));
        this.displayRateSampling = zCheckSampling;
        return this.shouldDisplay && this.logicEvaluate && zCheckSampling;
    }

    public boolean display(Context context, int i, boolean z) {
        ActionSet actionSet = this.mTriggeredActionSet;
        if (actionSet == null) {
            SentryLogcatAdapter.serializer("Qualtrics", "Attempt to call display when no survey was triggered");
            return false;
        }
        boolean zDisplay = actionSet.display(context, i, z);
        this.mTriggeredActionSet = null;
        return zDisplay;
    }

    public void evaluateAndExecuteCallback(IQualtricsCallback iQualtricsCallback, InterceptAssetVersions interceptAssetVersions) {
        LatencyReporter latencyReporter = new LatencyReporter("evaluateTargetingLogic", "");
        if (evaluate()) {
            if (this.DisplayOptions.getHasActionSetRandomization() && this.ActionSets.size() > 1) {
                Collections.shuffle(this.ActionSets);
            }
            for (ActionSet actionSet : this.ActionSets) {
                if (actionSet.evaluate()) {
                    this.mTriggeredActionSet = actionSet;
                    SiteInterceptService siteInterceptServiceInstance = SiteInterceptService.instance();
                    String str = this.InterceptID;
                    ActionSet actionSet2 = this.mTriggeredActionSet;
                    siteInterceptServiceInstance.recordPageView(str, actionSet2.Creative, actionSet2.ID);
                    actionSet.loadCreative(iQualtricsCallback, interceptAssetVersions, this.InterceptID, this.mSurveyBaseUrl);
                    latencyReporter.stopTimerAndReport();
                    return;
                }
            }
            this.actionSetEvaluate = false;
        }
        SiteInterceptService.instance().recordPageView(this.InterceptID, null, null);
        if (!this.shouldDisplay) {
            iQualtricsCallback.run(new TargetingResult(TargetingResultStatus.multipleDisplayPrevented, null, null));
        } else if (!this.logicEvaluate) {
            iQualtricsCallback.run(new TargetingResult(TargetingResultStatus.failedLogic, null, null));
        } else if (!this.displayRateSampling) {
            iQualtricsCallback.run(new TargetingResult(TargetingResultStatus.sampledOut, null, null));
        } else if (!this.actionSetEvaluate) {
            iQualtricsCallback.run(new TargetingResult(TargetingResultStatus.failedLogic, null, null));
        } else {
            iQualtricsCallback.run(new TargetingResult(TargetingResultStatus.error, null, null));
        }
        latencyReporter.stopTimerAndReport();
    }
}
