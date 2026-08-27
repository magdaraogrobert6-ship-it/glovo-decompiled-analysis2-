package o;

import com.roadrunner.push.core.domain.work.ProceedWithRegisterToken;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class access1700 extends ContinuationImpl {
    private static int MediaMetadataCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public int IconCompatParcelizer;
    public String RemoteActionCompatParcelizer;
    public final /* synthetic */ ProceedWithRegisterToken read;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public access1700(ProceedWithRegisterToken proceedWithRegisterToken, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = proceedWithRegisterToken;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 57;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.serializer |= Integer.MIN_VALUE;
        return this.read.invoke(0, null, this);
    }
}
