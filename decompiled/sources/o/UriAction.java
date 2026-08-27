package o;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.io.TextStreamsKt;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes4.dex */
public final class UriAction {
    public int RemoteActionCompatParcelizer;
    public Long read;
    public r8lambdaPxfX9i9Wwy9Pn8nj6G6PUQyZ20 serializer;
    public volatile FormBody.Builder IconCompatParcelizer = new FormBody.Builder(28);
    public FormBody.Builder write = new FormBody.Builder(28);
    public final HashSet MediaBrowserCompatMediaItem = new HashSet();

    public final boolean RemoteActionCompatParcelizer() {
        return this.read != null;
    }

    public final long IconCompatParcelizer() {
        return ((AtomicLong) this.write.RemoteActionCompatParcelizer).get() + ((AtomicLong) this.write.serializer).get();
    }

    public final void RemoteActionCompatParcelizer(long j) {
        this.read = Long.valueOf(j);
        this.RemoteActionCompatParcelizer++;
        Iterator it = this.MediaBrowserCompatMediaItem.iterator();
        while (it.hasNext()) {
            ((r8lambdatUS6XQ_eCqvrQ4AX_ZhZEa3usI) it.next()).PlaybackStateCompat();
        }
    }

    public final String toString() {
        return "AddressTracker{subchannels=" + this.MediaBrowserCompatMediaItem + '}';
    }

    public final void IconCompatParcelizer(r8lambdatUS6XQ_eCqvrQ4AX_ZhZEa3usI r8lambdatus6xq_ecqvrq4ax_zhzea3usi) {
        if (RemoteActionCompatParcelizer() && !r8lambdatus6xq_ecqvrq4ax_zhzea3usi.write) {
            r8lambdatus6xq_ecqvrq4ax_zhzea3usi.PlaybackStateCompat();
        } else if (!RemoteActionCompatParcelizer() && r8lambdatus6xq_ecqvrq4ax_zhzea3usi.write) {
            r8lambdatus6xq_ecqvrq4ax_zhzea3usi.write = false;
            PackageUtils packageUtils = r8lambdatus6xq_ecqvrq4ax_zhzea3usi.RemoteActionCompatParcelizer;
            if (packageUtils != null) {
                r8lambdatus6xq_ecqvrq4ax_zhzea3usi.MediaSessionCompatQueueItem.write(packageUtils);
                r8lambdatus6xq_ecqvrq4ax_zhzea3usi.RatingCompat.IconCompatParcelizer(optEnum.INFO, "Subchannel unejected: {0}", r8lambdatus6xq_ecqvrq4ax_zhzea3usi);
            }
        }
        r8lambdatus6xq_ecqvrq4ax_zhzea3usi.serializer = this;
        this.MediaBrowserCompatMediaItem.add(r8lambdatus6xq_ecqvrq4ax_zhzea3usi);
    }

    public UriAction(r8lambdaPxfX9i9Wwy9Pn8nj6G6PUQyZ20 r8lambdapxfx9i9wwy9pn8nj6g6puqyz20) {
        this.serializer = r8lambdapxfx9i9wwy9pn8nj6g6puqyz20;
    }

    public final void read() {
        TextStreamsKt.RemoteActionCompatParcelizer("not currently ejected", this.read != null);
        this.read = null;
        for (r8lambdatUS6XQ_eCqvrQ4AX_ZhZEa3usI r8lambdatus6xq_ecqvrq4ax_zhzea3usi : this.MediaBrowserCompatMediaItem) {
            r8lambdatus6xq_ecqvrq4ax_zhzea3usi.write = false;
            PackageUtils packageUtils = r8lambdatus6xq_ecqvrq4ax_zhzea3usi.RemoteActionCompatParcelizer;
            if (packageUtils != null) {
                r8lambdatus6xq_ecqvrq4ax_zhzea3usi.MediaSessionCompatQueueItem.write(packageUtils);
                r8lambdatus6xq_ecqvrq4ax_zhzea3usi.RatingCompat.IconCompatParcelizer(optEnum.INFO, "Subchannel unejected: {0}", r8lambdatus6xq_ecqvrq4ax_zhzea3usi);
            }
        }
    }
}
