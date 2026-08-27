package o;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class setupDirectionalNavigation extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public static final setupDirectionalNavigation read = new setupDirectionalNavigation(0);

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        return new Handler(Looper.getMainLooper());
    }

    public setupDirectionalNavigation(int i) {
        super(i);
    }
}
