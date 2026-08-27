package o;

import com.roadrunner.auth.domain.SaveAuthSignInDataUseCase;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getStateDescriptiondelegate extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ SaveAuthSignInDataUseCase RemoteActionCompatParcelizer;
    public metaMarkUpdatedAndHasCallbacks read;
    public int serializer;
    public getTraversalIndexdelegate write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getStateDescriptiondelegate(SaveAuthSignInDataUseCase saveAuthSignInDataUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = saveAuthSignInDataUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 93;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objStoreApplicantData = this.RemoteActionCompatParcelizer.storeApplicantData(null, this);
        int i4 = MediaBrowserCompatMediaItem + 115;
        MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return objStoreApplicantData;
    }
}
