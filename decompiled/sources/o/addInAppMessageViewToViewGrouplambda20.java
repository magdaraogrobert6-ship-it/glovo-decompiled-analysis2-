package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class addInAppMessageViewToViewGrouplambda20 extends getContentCardsViewFromCache implements r8lambdaKGJqwjLmUs58_kpRh__GGuNRqTQ {
    public static final addInAppMessageViewToViewGrouplambda20 IconCompatParcelizer;
    public final Object RemoteActionCompatParcelizer;
    public final r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg read;
    public final Object serializer;

    public final r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg IconCompatParcelizer() {
        return this.read;
    }

    static {
        r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg r8lambdauemxp1whxmekjnoforsh61ohmwg = r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg.serializer;
        r8lambdauemxp1whxmekjnoforsh61ohmwg.getClass();
        closelambda20 closelambda20Var = closelambda20.serializer;
        IconCompatParcelizer = new addInAppMessageViewToViewGrouplambda20(closelambda20Var, closelambda20Var, r8lambdauemxp1whxmekjnoforsh61ohmwg);
    }

    @Override // o.getContentCardsViewFromCache
    public final int RemoteActionCompatParcelizer() {
        return this.read.size();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.read.containsKey(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        addInAppMessageViewToViewGrouplambda2 addinappmessageviewtoviewgrouplambda2 = (addInAppMessageViewToViewGrouplambda2) this.read.get(obj);
        if (addinappmessageviewtoviewgrouplambda2 != null) {
            return addinappmessageviewtoviewgrouplambda2.write;
        }
        return null;
    }

    public addInAppMessageViewToViewGrouplambda20(Object obj, Object obj2, r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg r8lambdauemxp1whxmekjnoforsh61ohmwg) {
        r8lambdauemxp1whxmekjnoforsh61ohmwg.getClass();
        this.serializer = obj;
        this.RemoteActionCompatParcelizer = obj2;
        this.read = r8lambdauemxp1whxmekjnoforsh61ohmwg;
    }

    @Override // o.getContentCardsViewFromCache
    public final Collection MediaSessionCompatQueueItem() {
        return new addInAppMessageViewToViewGrouplambda0(this, 2);
    }

    public final r8lambdaKGJqwjLmUs58_kpRh__GGuNRqTQ RemoteActionCompatParcelizer(Map map) {
        map.getClass();
        if (map.isEmpty()) {
            return this;
        }
        addInAppMessageViewToViewGrouplambda22 addinappmessageviewtoviewgrouplambda22 = new addInAppMessageViewToViewGrouplambda22(this);
        addinappmessageviewtoviewgrouplambda22.putAll(map);
        return addinappmessageviewtoviewgrouplambda22.serializer();
    }

    @Override // o.getContentCardsViewFromCache
    public final Set read() {
        return new closelambda1(this, 0);
    }

    @Override // o.getContentCardsViewFromCache
    public final Set write() {
        return new closelambda1(this, 1);
    }

    @Override // o.getContentCardsViewFromCache, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        boolean z = map instanceof addInAppMessageViewToViewGrouplambda20;
        r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg r8lambdauemxp1whxmekjnoforsh61ohmwg = this.read;
        if (z) {
            return r8lambdauemxp1whxmekjnoforsh61ohmwg.IconCompatParcelizer.serializer(((addInAppMessageViewToViewGrouplambda20) obj).read.IconCompatParcelizer, addInAppMessageViewToViewGrouplambda21.RemoteActionCompatParcelizer);
        }
        if (map instanceof addInAppMessageViewToViewGrouplambda22) {
            return r8lambdauemxp1whxmekjnoforsh61ohmwg.IconCompatParcelizer.serializer(((addInAppMessageViewToViewGrouplambda22) obj).write.IconCompatParcelizer, addInAppMessageViewToViewGrouplambda21.IconCompatParcelizer);
        }
        if (map instanceof r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg) {
            return r8lambdauemxp1whxmekjnoforsh61ohmwg.IconCompatParcelizer.serializer(((r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg) obj).IconCompatParcelizer, addInAppMessageViewToViewGrouplambda21.write);
        }
        if (map instanceof r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ) {
            return r8lambdauemxp1whxmekjnoforsh61ohmwg.IconCompatParcelizer.serializer(((r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ) obj).IconCompatParcelizer, addInAppMessageViewToViewGrouplambda21.serializer);
        }
        return super.equals(obj);
    }
}
