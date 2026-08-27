package o;

import android.os.Parcelable;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.mlkit.vision.face.internal.zzm;
import com.huawei.location.lite.common.http.SubmitEx;
import com.huawei.location.lite.common.util.filedownload.DownLoadFileBean;
import com.huawei.location.lite.common.util.filedownload.DownloadFileParam;
import com.huawei.location.logic.zp;
import com.huawei.location.router.dispatch.IDispatchExceptionListener;
import com.mapbox.search.base.MetadataExtKt;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class getOnActionModeDestroy extends getOnAutofillRequested {
    public getOnPasteRequested write;

    public final void write(byte[] bArr) {
        DownloadFileParam downloadFileParam;
        if (bArr == null || bArr.length <= 0 || (downloadFileParam = this.IconCompatParcelizer) == null) {
            WrappedCompositionsetContent1211.read("DownloadFileTask", "responseBody is null");
            return;
        }
        File file = new File(downloadFileParam.getSaveFilePath(), this.IconCompatParcelizer.getFileName());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, false);
            try {
                fileOutputStream.write(bArr, 0, bArr.length);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            WrappedCompositionsetContent1211.read("DownloadFileTask", "saveToSd createSdFile stream read write exception");
        }
        zzm zzmVar = this.read;
        com.airbnb.lottie.PerformanceTracker performanceTracker = new com.airbnb.lottie.PerformanceTracker(3);
        performanceTracker.write(this.read.IconCompatParcelizer());
        performanceTracker.write(file, "download_file");
        HashMap map = performanceTracker.IconCompatParcelizer;
        getContentChild getcontentchild = new getContentChild();
        getcontentchild.IconCompatParcelizer = new HashMap(map);
        WindowRecomposer_androidKtgetAnimationScaleFlowFor111 windowRecomposer_androidKtgetAnimationScaleFlowFor111 = new WindowRecomposer_androidKtgetAnimationScaleFlowFor111();
        windowRecomposer_androidKtgetAnimationScaleFlowFor111.read = getcontentchild;
        zzmVar.serializer(windowRecomposer_androidKtgetAnimationScaleFlowFor111, this.RemoteActionCompatParcelizer);
    }

    @Override // o.getOnAutofillRequested
    public final void IconCompatParcelizer(zp zpVar) {
        String str;
        super.IconCompatParcelizer(zpVar);
        Parcelable parcelableWrite = this.read.IconCompatParcelizer().write("download_entity");
        if (!(parcelableWrite instanceof DownLoadFileBean)) {
            write(IDispatchExceptionListener.OTHER_ERROR, "The data format error");
            return;
        }
        DownLoadFileBean downLoadFileBean = (DownLoadFileBean) parcelableWrite;
        getOnPasteRequested getonpasterequested = this.write;
        if (getonpasterequested != null && !getonpasterequested.read(downLoadFileBean)) {
            write(10005, "business not need download file");
            return;
        }
        String version = downLoadFileBean.getFileAccessInfo().getVersion();
        String url = downLoadFileBean.getFileAccessInfo().getUrl();
        String fileSha256 = downLoadFileBean.getFileAccessInfo().getFileSha256();
        if (TextUtils.isEmpty(version) || TextUtils.isEmpty(url) || TextUtils.isEmpty(fileSha256)) {
            write(10004, "download url format error with empty data");
            return;
        }
        if (TextUtils.isEmpty(url) || TextUtils.isEmpty(fileSha256) || !URLUtil.isHttpsUrl(url)) {
            write(10004, "download url not https or sha256 error");
            return;
        }
        try {
            URI uri = new URI(url);
            if (TextUtils.isEmpty(uri.getScheme())) {
                str = "uri scheme is undefined";
            } else if (TextUtils.isEmpty(uri.getHost())) {
                str = "uri host is undefined";
            } else {
                if (!TextUtils.isEmpty(uri.getPath())) {
                    StringBuilder sb = new StringBuilder(0);
                    sb.append(uri.getScheme());
                    sb.append("://");
                    sb.append(uri.getHost());
                    StringBuilder sb2 = new StringBuilder(0);
                    sb2.append(uri.getPath());
                    if (!TextUtils.isEmpty(uri.getQuery())) {
                        sb2.append("?");
                        sb2.append(uri.getQuery());
                    }
                    com.airbnb.lottie.PerformanceTracker performanceTracker = new com.airbnb.lottie.PerformanceTracker(UUID.randomUUID().toString());
                    JSONObject jSONObject = new JSONObject();
                    WrappedCompositionsetContent12 wrappedCompositionsetContent12 = new WrappedCompositionsetContent12(sb2.toString());
                    wrappedCompositionsetContent12.write = performanceTracker;
                    wrappedCompositionsetContent12.RemoteActionCompatParcelizer = jSONObject.toString().getBytes();
                    wrappedCompositionsetContent12.RatingCompat = "application/json; charset=utf-8";
                    wrappedCompositionsetContent12.MediaMetadataCompat = sb.toString();
                    wrappedCompositionsetContent12.IconCompatParcelizer = "GET";
                    ArrayList arrayList = new ArrayList(4);
                    new ArrayList(4);
                    accessgetDisposedp accessgetdisposedp = new accessgetDisposedp();
                    accessgetdisposedp.write = arrayList;
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
                    } catch (Exception unused) {
                        WrappedCompositionsetContent1211.read("HttpClientReal", "init ssl socket factory failed");
                    }
                    accessgetdisposedp.IconCompatParcelizer = new r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0(r8lambdauggauuj_lbnzvef8yyxtwmhrlkq);
                    try {
                        write(new SubmitEx(wrappedCompositionsetContent12.RemoteActionCompatParcelizer(), accessgetdisposedp).serializer());
                        return;
                    } catch (WrappedCompositionsetContent1 e) {
                        WrappedCompositionsetContent1211.read("DownloadFileTask", "apiErrorCode====" + e.read + "apiErrorMsg=====" + e.RemoteActionCompatParcelizer);
                        isDisposed isdisposed = e.serializer;
                        write(isdisposed.serializer, isdisposed.read);
                        return;
                    } catch (WrappedCompositionsetContent1ExternalSyntheticLambda0 e2) {
                        StringBuilder sb3 = new StringBuilder("errorCode====");
                        isDisposed isdisposed2 = e2.serializer;
                        int i = isdisposed2.serializer;
                        String str2 = isdisposed2.read;
                        sb3.append(i);
                        sb3.append("errorMsg=====");
                        sb3.append(str2);
                        WrappedCompositionsetContent1211.read("DownloadFileTask", sb3.toString());
                        write(isdisposed2.serializer, str2);
                        return;
                    }
                }
                str = "uri path is undefined";
            }
            WrappedCompositionsetContent1211.read("DownloadFileTask", str);
            write(10004, "download url format error");
        } catch (URISyntaxException unused2) {
            write(10004, "download url MalformedURLException");
            WrappedCompositionsetContent1211.read("DownloadFileTask", "MalformedURLException");
        }
    }
}
