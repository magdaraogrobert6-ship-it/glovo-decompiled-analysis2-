package kotlinx.collections.immutable.implementations.persistentOrderedSet;

import java.util.Iterator;
import java.util.Set;
import o.DefaultContentCardView;
import o.IContentCardsViewBindingHandler;
import o.closeInAppMessageViewlambda2;
import o.closeInAppMessageViewlambda3;
import o.closelambda20;
import o.r8lambda9saPDiQX6C5HcUvRgmuVyXEkHj8;
import o.r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg;

/* JADX INFO: loaded from: classes4.dex */
public final class PersistentOrderedSet extends IContentCardsViewBindingHandler implements r8lambda9saPDiQX6C5HcUvRgmuVyXEkHj8 {
    public static final PersistentOrderedSet write;
    public final Object RemoteActionCompatParcelizer;
    public final Object read;
    public final r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg serializer;

    static {
        r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg r8lambdauemxp1whxmekjnoforsh61ohmwg = r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg.serializer;
        r8lambdauemxp1whxmekjnoforsh61ohmwg.getClass();
        closelambda20 closelambda20Var = closelambda20.serializer;
        write = new PersistentOrderedSet(closelambda20Var, closelambda20Var, r8lambdauemxp1whxmekjnoforsh61ohmwg);
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
        return new closeInAppMessageViewlambda2(this.read, this.serializer, 0);
    }

    public PersistentOrderedSet(Object obj, Object obj2, r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg r8lambdauemxp1whxmekjnoforsh61ohmwg) {
        r8lambdauemxp1whxmekjnoforsh61ohmwg.getClass();
        this.read = obj;
        this.RemoteActionCompatParcelizer = obj2;
        this.serializer = r8lambdauemxp1whxmekjnoforsh61ohmwg;
    }

    @Override // o.IContentCardsViewBindingHandler, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        boolean z = set instanceof PersistentOrderedSet;
        r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg r8lambdauemxp1whxmekjnoforsh61ohmwg = this.serializer;
        if (z) {
            return r8lambdauemxp1whxmekjnoforsh61ohmwg.IconCompatParcelizer.serializer(((PersistentOrderedSet) obj).serializer.IconCompatParcelizer, new DefaultContentCardView(27));
        }
        if (set instanceof closeInAppMessageViewlambda3) {
            return r8lambdauemxp1whxmekjnoforsh61ohmwg.IconCompatParcelizer.serializer(((closeInAppMessageViewlambda3) obj).read.IconCompatParcelizer, new DefaultContentCardView(28));
        }
        return super.equals(obj);
    }
}
