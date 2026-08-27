package o;

import com.roadrunner.auth.domain.SignInUseCaseImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getTextCompositionRangedelegate extends ContinuationImpl {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public String IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public String serializer;
    public final /* synthetic */ SignInUseCaseImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getTextCompositionRangedelegate(SignInUseCaseImpl signInUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = signInUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 123;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return this.write.processAuthenticateWith2Fa(null, null, this);
        }
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        this.write.processAuthenticateWith2Fa(null, null, this);
        throw null;
    }
}
