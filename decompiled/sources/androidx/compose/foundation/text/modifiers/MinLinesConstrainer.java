package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import o.KeyedComposedModifier2;

/* JADX INFO: loaded from: classes.dex */
public final class MinLinesConstrainer {
    public static MinLinesConstrainer serializer;
    public final LayoutDirection IconCompatParcelizer;
    public final TextStyle MediaDescriptionCompat;
    public final FontFamily.Resolver RemoteActionCompatParcelizer;
    public final TextStyle read;
    public final Density write;
    public float MediaSessionCompatQueueItem = Float.NaN;
    public float MediaMetadataCompat = Float.NaN;

    public MinLinesConstrainer(LayoutDirection layoutDirection, TextStyle textStyle, Density density, FontFamily.Resolver resolver) {
        this.IconCompatParcelizer = layoutDirection;
        this.read = textStyle;
        this.write = density;
        this.RemoteActionCompatParcelizer = resolver;
        this.MediaDescriptionCompat = TextStyleKt.resolveDefaults(textStyle, layoutDirection);
    }

    /* JADX INFO: renamed from: coerceMinLines-Oh53vG4$foundation, reason: not valid java name */
    public final long m106coerceMinLinesOh53vG4$foundation(int i, long j) {
        int iM3627getMinHeightimpl;
        float f = this.MediaMetadataCompat;
        float f2 = this.MediaSessionCompatQueueItem;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = KeyedComposedModifier2.read;
            long jConstraints$default = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
            TextOverflow.Companion companion = TextOverflow.Companion;
            float height = ParagraphKt.m2930ParagraphUl8oQg4$default(str, this.MediaDescriptionCompat, jConstraints$default, this.write, this.RemoteActionCompatParcelizer, null, null, 1, companion.m3568getClipgIe3tQ8(), 96, null).getHeight();
            float height2 = ParagraphKt.m2930ParagraphUl8oQg4$default(KeyedComposedModifier2.RemoteActionCompatParcelizer, this.MediaDescriptionCompat, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), this.write, this.RemoteActionCompatParcelizer, null, null, 2, companion.m3568getClipgIe3tQ8(), 96, null).getHeight() - height;
            this.MediaMetadataCompat = height;
            this.MediaSessionCompatQueueItem = height2;
            f2 = height2;
            f = height;
        }
        if (i != 1) {
            iM3627getMinHeightimpl = Math.round((f2 * (i - 1)) + f);
            if (iM3627getMinHeightimpl < 0) {
                iM3627getMinHeightimpl = 0;
            }
            int iM3625getMaxHeightimpl = Constraints.m3625getMaxHeightimpl(j);
            if (iM3627getMinHeightimpl > iM3625getMaxHeightimpl) {
                iM3627getMinHeightimpl = iM3625getMaxHeightimpl;
            }
        } else {
            iM3627getMinHeightimpl = Constraints.m3627getMinHeightimpl(j);
        }
        return ConstraintsKt.Constraints(Constraints.m3628getMinWidthimpl(j), Constraints.m3626getMaxWidthimpl(j), iM3627getMinHeightimpl, Constraints.m3625getMaxHeightimpl(j));
    }
}
