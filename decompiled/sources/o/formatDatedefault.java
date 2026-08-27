package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public final class formatDatedefault {
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 IconCompatParcelizer;
    public final String MediaDescriptionCompat;
    public final String RemoteActionCompatParcelizer;
    public final boolean read;
    public final toStringSafe serializer;
    public final Integer write;

    public final int hashCode() {
        int iHashCode = this.MediaDescriptionCompat.hashCode();
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.IconCompatParcelizer;
        int iM = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m((this.write.hashCode() + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(((iHashCode * 31) + (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 == null ? 0 : r8lambdardpfsr94j4iebcwx_kpqzpm8k0.hashCode())) * 31, 961, false), 31, true)) * 31, 961, false), 961, false), 31, this.read);
        toStringSafe tostringsafe = this.serializer;
        int iM2 = d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m((iM + (tostringsafe == null ? 0 : tostringsafe.hashCode())) * 31, 961, false), 31, true);
        String str = this.RemoteActionCompatParcelizer;
        return d$$ExternalSyntheticOutline0.m((iM2 + (str == null ? 0 : str.hashCode())) * 31, 31, false);
    }

    public formatDatedefault(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Integer num, boolean z, toStringSafe tostringsafe, String str2) {
        this.MediaDescriptionCompat = str;
        this.IconCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = num;
        this.read = z;
        this.serializer = tostringsafe;
        this.RemoteActionCompatParcelizer = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof formatDatedefault)) {
            return false;
        }
        formatDatedefault formatdatedefault = (formatDatedefault) obj;
        if (!this.MediaDescriptionCompat.equals(formatdatedefault.MediaDescriptionCompat)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, formatdatedefault.IconCompatParcelizer}, getCieXyz.write())).booleanValue() || !this.write.equals(formatdatedefault.write) || this.read != formatdatedefault.read) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, formatdatedefault.serializer}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, formatdatedefault.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "ViewEntity(title=" + this.MediaDescriptionCompat + ", componentAction=" + this.IconCompatParcelizer + ", showCaption=false, caption=null, showIcon=true, icon=" + this.write + ", showValue=false, value=null, showTag=false, tag=null, showButton=" + this.read + ", button=" + this.serializer + ", showDescription=false, description=null, showAdditionalInfo=true, additionalInfo=" + this.RemoteActionCompatParcelizer + ", showAdditionalTags=false, additionalTags=null)";
    }
}
