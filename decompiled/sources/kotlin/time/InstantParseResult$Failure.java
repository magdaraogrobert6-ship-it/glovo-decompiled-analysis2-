package kotlin.time;

import o.BrazeInAppMessageManagerunregisterInAppMessageManager2;
import o.accesscontainsPushPermissionPrompt;
import o.containsPushPermissionPrompt;

/* JADX INFO: loaded from: classes4.dex */
public final class InstantParseResult$Failure implements BrazeInAppMessageManagerunregisterInAppMessageManager2 {
    public final String RemoteActionCompatParcelizer;
    public final String read;

    public InstantParseResult$Failure(String str, String str2) {
        this.read = str;
        this.RemoteActionCompatParcelizer = str2;
    }

    @Override // o.BrazeInAppMessageManagerunregisterInAppMessageManager2
    public final accesscontainsPushPermissionPrompt IconCompatParcelizer() {
        throw new InstantFormatException(this.read + " when parsing an Instant from \"" + containsPushPermissionPrompt.serializer(64, this.RemoteActionCompatParcelizer) + '\"');
    }
}
