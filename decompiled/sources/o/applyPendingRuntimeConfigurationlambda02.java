package o;

import io.sentry.CombinedScopeView;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class applyPendingRuntimeConfigurationlambda02 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public int read;
    public final /* synthetic */ CombinedScopeView write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public applyPendingRuntimeConfigurationlambda02(CombinedScopeView combinedScopeView, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = combinedScopeView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 91;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.IconCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            this.write.invoke(this);
            throw null;
        }
        this.IconCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objInvoke = this.write.invoke(this);
        int i3 = RemoteActionCompatParcelizer + 109;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 52 / 0;
        }
        return objInvoke;
    }
}
