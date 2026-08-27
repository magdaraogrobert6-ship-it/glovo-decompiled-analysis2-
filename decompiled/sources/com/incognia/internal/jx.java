package com.incognia.internal;

import com.google.android.material.textfield.DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.accessgetInstancedelegatecp;

/* JADX INFO: loaded from: classes2.dex */
public final class jx {
    public static final String mbG = (String) W4i.oC.MediaSessionCompatResultReceiverWrapper();
    public final X2C BGx;

    public jx(X2C x2c) {
        this.BGx = x2c;
    }

    public final void BGx(List list, lD lDVar, zB6 zb6) {
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ZBu zBu = (ZBu) it.next();
            arrayList.add(new X1(mbG, Bp.BGx(zBu), zBu.BGx, zBu.mbG));
        }
        this.BGx.BGx(arrayList, lDVar, new DropdownMenuEndIconDelegate$$ExternalSyntheticLambda5(27, zb6));
    }

    public static final void BGx(zB6 zb6, boolean z, List list) {
        if (zb6 != null) {
            zb6.BGx(z);
        }
    }
}
