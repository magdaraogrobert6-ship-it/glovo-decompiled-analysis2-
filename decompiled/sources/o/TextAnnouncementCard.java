package o;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class TextAnnouncementCard implements Runnable {
    public final /* synthetic */ ICardListener IconCompatParcelizer;
    public final /* synthetic */ long MediaSessionCompatQueueItem;
    public final /* synthetic */ Serializable RatingCompat;
    public final /* synthetic */ String RemoteActionCompatParcelizer;
    public final /* synthetic */ int read = 1;
    public final /* synthetic */ ArrayList serializer;
    public final /* synthetic */ long write;

    public /* synthetic */ TextAnnouncementCard(ICardListener iCardListener, String str, long j, long j2, Boolean bool, ArrayList arrayList) {
        this.IconCompatParcelizer = iCardListener;
        this.RemoteActionCompatParcelizer = str;
        this.write = j;
        this.MediaSessionCompatQueueItem = j2;
        this.RatingCompat = bool;
        this.serializer = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.read;
        Serializable serializable = this.RatingCompat;
        if (i == 0) {
            ICardListener.IconCompatParcelizer(this.IconCompatParcelizer, this.serializer, this.RemoteActionCompatParcelizer, this.write, this.MediaSessionCompatQueueItem, (ArrayList) serializable);
            return;
        }
        ArrayList arrayList = this.serializer;
        ICardListener.read(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.write, this.MediaSessionCompatQueueItem, (Boolean) serializable, arrayList);
    }

    public /* synthetic */ TextAnnouncementCard(ICardListener iCardListener, ArrayList arrayList, String str, long j, long j2, ArrayList arrayList2) {
        this.IconCompatParcelizer = iCardListener;
        this.serializer = arrayList;
        this.RemoteActionCompatParcelizer = str;
        this.write = j;
        this.MediaSessionCompatQueueItem = j2;
        this.RatingCompat = arrayList2;
    }
}
