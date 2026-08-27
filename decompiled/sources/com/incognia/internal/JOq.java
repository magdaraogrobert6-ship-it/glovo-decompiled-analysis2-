package com.incognia.internal;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class JOq extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ Ur9 BGx;

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        String str = (String) obj;
        this.BGx.getClass();
        if (!hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str, (CharSequence) W4i.DW.MediaSessionCompatResultReceiverWrapper(), false)) {
            return null;
        }
        List listSerializer = hideCurrentlyDisplayingInAppMessage.serializer(str, new String[]{":"}, 6);
        if (listSerializer.size() == 3) {
            return hideCurrentlyDisplayingInAppMessage.write((String) listSerializer.get(2), "/");
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JOq(Ur9 ur9) {
        super(1);
        this.BGx = ur9;
    }
}
