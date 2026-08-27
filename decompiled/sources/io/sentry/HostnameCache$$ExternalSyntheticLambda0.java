package io.sentry;

import android.text.TextUtils;
import androidx.compose.ui.graphics.Fields;
import com.airbnb.lottie.PerformanceTracker;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.gson.Gson;
import com.huawei.location.lite.common.config.ConfigResponseData;
import com.huawei.location.lite.common.http.SubmitEx;
import com.huawei.location.lite.common.http.interceptor.UcsAuthInterceptor;
import com.mapbox.search.base.MetadataExtKt;
import io.sentry.android.core.internal.util.RatingCompat;
import java.net.InetAddress;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import o.InAppMessageBoundedLayout;
import o.RelativeScroller;
import o.WrappedCompositionsetContent1;
import o.WrappedCompositionsetContent12;
import o.WrappedCompositionsetContent1211;
import o.WrappedCompositionsetContent1ExternalSyntheticLambda0;
import o.accessgetDisposedp;
import o.isDisposed;
import o.placeAtf8xVGno;
import o.r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0;
import o.r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc;
import o.r8lambdaTh5XutLsugSVCPGs8FSo2qiHMVU;
import o.r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ;
import o.setClip;
import o.setWebViewContent;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class HostnameCache$$ExternalSyntheticLambda0 implements Callable {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ HostnameCache$$ExternalSyntheticLambda0(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        StringBuilder sb;
        String str;
        String string;
        int i = 2;
        int i2 = 2 % 2;
        int i3 = read + 55;
        write = i3 % Fields.SpotShadowColor;
        String json = null;
        if (i3 % 2 == 0) {
            json.hashCode();
            throw null;
        }
        int i4 = this.RemoteActionCompatParcelizer;
        if (i4 == 0) {
            return InetAddress.getLocalHost();
        }
        if (i4 != 1) {
            if (i4 == 2) {
                return new setClip();
            }
            if (i4 != 3) {
                return i4 != 4 ? RatingCompat.read.IconCompatParcelizer() : new ArrayList();
            }
            return null;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty("groupName") && !TextUtils.isEmpty("liteSDK")) {
                    int i5 = read + 83;
                    write = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    try {
                        jSONObject.put("groupName", "liteSDK");
                    } catch (JSONException unused) {
                        WrappedCompositionsetContent1211.read("RequestJsonBody", "add: failed");
                    }
                }
                PerformanceTracker performanceTracker = new PerformanceTracker(String.valueOf(UUID.randomUUID()));
                WrappedCompositionsetContent12 wrappedCompositionsetContent12 = new WrappedCompositionsetContent12("/networklocation/v1/configurations");
                wrappedCompositionsetContent12.write = performanceTracker;
                wrappedCompositionsetContent12.RemoteActionCompatParcelizer = jSONObject.toString().getBytes();
                wrappedCompositionsetContent12.RatingCompat = "application/json; charset=utf-8";
                placeAtf8xVGno.read();
                ArrayList arrayList = new ArrayList(4);
                new ArrayList(4);
                accessgetDisposedp accessgetdisposedp = new accessgetDisposedp();
                accessgetdisposedp.write = arrayList;
                arrayList.add(new r8lambdaTh5XutLsugSVCPGs8FSo2qiHMVU(i));
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
                } catch (Exception unused2) {
                    WrappedCompositionsetContent1211.read("HttpClientReal", "init ssl socket factory failed");
                }
                accessgetdisposedp.IconCompatParcelizer = new r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0(r8lambdauggauuj_lbnzvef8yyxtwmhrlkq);
                json = new Gson().toJson(((ConfigResponseData) new SubmitEx(wrappedCompositionsetContent12.RemoteActionCompatParcelizer(), accessgetdisposedp).RemoteActionCompatParcelizer(ConfigResponseData.class)).getData());
                int i7 = read + 75;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            } catch (Exception unused3) {
                string = "OnException:";
                WrappedCompositionsetContent1211.read("ConfigManager", string);
            }
        } catch (WrappedCompositionsetContent1 e) {
            sb = new StringBuilder("OnErrorException:code:");
            sb.append(e.serializer.serializer);
            sb.append(",apiCode:");
            sb.append(e.read);
            sb.append(",apiMsg:");
            str = e.RemoteActionCompatParcelizer;
            sb.append(str);
            string = sb.toString();
            WrappedCompositionsetContent1211.read("ConfigManager", string);
        } catch (WrappedCompositionsetContent1ExternalSyntheticLambda0 e2) {
            sb = new StringBuilder("OnFailureException:");
            isDisposed isdisposed = e2.serializer;
            sb.append(isdisposed.serializer);
            sb.append(",");
            str = isdisposed.read;
            sb.append(str);
            string = sb.toString();
            WrappedCompositionsetContent1211.read("ConfigManager", string);
        }
        return json;
    }
}
