package o;

import com.roadrunner.auth.domain.magiclink.VerifyMagicLinkUseCaseImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class isSensitiveDatadelegate extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RemoteActionCompatParcelizer;
    public int IconCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ VerifyMagicLinkUseCaseImpl serializer;
    public getTraversalIndexdelegate write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isSensitiveDatadelegate(VerifyMagicLinkUseCaseImpl verifyMagicLinkUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = verifyMagicLinkUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 71;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objSaveAuthData = this.serializer.saveAuthData(null, this);
        int i4 = RemoteActionCompatParcelizer + 25;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objSaveAuthData;
        }
        obj2.hashCode();
        throw null;
    }
}
