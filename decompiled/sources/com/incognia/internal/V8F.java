package com.incognia.internal;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class V8F extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ qQ BGx;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        JyL jyL = this.BGx.N;
        jyL.getClass();
        if (!(jyL instanceof c39)) {
            for (Map.Entry entry : this.BGx.x.entrySet()) {
                String str = (String) entry.getKey();
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) it.next()).invoke(str);
                }
            }
            Iterator it2 = this.BGx.x.entrySet().iterator();
            while (it2.hasNext()) {
                ((List) ((Map.Entry) it2.next()).getValue()).clear();
            }
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V8F(qQ qQVar) {
        super(1);
        this.BGx = qQVar;
    }
}
