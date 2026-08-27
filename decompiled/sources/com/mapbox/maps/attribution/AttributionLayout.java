package com.mapbox.maps.attribution;

import android.graphics.Bitmap;
import android.graphics.PointF;
import o.IconCompatParcelizer;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class AttributionLayout {
    private final PointF anchorPoint;
    private final boolean isShortText;
    private final Bitmap logo;

    public final Bitmap component1() {
        return this.logo;
    }

    public final PointF component2() {
        return this.anchorPoint;
    }

    public final boolean component3() {
        return this.isShortText;
    }

    public final PointF getAnchorPoint() {
        return this.anchorPoint;
    }

    public final Bitmap getLogo() {
        return this.logo;
    }

    public final boolean isShortText() {
        return this.isShortText;
    }

    public final AttributionLayout copy(Bitmap bitmap, PointF pointF, boolean z) {
        return new AttributionLayout(bitmap, pointF, z);
    }

    public AttributionLayout(Bitmap bitmap, PointF pointF, boolean z) {
        this.logo = bitmap;
        this.anchorPoint = pointF;
        this.isShortText = z;
    }

    public static /* synthetic */ AttributionLayout copy$default(AttributionLayout attributionLayout, Bitmap bitmap, PointF pointF, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            bitmap = attributionLayout.logo;
        }
        if ((i & 2) != 0) {
            pointF = attributionLayout.anchorPoint;
        }
        if ((i & 4) != 0) {
            z = attributionLayout.isShortText;
        }
        return attributionLayout.copy(bitmap, pointF, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttributionLayout)) {
            return false;
        }
        AttributionLayout attributionLayout = (AttributionLayout) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.logo, attributionLayout.logo}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.anchorPoint, attributionLayout.anchorPoint}, getCieXyz.write())).booleanValue() && this.isShortText == attributionLayout.isShortText;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AttributionLayout(logo=");
        sb.append(this.logo);
        sb.append(", anchorPoint=");
        sb.append(this.anchorPoint);
        sb.append(", isShortText=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.isShortText, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        Bitmap bitmap = this.logo;
        int iHashCode = bitmap == null ? 0 : bitmap.hashCode();
        PointF pointF = this.anchorPoint;
        int iHashCode2 = pointF != null ? pointF.hashCode() : 0;
        boolean z = this.isShortText;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + r2;
    }
}
