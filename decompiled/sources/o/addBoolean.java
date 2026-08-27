package o;

import io.grpc.CallOptions$Builder;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class addBoolean extends ContinuationImpl {
    private static int RatingCompat = 1;
    private static int write;
    public getInstallReferrer IconCompatParcelizer;
    public final /* synthetic */ CallOptions$Builder RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public addBoolean(CallOptions$Builder callOptions$Builder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = callOptions$Builder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 99;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.serializer |= Integer.MIN_VALUE;
            this.RemoteActionCompatParcelizer.invoke(null, this);
            obj2.hashCode();
            throw null;
        }
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objInvoke = this.RemoteActionCompatParcelizer.invoke(null, this);
        int i3 = write + 125;
        RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            int i4 = 1 / 0;
        }
        return objInvoke;
    }
}
