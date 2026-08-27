package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import java.util.Collection;
import java.util.Iterator;
import o.DragAndDropNodeonEnded1;
import o.IContentCardsViewBindingHandler;
import o.acceptDragAndDropTransfer;
import o.closeInAppMessageViewlambda2;
import o.displayInAppMessagelambda121;
import o.getSizeYbymL2gui;

/* JADX INFO: loaded from: classes.dex */
public final class PersistentOrderedSet extends IContentCardsViewBindingHandler implements acceptDragAndDropTransfer, Collection, displayInAppMessagelambda121 {
    public static final PersistentOrderedSet IconCompatParcelizer;
    public final Object RemoteActionCompatParcelizer;
    public final Object read;
    public final getSizeYbymL2gui serializer;

    static {
        DragAndDropNodeonEnded1 dragAndDropNodeonEnded1 = DragAndDropNodeonEnded1.write;
        IconCompatParcelizer = new PersistentOrderedSet(dragAndDropNodeonEnded1, dragAndDropNodeonEnded1, getSizeYbymL2gui.read);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.serializer.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.serializer.size();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new closeInAppMessageViewlambda2(this.read, this.serializer, 1);
    }

    public PersistentOrderedSet(Object obj, Object obj2, getSizeYbymL2gui getsizeybyml2gui) {
        this.read = obj;
        this.RemoteActionCompatParcelizer = obj2;
        this.serializer = getsizeybyml2gui;
    }
}
