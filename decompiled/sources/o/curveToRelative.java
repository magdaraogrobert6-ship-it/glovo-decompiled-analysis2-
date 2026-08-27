package o;

import com.deliveryhero.perseus.data.local.UnencryptedSharedPreferencesLocalStorage;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class curveToRelative extends ContinuationImpl {
    public final /* synthetic */ UnencryptedSharedPreferencesLocalStorage RemoteActionCompatParcelizer;
    public int read;
    public long serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public curveToRelative(UnencryptedSharedPreferencesLocalStorage unencryptedSharedPreferencesLocalStorage, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = unencryptedSharedPreferencesLocalStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.write = obj;
        this.read |= Integer.MIN_VALUE;
        return this.RemoteActionCompatParcelizer.getLong(0L, null, this);
    }
}
