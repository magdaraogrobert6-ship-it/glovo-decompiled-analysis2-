package com.incognia.internal;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class hm7 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ ArrayList BGx;
    public final /* synthetic */ LinkedHashMap HQ;
    public final /* synthetic */ Vi2 mbG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm7(ArrayList arrayList, Vi2 vi2, LinkedHashMap linkedHashMap) {
        super(1);
        this.BGx = arrayList;
        this.mbG = vi2;
        this.HQ = linkedHashMap;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        String str = (String) obj;
        this.BGx.add(str);
        int iWrite = hideCurrentlyDisplayingInAppMessage.write((CharSequence) str, ":", 0, false, 6);
        if (iWrite != -1) {
            Vi2 vi2 = this.mbG;
            String string = hideCurrentlyDisplayingInAppMessage.read((CharSequence) str.substring(0, iWrite)).toString();
            vi2.getClass();
            if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(string, "[", false) && setCarryoverInAppMessage.read(string, "]", false)) {
                string = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(1, 1, string);
            }
            Vi2 vi3 = this.mbG;
            String string2 = hideCurrentlyDisplayingInAppMessage.read((CharSequence) str.substring(iWrite + 1)).toString();
            vi3.getClass();
            if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(string2, "[", false) && setCarryoverInAppMessage.read(string2, "]", false)) {
                string2 = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(1, 1, string2);
            }
            this.HQ.put(string, string2);
        }
        return createFromParcel.INSTANCE;
    }
}
