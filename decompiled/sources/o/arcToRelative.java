package o;

import com.deliveryhero.perseus.data.local.SharedPreferenceToDataStoreBridge;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class arcToRelative extends ContinuationImpl {
    public /* synthetic */ Object IconCompatParcelizer;
    public String RemoteActionCompatParcelizer;
    public final /* synthetic */ SharedPreferenceToDataStoreBridge serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arcToRelative(SharedPreferenceToDataStoreBridge sharedPreferenceToDataStoreBridge, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = sharedPreferenceToDataStoreBridge;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.IconCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        return this.serializer.migrate(null, null, this);
    }
}
