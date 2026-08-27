package com.incognia.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class k0K extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ Set BGx;
    public final /* synthetic */ ArrayList mbG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0K(Set set, ArrayList arrayList) {
        super(1);
        this.BGx = set;
        this.mbG = arrayList;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        String str = (String) obj;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Iterator it = this.BGx.iterator();
        while (it.hasNext()) {
            if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) lowerCase, (CharSequence) it.next(), false)) {
                this.mbG.add(str);
                break;
            }
        }
        return createFromParcel.INSTANCE;
    }
}
