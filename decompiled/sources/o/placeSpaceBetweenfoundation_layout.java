package o;

/* JADX INFO: loaded from: classes.dex */
public final class placeSpaceBetweenfoundation_layout implements onViewAttachedToWindow {
    public final String IconCompatParcelizer;
    public Float MediaBrowserCompatMediaItem;
    public boolean MediaDescriptionCompat;
    public long MediaMetadataCompat;
    public final PopulateViewStructure_androidKtpopulate7 MediaSessionCompatQueueItem;
    public final /* synthetic */ ArrangementHorizontal RatingCompat;
    public Float RemoteActionCompatParcelizer;
    public boolean read;
    public TrackpadScrollingLogic serializer;
    public PaddingKt write;

    @Override // o.onViewAttachedToWindow
    public final Object getValue() {
        return this.MediaSessionCompatQueueItem.getValue();
    }

    public placeSpaceBetweenfoundation_layout(ArrangementHorizontal arrangementHorizontal, Float f, Float f2, placeSpaceEvenlyfoundation_layout placespaceevenlyfoundation_layout, String str) {
        this.RatingCompat = arrangementHorizontal;
        this.RemoteActionCompatParcelizer = f;
        this.MediaBrowserCompatMediaItem = f2;
        this.IconCompatParcelizer = str;
        this.MediaSessionCompatQueueItem = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(f);
        this.serializer = placespaceevenlyfoundation_layout;
        this.write = new PaddingKt(placespaceevenlyfoundation_layout, requiredWidth3ABfNKs.read, this.RemoteActionCompatParcelizer, this.MediaBrowserCompatMediaItem, null);
    }
}
