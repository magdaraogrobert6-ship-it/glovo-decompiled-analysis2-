package o;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaeWSM9tUXFLB7EqkvXBPWQxcVeM extends IContentCardsUpdateHandler {
    public final DefaultContentCardsViewBindingHandlerWhenMappings IconCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ r8lambdaeWSM9tUXFLB7EqkvXBPWQxcVeM(DefaultContentCardsViewBindingHandlerWhenMappings defaultContentCardsViewBindingHandlerWhenMappings, int i) {
        this.read = i;
        this.IconCompatParcelizer = defaultContentCardsViewBindingHandlerWhenMappings;
    }

    @Override // o.IContentCardsUpdateHandler
    public final int RemoteActionCompatParcelizer() {
        return this.read != 0 ? ((addInAppMessageViewToViewGrouplambda22) this.IconCompatParcelizer).read() : ((r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ) this.IconCompatParcelizer).read();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.read != 0) {
            ((Map.Entry) obj).getClass();
            throw new UnsupportedOperationException();
        }
        ((Map.Entry) obj).getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (this.read != 0) {
            ((addInAppMessageViewToViewGrouplambda22) this.IconCompatParcelizer).clear();
        } else {
            ((r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ) this.IconCompatParcelizer).clear();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        int i = this.read;
        DefaultContentCardsViewBindingHandlerWhenMappings defaultContentCardsViewBindingHandlerWhenMappings = this.IconCompatParcelizer;
        entry.getClass();
        if (i != 0) {
            addInAppMessageViewToViewGrouplambda22 addinappmessageviewtoviewgrouplambda22 = (addInAppMessageViewToViewGrouplambda22) defaultContentCardsViewBindingHandlerWhenMappings;
            addinappmessageviewtoviewgrouplambda22.getClass();
            V v = addinappmessageviewtoviewgrouplambda22.get(entry.getKey());
            if (v != 0) {
                return v.equals(entry.getValue());
            }
            if (entry.getValue() != null || !addinappmessageviewtoviewgrouplambda22.containsKey(entry.getKey())) {
                return false;
            }
        } else {
            r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ r8lambdayvdweaikwvq_ojtermd5bm8okkq = (r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ) defaultContentCardsViewBindingHandlerWhenMappings;
            r8lambdayvdweaikwvq_ojtermd5bm8okkq.getClass();
            V v2 = r8lambdayvdweaikwvq_ojtermd5bm8okkq.get(entry.getKey());
            if (v2 != 0) {
                return v2.equals(entry.getValue());
            }
            if (entry.getValue() != null || !r8lambdayvdweaikwvq_ojtermd5bm8okkq.containsKey(entry.getKey())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        int i = this.read;
        DefaultContentCardsViewBindingHandlerWhenMappings defaultContentCardsViewBindingHandlerWhenMappings = this.IconCompatParcelizer;
        entry.getClass();
        return i != 0 ? ((addInAppMessageViewToViewGrouplambda22) defaultContentCardsViewBindingHandlerWhenMappings).remove(entry.getKey(), entry.getValue()) : ((r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ) defaultContentCardsViewBindingHandlerWhenMappings).remove(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.read != 0 ? new addInAppMessageViewToViewGrouplambda3((addInAppMessageViewToViewGrouplambda22) this.IconCompatParcelizer, 1) : new ContentCardsDividerItemDecoration((r8lambdaYVDweAiKWVQ_OjtERMd5bm8OKkQ) this.IconCompatParcelizer);
    }
}
