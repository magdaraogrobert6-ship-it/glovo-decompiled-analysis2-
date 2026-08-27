package o;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class getExposureHandlerfwf_client_release {
    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 IconCompatParcelizer;
    public List MediaMetadataCompat;
    public final getTimerfwf_client_release RemoteActionCompatParcelizer;
    public final getUserfwf_client_release read;
    public final getUserfwf_client_release serializer;
    public final r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk write;

    public final String toString() {
        String str;
        String str2;
        String string = this.RemoteActionCompatParcelizer.toString();
        String str3 = "'" + FwFClientCompanion.IconCompatParcelizer(this.write) + '\'';
        getUserfwf_client_release getuserfwf_client_release = this.read;
        if (getuserfwf_client_release != null) {
            str = ",qualifier:" + getuserfwf_client_release;
        } else {
            str = "";
        }
        removeCustomerProfileAttributesfwf_client_release removecustomerprofileattributesfwf_client_release = FwFClientaddFeatureKeys1.IconCompatParcelizer;
        getUserfwf_client_release getuserfwf_client_release2 = this.serializer;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getuserfwf_client_release2, removecustomerprofileattributesfwf_client_release}, getCieXyz.write())).booleanValue()) {
            str2 = "";
        } else {
            str2 = ",scope:" + getuserfwf_client_release2;
        }
        return "[" + string + ':' + str3 + str + str2 + (this.MediaMetadataCompat.isEmpty() ? "" : ",binds:".concat(onContentCardDismissed.IconCompatParcelizer(this.MediaMetadataCompat, ",", null, null, getCustomerProfileConfigfwf_client_release.RemoteActionCompatParcelizer, 30))) + ']';
    }

    public getExposureHandlerfwf_client_release(getUserfwf_client_release getuserfwf_client_release, r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk, removeCustomerProfileAttributesfwf_client_release removecustomerprofileattributesfwf_client_release, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getTimerfwf_client_release gettimerfwf_client_release) {
        getuserfwf_client_release.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        gettimerfwf_client_release.getClass();
        this.serializer = getuserfwf_client_release;
        this.write = r8lambdaucgighn8fiyv_vccodeafjfpedk;
        this.read = removecustomerprofileattributesfwf_client_release;
        this.IconCompatParcelizer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.RemoteActionCompatParcelizer = gettimerfwf_client_release;
        this.MediaMetadataCompat = instance_delegatelambda0.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        obj.getClass();
        getExposureHandlerfwf_client_release getexposurehandlerfwf_client_release = (getExposureHandlerfwf_client_release) obj;
        if (!this.write.equals(getexposurehandlerfwf_client_release.write)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, getexposurehandlerfwf_client_release.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, getexposurehandlerfwf_client_release.serializer}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        getUserfwf_client_release getuserfwf_client_release = this.read;
        return this.serializer.hashCode() + ((this.write.hashCode() + ((getuserfwf_client_release != null ? getuserfwf_client_release.hashCode() : 0) * 31)) * 31);
    }
}
