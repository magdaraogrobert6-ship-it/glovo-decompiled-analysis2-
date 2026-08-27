package o;

import com.mapbox.bindgen.RecordUtils;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobNode;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.selects.SelectImplementation;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class getBitmapFromCache {
    public static String RemoteActionCompatParcelizer(long j, String str, StringBuilder sb) {
        sb.append(RecordUtils.fieldToString(Long.valueOf(j)));
        sb.append(str);
        return sb.toString();
    }

    public static int serializer(float f, int i, int i2) {
        return (androidx.compose.ui.unit.Dp.m3679hashCodeimpl(f) + i) * i2;
    }

    public static int write(r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, HashMap map, String str, int i, int i2) {
        map.put(str, r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer());
        return i + i2;
    }

    public static IncorrectJpegMetadataQuirk write(SoftwareJpegEncodingPreferredQuirk softwareJpegEncodingPreferredQuirk, ImageCaptureFailedForSpecificCombinationQuirk imageCaptureFailedForSpecificCombinationQuirk, IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk, ArrayList arrayList, IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk2) {
        incorrectJpegMetadataQuirk.read(ImageCaptureRotationOptionQuirk.RemoteActionCompatParcelizer(softwareJpegEncodingPreferredQuirk, imageCaptureFailedForSpecificCombinationQuirk));
        arrayList.add(incorrectJpegMetadataQuirk2);
        return new IncorrectJpegMetadataQuirk();
    }

    public static Class IconCompatParcelizer(getCooldownEnterSeconds.read readVar, getVerticalAccuracy getverticalaccuracy) {
        int iMediaSessionCompatQueueItem = readVar.MediaSessionCompatQueueItem();
        getverticalaccuracy.getClass();
        return getVerticalAccuracy.write(iMediaSessionCompatQueueItem);
    }

    public static double IconCompatParcelizer(JSONObject jSONObject, String str, double d, double d2, double d3) {
        return (jSONObject.optDouble(str, d) / d2) * d3;
    }

    public static StringBuilder read(String str, String str2, long j, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static HashMap RemoteActionCompatParcelizer(Class cls, computeFillHeightiLBOSCw computefillheightilboscw) {
        HashMap map = new HashMap();
        map.put(cls, computefillheightilboscw);
        return map;
    }

    public static void read(byte b, int i, r8lambdaT7Xjd1d4hUmW0PSB7whuCfGONSs r8lambdat7xjd1d4humw0psb7whucfgonss, Byte b2) throws IOException {
        r8lambdat7xjd1d4humw0psb7whucfgonss.serializer(i, b);
        r8lambdat7xjd1d4humw0psb7whucfgonss.RemoteActionCompatParcelizer(b2.byteValue());
    }

    public static void write(float f, String str, StringBuilder sb) {
        sb.append(RecordUtils.fieldToString(Float.valueOf(f)));
        sb.append(str);
    }

    public static void serializer(int i, String str, HashMap map, String str2) {
        map.put(str2, new getEvaluationfwf_client_release(i, str));
    }

    public static void RemoteActionCompatParcelizer(Exception exc, StringBuilder sb, String str) {
        sb.append(exc.getMessage());
        ComposeScrollCaptureCallbackonScrollCaptureImageRequest2.RemoteActionCompatParcelizer(str, sb.toString());
    }

    public static void write(StringBuilder sb, String str, Boolean bool) {
        sb.append(RecordUtils.fieldToString(bool));
        sb.append(str);
    }

    public static /* synthetic */ boolean write(AtomicReference atomicReference, androidx.compose.ui.platform.WindowRecomposerFactory windowRecomposerFactory, androidx.compose.ui.platform.WindowRecomposerFactory windowRecomposerFactory2) {
        while (!atomicReference.compareAndSet(windowRecomposerFactory, windowRecomposerFactory2)) {
            if (atomicReference.get() != windowRecomposerFactory) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean write(AtomicReference atomicReference, SpscLinkedArrayQueue spscLinkedArrayQueue) {
        while (!atomicReference.compareAndSet(null, spscLinkedArrayQueue)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean RemoteActionCompatParcelizer(AtomicReference atomicReference, Object obj) {
        while (!atomicReference.compareAndSet(null, obj)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean write(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, JobSupport jobSupport, JobNode jobNode) {
        while (!atomicReferenceFieldUpdater.compareAndSet(jobSupport, jobNode, JobKt.write)) {
            if (atomicReferenceFieldUpdater.get(jobSupport) != jobNode) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean IconCompatParcelizer(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, LockFreeLinkedListNode lockFreeLinkedListNode, LockFreeLinkedListNode lockFreeLinkedListNode2, LockFreeLinkedListNode lockFreeLinkedListNode3) {
        while (!atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedListNode, lockFreeLinkedListNode2, lockFreeLinkedListNode3)) {
            if (atomicReferenceFieldUpdater.get(lockFreeLinkedListNode) != lockFreeLinkedListNode2) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean write(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, SelectImplementation selectImplementation, Object obj) {
        while (!atomicReferenceFieldUpdater.compareAndSet(selectImplementation, obj, setCustomInAppMessageViewWrapperFactorylambda0.read)) {
            if (atomicReferenceFieldUpdater.get(selectImplementation) != obj) {
                return false;
            }
        }
        return true;
    }

    public static int read(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }
}
