package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextOverflow;

/* JADX INFO: loaded from: classes.dex */
public final class TextMeasurerKt {
    private static final int DefaultCacheSize = 8;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: isEllipsis-MW5-ApA, reason: not valid java name */
    public static final boolean m3054isEllipsisMW5ApA(int i) {
        TextOverflow.Companion companion = TextOverflow.Companion;
        return TextOverflow.m3559equalsimpl0(i, companion.m3569getEllipsisgIe3tQ8()) || TextOverflow.m3559equalsimpl0(i, companion.m3571getStartEllipsisgIe3tQ8()) || TextOverflow.m3559equalsimpl0(i, companion.m3570getMiddleEllipsisgIe3tQ8());
    }
}
