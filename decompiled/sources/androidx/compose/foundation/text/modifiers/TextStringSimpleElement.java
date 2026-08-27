package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import bo.app.d$$ExternalSyntheticOutline0;
import o.MediaSessionCompatQueueItem;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class TextStringSimpleElement extends ModifierNodeElement<TextStringSimpleNode> {
    public final int IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final TextStyle MediaDescriptionCompat;
    public final boolean RemoteActionCompatParcelizer;
    private final ColorProducer color = null;
    public final int read;
    public final int serializer;
    public final FontFamily.Resolver write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        ColorProducer colorProducer = this.color;
        TextStringSimpleNode textStringSimpleNode = new TextStringSimpleNode();
        textStringSimpleNode.MediaSessionCompatResultReceiverWrapper = this.MediaBrowserCompatMediaItem;
        textStringSimpleNode.RatingCompat = this.MediaDescriptionCompat;
        textStringSimpleNode.read = this.write;
        textStringSimpleNode.MediaBrowserCompatMediaItem = this.read;
        textStringSimpleNode.MediaDescriptionCompat = this.RemoteActionCompatParcelizer;
        textStringSimpleNode.RemoteActionCompatParcelizer = this.serializer;
        textStringSimpleNode.serializer = this.IconCompatParcelizer;
        textStringSimpleNode.MediaMetadataCompat = colorProducer;
        return textStringSimpleNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iSerializer = MediaSessionCompatQueueItem.serializer(this.MediaDescriptionCompat, this.MediaBrowserCompatMediaItem.hashCode() * 31, 31);
        int iM = d$$ExternalSyntheticOutline0.m((TextOverflow.m3560hashCodeimpl(this.read) + ((this.write.hashCode() + iSerializer) * 31)) * 31, 31, this.RemoteActionCompatParcelizer);
        int i = this.serializer;
        int i2 = this.IconCompatParcelizer;
        ColorProducer colorProducer = this.color;
        return ((((iM + i) * 31) + i2) * 31) + (colorProducer != null ? colorProducer.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        TextStringSimpleNode textStringSimpleNode = (TextStringSimpleNode) node;
        ColorProducer colorProducer = this.color;
        boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{colorProducer, textStringSimpleNode.MediaMetadataCompat}, getCieXyz.write())).booleanValue();
        textStringSimpleNode.MediaMetadataCompat = colorProducer;
        TextStyle textStyle = this.MediaDescriptionCompat;
        boolean z = false;
        boolean z2 = true;
        boolean z3 = (zBooleanValue && textStyle.hasSameDrawAffectingAttributes(textStringSimpleNode.RatingCompat)) ? false : true;
        String str = textStringSimpleNode.MediaSessionCompatResultReceiverWrapper;
        String str2 = this.MediaBrowserCompatMediaItem;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, str2}, getCieXyz.write())).booleanValue()) {
            textStringSimpleNode.MediaSessionCompatResultReceiverWrapper = str2;
            textStringSimpleNode.ParcelableVolumeInfo = null;
            z = true;
        }
        boolean z4 = !textStringSimpleNode.RatingCompat.hasSameLayoutAffectingAttributes(textStyle);
        textStringSimpleNode.RatingCompat = textStyle;
        int i = textStringSimpleNode.serializer;
        int i2 = this.IconCompatParcelizer;
        if (i != i2) {
            textStringSimpleNode.serializer = i2;
            z4 = true;
        }
        int i3 = textStringSimpleNode.RemoteActionCompatParcelizer;
        int i4 = this.serializer;
        if (i3 != i4) {
            textStringSimpleNode.RemoteActionCompatParcelizer = i4;
            z4 = true;
        }
        boolean z5 = textStringSimpleNode.MediaDescriptionCompat;
        boolean z6 = this.RemoteActionCompatParcelizer;
        if (z5 != z6) {
            textStringSimpleNode.MediaDescriptionCompat = z6;
            z4 = true;
        }
        FontFamily.Resolver resolver = textStringSimpleNode.read;
        FontFamily.Resolver resolver2 = this.write;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{resolver, resolver2}, getCieXyz.write())).booleanValue()) {
            textStringSimpleNode.read = resolver2;
            z4 = true;
        }
        int i5 = textStringSimpleNode.MediaBrowserCompatMediaItem;
        int i6 = this.read;
        if (TextOverflow.m3559equalsimpl0(i5, i6)) {
            z2 = z4;
        } else {
            textStringSimpleNode.MediaBrowserCompatMediaItem = i6;
        }
        if (z || z2) {
            ParagraphLayoutCache paragraphLayoutCacheRemoteActionCompatParcelizer = textStringSimpleNode.RemoteActionCompatParcelizer();
            String str3 = textStringSimpleNode.MediaSessionCompatResultReceiverWrapper;
            TextStyle textStyle2 = textStringSimpleNode.RatingCompat;
            FontFamily.Resolver resolver3 = textStringSimpleNode.read;
            int i7 = textStringSimpleNode.MediaBrowserCompatMediaItem;
            boolean z7 = textStringSimpleNode.MediaDescriptionCompat;
            int i8 = textStringSimpleNode.RemoteActionCompatParcelizer;
            int i9 = textStringSimpleNode.serializer;
            paragraphLayoutCacheRemoteActionCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = str3;
            paragraphLayoutCacheRemoteActionCompatParcelizer.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = textStyle2;
            paragraphLayoutCacheRemoteActionCompatParcelizer.IconCompatParcelizer = resolver3;
            paragraphLayoutCacheRemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper = i7;
            paragraphLayoutCacheRemoteActionCompatParcelizer.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = z7;
            paragraphLayoutCacheRemoteActionCompatParcelizer.PlaybackStateCompatCustomAction = i8;
            paragraphLayoutCacheRemoteActionCompatParcelizer.MediaSessionCompatToken = i9;
            paragraphLayoutCacheRemoteActionCompatParcelizer.RatingCompat = (paragraphLayoutCacheRemoteActionCompatParcelizer.RatingCompat << 2) | 2;
            paragraphLayoutCacheRemoteActionCompatParcelizer.markDirty();
        }
        if (textStringSimpleNode.isAttached()) {
            if (z || (z3 && textStringSimpleNode.MediaSessionCompatQueueItem != null)) {
                SemanticsModifierNodeKt.invalidateSemantics(textStringSimpleNode);
            }
            if (z || z2) {
                LayoutModifierNodeKt.invalidateMeasurement(textStringSimpleNode);
                DrawModifierNodeKt.invalidateDraw(textStringSimpleNode);
            }
            if (z3) {
                DrawModifierNodeKt.invalidateDraw(textStringSimpleNode);
            }
        }
    }

    public TextStringSimpleElement(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3) {
        this.MediaBrowserCompatMediaItem = str;
        this.MediaDescriptionCompat = textStyle;
        this.write = resolver;
        this.read = i;
        this.RemoteActionCompatParcelizer = z;
        this.serializer = i2;
        this.IconCompatParcelizer = i3;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.color, textStringSimpleElement.color}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaBrowserCompatMediaItem, textStringSimpleElement.MediaBrowserCompatMediaItem}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaDescriptionCompat, textStringSimpleElement.MediaDescriptionCompat}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, textStringSimpleElement.write}, getCieXyz.write())).booleanValue() && TextOverflow.m3559equalsimpl0(this.read, textStringSimpleElement.read) && this.RemoteActionCompatParcelizer == textStringSimpleElement.RemoteActionCompatParcelizer && this.serializer == textStringSimpleElement.serializer && this.IconCompatParcelizer == textStringSimpleElement.IconCompatParcelizer;
    }
}
