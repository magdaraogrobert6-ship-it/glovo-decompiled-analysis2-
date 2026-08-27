package o;

import com.roadrunner.customerchat.selfservice.domain.asset.DownloadChatAssetsUseCase;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class DeprecatedBridgeFontResourceLoader extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ DownloadChatAssetsUseCase RatingCompat;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public List read;
    public findFollowingBreak serializer;
    public String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeprecatedBridgeFontResourceLoader(DownloadChatAssetsUseCase downloadChatAssetsUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RatingCompat = downloadChatAssetsUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 119;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objInvoke = this.RatingCompat.invoke(null, null, null, this);
        int i4 = MediaDescriptionCompat + 103;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvoke;
    }
}
