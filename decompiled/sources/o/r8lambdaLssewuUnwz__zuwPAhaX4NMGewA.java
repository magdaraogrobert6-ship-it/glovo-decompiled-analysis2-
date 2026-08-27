package o;

import com.google.android.gms.internal.gtm.zzbv;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonWriter;
import com.huawei.hms.support.log.HMSLog;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.generated.FillLayer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.JobNode;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import org.joda.time.tz.NameProvider;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class r8lambdaLssewuUnwz__zuwPAhaX4NMGewA {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void read(_get_messageWebView_lambda1 _get_messagewebview_lambda1) throws Exception {
        boolean zIsTerminated;
        if (_get_messagewebview_lambda1 instanceof AutoCloseable) {
            _get_messagewebview_lambda1.close();
            return;
        }
        if (!(_get_messagewebview_lambda1 instanceof ExecutorService)) {
            DrawableTransformation.write();
            return;
        }
        ExecutorService executorService = (ExecutorService) _get_messagewebview_lambda1;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static accessgetAggregateChildKindSet serializer(int i, getComposePointerId_I2yYro getcomposepointerid_i2yyro, zzbv zzbvVar) {
        Map mapUnmodifiableMap;
        MotionEventAdapter motionEventAdapter = new MotionEventAdapter(i, getcomposepointerid_i2yyro);
        if (((HashMap) zzbvVar.RemoteActionCompatParcelizer) == null) {
            zzbvVar.RemoteActionCompatParcelizer = new HashMap();
        }
        ((HashMap) zzbvVar.RemoteActionCompatParcelizer).put(getMotionEventToComposePointerIdMapuiannotations.class, motionEventAdapter);
        String str = (String) zzbvVar.write;
        if (((HashMap) zzbvVar.RemoteActionCompatParcelizer) == null) {
            mapUnmodifiableMap = Collections.EMPTY_MAP;
        } else {
            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap((HashMap) zzbvVar.RemoteActionCompatParcelizer));
        }
        return new accessgetAggregateChildKindSet(str, mapUnmodifiableMap);
    }

    public static String read(StringBuilder sb, String str, String str2, List list, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(list);
        sb.append(str3);
        return sb.toString();
    }

    public static String read(StringBuilder sb, Map map, char c) {
        sb.append(map);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder serializer(String str, String str2, String str3, List list, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(list);
        sb.append(str4);
        return sb;
    }

    public static HashMap RemoteActionCompatParcelizer(Class cls, MotionEventAdapter motionEventAdapter) {
        HashMap map = new HashMap();
        map.put(cls, motionEventAdapter);
        return map;
    }

    public static Iterator write(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, int i, byte b, List list, byte b2) throws IOException {
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i, b);
        r8lambdat7xjd1d4humw0psb7whucfgonss.write(b2, list.size());
        return list.iterator();
    }

    public static void serializer(byte b, int i, r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Short sh) throws IOException {
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i, b);
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(sh.shortValue());
    }

    public static void IconCompatParcelizer(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static void RemoteActionCompatParcelizer(int i, String str, String str2) {
        HMSLog.i(str2, str + i);
    }

    public static void read(long j, String str, StringBuilder sb) {
        sb.append((Object) androidx.compose.ui.graphics.Color.m730toStringimpl(j));
        sb.append(str);
    }

    public static void serializer(SoftwareJpegEncodingPreferredQuirk softwareJpegEncodingPreferredQuirk, ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk, IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk, SoftwareJpegEncodingPreferredQuirk softwareJpegEncodingPreferredQuirk2, ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk2) {
        incorrectJpegMetadataQuirk.read(ImageCaptureRotationOptionQuirk.RemoteActionCompatParcelizer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk));
        incorrectJpegMetadataQuirk.read(ImageCaptureRotationOptionQuirk.RemoteActionCompatParcelizer(softwareJpegEncodingPreferredQuirk2, imageCaptureFailedForSpecificCombinationQuirk2));
    }

    public static void IconCompatParcelizer(JsonElement jsonElement, Gson gson, JsonWriter jsonWriter, JsonElement jsonElement2) throws IOException {
        gson.getAdapter(jsonElement.getClass()).write(jsonWriter, jsonElement2);
    }

    public static void serializer(getCooldownEnterSeconds.read readVar, HashMap map, Class cls) {
        map.put(cls, Long.valueOf(readVar.RemoteActionCompatParcelizer()));
    }

    public static void IconCompatParcelizer(Float f, StringBuilder sb, String str) {
        sb.append(RecordUtils.fieldToString(f));
        sb.append(str);
    }

    public static void serializer(Long l, StringBuilder sb, String str) {
        sb.append(RecordUtils.fieldToString(l));
        sb.append(str);
    }

    public static void IconCompatParcelizer(String str, Expression expression, FillLayer fillLayer) {
        fillLayer.setProperty$extension_style_release(new PropertyValue(str, expression));
    }

    public static /* synthetic */ void read(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(obj, null) && atomicReference.get() == obj) {
        }
    }

    public static /* synthetic */ void IconCompatParcelizer(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, CancellableContinuationImpl cancellableContinuationImpl, setAndStartAnimation setandstartanimation) {
        while (!atomicReferenceFieldUpdater.compareAndSet(cancellableContinuationImpl, null, setandstartanimation) && atomicReferenceFieldUpdater.get(cancellableContinuationImpl) == null) {
        }
    }

    public static /* synthetic */ void IconCompatParcelizer(LockFreeLinkedListNode lockFreeLinkedListNode) {
        if (lockFreeLinkedListNode != null) {
            return;
        }
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, iSerializer);
    }

    public static int write(ArrayList arrayList, int i, int i2) {
        return (arrayList.hashCode() + i) * i2;
    }

    public static /* synthetic */ boolean write(AtomicReference atomicReference, NameProvider nameProvider) {
        while (!atomicReference.compareAndSet(null, nameProvider)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean IconCompatParcelizer(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, JobSupport jobSupport, setContentViewGroupParentLayout setcontentviewgroupparentlayout, JobNode jobNode) {
        while (!atomicReferenceFieldUpdater.compareAndSet(jobSupport, setcontentviewgroupparentlayout, jobNode)) {
            if (atomicReferenceFieldUpdater.get(jobSupport) != setcontentviewgroupparentlayout) {
                return false;
            }
        }
        return true;
    }
}
