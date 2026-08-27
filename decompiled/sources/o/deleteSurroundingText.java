package o;

import androidx.compose.material3.ThumbNode$onAttach$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class deleteSurroundingText extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    public getAutoCorrect IconCompatParcelizer;
    public int MediaDescriptionCompat;
    public /* synthetic */ Object MediaSessionCompatQueueItem;
    public final /* synthetic */ ThumbNode$onAttach$1$1 RatingCompat;
    public int RemoteActionCompatParcelizer;
    public String read;
    public getCapitalizationIUNYP9k serializer;
    public FlowCollector write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public deleteSurroundingText(ThumbNode$onAttach$1$1 thumbNode$onAttach$1$1, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.RatingCompat = thumbNode$onAttach$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEmit;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 73;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.MediaSessionCompatQueueItem = obj;
            this.MediaDescriptionCompat |= Integer.MIN_VALUE;
            objEmit = this.RatingCompat.emit(null, this);
            int i3 = 50 / 0;
        } else {
            this.MediaSessionCompatQueueItem = obj;
            this.MediaDescriptionCompat |= Integer.MIN_VALUE;
            objEmit = this.RatingCompat.emit(null, this);
        }
        int i4 = MediaBrowserCompatMediaItem + 107;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objEmit;
        }
        obj2.hashCode();
        throw null;
    }
}
