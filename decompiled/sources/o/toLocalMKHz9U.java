package o;

import android.net.Uri;
import com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class toLocalMKHz9U extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ WebChatViewModel read;
    public int serializer;
    public Uri write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public toLocalMKHz9U(WebChatViewModel webChatViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = webChatViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 101;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Comparable comparableAccess$cacheGalleryImage = WebChatViewModel.access$cacheGalleryImage(this.read, null, this);
        int i4 = MediaBrowserCompatMediaItem + 29;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return comparableAccess$cacheGalleryImage;
    }
}
