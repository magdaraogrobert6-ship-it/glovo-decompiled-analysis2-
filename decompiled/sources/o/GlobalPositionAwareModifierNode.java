package o;

import com.google.android.gms.net.zza;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GlobalPositionAwareModifierNode {
    public static void read(DrawModifierNodeKt drawModifierNodeKt, colorResource colorresource, minHeight minheight) {
        drawModifierNodeKt.RemoteActionCompatParcelizer(new zza(drawModifierNodeKt, 25, colorresource), minheight);
    }

    public static void IconCompatParcelizer(DrawModifierNodeKt drawModifierNodeKt) {
        TextStreamsKt.IconCompatParcelizer("Future was expected to be done: %s", drawModifierNodeKt, drawModifierNodeKt.isDone());
        boolean z = false;
        while (true) {
            try {
                drawModifierNodeKt.get();
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
    }
}
