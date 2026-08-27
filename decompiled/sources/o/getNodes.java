package o;

import com.deliveryhero.perseus.data.local.UnencryptedSharedPreferencesLocalStorage;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class getNodes extends ContinuationImpl {
    public final /* synthetic */ UnencryptedSharedPreferencesLocalStorage IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public String read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getNodes(UnencryptedSharedPreferencesLocalStorage unencryptedSharedPreferencesLocalStorage, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = unencryptedSharedPreferencesLocalStorage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return this.IconCompatParcelizer.getString(null, this);
    }
}
