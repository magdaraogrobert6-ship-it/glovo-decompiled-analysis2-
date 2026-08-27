package o;

import com.sentiance.sdk.eventtimeline.timelines.creators.TransportChangeType;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ControlCard implements Runnable {
    public final /* synthetic */ String IconCompatParcelizer;
    public final /* synthetic */ TransportChangeType MediaMetadataCompat;
    public final /* synthetic */ ArrayList MediaSessionCompatQueueItem;
    public final /* synthetic */ long RemoteActionCompatParcelizer;
    public final /* synthetic */ ICardListener read;
    public final /* synthetic */ int serializer;
    public final /* synthetic */ long write;

    public /* synthetic */ ControlCard(ICardListener iCardListener, String str, long j, long j2, TransportChangeType transportChangeType, ArrayList arrayList, int i) {
        this.serializer = i;
        this.read = iCardListener;
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = j;
        this.write = j2;
        this.MediaMetadataCompat = transportChangeType;
        this.MediaSessionCompatQueueItem = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.serializer == 0) {
            ICardListener.write(this.read, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.write, this.MediaMetadataCompat, this.MediaSessionCompatQueueItem);
        } else {
            TransportChangeType transportChangeType = this.MediaMetadataCompat;
            this.MediaSessionCompatQueueItem.addAll(this.read.read.write().write(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.write, transportChangeType));
        }
    }
}
