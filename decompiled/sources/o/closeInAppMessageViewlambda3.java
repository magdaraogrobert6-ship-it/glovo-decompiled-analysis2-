package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class closeInAppMessageViewlambda3 extends IContentCardsUpdateHandler implements Collection {
    public kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet IconCompatParcelizer;
    public Object RemoteActionCompatParcelizer;
    public final r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ read;
    public Object serializer;

    @Override // o.IContentCardsUpdateHandler
    public final int RemoteActionCompatParcelizer() {
        return this.read.read();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ r8lambdayvdweaikwvq_ojtermd5bm8okkq = this.read;
        if (r8lambdayvdweaikwvq_ojtermd5bm8okkq.containsKey(obj)) {
            return false;
        }
        this.IconCompatParcelizer = null;
        boolean zIsEmpty = isEmpty();
        closelambda20 closelambda20Var = closelambda20.serializer;
        if (zIsEmpty) {
            this.serializer = obj;
            this.RemoteActionCompatParcelizer = obj;
            r8lambdayvdweaikwvq_ojtermd5bm8okkq.put(obj, new addInAppMessageViewToViewGrouplambda4(closelambda20Var, closelambda20Var));
            return true;
        }
        Object obj2 = r8lambdayvdweaikwvq_ojtermd5bm8okkq.get(this.RemoteActionCompatParcelizer);
        obj2.getClass();
        r8lambdayvdweaikwvq_ojtermd5bm8okkq.put(this.RemoteActionCompatParcelizer, new addInAppMessageViewToViewGrouplambda4(((addInAppMessageViewToViewGrouplambda4) obj2).write, obj));
        r8lambdayvdweaikwvq_ojtermd5bm8okkq.put(obj, new addInAppMessageViewToViewGrouplambda4(this.RemoteActionCompatParcelizer, closelambda20Var));
        this.RemoteActionCompatParcelizer = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ r8lambdayvdweaikwvq_ojtermd5bm8okkq = this.read;
        if (!r8lambdayvdweaikwvq_ojtermd5bm8okkq.isEmpty()) {
            this.IconCompatParcelizer = null;
        }
        r8lambdayvdweaikwvq_ojtermd5bm8okkq.clear();
        closelambda20 closelambda20Var = closelambda20.serializer;
        this.serializer = closelambda20Var;
        this.RemoteActionCompatParcelizer = closelambda20Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.read.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new closeInAppMessageViewlambda0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ r8lambdayvdweaikwvq_ojtermd5bm8okkq = this.read;
        addInAppMessageViewToViewGrouplambda4 addinappmessageviewtoviewgrouplambda4 = (addInAppMessageViewToViewGrouplambda4) r8lambdayvdweaikwvq_ojtermd5bm8okkq.remove(obj);
        if (addinappmessageviewtoviewgrouplambda4 == null) {
            return false;
        }
        Object obj2 = addinappmessageviewtoviewgrouplambda4.IconCompatParcelizer;
        Object obj3 = addinappmessageviewtoviewgrouplambda4.write;
        this.IconCompatParcelizer = null;
        closelambda20 closelambda20Var = closelambda20.serializer;
        if (obj3 != closelambda20Var) {
            Object obj4 = r8lambdayvdweaikwvq_ojtermd5bm8okkq.get(obj3);
            obj4.getClass();
            r8lambdayvdweaikwvq_ojtermd5bm8okkq.put(obj3, new addInAppMessageViewToViewGrouplambda4(((addInAppMessageViewToViewGrouplambda4) obj4).write, obj2));
        } else {
            this.serializer = obj2;
        }
        if (obj2 == closelambda20Var) {
            this.RemoteActionCompatParcelizer = obj3;
            return true;
        }
        Object obj5 = r8lambdayvdweaikwvq_ojtermd5bm8okkq.get(obj2);
        obj5.getClass();
        r8lambdayvdweaikwvq_ojtermd5bm8okkq.put(obj2, new addInAppMessageViewToViewGrouplambda4(obj3, ((addInAppMessageViewToViewGrouplambda4) obj5).IconCompatParcelizer));
        return true;
    }

    public final kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet write() {
        kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet persistentOrderedSet = this.IconCompatParcelizer;
        r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ r8lambdayvdweaikwvq_ojtermd5bm8okkq = this.read;
        if (persistentOrderedSet != null) {
            r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg r8lambdauemxp1whxmekjnoforsh61ohmwg = r8lambdayvdweaikwvq_ojtermd5bm8okkq.serializer;
            return persistentOrderedSet;
        }
        r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg r8lambdauemxp1whxmekjnoforsh61ohmwg2 = r8lambdayvdweaikwvq_ojtermd5bm8okkq.serializer;
        kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet persistentOrderedSet2 = new kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet(this.serializer, this.RemoteActionCompatParcelizer, r8lambdayvdweaikwvq_ojtermd5bm8okkq.serializer());
        this.IconCompatParcelizer = persistentOrderedSet2;
        return persistentOrderedSet2;
    }

    public closeInAppMessageViewlambda3(kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet persistentOrderedSet) {
        this.IconCompatParcelizer = persistentOrderedSet;
        this.serializer = persistentOrderedSet.read;
        this.RemoteActionCompatParcelizer = persistentOrderedSet.RemoteActionCompatParcelizer;
        r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg r8lambdauemxp1whxmekjnoforsh61ohmwg = persistentOrderedSet.serializer;
        r8lambdauemxp1whxmekjnoforsh61ohmwg.getClass();
        this.read = new r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ(r8lambdauemxp1whxmekjnoforsh61ohmwg);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (RemoteActionCompatParcelizer() != set.size()) {
            return false;
        }
        boolean z = set instanceof kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet;
        r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ r8lambdayvdweaikwvq_ojtermd5bm8okkq = this.read;
        if (z) {
            return r8lambdayvdweaikwvq_ojtermd5bm8okkq.IconCompatParcelizer.serializer(((kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet) obj).serializer.IconCompatParcelizer, new DefaultContentCardView(29));
        }
        if (set instanceof closeInAppMessageViewlambda3) {
            return r8lambdayvdweaikwvq_ojtermd5bm8okkq.IconCompatParcelizer.serializer(((closeInAppMessageViewlambda3) obj).read.IconCompatParcelizer, new getCloseButton(1));
        }
        return super.equals(obj);
    }
}
