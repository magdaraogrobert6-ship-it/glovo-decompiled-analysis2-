package o;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Updater$$ExternalSyntheticLambda1;
import androidx.room.RoomDatabase$$ExternalSyntheticLambda2;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class getOnContentCaptureSession extends boundsUpdatesEventLoopui {
    public Object IconCompatParcelizer;
    public Object MediaBrowserCompatMediaItem;
    public relocationOffsetfbGrOKE MediaMetadataCompat;
    public r8lambdahgODiqgPByAI8PyoNAxx8PBqX4 RemoteActionCompatParcelizer;
    public final OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 read;
    public relocationOffsetfbGrOKE serializer;
    public final RoomDatabase$$ExternalSyntheticLambda2 write = new RoomDatabase$$ExternalSyntheticLambda2(8, this);

    @Override // o.boundsUpdatesEventLoopui
    public final void serializer(logUnregisterActivitylambda1 logunregisteractivitylambda1) {
        this.RemoteActionCompatParcelizer = null;
        this.MediaBrowserCompatMediaItem = null;
        this.MediaMetadataCompat = null;
        read();
    }

    @Override // o.boundsUpdatesEventLoopui
    public final void write(r8lambdahgODiqgPByAI8PyoNAxx8PBqX4 r8lambdahgodiqgpbyai8pyonaxx8pbqx4) {
        this.MediaBrowserCompatMediaItem = null;
        this.MediaMetadataCompat = null;
    }

    @Override // o.boundsUpdatesEventLoopui
    public final void IconCompatParcelizer() {
        this.read.IconCompatParcelizer();
        this.MediaBrowserCompatMediaItem = null;
        this.MediaMetadataCompat = null;
        synchronized (this.MediaSessionCompatQueueItem) {
            this.RemoteActionCompatParcelizer = null;
            this.IconCompatParcelizer = null;
            this.serializer = null;
        }
    }

    @Override // o.boundsUpdatesEventLoopui
    public final void read() {
        synchronized (this.MediaSessionCompatQueueItem) {
            this.IconCompatParcelizer = this.MediaBrowserCompatMediaItem;
            if (this.MediaMetadataCompat == null) {
                this.serializer = null;
            } else {
                if (this.serializer == null) {
                    relocationOffsetfbGrOKE relocationoffsetfbgroke = awaitLongPressOrCancellationrnUCldI.IconCompatParcelizer;
                    this.serializer = new relocationOffsetfbGrOKE();
                }
                relocationOffsetfbGrOKE relocationoffsetfbgroke2 = this.serializer;
                this.serializer = this.MediaMetadataCompat;
                this.MediaMetadataCompat = relocationoffsetfbgroke2;
            }
        }
    }

    @Override // o.boundsUpdatesEventLoopui
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM RemoteActionCompatParcelizer(r8lambdahgODiqgPByAI8PyoNAxx8PBqX4 r8lambdahgodiqgpbyai8pyonaxx8pbqx4) {
        r8lambdahgODiqgPByAI8PyoNAxx8PBqX4 r8lambdahgodiqgpbyai8pyonaxx8pbqx5 = this.RemoteActionCompatParcelizer;
        if (r8lambdahgodiqgpbyai8pyonaxx8pbqx5 != null && !r8lambdahgodiqgpbyai8pyonaxx8pbqx5.equals(r8lambdahgodiqgpbyai8pyonaxx8pbqx4)) {
            getContentCaptureSessionuiannotations.write("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.RemoteActionCompatParcelizer = r8lambdahgodiqgpbyai8pyonaxx8pbqx4;
        return this.write;
    }

    public getOnContentCaptureSession() {
        Updater$$ExternalSyntheticLambda1 updater$$ExternalSyntheticLambda1 = new Updater$$ExternalSyntheticLambda1(6, this);
        getOffsetF1C5BW0.write(getOffsetF1C5BW0.RemoteActionCompatParcelizer);
        synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
            getOffsetF1C5BW0.write = onContentCardDismissed.RemoteActionCompatParcelizer((Collection) getOffsetF1C5BW0.write, (Object) updater$$ExternalSyntheticLambda1);
        }
        this.read = new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(1, updater$$ExternalSyntheticLambda1);
    }
}
