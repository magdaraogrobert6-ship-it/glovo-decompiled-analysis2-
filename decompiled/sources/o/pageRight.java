package o;

import com.roadrunner.auth.domain.token.IsUserAuthenticatedWrapper;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class pageRight extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public int serializer;
    public final /* synthetic */ IsUserAuthenticatedWrapper write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pageRight(IsUserAuthenticatedWrapper isUserAuthenticatedWrapper, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = isUserAuthenticatedWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 95;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objInvoke = this.write.invoke(this);
        int i4 = read + 93;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objInvoke;
        }
        throw null;
    }
}
