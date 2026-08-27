package com.qualtrics.digital;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Locale;
import o.FwFClientExtensionKtgetVariationsevalResults1;
import o.ProtoFeatureMsgCompanion;
import o.getClassLogTag;
import o.getHoldoutVariationName;
import o.getIdentifiersValidationsEnabled;
import o.r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0;
import o.r8lambdaChmLGYSNQdplVu9Y_kSRCt5sDig;
import o.r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ;
import o.syncCustomerProfile;

/* JADX INFO: loaded from: classes3.dex */
class LatencyReportingService {
    private static LatencyReportingService mInstance;
    private String mAppName;
    private double mBenchmarkSampleRate = 0.0d;
    private String mBrandID;
    private String mInterceptID;
    private ILatencyReportingService mService;
    private String mZoneID;

    public void setBenchmarkSampleRate(double d) {
        this.mBenchmarkSampleRate = d;
    }

    public void initialize(String str, String str2, String str3, String str4) {
        this.mAppName = str;
        this.mBrandID = str2;
        this.mZoneID = str3;
        this.mInterceptID = str4;
        getClassLogTag getclasslogtag = new getClassLogTag(0);
        if (QualtricsLog.mLogLevel == QualtricsLogLevel.INFO) {
            getclasslogtag.write(r8lambdaChmLGYSNQdplVu9Y_kSRCt5sDig.BODY);
        }
        getIdentifiersValidationsEnabled getidentifiersvalidationsenabled = new getIdentifiersValidationsEnabled();
        getidentifiersvalidationsenabled.write("https://survey.qualtrics.com");
        r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ r8lambdauggauuj_lbnzvef8yyxtwmhrlkq = new r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ();
        ServiceInterceptor serviceInterceptor = new ServiceInterceptor(this.mAppName);
        ArrayList arrayList = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        arrayList.add(serviceInterceptor);
        arrayList.add(getclasslogtag);
        arrayList.add(new RequestInterceptor());
        getidentifiersvalidationsenabled.read = new r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0(r8lambdauggauuj_lbnzvef8yyxtwmhrlkq);
        getidentifiersvalidationsenabled.write(ProtoFeatureMsgCompanion.IconCompatParcelizer(new Gson()));
        this.mService = (ILatencyReportingService) getidentifiersvalidationsenabled.write().write(ILatencyReportingService.class);
    }

    private LatencyReportingService() {
    }

    public static LatencyReportingService instance() {
        if (mInstance == null) {
            mInstance = new LatencyReportingService();
        }
        return mInstance;
    }

    public void reportLatency(String str, String str2, long j) {
        if (this.mService == null) {
            QualtricsLog.logError("Service not initialized, report latency network request cannot be performed");
            return;
        }
        if (SamplingUtil.checkSampling(Double.valueOf(this.mBenchmarkSampleRate))) {
            ILatencyReportingService iLatencyReportingService = this.mService;
            Locale locale = Locale.US;
            String str3 = this.mAppName;
            String str4 = this.mBrandID;
            String str5 = this.mZoneID;
            String str6 = this.mInterceptID;
            StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("si.androidSDK.2.27.0.", str3, ".", str4, ".");
            c8$$ExternalSyntheticOutline0.m(sbM, str5, ".", str6, ".");
            sbM.append(str);
            iLatencyReportingService.recordLatency(new LatencyReportBody(sbM.toString(), str2, j)).IconCompatParcelizer(new FwFClientExtensionKtgetVariationsevalResults1() { // from class: com.qualtrics.digital.LatencyReportingService.1
                @Override // o.FwFClientExtensionKtgetVariationsevalResults1
                public void onResponse(syncCustomerProfile<Void> synccustomerprofile, getHoldoutVariationName<Void> getholdoutvariationname) {
                    QualtricsLog.logInfo("Latency recorded");
                }

                @Override // o.FwFClientExtensionKtgetVariationsevalResults1
                public void onFailure(syncCustomerProfile<Void> synccustomerprofile, Throwable th) {
                    QualtricsLog.logError("Error recording latency: " + th.getMessage());
                }
            });
        }
    }
}
