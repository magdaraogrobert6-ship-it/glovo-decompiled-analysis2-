package o;

import com.roadrunner.customerchat.selfservice.domain.usecase.GetChatAssetDownloadConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getIntrinsics extends ContinuationImpl {
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;
    public String IconCompatParcelizer;
    public String RemoteActionCompatParcelizer;
    public final /* synthetic */ GetChatAssetDownloadConfig read;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getIntrinsics(GetChatAssetDownloadConfig getChatAssetDownloadConfig, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = getChatAssetDownloadConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 59;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.serializer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objInvoke = this.read.invoke(this);
        int i4 = RatingCompat + 11;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvoke;
    }
}
