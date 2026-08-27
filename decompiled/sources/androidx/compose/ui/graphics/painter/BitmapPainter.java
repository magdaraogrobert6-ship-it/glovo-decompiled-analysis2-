package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class BitmapPainter extends Painter {
    public static final int $stable = 8;
    private float alpha;
    private ColorFilter colorFilter;
    private int filterQuality;
    private final ImageBitmap image;
    private final long size;
    private final long srcOffset;
    private final long srcSize;

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float f) {
        this.alpha = f;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    /* JADX INFO: renamed from: getFilterQuality-f-v9h1I$ui_graphics, reason: not valid java name */
    public final int m1423getFilterQualityfv9h1I$ui_graphics() {
        return this.filterQuality;
    }

    /* JADX INFO: renamed from: setFilterQuality-vDHp3xo$ui_graphics, reason: not valid java name */
    public final void m1425setFilterQualityvDHp3xo$ui_graphics(int i) {
        this.filterQuality = i;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public long mo1424getIntrinsicSizeNHjbRc() {
        return IntSizeKt.m3856toSizeozmzZPI(this.size);
    }

    public int hashCode() {
        int iHashCode = this.image.hashCode();
        int iM3803hashCodeimpl = IntOffset.m3803hashCodeimpl(this.srcOffset);
        return FilterQuality.m821hashCodeimpl(this.filterQuality) + ((IntSize.m3845hashCodeimpl(this.srcSize) + ((iM3803hashCodeimpl + (iHashCode * 31)) * 31)) * 31);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(DrawScope drawScope) {
        ImageBitmap imageBitmap = this.image;
        long j = this.srcOffset;
        long j2 = this.srcSize;
        int iRound = Math.round(Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() >> 32)));
        DrawScope.m1287drawImageAZ2fEMs$default(drawScope, imageBitmap, j, j2, 0L, IntSize.m3839constructorimpl((((long) Math.round(Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32)), this.alpha, null, this.colorFilter, 0, this.filterQuality, 328, null);
    }

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageBitmap, (i & 2) != 0 ? IntOffset.Companion.m3812getZeronOccac() : j, (i & 4) != 0 ? IntSize.m3839constructorimpl((((long) imageBitmap.getHeight()) & 4294967295L) | (((long) imageBitmap.getWidth()) << 32)) : j2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.image, bitmapPainter.image}, getCieXyz.write())).booleanValue() && IntOffset.m3800equalsimpl0(this.srcOffset, bitmapPainter.srcOffset) && IntSize.m3842equalsimpl0(this.srcSize, bitmapPainter.srcSize) && FilterQuality.m820equalsimpl0(this.filterQuality, bitmapPainter.filterQuality);
    }

    public String toString() {
        return "BitmapPainter(image=" + this.image + ", srcOffset=" + ((Object) IntOffset.m3808toStringimpl(this.srcOffset)) + ", srcSize=" + ((Object) IntSize.m3847toStringimpl(this.srcSize)) + ", filterQuality=" + ((Object) FilterQuality.m822toStringimpl(this.filterQuality)) + ')';
    }

    /* JADX INFO: renamed from: validateSize-N5eqBDc, reason: not valid java name */
    private final long m1422validateSizeN5eqBDc(long j, long j2) {
        int i;
        int i2;
        if (IntOffset.m3801getXimpl(j) >= 0 && IntOffset.m3802getYimpl(j) >= 0 && (i = (int) (j2 >> 32)) >= 0 && (i2 = (int) (4294967295L & j2)) >= 0 && i <= this.image.getWidth() && i2 <= this.image.getHeight()) {
            return j2;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Failed requirement.");
        return 0L;
    }

    private BitmapPainter(ImageBitmap imageBitmap, long j, long j2) {
        this.image = imageBitmap;
        this.srcOffset = j;
        this.srcSize = j2;
        this.filterQuality = FilterQuality.Companion.m825getLowfv9h1I();
        this.size = m1422validateSizeN5eqBDc(j, j2);
        this.alpha = 1.0f;
    }

    public /* synthetic */ BitmapPainter(ImageBitmap imageBitmap, long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageBitmap, j, j2);
    }
}
