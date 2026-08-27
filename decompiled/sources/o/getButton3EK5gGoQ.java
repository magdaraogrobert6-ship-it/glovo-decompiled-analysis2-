package o;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class getButton3EK5gGoQ implements accessgetTvInputComposite2cp {
    public final String IconCompatParcelizer;
    public boolean MediaMetadataCompat;
    public final setLastReportedResult MediaSessionCompatQueueItem;
    public final Date RemoteActionCompatParcelizer;
    public Map read;
    public final String serializer;
    public final Bundle write;

    @Override // o.accessgetTvInputComposite2cp
    public final long IconCompatParcelizer() {
        return SystemClock.elapsedRealtime();
    }

    @Override // o.accessgetTvInputComposite2cp
    public final long serializer() {
        return this.RemoteActionCompatParcelizer.getTime();
    }

    public getButton3EK5gGoQ(String str, Bundle bundle, String str2, Date date, boolean z, setLastReportedResult setlastreportedresult) {
        this.serializer = str;
        this.write = bundle == null ? new Bundle() : bundle;
        this.RemoteActionCompatParcelizer = date;
        this.IconCompatParcelizer = str2;
        this.MediaMetadataCompat = z;
        this.MediaSessionCompatQueueItem = setlastreportedresult;
    }

    public final Map write() {
        if (this.read == null) {
            try {
                this.read = this.MediaSessionCompatQueueItem.IconCompatParcelizer();
            } catch (RemoteException e) {
                getButtonThumbLeftEK5gGoQ.write("Error calling measurement proxy:".concat(String.valueOf(e.getMessage())));
            }
        }
        return this.read;
    }
}
