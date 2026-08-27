package com.mapbox.navigation.ui.maps.route.line.api;

import bo.app.af$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class SourceIdAndDataId {
    public final int dataId;
    public final String sourceId;

    public final int hashCode() {
        return Integer.hashCode(this.dataId) + (this.sourceId.hashCode() * 31);
    }

    public SourceIdAndDataId(String str, int i) {
        str.getClass();
        this.sourceId = str;
        this.dataId = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourceIdAndDataId)) {
            return false;
        }
        SourceIdAndDataId sourceIdAndDataId = (SourceIdAndDataId) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sourceId, sourceIdAndDataId.sourceId}, getCieXyz.write())).booleanValue() && this.dataId == sourceIdAndDataId.dataId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SourceIdAndDataId(sourceId=");
        sb.append(this.sourceId);
        sb.append(", dataId=");
        return af$$ExternalSyntheticOutline0.m(sb, this.dataId, ')');
    }
}
