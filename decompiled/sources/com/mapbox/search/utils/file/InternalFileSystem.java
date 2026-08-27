package com.mapbox.search.utils.file;

import android.os.Build;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import o.invokeOverPasshUlJWOEdefault;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes3.dex */
public final class InternalFileSystem implements PopupPositionProvider {
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 sdkVersionProvider;

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* JADX INFO: renamed from: calculatePosition-llwVHH4 */
    public long mo134calculatePositionllwVHH4(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        long jM3810unboximpl = ((IntOffset) this.sdkVersionProvider.invoke()).m3810unboximpl();
        int left = intRect.getLeft();
        int iRemoteActionCompatParcelizer = invokeOverPasshUlJWOEdefault.RemoteActionCompatParcelizer(IntOffset.m3801getXimpl(jM3810unboximpl) + left, (int) (j2 >> 32), (int) (j >> 32), layoutDirection == LayoutDirection.Ltr);
        int iRemoteActionCompatParcelizer2 = invokeOverPasshUlJWOEdefault.RemoteActionCompatParcelizer(IntOffset.m3802getYimpl(jM3810unboximpl) + intRect.getTop(), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true);
        return IntOffset.m3795constructorimpl((((long) iRemoteActionCompatParcelizer) << 32) | (((long) iRemoteActionCompatParcelizer2) & 4294967295L));
    }

    public InternalFileSystem() {
        this.sdkVersionProvider = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(0) { // from class: com.mapbox.search.utils.file.InternalFileSystem.1
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                return Integer.valueOf(Build.VERSION.SDK_INT);
            }
        };
    }

    public InternalFileSystem(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.sdkVersionProvider = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }
}
