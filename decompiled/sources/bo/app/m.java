package bo.app;

import com.braze.models.BannerPendingDismissal;
import java.util.Comparator;
import o.setNativeShader;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return setNativeShader.RemoteActionCompatParcelizer(Long.valueOf(((BannerPendingDismissal) obj).getDismissalTimeMs()), Long.valueOf(((BannerPendingDismissal) obj2).getDismissalTimeMs()));
    }
}
