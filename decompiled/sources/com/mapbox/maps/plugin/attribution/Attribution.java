package com.mapbox.maps.plugin.attribution;

import bo.app.ff$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class Attribution {
    public final String title;
    public final String url;

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        return this.url.hashCode() + (this.title.hashCode() * 31);
    }

    public Attribution(String str, String str2) {
        str.getClass();
        this.title = str;
        this.url = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Attribution)) {
            return false;
        }
        Attribution attribution = (Attribution) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, attribution.title}, getCieXyz.write())).booleanValue() && this.url.equals(attribution.url);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Attribution(title=");
        sb.append(this.title);
        sb.append(", url=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.url, ')');
    }
}
