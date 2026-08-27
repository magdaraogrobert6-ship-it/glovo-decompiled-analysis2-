package o;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.zzc;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class getButton4EK5gGoQ implements Runnable, getF3EK5gGoQ {
    public final /* synthetic */ getButton6EK5gGoQ IconCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ getButton4EK5gGoQ(getButton6EK5gGoQ getbutton6ek5ggoq, int i) {
        this.write = i;
        this.IconCompatParcelizer = getbutton6ek5ggoq;
    }

    @Override // o.getF3EK5gGoQ
    public void IconCompatParcelizer(getF5EK5gGoQ getf5ek5ggoq) {
        Status status = getf5ek5ggoq.read;
        getButton6EK5gGoQ getbutton6ek5ggoq = this.IconCompatParcelizer;
        ExecutorService executorService = getbutton6ek5ggoq.MediaMetadataCompat;
        if (status == Status.IconCompatParcelizer) {
            executorService.execute(new zzc(getbutton6ek5ggoq, getf5ek5ggoq, false, 9));
        } else {
            executorService.execute(new getButton16EK5gGoQ(getbutton6ek5ggoq, 1));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.write == 0) {
            getButton6EK5gGoQ getbutton6ek5ggoq = this.IconCompatParcelizer;
            getbutton6ek5ggoq.MediaMetadataCompat.execute(new getButton16EK5gGoQ(getbutton6ek5ggoq, 2));
            return;
        }
        getButton6EK5gGoQ getbutton6ek5ggoq2 = this.IconCompatParcelizer;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(getbutton6ek5ggoq2.ParcelableVolumeInfo == 1);
        ArrayList arrayList = new ArrayList();
        getbutton6ek5ggoq2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = false;
        getCalendarEK5gGoQ getcalendarek5ggoqIconCompatParcelizer = getCalendarEK5gGoQ.IconCompatParcelizer();
        String str = getbutton6ek5ggoq2.read;
        if (getcalendarek5ggoqIconCompatParcelizer.serializer == 2 && getcalendarek5ggoqIconCompatParcelizer.write.equals(str)) {
            arrayList.add(0);
        } else {
            boolean z = Math.max(0L, getbutton6ek5ggoq2.MediaSessionCompatToken.MediaMetadataCompat().getLong("FORBIDDEN_COUNT", 0L)) > 0;
            getbutton6ek5ggoq2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = z;
            if (z) {
                arrayList.add(1);
                arrayList.add(0);
            } else {
                arrayList.add(0);
                arrayList.add(1);
            }
            arrayList.add(2);
        }
        getbutton6ek5ggoq2.MediaSessionCompatQueueItem.read(getbutton6ek5ggoq2.read, getbutton6ek5ggoq2.RemoteActionCompatParcelizer, getbutton6ek5ggoq2.serializer, arrayList, this, getbutton6ek5ggoq2.MediaSessionCompatToken);
    }
}
