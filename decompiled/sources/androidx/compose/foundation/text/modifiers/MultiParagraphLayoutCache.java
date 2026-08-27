package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.IconCompatParcelizer;
import o.getFqName;
import o.getKey1;
import o.instance_delegatelambda0;

/* JADX INFO: loaded from: classes.dex */
public final class MultiParagraphLayoutCache {
    public AnnotatedString ComponentActivity;
    public MinLinesConstrainer MediaBrowserCompatMediaItem;
    public LayoutDirection MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public int MediaSessionCompatResultReceiverWrapper;
    public MultiParagraphIntrinsics MediaSessionCompatToken;
    public boolean ParcelableVolumeInfo;
    public int PlaybackStateCompat;
    public List PlaybackStateCompatCustomAction;
    public TextLayoutResult RatingCompat;
    public TextStyle ResultReceiver;
    public long read;
    public Density serializer;
    public FontFamily.Resolver write;
    public long MediaDescriptionCompat = InlineDensity.read;
    public int IconCompatParcelizer = -1;
    public int RemoteActionCompatParcelizer = -1;

    public final int read(LayoutDirection layoutDirection, int i) {
        int i2 = this.IconCompatParcelizer;
        int i3 = this.RemoteActionCompatParcelizer;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jConstraints = ConstraintsKt.Constraints(0, i, 0, Integer.MAX_VALUE);
        if (this.MediaSessionCompatResultReceiverWrapper > 1) {
            MinLinesConstrainer minLinesConstrainer = this.MediaBrowserCompatMediaItem;
            TextStyle textStyle = this.ResultReceiver;
            Density density = this.serializer;
            density.getClass();
            MinLinesConstrainer minLinesConstrainerRemoteActionCompatParcelizer = getKey1.RemoteActionCompatParcelizer(minLinesConstrainer, layoutDirection, textStyle, density, this.write);
            this.MediaBrowserCompatMediaItem = minLinesConstrainerRemoteActionCompatParcelizer;
            jConstraints = minLinesConstrainerRemoteActionCompatParcelizer.m106coerceMinLinesOh53vG4$foundation(this.MediaSessionCompatResultReceiverWrapper, jConstraints);
        }
        int iCeilToIntPx = TextDelegateKt.ceilToIntPx(write(jConstraints, layoutDirection).getHeight());
        int iM3627getMinHeightimpl = Constraints.m3627getMinHeightimpl(jConstraints);
        if (iCeilToIntPx < iM3627getMinHeightimpl) {
            iCeilToIntPx = iM3627getMinHeightimpl;
        }
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = iCeilToIntPx;
        return iCeilToIntPx;
    }

    /* JADX INFO: renamed from: textLayoutResult-VKLhPVY, reason: not valid java name */
    public final TextLayoutResult m107textLayoutResultVKLhPVY(LayoutDirection layoutDirection, long j, MultiParagraph multiParagraph) {
        float fMin = Math.min(multiParagraph.getIntrinsics().getMaxIntrinsicWidth(), multiParagraph.getWidth());
        AnnotatedString annotatedString = this.ComponentActivity;
        TextStyle textStyle = this.ResultReceiver;
        List list = this.PlaybackStateCompatCustomAction;
        if (list == null) {
            list = instance_delegatelambda0.write;
        }
        int i = this.MediaSessionCompatQueueItem;
        boolean z = this.ParcelableVolumeInfo;
        int i2 = this.PlaybackStateCompat;
        Density density = this.serializer;
        density.getClass();
        return new TextLayoutResult(new TextLayoutInput(annotatedString, textStyle, list, i, z, i2, density, layoutDirection, this.write, j, (DefaultConstructorMarker) null), multiParagraph, ConstraintsKt.m3640constrain4WqzIAM(j, IntSize.m3839constructorimpl((((long) TextDelegateKt.ceilToIntPx(multiParagraph.getHeight())) & 4294967295L) | (((long) TextDelegateKt.ceilToIntPx(fMin)) << 32))), null);
    }

    public MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, List list) {
        this.ComponentActivity = annotatedString;
        this.write = resolver;
        this.PlaybackStateCompat = i;
        this.ParcelableVolumeInfo = z;
        this.MediaSessionCompatQueueItem = i2;
        this.MediaSessionCompatResultReceiverWrapper = i3;
        this.PlaybackStateCompatCustomAction = list;
        this.ResultReceiver = textStyle;
    }

    public final MultiParagraphIntrinsics IconCompatParcelizer(LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.MediaSessionCompatToken;
        if (multiParagraphIntrinsics == null || layoutDirection != this.MediaMetadataCompat || multiParagraphIntrinsics.getHasStaleResolvedFonts()) {
            this.MediaMetadataCompat = layoutDirection;
            AnnotatedString annotatedString = this.ComponentActivity;
            TextStyle textStyleResolveDefaults = TextStyleKt.resolveDefaults(this.ResultReceiver, layoutDirection);
            Density density = this.serializer;
            density.getClass();
            FontFamily.Resolver resolver = this.write;
            List list = this.PlaybackStateCompatCustomAction;
            if (list == null) {
                list = instance_delegatelambda0.write;
            }
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyleResolveDefaults, (List<AnnotatedString.Range<Placeholder>>) list, density, resolver);
        }
        this.MediaSessionCompatToken = multiParagraphIntrinsics;
        return multiParagraphIntrinsics;
    }

    public final String toString() {
        String str;
        TextLayoutInput layoutInput;
        StringBuilder sb = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        Object objM3613boximpl = "null";
        if (this.RatingCompat == null) {
            str = "null";
        } else {
            str = "<TextLayoutResult>";
        }
        sb.append(str);
        sb.append(", lastDensity=");
        sb.append((Object) InlineDensity.m105toStringimpl(this.MediaDescriptionCompat));
        sb.append(", history=");
        sb.append(this.read);
        sb.append(", constraints=");
        TextLayoutResult textLayoutResult = this.RatingCompat;
        if (textLayoutResult != null && (layoutInput = textLayoutResult.getLayoutInput()) != null) {
            objM3613boximpl = Constraints.m3613boximpl(layoutInput.m3042getConstraintsmsEJaDk());
        }
        return IconCompatParcelizer.RemoteActionCompatParcelizer(sb, objM3613boximpl, ')');
    }

    public final void write(Density density) {
        long jM104constructorimpl;
        Density density2 = this.serializer;
        if (density != null) {
            int i = InlineDensity.write;
            jM104constructorimpl = InlineDensity.m104constructorimpl(density.getDensity(), density.getFontScale());
        } else {
            jM104constructorimpl = InlineDensity.read;
        }
        if (density2 == null) {
            this.serializer = density;
            this.MediaDescriptionCompat = jM104constructorimpl;
        } else if (density == null || this.MediaDescriptionCompat != jM104constructorimpl) {
            this.serializer = density;
            this.MediaDescriptionCompat = jM104constructorimpl;
            this.read = (this.read << 2) | 1;
            this.MediaSessionCompatToken = null;
            this.RatingCompat = null;
            this.RemoteActionCompatParcelizer = -1;
            this.IconCompatParcelizer = -1;
        }
    }

    public final MultiParagraph write(long j, LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsicsIconCompatParcelizer = IconCompatParcelizer(layoutDirection);
        long jRemoteActionCompatParcelizer = getFqName.RemoteActionCompatParcelizer(j, this.ParcelableVolumeInfo, this.PlaybackStateCompat, multiParagraphIntrinsicsIconCompatParcelizer.getMaxIntrinsicWidth());
        boolean z = this.ParcelableVolumeInfo;
        int i = this.PlaybackStateCompat;
        int i2 = this.MediaSessionCompatQueueItem;
        return new MultiParagraph(multiParagraphIntrinsicsIconCompatParcelizer, jRemoteActionCompatParcelizer, ((z || !getFqName.write(i)) && i2 >= 1) ? i2 : 1, this.PlaybackStateCompat, (DefaultConstructorMarker) null);
    }

    public final boolean RemoteActionCompatParcelizer(long j, LayoutDirection layoutDirection) {
        this.read = (this.read << 2) | 3;
        if (this.MediaSessionCompatResultReceiverWrapper > 1) {
            MinLinesConstrainer minLinesConstrainer = this.MediaBrowserCompatMediaItem;
            TextStyle textStyle = this.ResultReceiver;
            Density density = this.serializer;
            density.getClass();
            MinLinesConstrainer minLinesConstrainerRemoteActionCompatParcelizer = getKey1.RemoteActionCompatParcelizer(minLinesConstrainer, layoutDirection, textStyle, density, this.write);
            this.MediaBrowserCompatMediaItem = minLinesConstrainerRemoteActionCompatParcelizer;
            j = minLinesConstrainerRemoteActionCompatParcelizer.m106coerceMinLinesOh53vG4$foundation(this.MediaSessionCompatResultReceiverWrapper, j);
        }
        TextLayoutResult textLayoutResult = this.RatingCompat;
        if (textLayoutResult == null || textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts() || layoutDirection != textLayoutResult.getLayoutInput().getLayoutDirection() || (!Constraints.m3619equalsimpl0(j, textLayoutResult.getLayoutInput().m3042getConstraintsmsEJaDk()) && (Constraints.m3626getMaxWidthimpl(j) != Constraints.m3626getMaxWidthimpl(textLayoutResult.getLayoutInput().m3042getConstraintsmsEJaDk()) || Constraints.m3628getMinWidthimpl(j) != Constraints.m3628getMinWidthimpl(textLayoutResult.getLayoutInput().m3042getConstraintsmsEJaDk()) || Constraints.m3625getMaxHeightimpl(j) < textLayoutResult.getMultiParagraph().getHeight() || textLayoutResult.getMultiParagraph().getDidExceedMaxLines()))) {
            this.RatingCompat = m107textLayoutResultVKLhPVY(layoutDirection, j, write(j, layoutDirection));
            return true;
        }
        TextLayoutResult textLayoutResult2 = this.RatingCompat;
        textLayoutResult2.getClass();
        if (Constraints.m3619equalsimpl0(j, textLayoutResult2.getLayoutInput().m3042getConstraintsmsEJaDk())) {
            return false;
        }
        TextLayoutResult textLayoutResult3 = this.RatingCompat;
        textLayoutResult3.getClass();
        this.RatingCompat = m107textLayoutResultVKLhPVY(layoutDirection, j, textLayoutResult3.getMultiParagraph());
        return true;
    }
}
