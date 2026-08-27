package com.huawei.location.lite.common.http.interceptor;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.recyclerview.widget.ChildHelper;
import com.airbnb.lottie.PerformanceTracker;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.location.lite.common.http.exception.AuthException;
import com.huawei.location.lite.common.http.sign.ucs.UCSSignHelper;
import com.huawei.wisesecurity.ucs.common.exception.UcsCryptoException;
import com.huawei.wisesecurity.ucs.common.exception.UcsException;
import com.mapbox.navigation.core.utils.Delayer;
import com.sentiance.core.model.events.E$b;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import o.WrappedCompositionsetContent12;
import o.WrappedCompositionsetContent1211;
import o.WrapperRenderNodeLayerHelperMethods;
import o.accesssetAddedToLifecyclep;
import o.accesssetLastContentp;
import o.getOrder;
import o.isDisposed;
import o.placeAtf8xVGno;

/* JADX INFO: loaded from: classes2.dex */
public final class UcsAuthInterceptor implements accesssetAddedToLifecyclep {
    public int write;

    @Override // o.accesssetAddedToLifecyclep
    public final accesssetLastContentp read(ChildHelper childHelper) {
        String string;
        WrappedCompositionsetContent12 wrappedCompositionsetContent12 = (WrappedCompositionsetContent12) childHelper.MediaSessionCompatQueueItem;
        WrappedCompositionsetContent1211.read();
        String str = new String(wrappedCompositionsetContent12.RemoteActionCompatParcelizer, StandardCharsets.UTF_8);
        PerformanceTracker performanceTracker = wrappedCompositionsetContent12.write;
        String string2 = performanceTracker.read("X-Request-ID");
        String str2 = performanceTracker.read("X-CP-Info");
        String str3 = wrappedCompositionsetContent12.MediaMetadataCompat;
        String str4 = wrappedCompositionsetContent12.read;
        String str5 = wrappedCompositionsetContent12.RatingCompat;
        E$b e$b = new E$b(7);
        if (TextUtils.isEmpty(string2)) {
            string2 = UUID.randomUUID().toString();
        }
        e$b.MediaBrowserCompatMediaItem = str4;
        e$b.write = string2;
        e$b.MediaDescriptionCompat = str5;
        e$b.read = str3;
        e$b.IconCompatParcelizer = str;
        if (wrappedCompositionsetContent12.MediaBrowserCompatMediaItem == null) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : wrappedCompositionsetContent12.MediaBrowserCompatMediaItem.entrySet()) {
                if (sb.length() > 0) {
                    sb.append(ContainerUtils.FIELD_DELIMITER);
                }
                sb.append((String) entry.getKey());
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append((String) entry.getValue());
            }
            string = sb.toString();
        }
        e$b.RemoteActionCompatParcelizer = string;
        HashMap map = new HashMap(4);
        if (!TextUtils.isEmpty(str2)) {
            map.put("X-CP-Info", str2);
        }
        StringBuffer stringBuffer = new StringBuffer("");
        StringBuffer stringBuffer2 = new StringBuffer("");
        for (Map.Entry entry2 : map.entrySet()) {
            stringBuffer.append((String) entry2.getKey());
            stringBuffer.append(ContainerUtils.KEY_VALUE_DELIMITER);
            stringBuffer.append((String) entry2.getValue());
            stringBuffer.append(ContainerUtils.FIELD_DELIMITER);
            stringBuffer2.append((String) entry2.getKey());
            stringBuffer2.append(";");
        }
        e$b.MediaMetadataCompat = new String[]{TextUtils.isEmpty(stringBuffer) ? "" : stringBuffer.substring(0, stringBuffer.length() - 1), TextUtils.isEmpty(stringBuffer2) ? "" : stringBuffer2.substring(0, stringBuffer2.length() - 1)};
        return childHelper.read(RemoteActionCompatParcelizer(wrappedCompositionsetContent12, e$b));
    }

    public final WrappedCompositionsetContent12 RemoteActionCompatParcelizer(WrappedCompositionsetContent12 wrappedCompositionsetContent12, E$b e$b) throws AuthException {
        try {
            String strSerializer = WrapperRenderNodeLayerHelperMethods.IconCompatParcelizer.serializer(placeAtf8xVGno.read(), e$b);
            wrappedCompositionsetContent12.write.read("X-Request-ID");
            WrappedCompositionsetContent1211.read();
            "auth:".concat(strSerializer);
            WrappedCompositionsetContent1211.read();
            WrappedCompositionsetContent12 wrappedCompositionsetContent12IconCompatParcelizer = wrappedCompositionsetContent12.IconCompatParcelizer();
            wrappedCompositionsetContent12IconCompatParcelizer.write("authorization", strSerializer);
            return wrappedCompositionsetContent12IconCompatParcelizer.RemoteActionCompatParcelizer();
        } catch (UcsCryptoException e) {
            WrappedCompositionsetContent1211.read("UcsAuthInterceptor", "UcsCryptoException:" + e.getMessage());
            if (write((int) e.serializer.delayRemaining)) {
                return RemoteActionCompatParcelizer(wrappedCompositionsetContent12, e$b);
            }
            WrappedCompositionsetContent1211.read("UcsAuthInterceptor", "AuthException:10550");
            throw new AuthException(isDisposed.write(10550));
        } catch (UcsException e2) {
            StringBuilder sb = new StringBuilder("UcsException:errorCode:");
            Delayer delayer = e2.IconCompatParcelizer;
            sb.append(delayer.delayRemaining);
            sb.append(",message:");
            sb.append(e2.getMessage());
            WrappedCompositionsetContent1211.read("UcsAuthInterceptor", sb.toString());
            if (write(delayer.delayRemaining)) {
                return RemoteActionCompatParcelizer(wrappedCompositionsetContent12, e$b);
            }
            WrappedCompositionsetContent1211.read("UcsAuthInterceptor", "AuthException:10550");
            throw new AuthException(isDisposed.write(10550));
        }
    }

    public final boolean write(long j) {
        if (j != 1020) {
            return false;
        }
        int i = this.write + 1;
        this.write = i;
        if (i > 3) {
            return false;
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("UCSSignHelper", "reApplyCredential");
        UCSSignHelper uCSSignHelper = WrapperRenderNodeLayerHelperMethods.IconCompatParcelizer;
        uCSSignHelper.IconCompatParcelizer = null;
        SharedPreferences sharedPreferences = new getOrder("location_credential").RemoteActionCompatParcelizer;
        if (sharedPreferences != null) {
            try {
                sharedPreferences.edit().remove("credentialExpiredTime").commit();
            } catch (Exception unused) {
                WrappedCompositionsetContent1211.read("LocationPreferences", "remove fail");
            }
        }
        if (sharedPreferences != null) {
            try {
                sharedPreferences.edit().remove("credentialCache").commit();
            } catch (Exception unused2) {
                WrappedCompositionsetContent1211.read("LocationPreferences", "remove fail");
            }
        }
        uCSSignHelper.IconCompatParcelizer(placeAtf8xVGno.read());
        return true;
    }
}
