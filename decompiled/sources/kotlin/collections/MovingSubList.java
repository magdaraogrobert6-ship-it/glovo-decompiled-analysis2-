package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;
import o.DefaultContentCardsViewBindingHandlerCompanionCREATOR1;

/* JADX INFO: loaded from: classes4.dex */
public final class MovingSubList extends AbstractList implements RandomAccess {
    public int IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public int serializer;
    public final List write;

    public MovingSubList(AbstractList abstractList, int i, int i2) {
        this.write = abstractList;
        this.IconCompatParcelizer = i;
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1 defaultContentCardsViewBindingHandlerCompanionCREATOR1 = AbstractList.MediaDescriptionCompat;
        int size = abstractList.size();
        defaultContentCardsViewBindingHandlerCompanionCREATOR1.getClass();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1.IconCompatParcelizer(i, i2, size);
        this.serializer = i2 - i;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.RemoteActionCompatParcelizer;
        List list = this.write;
        if (i2 != 0) {
            DefaultContentCardsViewBindingHandlerCompanionCREATOR1 defaultContentCardsViewBindingHandlerCompanionCREATOR1 = AbstractList.MediaDescriptionCompat;
            int i3 = this.serializer;
            defaultContentCardsViewBindingHandlerCompanionCREATOR1.getClass();
            DefaultContentCardsViewBindingHandlerCompanionCREATOR1.serializer(i, i3);
            return ((AbstractList) list).get(this.IconCompatParcelizer + i);
        }
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1 defaultContentCardsViewBindingHandlerCompanionCREATOR2 = AbstractList.MediaDescriptionCompat;
        int i4 = this.serializer;
        defaultContentCardsViewBindingHandlerCompanionCREATOR2.getClass();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1.serializer(i, i4);
        return list.get(this.IconCompatParcelizer + i);
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.RemoteActionCompatParcelizer != 0 ? this.serializer : this.serializer;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public List subList(int i, int i2) {
        if (this.RemoteActionCompatParcelizer != 1) {
            return super.subList(i, i2);
        }
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1 defaultContentCardsViewBindingHandlerCompanionCREATOR1 = AbstractList.MediaDescriptionCompat;
        int i3 = this.serializer;
        defaultContentCardsViewBindingHandlerCompanionCREATOR1.getClass();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1.IconCompatParcelizer(i, i2, i3);
        AbstractList abstractList = (AbstractList) this.write;
        int i4 = this.IconCompatParcelizer;
        return new MovingSubList(abstractList, i + i4, i4 + i2);
    }

    public MovingSubList(List list) {
        this.write = list;
    }
}
