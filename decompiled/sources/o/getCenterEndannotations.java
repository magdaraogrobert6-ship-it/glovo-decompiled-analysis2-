package o;

import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class getCenterEndannotations implements androidx.compose.ui.layout.LayoutModifier {
    public final androidx.compose.ui.text.input.TransformedText IconCompatParcelizer;
    public final equals RemoteActionCompatParcelizer;
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 read;
    public final int serializer;

    public final int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(this.serializer, this.RemoteActionCompatParcelizer.hashCode() * 31, 31);
        return this.read.hashCode() + ((this.IconCompatParcelizer.hashCode() + iM) * 31);
    }

    public getCenterEndannotations(equals equalsVar, int i, androidx.compose.ui.text.input.TransformedText transformedText, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.RemoteActionCompatParcelizer = equalsVar;
        this.serializer = i;
        this.IconCompatParcelizer = transformedText;
        this.read = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getCenterEndannotations) {
            getCenterEndannotations getcenterendannotations = (getCenterEndannotations) obj;
            if (this.RemoteActionCompatParcelizer == getcenterendannotations.RemoteActionCompatParcelizer && this.serializer == getcenterendannotations.serializer && this.IconCompatParcelizer.equals(getcenterendannotations.IconCompatParcelizer)) {
                Object[] objArr = {this.read, getcenterendannotations.read};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo2235measure3p2s80s(final androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        final androidx.compose.ui.layout.Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(measurable.maxIntrinsicWidth(androidx.compose.ui.unit.Constraints.m3625getMaxHeightimpl(j)) < androidx.compose.ui.unit.Constraints.m3626getMaxWidthimpl(j) ? j : androidx.compose.ui.unit.Constraints.m3616copyZbe2FdA$default(j, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        final int iMin = Math.min(placeableMo2209measureBRTryo0.getWidth(), androidx.compose.ui.unit.Constraints.m3626getMaxWidthimpl(j));
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, iMin, placeableMo2209measureBRTryo0.getHeight(), null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.getCenterannotations
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj) {
                androidx.compose.ui.layout.Placeable.PlacementScope placementScope = (androidx.compose.ui.layout.Placeable.PlacementScope) obj;
                getCenterEndannotations getcenterendannotations = this.write;
                int i = getcenterendannotations.serializer;
                equals equalsVar = getcenterendannotations.RemoteActionCompatParcelizer;
                androidx.compose.ui.text.input.TransformedText transformedText = getcenterendannotations.IconCompatParcelizer;
                androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxy = (androidx.compose.foundation.text.TextLayoutResultProxy) getcenterendannotations.read.invoke();
                androidx.compose.ui.text.TextLayoutResult textLayoutResult = textLayoutResultProxy != null ? textLayoutResultProxy.RemoteActionCompatParcelizer : null;
                boolean z = measureScope.getLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Rtl;
                androidx.compose.ui.layout.Placeable placeable = placeableMo2209measureBRTryo0;
                equalsVar.serializer(SelectionHandleIcon.Horizontal, AlignmentVertical.read(placementScope, i, transformedText, textLayoutResult, z, placeable.getWidth()), iMin, placeable.getWidth());
                androidx.compose.ui.layout.Placeable.PlacementScope.placeRelative$default(placementScope, placeable, Math.round(-equalsVar.serializer()), 0, 0.0f, 4, null);
                return createFromParcel.INSTANCE;
            }
        }, 4, null);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.RemoteActionCompatParcelizer + ", cursorOffset=" + this.serializer + ", transformedText=" + this.IconCompatParcelizer + ", textLayoutResultProvider=" + this.read + ')';
    }
}
