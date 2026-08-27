package o;

import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.InAppCameraWithTagsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getNewCursorPosition extends ContinuationImpl {
    private static int MediaMetadataCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public FocusMeteringAction IconCompatParcelizer;
    public minIntrinsicWidth RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;
    public int write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 59;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.read = obj;
            this.serializer |= Integer.MIN_VALUE;
            InAppCameraWithTagsKt.access$resolveZoomOptions(null, null, this);
            throw null;
        }
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objAccess$resolveZoomOptions = InAppCameraWithTagsKt.access$resolveZoomOptions(null, null, this);
        int i3 = MediaSessionCompatQueueItem + 33;
        MediaMetadataCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return objAccess$resolveZoomOptions;
        }
        obj2.hashCode();
        throw null;
    }

    public getNewCursorPosition(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
