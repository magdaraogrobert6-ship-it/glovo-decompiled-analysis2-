package o;

import com.roadrunner.login.domain.auth.GetRiderNameUseCaseImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class TransactionWrapper extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ GetRiderNameUseCaseImpl RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionWrapper(GetRiderNameUseCaseImpl getRiderNameUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = getRiderNameUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 17;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.serializer = obj;
            this.read |= Integer.MIN_VALUE;
            this.RemoteActionCompatParcelizer.invoke(this);
            throw null;
        }
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objInvoke = this.RemoteActionCompatParcelizer.invoke(this);
        int i3 = IconCompatParcelizer + 103;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return objInvoke;
        }
        obj2.hashCode();
        throw null;
    }
}
