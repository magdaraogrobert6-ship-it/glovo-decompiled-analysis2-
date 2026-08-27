package com.qualtrics.digital;

import android.os.Build;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.huawei.hms.framework.common.BundleUtil;
import fwfd.com.fwfsdk.constant.FWFConstants;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import o.FwFClientExtensionKtgetVariationsevalResults1;
import o.ProtoFeatureMsgCompanion;
import o._get_messageWebView_lambda3;
import o.getAllocation;
import o.getAppropriateImageUrl;
import o.getClassLogTag;
import o.getHoldoutVariation;
import o.getHoldoutVariationName;
import o.getIdentifiersValidationsEnabled;
import o.r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0;
import o.r8lambdaChmLGYSNQdplVu9Y_kSRCt5sDig;
import o.r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.syncCustomerProfile;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class SiteInterceptService {
    private static final String CANNOT_BE_PERFORMED = " cannot be performed";
    private static final String FLUTTER_PROPERTY = "Qualtrics_IS_FLUTTER";
    private static String INTERCEPT_TYPE = "intercept";
    private static final String LOG_TAG = "Qualtrics";
    private static final String REACT_NATIVE_PROPERTY = "Qualtrics_IS_REACT_NATIVE";
    private static final String SERVICE_NOT_INITIALIZED = "Service not initialized, ";
    private static String ZONE_TYPE = "zone";
    private static String ZONE_TYPE_REGEX = "Q_ZN(.*)";
    private static String clientType = "MobileAndroid";
    private static SiteInterceptService mInstance;
    private File cacheDirectory;
    private String mAppName;
    private String mBrandId;
    private Double mErrorLogSampling = Double.valueOf(0.0d);
    private ISiteInterceptService mService;
    protected String mZoneID;

    public void setCacheDirectory(File file) {
        this.cacheDirectory = file;
    }

    public void setErrorLogSampling(Double d) {
        this.mErrorLogSampling = d;
    }

    private String stacktraceToString(Throwable th) {
        try {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public void initialize(String str, String str2, String str3) {
        this.mAppName = str3;
        this.mBrandId = str;
        this.mZoneID = str2;
        getClassLogTag getclasslogtag = new getClassLogTag(0);
        if (QualtricsLog.mLogLevel == QualtricsLogLevel.INFO) {
            getclasslogtag.write(r8lambdaChmLGYSNQdplVu9Y_kSRCt5sDig.BODY);
        }
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Logic.class, new LogicDeserializer());
        Gson gsonCreate = gsonBuilder.create();
        getAppropriateImageUrl getappropriateimageurlBuildCache = buildCache(this.cacheDirectory);
        String strMakeURLFriendlyZoneId = makeURLFriendlyZoneId(str2);
        getIdentifiersValidationsEnabled getidentifiersvalidationsenabled = new getIdentifiersValidationsEnabled();
        Locale locale = Locale.US;
        getidentifiersvalidationsenabled.write(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("https://", strMakeURLFriendlyZoneId, "-", str, ".siteintercept.qualtrics.com"));
        r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ r8lambdauggauuj_lbnzvef8yyxtwmhrlkq = new r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ();
        ServiceInterceptor serviceInterceptor = new ServiceInterceptor(this.mAppName);
        ArrayList arrayList = r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        arrayList.add(serviceInterceptor);
        arrayList.add(getclasslogtag);
        arrayList.add(new RequestInterceptor());
        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.RemoteActionCompatParcelizer = getappropriateimageurlBuildCache;
        getidentifiersvalidationsenabled.read = new r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0(r8lambdauggauuj_lbnzvef8yyxtwmhrlkq);
        getidentifiersvalidationsenabled.write(ProtoFeatureMsgCompanion.IconCompatParcelizer(gsonCreate));
        getidentifiersvalidationsenabled.write(new getAllocation());
        getHoldoutVariation getholdoutvariationWrite = getidentifiersvalidationsenabled.write();
        String string = Qualtrics.instance().properties.getString(REACT_NATIVE_PROPERTY);
        String string2 = Qualtrics.instance().properties.getString(FLUTTER_PROPERTY);
        if (string != null && string.equals("true")) {
            clientType = "MobileAndroidReactNative";
        } else if (string2 != null && string2.equals("true")) {
            clientType = "MobileAndroidFlutter";
        }
        this.mService = (ISiteInterceptService) getholdoutvariationWrite.write(ISiteInterceptService.class);
    }

    public void startSurveySession(String str, Map map, FwFClientExtensionKtgetVariationsevalResults1 fwFClientExtensionKtgetVariationsevalResults1) {
        this.mService.startSurveySession(str, (JsonObject) new Gson().fromJson(new JSONObject(map).toString(), JsonObject.class)).IconCompatParcelizer(fwFClientExtensionKtgetVariationsevalResults1);
    }

    public void updateSurveySession(String str, Map map) {
        this.mService.updateSurveySession(str, (JsonObject) new Gson().fromJson(new JSONObject(map).toString(), JsonObject.class)).IconCompatParcelizer(new FwFClientExtensionKtgetVariationsevalResults1() { // from class: com.qualtrics.digital.SiteInterceptService.7
            @Override // o.FwFClientExtensionKtgetVariationsevalResults1
            public void onResponse(syncCustomerProfile<_get_messageWebView_lambda3> synccustomerprofile, getHoldoutVariationName<_get_messageWebView_lambda3> getholdoutvariationname) {
                QualtricsLog.logInfo("Qualtrics: Survey Response saved");
            }

            @Override // o.FwFClientExtensionKtgetVariationsevalResults1
            public void onFailure(syncCustomerProfile<_get_messageWebView_lambda3> synccustomerprofile, Throwable th) {
                QualtricsLog.logError("Qualtrics: Error recording survey response:" + th.getMessage());
            }
        });
    }

    public String makeURLFriendlyZoneId(String str) {
        return str.replace(BundleUtil.UNDERLINE_TAG, "").toLowerCase();
    }

    public void postErrorLog(String str, boolean z, Throwable th) {
        String message;
        StringBuilder sb = new StringBuilder("QualtricsAndroidSDKError\\n");
        if (str != null) {
            sb.append(str);
            sb.append("\\n");
        }
        if (th != null) {
            if (th.getMessage() != null) {
                message = th.getMessage();
            } else {
                message = "";
            }
            sb.append(message);
            sb.append("\\n");
            sb.append(stacktraceToString(th));
        }
        QualtricsLog.logError(sb.toString());
        if (this.mService == null) {
            logUninitializedError("post error");
            return;
        }
        if (z || SamplingUtil.checkSampling(this.mErrorLogSampling)) {
            this.mService.postErrorLog(FWFConstants.EXPLANATION_TYPE_ERROR, sb.toString(), "ClientLog", clientType, BuildConfig.VERSION_NAME, Build.VERSION.RELEASE + BundleUtil.UNDERLINE_TAG + Build.VERSION.SDK_INT, Build.MANUFACTURER + BundleUtil.UNDERLINE_TAG + Build.MODEL).IconCompatParcelizer(new FwFClientExtensionKtgetVariationsevalResults1() { // from class: com.qualtrics.digital.SiteInterceptService.1
                @Override // o.FwFClientExtensionKtgetVariationsevalResults1
                public void onFailure(syncCustomerProfile<Void> synccustomerprofile, Throwable th2) {
                    QualtricsLog.logError("Post error log onFailure: " + th2.getMessage(), th2);
                }

                @Override // o.FwFClientExtensionKtgetVariationsevalResults1
                public void onResponse(syncCustomerProfile<Void> synccustomerprofile, getHoldoutVariationName<Void> getholdoutvariationname) {
                    QualtricsLog.logInfo("Post error log onResponse: " + getholdoutvariationname.rawResponse.code);
                }
            });
        }
    }

    public void recordImpression(final String str, String str2, String str3) {
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        if (this.mService == null) {
            logUninitializedError("record impression");
            return;
        }
        ClientSideInterceptUtils clientSideInterceptUtilsInstance = ClientSideInterceptUtils.instance();
        String strEncode = null;
        if (clientSideInterceptUtilsInstance.passingActionSetXmdAttributes.containsKey(str)) {
            XmdAttributes xmdAttributes = clientSideInterceptUtilsInstance.passingActionSetXmdAttributes.get(str);
            XMDUtils xMDUtils = XMDUtils.getInstance();
            String str10 = xMDUtils.extRefId;
            String str11 = xMDUtils.brandDC;
            String str12 = xmdAttributes.SurveyId;
            String str13 = xmdAttributes.DistributionId;
            String str14 = xmdAttributes.ContactId;
            String str15 = xmdAttributes.DirectoryId;
            try {
                strEncode = URLEncoder.encode(str10, StandardCharsets.UTF_8.toString());
            } catch (UnsupportedEncodingException e) {
                QualtricsLog.logError("Error encoding extRefId for record impression request: " + e.getMessage());
            }
            str5 = str11;
            str6 = strEncode;
            str9 = str12;
            str4 = str13;
            str7 = str14;
            str8 = str15;
        } else {
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            str8 = null;
            str9 = null;
        }
        QualtricsLog.logInfo("Recording impression...");
        this.mService.recordImpression(1, str, str2, str3, this.mAppName, (System.currentTimeMillis() / 1000) + "", clientType, BuildConfig.VERSION_NAME, Build.VERSION.RELEASE + BundleUtil.UNDERLINE_TAG + Build.VERSION.SDK_INT, Build.MANUFACTURER + BundleUtil.UNDERLINE_TAG + Build.MODEL, str5, str6, str4, str7, str8, str9, this.mZoneID, this.mBrandId).IconCompatParcelizer(new FwFClientExtensionKtgetVariationsevalResults1() { // from class: com.qualtrics.digital.SiteInterceptService.4
            @Override // o.FwFClientExtensionKtgetVariationsevalResults1
            public void onFailure(syncCustomerProfile<Void> synccustomerprofile, Throwable th) {
                QualtricsLog.logError("Error recording impression for " + str + ": " + th.getMessage());
            }

            @Override // o.FwFClientExtensionKtgetVariationsevalResults1
            public void onResponse(syncCustomerProfile<Void> synccustomerprofile, getHoldoutVariationName<Void> getholdoutvariationname) {
                QualtricsLog.logInfo("Impression recorded for " + str);
            }
        });
    }

    public static SiteInterceptService instance() {
        if (mInstance == null) {
            mInstance = new SiteInterceptService();
        }
        return mInstance;
    }

    private void logUninitializedError(String str) {
        Locale locale = Locale.US;
        QualtricsLog.logError(ff$$ExternalSyntheticOutline0.m("Service not initialized,  ", str, "  cannot be performed"));
    }

    public void getAssetVersions(String str, FwFClientExtensionKtgetVariationsevalResults1 fwFClientExtensionKtgetVariationsevalResults1) {
        ISiteInterceptService iSiteInterceptService = this.mService;
        if (iSiteInterceptService == null) {
            logUninitializedError("get asset versions");
            return;
        }
        iSiteInterceptService.getAssetVersions(str, clientType, BuildConfig.VERSION_NAME, Build.VERSION.RELEASE + BundleUtil.UNDERLINE_TAG + Build.VERSION.SDK_INT, Build.MANUFACTURER + BundleUtil.UNDERLINE_TAG + Build.MODEL).IconCompatParcelizer(fwFClientExtensionKtgetVariationsevalResults1);
    }

    public void getCreativeDefinition(String str, int i, String str2, FwFClientExtensionKtgetVariationsevalResults1 fwFClientExtensionKtgetVariationsevalResults1) {
        ISiteInterceptService iSiteInterceptService = this.mService;
        if (iSiteInterceptService == null) {
            logUninitializedError("get creative definition");
            return;
        }
        iSiteInterceptService.getCreativeDefinition(str, i, str2, clientType, BuildConfig.VERSION_NAME, Build.VERSION.RELEASE + BundleUtil.UNDERLINE_TAG + Build.VERSION.SDK_INT, Build.MANUFACTURER + BundleUtil.UNDERLINE_TAG + Build.MODEL).IconCompatParcelizer(fwFClientExtensionKtgetVariationsevalResults1);
    }

    public void getInterceptDefinition(String str, int i, FwFClientExtensionKtgetVariationsevalResults1 fwFClientExtensionKtgetVariationsevalResults1) {
        ISiteInterceptService iSiteInterceptService = this.mService;
        if (iSiteInterceptService == null) {
            logUninitializedError("get intercept definition");
            return;
        }
        iSiteInterceptService.getInterceptDefinition(str, i, true, clientType, BuildConfig.VERSION_NAME, Build.VERSION.RELEASE + BundleUtil.UNDERLINE_TAG + Build.VERSION.SDK_INT, Build.MANUFACTURER + BundleUtil.UNDERLINE_TAG + Build.MODEL).IconCompatParcelizer(fwFClientExtensionKtgetVariationsevalResults1);
    }

    public void getMobileTargeting(String str, String str2, FwFClientExtensionKtgetVariationsevalResults1 fwFClientExtensionKtgetVariationsevalResults1) {
        if (this.mService == null) {
            logUninitializedError("get mobile targeting");
            return;
        }
        String strHashSHA256 = "";
        String str3 = str2 == null ? "" : str2;
        try {
            strHashSHA256 = HashingUtils.hashSHA256(str3);
        } catch (NoSuchAlgorithmException e) {
            QualtricsLog.logError("Error hashing extRefId for mobile targeting request: " + e.getMessage());
        }
        String str4 = strHashSHA256;
        this.mService.getMobileTargeting(str, str3, str4, clientType, BuildConfig.VERSION_NAME, Build.VERSION.RELEASE + BundleUtil.UNDERLINE_TAG + Build.VERSION.SDK_INT, Build.MANUFACTURER + BundleUtil.UNDERLINE_TAG + Build.MODEL).IconCompatParcelizer(fwFClientExtensionKtgetVariationsevalResults1);
    }

    public void recordClick(String str, String str2, String str3) {
        if (this.mService == null) {
            logUninitializedError("record click");
            return;
        }
        QualtricsLog.logInfo("Recording click...");
        this.mService.recordClick(1, str, str2, str3, this.mAppName, (System.currentTimeMillis() / 1000) + "", clientType, BuildConfig.VERSION_NAME, Build.VERSION.RELEASE + BundleUtil.UNDERLINE_TAG + Build.VERSION.SDK_INT, Build.MANUFACTURER + BundleUtil.UNDERLINE_TAG + Build.MODEL, this.mZoneID, this.mBrandId).IconCompatParcelizer(new FwFClientExtensionKtgetVariationsevalResults1() { // from class: com.qualtrics.digital.SiteInterceptService.5
            @Override // o.FwFClientExtensionKtgetVariationsevalResults1
            public void onResponse(syncCustomerProfile<Void> synccustomerprofile, getHoldoutVariationName<Void> getholdoutvariationname) {
                QualtricsLog.logInfo("Click recorded");
            }

            @Override // o.FwFClientExtensionKtgetVariationsevalResults1
            public void onFailure(syncCustomerProfile<Void> synccustomerprofile, Throwable th) {
                QualtricsLog.logError("Error recording click: " + th.getMessage());
            }
        });
    }

    public void recordPageView(String str, String str2, String str3) {
        if (this.mService == null) {
            logUninitializedError("record page view");
            return;
        }
        String str4 = str.matches(ZONE_TYPE_REGEX) ? ZONE_TYPE : INTERCEPT_TYPE;
        QualtricsLog.logInfo("Recording page view...");
        boolean zEquals = str4.equals("zone");
        ISiteInterceptService iSiteInterceptService = this.mService;
        String str5 = this.mAppName;
        if (zEquals) {
            iSiteInterceptService.zoneRecordPageView(1, str, str5, (System.currentTimeMillis() / 1000) + "", clientType, BuildConfig.VERSION_NAME, Build.VERSION.RELEASE + BundleUtil.UNDERLINE_TAG + Build.VERSION.SDK_INT, Build.MANUFACTURER + BundleUtil.UNDERLINE_TAG + Build.MODEL, this.mBrandId, this.mZoneID).IconCompatParcelizer(new FwFClientExtensionKtgetVariationsevalResults1() { // from class: com.qualtrics.digital.SiteInterceptService.2
                @Override // o.FwFClientExtensionKtgetVariationsevalResults1
                public void onResponse(syncCustomerProfile<Void> synccustomerprofile, getHoldoutVariationName<Void> getholdoutvariationname) {
                    QualtricsLog.logInfo("Zone page view recorded");
                }

                @Override // o.FwFClientExtensionKtgetVariationsevalResults1
                public void onFailure(syncCustomerProfile<Void> synccustomerprofile, Throwable th) {
                    QualtricsLog.logError("Error recording page view: " + th.getMessage());
                }
            });
            return;
        }
        iSiteInterceptService.interceptRecordPageView(1, str, str2, str3, str5, (System.currentTimeMillis() / 1000) + "", clientType, BuildConfig.VERSION_NAME, Build.VERSION.RELEASE + BundleUtil.UNDERLINE_TAG + Build.VERSION.SDK_INT, Build.MANUFACTURER + BundleUtil.UNDERLINE_TAG + Build.MODEL, this.mBrandId, this.mZoneID).IconCompatParcelizer(new FwFClientExtensionKtgetVariationsevalResults1() { // from class: com.qualtrics.digital.SiteInterceptService.3
            @Override // o.FwFClientExtensionKtgetVariationsevalResults1
            public void onResponse(syncCustomerProfile<Void> synccustomerprofile, getHoldoutVariationName<Void> getholdoutvariationname) {
                QualtricsLog.logInfo("Intercept page view recorded");
            }

            @Override // o.FwFClientExtensionKtgetVariationsevalResults1
            public void onFailure(syncCustomerProfile<Void> synccustomerprofile, Throwable th) {
                QualtricsLog.logError("Error recording page view: " + th.getMessage());
            }
        });
    }

    public void requestXMDContactFrequency(String str, String str2, Map<String, String> map, FwFClientExtensionKtgetVariationsevalResults1 fwFClientExtensionKtgetVariationsevalResults1) {
        if (this.mService == null) {
            logUninitializedError("get XMD contact frequency results");
            return;
        }
        StringBuilder sb = new StringBuilder("{");
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            sb.append(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("\"", next, "\":\"", map.get(next), "\""));
            if (it.hasNext()) {
                sb.append(",");
            }
        }
        sb.append("}");
        String string = sb.toString();
        this.mService.requestXMDContactFrequency(str, str2, string, clientType, BuildConfig.VERSION_NAME, Build.VERSION.RELEASE + BundleUtil.UNDERLINE_TAG + Build.VERSION.SDK_INT, Build.MANUFACTURER + BundleUtil.UNDERLINE_TAG + Build.MODEL).IconCompatParcelizer(fwFClientExtensionKtgetVariationsevalResults1);
    }

    public void postResponse(String str, String str2, String str3, String str4, String str5) {
        this.mService.postSurveyResponse(str, str3, str2, str4, str5).IconCompatParcelizer(new FwFClientExtensionKtgetVariationsevalResults1() { // from class: com.qualtrics.digital.SiteInterceptService.6
            @Override // o.FwFClientExtensionKtgetVariationsevalResults1
            public void onResponse(syncCustomerProfile<_get_messageWebView_lambda3> synccustomerprofile, getHoldoutVariationName<_get_messageWebView_lambda3> getholdoutvariationname) {
                QualtricsLog.logInfo("Qualtrics: Response saved");
            }

            @Override // o.FwFClientExtensionKtgetVariationsevalResults1
            public void onFailure(syncCustomerProfile<_get_messageWebView_lambda3> synccustomerprofile, Throwable th) {
                QualtricsLog.logError("Qualtrics: Error recording response:" + th.getMessage());
            }
        });
    }

    private getAppropriateImageUrl buildCache(File file) {
        if (file == null) {
            return null;
        }
        return new getAppropriateImageUrl(new File(file, "http-cache"), 131072L);
    }

    public void postErrorLog(Throwable th) {
        postErrorLog(null, false, th);
    }
}
