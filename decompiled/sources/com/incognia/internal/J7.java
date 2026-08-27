package com.incognia.internal;

import android.os.Environment;
import androidx.sqlite.SQLite;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import o.accessgetInstancedelegatecp;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;

/* JADX INFO: loaded from: classes2.dex */
public final class J7 {
    public static final ArrayList HQ = SQLite.write((String) W4i.CF.MediaSessionCompatResultReceiverWrapper(), (String) W4i.xO.MediaSessionCompatResultReceiverWrapper(), (String) W4i.ZWQ.MediaSessionCompatResultReceiverWrapper(), (String) W4i.Tea.MediaSessionCompatResultReceiverWrapper(), (String) W4i.c9w.MediaSessionCompatResultReceiverWrapper(), (String) W4i.fQ.MediaSessionCompatResultReceiverWrapper(), (String) W4i.RP.MediaSessionCompatResultReceiverWrapper(), (String) W4i.MW.MediaSessionCompatResultReceiverWrapper(), (String) W4i.aC.MediaSessionCompatResultReceiverWrapper(), (String) W4i.wD.MediaSessionCompatResultReceiverWrapper());
    public final FW BGx;
    public final NvL mbG;

    /* JADX WARN: Code duplicated, block: B:43:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0083 A[SYNTHETIC] */
    public final Set BGx() {
        qc2 qc2Var;
        Long lValueOf;
        List<String> listBGx = this.mbG.BGx((String) W4i.W57.MediaSessionCompatResultReceiverWrapper(), HQ);
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(listBGx, 10));
        for (String str : listBGx) {
            this.BGx.getClass();
            arrayList.add((Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data") + '/' + str);
        }
        try {
            Set<String> setR8lambda54BeH8ZsBru0CXI2CCSP2syNys = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(onContentCardDismissed.IconCompatParcelizer(this.mbG.BGx((String) W4i.atL.MediaSessionCompatResultReceiverWrapper(), instance_delegatelambda0.write), arrayList));
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : setR8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
                try {
                    this.BGx.getClass();
                    if (new File(str2).exists()) {
                        this.BGx.getClass();
                        try {
                            long jLastModified = new File(str2).lastModified();
                            lValueOf = jLastModified > 0 ? Long.valueOf(jLastModified) : null;
                        } catch (Throwable unused) {
                        }
                        if (lValueOf != null) {
                            long jLongValue = lValueOf.longValue();
                            if (jLongValue > 0) {
                                qc2Var = new qc2(str2, jLongValue);
                            }
                        }
                        if (qc2Var != null) {
                            arrayList2.add(qc2Var);
                        }
                    }
                } catch (Throwable unused2) {
                }
                qc2Var = null;
                if (qc2Var != null) {
                    arrayList2.add(qc2Var);
                }
            }
            return onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList2);
        } catch (Throwable unused3) {
            return null;
        }
    }

    public J7(NvL nvL, FW fw) {
        this.BGx = fw;
        this.mbG = nvL;
    }
}
