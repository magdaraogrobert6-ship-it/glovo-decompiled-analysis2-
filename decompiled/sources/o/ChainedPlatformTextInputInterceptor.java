package o;

import com.google.mlkit.vision.face.internal.zza;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ChainedPlatformTextInputInterceptor {
    public static final AtomicReference read = new AtomicReference();

    public static String write() {
        return true != IconCompatParcelizer() ? "play-services-mlkit-face-detection" : "face-detection";
    }

    public static boolean IconCompatParcelizer() {
        AtomicReference atomicReference = read;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean z = zza.read(AndroidUriHandler.serializer().IconCompatParcelizer());
        atomicReference.set(Boolean.valueOf(z));
        return z;
    }

    public static accesscreatePrecomposedSlotHandle RemoteActionCompatParcelizer(CalculateMatrixToWindow calculateMatrixToWindow) {
        accessdisposePrecomposedSlot accessdisposeprecomposedslot;
        LayoutModifierKt layoutModifierKt;
        androidx.lifecycle.BlockRunner blockRunner = new androidx.lifecycle.BlockRunner();
        int i = calculateMatrixToWindow.IconCompatParcelizer;
        if (i != 1) {
            accessdisposeprecomposedslot = i != 2 ? accessdisposePrecomposedSlot.UNKNOWN_LANDMARKS : accessdisposePrecomposedSlot.ALL_LANDMARKS;
        } else {
            accessdisposeprecomposedslot = accessdisposePrecomposedSlot.NO_LANDMARKS;
        }
        blockRunner.read = accessdisposeprecomposedslot;
        int i2 = calculateMatrixToWindow.RemoteActionCompatParcelizer;
        if (i2 != 1) {
            layoutModifierKt = i2 != 2 ? LayoutModifierKt.UNKNOWN_CLASSIFICATIONS : LayoutModifierKt.ALL_CLASSIFICATIONS;
        } else {
            layoutModifierKt = LayoutModifierKt.NO_CLASSIFICATIONS;
        }
        blockRunner.serializer = layoutModifierKt;
        blockRunner.RatingCompat = accessgetApproachMeasureScopep.FAST;
        blockRunner.write = LayoutNodeSubcompositionsState.NO_CONTOURS;
        blockRunner.RemoteActionCompatParcelizer = Boolean.valueOf(calculateMatrixToWindow.read);
        blockRunner.IconCompatParcelizer = Float.valueOf(calculateMatrixToWindow.write);
        return new accesscreatePrecomposedSlotHandle(blockRunner);
    }
}
