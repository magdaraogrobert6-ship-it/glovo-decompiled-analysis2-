package com.mapbox.maps.plugin.annotation;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import java.util.List;
import o.MediaSessionCompatQueueItem;
import o.getCieXyz;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class ClusterOptions {
    public final List colorLevels;
    public final int textColor;
    public final boolean cluster = true;
    public final long clusterRadius = 30;
    public final double circleRadius = 25.0d;
    public final double textSize = 16.0d;
    public final long clusterMaxZoom = 14;
    public final long clusterMinPoints = 2;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClusterOptions)) {
            return false;
        }
        ClusterOptions clusterOptions = (ClusterOptions) obj;
        if (this.cluster != clusterOptions.cluster || this.clusterRadius != clusterOptions.clusterRadius || Double.compare(this.circleRadius, clusterOptions.circleRadius) != 0 || this.textColor != clusterOptions.textColor || Double.compare(this.textSize, clusterOptions.textSize) != 0 || this.clusterMaxZoom != clusterOptions.clusterMaxZoom || this.clusterMinPoints != clusterOptions.clusterMinPoints) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.colorLevels, clusterOptions.colorLevels}, getCieXyz.write())).booleanValue();
    }

    public ClusterOptions(int i, List list) {
        this.textColor = i;
        this.colorLevels = list;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClusterOptions(cluster=");
        sb.append(this.cluster);
        sb.append(", clusterRadius=");
        sb.append(this.clusterRadius);
        sb.append(", circleRadiusExpression=null, circleRadius=");
        sb.append(this.circleRadius);
        sb.append(", textColorExpression=null, textColor=");
        sb.append(this.textColor);
        sb.append(", textSizeExpression=null, textSize=");
        sb.append(this.textSize);
        sb.append(", textField=null, clusterMaxZoom=");
        sb.append(this.clusterMaxZoom);
        sb.append(", clusterMinPoints=");
        sb.append(this.clusterMinPoints);
        sb.append(", colorLevels=");
        return MediaSessionCompatQueueItem.read(sb, this.colorLevels, ", clusterProperties=null)");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public final int hashCode() {
        boolean z = this.cluster;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return c8$$ExternalSyntheticOutline0.m(this.colorLevels, d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.textSize, af$$ExternalSyntheticOutline0.m(this.textColor, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.circleRadius, d$$ExternalSyntheticOutline0.m(r0 * 31, 961, this.clusterRadius), 961), 961), 961), 31, this.clusterMaxZoom), 31, this.clusterMinPoints), 31);
    }
}
