package o;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class setOutlineO0kMr_c extends isInvalidated {
    public final String write;

    @Override // o.isInvalidated
    public final String RemoteActionCompatParcelizer() {
        return "customer_chat_quick_reply";
    }

    public final int hashCode() {
        return this.write.hashCode();
    }

    public setOutlineO0kMr_c(String str) {
        str.getClass();
        this.write = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setOutlineO0kMr_c)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, ((setOutlineO0kMr_c) obj).write}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("QuickReplyMessageSent(selectedReply="), this.write, ')');
    }
}
