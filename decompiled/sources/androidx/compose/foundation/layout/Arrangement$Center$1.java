package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class Arrangement$Center$1 implements Arrangement.Horizontal, Arrangement.Vertical {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final float write;

    public Arrangement$Center$1(int i) {
        this.RemoteActionCompatParcelizer = i;
        if (i == 1) {
            this.write = Dp.m3673constructorimpl(0.0f);
        } else if (i != 2) {
            this.write = Dp.m3673constructorimpl(0.0f);
        } else {
            this.write = Dp.m3673constructorimpl(0.0f);
        }
    }

    @Override // androidx.compose.foundation.layout.Arrangement.Horizontal, androidx.compose.foundation.layout.Arrangement.Vertical
    /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: not valid java name */
    public final float mo64getSpacingD9Ej5fM() {
        int i = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            return i != 1 ? this.write : this.write;
        }
        return this.write;
    }

    @Override // androidx.compose.foundation.layout.Arrangement.Horizontal
    public final void RemoteActionCompatParcelizer(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        int i2 = this.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.placeCenter$foundation_layout(i, iArr, iArr2, false);
                return;
            } else {
                Arrangement.placeCenter$foundation_layout(i, iArr, iArr2, true);
                return;
            }
        }
        if (i2 != 1) {
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.placeSpaceEvenly$foundation_layout(i, iArr, iArr2, false);
                return;
            } else {
                Arrangement.placeSpaceEvenly$foundation_layout(i, iArr, iArr2, true);
                return;
            }
        }
        if (layoutDirection == LayoutDirection.Ltr) {
            Arrangement.placeSpaceBetween$foundation_layout(i, iArr, iArr2, false);
        } else {
            Arrangement.placeSpaceBetween$foundation_layout(i, iArr, iArr2, true);
        }
    }

    public final String toString() {
        int i = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            return i != 1 ? "Arrangement#SpaceEvenly" : "Arrangement#SpaceBetween";
        }
        return "Arrangement#Center";
    }

    @Override // androidx.compose.foundation.layout.Arrangement.Vertical
    public final void read(Density density, int i, int[] iArr, int[] iArr2) {
        int i2 = this.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            Arrangement.placeCenter$foundation_layout(i, iArr, iArr2, false);
        } else if (i2 != 1) {
            Arrangement.placeSpaceEvenly$foundation_layout(i, iArr, iArr2, false);
        } else {
            Arrangement.placeSpaceBetween$foundation_layout(i, iArr, iArr2, false);
        }
    }
}
