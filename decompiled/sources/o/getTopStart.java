package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class getTopStart {
    public final int IconCompatParcelizer;
    public final boolean MediaBrowserCompatMediaItem;
    public final androidx.compose.ui.text.TextStyle MediaDescriptionCompat;
    public final androidx.compose.ui.text.AnnotatedString MediaMetadataCompat;
    public final List MediaSessionCompatQueueItem;
    public final androidx.compose.ui.unit.Density RemoteActionCompatParcelizer;
    public androidx.compose.ui.unit.LayoutDirection read;
    public final androidx.compose.ui.text.font.FontFamily.Resolver serializer;
    public androidx.compose.ui.text.MultiParagraphIntrinsics write;

    public getTopStart(androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.text.TextStyle textStyle, boolean z, int i, androidx.compose.ui.unit.Density density, androidx.compose.ui.text.font.FontFamily.Resolver resolver, List list) {
        this.MediaMetadataCompat = annotatedString;
        this.MediaDescriptionCompat = textStyle;
        this.MediaBrowserCompatMediaItem = z;
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = density;
        this.serializer = resolver;
        this.MediaSessionCompatQueueItem = list;
    }

    public final void read(androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        androidx.compose.ui.text.MultiParagraphIntrinsics multiParagraphIntrinsics = this.write;
        if (multiParagraphIntrinsics == null || layoutDirection != this.read || multiParagraphIntrinsics.getHasStaleResolvedFonts()) {
            this.read = layoutDirection;
            multiParagraphIntrinsics = new androidx.compose.ui.text.MultiParagraphIntrinsics(this.MediaMetadataCompat, androidx.compose.ui.text.TextStyleKt.resolveDefaults(this.MediaDescriptionCompat, layoutDirection), (List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>>) this.MediaSessionCompatQueueItem, this.RemoteActionCompatParcelizer, this.serializer);
        }
        this.write = multiParagraphIntrinsics;
    }
}
