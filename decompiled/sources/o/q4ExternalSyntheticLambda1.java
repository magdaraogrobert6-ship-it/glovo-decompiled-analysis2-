package o;

import com.roadrunner.networking.core.NetworkingCoreModule$$ExternalSyntheticLambda2;
import kotlinx.coroutines.flow.MutableStateFlow;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class q4ExternalSyntheticLambda1 extends androidx.lifecycle.ViewModel {
    private static int serializer = 0;
    private static int write = 1;
    public final isAdapterPositionOnScreen RemoteActionCompatParcelizer;
    public final pg read;

    public q4ExternalSyntheticLambda1(pg pgVar) {
        pgVar.getClass();
        this.read = pgVar;
        this.RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new NetworkingCoreModule$$ExternalSyntheticLambda2(14, this));
    }

    public final pb RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 19;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return (pb) this.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void RemoteActionCompatParcelizer(long j, String str, String str2) {
        int i = 2 % 2;
        int i2 = write + 27;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        pb pbVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        pbVarRemoteActionCompatParcelizer.getClass();
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Verification data set, countdown will start", new Object[0]);
        pbVarRemoteActionCompatParcelizer.RatingCompat = str2;
        MutableStateFlow mutableStateFlow = pbVarRemoteActionCompatParcelizer.read;
        while (true) {
            Object obj = mutableStateFlow.read();
            if (mutableStateFlow.RemoteActionCompatParcelizer(obj, pf.RemoteActionCompatParcelizer((pf) obj, str, 0L, false, false, null, 4094))) {
                int i4 = write + 57;
                serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                pbVarRemoteActionCompatParcelizer.IconCompatParcelizer.IconCompatParcelizer(Long.valueOf(j));
                return;
            }
            int i6 = write + 17;
            serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
    }
}
