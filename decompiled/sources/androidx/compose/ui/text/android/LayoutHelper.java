package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextUtils;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import o.IconCompatParcelizer;
import o.hideCurrentlyDisplayingInAppMessage;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutHelper {
    public static final int $stable = 8;
    private final boolean[] bidiProcessedParagraphs;
    private final Layout layout;
    private final List<Bidi> paragraphBidi;
    private final int paragraphCount;
    private final List<Integer> paragraphEnds;
    private char[] tmpBuffer;

    public static final class BidiRun {
        public static final int $stable = 0;
        private final int end;
        private final boolean isRtl;
        private final int start;

        public final int component1() {
            return this.start;
        }

        public final int component2() {
            return this.end;
        }

        public final boolean component3() {
            return this.isRtl;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public final boolean isRtl() {
            return this.isRtl;
        }

        public final BidiRun copy(int i, int i2, boolean z) {
            return new BidiRun(i, i2, z);
        }

        public int hashCode() {
            return Boolean.hashCode(this.isRtl) + af$$ExternalSyntheticOutline0.m(this.end, Integer.hashCode(this.start) * 31, 31);
        }

        public BidiRun(int i, int i2, boolean z) {
            this.start = i;
            this.end = i2;
            this.isRtl = z;
        }

        public static /* synthetic */ BidiRun copy$default(BidiRun bidiRun, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = bidiRun.start;
            }
            if ((i3 & 2) != 0) {
                i2 = bidiRun.end;
            }
            if ((i3 & 4) != 0) {
                z = bidiRun.isRtl;
            }
            return bidiRun.copy(i, i2, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BidiRun)) {
                return false;
            }
            BidiRun bidiRun = (BidiRun) obj;
            return this.start == bidiRun.start && this.end == bidiRun.end && this.isRtl == bidiRun.isRtl;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BidiRun(start=");
            sb.append(this.start);
            sb.append(", end=");
            sb.append(this.end);
            sb.append(", isRtl=");
            return IconCompatParcelizer.IconCompatParcelizer(sb, this.isRtl, ')');
        }
    }

    public final Layout getLayout() {
        return this.layout;
    }

    public final int getParagraphCount() {
        return this.paragraphCount;
    }

    private final float getDownstreamHorizontal(int i, boolean z) {
        int lineEnd = this.layout.getLineEnd(this.layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        Layout layout = this.layout;
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    private final int lineEndToVisibleEnd(int i, int i2) {
        while (i > i2 && isLineEndSpace(this.layout.getText().charAt(i - 1))) {
            i--;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    public final Bidi analyzeBidi(int i) {
        Bidi bidi;
        if (this.bidiProcessedParagraphs[i]) {
            return this.paragraphBidi.get(i);
        }
        int iIntValue = i == 0 ? 0 : this.paragraphEnds.get(i - 1).intValue();
        int iIntValue2 = this.paragraphEnds.get(i).intValue();
        int i2 = iIntValue2 - iIntValue;
        char[] cArr = this.tmpBuffer;
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(this.layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i2)) {
            bidi = new Bidi(cArr2, 0, null, 0, i2, isRtlParagraph(i) ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        this.paragraphBidi.set(i, bidi);
        this.bidiProcessedParagraphs[i] = true;
        if (bidi != null) {
            char[] cArr3 = this.tmpBuffer;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.tmpBuffer = cArr2;
        return bidi;
    }

    public final BidiRun[] getLineBidiRuns$ui_text(int i) {
        Bidi bidiCreateLineBidi;
        int lineStart = this.layout.getLineStart(i);
        int lineEnd = this.layout.getLineEnd(i);
        int paragraphForOffset$default = getParagraphForOffset$default(this, lineStart, false, 2, null);
        int paragraphStart = getParagraphStart(paragraphForOffset$default);
        Bidi bidiAnalyzeBidi = analyzeBidi(paragraphForOffset$default);
        if (bidiAnalyzeBidi == null || (bidiCreateLineBidi = bidiAnalyzeBidi.createLineBidi(lineStart - paragraphStart, lineEnd - paragraphStart)) == null) {
            return new BidiRun[]{new BidiRun(lineStart, lineEnd, this.layout.isRtlCharAt(lineStart))};
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        BidiRun[] bidiRunArr = new BidiRun[runCount];
        for (int i2 = 0; i2 < runCount; i2++) {
            int runStart = bidiCreateLineBidi.getRunStart(i2);
            int runLimit = bidiCreateLineBidi.getRunLimit(i2);
            boolean z = true;
            if (bidiCreateLineBidi.getRunLevel(i2) % 2 != 1) {
                z = false;
            }
            bidiRunArr[i2] = new BidiRun(runStart + lineStart, runLimit + lineStart, z);
        }
        return bidiRunArr;
    }

    public final int getLineVisibleEnd(int i) {
        return lineEndToVisibleEnd(this.layout.getLineEnd(i), this.layout.getLineStart(i));
    }

    public final int getParagraphEnd(int i) {
        return this.paragraphEnds.get(i).intValue();
    }

    public final boolean isRtlParagraph(int i) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(getParagraphStart(i))) == -1;
    }

    public LayoutHelper(Layout layout) {
        this.layout = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iWrite = hideCurrentlyDisplayingInAppMessage.write(this.layout.getText(), '\n', length, false, 4);
            length = iWrite < 0 ? this.layout.getText().length() : iWrite + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.layout.getText().length());
        this.paragraphEnds = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.paragraphBidi = arrayList2;
        this.bidiProcessedParagraphs = new boolean[this.paragraphEnds.size()];
        this.paragraphCount = this.paragraphEnds.size();
    }

    public final int getParagraphStart(int i) {
        if (i == 0) {
            return 0;
        }
        return this.paragraphEnds.get(i - 1).intValue();
    }

    public static /* synthetic */ int getParagraphForOffset$default(LayoutHelper layoutHelper, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return layoutHelper.getParagraphForOffset(i, z);
    }

    public final int getParagraphForOffset(int i, boolean z) {
        int iSerializer = SQLite.serializer(this.paragraphEnds, Integer.valueOf(i));
        int i2 = iSerializer < 0 ? -(iSerializer + 1) : iSerializer + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == this.paragraphEnds.get(i3).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public final float getHorizontalPosition(int i, boolean z, boolean z2) {
        int iLineEndToVisibleEnd = i;
        if (!z2) {
            return getDownstreamHorizontal(i, z);
        }
        int lineForOffset = LayoutCompat_androidKt.getLineForOffset(this.layout, iLineEndToVisibleEnd, z2);
        int lineStart = this.layout.getLineStart(lineForOffset);
        int lineEnd = this.layout.getLineEnd(lineForOffset);
        if (iLineEndToVisibleEnd != lineStart && iLineEndToVisibleEnd != lineEnd) {
            return getDownstreamHorizontal(i, z);
        }
        if (iLineEndToVisibleEnd != 0 && iLineEndToVisibleEnd != this.layout.getText().length()) {
            int paragraphForOffset = getParagraphForOffset(iLineEndToVisibleEnd, z2);
            boolean zIsRtlParagraph = isRtlParagraph(paragraphForOffset);
            int iLineEndToVisibleEnd2 = lineEndToVisibleEnd(lineEnd, lineStart);
            int paragraphStart = getParagraphStart(paragraphForOffset);
            Bidi bidiAnalyzeBidi = analyzeBidi(paragraphForOffset);
            Bidi bidiCreateLineBidi = bidiAnalyzeBidi != null ? bidiAnalyzeBidi.createLineBidi(lineStart - paragraphStart, iLineEndToVisibleEnd2 - paragraphStart) : null;
            boolean z3 = false;
            if (bidiCreateLineBidi != null && bidiCreateLineBidi.getRunCount() != 1) {
                int runCount = bidiCreateLineBidi.getRunCount();
                BidiRun[] bidiRunArr = new BidiRun[runCount];
                for (int i2 = 0; i2 < runCount; i2++) {
                    bidiRunArr[i2] = new BidiRun(bidiCreateLineBidi.getRunStart(i2) + lineStart, bidiCreateLineBidi.getRunLimit(i2) + lineStart, bidiCreateLineBidi.getRunLevel(i2) % 2 == 1);
                }
                int runCount2 = bidiCreateLineBidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i3 = 0; i3 < runCount2; i3++) {
                    bArr[i3] = (byte) bidiCreateLineBidi.getRunLevel(i3);
                }
                Bidi.reorderVisually(bArr, 0, bidiRunArr, 0, runCount);
                int i4 = -1;
                if (iLineEndToVisibleEnd == lineStart) {
                    for (int i5 = 0; i5 < runCount; i5++) {
                        if (bidiRunArr[i5].getStart() == iLineEndToVisibleEnd) {
                            i4 = i5;
                            break;
                        }
                    }
                    BidiRun bidiRun = bidiRunArr[i4];
                    if (z || zIsRtlParagraph == bidiRun.isRtl()) {
                        zIsRtlParagraph = !zIsRtlParagraph;
                    }
                    if (i4 == 0 && zIsRtlParagraph) {
                        return this.layout.getLineLeft(lineForOffset);
                    }
                    if (i4 == runCount - 1 && !zIsRtlParagraph) {
                        return this.layout.getLineRight(lineForOffset);
                    }
                    Layout layout = this.layout;
                    if (zIsRtlParagraph) {
                        return layout.getPrimaryHorizontal(bidiRunArr[i4 - 1].getStart());
                    }
                    return layout.getPrimaryHorizontal(bidiRunArr[i4 + 1].getStart());
                }
                if (iLineEndToVisibleEnd > iLineEndToVisibleEnd2) {
                    iLineEndToVisibleEnd = lineEndToVisibleEnd(iLineEndToVisibleEnd, lineStart);
                }
                for (int i6 = 0; i6 < runCount; i6++) {
                    if (bidiRunArr[i6].getEnd() == iLineEndToVisibleEnd) {
                        i4 = i6;
                        break;
                    }
                }
                BidiRun bidiRun2 = bidiRunArr[i4];
                if (!z && zIsRtlParagraph != bidiRun2.isRtl()) {
                    zIsRtlParagraph = !zIsRtlParagraph;
                }
                if (i4 == 0 && zIsRtlParagraph) {
                    return this.layout.getLineLeft(lineForOffset);
                }
                if (i4 == runCount - 1 && !zIsRtlParagraph) {
                    return this.layout.getLineRight(lineForOffset);
                }
                Layout layout2 = this.layout;
                if (zIsRtlParagraph) {
                    return layout2.getPrimaryHorizontal(bidiRunArr[i4 - 1].getEnd());
                }
                return layout2.getPrimaryHorizontal(bidiRunArr[i4 + 1].getEnd());
            }
            boolean zIsRtlCharAt = this.layout.isRtlCharAt(lineStart);
            if (z || zIsRtlParagraph == zIsRtlCharAt) {
                zIsRtlParagraph = !zIsRtlParagraph;
            }
            if (iLineEndToVisibleEnd == lineStart) {
                z3 = zIsRtlParagraph;
            } else if (!zIsRtlParagraph) {
                z3 = true;
            }
            Layout layout3 = this.layout;
            if (z3) {
                return layout3.getLineLeft(lineForOffset);
            }
            return layout3.getLineRight(lineForOffset);
        }
        return getDownstreamHorizontal(i, z);
    }

    public final boolean isLineEndSpace(char c) {
        if (c == ' ' || c == '\n' || c == 5760) {
            return true;
        }
        return (removeNodeAtDepth.serializer(c, 8192) >= 0 && removeNodeAtDepth.serializer(c, 8202) <= 0 && c != 8199) || c == 8287 || c == 12288;
    }
}
