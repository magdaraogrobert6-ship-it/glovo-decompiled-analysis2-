package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaceholderHardwareCanvas extends ContinuationImpl {
    public /* synthetic */ Object IconCompatParcelizer;
    public com.deliveryhero.customerchat.datastore.UserPropertiesDataStoreHelperImpl RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ com.deliveryhero.customerchat.datastore.UserPropertiesDataStoreHelperImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaceholderHardwareCanvas(com.deliveryhero.customerchat.datastore.UserPropertiesDataStoreHelperImpl userPropertiesDataStoreHelperImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = userPropertiesDataStoreHelperImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.IconCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        return this.write.updateUserPropertiesToDataStore(null, this);
    }
}
