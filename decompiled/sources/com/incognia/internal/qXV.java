package com.incognia.internal;

import android.content.Context;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import o.accessgetInstancedelegatecp;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class qXV implements Xeg {
    public final onViewDetachedFromWindowlambda1 BGx;

    @Override // com.incognia.internal.Xeg
    public final int BGx() {
        return 6;
    }

    @Override // com.incognia.internal.Xeg
    public final boolean mbG() {
        return false;
    }

    static {
    }

    @Override // com.incognia.internal.Xeg
    public final void BGx(Context context) {
        List<String> list = (List) this.BGx.MediaSessionCompatResultReceiverWrapper();
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        for (String str : list) {
            String str2 = t0.BGx;
            arrayList.add(t0.BGx + '.' + str + '.' + t0.mbG);
        }
        Ay.BGx.BGx(arrayList);
    }

    public qXV() {
        Object[] objArr = {Ja.BGx};
        this.BGx = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }
}
