package o;

import com.roadrunner.auth.domain.token.IsUserSignedInImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class pageUpdefault extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public /* synthetic */ Object read;
    public int serializer;
    public final /* synthetic */ IsUserSignedInImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pageUpdefault(IsUserSignedInImpl isUserSignedInImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = isUserSignedInImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 113;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objInvoke = this.write.invoke(this);
        int i4 = RemoteActionCompatParcelizer + 71;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return objInvoke;
    }
}
