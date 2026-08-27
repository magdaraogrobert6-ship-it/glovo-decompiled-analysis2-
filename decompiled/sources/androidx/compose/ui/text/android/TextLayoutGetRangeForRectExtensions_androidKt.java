package androidx.compose.ui.text.android;

import android.graphics.RectF;
import android.text.Layout;
import androidx.compose.ui.text.android.selection.SegmentFinder;
import androidx.compose.ui.text.android.selection.SegmentFinder_androidKt;
import androidx.compose.ui.text.android.selection.WordSegmentFinder;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getPendingWebViewPauseRunnableandroid_sdk_ui_releaseannotations;
import o.onContentCardClicked;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
public final class TextLayoutGetRangeForRectExtensions_androidKt {
    private static final float getCharacterLeftBounds(int i, int i2, float[] fArr) {
        return fArr[(i - i2) * 2];
    }

    private static final int getStartOrEndOffsetForRectWithinLine(TextLayout textLayout, Layout layout, LayoutHelper layoutHelper, int i, RectF rectF, SegmentFinder segmentFinder, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, boolean z) {
        getPendingWebViewPauseRunnableandroid_sdk_ui_releaseannotations getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotations;
        float characterLeftBounds;
        float characterRightBounds;
        int endOffsetForRectWithinRun;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart != lineEnd) {
            float[] fArr = new float[(lineEnd - lineStart) * 2];
            textLayout.fillLineHorizontalBounds$ui_text(i, fArr);
            LayoutHelper.BidiRun[] lineBidiRuns$ui_text = layoutHelper.getLineBidiRuns$ui_text(i);
            int i2 = 1;
            if (z) {
                lineBidiRuns$ui_text.getClass();
                getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotations = new ensureSubscribedToInAppMessageEventslambda7(0, lineBidiRuns$ui_text.length - 1, 1);
            } else {
                getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotations = new getPendingWebViewPauseRunnableandroid_sdk_ui_releaseannotations(onContentCardClicked.MediaBrowserCompatMediaItem(lineBidiRuns$ui_text), 0, -1);
            }
            int i3 = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotations.write;
            int i4 = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotations.read;
            int i5 = getpendingwebviewpauserunnableandroid_sdk_ui_releaseannotations.serializer;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                int i6 = i3;
                while (true) {
                    LayoutHelper.BidiRun bidiRun = lineBidiRuns$ui_text[i6];
                    if (bidiRun.isRtl()) {
                        characterLeftBounds = getCharacterLeftBounds(bidiRun.getEnd() - i2, lineStart, fArr);
                    } else {
                        characterLeftBounds = getCharacterLeftBounds(bidiRun.getStart(), lineStart, fArr);
                    }
                    float f = characterLeftBounds;
                    if (bidiRun.isRtl()) {
                        characterRightBounds = getCharacterRightBounds(bidiRun.getStart(), lineStart, fArr);
                    } else {
                        characterRightBounds = getCharacterRightBounds(bidiRun.getEnd() - i2, lineStart, fArr);
                    }
                    float f2 = characterRightBounds;
                    if (z) {
                        endOffsetForRectWithinRun = getStartOffsetForRectWithinRun(bidiRun, rectF, lineStart, lineTop, lineBottom, f, f2, fArr, segmentFinder, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
                    } else {
                        endOffsetForRectWithinRun = getEndOffsetForRectWithinRun(bidiRun, rectF, lineStart, lineTop, lineBottom, f, f2, fArr, segmentFinder, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
                    }
                    if (endOffsetForRectWithinRun >= 0) {
                        return endOffsetForRectWithinRun;
                    }
                    if (i6 == i4) {
                        return -1;
                    }
                    i6 += i5;
                    i4 = i4;
                    i5 = i5;
                    i2 = i2;
                    lineBidiRuns$ui_text = lineBidiRuns$ui_text;
                }
            }
        }
        return -1;
    }

    private static final float getCharacterRightBounds(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    public static final int[] getRangeForRect(TextLayout textLayout, Layout layout, LayoutHelper layoutHelper, RectF rectF, int i, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        SegmentFinder segmentFinderCreateGraphemeClusterSegmentFinder;
        int i2;
        int i3;
        if (i == 1) {
            segmentFinderCreateGraphemeClusterSegmentFinder = new WordSegmentFinder(textLayout.getText(), textLayout.getWordIterator());
        } else {
            segmentFinderCreateGraphemeClusterSegmentFinder = SegmentFinder_androidKt.createGraphemeClusterSegmentFinder(textLayout.getText(), textLayout.getTextPaint());
        }
        SegmentFinder segmentFinder = segmentFinderCreateGraphemeClusterSegmentFinder;
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > textLayout.getLineBottom(lineForVertical) && (lineForVertical = lineForVertical + 1) >= textLayout.getLineCount()) {
            return null;
        }
        int i4 = lineForVertical;
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0 && rectF.bottom < textLayout.getLineTop(0)) {
            return null;
        }
        int startOrEndOffsetForRectWithinLine = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, i4, rectF, segmentFinder, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, true);
        while (true) {
            i2 = i4;
            i3 = startOrEndOffsetForRectWithinLine;
            if (i3 != -1 || i2 >= lineForVertical2) {
                break;
            }
            i4 = i2 + 1;
            startOrEndOffsetForRectWithinLine = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, i4, rectF, segmentFinder, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, true);
        }
        if (i3 == -1) {
            return null;
        }
        int startOrEndOffsetForRectWithinLine2 = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, lineForVertical2, rectF, segmentFinder, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, false);
        while (startOrEndOffsetForRectWithinLine2 == -1 && i2 < lineForVertical2) {
            lineForVertical2--;
            startOrEndOffsetForRectWithinLine2 = getStartOrEndOffsetForRectWithinLine(textLayout, layout, layoutHelper, lineForVertical2, rectF, segmentFinder, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, false);
        }
        if (startOrEndOffsetForRectWithinLine2 == -1) {
            return null;
        }
        return new int[]{segmentFinder.previousStartBoundary(i3 + 1), segmentFinder.nextEndBoundary(startOrEndOffsetForRectWithinLine2 - 1)};
    }

    private static final boolean horizontalOverlap(RectF rectF, float f, float f2) {
        return f2 >= rectF.left && f <= rectF.right;
    }

    private static final int getEndOffsetForRectWithinRun(LayoutHelper.BidiRun bidiRun, RectF rectF, int i, int i2, int i3, float f, float f2, float[] fArr, SegmentFinder segmentFinder, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        int end;
        int iNextEndBoundary;
        if (!horizontalOverlap(rectF, f, f2)) {
            return -1;
        }
        if ((bidiRun.isRtl() || rectF.right < f2) && (!bidiRun.isRtl() || rectF.left > f)) {
            int start = bidiRun.getStart();
            end = bidiRun.getEnd();
            while (end - start > 1) {
                int i4 = (end + start) / 2;
                float characterLeftBounds = getCharacterLeftBounds(i4, i, fArr);
                if ((bidiRun.isRtl() || characterLeftBounds <= rectF.right) && (!bidiRun.isRtl() || characterLeftBounds >= rectF.left)) {
                    start = i4;
                } else {
                    end = i4;
                }
            }
            if (!bidiRun.isRtl()) {
                end = start;
            }
        } else {
            end = bidiRun.getEnd() - 1;
        }
        int iPreviousStartBoundary = segmentFinder.previousStartBoundary(end + 1);
        if (iPreviousStartBoundary == -1 || (iNextEndBoundary = segmentFinder.nextEndBoundary(iPreviousStartBoundary)) <= bidiRun.getStart()) {
            return -1;
        }
        int start2 = bidiRun.getStart();
        if (iPreviousStartBoundary < start2) {
            iPreviousStartBoundary = start2;
        }
        int end2 = bidiRun.getEnd();
        if (iNextEndBoundary > end2) {
            iNextEndBoundary = end2;
        }
        RectF rectF2 = new RectF(0.0f, i2, 0.0f, i3);
        while (true) {
            rectF2.left = bidiRun.isRtl() ? getCharacterLeftBounds(iNextEndBoundary - 1, i, fArr) : getCharacterLeftBounds(iPreviousStartBoundary, i, fArr);
            rectF2.right = bidiRun.isRtl() ? getCharacterRightBounds(iPreviousStartBoundary, i, fArr) : getCharacterRightBounds(iNextEndBoundary - 1, i, fArr);
            if (((Boolean) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(rectF2, rectF)).booleanValue()) {
                return iNextEndBoundary;
            }
            iNextEndBoundary = segmentFinder.previousEndBoundary(iNextEndBoundary);
            if (iNextEndBoundary == -1 || iNextEndBoundary <= bidiRun.getStart()) {
                return -1;
            }
            iPreviousStartBoundary = segmentFinder.previousStartBoundary(iNextEndBoundary);
            int start3 = bidiRun.getStart();
            if (iPreviousStartBoundary < start3) {
                iPreviousStartBoundary = start3;
            }
        }
    }

    private static final int getStartOffsetForRectWithinRun(LayoutHelper.BidiRun bidiRun, RectF rectF, int i, int i2, int i3, float f, float f2, float[] fArr, SegmentFinder segmentFinder, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        int end;
        int iPreviousStartBoundary;
        if (!horizontalOverlap(rectF, f, f2)) {
            return -1;
        }
        if ((bidiRun.isRtl() || rectF.left > f) && (!bidiRun.isRtl() || rectF.right < f2)) {
            int start = bidiRun.getStart();
            end = bidiRun.getEnd();
            while (end - start > 1) {
                int i4 = (end + start) / 2;
                float characterLeftBounds = getCharacterLeftBounds(i4, i, fArr);
                if ((bidiRun.isRtl() || characterLeftBounds <= rectF.left) && (!bidiRun.isRtl() || characterLeftBounds >= rectF.right)) {
                    start = i4;
                } else {
                    end = i4;
                }
            }
            if (!bidiRun.isRtl()) {
                end = start;
            }
        } else {
            end = bidiRun.getStart();
        }
        int iNextEndBoundary = segmentFinder.nextEndBoundary(end);
        if (iNextEndBoundary == -1 || (iPreviousStartBoundary = segmentFinder.previousStartBoundary(iNextEndBoundary)) >= bidiRun.getEnd()) {
            return -1;
        }
        int start2 = bidiRun.getStart();
        if (iPreviousStartBoundary < start2) {
            iPreviousStartBoundary = start2;
        }
        int end2 = bidiRun.getEnd();
        if (iNextEndBoundary > end2) {
            iNextEndBoundary = end2;
        }
        RectF rectF2 = new RectF(0.0f, i2, 0.0f, i3);
        while (true) {
            rectF2.left = bidiRun.isRtl() ? getCharacterLeftBounds(iNextEndBoundary - 1, i, fArr) : getCharacterLeftBounds(iPreviousStartBoundary, i, fArr);
            rectF2.right = bidiRun.isRtl() ? getCharacterRightBounds(iPreviousStartBoundary, i, fArr) : getCharacterRightBounds(iNextEndBoundary - 1, i, fArr);
            if (((Boolean) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(rectF2, rectF)).booleanValue()) {
                return iPreviousStartBoundary;
            }
            iPreviousStartBoundary = segmentFinder.nextStartBoundary(iPreviousStartBoundary);
            if (iPreviousStartBoundary == -1 || iPreviousStartBoundary >= bidiRun.getEnd()) {
                return -1;
            }
            iNextEndBoundary = segmentFinder.nextEndBoundary(iPreviousStartBoundary);
            int end3 = bidiRun.getEnd();
            if (iNextEndBoundary > end3) {
                iNextEndBoundary = end3;
            }
        }
    }
}
