package o;

import com.deliveryhero.perseus.data.local.UnencryptedSharedPreferencesLocalStorage;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class curveTo extends ContinuationImpl {
    public createInAppMessageEventSubscriber IconCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ UnencryptedSharedPreferencesLocalStorage write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public curveTo(UnencryptedSharedPreferencesLocalStorage unencryptedSharedPreferencesLocalStorage, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = unencryptedSharedPreferencesLocalStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.read |= Integer.MIN_VALUE;
        return this.write.getOrPut(null, null, this);
    }
}
