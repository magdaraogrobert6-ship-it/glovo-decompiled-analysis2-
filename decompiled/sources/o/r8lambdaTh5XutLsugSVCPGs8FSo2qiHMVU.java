package o;

import android.os.Build;
import android.text.TextUtils;
import com.deliveryhero.fwf_http.ConstantKt;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.location.lite.common.agc.AGCManager;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes2.dex */
public final class r8lambdaTh5XutLsugSVCPGs8FSo2qiHMVU implements accesssetAddedToLifecyclep {
    public final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ r8lambdaTh5XutLsugSVCPGs8FSo2qiHMVU(int i) {
        this.IconCompatParcelizer = i;
    }

    public static void serializer(WrappedCompositionsetContent12 wrappedCompositionsetContent12, String str, String str2) {
        try {
            wrappedCompositionsetContent12.write(str, str2);
        } catch (IllegalArgumentException | NullPointerException unused) {
            WrappedCompositionsetContent1211.read();
        }
    }

    @Override // o.accesssetAddedToLifecyclep
    public final accesssetLastContentp read(androidx.recyclerview.widget.ChildHelper childHelper) throws WrappedCompositionsetContent1, WrappedCompositionsetContent1ExternalSyntheticLambda0, IOException {
        byte[] byteArray;
        String str;
        String string;
        int i = this.IconCompatParcelizer;
        if (i == 0) {
            WrappedCompositionsetContent12 wrappedCompositionsetContent12RemoteActionCompatParcelizer = (WrappedCompositionsetContent12) childHelper.MediaSessionCompatQueueItem;
            getAnimationScaleFlowFor getanimationscaleflowforWrite = AGCManager.read().write();
            if (getanimationscaleflowforWrite != null) {
                WrappedCompositionsetContent12 wrappedCompositionsetContent12IconCompatParcelizer = wrappedCompositionsetContent12RemoteActionCompatParcelizer.IconCompatParcelizer();
                wrappedCompositionsetContent12IconCompatParcelizer.write("expireTime", String.valueOf(getanimationscaleflowforWrite.IconCompatParcelizer()));
                wrappedCompositionsetContent12IconCompatParcelizer.write("token", getanimationscaleflowforWrite.read());
                wrappedCompositionsetContent12RemoteActionCompatParcelizer = wrappedCompositionsetContent12IconCompatParcelizer.RemoteActionCompatParcelizer();
            }
            return childHelper.read(wrappedCompositionsetContent12RemoteActionCompatParcelizer);
        }
        if (i != 1) {
            WrappedCompositionsetContent12 wrappedCompositionsetContent12IconCompatParcelizer2 = ((WrappedCompositionsetContent12) childHelper.MediaSessionCompatQueueItem).IconCompatParcelizer();
            serializer(wrappedCompositionsetContent12IconCompatParcelizer2, "X-Device-Type", Integer.toString(onActionItemClicked.write(placeAtf8xVGno.read())));
            synchronized (onActionItemClicked.class) {
                if (TextUtils.isEmpty(onActionItemClicked.IconCompatParcelizer)) {
                    onActionItemClicked.IconCompatParcelizer = Build.MODEL;
                }
                str = onActionItemClicked.IconCompatParcelizer;
            }
            serializer(wrappedCompositionsetContent12IconCompatParcelizer2, "X-PhoneModel", str);
            AGCManager.read().getClass();
            serializer(wrappedCompositionsetContent12IconCompatParcelizer2, HiAnalyticsConstant.HaKey.BI_KEY_APPID, AGCManager.serializer());
            com.airbnb.lottie.PerformanceTracker performanceTracker = wrappedCompositionsetContent12IconCompatParcelizer2.write;
            if (performanceTracker != null && !TextUtils.isEmpty(ConstantKt.USER_AGENT_HEADER)) {
            }
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                string = "";
            } else {
                StringBuilder sb = new StringBuilder();
                int length = property.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char cCharAt = property.charAt(i2);
                    if (cCharAt <= 31 || cCharAt >= 127) {
                        sb.append(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                    } else {
                        sb.append(cCharAt);
                    }
                }
                string = sb.toString();
            }
            serializer(wrappedCompositionsetContent12IconCompatParcelizer2, ConstantKt.USER_AGENT_HEADER, string);
            String strValueOf = String.valueOf(21600302);
            if (!TextUtils.isEmpty("clientLiteSDKVersion") && !TextUtils.isEmpty(strValueOf)) {
                if (wrappedCompositionsetContent12IconCompatParcelizer2.MediaBrowserCompatMediaItem == null) {
                    wrappedCompositionsetContent12IconCompatParcelizer2.MediaBrowserCompatMediaItem = new TreeMap();
                }
                wrappedCompositionsetContent12IconCompatParcelizer2.MediaBrowserCompatMediaItem.put("clientLiteSDKVersion", strValueOf);
            }
            return childHelper.read(wrappedCompositionsetContent12IconCompatParcelizer2.RemoteActionCompatParcelizer());
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        WrappedCompositionsetContent1211.read();
        i$d.a aVar = (i$d.a) childHelper.write;
        WrappedCompositionsetContent12 wrappedCompositionsetContent12 = (WrappedCompositionsetContent12) childHelper.MediaSessionCompatQueueItem;
        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = new _get_messageWebView_lambda0(0);
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = null;
        InAppMessageHtmlBaseView inAppMessageHtmlBaseViewWrite = null;
        RequestBody requestBodyCreate = null;
        if (wrappedCompositionsetContent12 != null) {
            String str2 = wrappedCompositionsetContent12.IconCompatParcelizer;
            wrappedCompositionsetContent12.toString();
            WrappedCompositionsetContent1211.read();
            String str3 = wrappedCompositionsetContent12.MediaMetadataCompat;
            if (TextUtils.equals("POST", str3)) {
                if (TextUtils.isEmpty(str2)) {
                    str2 = "application/json; charset=utf-8";
                    getInAppMessageEventMap getinappmessageeventmap = InAppMessageHtmlBaseView.TYPE_SUBTYPE;
                } else {
                    getInAppMessageEventMap getinappmessageeventmap2 = InAppMessageHtmlBaseView.TYPE_SUBTYPE;
                    str2.getClass();
                }
                try {
                    inAppMessageHtmlBaseViewWrite = androidx.sqlite.SQLite.write(str2);
                } catch (IllegalArgumentException unused) {
                }
                byte[] bArr = wrappedCompositionsetContent12.RemoteActionCompatParcelizer;
                RequestBuilder requestBuilder = RequestBuilder.EMPTY;
                requestBodyCreate = RequestBody.create(inAppMessageHtmlBaseViewWrite, ImageHeaderParserImageType.IconCompatParcelizer(bArr));
            }
            try {
                _get_messagewebview_lambda0.read(wrappedCompositionsetContent12.write());
                _get_messagewebview_lambda0.write(str3, requestBodyCreate);
                HashMap map = wrappedCompositionsetContent12.write.IconCompatParcelizer;
                if (map == null) {
                    r8lambday113fdftsr5e4pzj6xssxltpl60 = new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0);
                } else {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!TextUtils.isEmpty((CharSequence) entry.getValue())) {
                            _get_messagewebview_lambda0.serializer((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    r8lambday113fdftsr5e4pzj6xssxltpl60 = new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0);
                }
            } catch (IllegalArgumentException unused2) {
                isDisposed isdisposedWrite = isDisposed.write(10309);
                WrappedCompositionsetContent1 wrappedCompositionsetContent1 = new WrappedCompositionsetContent1(isdisposedWrite);
                wrappedCompositionsetContent1.read = String.valueOf(isdisposedWrite.serializer);
                wrappedCompositionsetContent1.RemoteActionCompatParcelizer = isdisposedWrite.read;
                throw wrappedCompositionsetContent1;
            }
        }
        _get_messageWebView_lambda1 _get_messagewebview_lambda1Execute = FirebasePerfOkHttpClient.execute(((r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0) aVar.read).IconCompatParcelizer(r8lambday113fdftsr5e4pzj6xssxltpl60));
        _get_messageWebView_lambda3 _get_messagewebview_lambda3 = _get_messagewebview_lambda1Execute.body;
        if (_get_messagewebview_lambda3 == null) {
            throw new WrappedCompositionsetContent1ExternalSyntheticLambda0(isDisposed.write(10307));
        }
        resetMessageMarginslambda00 resetmessagemarginslambda00 = _get_messagewebview_lambda1Execute.headers;
        HashMap map2 = new HashMap();
        for (String str4 : resetmessagemarginslambda00.write()) {
            List listSerializer = resetmessagemarginslambda00.serializer(str4);
            if (!listSerializer.isEmpty()) {
                Iterator it = listSerializer.iterator();
                while (it.hasNext()) {
                    map2.put(str4, (String) it.next());
                }
            }
        }
        InAppMessageHtmlBaseView inAppMessageHtmlBaseViewWrite2 = _get_messagewebview_lambda3.write();
        InputStream inputStreamMediaMetadataCompat = _get_messagewebview_lambda3.read().MediaMetadataCompat();
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr2 = new byte[androidx.compose.ui.graphics.Fields.TransformOrigin];
                    while (true) {
                        int i3 = inputStreamMediaMetadataCompat.read(bArr2);
                        if (i3 == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, i3);
                    }
                    byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    try {
                        inputStreamMediaMetadataCompat.close();
                    } catch (IOException unused3) {
                        WrappedCompositionsetContent1211.read("HttpUtils", "toByteArray close error");
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    inputStreamMediaMetadataCompat.close();
                } catch (IOException unused4) {
                    WrappedCompositionsetContent1211.read("HttpUtils", "toByteArray close error");
                }
                throw th3;
            }
        } catch (IOException unused5) {
            WrappedCompositionsetContent1211.read();
            try {
                inputStreamMediaMetadataCompat.close();
            } catch (IOException unused6) {
                WrappedCompositionsetContent1211.read("HttpUtils", "toByteArray close error");
            }
            byteArray = new byte[0];
        }
        String str5 = inAppMessageHtmlBaseViewWrite2 != null ? inAppMessageHtmlBaseViewWrite2.mediaType : "";
        long jIconCompatParcelizer = _get_messagewebview_lambda3.IconCompatParcelizer();
        LayoutNodeSubcompositionsStateScope layoutNodeSubcompositionsStateScope = new LayoutNodeSubcompositionsStateScope(3);
        layoutNodeSubcompositionsStateScope.RemoteActionCompatParcelizer = str5;
        layoutNodeSubcompositionsStateScope.IconCompatParcelizer = jIconCompatParcelizer;
        layoutNodeSubcompositionsStateScope.serializer = byteArray;
        com.airbnb.lottie.PerformanceTracker performanceTracker2 = new com.airbnb.lottie.PerformanceTracker(4);
        performanceTracker2.IconCompatParcelizer.putAll(map2);
        String str6 = _get_messagewebview_lambda1Execute.message;
        int i4 = _get_messagewebview_lambda1Execute.code;
        String str7 = _get_messagewebview_lambda1Execute.request.url.url;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        accesssetLastContentp accesssetlastcontentp = new accesssetLastContentp();
        accesssetlastcontentp.serializer = layoutNodeSubcompositionsStateScope;
        accesssetlastcontentp.read = performanceTracker2;
        accesssetlastcontentp.RemoteActionCompatParcelizer = i4;
        accesssetlastcontentp.IconCompatParcelizer = str6;
        accesssetlastcontentp.MediaMetadataCompat = jCurrentTimeMillis;
        accesssetlastcontentp.write = jCurrentTimeMillis2;
        accesssetlastcontentp.RatingCompat = str7;
        return accesssetlastcontentp;
    }
}
