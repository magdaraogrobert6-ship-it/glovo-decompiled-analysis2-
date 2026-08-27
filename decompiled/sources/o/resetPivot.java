package o;

import io.sentry.android.core.SentryLogcatAdapter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class resetPivot extends ContinuationImpl {
    public /* synthetic */ Object IconCompatParcelizer;
    public int write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.IconCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        return SentryLogcatAdapter.handleApi(null, this);
    }

    public resetPivot(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
