package com.incognia.internal;

import android.content.Context;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class N0q implements Xeg {
    public final onViewDetachedFromWindowlambda1 BGx;

    @Override // com.incognia.internal.Xeg
    public final int BGx() {
        return 1;
    }

    @Override // com.incognia.internal.Xeg
    public final boolean mbG() {
        return false;
    }

    static {
    }

    @Override // com.incognia.internal.Xeg
    public final void BGx(Context context) {
        Iterator it = ((List) this.BGx.MediaSessionCompatResultReceiverWrapper()).iterator();
        while (it.hasNext()) {
            Ni.BGx(context, ((Number) it.next()).intValue());
        }
    }

    public N0q() {
        Object[] objArr = {o9.BGx};
        this.BGx = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }
}
