package o;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class closelambda1 extends IContentCardsViewBindingHandler implements r8lambda9saPDiQX6C5HcUvRgmuVyXEkHj8 {
    public final addInAppMessageViewToViewGrouplambda20 IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ closelambda1(addInAppMessageViewToViewGrouplambda20 addinappmessageviewtoviewgrouplambda20, int i) {
        this.serializer = i;
        this.IconCompatParcelizer = addinappmessageviewtoviewgrouplambda20;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.serializer;
        addInAppMessageViewToViewGrouplambda20 addinappmessageviewtoviewgrouplambda20 = this.IconCompatParcelizer;
        if (i == 0) {
            return addinappmessageviewtoviewgrouplambda20.read.containsKey(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = addinappmessageviewtoviewgrouplambda20.get(entry.getKey());
            if (obj2 != null) {
                return obj2.equals(entry.getValue());
            }
            if (entry.getValue() == null) {
                if (addinappmessageviewtoviewgrouplambda20.read.containsKey(entry.getKey())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        int i = this.serializer;
        addInAppMessageViewToViewGrouplambda20 addinappmessageviewtoviewgrouplambda20 = this.IconCompatParcelizer;
        return i != 0 ? addinappmessageviewtoviewgrouplambda20.size() : addinappmessageviewtoviewgrouplambda20.size();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.serializer;
        addInAppMessageViewToViewGrouplambda20 addinappmessageviewtoviewgrouplambda20 = this.IconCompatParcelizer;
        return i != 0 ? new addInAppMessageViewToViewGrouplambda5(addinappmessageviewtoviewgrouplambda20, 1) : new addInAppMessageViewToViewGrouplambda5(addinappmessageviewtoviewgrouplambda20, 0);
    }
}
