package o;

import com.google.firebase.inappmessaging.internal.DisplayCallbacksImpl;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import java.util.Objects;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes2.dex */
public final class getEndXimpl {
    public final internalOnMeasureui IconCompatParcelizer;
    public final OwnerSnapshotObserveronCommitAffectingLookahead1 read;

    public getEndXimpl(internalOnMeasureui internalonmeasureui, OwnerSnapshotObserveronCommitAffectingLookahead1 ownerSnapshotObserveronCommitAffectingLookahead1) {
        this.IconCompatParcelizer = internalonmeasureui;
        this.read = ownerSnapshotObserveronCommitAffectingLookahead1;
    }

    public final void RemoteActionCompatParcelizer(com.bumptech.glide.load.engine.GlideException glideException) {
        OwnerSnapshotObserveronCommitAffectingLookahead1 ownerSnapshotObserveronCommitAffectingLookahead1;
        glideException.getMessage();
        Objects.toString(glideException.getCause());
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        BuildersKt.IconCompatParcelizer(1540001961, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), -1540001960, new Object[0], iRemoteActionCompatParcelizer);
        if (this.IconCompatParcelizer == null || (ownerSnapshotObserveronCommitAffectingLookahead1 = this.read) == null) {
            return;
        }
        if (glideException.getLocalizedMessage().contains("Failed to decode")) {
            ((DisplayCallbacksImpl) ownerSnapshotObserveronCommitAffectingLookahead1).write(OwnerSnapshotObserveronCommitAffectingMeasure1.IMAGE_UNSUPPORTED_FORMAT);
        } else {
            ((DisplayCallbacksImpl) ownerSnapshotObserveronCommitAffectingLookahead1).write(OwnerSnapshotObserveronCommitAffectingMeasure1.UNSPECIFIED_RENDER_ERROR);
        }
    }
}
