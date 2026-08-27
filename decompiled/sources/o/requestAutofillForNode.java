package o;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class requestAutofillForNode {
    public final String IconCompatParcelizer;
    public final String read;
    public final getAutofillManager write;

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        String str = this.IconCompatParcelizer;
        return this.write.hashCode() + d$$ExternalSyntheticOutline0.m(((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31, 31, false);
    }

    public requestAutofillForNode(String str, String str2, getAutofillManager getautofillmanager) {
        this.read = str;
        this.IconCompatParcelizer = str2;
        this.write = getautofillmanager;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || requestAutofillForNode.class != obj.getClass()) {
            return false;
        }
        requestAutofillForNode requestautofillfornode = (requestAutofillForNode) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, requestautofillfornode.read}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, requestautofillfornode.IconCompatParcelizer}, getCieXyz.write())).booleanValue() && this.write == requestautofillfornode.write;
    }
}
