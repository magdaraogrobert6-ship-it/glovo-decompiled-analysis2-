package o;

import android.net.Network;
import android.net.Uri;
import com.google.gson.JsonElement;
import com.mapbox.auto.value.gson.SerializableJsonElement;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.generated.LineLayer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.sentiance.core.model.datasync.DateTime;
import com.sentiance.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.LockFreeTaskQueue;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class SweepGradientShader9KIMszodefault {
    public static String serializer(int i, String str, StringBuilder sb) {
        sb.append(RecordUtils.fieldToString(Integer.valueOf(i)));
        sb.append(str);
        return sb.toString();
    }

    public static GeneratedMessageLite read(DateTime dateTime, DateTime dateTime2) {
        r8lambdauNx8bxeNcluajM_A_YQDJvn9P1E r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder = DateTime.newBuilder(dateTime);
        r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder.serializer(dateTime2);
        return r8lambdaunx8bxencluajm_a_yqdjvn9p1eNewBuilder.IconCompatParcelizer();
    }

    public static LineLayer IconCompatParcelizer(String str, String str2) {
        LineLayer lineLayer = new LineLayer(str, str2);
        lineLayer.lineCap();
        lineLayer.lineJoin();
        return lineLayer;
    }

    public static String IconCompatParcelizer(Uri uri, String str) {
        return str + uri;
    }

    public static String read(StringBuilder sb, String str, String str2) {
        sb.append(RecordUtils.fieldToString(str));
        sb.append(str2);
        return sb.toString();
    }

    public static String IconCompatParcelizer(StringBuilder sb, List list, char c) {
        sb.append(list);
        sb.append(c);
        return sb.toString();
    }

    public static String RemoteActionCompatParcelizer(StringBuilder sb, Map map, String str) {
        sb.append(map);
        sb.append(str);
        return sb.toString();
    }

    public static void RemoteActionCompatParcelizer(float f, String str, StringBuilder sb) {
        sb.append((Object) androidx.compose.ui.unit.Dp.m3684toStringimpl(f));
        sb.append(str);
    }

    public static void serializer(JsonElement jsonElement, LinkedHashMap linkedHashMap, String str) {
        linkedHashMap.put(str, new SerializableJsonElement(jsonElement));
    }

    public static void write(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, int i, byte b, Integer num) throws IOException {
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i, b);
        r8lambdat7xjd1d4humw0psb7whucfgonss.read(num.intValue());
    }

    public static void write(Integer num, r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, int i, byte b) throws IOException {
        r8lambdat7xjd1d4humw0psb7whucfgonss.read(num.intValue());
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i, b);
    }

    public static void read(Integer num, String str, StringBuilder sb) {
        sb.append(RecordUtils.fieldToString(num));
        sb.append(str);
    }

    public static void IconCompatParcelizer(String str, Expression expression, LineLayer lineLayer) {
        lineLayer.setProperty$extension_style_release(new PropertyValue(str, expression));
    }

    public static void IconCompatParcelizer(String str, String str2, String str3, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(str2);
        sb.append(z);
        sb.append(str3);
    }

    public static void write(String str, StringBuilder sb, Throwable th) {
        sb.append(th.getMessage());
        ComposeScrollCaptureCallbackonScrollCaptureImageRequest2.RemoteActionCompatParcelizer(str, sb.toString());
    }

    public static /* synthetic */ void read(AtomicReference atomicReference, Network network) {
        while (!atomicReference.compareAndSet(network, null) && atomicReference.get() == network) {
        }
    }

    public static /* synthetic */ void read(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, LockFreeTaskQueue lockFreeTaskQueue, LockFreeTaskQueueCore lockFreeTaskQueueCore, LockFreeTaskQueueCore lockFreeTaskQueueCore2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(lockFreeTaskQueue, lockFreeTaskQueueCore, lockFreeTaskQueueCore2) && atomicReferenceFieldUpdater.get(lockFreeTaskQueue) == lockFreeTaskQueueCore) {
        }
    }

    public static void serializer(getNetworkModule getnetworkmodule) {
        getPaymentMedium.serializer(getnetworkmodule, new MemoryCachegetFromStoragedata1(8));
    }

    public static /* synthetic */ boolean IconCompatParcelizer(AtomicReference atomicReference, accessgetProgramBluecp accessgetprogrambluecp) {
        while (!atomicReference.compareAndSet(null, accessgetprogrambluecp)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean RemoteActionCompatParcelizer(AtomicReference atomicReference, org.joda.time.tz.Provider provider) {
        while (!atomicReference.compareAndSet(null, provider)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean RemoteActionCompatParcelizer(AtomicReference atomicReference, FwFClientclose11 fwFClientclose11, FwFClientclose11 fwFClientclose12) {
        while (!atomicReference.compareAndSet(fwFClientclose11, fwFClientclose12)) {
            if (atomicReference.get() != fwFClientclose11) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean IconCompatParcelizer(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, JobSupport jobSupport, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(jobSupport, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(jobSupport) != obj) {
                return false;
            }
        }
        return true;
    }
}
