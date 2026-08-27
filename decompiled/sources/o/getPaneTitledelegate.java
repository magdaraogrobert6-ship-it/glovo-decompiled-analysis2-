package o;

import com.roadrunner.auth.domain.ProcessSuccessfulSignInUseCase;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getPaneTitledelegate extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public String IconCompatParcelizer;
    public final /* synthetic */ ProcessSuccessfulSignInUseCase MediaMetadataCompat;
    public /* synthetic */ Object RatingCompat;
    public int RemoteActionCompatParcelizer;
    public String read;
    public copyTextdefault serializer;
    public getIsTraversalGroup write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getPaneTitledelegate(ProcessSuccessfulSignInUseCase processSuccessfulSignInUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaMetadataCompat = processSuccessfulSignInUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 91;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.RatingCompat = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return this.MediaMetadataCompat.invoke(null, null, null, this);
        }
        this.RatingCompat = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        int i3 = 89 / 0;
        return this.MediaMetadataCompat.invoke(null, null, null, this);
    }
}
