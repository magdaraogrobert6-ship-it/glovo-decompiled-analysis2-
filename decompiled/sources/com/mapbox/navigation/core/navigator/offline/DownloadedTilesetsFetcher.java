package com.mapbox.navigation.core.navigator.offline;

import java.util.List;
import kotlinx.coroutines.DelayKt;
import kotlinx.serialization.Serializable;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.SweepGradientShader9KIMszodefault;
import o.getCieXyz;
import o.removeNodeAtDepth;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
public final class DownloadedTilesetsFetcher {

    /* JADX INFO: loaded from: classes5.dex */
    @Serializable
    public final class TilesetDescriptorMetadataResponse {
        public static final Companion Companion = new Companion();
        public final List resolved;

        public final class Companion {
            public final setGraphicModalMaxWidthDp serializer() {
                return DownloadedTilesetsFetcher$TilesetDescriptorMetadataResponse$$serializer.INSTANCE;
            }
        }

        public final int hashCode() {
            return this.resolved.hashCode();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TilesetDescriptorMetadataResponse)) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.resolved, ((TilesetDescriptorMetadataResponse) obj).resolved}, getCieXyz.write())).booleanValue();
        }

        public final String toString() {
            return SweepGradientShader9KIMszodefault.IconCompatParcelizer(new StringBuilder("TilesetDescriptorMetadataResponse(resolved="), this.resolved, ')');
        }

        public TilesetDescriptorMetadataResponse(int i, List list) {
            if (1 == (i & 1)) {
                this.resolved = list;
            } else {
                DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 1, DownloadedTilesetsFetcher$TilesetDescriptorMetadataResponse$$serializer.descriptor);
                throw null;
            }
        }
    }

    static {
        DelayKt.serializer(TilesetVersionsApi$json$1.INSTANCE$1);
    }
}
