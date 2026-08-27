package o;

import com.sentiance.sdk.events.ControlMessage;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class r8lambdaYMvlD0eyl1jvWFyJWJHGzDlWGR0 extends deepcopyandroid_sdk_base_release {
    final /* synthetic */ r8lambdaJvvdxZf_wI8IlMo_UBnPuJBuDT0 RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8lambdaYMvlD0eyl1jvWFyJWJHGzDlWGR0(r8lambdaJvvdxZf_wI8IlMo_UBnPuJBuDT0 r8lambdajvvdxzf_wi8ilmo_ubnpujbudt0, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar) {
        super(clearandroid_sdk_base_releaseVar, "EventStoreCleanupTask");
        this.RemoteActionCompatParcelizer = r8lambdajvvdxzf_wi8ilmo_ubnpujbudt0;
    }

    @Override // o.deepcopyandroid_sdk_base_release
    public final void serializer(ControlMessage controlMessage, Object obj) {
        if (controlMessage == ControlMessage.PAYLOAD_SUBMISSION_RESULT) {
            if (this.RemoteActionCompatParcelizer.write.read() >= 2) {
                this.RemoteActionCompatParcelizer.read.IconCompatParcelizer("Disk quota is not ok.", new Object[0]);
                this.RemoteActionCompatParcelizer.serializer();
                return;
            }
            return;
        }
        if (controlMessage == ControlMessage.DISK_QUOTA_STATUS_UPDATED) {
            while (this.RemoteActionCompatParcelizer.write.read() != 0) {
                List<Integer> onBackPressedInput = this.RemoteActionCompatParcelizer.MediaBrowserCompatMediaItem.getOnBackPressedInput();
                getCooldownEnterSeconds getcooldownenterseconds = this.RemoteActionCompatParcelizer.IconCompatParcelizer;
                getcooldownenterseconds.getClass();
                List list = (List) getcooldownenterseconds.serializer(Collections.EMPTY_LIST, new getEnterEvents(getcooldownenterseconds, 0, onBackPressedInput));
                if (list.isEmpty()) {
                    this.RemoteActionCompatParcelizer.read.IconCompatParcelizer("No more unsubmitted events to clean up", new Object[0]);
                    return;
                }
                long jRemoteActionCompatParcelizer = ((getCooldownEnterSeconds.read) list.get(0)).RemoteActionCompatParcelizer() + 21600000;
                this.RemoteActionCompatParcelizer.read.IconCompatParcelizer("Marking all events before %s as submitted", com.sentiance.sdk.util.x.c(jRemoteActionCompatParcelizer));
                getCooldownEnterSeconds getcooldownenterseconds2 = this.RemoteActionCompatParcelizer.IconCompatParcelizer;
                synchronized (getcooldownenterseconds2) {
                    getcooldownenterseconds2.serializer(new getLatitude(jRemoteActionCompatParcelizer, 0));
                }
                this.RemoteActionCompatParcelizer.serializer();
                this.RemoteActionCompatParcelizer.MediaSessionCompatQueueItem.getClass();
                if (jRemoteActionCompatParcelizer > System.currentTimeMillis()) {
                    this.RemoteActionCompatParcelizer.read.IconCompatParcelizer("Reached the end of event cleanup attempt", new Object[0]);
                    return;
                }
            }
        }
    }
}
