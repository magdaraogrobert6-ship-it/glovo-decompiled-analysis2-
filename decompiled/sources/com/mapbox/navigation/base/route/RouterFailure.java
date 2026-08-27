package com.mapbox.navigation.base.route;

import bo.app.af$$ExternalSyntheticOutline0;
import java.net.URL;
import o.IconCompatParcelizer;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RouterFailure {
    public final boolean isRetryable;
    public final String message;
    public final String routerOrigin;
    public final Throwable throwable;
    public final String type;
    public final URL url;

    public final int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.url.hashCode() * 31, 31, this.routerOrigin), 31, this.message), 31, this.type);
        Throwable th = this.throwable;
        return Boolean.hashCode(this.isRetryable) + ((iM + (th != null ? th.hashCode() : 0)) * 31);
    }

    public RouterFailure(URL url, String str, String str2, String str3, Throwable th, boolean z) {
        this.url = url;
        this.routerOrigin = str;
        this.message = str2;
        this.type = str3;
        this.throwable = th;
        this.isRetryable = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouterFailure(url=");
        sb.append(this.url);
        sb.append(", routerOrigin='");
        sb.append(this.routerOrigin);
        sb.append("', message='");
        sb.append(this.message);
        sb.append("', type='");
        sb.append(this.type);
        sb.append("', throwable=");
        sb.append(this.throwable);
        sb.append(", isRetryable=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.isRetryable, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RouterFailure.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RouterFailure routerFailure = (RouterFailure) obj;
        if (!this.url.equals(routerFailure.url) || !this.routerOrigin.equals(routerFailure.routerOrigin) || !this.message.equals(routerFailure.message) || !this.type.equals(routerFailure.type)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.throwable, routerFailure.throwable}, getCieXyz.write())).booleanValue() && this.isRetryable == routerFailure.isRetryable;
    }
}
