package o;

import java.security.Permission;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class sendMessage_XzSiO8 extends Permission {
    public final HashSet IconCompatParcelizer;

    @Override // java.security.Permission
    public final String getActions() {
        return this.IconCompatParcelizer.toString();
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof sendMessage_XzSiO8) && this.IconCompatParcelizer.equals(((sendMessage_XzSiO8) obj).IconCompatParcelizer);
    }

    @Override // java.security.Permission
    public final boolean implies(Permission permission) {
        if (!(permission instanceof sendMessage_XzSiO8)) {
            return false;
        }
        sendMessage_XzSiO8 sendmessage_xzsio8 = (sendMessage_XzSiO8) permission;
        return getName().equals(sendmessage_xzsio8.getName()) || this.IconCompatParcelizer.containsAll(sendmessage_xzsio8.IconCompatParcelizer);
    }

    public sendMessage_XzSiO8(String str) {
        super(str);
        HashSet hashSet = new HashSet();
        this.IconCompatParcelizer = hashSet;
        hashSet.add(str);
    }
}
