package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public final class formatDateNow {
    public final String IconCompatParcelizer;
    public final Integer RemoteActionCompatParcelizer;
    public final String serializer;

    public final int hashCode() {
        return d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m((this.RemoteActionCompatParcelizer.hashCode() + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 961, 961, false), 31, true)) * 31, 31, true), 31, this.IconCompatParcelizer), 961, false), 31, false);
    }

    public formatDateNow(String str, String str2, Integer num) {
        this.serializer = str;
        this.RemoteActionCompatParcelizer = num;
        this.IconCompatParcelizer = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof formatDateNow)) {
            return false;
        }
        formatDateNow formatdatenow = (formatDateNow) obj;
        return this.serializer.equals(formatdatenow.serializer) && this.RemoteActionCompatParcelizer.equals(formatdatenow.RemoteActionCompatParcelizer) && this.IconCompatParcelizer.equals(formatdatenow.IconCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewEntity(title=");
        sb.append(this.serializer);
        sb.append(", componentAction=null, showCaption=false, caption=null, showIcon=true, icon=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", showValue=true, value=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.IconCompatParcelizer, ", showTag=false, tag=null, showButton=false, button=null)");
    }
}
