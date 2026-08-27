package o;

import java.io.File;
import java.io.FileOutputStream;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class Focusability extends ContinuationImpl {
    public FileOutputStream IconCompatParcelizer;
    public final /* synthetic */ androidx.datastore.core.SingleProcessDataStore MediaMetadataCompat;
    public /* synthetic */ Object RatingCompat;
    public FileOutputStream RemoteActionCompatParcelizer;
    public androidx.datastore.core.SingleProcessDataStore read;
    public File serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Focusability(androidx.datastore.core.SingleProcessDataStore singleProcessDataStore, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaMetadataCompat = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.RatingCompat = obj;
        this.write |= Integer.MIN_VALUE;
        return this.MediaMetadataCompat.writeData$datastore_core(null, this);
    }
}
