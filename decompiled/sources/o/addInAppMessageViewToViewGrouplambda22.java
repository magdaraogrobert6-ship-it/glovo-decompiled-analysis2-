package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class addInAppMessageViewToViewGrouplambda22 extends DefaultContentCardsViewBindingHandlerWhenMappings implements r8lambdaCsNx3Lz3M5ehl5yX1aUnmTVsjOg {
    public Object IconCompatParcelizer;
    public Object RemoteActionCompatParcelizer;
    public addInAppMessageViewToViewGrouplambda20 serializer;
    public final r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ write;

    public final r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ IconCompatParcelizer() {
        return this.write;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ r8lambdayvdweaikwvq_ojtermd5bm8okkq = this.write;
        if (!r8lambdayvdweaikwvq_ojtermd5bm8okkq.isEmpty()) {
            this.serializer = null;
        }
        r8lambdayvdweaikwvq_ojtermd5bm8okkq.clear();
        closelambda20 closelambda20Var = closelambda20.serializer;
        this.IconCompatParcelizer = closelambda20Var;
        this.RemoteActionCompatParcelizer = closelambda20Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.write.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        addInAppMessageViewToViewGrouplambda2 addinappmessageviewtoviewgrouplambda2 = (addInAppMessageViewToViewGrouplambda2) this.write.get(obj);
        if (addinappmessageviewtoviewgrouplambda2 != null) {
            return addinappmessageviewtoviewgrouplambda2.write;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ r8lambdayvdweaikwvq_ojtermd5bm8okkq = this.write;
        addInAppMessageViewToViewGrouplambda2 addinappmessageviewtoviewgrouplambda2 = (addInAppMessageViewToViewGrouplambda2) r8lambdayvdweaikwvq_ojtermd5bm8okkq.get(obj);
        if (addinappmessageviewtoviewgrouplambda2 != null) {
            Object obj3 = addinappmessageviewtoviewgrouplambda2.write;
            if (obj3 == obj2) {
                return obj2;
            }
            this.serializer = null;
            r8lambdayvdweaikwvq_ojtermd5bm8okkq.put(obj, new addInAppMessageViewToViewGrouplambda2(obj2, addinappmessageviewtoviewgrouplambda2.IconCompatParcelizer, addinappmessageviewtoviewgrouplambda2.serializer));
            return obj3;
        }
        this.serializer = null;
        boolean zIsEmpty = isEmpty();
        closelambda20 closelambda20Var = closelambda20.serializer;
        if (zIsEmpty) {
            this.IconCompatParcelizer = obj;
            this.RemoteActionCompatParcelizer = obj;
            r8lambdayvdweaikwvq_ojtermd5bm8okkq.put(obj, new addInAppMessageViewToViewGrouplambda2(obj2, closelambda20Var, closelambda20Var));
            return null;
        }
        Object obj4 = this.RemoteActionCompatParcelizer;
        Object obj5 = r8lambdayvdweaikwvq_ojtermd5bm8okkq.get(obj4);
        obj5.getClass();
        addInAppMessageViewToViewGrouplambda2 addinappmessageviewtoviewgrouplambda3 = (addInAppMessageViewToViewGrouplambda2) obj5;
        r8lambdayvdweaikwvq_ojtermd5bm8okkq.put(obj4, new addInAppMessageViewToViewGrouplambda2(addinappmessageviewtoviewgrouplambda3.write, addinappmessageviewtoviewgrouplambda3.IconCompatParcelizer, obj));
        r8lambdayvdweaikwvq_ojtermd5bm8okkq.put(obj, new addInAppMessageViewToViewGrouplambda2(obj2, obj4, closelambda20Var));
        this.RemoteActionCompatParcelizer = obj;
        return null;
    }

    @Override // o.DefaultContentCardsViewBindingHandlerWhenMappings
    public final int read() {
        return this.write.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ r8lambdayvdweaikwvq_ojtermd5bm8okkq = this.write;
        addInAppMessageViewToViewGrouplambda2 addinappmessageviewtoviewgrouplambda2 = (addInAppMessageViewToViewGrouplambda2) r8lambdayvdweaikwvq_ojtermd5bm8okkq.remove(obj);
        if (addinappmessageviewtoviewgrouplambda2 == null) {
            return null;
        }
        Object obj2 = addinappmessageviewtoviewgrouplambda2.serializer;
        Object obj3 = addinappmessageviewtoviewgrouplambda2.IconCompatParcelizer;
        this.serializer = null;
        closelambda20 closelambda20Var = closelambda20.serializer;
        if (obj3 != closelambda20Var) {
            Object obj4 = r8lambdayvdweaikwvq_ojtermd5bm8okkq.get(obj3);
            obj4.getClass();
            addInAppMessageViewToViewGrouplambda2 addinappmessageviewtoviewgrouplambda3 = (addInAppMessageViewToViewGrouplambda2) obj4;
            r8lambdayvdweaikwvq_ojtermd5bm8okkq.put(obj3, new addInAppMessageViewToViewGrouplambda2(addinappmessageviewtoviewgrouplambda3.write, addinappmessageviewtoviewgrouplambda3.IconCompatParcelizer, obj2));
        } else {
            this.IconCompatParcelizer = obj2;
        }
        if (obj2 != closelambda20Var) {
            Object obj5 = r8lambdayvdweaikwvq_ojtermd5bm8okkq.get(obj2);
            obj5.getClass();
            addInAppMessageViewToViewGrouplambda2 addinappmessageviewtoviewgrouplambda4 = (addInAppMessageViewToViewGrouplambda2) obj5;
            r8lambdayvdweaikwvq_ojtermd5bm8okkq.put(obj2, new addInAppMessageViewToViewGrouplambda2(addinappmessageviewtoviewgrouplambda4.write, obj3, addinappmessageviewtoviewgrouplambda4.serializer));
        } else {
            this.RemoteActionCompatParcelizer = obj3;
        }
        return addinappmessageviewtoviewgrouplambda2.write;
    }

    @Override // o.r8lambdaCsNx3Lz3M5ehl5yX1aUnmTVsjOg
    public final r8lambdaKGJqwjLmUs58_kpRh__GGuNRqTQ serializer() {
        addInAppMessageViewToViewGrouplambda20 addinappmessageviewtoviewgrouplambda20 = this.serializer;
        r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ r8lambdayvdweaikwvq_ojtermd5bm8okkq = this.write;
        if (addinappmessageviewtoviewgrouplambda20 != null) {
            r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg r8lambdauemxp1whxmekjnoforsh61ohmwg = r8lambdayvdweaikwvq_ojtermd5bm8okkq.serializer;
            return addinappmessageviewtoviewgrouplambda20;
        }
        r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg r8lambdauemxp1whxmekjnoforsh61ohmwg2 = r8lambdayvdweaikwvq_ojtermd5bm8okkq.serializer;
        addInAppMessageViewToViewGrouplambda20 addinappmessageviewtoviewgrouplambda21 = new addInAppMessageViewToViewGrouplambda20(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, r8lambdayvdweaikwvq_ojtermd5bm8okkq.serializer());
        this.serializer = addinappmessageviewtoviewgrouplambda21;
        return addinappmessageviewtoviewgrouplambda21;
    }

    public addInAppMessageViewToViewGrouplambda22(addInAppMessageViewToViewGrouplambda20 addinappmessageviewtoviewgrouplambda20) {
        this.serializer = addinappmessageviewtoviewgrouplambda20;
        this.IconCompatParcelizer = addinappmessageviewtoviewgrouplambda20.serializer;
        this.RemoteActionCompatParcelizer = addinappmessageviewtoviewgrouplambda20.RemoteActionCompatParcelizer;
        r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg r8lambdauemxp1whxmekjnoforsh61ohmwg = addinappmessageviewtoviewgrouplambda20.read;
        r8lambdauemxp1whxmekjnoforsh61ohmwg.getClass();
        this.write = new r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ(r8lambdauemxp1whxmekjnoforsh61ohmwg);
    }

    @Override // o.DefaultContentCardsViewBindingHandlerWhenMappings
    public final Collection MediaSessionCompatQueueItem() {
        return new r8lambdawnDbB7BRZlRgckuAh7M80S4G1I(this, 2);
    }

    @Override // o.DefaultContentCardsViewBindingHandlerWhenMappings
    public final Set RemoteActionCompatParcelizer() {
        return new getImageView(2, this);
    }

    @Override // o.DefaultContentCardsViewBindingHandlerWhenMappings
    public final Set write() {
        return new r8lambdaeWSM9tUXFLB7EqkvXBPWQxcVeM(this, 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ r8lambdayvdweaikwvq_ojtermd5bm8okkq = this.write;
            Map map = (Map) obj;
            if (r8lambdayvdweaikwvq_ojtermd5bm8okkq.size() == map.size()) {
                if (map instanceof addInAppMessageViewToViewGrouplambda20) {
                    return r8lambdayvdweaikwvq_ojtermd5bm8okkq.IconCompatParcelizer.serializer(((addInAppMessageViewToViewGrouplambda20) obj).read.IconCompatParcelizer, addInAppMessageViewToViewGrouplambda21.read);
                }
                if (map instanceof addInAppMessageViewToViewGrouplambda22) {
                    return r8lambdayvdweaikwvq_ojtermd5bm8okkq.IconCompatParcelizer.serializer(((addInAppMessageViewToViewGrouplambda22) obj).write.IconCompatParcelizer, addInAppMessageViewToViewGrouplambda21.MediaMetadataCompat);
                }
                if (map instanceof r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg) {
                    return r8lambdayvdweaikwvq_ojtermd5bm8okkq.IconCompatParcelizer.serializer(((r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg) obj).IconCompatParcelizer, addInAppMessageViewToViewGrouplambda21.MediaDescriptionCompat);
                }
                if (map instanceof r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ) {
                    return r8lambdayvdweaikwvq_ojtermd5bm8okkq.IconCompatParcelizer.serializer(((r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ) obj).IconCompatParcelizer, addInAppMessageViewToViewGrouplambda21.MediaSessionCompatQueueItem);
                }
                if (read() == map.size()) {
                    if (map.isEmpty()) {
                        return true;
                    }
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        if (!createButtonClickListenerslambda0100.read(this, (Map.Entry) it.next())) {
                        }
                    }
                    return true;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Failed requirement.");
                return false;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        addInAppMessageViewToViewGrouplambda2 addinappmessageviewtoviewgrouplambda2 = (addInAppMessageViewToViewGrouplambda2) this.write.get(obj);
        if (addinappmessageviewtoviewgrouplambda2 == null) {
            return false;
        }
        Object[] objArr = {addinappmessageviewtoviewgrouplambda2.write, obj2};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        remove(obj);
        return true;
    }
}
