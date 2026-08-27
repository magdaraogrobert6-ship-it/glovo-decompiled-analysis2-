package o;

/* JADX INFO: loaded from: classes.dex */
public final class copy implements androidx.compose.ui.graphics.Shape {
    public final /* synthetic */ androidx.compose.ui.graphics.Path serializer;

    @Override // androidx.compose.ui.graphics.Shape
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public final androidx.compose.ui.graphics.Outline mo24createOutlinePq9zytI(long j, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.unit.Density density) {
        return new androidx.compose.ui.graphics.Outline.Generic(this.serializer);
    }

    public copy(androidx.compose.ui.graphics.Path path) {
        this.serializer = path;
    }
}
