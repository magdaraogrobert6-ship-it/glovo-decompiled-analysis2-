package o;

import com.roadrunner.push.core.domain.work.ProceedWithRegisterToken;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class access1600 extends ContinuationImpl {
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public int IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ ProceedWithRegisterToken serializer;
    public Throwable write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public access1600(ProceedWithRegisterToken proceedWithRegisterToken, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = proceedWithRegisterToken;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 83;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        return this.serializer.handleFailure(null, 0, this);
    }
}
