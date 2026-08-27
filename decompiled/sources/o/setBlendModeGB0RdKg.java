package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class setBlendModeGB0RdKg implements Vertices {
    public final List serializer;
    public Lab IconCompatParcelizer = null;
    public float write = -1.0f;
    public Lab read = write(0.0f);

    @Override // o.Vertices
    public final Lab MediaDescriptionCompat() {
        return this.read;
    }

    @Override // o.Vertices
    public final boolean ParcelableVolumeInfo() {
        return false;
    }

    public final Lab write(float f) {
        List list = this.serializer;
        Lab lab = (Lab) r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer(1, list);
        if (f >= lab.IconCompatParcelizer()) {
            return lab;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            Lab lab2 = (Lab) list.get(size);
            if (this.read != lab2 && f >= lab2.IconCompatParcelizer() && f < lab2.read()) {
                return lab2;
            }
        }
        return (Lab) list.get(0);
    }

    @Override // o.Vertices
    public final boolean IconCompatParcelizer(float f) {
        Lab lab = this.IconCompatParcelizer;
        Lab lab2 = this.read;
        if (lab == lab2 && this.write == f) {
            return true;
        }
        this.IconCompatParcelizer = lab2;
        this.write = f;
        return false;
    }

    @Override // o.Vertices
    public final boolean serializer(float f) {
        Lab lab = this.read;
        if (f >= lab.IconCompatParcelizer() && f < lab.read()) {
            return !this.read.RemoteActionCompatParcelizer();
        }
        this.read = write(f);
        return true;
    }

    @Override // o.Vertices
    public final float MediaMetadataCompat() {
        return ((Lab) r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer(1, this.serializer)).read();
    }

    @Override // o.Vertices
    public final float MediaSessionCompatQueueItem() {
        return ((Lab) this.serializer.get(0)).IconCompatParcelizer();
    }

    public setBlendModeGB0RdKg(List list) {
        this.serializer = list;
    }
}
