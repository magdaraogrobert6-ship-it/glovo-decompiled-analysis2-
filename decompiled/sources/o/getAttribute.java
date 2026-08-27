package o;

import io.sentry.util.UrlUtils;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class getAttribute extends ContinuationImpl {
    public int IconCompatParcelizer;
    public /* synthetic */ Object write;

    public getAttribute(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return UrlUtils.suspendAndThrow(null, this);
    }
}
