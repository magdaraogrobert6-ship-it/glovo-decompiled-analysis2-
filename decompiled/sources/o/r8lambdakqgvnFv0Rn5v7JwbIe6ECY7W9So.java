package o;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdakqgvnFv0Rn5v7JwbIe6ECY7W9So extends IContentCardsViewBindingHandler implements r8lambda9saPDiQX6C5HcUvRgmuVyXEkHj8 {
    public final r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ r8lambdakqgvnFv0Rn5v7JwbIe6ECY7W9So(r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg r8lambdauemxp1whxmekjnoforsh61ohmwg, int i) {
        this.serializer = i;
        this.read = r8lambdauemxp1whxmekjnoforsh61ohmwg;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.serializer;
        r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg r8lambdauemxp1whxmekjnoforsh61ohmwg = this.read;
        if (i == 0) {
            return r8lambdauemxp1whxmekjnoforsh61ohmwg.containsKey(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = r8lambdauemxp1whxmekjnoforsh61ohmwg.get(entry.getKey());
            if (obj2 != null) {
                return obj2.equals(entry.getValue());
            }
            if (entry.getValue() == null && r8lambdauemxp1whxmekjnoforsh61ohmwg.containsKey(entry.getKey())) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        int i = this.serializer;
        r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg r8lambdauemxp1whxmekjnoforsh61ohmwg = this.read;
        return i != 0 ? r8lambdauemxp1whxmekjnoforsh61ohmwg.size() : r8lambdauemxp1whxmekjnoforsh61ohmwg.size();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.serializer;
        r8lambdaUeMXP1wHXMekJNOfoRsh61OHMWg r8lambdauemxp1whxmekjnoforsh61ohmwg = this.read;
        if (i != 0) {
            r8lambdazCa9f5hibLISCeY3u5lKyCauzY r8lambdazca9f5hibliscey3u5lkycauzy = r8lambdauemxp1whxmekjnoforsh61ohmwg.IconCompatParcelizer;
            r8lambdazca9f5hibliscey3u5lkycauzy.getClass();
            accessgetShouldIgnoreOpenAndCloseLifecycleCallbacksp[] accessgetshouldignoreopenandcloselifecyclecallbackspArr = new accessgetShouldIgnoreOpenAndCloseLifecycleCallbacksp[8];
            for (int i2 = 0; i2 < 8; i2++) {
                accessgetshouldignoreopenandcloselifecyclecallbackspArr[i2] = new addInAppMessageViewToViewGrouplambda1(1);
            }
            return new addDismissRunnablelambda0(r8lambdazca9f5hibliscey3u5lkycauzy, accessgetshouldignoreopenandcloselifecyclecallbackspArr);
        }
        r8lambdazCa9f5hibLISCeY3u5lKyCauzY r8lambdazca9f5hibliscey3u5lkycauzy2 = r8lambdauemxp1whxmekjnoforsh61ohmwg.IconCompatParcelizer;
        r8lambdazca9f5hibliscey3u5lkycauzy2.getClass();
        accessgetShouldIgnoreOpenAndCloseLifecycleCallbacksp[] accessgetshouldignoreopenandcloselifecyclecallbackspArr2 = new accessgetShouldIgnoreOpenAndCloseLifecycleCallbacksp[8];
        for (int i3 = 0; i3 < 8; i3++) {
            accessgetshouldignoreopenandcloselifecyclecallbackspArr2[i3] = new addInAppMessageViewToViewGrouplambda1(0);
        }
        return new addDismissRunnablelambda0(r8lambdazca9f5hibliscey3u5lkycauzy2, accessgetshouldignoreopenandcloselifecyclecallbackspArr2);
    }
}
