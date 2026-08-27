package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class drawPathLG529CI implements getPrimaries, getInverseTransformui_graphics {
    public getInverseTransformui_graphics IconCompatParcelizer;
    public final setRootFocusNodeui MediaBrowserCompatMediaItem;
    public RenderIntentCompanion RatingCompat;
    public final ArrayList RemoteActionCompatParcelizer;
    public int read;
    public List serializer;
    public boolean write;

    @Override // o.getPrimaries
    public final void read() {
        this.write = true;
        Iterator it = this.RemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            ((getPrimaries) it.next()).read();
        }
    }

    @Override // o.getPrimaries
    public final void read(RenderIntentCompanion renderIntentCompanion, getInverseTransformui_graphics getinversetransformui_graphics) {
        this.RatingCompat = renderIntentCompanion;
        this.IconCompatParcelizer = getinversetransformui_graphics;
        this.serializer = (List) this.MediaBrowserCompatMediaItem.write();
        ((getPrimaries) this.RemoteActionCompatParcelizer.get(this.read)).read(renderIntentCompanion, this);
        if (this.write) {
            read();
        }
    }

    @Override // o.getInverseTransformui_graphics
    public final void serializer(Object obj) {
        if (obj != null) {
            this.IconCompatParcelizer.serializer(obj);
        } else {
            IconCompatParcelizer();
        }
    }

    public drawPathLG529CI(ArrayList arrayList, setRootFocusNodeui setrootfocusnodeui) {
        this.MediaBrowserCompatMediaItem = setrootfocusnodeui;
        if (arrayList.isEmpty()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Must not be empty.");
            throw null;
        }
        this.RemoteActionCompatParcelizer = arrayList;
        this.read = 0;
    }

    @Override // o.getPrimaries
    public final r8lambdayJGjSaM_WcsKWad6z3TN2H9P74I RemoteActionCompatParcelizer() {
        return ((getPrimaries) this.RemoteActionCompatParcelizer.get(0)).RemoteActionCompatParcelizer();
    }

    @Override // o.getPrimaries
    public final Class serializer() {
        return ((getPrimaries) this.RemoteActionCompatParcelizer.get(0)).serializer();
    }

    @Override // o.getPrimaries
    public final void write() {
        List list = this.serializer;
        if (list != null) {
            this.MediaBrowserCompatMediaItem.IconCompatParcelizer(list);
        }
        this.serializer = null;
        Iterator it = this.RemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            ((getPrimaries) it.next()).write();
        }
    }

    @Override // o.getInverseTransformui_graphics
    public final void write(Exception exc) {
        List list = this.serializer;
        UrlUtils.serializer(list, "Argument must not be null");
        list.add(exc);
        IconCompatParcelizer();
    }

    public final void IconCompatParcelizer() {
        if (this.write) {
            return;
        }
        if (this.read < this.RemoteActionCompatParcelizer.size() - 1) {
            this.read++;
            read(this.RatingCompat, this.IconCompatParcelizer);
        } else {
            UrlUtils.read(this.serializer);
            this.IconCompatParcelizer.write(new com.bumptech.glide.load.engine.GlideException("Fetch failed", new ArrayList(this.serializer)));
        }
    }
}
