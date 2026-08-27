package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface Paragraph {

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
    }

    /* JADX INFO: renamed from: fillBoundingBoxes-8ffj60Q */
    void mo2860fillBoundingBoxes8ffj60Q(long j, float[] fArr, int i);

    ResolvedTextDirection getBidiRunDirection(int i);

    Rect getBoundingBox(int i);

    Rect getCursorRect(int i);

    boolean getDidExceedMaxLines();

    float getFirstBaseline();

    float getHeight();

    float getHorizontalPosition(int i, boolean z);

    float getLastBaseline();

    float getLineBaseline(int i);

    float getLineBottom(int i);

    int getLineCount();

    int getLineEnd(int i, boolean z);

    int getLineForOffset(int i);

    int getLineForVerticalPosition(float f);

    float getLineHeight(int i);

    float getLineLeft(int i);

    float getLineRight(int i);

    int getLineStart(int i);

    float getLineTop(int i);

    float getLineWidth(int i);

    float getMaxIntrinsicWidth();

    float getMinIntrinsicWidth();

    /* JADX INFO: renamed from: getOffsetForPosition-k-4lQ0M */
    int mo2862getOffsetForPositionk4lQ0M(long j);

    ResolvedTextDirection getParagraphDirection(int i);

    Path getPathForRange(int i, int i2);

    List<Rect> getPlaceholderRects();

    /* JADX INFO: renamed from: getRangeForRect-8-6BmAI */
    long mo2864getRangeForRect86BmAI(Rect rect, int i, TextInclusionStrategy textInclusionStrategy);

    float getWidth();

    /* JADX INFO: renamed from: getWordBoundary--jx7JFs */
    long mo2865getWordBoundaryjx7JFs(int i);

    boolean isLineEllipsized(int i);

    /* JADX INFO: renamed from: paint-LG529CI */
    void mo2866paintLG529CI(Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i);

    /* JADX INFO: renamed from: paint-RPmYEkk */
    void mo2867paintRPmYEkk(Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration);

    /* JADX INFO: renamed from: paint-hn5TExg */
    void mo2868painthn5TExg(Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i);

    /* JADX INFO: renamed from: paint-LG529CI$default, reason: not valid java name */
    static /* synthetic */ void m2918paintLG529CI$default(Paragraph paragraph, Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i, int i2, Object obj) {
        if (obj == null) {
            paragraph.mo2866paintLG529CI(canvas, (i2 & 2) != 0 ? Color.Companion.m758getUnspecified0d7_KjU() : j, (i2 & 4) != 0 ? null : shadow, (i2 & 8) != 0 ? null : textDecoration, (i2 & 16) == 0 ? drawStyle : null, (i2 & 32) != 0 ? DrawScope.Companion.m1306getDefaultBlendMode0nO6VwU() : i);
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: paint-LG529CI");
        }
    }

    /* JADX INFO: renamed from: paint-RPmYEkk$default, reason: not valid java name */
    static /* synthetic */ void m2919paintRPmYEkk$default(Paragraph paragraph, Canvas canvas, long j, Shadow shadow, TextDecoration textDecoration, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                j = Color.Companion.m758getUnspecified0d7_KjU();
            }
            paragraph.mo2867paintRPmYEkk(canvas, j, (i & 4) != 0 ? null : shadow, (i & 8) != 0 ? null : textDecoration);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: paint-RPmYEkk");
    }

    static /* synthetic */ int getLineEnd$default(Paragraph paragraph, int i, boolean z, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                z = false;
            }
            return paragraph.getLineEnd(i, z);
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: getLineEnd");
        return 0;
    }

    /* JADX INFO: renamed from: paint-hn5TExg$default, reason: not valid java name */
    static /* synthetic */ void m2920painthn5TExg$default(Paragraph paragraph, Canvas canvas, Brush brush, float f, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i, int i2, Object obj) {
        if (obj == null) {
            paragraph.mo2868painthn5TExg(canvas, brush, (i2 & 4) != 0 ? Float.NaN : f, (i2 & 8) != 0 ? null : shadow, (i2 & 16) != 0 ? null : textDecoration, (i2 & 32) != 0 ? null : drawStyle, (i2 & 64) != 0 ? DrawScope.Companion.m1306getDefaultBlendMode0nO6VwU() : i);
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
        }
    }
}
