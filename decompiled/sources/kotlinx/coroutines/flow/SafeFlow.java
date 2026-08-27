package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.SafeCollector;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
final class SafeFlow<T> extends AbstractFlow<T> {
    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 IconCompatParcelizer;

    @Override // kotlinx.coroutines.flow.AbstractFlow
    public final Object collectSafely(SafeCollector safeCollector, ShortNewsContentCardView shortNewsContentCardView) {
        Object objInvoke = this.IconCompatParcelizer.invoke(safeCollector, shortNewsContentCardView);
        return objInvoke == CoroutineSingletons.COROUTINE_SUSPENDED ? objInvoke : createFromParcel.INSTANCE;
    }

    public SafeFlow(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        this.IconCompatParcelizer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
    }
}
