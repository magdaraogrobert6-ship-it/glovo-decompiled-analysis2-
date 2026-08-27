package o;

import android.os.SystemClock;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class DropShadowPainter extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public static final DropShadowPainter serializer = new DropShadowPainter(0);

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        return Long.valueOf(SystemClock.elapsedRealtime());
    }

    public DropShadowPainter(int i) {
        super(i);
    }
}
