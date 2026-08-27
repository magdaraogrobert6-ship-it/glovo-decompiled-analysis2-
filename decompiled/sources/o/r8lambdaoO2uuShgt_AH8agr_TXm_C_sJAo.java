package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaoO2uuShgt_AH8agr_TXm_C_sJAo extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public /* synthetic */ Object IconCompatParcelizer;
    public int read;
    public final /* synthetic */ OkHttpCall$1 serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaoO2uuShgt_AH8agr_TXm_C_sJAo(OkHttpCall$1 okHttpCall$1, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = okHttpCall$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 1;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objInvoke = this.serializer.invoke(this);
        int i4 = write + 37;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objInvoke;
        }
        throw null;
    }
}
