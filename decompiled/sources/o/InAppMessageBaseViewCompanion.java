package o;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class InAppMessageBaseViewCompanion {
    public static final InAppMessageBaseViewCompanion DEFAULT = new InAppMessageBaseViewCompanion(onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(new ArrayList()), null);
    public final getHttpClientfwf_client_release certificateChainCleaner;
    public final Set pins;

    public final int hashCode() {
        int iHashCode = this.pins.hashCode();
        getHttpClientfwf_client_release gethttpclientfwf_client_release = this.certificateChainCleaner;
        return ((iHashCode + 1517) * 41) + (gethttpclientfwf_client_release != null ? gethttpclientfwf_client_release.hashCode() : 0);
    }

    public InAppMessageBaseViewCompanion(Set set, getHttpClientfwf_client_release gethttpclientfwf_client_release) {
        this.pins = set;
        this.certificateChainCleaner = gethttpclientfwf_client_release;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InAppMessageBaseViewCompanion)) {
            return false;
        }
        InAppMessageBaseViewCompanion inAppMessageBaseViewCompanion = (InAppMessageBaseViewCompanion) obj;
        if (!inAppMessageBaseViewCompanion.pins.equals(this.pins)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{inAppMessageBaseViewCompanion.certificateChainCleaner, this.certificateChainCleaner}, getCieXyz.write())).booleanValue();
    }
}
