package com.incognia.internal;

import android.os.Process;
import androidx.sqlite.SQLite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.getQueryParameterslambda2;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class Lkz {
    public static final List A1;
    public static final String JR;
    public static final String OV7;
    public static final List S;
    public static final String TfN;
    public static final String VLD;
    public static final List VV3;
    public static final List e;
    public static final List fZl;
    public static final List hs;
    public static final List iaH;
    public static final String j;
    public static final String n;
    public static final List q;
    public static final String BGx = (String) W4i.u5R.MediaSessionCompatResultReceiverWrapper();
    public static final String mbG = (String) W4i.xV0.MediaSessionCompatResultReceiverWrapper();
    public static final String HQ = (String) W4i.O5.MediaSessionCompatResultReceiverWrapper();
    public static final String N = (String) W4i.AI1.MediaSessionCompatResultReceiverWrapper();
    public static final String x = (String) W4i.gnu.MediaSessionCompatResultReceiverWrapper();
    public static final List hIl = SQLite.read((String) W4i.jHv.MediaSessionCompatResultReceiverWrapper(), (String) W4i.x84.MediaSessionCompatResultReceiverWrapper());

    static {
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = W4i.vEJ;
        String str = (String) onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper();
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda2 = W4i.N7;
        hs = SQLite.read(str, (String) onviewdetachedfromwindowlambda2.MediaSessionCompatResultReceiverWrapper(), (String) W4i.w1f.MediaSessionCompatResultReceiverWrapper());
        VV3 = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{(String) W4i.bl.MediaSessionCompatResultReceiverWrapper()}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
        A1 = SQLite.read((String) onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper(), (String) onviewdetachedfromwindowlambda2.MediaSessionCompatResultReceiverWrapper(), (String) W4i.MSj.MediaSessionCompatResultReceiverWrapper());
        q = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{(String) W4i.Ru2.MediaSessionCompatResultReceiverWrapper()}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
        fZl = SQLite.read((String) onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper(), (String) onviewdetachedfromwindowlambda2.MediaSessionCompatResultReceiverWrapper(), (String) W4i.pp5.MediaSessionCompatResultReceiverWrapper());
        S = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{(String) W4i.vB.MediaSessionCompatResultReceiverWrapper()}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
        iaH = SQLite.read((String) onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper(), (String) onviewdetachedfromwindowlambda2.MediaSessionCompatResultReceiverWrapper(), (String) W4i.KO.MediaSessionCompatResultReceiverWrapper());
        e = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{(String) W4i.lar.MediaSessionCompatResultReceiverWrapper()}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
        VLD = (String) onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper();
        TfN = (String) onviewdetachedfromwindowlambda2.MediaSessionCompatResultReceiverWrapper();
        OV7 = (String) W4i.GV3.MediaSessionCompatResultReceiverWrapper();
        JR = (String) W4i.Q8.MediaSessionCompatResultReceiverWrapper();
        j = (String) W4i.Wx.MediaSessionCompatResultReceiverWrapper();
        n = (String) W4i.h0.MediaSessionCompatResultReceiverWrapper();
    }

    public static List BGx() {
        String str = BGx;
        List list = hIl;
        List list2 = hs;
        z7 z7Var = new z7(str, list, list2, null);
        z7 z7Var2 = new z7(mbG, list2, A1, VV3);
        String str2 = HQ;
        List list3 = q;
        Object[] objArr = {new z7[]{z7Var, z7Var2, new z7(str2, list3, fZl, null), new z7(N, list3, iaH, S)}};
        int iSerializer = getQueryParameterslambda2.serializer();
        ArrayList arrayList = (ArrayList) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -866125098, objArr, getQueryParameterslambda2.serializer(), 866125100, iSerializer);
        arrayList.add(new z7(x, SQLite.read(JR, OV7, String.format(j, Arrays.copyOf(new Object[]{Integer.valueOf(Process.myPid())}, 1))), SQLite.read(VLD, TfN, String.format(n, Arrays.copyOf(new Object[]{Integer.valueOf(Process.myPid())}, 1))), e));
        return arrayList;
    }
}
