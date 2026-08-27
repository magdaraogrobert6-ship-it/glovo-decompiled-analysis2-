package o;

import com.deliveryhero.perseus.data.local.SharedPreferenceToDataStoreBridge;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class pathR_LF3Idefault extends ContinuationImpl {
    public int IconCompatParcelizer;
    public final /* synthetic */ SharedPreferenceToDataStoreBridge RemoteActionCompatParcelizer;
    public long read;
    public /* synthetic */ Object serializer;
    public String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pathR_LF3Idefault(SharedPreferenceToDataStoreBridge sharedPreferenceToDataStoreBridge, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = sharedPreferenceToDataStoreBridge;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return this.RemoteActionCompatParcelizer.getLong(0L, null, this);
    }
}
