package o;

import android.net.Uri;
import com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ParagraphIntrinsics extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat;
    public Uri IconCompatParcelizer;
    public String RemoteActionCompatParcelizer;
    public final /* synthetic */ WebChatViewModel read;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParagraphIntrinsics(WebChatViewModel webChatViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = webChatViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 1;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objAccess$resolveLocalOrCdnUrl = WebChatViewModel.access$resolveLocalOrCdnUrl(this.read, null, this);
        int i4 = MediaDescriptionCompat + 43;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objAccess$resolveLocalOrCdnUrl;
        }
        obj2.hashCode();
        throw null;
    }
}
