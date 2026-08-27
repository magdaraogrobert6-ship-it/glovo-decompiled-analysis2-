package o;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class getModulate0nO6VwU {
    public boolean IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public getSoftlight0nO6VwU write;

    public final void IconCompatParcelizer() {
        this.serializer = -1;
        this.read = Integer.MIN_VALUE;
        this.IconCompatParcelizer = false;
        this.RemoteActionCompatParcelizer = false;
    }

    public final void RemoteActionCompatParcelizer(int i, View view) {
        int iMediaBrowserCompatMediaItem = this.write.MediaBrowserCompatMediaItem();
        if (iMediaBrowserCompatMediaItem >= 0) {
            boolean z = this.IconCompatParcelizer;
            getSoftlight0nO6VwU getsoftlight0no6vwu = this.write;
            if (z) {
                this.read = this.write.MediaBrowserCompatMediaItem() + getsoftlight0no6vwu.write(view);
            } else {
                this.read = getsoftlight0no6vwu.RemoteActionCompatParcelizer(view);
            }
            this.serializer = i;
            return;
        }
        this.serializer = i;
        boolean z2 = this.IconCompatParcelizer;
        getSoftlight0nO6VwU getsoftlight0no6vwu2 = this.write;
        if (!z2) {
            int iRemoteActionCompatParcelizer = getsoftlight0no6vwu2.RemoteActionCompatParcelizer(view);
            int iIconCompatParcelizer = iRemoteActionCompatParcelizer - this.write.IconCompatParcelizer();
            this.read = iRemoteActionCompatParcelizer;
            if (iIconCompatParcelizer > 0) {
                int iIconCompatParcelizer2 = this.write.IconCompatParcelizer(view);
                int iWrite = (this.write.write() - Math.min(0, (this.write.write() - iMediaBrowserCompatMediaItem) - this.write.write(view))) - (iIconCompatParcelizer2 + iRemoteActionCompatParcelizer);
                if (iWrite < 0) {
                    this.read -= Math.min(iIconCompatParcelizer, -iWrite);
                    return;
                }
                return;
            }
            return;
        }
        int iWrite2 = (getsoftlight0no6vwu2.write() - iMediaBrowserCompatMediaItem) - this.write.write(view);
        this.read = this.write.write() - iWrite2;
        if (iWrite2 > 0) {
            int iIconCompatParcelizer3 = this.write.IconCompatParcelizer(view);
            int i2 = this.read;
            int iIconCompatParcelizer4 = this.write.IconCompatParcelizer();
            int iMin = (i2 - iIconCompatParcelizer3) - (Math.min(this.write.RemoteActionCompatParcelizer(view) - iIconCompatParcelizer4, 0) + iIconCompatParcelizer4);
            if (iMin < 0) {
                this.read = Math.min(iWrite2, -iMin) + this.read;
            }
        }
    }

    public final void serializer() {
        boolean z = this.IconCompatParcelizer;
        getSoftlight0nO6VwU getsoftlight0no6vwu = this.write;
        this.read = z ? getsoftlight0no6vwu.write() : getsoftlight0no6vwu.IconCompatParcelizer();
    }

    public getModulate0nO6VwU() {
        IconCompatParcelizer();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
        sb.append(this.serializer);
        sb.append(", mCoordinate=");
        sb.append(this.read);
        sb.append(", mLayoutFromEnd=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", mValid=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.RemoteActionCompatParcelizer, '}');
    }
}
