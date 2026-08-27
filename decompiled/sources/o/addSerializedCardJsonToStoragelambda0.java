package o;

import io.sentry.CombinedScopeView;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class addSerializedCardJsonToStoragelambda0 extends ContinuationImpl {
    private static int MediaSessionCompatQueueItem = 1;
    private static int serializer;
    public /* synthetic */ Object IconCompatParcelizer;
    public ExtensionWindowAreaStatusRequirements RemoteActionCompatParcelizer;
    public final /* synthetic */ CombinedScopeView read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public addSerializedCardJsonToStoragelambda0(CombinedScopeView combinedScopeView, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = combinedScopeView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 3;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objInvoke = this.read.invoke(null, this);
        int i4 = serializer + 67;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return objInvoke;
    }
}
