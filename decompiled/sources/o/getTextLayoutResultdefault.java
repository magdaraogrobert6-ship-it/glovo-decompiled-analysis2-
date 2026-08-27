package o;

import com.roadrunner.auth.domain.SignInUseCaseImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getTextLayoutResultdefault extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat;
    public final /* synthetic */ SignInUseCaseImpl IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public String serializer;
    public String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getTextLayoutResultdefault(SignInUseCaseImpl signInUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = signInUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 45;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.read = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return this.IconCompatParcelizer.processAuthenticateWithout2Fa(null, null, this);
        }
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        int i3 = 72 / 0;
        return this.IconCompatParcelizer.processAuthenticateWithout2Fa(null, null, this);
    }
}
