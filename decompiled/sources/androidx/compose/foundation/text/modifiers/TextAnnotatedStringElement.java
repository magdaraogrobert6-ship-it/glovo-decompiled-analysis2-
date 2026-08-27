package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.List;
import o.MediaSessionCompatQueueItem;
import o.getCieXyz;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class TextAnnotatedStringElement extends ModifierNodeElement<TextAnnotatedStringNode> {
    public final FontFamily.Resolver IconCompatParcelizer;
    public final boolean MediaBrowserCompatMediaItem;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public final List MediaSessionCompatQueueItem;
    public final AnnotatedString ParcelableVolumeInfo;
    public final TextStyle RatingCompat;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RemoteActionCompatParcelizer;
    private final ColorProducer color = null;
    public final int read;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM serializer;
    public final int write;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node create() {
        ColorProducer colorProducer = this.color;
        TextAnnotatedStringNode textAnnotatedStringNode = new TextAnnotatedStringNode();
        textAnnotatedStringNode.PlaybackStateCompat = this.ParcelableVolumeInfo;
        textAnnotatedStringNode.MediaSessionCompatResultReceiverWrapper = this.RatingCompat;
        textAnnotatedStringNode.RemoteActionCompatParcelizer = this.IconCompatParcelizer;
        textAnnotatedStringNode.MediaDescriptionCompat = this.MediaDescriptionCompat;
        textAnnotatedStringNode.RatingCompat = this.MediaMetadataCompat;
        textAnnotatedStringNode.MediaSessionCompatToken = this.MediaBrowserCompatMediaItem;
        textAnnotatedStringNode.IconCompatParcelizer = this.write;
        textAnnotatedStringNode.serializer = this.read;
        textAnnotatedStringNode.ParcelableVolumeInfo = this.MediaSessionCompatQueueItem;
        textAnnotatedStringNode.MediaMetadataCompat = this.RemoteActionCompatParcelizer;
        textAnnotatedStringNode.MediaSessionCompatQueueItem = colorProducer;
        textAnnotatedStringNode.MediaBrowserCompatMediaItem = this.serializer;
        return textAnnotatedStringNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        int iSerializer = MediaSessionCompatQueueItem.serializer(this.RatingCompat, this.ParcelableVolumeInfo.hashCode() * 31, 31);
        int iHashCode = this.IconCompatParcelizer.hashCode();
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.MediaDescriptionCompat;
        int iM = d$$ExternalSyntheticOutline0.m((TextOverflow.m3560hashCodeimpl(this.MediaMetadataCompat) + ((((iHashCode + iSerializer) * 31) + (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null ? r8lambdaunavo3sxub_pc9xroryotnrlvsm.hashCode() : 0)) * 31)) * 31, 31, this.MediaBrowserCompatMediaItem);
        int i = this.write;
        int i2 = this.read;
        List list = this.MediaSessionCompatQueueItem;
        int iHashCode2 = list != null ? list.hashCode() : 0;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = this.RemoteActionCompatParcelizer;
        int iHashCode3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm2 != null ? r8lambdaunavo3sxub_pc9xroryotnrlvsm2.hashCode() : 0;
        ColorProducer colorProducer = this.color;
        int iHashCode4 = colorProducer != null ? colorProducer.hashCode() : 0;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = this.serializer;
        return ((((((((((iM + i) * 31) + i2) * 31) + iHashCode2) * 31) + iHashCode3) * 961) + iHashCode4) * 31) + (r8lambdaunavo3sxub_pc9xroryotnrlvsm3 != null ? r8lambdaunavo3sxub_pc9xroryotnrlvsm3.hashCode() : 0);
    }

    public TextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, boolean z, int i2, int i3, List list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3) {
        this.ParcelableVolumeInfo = annotatedString;
        this.RatingCompat = textStyle;
        this.IconCompatParcelizer = resolver;
        this.MediaDescriptionCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaMetadataCompat = i;
        this.MediaBrowserCompatMediaItem = z;
        this.write = i2;
        this.read = i3;
        this.MediaSessionCompatQueueItem = list;
        this.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.serializer = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.color, textAnnotatedStringElement.color}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.ParcelableVolumeInfo, textAnnotatedStringElement.ParcelableVolumeInfo}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RatingCompat, textAnnotatedStringElement.RatingCompat}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.MediaSessionCompatQueueItem, textAnnotatedStringElement.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, textAnnotatedStringElement.IconCompatParcelizer}, getCieXyz.write())).booleanValue() && this.MediaDescriptionCompat == textAnnotatedStringElement.MediaDescriptionCompat && this.serializer == textAnnotatedStringElement.serializer && TextOverflow.m3559equalsimpl0(this.MediaMetadataCompat, textAnnotatedStringElement.MediaMetadataCompat) && this.MediaBrowserCompatMediaItem == textAnnotatedStringElement.MediaBrowserCompatMediaItem && this.write == textAnnotatedStringElement.write && this.read == textAnnotatedStringElement.read && this.RemoteActionCompatParcelizer == textAnnotatedStringElement.RemoteActionCompatParcelizer;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(Modifier.Node node) {
        TextAnnotatedStringNode textAnnotatedStringNode = (TextAnnotatedStringNode) node;
        ColorProducer colorProducer = this.color;
        boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{colorProducer, textAnnotatedStringNode.MediaSessionCompatQueueItem}, getCieXyz.write())).booleanValue();
        textAnnotatedStringNode.MediaSessionCompatQueueItem = colorProducer;
        TextStyle textStyle = this.RatingCompat;
        boolean z = false;
        boolean z2 = true;
        boolean z3 = (zBooleanValue && textStyle.hasSameDrawAffectingAttributes(textAnnotatedStringNode.MediaSessionCompatResultReceiverWrapper)) ? false : true;
        String text = textAnnotatedStringNode.PlaybackStateCompat.getText();
        AnnotatedString annotatedString = this.ParcelableVolumeInfo;
        boolean zBooleanValue2 = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{text, annotatedString.getText()}, getCieXyz.write())).booleanValue();
        boolean z4 = (zBooleanValue2 && textAnnotatedStringNode.PlaybackStateCompat.hasEqualAnnotations(annotatedString)) ? false : true;
        if (z4) {
            textAnnotatedStringNode.PlaybackStateCompat = annotatedString;
        }
        if (!zBooleanValue2) {
            textAnnotatedStringNode.ResultReceiver = null;
        }
        boolean z5 = !textAnnotatedStringNode.MediaSessionCompatResultReceiverWrapper.hasSameLayoutAffectingAttributes(textStyle);
        textAnnotatedStringNode.MediaSessionCompatResultReceiverWrapper = textStyle;
        List list = textAnnotatedStringNode.ParcelableVolumeInfo;
        List list2 = this.MediaSessionCompatQueueItem;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list, list2}, getCieXyz.write())).booleanValue()) {
            textAnnotatedStringNode.ParcelableVolumeInfo = list2;
            z5 = true;
        }
        int i = textAnnotatedStringNode.serializer;
        int i2 = this.read;
        if (i != i2) {
            textAnnotatedStringNode.serializer = i2;
            z5 = true;
        }
        int i3 = textAnnotatedStringNode.IconCompatParcelizer;
        int i4 = this.write;
        if (i3 != i4) {
            textAnnotatedStringNode.IconCompatParcelizer = i4;
            z5 = true;
        }
        boolean z6 = textAnnotatedStringNode.MediaSessionCompatToken;
        boolean z7 = this.MediaBrowserCompatMediaItem;
        if (z6 != z7) {
            textAnnotatedStringNode.MediaSessionCompatToken = z7;
            z5 = true;
        }
        FontFamily.Resolver resolver = textAnnotatedStringNode.RemoteActionCompatParcelizer;
        FontFamily.Resolver resolver2 = this.IconCompatParcelizer;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{resolver, resolver2}, getCieXyz.write())).booleanValue()) {
            textAnnotatedStringNode.RemoteActionCompatParcelizer = resolver2;
            z5 = true;
        }
        int i5 = textAnnotatedStringNode.RatingCompat;
        int i6 = this.MediaMetadataCompat;
        if (!TextOverflow.m3559equalsimpl0(i5, i6)) {
            textAnnotatedStringNode.RatingCompat = i6;
            z5 = true;
        }
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = textAnnotatedStringNode.MediaDescriptionCompat;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = this.MediaDescriptionCompat;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
            textAnnotatedStringNode.MediaDescriptionCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
            z = true;
        }
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = textAnnotatedStringNode.MediaMetadataCompat;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = this.RemoteActionCompatParcelizer;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm3 != r8lambdaunavo3sxub_pc9xroryotnrlvsm4) {
            textAnnotatedStringNode.MediaMetadataCompat = r8lambdaunavo3sxub_pc9xroryotnrlvsm4;
            z = true;
        }
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm5 = textAnnotatedStringNode.MediaBrowserCompatMediaItem;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm6 = this.serializer;
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm5 != r8lambdaunavo3sxub_pc9xroryotnrlvsm6) {
            textAnnotatedStringNode.MediaBrowserCompatMediaItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm6;
        } else {
            z2 = z;
        }
        if (z4 || z5 || z2) {
            MultiParagraphLayoutCache multiParagraphLayoutCacheRemoteActionCompatParcelizer = textAnnotatedStringNode.RemoteActionCompatParcelizer();
            AnnotatedString annotatedString2 = textAnnotatedStringNode.PlaybackStateCompat;
            TextStyle textStyle2 = textAnnotatedStringNode.MediaSessionCompatResultReceiverWrapper;
            FontFamily.Resolver resolver3 = textAnnotatedStringNode.RemoteActionCompatParcelizer;
            int i7 = textAnnotatedStringNode.RatingCompat;
            boolean z8 = textAnnotatedStringNode.MediaSessionCompatToken;
            int i8 = textAnnotatedStringNode.IconCompatParcelizer;
            int i9 = textAnnotatedStringNode.serializer;
            List list3 = textAnnotatedStringNode.ParcelableVolumeInfo;
            multiParagraphLayoutCacheRemoteActionCompatParcelizer.ComponentActivity = annotatedString2;
            boolean zHasSameLayoutAffectingAttributes = textStyle2.hasSameLayoutAffectingAttributes(multiParagraphLayoutCacheRemoteActionCompatParcelizer.ResultReceiver);
            multiParagraphLayoutCacheRemoteActionCompatParcelizer.ResultReceiver = textStyle2;
            if (!zHasSameLayoutAffectingAttributes) {
                multiParagraphLayoutCacheRemoteActionCompatParcelizer.read <<= 2;
                multiParagraphLayoutCacheRemoteActionCompatParcelizer.MediaSessionCompatToken = null;
                multiParagraphLayoutCacheRemoteActionCompatParcelizer.RatingCompat = null;
                multiParagraphLayoutCacheRemoteActionCompatParcelizer.RemoteActionCompatParcelizer = -1;
                multiParagraphLayoutCacheRemoteActionCompatParcelizer.IconCompatParcelizer = -1;
            }
            multiParagraphLayoutCacheRemoteActionCompatParcelizer.write = resolver3;
            multiParagraphLayoutCacheRemoteActionCompatParcelizer.PlaybackStateCompat = i7;
            multiParagraphLayoutCacheRemoteActionCompatParcelizer.ParcelableVolumeInfo = z8;
            multiParagraphLayoutCacheRemoteActionCompatParcelizer.MediaSessionCompatQueueItem = i8;
            multiParagraphLayoutCacheRemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper = i9;
            multiParagraphLayoutCacheRemoteActionCompatParcelizer.PlaybackStateCompatCustomAction = list3;
            multiParagraphLayoutCacheRemoteActionCompatParcelizer.read = (multiParagraphLayoutCacheRemoteActionCompatParcelizer.read << 2) | 2;
            multiParagraphLayoutCacheRemoteActionCompatParcelizer.MediaSessionCompatToken = null;
            multiParagraphLayoutCacheRemoteActionCompatParcelizer.RatingCompat = null;
            multiParagraphLayoutCacheRemoteActionCompatParcelizer.RemoteActionCompatParcelizer = -1;
            multiParagraphLayoutCacheRemoteActionCompatParcelizer.IconCompatParcelizer = -1;
        } else {
            z4 = z4;
        }
        if (textAnnotatedStringNode.isAttached()) {
            if (z4 || (z3 && textAnnotatedStringNode.PlaybackStateCompatCustomAction != null)) {
                SemanticsModifierNodeKt.invalidateSemantics(textAnnotatedStringNode);
            }
            if (z4 || z5 || z2) {
                LayoutModifierNodeKt.invalidateMeasurement(textAnnotatedStringNode);
                DrawModifierNodeKt.invalidateDraw(textAnnotatedStringNode);
            }
            if (z3) {
                DrawModifierNodeKt.invalidateDraw(textAnnotatedStringNode);
            }
        }
    }
}
