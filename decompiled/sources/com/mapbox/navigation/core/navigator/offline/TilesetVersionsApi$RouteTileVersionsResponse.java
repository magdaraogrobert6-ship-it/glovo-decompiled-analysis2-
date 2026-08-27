package com.mapbox.navigation.core.navigator.offline;

import java.util.List;
import java.util.Set;
import kotlinx.serialization.Serializable;
import o.ItemTouchHelperAdapter;
import o.getCieXyz;
import o.instance_delegatelambda0;
import o.removeNodeAtDepth;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class TilesetVersionsApi$RouteTileVersionsResponse {
    public static final Companion Companion = new Companion();
    public final List availableVersions;
    public final Set blockedVersions;

    public final class Companion {
        public final setGraphicModalMaxWidthDp serializer() {
            return TilesetVersionsApi$RouteTileVersionsResponse$$serializer.INSTANCE;
        }
    }

    public final int hashCode() {
        return this.blockedVersions.hashCode() + (this.availableVersions.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TilesetVersionsApi$RouteTileVersionsResponse)) {
            return false;
        }
        TilesetVersionsApi$RouteTileVersionsResponse tilesetVersionsApi$RouteTileVersionsResponse = (TilesetVersionsApi$RouteTileVersionsResponse) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.availableVersions, tilesetVersionsApi$RouteTileVersionsResponse.availableVersions}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.blockedVersions, tilesetVersionsApi$RouteTileVersionsResponse.blockedVersions}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "RouteTileVersionsResponse(availableVersions=" + this.availableVersions + ", blockedVersions=" + this.blockedVersions + ')';
    }

    public TilesetVersionsApi$RouteTileVersionsResponse(int i, List list, Set set) {
        this.availableVersions = (i & 1) == 0 ? instance_delegatelambda0.write : list;
        if ((i & 2) == 0) {
            this.blockedVersions = ItemTouchHelperAdapter.serializer;
        } else {
            this.blockedVersions = set;
        }
    }
}
