package com.qualtrics.digital;

import android.content.Context;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.huawei.hms.framework.common.BundleUtil;
import com.qualtrics.digital.theming.AppNightMode;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import o.FwFClientExtensionKtgetVariationsevalResults1;
import o.getHoldoutVariationName;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.syncCustomerProfile;

/* JADX INFO: loaded from: classes3.dex */
class InterceptManager {
    static final int NEW_API = 2;
    static final int OLD_API = 1;
    static final int UNEVALUATED = -1;
    private final AppNightMode appNightMode;
    ScheduledExecutorService executor;
    private String mBrandId;
    ClientCallbackUtils mClientCallbackUtils;
    ClientSideInterceptUtils mClientSideInterceptUtils;
    private boolean mEnabled;
    private LatencyReporter mEvaluateProjectLatencyReporter;
    protected String mExtRefId;
    private Intercept mIntercept;
    private InterceptAssetVersions mInterceptAssetVersions;
    private String mInterceptId;
    int mLastEvaluateVersion;
    SDKUtils mSDKUtils;
    SiteInterceptService mSiteInterceptService;
    private String mSurveyBaseUrl;
    private LatencyReporter mTargetingResponseLatencyReporter;
    private String mZoneId;
    boolean mobileEmbeddedFeedbackEnabled;
    boolean useHeadlessApis;

    /* JADX INFO: renamed from: com.qualtrics.digital.InterceptManager$2, reason: invalid class name */
    public class AnonymousClass2 implements FwFClientExtensionKtgetVariationsevalResults1 {
        @Override // o.FwFClientExtensionKtgetVariationsevalResults1
        public void onResponse(syncCustomerProfile<TargetingResponse> synccustomerprofile, getHoldoutVariationName<TargetingResponse> getholdoutvariationname) {
            final int i = 1;
            try {
                TargetingResponse targetingResponse = (TargetingResponse) getholdoutvariationname.body;
                String str = targetingResponse.Message;
                if (str == null || !str.equals(XMDUtils.xmdRetryResponseKey)) {
                    InterceptManager interceptManager = InterceptManager.this;
                    interceptManager.handleTargetingResponse(targetingResponse, interceptManager.mTargetingResponseLatencyReporter);
                } else {
                    final int i2 = 0;
                    XMDUtils.getInstance().targetingRetrier.backOffAndRetry(new Runnable(this) { // from class: com.qualtrics.digital.InterceptManager$2$$ExternalSyntheticLambda0
                        public final /* synthetic */ InterceptManager.AnonymousClass2 f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = i2;
                            InterceptManager.AnonymousClass2 anonymousClass2 = this.f$0;
                            if (i3 != 0) {
                                anonymousClass2.lambda$onResponse$1();
                            } else {
                                anonymousClass2.lambda$onResponse$0();
                            }
                        }
                    }, new Runnable(this) { // from class: com.qualtrics.digital.InterceptManager$2$$ExternalSyntheticLambda0
                        public final /* synthetic */ InterceptManager.AnonymousClass2 f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = i;
                            InterceptManager.AnonymousClass2 anonymousClass2 = this.f$0;
                            if (i3 != 0) {
                                anonymousClass2.lambda$onResponse$1();
                            } else {
                                anonymousClass2.lambda$onResponse$0();
                            }
                        }
                    }, InterceptManager.this.executor);
                }
            } catch (Exception e) {
                InterceptManager.this.logProjectCancelInitialization(e.getMessage() + ", mobileTargeting Error calling Targeting, initialization cancelled");
                InterceptManager.this.postErrorLog("Error loading project", true, e);
            }
        }

        public AnonymousClass2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onResponse$0() {
            InterceptManager.this.loadProject();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onResponse$1() {
            InterceptManager.this.logProjectCancelInitialization("Exceeded initialize retry limit");
        }

        @Override // o.FwFClientExtensionKtgetVariationsevalResults1
        public void onFailure(syncCustomerProfile<TargetingResponse> synccustomerprofile, Throwable th) {
            if (!(th instanceof IOException)) {
                InterceptManager.this.postErrorLog("Error calling loadProject", th);
            }
            InterceptManager.this.mTargetingResponseLatencyReporter.stopTimerAndReport();
            QualtricsLog.logError("Unexpected response getting asset versions");
            QualtricsLog.logError(th);
            InterceptManager.this.callProjectInitializationCallback("Error", false, th);
        }
    }

    private String getApplicationName(Context context) {
        return context.getPackageName();
    }

    private void logMessage(String str) {
        QualtricsLog.logInfo(str);
    }

    public void decodeInterceptDefinition() {
        this.mEnabled = true;
        if (this.mIntercept.getInterceptDefinition() != null) {
            this.mIntercept.getInterceptDefinition().setSurveyBaseUrl(this.mSurveyBaseUrl);
            callInterceptInitializationCallback(true, "Qualtrics: Intercept has been loaded");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callInterceptInitializationCallback(boolean z, Throwable th) {
        callInterceptInitializationCallback(z, (th == null || th.toString() == null) ? "Unexpected error during initialization" : th.toString());
    }

    private void callProjectInitializationCallback(String str, boolean z, String str2) {
        HashMap map = new HashMap();
        map.put(str, new InitializationResult(Boolean.valueOf(z), str2));
        this.mClientCallbackUtils.callLoadProjectCallback(map);
    }

    private void getInterceptDefinition() {
        Locale locale = Locale.US;
        final LatencyReporter latencyReporter = new LatencyReporter("interceptDefinition", "/WRSiteInterceptEngine/Asset.php?Module=" + this.mInterceptId + "&Version=" + this.mInterceptAssetVersions.getVersion() + "&Q_FULL_DEFINITION=true");
        this.mSiteInterceptService.getInterceptDefinition(this.mInterceptId, this.mInterceptAssetVersions.getVersion(), new FwFClientExtensionKtgetVariationsevalResults1() { // from class: com.qualtrics.digital.InterceptManager.3
            @Override // o.FwFClientExtensionKtgetVariationsevalResults1
            public void onResponse(syncCustomerProfile<Intercept> synccustomerprofile, getHoldoutVariationName<Intercept> getholdoutvariationname) {
                latencyReporter.stopTimerAndReport();
                InterceptManager.this.mIntercept = (Intercept) getholdoutvariationname.body;
                InterceptManager.this.decodeInterceptDefinition();
            }

            @Override // o.FwFClientExtensionKtgetVariationsevalResults1
            public void onFailure(syncCustomerProfile<Intercept> synccustomerprofile, Throwable th) {
                if (!(th instanceof IOException)) {
                    InterceptManager.this.postErrorLog("Error calling getInterceptDefinition", th);
                }
                latencyReporter.stopTimerAndReport();
                QualtricsLog.logError("Unexpected response getting intercept");
                QualtricsLog.logError(th);
                InterceptManager.this.callInterceptInitializationCallback(false, th);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$evaluateIntercept$3(String str, Map map) {
        this.mClientCallbackUtils.callEvaluateInterceptCallback((TargetingResult) map.get(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$evaluateIntercept$4(final LatencyReporter latencyReporter, Map map) {
        this.mSiteInterceptService.requestXMDContactFrequency(this.mZoneId, this.mExtRefId, map, new FwFClientExtensionKtgetVariationsevalResults1() { // from class: com.qualtrics.digital.InterceptManager.5
            @Override // o.FwFClientExtensionKtgetVariationsevalResults1
            public void onResponse(syncCustomerProfile<ContactFrequencyResponse> synccustomerprofile, getHoldoutVariationName<ContactFrequencyResponse> getholdoutvariationname) {
                InterceptManager.this.handleContactFrequencyResponse((ContactFrequencyResponse) getholdoutvariationname.body, latencyReporter);
            }

            @Override // o.FwFClientExtensionKtgetVariationsevalResults1
            public void onFailure(syncCustomerProfile<ContactFrequencyResponse> synccustomerprofile, Throwable th) {
                if (!(th instanceof IOException)) {
                    InterceptManager.this.postErrorLog("Unexpected response getting contact frequency response", th);
                }
                latencyReporter.stopTimerAndReport();
                QualtricsLog.logError("Unexpected response getting contact frequency response");
                QualtricsLog.logError(th);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$evaluateProject$1(Map map) {
        this.mClientCallbackUtils.runEvaluateProjectCallbackIfAllEvaluated(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$evaluateProject$2(Map map) {
        this.mSiteInterceptService.requestXMDContactFrequency(this.mZoneId, this.mExtRefId, map, new FwFClientExtensionKtgetVariationsevalResults1() { // from class: com.qualtrics.digital.InterceptManager.4
            @Override // o.FwFClientExtensionKtgetVariationsevalResults1
            public void onResponse(syncCustomerProfile<ContactFrequencyResponse> synccustomerprofile, getHoldoutVariationName<ContactFrequencyResponse> getholdoutvariationname) {
                InterceptManager interceptManager = InterceptManager.this;
                interceptManager.handleContactFrequencyResponse((ContactFrequencyResponse) getholdoutvariationname.body, interceptManager.mEvaluateProjectLatencyReporter);
            }

            @Override // o.FwFClientExtensionKtgetVariationsevalResults1
            public void onFailure(syncCustomerProfile<ContactFrequencyResponse> synccustomerprofile, Throwable th) {
                if (!(th instanceof IOException)) {
                    InterceptManager.this.postErrorLog("Unexpected response getting contact frequency response", th);
                }
                InterceptManager.this.mEvaluateProjectLatencyReporter.stopTimerAndReport();
                QualtricsLog.logError("Unexpected response getting contact frequency response");
                QualtricsLog.logError(th);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleContactFrequencyResponse$0() {
        this.mClientSideInterceptUtils.contactFrequencyRequest.run();
    }

    private void logCancelInitialization(String str) {
        QualtricsLog.logError(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(str, ", aborting SDK initialization..."));
        this.mClientCallbackUtils.callLoadCallback(new InitializationResult(Boolean.FALSE, str));
    }

    private void logProjectCancelEvaluation(String str) {
        QualtricsLog.logError(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(str, ", aborting SDK evaluation..."));
        HashMap map = new HashMap();
        map.put("Error", new TargetingResult(TargetingResultStatus.error, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(str, ", aborting SDK project evaluation..."), new Exception(ff$$ExternalSyntheticOutline0.m("Qualtrics: ", str, ", evaluation cancelled"))));
        this.mClientCallbackUtils.callMasterEvaluateCallback(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logProjectCancelInitialization(String str) {
        QualtricsLog.logError(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(str, ", aborting SDK initialization..."));
        HashMap map = new HashMap();
        map.put("Error", new InitializationResult(Boolean.FALSE, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(str, ", aborting SDK project initialization...")));
        this.mClientCallbackUtils.callLoadProjectCallback(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postErrorLog(String str, Throwable th) {
        this.mSDKUtils.postErrorLog(String.format("%s-%s-%s-%s", this.mBrandId, this.mZoneId, this.mIntercept, str), th, true);
    }

    public boolean display(Context context, int i, boolean z) {
        boolean zDisplayAllPassingIntercepts;
        boolean zDisplay;
        Intercept intercept;
        logMessage("Displaying...");
        int i2 = this.mLastEvaluateVersion;
        if (i2 == 2) {
            zDisplayAllPassingIntercepts = this.mClientSideInterceptUtils.displayAllPassingIntercepts(context, i, z);
            zDisplay = false;
        } else if (i2 == 1 && this.mEnabled && (intercept = this.mIntercept) != null) {
            zDisplay = intercept.getInterceptDefinition().display(context, i, z);
            zDisplayAllPassingIntercepts = false;
        } else {
            zDisplayAllPassingIntercepts = false;
            zDisplay = false;
        }
        return zDisplayAllPassingIntercepts || zDisplay;
    }

    public boolean displayIntercept(Context context, String str, int i, boolean z) {
        this.appNightMode.makeNightAware(context.getApplicationContext());
        return this.mClientSideInterceptUtils.displayIntercept(context, str, i, z);
    }

    public ArrayList<String> getInitializedIntercepts() {
        return new ArrayList<>(this.mClientSideInterceptUtils.mInterceptDefinitions.keySet());
    }

    public ArrayList<String> getPassingIntercepts() {
        return new ArrayList<>(this.mClientSideInterceptUtils.mPassingActionSets.keySet());
    }

    public void hide() {
        logMessage("hiding");
    }

    public void initializeDependentServices(String str, String str2, String str3, String str4, File file) {
        this.mSDKUtils.setCacheDirectory(file);
        this.mSDKUtils.initialize(str, str2, str3, str4);
        this.mSiteInterceptService = SiteInterceptService.instance();
    }

    public void loadIntercept() {
        try {
            final LatencyReporter latencyReporter = new LatencyReporter("assetVersions", "/WRSiteInterceptEngine/AssetVersions.php?Q_InterceptID=" + this.mInterceptId);
            this.mSiteInterceptService.getAssetVersions(this.mInterceptId, new FwFClientExtensionKtgetVariationsevalResults1() { // from class: com.qualtrics.digital.InterceptManager.1
                @Override // o.FwFClientExtensionKtgetVariationsevalResults1
                public void onResponse(syncCustomerProfile<ProjectAssetVersions> synccustomerprofile, getHoldoutVariationName<ProjectAssetVersions> getholdoutvariationname) {
                    InterceptManager.this.decodeAssetVersions((ProjectAssetVersions) getholdoutvariationname.body, latencyReporter);
                }

                @Override // o.FwFClientExtensionKtgetVariationsevalResults1
                public void onFailure(syncCustomerProfile<ProjectAssetVersions> synccustomerprofile, Throwable th) {
                    if (!(th instanceof IOException)) {
                        InterceptManager.this.postErrorLog("Error calling initialize endpoint", th);
                    }
                    latencyReporter.stopTimerAndReport();
                    QualtricsLog.logError("Unexpected response getting asset versions");
                    QualtricsLog.logError(th);
                    InterceptManager.this.callInterceptInitializationCallback(false, th);
                }
            });
        } catch (Exception e) {
            if (!(e instanceof IOException)) {
                postErrorLog("Error calling initialize endpoint", e);
            }
            callInterceptInitializationCallback(false, (Throwable) e);
        }
    }

    public void loadProject() {
        this.mTargetingResponseLatencyReporter.startTimer();
        this.mSiteInterceptService.getMobileTargeting(this.mZoneId, this.mExtRefId, new AnonymousClass2());
    }

    private String getApplicationVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return "0";
        }
    }

    public void decodeAssetVersions(ProjectAssetVersions projectAssetVersions, LatencyReporter latencyReporter) {
        if (projectAssetVersions == null) {
            logCancelInitialization("Could not deserialize asset versions");
            return;
        }
        String str = projectAssetVersions.Message;
        if (str != null && str.equals(SDKUtils.deactivatedProjectResponseKey)) {
            logCancelInitialization("Zone is deactivated");
            return;
        }
        this.mSDKUtils.recordPageView(this.mInterceptId, null, null);
        Double d = projectAssetVersions.ClientBenchmarkSampleRate;
        if (d != null) {
            this.mSDKUtils.setBenchmarkSampleRate(d);
            latencyReporter.stopTimerAndReport();
        }
        Boolean bool = projectAssetVersions.ExecutionEnabled;
        if (bool == null) {
            logCancelInitialization("Expected ExecutionEnabled field not present for intercept");
            return;
        }
        if (!bool.booleanValue()) {
            logCancelInitialization("Mobile SDK ExecutionEnabled not enabled");
            return;
        }
        Map<String, InterceptAssetVersions> map = projectAssetVersions.Intercepts;
        if (map != null && map.containsKey(this.mInterceptId)) {
            if (!projectAssetVersions.Intercepts.get(this.mInterceptId).Active) {
                logCancelInitialization(ff$$ExternalSyntheticOutline0.m(new StringBuilder("Intercept "), this.mInterceptId, " is not active"));
                return;
            }
            Double d2 = projectAssetVersions.ClientLogSampleRate;
            if (d2 != null) {
                this.mSDKUtils.setErrorLogSampling(d2);
            }
            String str2 = projectAssetVersions.BrandBaseUrl;
            if (str2 != null) {
                this.mSurveyBaseUrl = str2;
            }
            Map<String, Boolean> map2 = projectAssetVersions.FeatureFlippers;
            if (map2 != null) {
                Boolean bool2 = map2.get("DX.EmbeddedFeedback_NewAPIs");
                if (bool2 == null) {
                    this.useHeadlessApis = false;
                } else {
                    this.useHeadlessApis = bool2.booleanValue();
                }
                this.mSDKUtils.setUseHeadlessApis(this.useHeadlessApis);
            }
            this.mInterceptAssetVersions = projectAssetVersions.Intercepts.get(this.mInterceptId);
            getInterceptDefinition();
            return;
        }
        logCancelInitialization("Unexpected intercept asset version received from server");
    }

    public void evaluateTargetingLogic(IQualtricsCallback iQualtricsCallback) {
        Intercept intercept;
        if (!this.mEnabled || (intercept = this.mIntercept) == null) {
            iQualtricsCallback.run(new TargetingResult(TargetingResultStatus.error, null, null));
        } else {
            intercept.getInterceptDefinition().evaluateAndExecuteCallback(iQualtricsCallback, this.mInterceptAssetVersions);
        }
        this.mLastEvaluateVersion = 1;
    }

    public void handleTargetingResponse(TargetingResponse targetingResponse, LatencyReporter latencyReporter) {
        if (targetingResponse == null) {
            logProjectCancelInitialization("Error calling Targeting");
            postErrorLog("Received null targetingResponse ", true, null);
            return;
        }
        String str = targetingResponse.Message;
        if (str != null && str.equals(SDKUtils.deactivatedProjectResponseKey)) {
            logProjectCancelInitialization("Zone is deactivated");
            postErrorLog("Received targetingResponse for deactivated project", false, null);
            return;
        }
        Map<String, Boolean> map = targetingResponse.FeatureFlags;
        if (map == null) {
            logProjectCancelInitialization("Error calling Targeting");
            postErrorLog("Received null feature flags", true, null);
            return;
        }
        Boolean bool = map.get("DX.MobileTargeting");
        if (bool == null) {
            logProjectCancelInitialization("Error calling Targeting");
            return;
        }
        Boolean bool2 = targetingResponse.FeatureFlags.get("DX.MobileEmbeddedFeedbackVisitor");
        if (bool2 == null) {
            this.mobileEmbeddedFeedbackEnabled = false;
        } else {
            this.mobileEmbeddedFeedbackEnabled = bool2.booleanValue();
        }
        Boolean bool3 = targetingResponse.FeatureFlags.get("DX.EmbeddedFeedback_NewAPIs");
        if (bool3 == null) {
            this.useHeadlessApis = false;
        } else {
            this.useHeadlessApis = bool3.booleanValue();
        }
        if (!bool.booleanValue()) {
            logProjectCancelInitialization("Project level APIs not enabled for this brand");
            return;
        }
        Targeting targeting = targetingResponse.Targeting;
        if (targeting == null) {
            logProjectCancelInitialization("Unexpected Targeting response received from server");
            postErrorLog("Unable to decode targeting object", true, null);
            return;
        }
        this.mClientSideInterceptUtils.setInitializedClientSideIntercepts(targeting.ClientSideIntercepts);
        this.mClientSideInterceptUtils.setSurveyBaseUrl(targeting.BrandBaseUrl);
        this.mClientSideInterceptUtils.findClientSideInterceptsWithDCF();
        if (this.mExtRefId != null) {
            XMDUtils.getInstance().setXMDImpressionTouchpointParams(this.mExtRefId, targeting.BrandID, targeting.BrandDC);
        }
        this.mSDKUtils.setErrorLogSampling(targeting.ClientLogSampleRate);
        this.mSDKUtils.setBenchmarkSampleRate(targeting.ClientBenchmarkSampleRate);
        this.mSDKUtils.setUseHeadlessApis(this.useHeadlessApis);
        latencyReporter.stopTimerAndReport();
        this.mClientSideInterceptUtils.fetchAllInterceptDefinitions();
        this.mSiteInterceptService.recordPageView(this.mZoneId, null, null);
    }

    public InterceptManager(String str, String str2, Context context, SDKUtils sDKUtils, ClientCallbackUtils clientCallbackUtils, ClientSideInterceptUtils clientSideInterceptUtils, ScheduledExecutorService scheduledExecutorService, String str3) {
        this.mBrandId = "";
        this.mZoneId = "";
        this.mInterceptId = "";
        this.mEnabled = false;
        this.appNightMode = new AppNightMode();
        this.mZoneId = str2;
        this.mExtRefId = str3;
        this.mBrandId = str;
        String str4 = getApplicationName(context) + BundleUtil.UNDERLINE_TAG + getApplicationVersion(context);
        this.mSDKUtils = sDKUtils;
        this.mClientCallbackUtils = clientCallbackUtils;
        this.mClientSideInterceptUtils = clientSideInterceptUtils;
        this.executor = scheduledExecutorService;
        this.mLastEvaluateVersion = -1;
        LatencyReporter latencyReporter = new LatencyReporter("targetingResponse", "/WRSiteInterceptEngine/MobileTargeting?Q_ZoneID=" + this.mZoneId);
        this.mTargetingResponseLatencyReporter = latencyReporter;
        latencyReporter.resetTimer();
        LatencyReporter latencyReporter2 = new LatencyReporter("evaluateProject", "/WRSiteInterceptEngine/MobileXmdDcfEval?Q_ZoneID=" + this.mZoneId);
        this.mEvaluateProjectLatencyReporter = latencyReporter2;
        latencyReporter2.resetTimer();
        initializeDependentServices(str, str2, null, str4, context.getCacheDir());
    }

    public void evaluateProject() {
        boolean zEvaluateAllClientSideIntercepts;
        this.mClientCallbackUtils.setMasterEvaluateCallback(new InterceptManager$$ExternalSyntheticLambda3(this, 0));
        if (this.mExtRefId == null || !this.mClientSideInterceptUtils.doAnyInterceptsHaveDCFEnabled()) {
            zEvaluateAllClientSideIntercepts = this.mClientSideInterceptUtils.evaluateAllClientSideIntercepts(null);
        } else {
            this.mEvaluateProjectLatencyReporter.startTimer();
            zEvaluateAllClientSideIntercepts = this.mClientSideInterceptUtils.evaluateAllClientSideIntercepts(new InterceptManager$$ExternalSyntheticLambda3(this, 1));
        }
        this.mLastEvaluateVersion = 2;
        if (zEvaluateAllClientSideIntercepts) {
            SiteInterceptService.instance().recordPageView(this.mZoneId, null, null);
        }
    }

    public void handleContactFrequencyResponse(ContactFrequencyResponse contactFrequencyResponse, LatencyReporter latencyReporter) {
        if (contactFrequencyResponse == null) {
            logProjectCancelEvaluation("Error calling Contact Frequency");
            postErrorLog("Received null contact frequency response", false, null);
            return;
        }
        String str = contactFrequencyResponse.Message;
        if (str != null && str.equals(XMDUtils.xmdRetryResponseKey)) {
            XMDUtils.getInstance().contactFrequencyRetrier.backOffAndRetry(new Qualtrics$$ExternalSyntheticLambda1(1, this), this.executor);
            return;
        }
        XMDUtils.getInstance().contactFrequencyRetrier.resetRetryCount();
        this.mClientSideInterceptUtils.setContactFrequencyRequest(null);
        Map<String, Boolean> map = contactFrequencyResponse.ContactFrequencyIntercepts;
        for (String str2 : map.keySet()) {
            Boolean bool = map.get(str2);
            boolean zContains = this.mClientSideInterceptUtils.cstInterceptsWithDCFEnabled.contains(str2);
            if (!XMDUtils.getInstance().isXMDContactAnonymous && !bool.booleanValue() && zContains) {
                this.mClientSideInterceptUtils.targetingResults.put(str2, new TargetingResult(TargetingResultStatus.contactFrequencyFailed, null, null, str2, null, null, null));
                this.mClientCallbackUtils.callMasterEvaluateCallback(this.mClientSideInterceptUtils.targetingResults);
            } else {
                this.mClientSideInterceptUtils.fetchCreativeDefinition(str2);
            }
        }
        latencyReporter.stopTimerAndReport();
    }

    public void evaluateIntercept(String str) {
        boolean zEvaluateClientSideIntercept;
        LatencyReporter latencyReporter = new LatencyReporter("evaluateIntercept", d$$ExternalSyntheticOutline0.m(new StringBuilder("/WRSiteInterceptEngine/MobileXmdDcfEval?Q_ZoneID="), this.mZoneId, " interceptId: ", str));
        this.mClientCallbackUtils.setMasterEvaluateCallback(new Qualtrics$$ExternalSyntheticLambda4(this, 1, str));
        if (this.mExtRefId != null && this.mClientSideInterceptUtils.cstInterceptsWithDCFEnabled.contains(str)) {
            zEvaluateClientSideIntercept = this.mClientSideInterceptUtils.evaluateClientSideIntercept(str, new Qualtrics$$ExternalSyntheticLambda4(this, 2, latencyReporter));
        } else {
            zEvaluateClientSideIntercept = this.mClientSideInterceptUtils.evaluateClientSideIntercept(str, null);
        }
        if (zEvaluateClientSideIntercept) {
            SiteInterceptService.instance().recordPageView(str, null, null);
        }
    }

    private void callInterceptInitializationCallback(boolean z, String str) {
        this.mClientCallbackUtils.callLoadCallback(new InitializationResult(Boolean.valueOf(z), str));
    }

    public void loadProject(IQualtricsProjectInitializationCallback iQualtricsProjectInitializationCallback) {
        this.mClientCallbackUtils.setLoadProjectCallback(iQualtricsProjectInitializationCallback);
        loadProject();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callProjectInitializationCallback(String str, boolean z, Throwable th) {
        String string;
        if (th != null && th.toString() != null) {
            string = th.toString();
        } else {
            string = "Unexpected error during initialization";
        }
        callProjectInitializationCallback(str, z, string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postErrorLog(String str, boolean z, Throwable th) {
        this.mSiteInterceptService.postErrorLog(af$$ExternalSyntheticOutline0.m(str, " zoneId=", this.mZoneId), z, th);
    }

    public void loadIntercept(IQualtricsInitializationCallback iQualtricsInitializationCallback) {
        this.mClientCallbackUtils.setLoadInterceptCallback(iQualtricsInitializationCallback);
        loadIntercept();
    }

    public InterceptManager(String str, String str2, String str3, Context context, SDKUtils sDKUtils, ClientCallbackUtils clientCallbackUtils, ClientSideInterceptUtils clientSideInterceptUtils, ScheduledExecutorService scheduledExecutorService) {
        this.mBrandId = "";
        this.mZoneId = "";
        this.mInterceptId = "";
        this.mEnabled = false;
        this.appNightMode = new AppNightMode();
        this.mInterceptId = str3;
        this.mBrandId = str;
        this.mZoneId = str2;
        String applicationName = getApplicationName(context);
        this.mSDKUtils = sDKUtils;
        this.mClientCallbackUtils = clientCallbackUtils;
        this.mClientSideInterceptUtils = clientSideInterceptUtils;
        this.mLastEvaluateVersion = -1;
        LatencyReporter latencyReporter = new LatencyReporter("targetingResponse", "/WRSiteInterceptEngine/MobileTargeting?Q_ZoneID=" + this.mZoneId);
        this.mTargetingResponseLatencyReporter = latencyReporter;
        latencyReporter.resetTimer();
        LatencyReporter latencyReporter2 = new LatencyReporter("evaluateProject", "/WRSiteInterceptEngine/MobileXmdDcfEval?Q_ZoneID=" + this.mZoneId);
        this.mEvaluateProjectLatencyReporter = latencyReporter2;
        latencyReporter2.resetTimer();
        initializeDependentServices(str, str2, str3, applicationName, context.getCacheDir());
        this.executor = scheduledExecutorService;
    }
}
