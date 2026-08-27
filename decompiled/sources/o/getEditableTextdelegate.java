package o;

import com.roadrunner.auth.domain.CompleteIdentityVerificationUseCaseImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getEditableTextdelegate extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int serializer;
    public final /* synthetic */ CompleteIdentityVerificationUseCaseImpl IconCompatParcelizer;
    public getTraversalIndexdelegate RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getEditableTextdelegate(CompleteIdentityVerificationUseCaseImpl completeIdentityVerificationUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = completeIdentityVerificationUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 85;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.write = obj;
            this.read |= Integer.MIN_VALUE;
            return this.IconCompatParcelizer.invoke(this);
        }
        this.write = obj;
        this.read |= Integer.MIN_VALUE;
        this.IconCompatParcelizer.invoke(this);
        throw null;
    }
}
