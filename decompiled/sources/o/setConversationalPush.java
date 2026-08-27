package o;

import android.location.Location;
import com.sentiance.sdk.events.ControlMessage;

/* JADX INFO: loaded from: classes3.dex */
final class setConversationalPush extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ setContentCardSyncUserId write;

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        setContentCardSyncUserId setcontentcardsyncuserid = this.write;
        setcontentcardsyncuserid.RemoteActionCompatParcelizer.read(this);
        if (setcontentcardsyncuserid.MediaBrowserCompatMediaItem) {
            return;
        }
        setcontentcardsyncuserid.write(setcontentcardsyncuserid.MediaBrowserCompatMediaItem(), "Location fix timed out", new Object[0]);
        Location locationWrite = setContentCardSyncUserId.write(setcontentcardsyncuserid);
        if (locationWrite != null) {
            setContentCardSyncUserId.RemoteActionCompatParcelizer(setcontentcardsyncuserid, locationWrite);
        } else {
            setcontentcardsyncuserid.MediaBrowserCompatMediaItem().PlaybackStateCompat();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setConversationalPush(setContentCardSyncUserId setcontentcardsyncuserid, readandroid_sdk_base_release readandroid_sdk_base_releaseVar) {
        super(readandroid_sdk_base_releaseVar, "LostState");
        this.write = setcontentcardsyncuserid;
    }
}
