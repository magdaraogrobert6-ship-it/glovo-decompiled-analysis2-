package o;

/* JADX INFO: loaded from: classes4.dex */
public final class removeCustomerProfileAttributesfwf_client_release implements getUserfwf_client_release {
    public final String RemoteActionCompatParcelizer;

    public final String toString() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.getUserfwf_client_release
    public final String write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    public removeCustomerProfileAttributesfwf_client_release(String str) {
        this.RemoteActionCompatParcelizer = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof removeCustomerProfileAttributesfwf_client_release) && this.RemoteActionCompatParcelizer.equals(((removeCustomerProfileAttributesfwf_client_release) obj).RemoteActionCompatParcelizer);
    }
}
