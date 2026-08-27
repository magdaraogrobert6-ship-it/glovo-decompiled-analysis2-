package o;

import com.google.android.gms.net.zza;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public abstract class VideoQualityQuirk {
    public static Object IconCompatParcelizer(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static EncoderImplMediaCodecCallback read(Object obj) {
        return obj == null ? EncoderImplMediaCodecCallback.IconCompatParcelizer : new EncoderImplMediaCodecCallback(1, obj);
    }

    public static StretchedVideoResolutionQuirk serializer(DrawModifierNodeKt drawModifierNodeKt, StopCodecAfterSurfaceRemovalCrashMediaServerQuirk stopCodecAfterSurfaceRemovalCrashMediaServerQuirk, Executor executor) {
        StretchedVideoResolutionQuirk stretchedVideoResolutionQuirk = new StretchedVideoResolutionQuirk(stopCodecAfterSurfaceRemovalCrashMediaServerQuirk, drawModifierNodeKt);
        drawModifierNodeKt.RemoteActionCompatParcelizer(stretchedVideoResolutionQuirk, executor);
        return stretchedVideoResolutionQuirk;
    }

    public static void read(boolean z, DrawModifierNodeKt drawModifierNodeKt, onDrawWithContent ondrawwithcontent, accessgetSubCompositionViewjd accessgetsubcompositionviewjd) {
        drawModifierNodeKt.getClass();
        ondrawwithcontent.getClass();
        accessgetsubcompositionviewjd.getClass();
        drawModifierNodeKt.RemoteActionCompatParcelizer(new zza(drawModifierNodeKt, 1, new SessionConfigExternalSyntheticLambda1(ondrawwithcontent, 1)), accessgetsubcompositionviewjd);
        if (z) {
            ondrawwithcontent.RemoteActionCompatParcelizer(new com.google.android.gms.stats.zza(8, drawModifierNodeKt), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
        }
    }

    public static DrawModifierNodeKt write(DrawModifierNodeKt drawModifierNodeKt) {
        drawModifierNodeKt.getClass();
        return drawModifierNodeKt.isDone() ? drawModifierNodeKt : coil3.util.UtilsKt.RemoteActionCompatParcelizer(new EncodeException(drawModifierNodeKt, 0));
    }

    public static PendingValue RemoteActionCompatParcelizer(ArrayList arrayList) {
        return new PendingValue(new ArrayList(arrayList), false, removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
    }

    public static PendingValue write(List list) {
        return new PendingValue(new ArrayList(list), true, removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
    }

    public static void write(DrawModifierNodeKt drawModifierNodeKt, onDrawWithContent ondrawwithcontent) {
        read(true, drawModifierNodeKt, ondrawwithcontent, removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
    }

    public static Object write(Future future) {
        coil3.util.UtilsKt.RemoteActionCompatParcelizer("Future was expected to be done, " + future, future.isDone());
        return IconCompatParcelizer(future);
    }
}
