package o;

import com.roadrunner.auth.domain.logout.LogoutUserUseCaseImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class isContainer extends ContinuationImpl {
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;
    public metaMarkUpdatedAndHasCallbacks IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ LogoutUserUseCaseImpl serializer;
    public getTraversalIndexdelegate write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isContainer(LogoutUserUseCaseImpl logoutUserUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = logoutUserUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 17;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            this.serializer.invoke(null, this);
            obj2.hashCode();
            throw null;
        }
        this.RemoteActionCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objInvoke = this.serializer.invoke(null, this);
        int i3 = RatingCompat + 105;
        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objInvoke;
    }
}
