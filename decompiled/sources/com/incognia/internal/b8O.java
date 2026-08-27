package com.incognia.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class b8O {
    public final Xxc BGx;

    public b8O(Xxc xxc, Lkz lkz) {
        this.BGx = xxc;
    }

    public final ArrayList BGx() throws IOException {
        List<z7> listBGx = Lkz.BGx();
        ArrayList arrayList = new ArrayList();
        for (z7 z7Var : listBGx) {
            List list = z7Var.mbG;
            String[] strArr = list != null ? (String[]) list.toArray(new String[0]) : null;
            List list2 = z7Var.HQ;
            String[] strArr2 = list2 != null ? (String[]) list2.toArray(new String[0]) : null;
            List list3 = z7Var.N;
            String[] strArr3 = list3 != null ? (String[]) list3.toArray(new String[0]) : null;
            String strBGx = this.BGx.BGx(strArr, (String[]) null);
            String strBGx2 = this.BGx.BGx(strArr2, strArr3);
            eVn evn = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{strBGx, strBGx2}, getCieXyz.write())).booleanValue() ? null : new eVn(z7Var.BGx, strBGx, strBGx2);
            if (evn != null) {
                arrayList.add(evn);
            }
        }
        return arrayList;
    }
}
