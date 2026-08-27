package o;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ImageLoader$Builder;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.firebase.crashlytics.internal.common.IdManager;
import io.grpc.CallOptions$Builder;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getLayoutPendingForAlignment {
    public static final HashMap RemoteActionCompatParcelizer;
    public static final String read;
    public final CallOptions$Builder IconCompatParcelizer;
    public final zzbv MediaMetadataCompat;
    public final access500 MediaSessionCompatQueueItem;
    public final Context serializer;
    public final IdManager write;

    static {
        HashMap map = new HashMap();
        RemoteActionCompatParcelizer = map;
        d$$ExternalSyntheticOutline0.m(5, map, "armeabi", 6, "armeabi-v7a");
        d$$ExternalSyntheticOutline0.m(9, map, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        java.util.Locale locale = java.util.Locale.US;
        read = "Crashlytics Android SDK/20.0.4";
    }

    public static List serializer(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            getMeasureIteration getmeasureiteration = new getMeasureIteration();
            getmeasureiteration.serializer = i;
            getmeasureiteration.read = (byte) (getmeasureiteration.read | 4);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            getmeasureiteration.IconCompatParcelizer = jMax;
            byte b = (byte) (getmeasureiteration.read | 1);
            getmeasureiteration.MediaMetadataCompat = str;
            getmeasureiteration.RemoteActionCompatParcelizer = fileName;
            getmeasureiteration.write = lineNumber;
            getmeasureiteration.read = (byte) (b | 2);
            arrayList.add(getmeasureiteration.serializer());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a7  */
    public final measureAndLayout0kLqBqw read(int i) {
        boolean z;
        Float fValueOf;
        int i2;
        long j;
        Context context = this.serializer;
        boolean z2 = false;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                z = intExtra != -1 && (intExtra == 2 || intExtra == 5);
                try {
                    int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
                    int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                    if (intExtra2 != -1 && intExtra3 != -1) {
                        fValueOf = Float.valueOf(intExtra2 / intExtra3);
                    }
                } catch (IllegalStateException e) {
                    e = e;
                    SentryLogcatAdapter.read("FirebaseCrashlytics", "An error occurred getting battery state.", e);
                }
                Double dValueOf = fValueOf != null ? Double.valueOf(fValueOf.doubleValue()) : null;
                if (z || fValueOf == null) {
                    i2 = 1;
                } else {
                    i2 = ((double) fValueOf.floatValue()) < 0.99d ? 2 : 3;
                }
                if (!accessgetOuterCoordinator.serializer() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
                    z2 = true;
                }
                long jRemoteActionCompatParcelizer = accessgetOuterCoordinator.RemoteActionCompatParcelizer(context);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                j = jRemoteActionCompatParcelizer - memoryInfo.availMem;
                if (j <= 0) {
                    j = 0;
                }
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                long blockSize = statFs.getBlockSize();
                long blockCount = statFs.getBlockCount();
                long availableBlocks = statFs.getAvailableBlocks();
                measureOnly measureonly = new measureOnly();
                measureonly.serializer = dValueOf;
                measureonly.write = i2;
                byte b = (byte) (measureonly.MediaBrowserCompatMediaItem | 1);
                measureonly.read = z2;
                measureonly.RemoteActionCompatParcelizer = i;
                measureonly.RatingCompat = j;
                measureonly.IconCompatParcelizer = (blockCount * blockSize) - (blockSize * availableBlocks);
                measureonly.MediaBrowserCompatMediaItem = (byte) (((byte) (((byte) (((byte) (b | 2)) | 4)) | 8)) | 16);
                return measureonly.read();
            }
            z = false;
        } catch (IllegalStateException e2) {
            e = e2;
            z = false;
        }
        fValueOf = null;
        if (fValueOf != null) {
        }
        if (z) {
            i2 = 1;
        } else {
            i2 = 1;
        }
        if (!accessgetOuterCoordinator.serializer()) {
            z2 = true;
        }
        long jRemoteActionCompatParcelizer2 = accessgetOuterCoordinator.RemoteActionCompatParcelizer(context);
        ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo2);
        j = jRemoteActionCompatParcelizer2 - memoryInfo2.availMem;
        if (j <= 0) {
            j = 0;
        }
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize2 = statFs2.getBlockSize();
        long blockCount2 = statFs2.getBlockCount();
        long availableBlocks2 = statFs2.getAvailableBlocks();
        measureOnly measureonly2 = new measureOnly();
        measureonly2.serializer = dValueOf;
        measureonly2.write = i2;
        byte b2 = (byte) (measureonly2.MediaBrowserCompatMediaItem | 1);
        measureonly2.read = z2;
        measureonly2.RemoteActionCompatParcelizer = i;
        measureonly2.RatingCompat = j;
        measureonly2.IconCompatParcelizer = (blockCount2 * blockSize2) - (blockSize2 * availableBlocks2);
        measureonly2.MediaBrowserCompatMediaItem = (byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16);
        return measureonly2.read();
    }

    public getLayoutPendingForAlignment(Context context, IdManager idManager, CallOptions$Builder callOptions$Builder, zzbv zzbvVar, access500 access500Var) {
        this.serializer = context;
        this.write = idManager;
        this.IconCompatParcelizer = callOptions$Builder;
        this.MediaMetadataCompat = zzbvVar;
        this.MediaSessionCompatQueueItem = access500Var;
    }

    public static forceMeasureTheSubtree RemoteActionCompatParcelizer(ImageLoader$Builder imageLoader$Builder, int i) {
        String str = (String) imageLoader$Builder.IconCompatParcelizer;
        String str2 = (String) imageLoader$Builder.RemoteActionCompatParcelizer;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) imageLoader$Builder.read;
        int i2 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        ImageLoader$Builder imageLoader$Builder2 = (ImageLoader$Builder) imageLoader$Builder.serializer;
        if (i >= 8) {
            ImageLoader$Builder imageLoader$Builder3 = imageLoader$Builder2;
            while (imageLoader$Builder3 != null) {
                imageLoader$Builder3 = (ImageLoader$Builder) imageLoader$Builder3.serializer;
                i2++;
            }
        }
        int i3 = i2;
        List listSerializer = serializer(stackTraceElementArr, 4);
        if (listSerializer == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null frames");
            return null;
        }
        byte b = (byte) 1;
        forceMeasureTheSubtree forcemeasurethesubtreeRemoteActionCompatParcelizer = (imageLoader$Builder2 == null || i3 != 0) ? null : RemoteActionCompatParcelizer(imageLoader$Builder2, i + 1);
        if (b == 1) {
            return new forceMeasureTheSubtree(str, str2, listSerializer, forcemeasurethesubtreeRemoteActionCompatParcelizer, i3);
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" overflowCount");
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
        return null;
    }

    public static getDuringMeasureLayoutui read() {
        return new getDuringMeasureLayoutui("0", "0", 0L);
    }

    public final List serializer() {
        byte b = (byte) (((byte) 1) | 2);
        CallOptions$Builder callOptions$Builder = this.IconCompatParcelizer;
        String str = (String) callOptions$Builder.MediaMetadataCompat;
        if (str != null) {
            String str2 = (String) callOptions$Builder.RemoteActionCompatParcelizer;
            if (b == 3) {
                return Collections.singletonList(new requestRelayoutdefault(0L, 0L, str, str2));
            }
            StringBuilder sb = new StringBuilder();
            if ((b & 1) == 0) {
                sb.append(" baseAddress");
            }
            if ((b & 2) == 0) {
                sb.append(" size");
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null name");
        return null;
    }
}
