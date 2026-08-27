package o;

import com.roadrunner.incognia.implementation.IncogniaManagerImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class RecyclerViewSavedState extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public int read;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ IncogniaManagerImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerViewSavedState(IncogniaManagerImpl incogniaManagerImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = incogniaManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 21;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objAccess$getAccountId = IncogniaManagerImpl.access$getAccountId(this.write, this);
        int i4 = RemoteActionCompatParcelizer + 115;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objAccess$getAccountId;
        }
        throw null;
    }
}
