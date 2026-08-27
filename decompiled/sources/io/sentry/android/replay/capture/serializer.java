package io.sentry.android.replay.capture;

import io.sentry.android.replay.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
import java.util.Date;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class serializer implements Runnable {
    public final /* synthetic */ Date IconCompatParcelizer;
    public final /* synthetic */ r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaBrowserCompatMediaItem;
    public final /* synthetic */ r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg MediaMetadataCompat;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg read;
    public final /* synthetic */ long serializer;
    public final /* synthetic */ RemoteActionCompatParcelizer write;

    public /* synthetic */ serializer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, long j, Date date, io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = remoteActionCompatParcelizer;
        this.serializer = j;
        this.IconCompatParcelizer = date;
        this.read = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        this.MediaMetadataCompat = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg2;
        this.MediaBrowserCompatMediaItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.RemoteActionCompatParcelizer;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = this.MediaBrowserCompatMediaItem;
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = this.MediaMetadataCompat;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.write;
        if (i != 0) {
            ParcelableVolumeInfo parcelableVolumeInfo = (ParcelableVolumeInfo) remoteActionCompatParcelizer;
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(RemoteActionCompatParcelizer.serializer(parcelableVolumeInfo, this.serializer, this.IconCompatParcelizer, this.read, parcelableVolumeInfo.RemoteActionCompatParcelizer(), r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.RemoteActionCompatParcelizer, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.serializer, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.IconCompatParcelizer, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.read));
            return;
        }
        write writeVar = (write) remoteActionCompatParcelizer;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(RemoteActionCompatParcelizer.serializer(writeVar, this.serializer, this.IconCompatParcelizer, this.read, writeVar.RemoteActionCompatParcelizer(), r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.RemoteActionCompatParcelizer, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.serializer, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.IconCompatParcelizer, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg.read));
    }
}
