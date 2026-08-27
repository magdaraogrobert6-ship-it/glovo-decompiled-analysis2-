package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbsoluteAlignment implements androidx.compose.ui.graphics.Shape, androidx.compose.ui.graphics.Interpolatable {
    public final SourceInformationKt IconCompatParcelizer;
    public final SourceInformationKt RemoteActionCompatParcelizer;
    public final SourceInformationKt serializer;
    public final SourceInformationKt write;

    public AbsoluteAlignment(SourceInformationKt sourceInformationKt, SourceInformationKt sourceInformationKt2, SourceInformationKt sourceInformationKt3, SourceInformationKt sourceInformationKt4) {
        this.serializer = sourceInformationKt;
        this.write = sourceInformationKt2;
        this.IconCompatParcelizer = sourceInformationKt3;
        this.RemoteActionCompatParcelizer = sourceInformationKt4;
    }

    public static getTopLeftannotations IconCompatParcelizer(AbsoluteAlignment absoluteAlignment, SourceInformationKt sourceInformationKt, SourceInformationKt sourceInformationKt2, SourceInformationKt sourceInformationKt3, SourceInformationKt sourceInformationKt4, int i) {
        if ((i & 1) != 0) {
            sourceInformationKt = absoluteAlignment.serializer;
        }
        if ((i & 2) != 0) {
            sourceInformationKt2 = absoluteAlignment.write;
        }
        if ((i & 4) != 0) {
            sourceInformationKt3 = absoluteAlignment.IconCompatParcelizer;
        }
        if ((i & 8) != 0) {
            sourceInformationKt4 = absoluteAlignment.RemoteActionCompatParcelizer;
        }
        ((getTopLeftannotations) absoluteAlignment).getClass();
        return new getTopLeftannotations(sourceInformationKt, sourceInformationKt2, sourceInformationKt3, sourceInformationKt4);
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public final androidx.compose.ui.graphics.Outline mo24createOutlinePq9zytI(long j, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.unit.Density density) {
        float fIconCompatParcelizer = this.serializer.IconCompatParcelizer(j, density);
        float fIconCompatParcelizer2 = this.write.IconCompatParcelizer(j, density);
        float fIconCompatParcelizer3 = this.IconCompatParcelizer.IconCompatParcelizer(j, density);
        float fIconCompatParcelizer4 = this.RemoteActionCompatParcelizer.IconCompatParcelizer(j, density);
        float fM545getMinDimensionimpl = androidx.compose.ui.geometry.Size.m545getMinDimensionimpl(j);
        float f = fIconCompatParcelizer + fIconCompatParcelizer4;
        if (f > fM545getMinDimensionimpl) {
            float f2 = fM545getMinDimensionimpl / f;
            fIconCompatParcelizer *= f2;
            fIconCompatParcelizer4 *= f2;
        }
        float f3 = fIconCompatParcelizer2 + fIconCompatParcelizer3;
        if (f3 > fM545getMinDimensionimpl) {
            float f4 = fM545getMinDimensionimpl / f3;
            fIconCompatParcelizer2 *= f4;
            fIconCompatParcelizer3 *= f4;
        }
        if (fIconCompatParcelizer < 0.0f || fIconCompatParcelizer2 < 0.0f || fIconCompatParcelizer3 < 0.0f || fIconCompatParcelizer4 < 0.0f) {
            TriStateCheckbox.read("Corner size in Px can't be negative(topStart = " + fIconCompatParcelizer + ", topEnd = " + fIconCompatParcelizer2 + ", bottomEnd = " + fIconCompatParcelizer3 + ", bottomStart = " + fIconCompatParcelizer4 + ")!");
        }
        if (fIconCompatParcelizer + fIconCompatParcelizer2 + fIconCompatParcelizer3 + fIconCompatParcelizer4 == 0.0f) {
            return new androidx.compose.ui.graphics.Outline.Rectangle(androidx.compose.ui.geometry.SizeKt.m567toRectuvyYCjk(j));
        }
        androidx.compose.ui.geometry.Rect rectM567toRectuvyYCjk = androidx.compose.ui.geometry.SizeKt.m567toRectuvyYCjk(j);
        androidx.compose.ui.unit.LayoutDirection layoutDirection2 = androidx.compose.ui.unit.LayoutDirection.Ltr;
        float f5 = layoutDirection == layoutDirection2 ? fIconCompatParcelizer : fIconCompatParcelizer2;
        long jM431constructorimpl = androidx.compose.ui.geometry.CornerRadius.m431constructorimpl((((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L));
        if (layoutDirection == layoutDirection2) {
            fIconCompatParcelizer = fIconCompatParcelizer2;
        }
        long jM431constructorimpl2 = androidx.compose.ui.geometry.CornerRadius.m431constructorimpl((((long) Float.floatToRawIntBits(fIconCompatParcelizer)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIconCompatParcelizer)) << 32));
        float f6 = layoutDirection == layoutDirection2 ? fIconCompatParcelizer3 : fIconCompatParcelizer4;
        long jM431constructorimpl3 = androidx.compose.ui.geometry.CornerRadius.m431constructorimpl((((long) Float.floatToRawIntBits(f6)) & 4294967295L) | (((long) Float.floatToRawIntBits(f6)) << 32));
        if (layoutDirection != layoutDirection2) {
            fIconCompatParcelizer4 = fIconCompatParcelizer3;
        }
        return new androidx.compose.ui.graphics.Outline.Rounded(androidx.compose.ui.geometry.RoundRectKt.m529RoundRectZAM2FJo(rectM567toRectuvyYCjk, jM431constructorimpl, jM431constructorimpl2, jM431constructorimpl3, androidx.compose.ui.geometry.CornerRadius.m431constructorimpl((((long) Float.floatToRawIntBits(fIconCompatParcelizer4)) << 32) | (((long) Float.floatToRawIntBits(fIconCompatParcelizer4)) & 4294967295L))));
    }
}
