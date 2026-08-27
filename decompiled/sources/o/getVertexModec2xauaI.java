package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class getVertexModec2xauaI implements Vertices {
    public float RemoteActionCompatParcelizer = -1.0f;
    public final Lab write;

    @Override // o.Vertices
    public final Lab MediaDescriptionCompat() {
        return this.write;
    }

    @Override // o.Vertices
    public final boolean ParcelableVolumeInfo() {
        return false;
    }

    @Override // o.Vertices
    public final float MediaMetadataCompat() {
        return this.write.read();
    }

    @Override // o.Vertices
    public final float MediaSessionCompatQueueItem() {
        return this.write.IconCompatParcelizer();
    }

    @Override // o.Vertices
    public final boolean serializer(float f) {
        return !this.write.RemoteActionCompatParcelizer();
    }

    public getVertexModec2xauaI(List list) {
        this.write = (Lab) list.get(0);
    }

    @Override // o.Vertices
    public final boolean IconCompatParcelizer(float f) {
        if (this.RemoteActionCompatParcelizer == f) {
            return true;
        }
        this.RemoteActionCompatParcelizer = f;
        return false;
    }
}
