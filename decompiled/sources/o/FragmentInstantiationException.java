package o;

import io.sentry.CombinedScopeView;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentInstantiationException extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public int IconCompatParcelizer;
    public final /* synthetic */ CombinedScopeView serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentInstantiationException(CombinedScopeView combinedScopeView, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = combinedScopeView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 61;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.write = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return this.serializer.invoke(this);
        }
        this.write = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        this.serializer.invoke(this);
        throw null;
    }
}
