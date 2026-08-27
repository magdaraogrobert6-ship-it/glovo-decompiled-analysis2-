package kotlin.enums;

import java.io.Serializable;
import java.util.RandomAccess;
import kotlin.collections.AbstractList;
import o.DefaultContentCardsViewBindingHandlerCompanionCREATOR1;
import o.onContentCardClicked;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;

/* JADX INFO: loaded from: classes4.dex */
public final class EnumEntriesList extends AbstractList implements r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U, RandomAccess, Serializable {
    public final Enum[] read;

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i) {
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1 defaultContentCardsViewBindingHandlerCompanionCREATOR1 = AbstractList.MediaDescriptionCompat;
        Enum[] enumArr = this.read;
        int length = enumArr.length;
        defaultContentCardsViewBindingHandlerCompanionCREATOR1.getClass();
        DefaultContentCardsViewBindingHandlerCompanionCREATOR1.serializer(i, length);
        return enumArr[i];
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.read.length;
    }

    public EnumEntriesList(Enum[] enumArr) {
        enumArr.getClass();
        this.read = enumArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        return ((Enum) onContentCardClicked.IconCompatParcelizer(r4.ordinal(), this.read)) == r4;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int iOrdinal = r4.ordinal();
        if (((Enum) onContentCardClicked.IconCompatParcelizer(iOrdinal, this.read)) == r4) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int iOrdinal = r4.ordinal();
        if (((Enum) onContentCardClicked.IconCompatParcelizer(iOrdinal, this.read)) == r4) {
            return iOrdinal;
        }
        return -1;
    }
}
