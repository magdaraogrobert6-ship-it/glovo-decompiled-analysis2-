package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class getOwnerId extends isInvalidated {
    public final String IconCompatParcelizer;

    @Override // o.isInvalidated
    public final String RemoteActionCompatParcelizer() {
        return "customer_chat_call_customer";
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    public getOwnerId(String str) {
        str.getClass();
        this.IconCompatParcelizer = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getOwnerId)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, ((getOwnerId) obj).IconCompatParcelizer}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("Call(phoneNumber="), this.IconCompatParcelizer, ')');
    }
}
