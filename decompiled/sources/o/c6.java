package o;

import io.sentry.util.UrlUtils;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okio.internal.ResourceFileSystem$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class c6 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final isAdapterPositionOnScreen read;
    public final isOpenInternalroom_runtime write;

    public c6(transferSessionPackageI transfersessionpackagei, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        transfersessionpackagei.getClass();
        isopeninternalroom_runtime.getClass();
        this.write = isopeninternalroom_runtime;
        this.read = new isAdapterPositionOnScreen(new ResourceFileSystem$$ExternalSyntheticLambda0(6, transfersessionpackagei));
    }

    public final boolean write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 103;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.read.MediaSessionCompatResultReceiverWrapper()).booleanValue();
        int i4 = RemoteActionCompatParcelizer + 3;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return zBooleanValue;
    }

    public final ContextScope serializer() {
        TextAnnouncementContentCardView textAnnouncementContentCardViewIconCompatParcelizer;
        int i = 2 % 2;
        boolean zWrite = write();
        isOpenInternalroom_runtime isopeninternalroom_runtime = this.write;
        if (zWrite) {
            int i2 = serializer + 113;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            ((inCompatibilityMode) isopeninternalroom_runtime).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            textAnnouncementContentCardViewIconCompatParcelizer = DefaultIoScheduler.RemoteActionCompatParcelizer;
        } else {
            ((inCompatibilityMode) isopeninternalroom_runtime).getClass();
            DefaultScheduler defaultScheduler2 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            textAnnouncementContentCardViewIconCompatParcelizer = MainDispatcherLoader.read.IconCompatParcelizer();
        }
        ContextScope contextScopeRemoteActionCompatParcelizer = YieldKt.RemoteActionCompatParcelizer(androidx.room.Room.read(UrlUtils.serializer(), textAnnouncementContentCardViewIconCompatParcelizer));
        int i4 = serializer + 45;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return contextScopeRemoteActionCompatParcelizer;
    }
}
