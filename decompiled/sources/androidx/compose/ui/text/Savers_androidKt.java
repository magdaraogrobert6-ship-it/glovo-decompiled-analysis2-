package androidx.compose.ui.text;

import androidx.cardview.widget.CardView$1;
import androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda3;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.TextMotion;
import androidx.sqlite.SQLite;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.UiMediaScopeViewingDistance;
import o.getCieXyz;
import o.invalidateShadow;
import o.removeNodeAtDepth;
import o.setBlock;

/* JADX INFO: loaded from: classes.dex */
public final class Savers_androidKt {
    private static final invalidateShadow LineBreakSaver;
    private static final invalidateShadow PlatformParagraphStyleSaver;
    private static final invalidateShadow TextMotionLinearitySaver;
    private static final invalidateShadow TextMotionSaver;
    private static final invalidateShadow emojiSupportMatchSaver;

    public static final invalidateShadow getEmojiSupportMatchSaver() {
        return emojiSupportMatchSaver;
    }

    public static final invalidateShadow getSaver(PlatformParagraphStyle.Companion companion) {
        return PlatformParagraphStyleSaver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineBreak LineBreakSaver$lambda$1(Object obj) {
        obj.getClass();
        return LineBreak.m3409boximpl(LineBreak.m3410constructorimpl(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlatformParagraphStyle PlatformParagraphStyleSaver$lambda$1(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        Boolean bool = obj2 != null ? (Boolean) obj2 : null;
        bool.getClass();
        boolean zBooleanValue = bool.booleanValue();
        Object obj3 = list.get(1);
        invalidateShadow saver = getSaver(EmojiSupportMatch.Companion);
        EmojiSupportMatch emojiSupportMatch = ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj3, Boolean.FALSE}, getCieXyz.write())).booleanValue() || (saver instanceof NonNullValueClassSaver)) && obj3 != null) ? (EmojiSupportMatch) saver.restore(obj3) : null;
        emojiSupportMatch.getClass();
        return new PlatformParagraphStyle(emojiSupportMatch.m2902unboximpl(), zBooleanValue, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextMotion.Linearity TextMotionLinearitySaver$lambda$1(Object obj) {
        obj.getClass();
        return TextMotion.Linearity.m3546boximpl(TextMotion.Linearity.m3547constructorimpl(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextMotion TextMotionSaver$lambda$1(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        invalidateShadow saver = getSaver(TextMotion.Linearity.Companion);
        TextMotion.Linearity linearity = ((!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj2, Boolean.FALSE}, getCieXyz.write())).booleanValue() || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? (TextMotion.Linearity) saver.restore(obj2) : null;
        linearity.getClass();
        int iM3552unboximpl = linearity.m3552unboximpl();
        Object obj3 = list.get(1);
        Boolean bool = obj3 != null ? (Boolean) obj3 : null;
        bool.getClass();
        return new TextMotion(iM3552unboximpl, bool.booleanValue(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EmojiSupportMatch emojiSupportMatchSaver$lambda$1(Object obj) {
        obj.getClass();
        return EmojiSupportMatch.m2896boximpl(EmojiSupportMatch.m2897constructorimpl(((Integer) obj).intValue()));
    }

    public static final invalidateShadow getSaver(EmojiSupportMatch.Companion companion) {
        return emojiSupportMatchSaver;
    }

    static {
        int i = 5;
        PlatformParagraphStyleSaver = new CardView$1(new ScrollState$$ExternalSyntheticLambda3(16), i, new UiMediaScopeViewingDistance(21));
        emojiSupportMatchSaver = new CardView$1(new ScrollState$$ExternalSyntheticLambda3(17), i, new UiMediaScopeViewingDistance(22));
        LineBreakSaver = new CardView$1(new ScrollState$$ExternalSyntheticLambda3(18), i, new UiMediaScopeViewingDistance(23));
        TextMotionSaver = new CardView$1(new ScrollState$$ExternalSyntheticLambda3(19), i, new UiMediaScopeViewingDistance(24));
        TextMotionLinearitySaver = new CardView$1(new ScrollState$$ExternalSyntheticLambda3(20), i, new UiMediaScopeViewingDistance(25));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object TextMotionSaver$lambda$0(setBlock setblock, TextMotion textMotion) {
        return SQLite.write(SaversKt.save(TextMotion.Linearity.m3546boximpl(textMotion.m3545getLinearity4e0Vf04$ui_text()), getSaver(TextMotion.Linearity.Companion), setblock), SaversKt.save(Boolean.valueOf(textMotion.getSubpixelTextPositioning$ui_text())));
    }

    public static final invalidateShadow getSaver(LineBreak.Companion companion) {
        return LineBreakSaver;
    }

    public static final invalidateShadow getSaver(TextMotion.Companion companion) {
        return TextMotionSaver;
    }

    private static final invalidateShadow getSaver(TextMotion.Linearity.Companion companion) {
        return TextMotionLinearitySaver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object LineBreakSaver$lambda$0(setBlock setblock, LineBreak lineBreak) {
        return Integer.valueOf(lineBreak.m3421unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object PlatformParagraphStyleSaver$lambda$0(setBlock setblock, PlatformParagraphStyle platformParagraphStyle) {
        return SQLite.write(SaversKt.save(Boolean.valueOf(platformParagraphStyle.getIncludeFontPadding())), SaversKt.save(EmojiSupportMatch.m2896boximpl(platformParagraphStyle.m2978getEmojiSupportMatch_3YsG6Y()), getSaver(EmojiSupportMatch.Companion), setblock));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object TextMotionLinearitySaver$lambda$0(setBlock setblock, TextMotion.Linearity linearity) {
        return Integer.valueOf(linearity.m3552unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object emojiSupportMatchSaver$lambda$0(setBlock setblock, EmojiSupportMatch emojiSupportMatch) {
        return Integer.valueOf(emojiSupportMatch.m2902unboximpl());
    }
}
