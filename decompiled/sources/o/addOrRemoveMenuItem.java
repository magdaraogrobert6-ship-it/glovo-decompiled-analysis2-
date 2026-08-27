package o;

import android.text.TextUtils;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.mlkit.vision.face.internal.zzm;
import com.huawei.location.lite.common.http.SubmitEx;
import com.huawei.location.lite.common.http.interceptor.UcsAuthInterceptor;
import com.huawei.location.lite.common.util.filedownload.DownLoadFileBean;
import com.huawei.location.lite.common.util.filedownload.DownloadFileParam;
import com.huawei.location.logic.zp;
import com.mapbox.search.base.MetadataExtKt;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class addOrRemoveMenuItem extends getOnAutofillRequested {
    @Override // o.getOnAutofillRequested
    public final void IconCompatParcelizer(zp zpVar) {
        super.IconCompatParcelizer(zpVar);
        DownloadFileParam downloadFileParam = this.IconCompatParcelizer;
        if (downloadFileParam == null) {
            write(10000, "param error");
            return;
        }
        String serviceType = downloadFileParam.getServiceType();
        String subType = this.IconCompatParcelizer.getSubType();
        if (TextUtils.isEmpty(serviceType) || TextUtils.isEmpty(subType)) {
            write(10000, "param error");
            return;
        }
        com.airbnb.lottie.PerformanceTracker performanceTracker = new com.airbnb.lottie.PerformanceTracker(UUID.randomUUID().toString());
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty("serviceType") && !TextUtils.isEmpty(serviceType)) {
            try {
                jSONObject.put("serviceType", serviceType);
            } catch (JSONException unused) {
                WrappedCompositionsetContent1211.read("RequestJsonBody", "add: failed");
            }
        }
        if (!TextUtils.isEmpty("subType") && !TextUtils.isEmpty(subType)) {
            try {
                jSONObject.put("subType", subType);
            } catch (JSONException unused2) {
                WrappedCompositionsetContent1211.read("RequestJsonBody", "add: failed");
            }
        }
        WrappedCompositionsetContent12 wrappedCompositionsetContent12 = new WrappedCompositionsetContent12("/location/v1/getFileDownloadUrl");
        wrappedCompositionsetContent12.write = performanceTracker;
        wrappedCompositionsetContent12.RemoteActionCompatParcelizer = jSONObject.toString().getBytes();
        wrappedCompositionsetContent12.RatingCompat = "application/json; charset=utf-8";
        wrappedCompositionsetContent12.MediaMetadataCompat = onChange.IconCompatParcelizer(com.huawei.hms.location.BuildConfig.LIBRARY_PACKAGE_NAME);
        wrappedCompositionsetContent12.IconCompatParcelizer = "POST";
        ArrayList arrayList = new ArrayList(4);
        new ArrayList(4);
        accessgetDisposedp accessgetdisposedp = new accessgetDisposedp();
        accessgetdisposedp.write = arrayList;
        arrayList.add(new r8lambdaTh5XutLsugSVCPGs8FSo2qiHMVU(2));
        UcsAuthInterceptor ucsAuthInterceptor = new UcsAuthInterceptor();
        ucsAuthInterceptor.write = 0;
        arrayList.add(ucsAuthInterceptor);
        arrayList.add(new r8lambdaTh5XutLsugSVCPGs8FSo2qiHMVU(0));
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
        } catch (Exception unused3) {
            WrappedCompositionsetContent1211.read("HttpClientReal", "init ssl socket factory failed");
        }
        accessgetdisposedp.IconCompatParcelizer = new r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0(r8lambdauggauuj_lbnzvef8yyxtwmhrlkq);
        try {
            DownLoadFileBean downLoadFileBean = (DownLoadFileBean) new SubmitEx(wrappedCompositionsetContent12.RemoteActionCompatParcelizer(), accessgetdisposedp).RemoteActionCompatParcelizer(DownLoadFileBean.class);
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("ReqDownloadUrlTask", "url request success url and fileVersion:" + downLoadFileBean.getFileAccessInfo().getVersion());
            IconCompatParcelizer(downLoadFileBean);
        } catch (WrappedCompositionsetContent1 e) {
            WrappedCompositionsetContent1211.read("ReqDownloadUrlTask", "apiErrorCode====" + e.read + "apiErrorMsg=====" + e.RemoteActionCompatParcelizer);
            isDisposed isdisposed = e.serializer;
            write(isdisposed.serializer, isdisposed.read);
        } catch (WrappedCompositionsetContent1ExternalSyntheticLambda0 e2) {
            StringBuilder sb = new StringBuilder("errorCode====");
            isDisposed isdisposed2 = e2.serializer;
            int i = isdisposed2.serializer;
            String str = isdisposed2.read;
            sb.append(i);
            sb.append("errorMsg=====");
            sb.append(str);
            WrappedCompositionsetContent1211.read("ReqDownloadUrlTask", sb.toString());
            write(isdisposed2.serializer, str);
        }
    }

    public final void IconCompatParcelizer(DownLoadFileBean downLoadFileBean) {
        zzm zzmVar = this.read;
        com.airbnb.lottie.PerformanceTracker performanceTracker = new com.airbnb.lottie.PerformanceTracker(3);
        performanceTracker.write(this.read.IconCompatParcelizer());
        performanceTracker.IconCompatParcelizer.put("download_entity", downLoadFileBean);
        HashMap map = performanceTracker.IconCompatParcelizer;
        getContentChild getcontentchild = new getContentChild();
        getcontentchild.IconCompatParcelizer = new HashMap(map);
        WindowRecomposer_androidKtgetAnimationScaleFlowFor111 windowRecomposer_androidKtgetAnimationScaleFlowFor111 = new WindowRecomposer_androidKtgetAnimationScaleFlowFor111();
        windowRecomposer_androidKtgetAnimationScaleFlowFor111.read = getcontentchild;
        zzmVar.serializer(windowRecomposer_androidKtgetAnimationScaleFlowFor111, this.RemoteActionCompatParcelizer);
    }
}
