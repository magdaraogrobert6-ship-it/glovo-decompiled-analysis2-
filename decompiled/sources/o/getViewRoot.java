package o;

import android.content.Context;
import android.os.Looper;
import com.huawei.location.Vw$Vw;
import com.huawei.riemann.common.api.location.CityTileCallback;
import com.huawei.riemann.location.SdmLocationAlgoWrapper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class getViewRoot {
    public final Context MediaBrowserCompatMediaItem;
    public final SdmLocationAlgoWrapper MediaDescriptionCompat;
    public getOnViewCreatedCallback MediaSessionCompatQueueItem;
    public ViewTreeHostDefaultProvider RemoteActionCompatParcelizer;
    public getOnViewCreatedCallback serializer;
    public final ArrayList write = new ArrayList();
    public boolean IconCompatParcelizer = false;
    public Vw$Vw MediaMetadataCompat = null;
    public CityTileCallback RatingCompat = null;
    public volatile boolean read = false;

    public getViewRoot(Context context, Looper looper, String str) {
        this.MediaDescriptionCompat = null;
        this.MediaBrowserCompatMediaItem = context;
        if (SdmLocationAlgoWrapper.read == null) {
            synchronized (SdmLocationAlgoWrapper.RemoteActionCompatParcelizer) {
                if (SdmLocationAlgoWrapper.read == null) {
                    SdmLocationAlgoWrapper.read = new SdmLocationAlgoWrapper(context, str);
                }
            }
        }
        this.MediaDescriptionCompat = SdmLocationAlgoWrapper.read;
        IconCompatParcelizer(looper);
        int i = getSubCompositionView.serializer;
    }

    public final void IconCompatParcelizer(Looper looper) {
        int i = 1;
        if (!this.IconCompatParcelizer) {
            if (looper == null) {
                this.serializer = Looper.myLooper() == null ? new getOnViewCreatedCallback(this, this.MediaBrowserCompatMediaItem.getMainLooper(), i) : new getOnViewCreatedCallback(this);
            } else {
                this.serializer = new getOnViewCreatedCallback(this, looper, i);
            }
            ViewTreeHostDefaultProvider viewTreeHostDefaultProvider = new ViewTreeHostDefaultProvider("SdmLocationManagerThread", 0);
            this.RemoteActionCompatParcelizer = viewTreeHostDefaultProvider;
            viewTreeHostDefaultProvider.start();
            this.MediaSessionCompatQueueItem = new getOnViewCreatedCallback(this, this.RemoteActionCompatParcelizer.getLooper(), 0);
        }
        this.IconCompatParcelizer = true;
    }
}
