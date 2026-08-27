package com.roadrunner.rrds.compose.component.tooltip;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda2;

/* JADX INFO: loaded from: classes3.dex */
public final class TooltipPositionProvider implements PopupPositionProvider {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    public final float IconCompatParcelizer;
    public final float RemoteActionCompatParcelizer;
    public final long read;
    public final Alignment serializer;
    public final TncContentKt$$ExternalSyntheticLambda2 write;

    public TooltipPositionProvider(Alignment alignment, long j, float f, float f2, TncContentKt$$ExternalSyntheticLambda2 tncContentKt$$ExternalSyntheticLambda2) {
        alignment.getClass();
        this.serializer = alignment;
        this.read = j;
        this.IconCompatParcelizer = f;
        this.RemoteActionCompatParcelizer = f2;
        this.write = tncContentKt$$ExternalSyntheticLambda2;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* JADX INFO: renamed from: calculatePosition-llwVHH4 */
    public final long mo134calculatePositionllwVHH4(IntRect intRect, long j, LayoutDirection layoutDirection, long j2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 15;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        intRect.getClass();
        layoutDirection.getClass();
        long jM3795constructorimpl = IntOffset.m3795constructorimpl(0L);
        IntSize.Companion companion = IntSize.Companion;
        long jMo139alignKFBX0sM = this.serializer.mo139alignKFBX0sM(companion.m3849getZeroYbymL2g(), IntSize.m3839constructorimpl((((long) intRect.getWidth()) << 32) | (((long) intRect.getHeight()) & 4294967295L)), layoutDirection);
        long jM3849getZeroYbymL2g = companion.m3849getZeroYbymL2g();
        int i4 = (int) (j2 >> 32);
        long jMo139alignKFBX0sM2 = this.serializer.mo139alignKFBX0sM(jM3849getZeroYbymL2g, IntSize.m3839constructorimpl((((long) ((int) (j2 & 4294967295L))) & 4294967295L) | (((long) i4) << 32)), layoutDirection);
        long jM3804minusqkQi6aY = IntOffset.m3804minusqkQi6aY(IntOffset.m3805plusqkQi6aY(IntOffset.m3805plusqkQi6aY(jM3795constructorimpl, IntOffset.m3795constructorimpl((((long) intRect.getLeft()) << 32) | (((long) intRect.getTop()) & 4294967295L))), jMo139alignKFBX0sM), IntOffset.m3795constructorimpl((((long) IntOffset.m3801getXimpl(jMo139alignKFBX0sM2)) << 32) | (((long) IntOffset.m3802getYimpl(jMo139alignKFBX0sM2)) & 4294967295L)));
        long j3 = this.read;
        long jM3805plusqkQi6aY = IntOffset.m3805plusqkQi6aY(jM3804minusqkQi6aY, IntOffset.m3795constructorimpl((((long) (IntOffset.m3801getXimpl(j3) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1))) << 32) | (((long) IntOffset.m3802getYimpl(j3)) & 4294967295L)));
        float f = this.IconCompatParcelizer;
        float f2 = this.RemoteActionCompatParcelizer;
        float f3 = f - f2;
        float f4 = (int) (j >> 32);
        float f5 = (f4 - f) - f2;
        int iM3801getXimpl = IntOffset.m3801getXimpl(IntSizeKt.m3850getCenterozmzZPI(j2));
        float f6 = 2.0f * f2;
        float f7 = iM3801getXimpl;
        TncContentKt$$ExternalSyntheticLambda2 tncContentKt$$ExternalSyntheticLambda2 = this.write;
        if (f7 <= f3 && f7 <= f5) {
            long jM3795constructorimpl2 = IntOffset.m3795constructorimpl((((long) (((int) f) - iM3801getXimpl)) << 32) | (((long) IntOffset.m3802getYimpl(jM3805plusqkQi6aY)) & 4294967295L));
            tncContentKt$$ExternalSyntheticLambda2.invoke(Float.valueOf(f7 - f2));
            return jM3795constructorimpl2;
        }
        if (i4 >= f4 - f6) {
            long jM3795constructorimpl3 = IntOffset.m3795constructorimpl((((long) IntOffset.m3802getYimpl(jM3805plusqkQi6aY)) & 4294967295L) | (((long) (IntOffset.m3801getXimpl(IntSizeKt.m3850getCenterozmzZPI(j)) - iM3801getXimpl)) << 32));
            tncContentKt$$ExternalSyntheticLambda2.invoke(Float.valueOf((f - IntOffset.m3801getXimpl(jM3795constructorimpl3)) - f2));
            return jM3795constructorimpl3;
        }
        if (f7 > f5) {
            int i5 = MediaBrowserCompatMediaItem + 85;
            MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            long jM3795constructorimpl4 = IntOffset.m3795constructorimpl((((long) ((int) f)) << 32) | (((long) IntOffset.m3802getYimpl(jM3805plusqkQi6aY)) & 4294967295L));
            tncContentKt$$ExternalSyntheticLambda2.invoke(Float.valueOf(((f7 - f5) + f7) - f6));
            return jM3795constructorimpl4;
        }
        if (f7 <= f3) {
            tncContentKt$$ExternalSyntheticLambda2.invoke(Float.valueOf(f));
            return jM3805plusqkQi6aY;
        }
        long jM3795constructorimpl5 = IntOffset.m3795constructorimpl(((long) IntOffset.m3802getYimpl(jM3805plusqkQi6aY)) & 4294967295L);
        tncContentKt$$ExternalSyntheticLambda2.invoke(Float.valueOf(f3));
        return jM3795constructorimpl5;
    }
}
