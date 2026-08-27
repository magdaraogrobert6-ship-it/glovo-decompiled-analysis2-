package com.incognia.internal;

import com.incognia.Incognia$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.onContentCardDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class mO extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final mO BGx = new mO();

    public mO() {
        super(1);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final /* synthetic */ Object invoke(Object obj) {
        BGx((String) obj);
        return createFromParcel.INSTANCE;
    }

    public static final void mbG(String str) {
        ArrayList arrayList = bWV.N;
        onContentCardDismissed.write((List) arrayList, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new Ls(str));
        if (arrayList.isEmpty()) {
            ArrayList arrayList2 = bWV.x;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                try {
                    ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj).invoke();
                } catch (Exception unused) {
                }
            }
            bWV.x.clear();
        }
    }

    public static void BGx(String str) {
        bWV.BGx.BGx(new Incognia$$ExternalSyntheticLambda0(9, str));
    }
}
