package o;

import com.roadrunner.login.domain.auth.DoPostLoginOperations;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class TransacterImpl extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ DoPostLoginOperations RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransacterImpl(DoPostLoginOperations doPostLoginOperations, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = doPostLoginOperations;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 29;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objInvoke = this.RemoteActionCompatParcelizer.invoke(null, null, this);
        int i4 = write + 85;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 41 / 0;
        }
        return objInvoke;
    }
}
