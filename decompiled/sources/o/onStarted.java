package o;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class onStarted extends IContentCardsViewBindingHandler implements acceptDragAndDropTransfer {
    public final /* synthetic */ int serializer;
    public final getSizeYbymL2gui write;

    public /* synthetic */ onStarted(getSizeYbymL2gui getsizeybyml2gui, int i) {
        this.serializer = i;
        this.write = getsizeybyml2gui;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.serializer;
        getSizeYbymL2gui getsizeybyml2gui = this.write;
        if (i == 0) {
            return getsizeybyml2gui.containsKey(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = getsizeybyml2gui.get(entry.getKey());
            if (obj2 != null) {
                return obj2.equals(entry.getValue());
            }
            if (entry.getValue() == null && getsizeybyml2gui.containsKey(entry.getKey())) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        int i = this.serializer;
        getSizeYbymL2gui getsizeybyml2gui = this.write;
        return i != 0 ? getsizeybyml2gui.size() : getsizeybyml2gui.size();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.serializer;
        getSizeYbymL2gui getsizeybyml2gui = this.write;
        if (i != 0) {
            requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0m = getsizeybyml2gui.RemoteActionCompatParcelizer;
            startDragAndDropTransferd4ec7I[] startdraganddroptransferd4ec7iArr = new startDragAndDropTransferd4ec7I[8];
            for (int i2 = 0; i2 < 8; i2++) {
                startdraganddroptransferd4ec7iArr[i2] = new DragAndDropNodeCompanion(1);
            }
            return new setSizeozmzZPIui(requestdraganddroptransferk4lq0m, startdraganddroptransferd4ec7iArr);
        }
        requestDragAndDropTransferk4lQ0M requestdraganddroptransferk4lq0m2 = getsizeybyml2gui.RemoteActionCompatParcelizer;
        startDragAndDropTransferd4ec7I[] startdraganddroptransferd4ec7iArr2 = new startDragAndDropTransferd4ec7I[8];
        for (int i3 = 0; i3 < 8; i3++) {
            startdraganddroptransferd4ec7iArr2[i3] = new DragAndDropNodeCompanion(0);
        }
        return new setSizeozmzZPIui(requestdraganddroptransferk4lq0m2, startdraganddroptransferd4ec7iArr2);
    }
}
