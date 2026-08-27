package com.mapbox.navigation.core.navigator.offline;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.search.SearchOptionsKt$validateLimit$1;
import kotlinx.serialization.Serializable;
import o.getCieXyz;
import o.isAdapterPositionOnScreen;
import o.removeNodeAtDepth;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class DownloadedTileset {
    public static final Companion Companion = new Companion();
    public final String dataset;
    public final String domain;
    public final String version;

    public final class Companion {
        public final setGraphicModalMaxWidthDp serializer() {
            return DownloadedTileset$$serializer.INSTANCE;
        }
    }

    public final int hashCode() {
        String str = this.domain;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.version;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.dataset;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadedTileset)) {
            return false;
        }
        DownloadedTileset downloadedTileset = (DownloadedTileset) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.domain, downloadedTileset.domain}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.version, downloadedTileset.version}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.dataset, downloadedTileset.dataset}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadedTileset(domain=");
        sb.append(this.domain);
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", dataset=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.dataset, ')');
    }

    public DownloadedTileset(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.domain = null;
        } else {
            this.domain = str;
        }
        if ((i & 2) == 0) {
            this.version = null;
        } else {
            this.version = str2;
        }
        if ((i & 4) == 0) {
            this.dataset = null;
        } else {
            this.dataset = str3;
        }
        new isAdapterPositionOnScreen(new SearchOptionsKt$validateLimit$1(11, this));
    }
}
