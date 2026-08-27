package o;

import com.roadrunner.auth.domain.RefreshAccessTokenUseCaseImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getProgressBarRangeInfodelegate extends ContinuationImpl {
    private static int MediaSessionCompatQueueItem = 1;
    private static int write;
    public final /* synthetic */ RefreshAccessTokenUseCaseImpl IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public getContentDataTypedelegate read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getProgressBarRangeInfodelegate(RefreshAccessTokenUseCaseImpl refreshAccessTokenUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = refreshAccessTokenUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objSaveAuthData;
        int i = 2 % 2;
        int i2 = write + 1;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.serializer |= Integer.MIN_VALUE;
            objSaveAuthData = this.IconCompatParcelizer.saveAuthData(null, null, this);
            int i3 = 9 / 0;
        } else {
            this.RemoteActionCompatParcelizer = obj;
            this.serializer |= Integer.MIN_VALUE;
            objSaveAuthData = this.IconCompatParcelizer.saveAuthData(null, null, this);
        }
        int i4 = MediaSessionCompatQueueItem + 65;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objSaveAuthData;
    }
}
