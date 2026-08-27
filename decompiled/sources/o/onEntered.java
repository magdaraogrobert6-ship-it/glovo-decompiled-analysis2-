package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class onEntered extends DefaultContentCardsViewBindingHandlerWhenMappings implements Map {
    public DragAndDropNodeonEnded1 IconCompatParcelizer = new DragAndDropNodeonEnded1();
    public int RatingCompat;
    public int RemoteActionCompatParcelizer;
    public getSizeYbymL2gui read;
    public requestDragAndDropTransferk4lQ0M serializer;
    public Object write;

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.write = null;
        this.serializer = this.serializer.RemoteActionCompatParcelizer(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.write;
    }

    @Override // o.DefaultContentCardsViewBindingHandlerWhenMappings
    public final int read() {
        return this.RatingCompat;
    }

    public getSizeYbymL2gui serializer() {
        return serializer();
    }

    /* JADX INFO: renamed from: IconCompatParcelizer */
    public getSizeYbymL2gui serializer() {
        requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0m = this.serializer;
        getSizeYbymL2gui getsizeybyml2gui = this.read;
        if (requestdraganddroptransferk4lq0m != getsizeybyml2gui.RemoteActionCompatParcelizer) {
            this.IconCompatParcelizer = new DragAndDropNodeonEnded1();
            getsizeybyml2gui = new getSizeYbymL2gui(this.serializer, read());
        }
        this.read = getsizeybyml2gui;
        return getsizeybyml2gui;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.serializer = requestDragAndDropTransferk4lQ0M.IconCompatParcelizer;
        write(0);
    }

    public final void write(int i) {
        this.RatingCompat = i;
        this.RemoteActionCompatParcelizer++;
    }

    public onEntered(getSizeYbymL2gui getsizeybyml2gui) {
        this.read = getsizeybyml2gui;
        this.serializer = getsizeybyml2gui.RemoteActionCompatParcelizer;
        this.RatingCompat = getsizeybyml2gui.size();
    }

    @Override // o.DefaultContentCardsViewBindingHandlerWhenMappings
    public final Collection MediaSessionCompatQueueItem() {
        return new r8lambdawnDbB7BRZlRgckuAh7M80S4G1I(this, 1);
    }

    @Override // o.DefaultContentCardsViewBindingHandlerWhenMappings
    public final Set RemoteActionCompatParcelizer() {
        return new onMoved(0, this);
    }

    @Override // o.DefaultContentCardsViewBindingHandlerWhenMappings
    public final Set write() {
        return new onMoved(1, this);
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = read();
        requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0mIconCompatParcelizer = this.serializer.IconCompatParcelizer(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (requestdraganddroptransferk4lq0mIconCompatParcelizer == null) {
            requestdraganddroptransferk4lq0mIconCompatParcelizer = requestDragAndDropTransferk4lQ0M.IconCompatParcelizer;
        }
        this.serializer = requestdraganddroptransferk4lq0mIconCompatParcelizer;
        return i != read();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.serializer.IconCompatParcelizer(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.serializer.serializer(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        getSizeYbymL2gui getsizeybyml2guiSerializer = null;
        getSizeYbymL2gui getsizeybyml2gui = map instanceof getSizeYbymL2gui ? (getSizeYbymL2gui) map : null;
        if (getsizeybyml2gui == null) {
            onEntered onentered = map instanceof onEntered ? (onEntered) map : null;
            if (onentered != null) {
                getsizeybyml2guiSerializer = onentered.serializer();
            }
        } else {
            getsizeybyml2guiSerializer = getsizeybyml2gui;
        }
        if (getsizeybyml2guiSerializer == null) {
            super.putAll(map);
            return;
        }
        DragAndDropNodedrag1 dragAndDropNodedrag1 = new DragAndDropNodedrag1();
        dragAndDropNodedrag1.write = 0;
        int i = this.RatingCompat;
        requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0m = this.serializer;
        requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0m2 = getsizeybyml2guiSerializer.RemoteActionCompatParcelizer;
        requestdraganddroptransferk4lq0m2.getClass();
        this.serializer = requestdraganddroptransferk4lq0m.IconCompatParcelizer(requestdraganddroptransferk4lq0m2, 0, dragAndDropNodedrag1, this);
        int size = (getsizeybyml2guiSerializer.size() + i) - dragAndDropNodedrag1.write;
        if (i != size) {
            write(size);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.write = null;
        requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0mIconCompatParcelizer = this.serializer.IconCompatParcelizer(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (requestdraganddroptransferk4lq0mIconCompatParcelizer == null) {
            requestdraganddroptransferk4lq0mIconCompatParcelizer = requestDragAndDropTransferk4lQ0M.IconCompatParcelizer;
        }
        this.serializer = requestdraganddroptransferk4lq0mIconCompatParcelizer;
        return this.write;
    }
}
