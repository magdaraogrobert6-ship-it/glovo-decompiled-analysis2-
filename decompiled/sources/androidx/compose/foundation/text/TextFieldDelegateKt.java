package androidx.compose.foundation.text;

import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import o.instance_delegatelambda0;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes.dex */
public abstract class TextFieldDelegateKt {
    public static final String read = setCarryoverInAppMessage.RemoteActionCompatParcelizer(10, "H");

    public static final long computeSizeForDefaultText(TextStyle textStyle, Density density, FontFamily.Resolver resolver, String str, int i) {
        Paragraph paragraphM2930ParagraphUl8oQg4$default = ParagraphKt.m2930ParagraphUl8oQg4$default(str, textStyle, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null), density, resolver, instance_delegatelambda0.write, null, i, TextOverflow.Companion.m3568getClipgIe3tQ8(), 64, null);
        return IntSize.m3839constructorimpl((((long) TextDelegateKt.ceilToIntPx(paragraphM2930ParagraphUl8oQg4$default.getMinIntrinsicWidth())) << 32) | (((long) TextDelegateKt.ceilToIntPx(paragraphM2930ParagraphUl8oQg4$default.getHeight())) & 4294967295L));
    }
}
