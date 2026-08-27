package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class getSizeYbymL2gui extends getContentCardsViewFromCache implements Map {
    public static final getSizeYbymL2gui read = new getSizeYbymL2gui(requestDragAndDropTransferk4lQ0M.IconCompatParcelizer, 0);
    public final requestDragAndDropTransferk4lQ0M RemoteActionCompatParcelizer;
    public final int serializer;

    public onEntered IconCompatParcelizer() {
        return serializer();
    }

    @Override // o.getContentCardsViewFromCache
    public final int RemoteActionCompatParcelizer() {
        return this.serializer;
    }

    public onEntered serializer() {
        return new onEntered(this);
    }

    public getSizeYbymL2gui(requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0m, int i) {
        this.RemoteActionCompatParcelizer = requestdraganddroptransferk4lq0m;
        this.serializer = i;
    }

    @Override // o.getContentCardsViewFromCache
    public final Collection MediaSessionCompatQueueItem() {
        return new addInAppMessageViewToViewGrouplambda0(this, 1);
    }

    public final getSizeYbymL2gui RemoteActionCompatParcelizer(Object obj, invokeUv8p0NA invokeuv8p0na) {
        CSSParseException cSSParseExceptionRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(obj != null ? obj.hashCode() : 0, 0, obj, invokeuv8p0na);
        return cSSParseExceptionRemoteActionCompatParcelizer == null ? this : new getSizeYbymL2gui((requestDragAndDropTransferk4lQ0M) cSSParseExceptionRemoteActionCompatParcelizer.RemoteActionCompatParcelizer, size() + cSSParseExceptionRemoteActionCompatParcelizer.IconCompatParcelizer);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.RemoteActionCompatParcelizer.serializer(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // o.getContentCardsViewFromCache
    public final Set read() {
        return new onStarted(this, 0);
    }

    @Override // o.getContentCardsViewFromCache
    public final Set write() {
        return new onStarted(this, 1);
    }
}
