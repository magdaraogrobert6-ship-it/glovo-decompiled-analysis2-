package o;

import java.io.FileInputStream;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class isEligibleForFocusSearch extends ContinuationImpl {
    public /* synthetic */ Object IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.datastore.core.SingleProcessDataStore read;
    public androidx.datastore.core.SingleProcessDataStore serializer;
    public FileInputStream write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isEligibleForFocusSearch(androidx.datastore.core.SingleProcessDataStore singleProcessDataStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return this.read.readData(this);
    }
}
