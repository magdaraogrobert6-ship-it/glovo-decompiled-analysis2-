package o;

/* JADX INFO: loaded from: classes.dex */
public final class positionChangeInternalwfG_k4k implements IndirectPointerInputDragCycleDetector {
    public final androidx.compose.animation.core.Transition IconCompatParcelizer;
    public androidx.compose.ui.Alignment read;
    public final onRemeasuredozmzZPI serializer;
    public final PopulateViewStructure_androidKtpopulate7 write = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(androidx.compose.ui.unit.IntSize.m3836boximpl(androidx.compose.ui.unit.IntSize.Companion.m3849getZeroYbymL2g()));

    @Override // o.paddingqDBjuR0default
    public final Object read() {
        return this.IconCompatParcelizer.IconCompatParcelizer().read();
    }

    @Override // o.paddingqDBjuR0default
    public final Object serializer() {
        return this.IconCompatParcelizer.IconCompatParcelizer().serializer();
    }

    public positionChangeInternalwfG_k4k(androidx.compose.animation.core.Transition transition, androidx.compose.ui.Alignment alignment) {
        this.IconCompatParcelizer = transition;
        this.read = alignment;
        long[] jArr = detectDragGestures.write;
        this.serializer = new onRemeasuredozmzZPI();
    }
}
