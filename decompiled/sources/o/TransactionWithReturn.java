package o;

import com.roadrunner.login.domain.auth.DoPostLoginOperations;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class TransactionWithReturn extends ContinuationImpl {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public final /* synthetic */ DoPostLoginOperations IconCompatParcelizer;
    public String RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;
    public getTextSelectionRange write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionWithReturn(DoPostLoginOperations doPostLoginOperations, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = doPostLoginOperations;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 121;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.serializer |= Integer.MIN_VALUE;
            return this.IconCompatParcelizer.saveData(null, null, this);
        }
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        this.IconCompatParcelizer.saveData(null, null, this);
        obj2.hashCode();
        throw null;
    }
}
