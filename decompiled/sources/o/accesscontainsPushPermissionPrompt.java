package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class accesscontainsPushPermissionPrompt implements Comparable, Serializable {
    public static final accesscontainsPushPermissionPrompt RemoteActionCompatParcelizer = new accesscontainsPushPermissionPrompt(-31557014167219200L, 0);
    public static final accesscontainsPushPermissionPrompt write = new accesscontainsPushPermissionPrompt(31556889864403199L, 999999999);
    public final long IconCompatParcelizer;
    public final int serializer;

    public final String toString() {
        return containsPushPermissionPrompt.read(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        accesscontainsPushPermissionPrompt accesscontainspushpermissionprompt = (accesscontainsPushPermissionPrompt) obj;
        accesscontainspushpermissionprompt.getClass();
        int i = removeNodeAtDepth.read(this.IconCompatParcelizer, accesscontainspushpermissionprompt.IconCompatParcelizer);
        return i != 0 ? i : removeNodeAtDepth.serializer(this.serializer, accesscontainspushpermissionprompt.serializer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accesscontainsPushPermissionPrompt)) {
            return false;
        }
        accesscontainsPushPermissionPrompt accesscontainspushpermissionprompt = (accesscontainsPushPermissionPrompt) obj;
        return this.IconCompatParcelizer == accesscontainspushpermissionprompt.IconCompatParcelizer && this.serializer == accesscontainspushpermissionprompt.serializer;
    }

    public final int hashCode() {
        return (this.serializer * 51) + Long.hashCode(this.IconCompatParcelizer);
    }

    public accesscontainsPushPermissionPrompt(long j, int i) {
        this.IconCompatParcelizer = j;
        this.serializer = i;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Instant exceeds minimum or maximum instant");
            throw null;
        }
    }
}
