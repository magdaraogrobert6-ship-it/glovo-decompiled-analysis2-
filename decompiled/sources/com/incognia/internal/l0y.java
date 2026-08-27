package com.incognia.internal;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.TuplesKt;
import o.accessgetInstancedelegatecp;
import o.r8lambdamYEtK3wDOqF6c3HLWu9wJc3oPw;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l0y {
    public static final byte[] BGx(String str) {
        if (str.length() % 2 != 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Must have an even length");
            return null;
        }
        r8lambdamYEtK3wDOqF6c3HLWu9wJc3oPw.write(2, 2);
        int length = str.length();
        int i = 0;
        ArrayList<String> arrayList = new ArrayList((length / 2) + (length % 2 == 0 ? 0 : 1));
        int i2 = 0;
        while (i2 >= 0 && i2 < length) {
            int i3 = i2 + 2;
            CharSequence charSequenceSubSequence = str.subSequence(i2, (i3 < 0 || i3 > length) ? length : i3);
            charSequenceSubSequence.getClass();
            arrayList.add(charSequenceSubSequence.toString());
            i2 = i3;
        }
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        for (String str2 : arrayList) {
            TuplesKt.RemoteActionCompatParcelizer(16);
            arrayList2.add(Byte.valueOf((byte) Integer.parseInt(str2, 16)));
        }
        byte[] bArr = new byte[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }
}
