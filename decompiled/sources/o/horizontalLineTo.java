package o;

import com.deliveryhero.perseus.data.local.UnencryptedSharedPreferencesLocalStorage;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class horizontalLineTo extends ContinuationImpl {
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ UnencryptedSharedPreferencesLocalStorage read;
    public String serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public horizontalLineTo(UnencryptedSharedPreferencesLocalStorage unencryptedSharedPreferencesLocalStorage, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = unencryptedSharedPreferencesLocalStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        return this.read.getLongOrNull(null, this);
    }
}
