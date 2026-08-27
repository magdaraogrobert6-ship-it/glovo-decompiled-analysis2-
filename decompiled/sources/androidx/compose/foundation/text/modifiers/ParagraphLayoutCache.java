package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.ParagraphIntrinsicsKt;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import bo.app.c8$$ExternalSyntheticOutline0;
import o.getFqName;
import o.getKey1;
import o.instance_delegatelambda0;

/* JADX INFO: loaded from: classes.dex */
public final class ParagraphLayoutCache {
    public FontFamily.Resolver IconCompatParcelizer;
    public MinLinesConstrainer MediaDescriptionCompat;
    public LayoutDirection MediaSessionCompatQueueItem;
    public int MediaSessionCompatResultReceiverWrapper;
    public int MediaSessionCompatToken;
    public Paragraph ParcelableVolumeInfo;
    public ParagraphIntrinsics PlaybackStateCompat;
    public int PlaybackStateCompatCustomAction;
    public long RatingCompat;
    public String r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public boolean r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public TextStyle r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public Density serializer;
    public boolean write;
    public long MediaMetadataCompat = InlineDensity.read;
    public long MediaBrowserCompatMediaItem = IntSize.m3839constructorimpl(0);
    public long ComponentActivity = Constraints.Companion.m3636fixedJhjzzOo(0, 0);
    public int RemoteActionCompatParcelizer = -1;
    public int read = -1;

    public final void markDirty() {
        this.ParcelableVolumeInfo = null;
        this.PlaybackStateCompat = null;
        this.MediaSessionCompatQueueItem = null;
        this.RemoteActionCompatParcelizer = -1;
        this.read = -1;
        this.ComponentActivity = Constraints.Companion.m3636fixedJhjzzOo(0, 0);
        this.MediaBrowserCompatMediaItem = IntSize.m3839constructorimpl(0L);
        this.write = false;
    }

    public static long RemoteActionCompatParcelizer(ParagraphLayoutCache paragraphLayoutCache, long j, LayoutDirection layoutDirection) {
        TextStyle textStyle = paragraphLayoutCache.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        MinLinesConstrainer minLinesConstrainer = paragraphLayoutCache.MediaDescriptionCompat;
        Density density = paragraphLayoutCache.serializer;
        density.getClass();
        MinLinesConstrainer minLinesConstrainerRemoteActionCompatParcelizer = getKey1.RemoteActionCompatParcelizer(minLinesConstrainer, layoutDirection, textStyle, density, paragraphLayoutCache.IconCompatParcelizer);
        paragraphLayoutCache.MediaDescriptionCompat = minLinesConstrainerRemoteActionCompatParcelizer;
        return minLinesConstrainerRemoteActionCompatParcelizer.m106coerceMinLinesOh53vG4$foundation(paragraphLayoutCache.MediaSessionCompatToken, j);
    }

    public final int write(LayoutDirection layoutDirection, int i) {
        int i2 = this.RemoteActionCompatParcelizer;
        int i3 = this.read;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jConstraints = ConstraintsKt.Constraints(0, i, 0, Integer.MAX_VALUE);
        int i4 = 1;
        if (this.MediaSessionCompatToken > 1) {
            jConstraints = RemoteActionCompatParcelizer(this, jConstraints, layoutDirection);
        }
        ParagraphIntrinsics paragraphIntrinsicsIconCompatParcelizer = IconCompatParcelizer(layoutDirection);
        long jRemoteActionCompatParcelizer = getFqName.RemoteActionCompatParcelizer(jConstraints, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, this.MediaSessionCompatResultReceiverWrapper, paragraphIntrinsicsIconCompatParcelizer.getMaxIntrinsicWidth());
        boolean z = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        int i5 = this.MediaSessionCompatResultReceiverWrapper;
        int i6 = this.PlaybackStateCompatCustomAction;
        if ((z || !getFqName.write(i5)) && i6 >= 1) {
            i4 = i6;
        }
        int iCeilToIntPx = TextDelegateKt.ceilToIntPx(ParagraphKt.m2933ParagraphczeNHc(paragraphIntrinsicsIconCompatParcelizer, jRemoteActionCompatParcelizer, i4, this.MediaSessionCompatResultReceiverWrapper).getHeight());
        int iM3627getMinHeightimpl = Constraints.m3627getMinHeightimpl(jConstraints);
        if (iCeilToIntPx < iM3627getMinHeightimpl) {
            iCeilToIntPx = iM3627getMinHeightimpl;
        }
        this.RemoteActionCompatParcelizer = i;
        this.read = iCeilToIntPx;
        return iCeilToIntPx;
    }

    public ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3) {
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = str;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = textStyle;
        this.IconCompatParcelizer = resolver;
        this.MediaSessionCompatResultReceiverWrapper = i;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = z;
        this.PlaybackStateCompatCustomAction = i2;
        this.MediaSessionCompatToken = i3;
    }

    public final ParagraphIntrinsics IconCompatParcelizer(LayoutDirection layoutDirection) {
        ParagraphIntrinsics ParagraphIntrinsics = this.PlaybackStateCompat;
        if (ParagraphIntrinsics == null || layoutDirection != this.MediaSessionCompatQueueItem || ParagraphIntrinsics.getHasStaleResolvedFonts()) {
            this.MediaSessionCompatQueueItem = layoutDirection;
            String str = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            TextStyle textStyleResolveDefaults = TextStyleKt.resolveDefaults(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, layoutDirection);
            Density density = this.serializer;
            density.getClass();
            FontFamily.Resolver resolver = this.IconCompatParcelizer;
            instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
            ParagraphIntrinsics = ParagraphIntrinsicsKt.ParagraphIntrinsics(str, textStyleResolveDefaults, instance_delegatelambda0Var, density, resolver, instance_delegatelambda0Var);
        }
        this.PlaybackStateCompat = ParagraphIntrinsics;
        return ParagraphIntrinsics;
    }

    public final void serializer(Density density) {
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
            this.MediaMetadataCompat = jM104constructorimpl;
        } else if (density == null || this.MediaMetadataCompat != jM104constructorimpl) {
            this.serializer = density;
            this.MediaMetadataCompat = jM104constructorimpl;
            this.RatingCompat = (this.RatingCompat << 2) | 1;
            markDirty();
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        if (this.ParcelableVolumeInfo != null) {
            str = "<paragraph>";
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", lastDensity=");
        sb.append((Object) InlineDensity.m105toStringimpl(this.MediaMetadataCompat));
        sb.append(", history=");
        return c8$$ExternalSyntheticOutline0.m(this.RatingCompat, ", constraints=$)", sb);
    }

    /* JADX INFO: renamed from: layoutWithConstraints-K40F9xA, reason: not valid java name */
    public final boolean m108layoutWithConstraintsK40F9xA(long j, LayoutDirection layoutDirection) {
        ParagraphIntrinsics paragraphIntrinsics;
        this.RatingCompat = (this.RatingCompat << 2) | 3;
        boolean z = true;
        if (this.MediaSessionCompatToken > 1) {
            j = RemoteActionCompatParcelizer(this, j, layoutDirection);
        }
        Paragraph paragraph = this.ParcelableVolumeInfo;
        boolean z2 = false;
        if (paragraph != null && (paragraphIntrinsics = this.PlaybackStateCompat) != null && !paragraphIntrinsics.getHasStaleResolvedFonts() && layoutDirection == this.MediaSessionCompatQueueItem && (Constraints.m3619equalsimpl0(j, this.ComponentActivity) || (Constraints.m3626getMaxWidthimpl(j) == Constraints.m3626getMaxWidthimpl(this.ComponentActivity) && Constraints.m3628getMinWidthimpl(j) == Constraints.m3628getMinWidthimpl(this.ComponentActivity) && Constraints.m3625getMaxHeightimpl(j) >= paragraph.getHeight() && !paragraph.getDidExceedMaxLines()))) {
            if (!Constraints.m3619equalsimpl0(j, this.ComponentActivity)) {
                Paragraph paragraph2 = this.ParcelableVolumeInfo;
                paragraph2.getClass();
                long jM3640constrain4WqzIAM = ConstraintsKt.m3640constrain4WqzIAM(j, IntSize.m3839constructorimpl((((long) TextDelegateKt.ceilToIntPx(Math.min(paragraph2.getMaxIntrinsicWidth(), paragraph2.getWidth()))) << 32) | (((long) TextDelegateKt.ceilToIntPx(paragraph2.getHeight())) & 4294967295L)));
                this.MediaBrowserCompatMediaItem = jM3640constrain4WqzIAM;
                if (TextOverflow.m3559equalsimpl0(this.MediaSessionCompatResultReceiverWrapper, TextOverflow.Companion.m3572getVisiblegIe3tQ8()) || (((int) (jM3640constrain4WqzIAM >> 32)) >= paragraph2.getWidth() && ((int) (4294967295L & jM3640constrain4WqzIAM)) >= paragraph2.getHeight())) {
                    z = false;
                }
                this.write = z;
                this.ComponentActivity = j;
            }
            return false;
        }
        ParagraphIntrinsics paragraphIntrinsicsIconCompatParcelizer = IconCompatParcelizer(layoutDirection);
        long jRemoteActionCompatParcelizer = getFqName.RemoteActionCompatParcelizer(j, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, this.MediaSessionCompatResultReceiverWrapper, paragraphIntrinsicsIconCompatParcelizer.getMaxIntrinsicWidth());
        boolean z3 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        int i = this.MediaSessionCompatResultReceiverWrapper;
        int i2 = this.PlaybackStateCompatCustomAction;
        if ((!z3 && getFqName.write(i)) || i2 < 1) {
            i2 = 1;
        }
        Paragraph paragraphM2933ParagraphczeNHc = ParagraphKt.m2933ParagraphczeNHc(paragraphIntrinsicsIconCompatParcelizer, jRemoteActionCompatParcelizer, i2, this.MediaSessionCompatResultReceiverWrapper);
        this.ComponentActivity = j;
        long jM3640constrain4WqzIAM2 = ConstraintsKt.m3640constrain4WqzIAM(j, IntSize.m3839constructorimpl((((long) TextDelegateKt.ceilToIntPx(paragraphM2933ParagraphczeNHc.getWidth())) << 32) | (((long) TextDelegateKt.ceilToIntPx(paragraphM2933ParagraphczeNHc.getHeight())) & 4294967295L)));
        this.MediaBrowserCompatMediaItem = jM3640constrain4WqzIAM2;
        if (!TextOverflow.m3559equalsimpl0(this.MediaSessionCompatResultReceiverWrapper, TextOverflow.Companion.m3572getVisiblegIe3tQ8()) && (((int) (jM3640constrain4WqzIAM2 >> 32)) < paragraphM2933ParagraphczeNHc.getWidth() || ((int) (jM3640constrain4WqzIAM2 & 4294967295L)) < paragraphM2933ParagraphczeNHc.getHeight())) {
            z2 = true;
        }
        this.write = z2;
        this.ParcelableVolumeInfo = paragraphM2933ParagraphczeNHc;
        return true;
    }
}
