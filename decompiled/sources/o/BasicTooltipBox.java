package o;

/* JADX INFO: loaded from: classes.dex */
public final class BasicTooltipBox extends BasicTooltipKthandleGestures1 {
    public final /* synthetic */ boolean IconCompatParcelizer;
    public final /* synthetic */ long MediaBrowserCompatMediaItem;
    public final /* synthetic */ androidx.compose.ui.Alignment.Vertical MediaDescriptionCompat;
    public final /* synthetic */ androidx.compose.foundation.lazy.LazyListState MediaMetadataCompat;
    public final /* synthetic */ int MediaSessionCompatQueueItem;
    public final /* synthetic */ BaselineButtonTokens RatingCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.compose.ui.Alignment.Horizontal read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltipBox(long j, boolean z, BasicTooltipKtanchorSemantics111 basicTooltipKtanchorSemantics111, BaselineButtonTokens baselineButtonTokens, int i, int i2, androidx.compose.ui.Alignment.Horizontal horizontal, androidx.compose.ui.Alignment.Vertical vertical, int i3, int i4, long j2, androidx.compose.foundation.lazy.LazyListState lazyListState) {
        super(j, z, basicTooltipKtanchorSemantics111, baselineButtonTokens);
        this.IconCompatParcelizer = z;
        this.RatingCompat = baselineButtonTokens;
        this.serializer = i;
        this.MediaSessionCompatQueueItem = i2;
        this.read = horizontal;
        this.MediaDescriptionCompat = vertical;
        this.write = i3;
        this.RemoteActionCompatParcelizer = i4;
        this.MediaBrowserCompatMediaItem = j2;
        this.MediaMetadataCompat = lazyListState;
    }
}
