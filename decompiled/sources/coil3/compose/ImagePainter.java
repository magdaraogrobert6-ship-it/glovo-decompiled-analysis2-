package coil3.compose;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import bo.app.c8$$ExternalSyntheticOutline0;
import o.accessrewindjd;

/* JADX INFO: loaded from: classes.dex */
public final class ImagePainter extends Painter {
    public final accessrewindjd read;

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public final long mo1424getIntrinsicSizeNHjbRc() {
        accessrewindjd accessrewindjdVar = this.read;
        int iRemoteActionCompatParcelizer = accessrewindjdVar.RemoteActionCompatParcelizer();
        float f = iRemoteActionCompatParcelizer > 0 ? iRemoteActionCompatParcelizer : Float.NaN;
        int iIconCompatParcelizer = accessrewindjdVar.IconCompatParcelizer();
        return Size.m537constructorimpl((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(iIconCompatParcelizer > 0 ? iIconCompatParcelizer : Float.NaN)) & 4294967295L));
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        accessrewindjd accessrewindjdVar = this.read;
        int iRemoteActionCompatParcelizer = accessrewindjdVar.RemoteActionCompatParcelizer();
        float fIntBitsToFloat = iRemoteActionCompatParcelizer > 0 ? Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() >> 32)) / iRemoteActionCompatParcelizer : 1.0f;
        int iIconCompatParcelizer = accessrewindjdVar.IconCompatParcelizer();
        float fIntBitsToFloat2 = iIconCompatParcelizer > 0 ? Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() & 4294967295L)) / iIconCompatParcelizer : 1.0f;
        long jM493getZeroF1C5BW0 = Offset.Companion.m493getZeroF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo1232scale0AR0LA0(fIntBitsToFloat, fIntBitsToFloat2, jM493getZeroF1C5BW0);
            accessrewindjdVar.IconCompatParcelizer(AndroidCanvas_androidKt.getNativeCanvas(drawScope.getDrawContext().getCanvas()));
        } finally {
            c8$$ExternalSyntheticOutline0.m(drawContext, jMo1225getSizeNHjbRc);
        }
    }

    public ImagePainter(accessrewindjd accessrewindjdVar) {
        this.read = accessrewindjdVar;
    }
}
