package androidx.compose.ui.text;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.util.ListUtilsKt;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.List;
import o.UiMediaScopeViewingDistance;
import o.onContentCardDismissed;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class MultiParagraphKt {
    public static final int findParagraphByIndex(List<ParagraphInfo> list, int i) {
        int i2;
        byte b;
        int endIndex = ((ParagraphInfo) onContentCardDismissed.MediaDescriptionCompat((List) list)).getEndIndex();
        if (i > ((ParagraphInfo) onContentCardDismissed.MediaDescriptionCompat((List) list)).getEndIndex()) {
            InlineClassHelperKt.throwIllegalArgumentException("Index " + i + " should be less or equal than last line's end " + endIndex);
        }
        int size = list.size() - 1;
        int i3 = 0;
        while (true) {
            if (i3 > size) {
                i2 = -(i3 + 1);
                break;
            }
            i2 = (i3 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i2);
            if (paragraphInfo.getStartIndex() > i) {
                b = 1;
            } else {
                b = paragraphInfo.getEndIndex() <= i ? (byte) -1 : (byte) 0;
            }
            if (b >= 0) {
                if (b <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i3 = i2 + 1;
            }
        }
        if (i2 < 0 || i2 >= list.size()) {
            StringBuilder sbM = ff$$ExternalSyntheticOutline0.m(i2, "Found paragraph index ", " should be in range [0, ");
            sbM.append(list.size());
            sbM.append(").\nDebug info: index=");
            sbM.append(i);
            sbM.append(", paragraphs=[");
            sbM.append(ListUtilsKt.fastJoinToString$default(list, null, null, null, 0, null, new UiMediaScopeViewingDistance(20), 31, null));
            sbM.append(']');
            InlineClassHelperKt.throwIllegalArgumentException(sbM.toString());
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence findParagraphByIndex$lambda$2$0(ParagraphInfo paragraphInfo) {
        return "[" + paragraphInfo.getStartIndex() + ", " + paragraphInfo.getEndIndex() + ')';
    }

    /* JADX INFO: renamed from: findParagraphsByRange-Sb-Bc2M, reason: not valid java name */
    public static final void m2917findParagraphsByRangeSbBc2M(List<ParagraphInfo> list, long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int size = list.size();
        for (int iFindParagraphByIndex = findParagraphByIndex(list, TextRange.m3074getMinimpl(j)); iFindParagraphByIndex < size; iFindParagraphByIndex++) {
            ParagraphInfo paragraphInfo = list.get(iFindParagraphByIndex);
            if (paragraphInfo.getStartIndex() >= TextRange.m3073getMaximpl(j)) {
                return;
            }
            if (paragraphInfo.getStartIndex() != paragraphInfo.getEndIndex()) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(paragraphInfo);
            }
        }
    }

    public static final int findParagraphByY(List<ParagraphInfo> list, float f) {
        byte b;
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((ParagraphInfo) onContentCardDismissed.MediaDescriptionCompat((List) list)).getBottom()) {
            return list.size() - 1;
        }
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i2);
            if (paragraphInfo.getTop() > f) {
                b = 1;
            } else {
                b = paragraphInfo.getBottom() <= f ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i = i2 + 1;
            } else {
                if (b <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    private static final <T> int fastBinarySearch(List<? extends T> list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            int iIntValue = ((Number) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(list.get(i2))).intValue();
            if (iIntValue < 0) {
                i = i2 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final int findParagraphByLineIndex(List<ParagraphInfo> list, int i) {
        byte b;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i3);
            if (paragraphInfo.getStartLineIndex() > i) {
                b = 1;
            } else {
                b = paragraphInfo.getEndLineIndex() <= i ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i2 = i3 + 1;
            } else {
                if (b <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }
}
