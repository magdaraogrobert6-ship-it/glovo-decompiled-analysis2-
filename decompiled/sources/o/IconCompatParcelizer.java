package o;

import android.database.Cursor;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Timestamp;
import com.huawei.hms.support.api.location.common.HMSLocationLog;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.Style;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.generated.FillLayer;
import com.mapbox.maps.extension.style.layers.generated.LineLayer;
import io.reactivex.disposables.Disposable;
import io.sentry.util.UrlUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.internal.Segment;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class IconCompatParcelizer {
    public static String read(String str, String str2, String str3, List list, String str4) {
        return str + str2 + str3 + list + str4;
    }

    public static int RemoteActionCompatParcelizer(int i, Map map, int i2) {
        return (map.hashCode() + i) * i2;
    }

    public static long IconCompatParcelizer(String str, String str2, Cursor cursor) {
        return cursor.getLong(cursor.getColumnIndexOrThrow(str.concat(str2)));
    }

    public static GeneratedMessageLite RemoteActionCompatParcelizer(Timestamp timestamp, Timestamp timestamp2) {
        encodedString encodedstringNewBuilder = Timestamp.newBuilder(timestamp);
        encodedstringNewBuilder.read(timestamp2);
        return encodedstringNewBuilder.read();
    }

    public static Expression RemoteActionCompatParcelizer(Expression.ExpressionBuilder expressionBuilder, Expression expression, FillLayer fillLayer) {
        expressionBuilder.addArgument(expression);
        Expression expressionBuild = expressionBuilder.build();
        fillLayer.getClass();
        return expressionBuild;
    }

    public static String IconCompatParcelizer(int i, String str) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        return sb.toString();
    }

    public static String write(Integer num, String str, StringBuilder sb) {
        sb.append(num);
        sb.append(str);
        return sb.toString();
    }

    public static int RemoteActionCompatParcelizer(int i, int i2, int i3) {
        return KeyInputModifierKt.IconCompatParcelizer(i) + i2 + i3;
    }

    public static String RemoteActionCompatParcelizer(StringBuilder sb, Object obj, char c) {
        sb.append(obj);
        sb.append(c);
        return sb.toString();
    }

    public static String IconCompatParcelizer(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    public static void read(byte b, int i, r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Short sh) throws IOException {
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(sh.shortValue());
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i, b);
    }

    public static void write(int i, String str, StringBuilder sb) {
        sb.append(RecordUtils.fieldToString(Integer.valueOf(i)));
        sb.append(str);
    }

    public static void IconCompatParcelizer(androidx.compose.ui.Modifier.Companion companion, float f, getPostalCode getpostalcode, boolean z) {
        Object[] objArr = {getpostalcode, androidx.compose.foundation.layout.SizeKt.m75height3ABfNKs(companion, f)};
        int iRemoteActionCompatParcelizer = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
        coil3.ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, objArr);
        getpostalcode.IconCompatParcelizer(z);
    }

    public static void RemoteActionCompatParcelizer(com.huawei.hms.common.ApiException apiException, StringBuilder sb, String str, String str2) {
        sb.append(apiException.getMessage());
        HMSLocationLog.e(str, str2, sb.toString());
    }

    public static void IconCompatParcelizer(Byte b, r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, byte b2) throws IOException {
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b.byteValue());
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b2);
    }

    public static void serializer(Long l, r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, int i, byte b) throws IOException {
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(l.longValue());
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i, b);
    }

    public static void write(String str, String str2, Integer num, Style style, LineLayer lineLayer) {
        UrlUtils.addPersistentLayer(style, lineLayer, new LayerPosition(str, str2, num));
    }

    public static void RemoteActionCompatParcelizer(String str, String str2, String str3, StringBuilder sb, boolean z) {
        sb.append(z);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void read(StringBuilder sb, String str, String str2) {
        sb.append(RecordUtils.fieldToString(str));
        sb.append(str2);
    }

    public static void RemoteActionCompatParcelizer(StringBuilder sb, List list, String str) {
        sb.append(RecordUtils.fieldToString(list));
        sb.append(str);
    }

    public static void IconCompatParcelizer(HashMap map, getNetworkModule getnetworkmodule) {
        map.put(getnetworkmodule, new clearEvaluationsfwf_client_release(18));
    }

    public static /* synthetic */ void IconCompatParcelizer(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, JobSupport jobSupport, setContentViewGroupParentLayout setcontentviewgroupparentlayout, DefaultInAppMessageViewWrapperWhenMappings defaultInAppMessageViewWrapperWhenMappings) {
        while (!atomicReferenceFieldUpdater.compareAndSet(jobSupport, setcontentviewgroupparentlayout, defaultInAppMessageViewWrapperWhenMappings) && atomicReferenceFieldUpdater.get(jobSupport) == setcontentviewgroupparentlayout) {
        }
    }

    public static /* synthetic */ boolean RemoteActionCompatParcelizer(AtomicReference atomicReference, Disposable disposable, Disposable disposable2) {
        while (!atomicReference.compareAndSet(disposable, disposable2)) {
            if (atomicReference.get() != disposable) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean read(AtomicReference atomicReference, Throwable th, Throwable th2) {
        while (!atomicReference.compareAndSet(th, th2)) {
            if (atomicReference.get() != th) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean read(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, BufferedChannel bufferedChannel, Segment segment, resolveUnregisterDisplayedMessage resolveunregisterdisplayedmessage) {
        while (!atomicReferenceFieldUpdater.compareAndSet(bufferedChannel, segment, resolveunregisterdisplayedmessage)) {
            if (atomicReferenceFieldUpdater.get(bufferedChannel) != segment) {
                return false;
            }
        }
        return true;
    }
}
