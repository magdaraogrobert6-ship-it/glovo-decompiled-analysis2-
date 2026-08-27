package o;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class getColors {
    public final Vertices read;
    public final ArrayList RatingCompat = new ArrayList(1);
    public boolean IconCompatParcelizer = false;
    public float MediaBrowserCompatMediaItem = 0.0f;
    public Object serializer = null;
    public float RemoteActionCompatParcelizer = -1.0f;
    public float write = -1.0f;

    public abstract Object RemoteActionCompatParcelizer(Lab lab, float f);

    public boolean read() {
        return false;
    }

    public void read(float f) {
        getMiterLxFBmk8 getmiterlxfbmk8 = getRoundLxFBmk8.read;
        Vertices vertices = this.read;
        if (vertices.ParcelableVolumeInfo()) {
            return;
        }
        if (this.RemoteActionCompatParcelizer == -1.0f) {
            this.RemoteActionCompatParcelizer = vertices.MediaSessionCompatQueueItem();
        }
        float f2 = this.RemoteActionCompatParcelizer;
        if (f < f2) {
            if (f2 == -1.0f) {
                this.RemoteActionCompatParcelizer = vertices.MediaSessionCompatQueueItem();
            }
            f = this.RemoteActionCompatParcelizer;
        } else {
            if (this.write == -1.0f) {
                this.write = vertices.MediaMetadataCompat();
            }
            float f3 = this.write;
            if (f > f3) {
                if (f3 == -1.0f) {
                    this.write = vertices.MediaMetadataCompat();
                }
                f = this.write;
            }
        }
        if (f == this.MediaBrowserCompatMediaItem) {
            return;
        }
        this.MediaBrowserCompatMediaItem = f;
        if (!vertices.serializer(f)) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.RatingCompat;
            if (i >= arrayList.size()) {
                getMiterLxFBmk8 getmiterlxfbmk9 = getRoundLxFBmk8.read;
                return;
            } else {
                ((encodeColorList) arrayList.get(i)).serializer();
                i++;
            }
        }
    }

    public final float serializer() {
        Interpolator interpolator;
        getMiterLxFBmk8 getmiterlxfbmk8 = getRoundLxFBmk8.read;
        Lab labMediaDescriptionCompat = this.read.MediaDescriptionCompat();
        if (labMediaDescriptionCompat == null || labMediaDescriptionCompat.RemoteActionCompatParcelizer() || (interpolator = labMediaDescriptionCompat.MediaSessionCompatQueueItem) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(RemoteActionCompatParcelizer());
    }

    public final void write(encodeColorList encodecolorlist) {
        this.RatingCompat.add(encodecolorlist);
    }

    public Object IconCompatParcelizer() {
        float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        Vertices vertices = this.read;
        if (vertices.IconCompatParcelizer(fRemoteActionCompatParcelizer) && !read()) {
            return this.serializer;
        }
        getMiterLxFBmk8 getmiterlxfbmk8 = getRoundLxFBmk8.read;
        Lab labMediaDescriptionCompat = vertices.MediaDescriptionCompat();
        Interpolator interpolator = labMediaDescriptionCompat.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        Interpolator interpolator2 = labMediaDescriptionCompat.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        Object objRemoteActionCompatParcelizer = (interpolator == null || interpolator2 == null) ? RemoteActionCompatParcelizer(labMediaDescriptionCompat, serializer()) : IconCompatParcelizer(labMediaDescriptionCompat, fRemoteActionCompatParcelizer, interpolator.getInterpolation(fRemoteActionCompatParcelizer), interpolator2.getInterpolation(fRemoteActionCompatParcelizer));
        this.serializer = objRemoteActionCompatParcelizer;
        return objRemoteActionCompatParcelizer;
    }

    public final float RemoteActionCompatParcelizer() {
        if (this.IconCompatParcelizer) {
            return 0.0f;
        }
        getMiterLxFBmk8 getmiterlxfbmk8 = getRoundLxFBmk8.read;
        Lab labMediaDescriptionCompat = this.read.MediaDescriptionCompat();
        if (labMediaDescriptionCompat.RemoteActionCompatParcelizer()) {
            return 0.0f;
        }
        return (this.MediaBrowserCompatMediaItem - labMediaDescriptionCompat.IconCompatParcelizer()) / (labMediaDescriptionCompat.read() - labMediaDescriptionCompat.IconCompatParcelizer());
    }

    public getColors(List list) {
        Vertices getvertexmodec2xauai;
        if (list.isEmpty()) {
            getvertexmodec2xauai = new com.huawei.hmf.tasks.a.j(12);
        } else {
            getvertexmodec2xauai = list.size() == 1 ? new getVertexModec2xauaI(list) : new setBlendModeGB0RdKg(list);
        }
        this.read = getvertexmodec2xauai;
    }

    public Object IconCompatParcelizer(Lab lab, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }
}
