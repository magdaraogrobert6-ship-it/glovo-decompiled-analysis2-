package com.huawei.location.lite.common.agc;

import android.text.TextUtils;
import com.airbnb.lottie.PerformanceTracker;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.firebase.Timestamp;
import com.huawei.hms.location.BuildConfig;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.location.lite.common.agc.net.AGCResponse;
import com.huawei.location.lite.common.http.SubmitEx;
import com.huawei.location.lite.common.http.interceptor.UcsAuthInterceptor;
import com.huawei.location.lite.common.util.APKUtil;
import com.huawei.secure.android.common.encrypt.keystore.aes.AesGcmKS;
import com.mapbox.search.base.MetadataExtKt;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import o.InAppMessageBoundedLayout;
import o.RelativeScroller;
import o.ViewConfigurationDefaultImpls;
import o.WrappedCompositionsetContent1;
import o.WrappedCompositionsetContent12;
import o.WrappedCompositionsetContent1211;
import o.WrappedCompositionsetContent1ExternalSyntheticLambda0;
import o.accessgetDisposedp;
import o.getAnimationScaleFlowFor;
import o.getOrder;
import o.onChange;
import o.onStateChanged;
import o.placeAtf8xVGno;
import o.r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0;
import o.r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc;
import o.r8lambdaTh5XutLsugSVCPGs8FSo2qiHMVU;
import o.r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ;
import o.setWebViewContent;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AGCManager {
    public static final byte[] read = new byte[0];
    public static volatile AGCManager write;
    public Timestamp.Companion IconCompatParcelizer;
    public volatile getAnimationScaleFlowFor RemoteActionCompatParcelizer;
    public final getOrder serializer = new getOrder("AGCInfo");

    public final getAnimationScaleFlowFor write() {
        synchronized (this) {
            if (this.RemoteActionCompatParcelizer != null && System.currentTimeMillis() <= this.RemoteActionCompatParcelizer.IconCompatParcelizer()) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("AGCManager", "use cache agcInfo");
                return this.RemoteActionCompatParcelizer;
            }
            this.RemoteActionCompatParcelizer = asyncGetAgcInfo();
            if (this.RemoteActionCompatParcelizer != null) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("AGCManager", "use agcInfo from online");
                return this.RemoteActionCompatParcelizer;
            }
            long jWrite = this.serializer.write("ExpireTime");
            String strRemoteActionCompatParcelizer = this.serializer.RemoteActionCompatParcelizer("Token");
            if (System.currentTimeMillis() > jWrite || TextUtils.isEmpty(strRemoteActionCompatParcelizer)) {
                return null;
            }
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("AGCManager", "use agcInfo from sp");
            this.RemoteActionCompatParcelizer = new getAnimationScaleFlowFor(0);
            getAnimationScaleFlowFor getanimationscaleflowfor = this.RemoteActionCompatParcelizer;
            String str = "";
            if (TextUtils.isEmpty("AGC_INFO") || TextUtils.isEmpty(strRemoteActionCompatParcelizer)) {
                WrappedCompositionsetContent1211.read("AesSecurityCipher", "decrypt alias or content is null");
            } else {
                try {
                    str = AesGcmKS.read("AGC_INFO", strRemoteActionCompatParcelizer);
                } catch (Exception unused) {
                    WrappedCompositionsetContent1211.serializer("AesSecurityCipher", "AesGcmKS decrypt failed");
                }
            }
            getanimationscaleflowfor.IconCompatParcelizer(str);
            this.RemoteActionCompatParcelizer.serializer(jWrite);
            return this.RemoteActionCompatParcelizer;
        }
    }

    public static AGCManager read() {
        if (write == null) {
            synchronized (read) {
                if (write == null) {
                    write = new AGCManager();
                }
            }
        }
        return write;
    }

    public static String serializer() {
        try {
            ViewConfigurationDefaultImpls viewConfigurationDefaultImpls = (ViewConfigurationDefaultImpls) onStateChanged.write(placeAtf8xVGno.read());
            return TextUtils.isEmpty(viewConfigurationDefaultImpls.serializer("client/app_id")) ? "" : viewConfigurationDefaultImpls.serializer("client/app_id");
        } catch (Exception unused) {
            WrappedCompositionsetContent1211.read("AGCManager", "get agc appId by exception");
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0198  */
    /* JADX WARN: Code duplicated, block: B:51:0x01df A[Catch: all -> 0x01f8, TryCatch #6 {, blocks: (B:41:0x01b7, B:43:0x01c1, B:45:0x01c9, B:48:0x01d0, B:52:0x01e6, B:50:0x01d7, B:51:0x01df), top: B:66:0x01b7, inners: #7 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01fb A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x01b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final getAnimationScaleFlowFor asyncGetAgcInfo() {
        AGCResponse aGCResponse;
        WrappedCompositionsetContent1ExternalSyntheticLambda0 e;
        WrappedCompositionsetContent1 e2;
        StringBuilder sb;
        String message;
        getAnimationScaleFlowFor getanimationscaleflowfor;
        AGCManager aGCManager;
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new Timestamp.Companion(0);
        }
        this.IconCompatParcelizer.getClass();
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("OnlineAgcService", "getOnlineAgcInfo");
        AGCResponse aGCResponse2 = new AGCResponse();
        try {
            try {
                JSONObject jSONObject = new JSONObject();
                String str = (String) APKUtil.getApkInfo(64, placeAtf8xVGno.read().getPackageName()).IconCompatParcelizer;
                if (!TextUtils.isEmpty(HiAnalyticsConstant.HaKey.BI_KEY_FINGERPRINT) && !TextUtils.isEmpty(str)) {
                    try {
                        jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_FINGERPRINT, str);
                    } catch (JSONException unused) {
                        WrappedCompositionsetContent1211.read("RequestJsonBody", "add: failed");
                    }
                }
                String string = jSONObject.toString();
                String string2 = UUID.randomUUID().toString();
                String strIconCompatParcelizer = onChange.IconCompatParcelizer(BuildConfig.LIBRARY_PACKAGE_NAME);
                if (TextUtils.isEmpty(strIconCompatParcelizer)) {
                    WrappedCompositionsetContent1211.read("OnlineAgcService", "grsHostAddress is null");
                } else {
                    String packageName = placeAtf8xVGno.read().getPackageName();
                    PerformanceTracker performanceTracker = new PerformanceTracker(string2);
                    performanceTracker.IconCompatParcelizer(packageName);
                    WrappedCompositionsetContent12 wrappedCompositionsetContent12 = new WrappedCompositionsetContent12("/location/v1/getToken");
                    wrappedCompositionsetContent12.MediaMetadataCompat = strIconCompatParcelizer;
                    wrappedCompositionsetContent12.write = performanceTracker;
                    wrappedCompositionsetContent12.RemoteActionCompatParcelizer = string.getBytes();
                    wrappedCompositionsetContent12.RatingCompat = "application/json; charset=utf-8";
                    placeAtf8xVGno.read();
                    ArrayList arrayList = new ArrayList(4);
                    new ArrayList(4);
                    accessgetDisposedp accessgetdisposedp = new accessgetDisposedp();
                    accessgetdisposedp.write = arrayList;
                    arrayList.add(new r8lambdaTh5XutLsugSVCPGs8FSo2qiHMVU(2));
                    UcsAuthInterceptor ucsAuthInterceptor = new UcsAuthInterceptor();
                    ucsAuthInterceptor.write = 0;
                    arrayList.add(ucsAuthInterceptor);
                    WrappedCompositionsetContent1211.read();
                    r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ r8lambdauggauuj_lbnzvef8yyxtwmhrlkq = new r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ();
                    InAppMessageBoundedLayout inAppMessageBoundedLayout = accessgetDisposedp.RemoteActionCompatParcelizer;
                    inAppMessageBoundedLayout.getClass();
                    r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.MediaDescriptionCompat = inAppMessageBoundedLayout;
                    r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = false;
                    r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.write(Collections.unmodifiableList(Arrays.asList(r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.HTTP_2, r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.HTTP_1_1)));
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.RemoteActionCompatParcelizer(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, timeUnit);
                    r8lambdauggauuj_lbnzvef8yyxtwmhrlkq._init_lambda2 = setWebViewContent.read("timeout", DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, timeUnit);
                    r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.read(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, timeUnit);
                    try {
                        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.IconCompatParcelizer(RelativeScroller.serializer(placeAtf8xVGno.read(), new SecureRandom()), MetadataExtKt.read(placeAtf8xVGno.read()));
                    } catch (Exception unused2) {
                        WrappedCompositionsetContent1211.read("HttpClientReal", "init ssl socket factory failed");
                    }
                    accessgetdisposedp.IconCompatParcelizer = new r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0(r8lambdauggauuj_lbnzvef8yyxtwmhrlkq);
                    aGCResponse = (AGCResponse) new SubmitEx(wrappedCompositionsetContent12.RemoteActionCompatParcelizer(), accessgetdisposedp).RemoteActionCompatParcelizer(AGCResponse.class);
                    try {
                        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("OnlineAgcService", "doHttp, response code is " + aGCResponse.getApiCode());
                    } catch (Exception unused3) {
                        aGCResponse2 = aGCResponse;
                        WrappedCompositionsetContent1211.read("OnlineAgcService", "unknown exception");
                        if (aGCResponse2.isSuccess()) {
                            return null;
                        }
                        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("OnlineAgcService", "getOnlineAgcInfo success,save to cache");
                        getanimationscaleflowfor = new getAnimationScaleFlowFor(0);
                        getanimationscaleflowfor.serializer(aGCResponse2.getExpireTime());
                        getanimationscaleflowfor.IconCompatParcelizer(aGCResponse2.getToken());
                        aGCManager = read();
                        synchronized (aGCManager) {
                            aGCManager.RemoteActionCompatParcelizer = getanimationscaleflowfor;
                            getOrder getorder = aGCManager.serializer;
                            String str2 = getanimationscaleflowfor.read();
                            String strSerializer = "";
                            if (TextUtils.isEmpty("AGC_INFO")) {
                                WrappedCompositionsetContent1211.read("AesSecurityCipher", "encrypt alias or content is null");
                                getorder.IconCompatParcelizer("Token", strSerializer);
                                aGCManager.serializer.write("ExpireTime", getanimationscaleflowfor.IconCompatParcelizer());
                                return getanimationscaleflowfor;
                            }
                            WrappedCompositionsetContent1211.read("AesSecurityCipher", "encrypt alias or content is null");
                            getorder.IconCompatParcelizer("Token", strSerializer);
                            aGCManager.serializer.write("ExpireTime", getanimationscaleflowfor.IconCompatParcelizer());
                            return getanimationscaleflowfor;
                            throw th;
                        }
                    } catch (WrappedCompositionsetContent1 e3) {
                        e2 = e3;
                        sb = new StringBuilder("doHttp, OnErrorException: code is ");
                        sb.append(e2.read);
                        sb.append(", msg is ");
                        message = e2.RemoteActionCompatParcelizer;
                        sb.append(message);
                        WrappedCompositionsetContent1211.read("OnlineAgcService", sb.toString());
                    } catch (WrappedCompositionsetContent1ExternalSyntheticLambda0 e4) {
                        e = e4;
                        sb = new StringBuilder("doHttp, OnFailureException: code is ");
                        sb.append(e.serializer);
                        sb.append(", msg is ");
                        message = e.getMessage();
                        sb.append(message);
                        WrappedCompositionsetContent1211.read("OnlineAgcService", sb.toString());
                    }
                    aGCResponse2 = aGCResponse;
                }
            } catch (Exception unused4) {
            }
        } catch (WrappedCompositionsetContent1 e5) {
            aGCResponse = aGCResponse2;
            e2 = e5;
        } catch (WrappedCompositionsetContent1ExternalSyntheticLambda0 e6) {
            aGCResponse = aGCResponse2;
            e = e6;
        }
        if (aGCResponse2.isSuccess()) {
            return null;
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("OnlineAgcService", "getOnlineAgcInfo success,save to cache");
        getanimationscaleflowfor = new getAnimationScaleFlowFor(0);
        getanimationscaleflowfor.serializer(aGCResponse2.getExpireTime());
        getanimationscaleflowfor.IconCompatParcelizer(aGCResponse2.getToken());
        aGCManager = read();
        synchronized (aGCManager) {
            aGCManager.RemoteActionCompatParcelizer = getanimationscaleflowfor;
            getOrder getorder2 = aGCManager.serializer;
            String str3 = getanimationscaleflowfor.read();
            String strSerializer2 = "";
            if (TextUtils.isEmpty("AGC_INFO") || TextUtils.isEmpty(str3)) {
                WrappedCompositionsetContent1211.read("AesSecurityCipher", "encrypt alias or content is null");
            } else {
                try {
                    strSerializer2 = AesGcmKS.serializer("AGC_INFO", str3);
                } catch (Exception unused5) {
                    WrappedCompositionsetContent1211.serializer("AesSecurityCipher", "AesGcmKS encrypt failed");
                }
            }
            getorder2.IconCompatParcelizer("Token", strSerializer2);
            aGCManager.serializer.write("ExpireTime", getanimationscaleflowfor.IconCompatParcelizer());
        }
        return getanimationscaleflowfor;
    }
}
