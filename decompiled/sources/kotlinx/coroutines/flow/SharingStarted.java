package kotlinx.coroutines.flow;

import com.google.android.gms.location.DeviceOrientationRequest;

/* JADX INFO: loaded from: classes4.dex */
public interface SharingStarted {
    Flow write(StateFlow stateFlow);

    public static final class Companion {
        public static final SharingStarted RemoteActionCompatParcelizer = new StartedEagerly();
        public static final SharingStarted serializer = new StartedLazily();

        public static SharingStarted read(int i) {
            return new StartedWhileSubscribed((i & 1) != 0 ? 0L : DeviceOrientationRequest.OUTPUT_PERIOD_FAST, (i & 2) != 0 ? Long.MAX_VALUE : 0L);
        }
    }
}
