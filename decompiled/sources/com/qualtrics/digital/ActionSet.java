package com.qualtrics.digital;

import android.content.Context;
import android.net.Uri;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.adjust.sdk.Constants;
import com.google.gson.JsonObject;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import o.FwFClientExtensionKtgetVariationsevalResults1;
import o.getHoldoutVariationName;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.syncCustomerProfile;

/* JADX INFO: loaded from: classes3.dex */
class ActionSet {
    private ActionOptions ActionOptions;
    String Creative;
    private ArrayList<EmbeddedData> EmbeddedData;
    String ID;
    protected String InterceptID;
    private Logic Logic;
    protected Target Target;
    protected Map<String, String> embeddedDataMap = new HashMap();
    protected Creative mCreative;
    String mSurveyBaseUrl;

    private FwFClientExtensionKtgetVariationsevalResults1 getCreativeDefinitionCallback(final IQualtricsCallback iQualtricsCallback, int i) {
        Locale locale = Locale.US;
        String strSerializer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("creativeDefinition.", this.Creative);
        String str = this.Creative;
        String str2 = this.InterceptID;
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m("/WRSiteInterceptEngine/Asset.php?Module=", i, str, "&Version=", "&Q_InterceptID=");
        sbM.append(str2);
        final LatencyReporter latencyReporter = new LatencyReporter(strSerializer, sbM.toString());
        return new FwFClientExtensionKtgetVariationsevalResults1() { // from class: com.qualtrics.digital.ActionSet.1
            @Override // o.FwFClientExtensionKtgetVariationsevalResults1
            public void onFailure(syncCustomerProfile<JsonObject> synccustomerprofile, Throwable th) {
                latencyReporter.stopTimerAndReport();
                SentryLogcatAdapter.serializer("Qualtrics", "Unexpected response getting creative");
                SentryLogcatAdapter.serializer("Qualtrics", th.getMessage());
                iQualtricsCallback.run(new TargetingResult(TargetingResultStatus.error, null, new Exception(th)));
            }

            @Override // o.FwFClientExtensionKtgetVariationsevalResults1
            public void onResponse(syncCustomerProfile<JsonObject> synccustomerprofile, getHoldoutVariationName<JsonObject> getholdoutvariationname) {
                latencyReporter.stopTimerAndReport();
                String creativeType = DecoderUtils.getCreativeType(getholdoutvariationname);
                ActionSet.this.mCreative = DecoderUtils.getDecodedCreativeDefinition(getholdoutvariationname);
                ActionSet actionSet = ActionSet.this;
                Creative creative = actionSet.mCreative;
                if (creative == null) {
                    SentryLogcatAdapter.serializer("Qualtrics", "Creative JSON contains invalid type");
                    iQualtricsCallback.run(new TargetingResult(TargetingResultStatus.error, null, new Exception("Creative JSON contains invalid type")));
                    return;
                }
                creative.setSurveyUrl(actionSet.getTargetUrl());
                IQualtricsCallback iQualtricsCallback2 = iQualtricsCallback;
                TargetingResultStatus targetingResultStatus = TargetingResultStatus.passed;
                String targetUrl = ActionSet.this.getTargetUrl();
                ActionSet actionSet2 = ActionSet.this;
                iQualtricsCallback2.run(new TargetingResult(targetingResultStatus, targetUrl, null, actionSet2.InterceptID, actionSet2.Creative, actionSet2.ID, CreativeTypes.getCreativeTypeFromName(creativeType)));
            }
        };
    }

    public String getTargetUrl() {
        Uri.Builder builderBuildUpon;
        if (!this.Target.getType().equalsIgnoreCase("survey")) {
            boolean zEqualsIgnoreCase = this.Target.getType().equalsIgnoreCase("userdefined");
            Target target = this.Target;
            if (zEqualsIgnoreCase) {
                return appendEmbeddedData(Uri.parse(target.getPrimaryElement()).buildUpon()).build().toString();
            }
            SentryLogcatAdapter.serializer("Qualtrics", "Unexpected target type: " + target.getType());
            return null;
        }
        String str = this.mSurveyBaseUrl;
        if (str == null) {
            builderBuildUpon = new Uri.Builder();
            builderBuildUpon.scheme(Constants.SCHEME);
            builderBuildUpon.authority(BuildConfig.SURVEY_BASE_URL);
        } else {
            builderBuildUpon = Uri.parse(str).buildUpon();
        }
        if (builderBuildUpon == null) {
            SentryLogcatAdapter.serializer("Qualtrics", "Unable to build survey url");
            return null;
        }
        builderBuildUpon.appendPath("jfe").appendPath("form").appendPath(this.Target.getPrimaryElement());
        return appendEmbeddedData(builderBuildUpon).build().toString();
    }

    public void loadCreative(IQualtricsCallback iQualtricsCallback, InterceptAssetVersions interceptAssetVersions, String str, String str2) {
        this.mSurveyBaseUrl = str2;
        this.InterceptID = str;
        Properties.instance(null).setLastDisplayTime();
        if (this.mCreative != null) {
            iQualtricsCallback.run(new TargetingResult(TargetingResultStatus.passed, getTargetUrl(), null));
        } else {
            int creativeVersion = interceptAssetVersions.getCreativeVersion(this.Creative);
            SiteInterceptService.instance().getCreativeDefinition(this.Creative, creativeVersion, str, getCreativeDefinitionCallback(iQualtricsCallback, creativeVersion));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x0097  */
    private Uri.Builder appendEmbeddedData(Uri.Builder builder) {
        byte b;
        if (ClientSideInterceptUtils.instance().getQTouchpoint(this.InterceptID) != null) {
            builder.appendQueryParameter("Q_Touchpoint", ClientSideInterceptUtils.instance().getQTouchpoint(this.InterceptID));
        }
        Properties propertiesInstance = Properties.instance(null);
        Map<String, ?> map = new HashMap<>();
        if (propertiesInstance != null) {
            map = propertiesInstance.getAllQProperties();
        }
        builder.appendQueryParameter("Q_CHL", "si_appsdk");
        this.embeddedDataMap.put("Q_CHL", "si_appsdk");
        ArrayList<EmbeddedData> arrayList = this.EmbeddedData;
        if (arrayList != null) {
            for (EmbeddedData embeddedData : arrayList) {
                String lowerCase = embeddedData.type.toLowerCase();
                lowerCase.getClass();
                switch (lowerCase) {
                    case "mobilepagecounttotal":
                        b = 0;
                        break;
                    case "mobiletimespentvisitingsite":
                        b = 1;
                        break;
                    case "mobilecustomproperty":
                        b = 2;
                        break;
                    case "mobilepagecountpage":
                        b = 3;
                        break;
                    case "mobilestaticval":
                        b = 4;
                        break;
                    default:
                        b = -1;
                        break;
                }
                if (b == 0) {
                    String str = ViewCounter.instance().getTotalViewsVisited() + "";
                    builder.appendQueryParameter(embeddedData.name, str);
                    this.embeddedDataMap.put(embeddedData.name, str);
                } else if (b == 1) {
                    String str2 = DurationTimer.instance().getElapsedSeconds() + "";
                    builder.appendQueryParameter(embeddedData.name, str2);
                    this.embeddedDataMap.put(embeddedData.name, str2);
                } else if (b == 2) {
                    Object obj = map.get(embeddedData.value);
                    if (obj != null) {
                        String strValueOf = String.valueOf(obj);
                        builder.appendQueryParameter(embeddedData.name, strValueOf);
                        this.embeddedDataMap.put(embeddedData.name, strValueOf);
                    }
                } else if (b == 3) {
                    String str3 = ViewCounter.instance().getUniqueViewsVisited() + "";
                    builder.appendQueryParameter(embeddedData.name, str3);
                    this.embeddedDataMap.put(embeddedData.name, str3);
                } else if (b == 4) {
                    builder.appendQueryParameter(embeddedData.name, embeddedData.value);
                    this.embeddedDataMap.put(embeddedData.name, embeddedData.value);
                }
            }
        }
        return builder;
    }

    public boolean display(Context context, int i, boolean z) {
        Creative creative = this.mCreative;
        if (creative == null) {
            return false;
        }
        boolean zDisplay = creative.display(context, getTargetUrl(), this.InterceptID, this.Creative, this.ID, i, this.Target.PrimaryElement, this.mSurveyBaseUrl, this.embeddedDataMap, z);
        if (zDisplay) {
            SiteInterceptService.instance().recordImpression(this.InterceptID, this.Creative, this.ID);
            return zDisplay;
        }
        SentryLogcatAdapter.serializer("Qualtrics", "Failed to display creative");
        return zDisplay;
    }

    public boolean evaluate() {
        Logic logic = this.Logic;
        return logic != null && logic.evaluate() && SamplingUtil.checkSampling(this.ActionOptions.getActionSetSampleRate());
    }
}
