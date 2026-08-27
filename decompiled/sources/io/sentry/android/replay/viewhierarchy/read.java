package io.sentry.android.replay.viewhierarchy;

import androidx.compose.ui.node.LayoutNode;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes4.dex */
public final class read extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public static final read serializer = new read(0);

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        try {
            Method declaredMethod = LayoutNode.class.getDeclaredMethod("getSemanticsConfiguration", null);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    public read(int i) {
        super(i);
    }
}
