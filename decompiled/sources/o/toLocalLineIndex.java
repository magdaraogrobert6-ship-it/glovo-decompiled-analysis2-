package o;

import com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$observeBridgeMessage$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class toLocalLineIndex extends ContinuationImpl {
    private static int MediaMetadataCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public updateOffsetsLDcG7Xg IconCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;
    public final /* synthetic */ WebChatViewModel$observeBridgeMessage$2 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public toLocalLineIndex(WebChatViewModel$observeBridgeMessage$2 webChatViewModel$observeBridgeMessage$2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.write = webChatViewModel$observeBridgeMessage$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 79;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objEmit = this.write.emit((updateOffsetsLDcG7Xg) null, (ShortNewsContentCardView) this);
        int i4 = MediaMetadataCompat + 77;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objEmit;
    }
}
