package o;

import com.roadrunner.realtime.domain.GetAppStateImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class setPurchaseVerificationUrl extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ GetAppStateImpl serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setPurchaseVerificationUrl(GetAppStateImpl getAppStateImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = getAppStateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objInvoke;
        int i = 2 % 2;
        int i2 = read + 17;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.write = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            objInvoke = this.serializer.invoke(this);
            int i3 = 8 / 0;
        } else {
            this.write = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            objInvoke = this.serializer.invoke(this);
        }
        int i4 = read + 7;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objInvoke;
        }
        throw null;
    }
}
