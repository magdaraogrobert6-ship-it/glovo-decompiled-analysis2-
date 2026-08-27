package o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class isBot implements getTitleGravity {
    final /* synthetic */ stringAndKey IconCompatParcelizer;

    public final void IconCompatParcelizer() {
        synchronized (this.IconCompatParcelizer.MediaSessionCompatQueueItem) {
            this.IconCompatParcelizer.MediaSessionCompatToken = null;
        }
        stringAndKey.MediaSessionCompatQueueItem(this.IconCompatParcelizer);
        this.IconCompatParcelizer.serializer.IconCompatParcelizer();
    }

    public final void RemoteActionCompatParcelizer(ArrayList arrayList) {
        synchronized (this.IconCompatParcelizer.MediaSessionCompatQueueItem) {
            this.IconCompatParcelizer.MediaSessionCompatToken = null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            isImportant isimportant = (isImportant) it.next();
            if (!this.IconCompatParcelizer.MediaMetadataCompat.write(isimportant.read())) {
                synchronized (this.IconCompatParcelizer.MediaSessionCompatQueueItem) {
                    this.IconCompatParcelizer.MediaDescriptionCompat.add(new stringAndKey.RemoteActionCompatParcelizer(isimportant));
                }
            }
        }
        stringAndKey.MediaDescriptionCompat(this.IconCompatParcelizer);
        this.IconCompatParcelizer.serializer.IconCompatParcelizer();
    }

    public isBot(stringAndKey stringandkey) {
        this.IconCompatParcelizer = stringandkey;
    }
}
