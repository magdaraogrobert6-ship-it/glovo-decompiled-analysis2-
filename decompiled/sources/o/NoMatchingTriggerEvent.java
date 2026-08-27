package o;

import com.sentiance.protobuf.ByteString;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class NoMatchingTriggerEvent extends AbstractList implements SessionStateChangedEventChangeType, RandomAccess {
    public final getInAppMessage write;

    @Override // o.SessionStateChangedEventChangeType
    public final SessionStateChangedEventChangeType IconCompatParcelizer() {
        return this;
    }

    @Override // o.SessionStateChangedEventChangeType
    public final Object IconCompatParcelizer(int i) {
        return this.write.serializer.get(i);
    }

    @Override // o.SessionStateChangedEventChangeType
    public final void IconCompatParcelizer(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.write.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        getSourceEventType getsourceeventtype = new getSourceEventType();
        getsourceeventtype.serializer = this.write.iterator();
        return getsourceeventtype;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        getTriggerAction gettriggeraction = new getTriggerAction();
        gettriggeraction.write = this.write.listIterator(i);
        return gettriggeraction;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.write.serializer.size();
    }

    @Override // o.SessionStateChangedEventChangeType
    public final List write() {
        return Collections.unmodifiableList(this.write.serializer);
    }

    public NoMatchingTriggerEvent(getInAppMessage getinappmessage) {
        this.write = getinappmessage;
    }
}
