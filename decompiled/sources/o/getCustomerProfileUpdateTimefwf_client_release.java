package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class getCustomerProfileUpdateTimefwf_client_release implements Serializable, Cloneable {
    public int IconCompatParcelizer;
    public MemoryCachedecodeFeatures1 MediaSessionCompatQueueItem;
    public int RemoteActionCompatParcelizer;
    public final int serializer;
    public boolean write = false;
    public boolean read = false;

    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final getCustomerProfileUpdateTimefwf_client_release clone() {
        getCustomerProfileUpdateTimefwf_client_release getcustomerprofileupdatetimefwf_client_release = new getCustomerProfileUpdateTimefwf_client_release(this.serializer);
        getcustomerprofileupdatetimefwf_client_release.MediaSessionCompatQueueItem = this.MediaSessionCompatQueueItem;
        getcustomerprofileupdatetimefwf_client_release.IconCompatParcelizer = this.IconCompatParcelizer;
        getcustomerprofileupdatetimefwf_client_release.RemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer;
        getcustomerprofileupdatetimefwf_client_release.write = this.write;
        getcustomerprofileupdatetimefwf_client_release.read = this.read;
        return getcustomerprofileupdatetimefwf_client_release;
    }

    public getCustomerProfileUpdateTimefwf_client_release(int i) {
        this.serializer = i;
    }

    public final int RemoteActionCompatParcelizer() {
        if (!this.write || this.read) {
            return Integer.MAX_VALUE;
        }
        return this.IconCompatParcelizer;
    }
}
