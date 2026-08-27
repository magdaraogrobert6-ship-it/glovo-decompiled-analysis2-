package o;

import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class measureOnly extends MeasurePassDelegatelayoutChildrenBlock11 {
    public long IconCompatParcelizer;
    public byte MediaBrowserCompatMediaItem;
    public long RatingCompat;
    public int RemoteActionCompatParcelizer;
    public boolean read;
    public Double serializer;
    public int write;

    public final measureAndLayout0kLqBqw read() {
        if (this.MediaBrowserCompatMediaItem == 31) {
            return new measureAndLayout0kLqBqw(this.serializer, this.write, this.read, this.RemoteActionCompatParcelizer, this.RatingCompat, this.IconCompatParcelizer);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.MediaBrowserCompatMediaItem & 1) == 0) {
            sb.append(" batteryVelocity");
        }
        if ((this.MediaBrowserCompatMediaItem & 2) == 0) {
            sb.append(" proximityOn");
        }
        if ((this.MediaBrowserCompatMediaItem & 4) == 0) {
            sb.append(" orientation");
        }
        if ((this.MediaBrowserCompatMediaItem & 8) == 0) {
            sb.append(" ramUsed");
        }
        if ((this.MediaBrowserCompatMediaItem & 16) == 0) {
            sb.append(" diskUsed");
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
        return null;
    }
}
