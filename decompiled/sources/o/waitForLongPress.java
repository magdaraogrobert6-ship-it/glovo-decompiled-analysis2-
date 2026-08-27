package o;

/* JADX INFO: loaded from: classes.dex */
public final class waitForLongPress {
    public final float IconCompatParcelizer;
    public final float read;
    public final androidx.compose.ui.unit.Density write;

    public final isChangedToDowndefault write(float f) {
        float[] fArr = DraggableKtNoOpOnDragStarted1.IconCompatParcelizer;
        float f2 = this.IconCompatParcelizer * this.read;
        double d = DraggableKtNoOpOnDragStarted1.read(f, f2);
        double d2 = detectTapGesturesdefault.read;
        double d3 = d2 - 1.0d;
        return new isChangedToDowndefault(f, (float) (Math.exp((d2 / d3) * d) * ((double) f2)), (long) (Math.exp(d / d3) * 1000.0d));
    }

    public waitForLongPress(androidx.compose.ui.unit.Density density, float f) {
        this.IconCompatParcelizer = f;
        this.write = density;
        float density2 = density.getDensity();
        float f2 = detectTapGesturesdefault.read;
        this.read = density2 * 386.0878f * 160.0f * 0.84f;
    }
}
