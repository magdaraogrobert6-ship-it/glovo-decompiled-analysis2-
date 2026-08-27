package com.qualtrics.digital;

import java.io.File;
import o.FwFClientExtensionKtgetVariationsevalResults1;

/* JADX INFO: loaded from: classes3.dex */
public class SDKUtils {
    static String deactivatedProjectResponseKey = "This zone has been deactivated";
    private static SDKUtils mInstance;
    private File cacheDirectory;
    String mAppName;
    private String mBrandId;
    private String mZoneId;
    private boolean useHeadlessApis = false;
    SiteInterceptService mSiteInterceptService = SiteInterceptService.instance();
    LatencyReportingService mLatencyReportingService = LatencyReportingService.instance();

    public String getBrandId() {
        return this.mBrandId;
    }

    public boolean getUseHeadlessApis() {
        return this.useHeadlessApis;
    }

    public void setCacheDirectory(File file) {
        this.cacheDirectory = file;
    }

    public void setUseHeadlessApis(boolean z) {
        this.useHeadlessApis = z;
    }

    public void getCreativeDefinition(String str, int i, String str2, FwFClientExtensionKtgetVariationsevalResults1 fwFClientExtensionKtgetVariationsevalResults1) {
        this.mSiteInterceptService.getCreativeDefinition(str, i, str2, fwFClientExtensionKtgetVariationsevalResults1);
    }

    public void getInterceptDefinition(String str, int i, FwFClientExtensionKtgetVariationsevalResults1 fwFClientExtensionKtgetVariationsevalResults1) {
        this.mSiteInterceptService.getInterceptDefinition(str, i, fwFClientExtensionKtgetVariationsevalResults1);
    }

    public void initialize(String str, String str2, String str3, String str4) {
        this.mBrandId = str;
        this.mZoneId = str2;
        this.mAppName = str4;
        this.mSiteInterceptService.setCacheDirectory(this.cacheDirectory);
        this.mSiteInterceptService.initialize(str, str2, this.mAppName);
        this.mLatencyReportingService.initialize(this.mAppName, str, str2, str3);
    }

    public void recordPageView(String str, String str2, String str3) {
        this.mSiteInterceptService.recordPageView(str, str2, str3);
    }

    public void setBenchmarkSampleRate(Double d) {
        this.mLatencyReportingService.setBenchmarkSampleRate(d.doubleValue());
    }

    public void setErrorLogSampling(Double d) {
        this.mSiteInterceptService.setErrorLogSampling(d);
    }

    public void postErrorLog(String str, Throwable th) {
        this.mSiteInterceptService.postErrorLog(str, false, th);
    }

    public SDKUtils() {
    }

    public static SDKUtils instance() {
        if (mInstance == null) {
            mInstance = new SDKUtils();
        }
        return mInstance;
    }

    public void postErrorLog(Throwable th) {
        this.mSiteInterceptService.postErrorLog(th);
    }

    public void postErrorLog(String str, Throwable th, boolean z) {
        this.mSiteInterceptService.postErrorLog(str, z, th);
    }

    public SDKUtils(SiteInterceptService siteInterceptService, LatencyReportingService latencyReportingService) {
    }
}
