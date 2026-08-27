package o;

/* JADX INFO: loaded from: classes4.dex */
public final class getInAppMessageStack {
    public final String RemoteActionCompatParcelizer;
    public final ensureSubscribedToInAppMessageEventslambda7 serializer;

    public final int hashCode() {
        return this.serializer.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31);
    }

    public getInAppMessageStack(String str, ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7) {
        this.RemoteActionCompatParcelizer = str;
        this.serializer = ensuresubscribedtoinappmessageeventslambda7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getInAppMessageStack)) {
            return false;
        }
        getInAppMessageStack getinappmessagestack = (getInAppMessageStack) obj;
        return this.RemoteActionCompatParcelizer.equals(getinappmessagestack.RemoteActionCompatParcelizer) && this.serializer.equals(getinappmessagestack.serializer);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.RemoteActionCompatParcelizer + ", range=" + this.serializer + ')';
    }
}
