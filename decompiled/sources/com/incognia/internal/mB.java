package com.incognia.internal;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.io.File;
import kotlin.jvm.internal.Lambda;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class mB extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final mB BGx = new mB();

    public mB() {
        super(1);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        String name = ((File) obj).getName();
        if (!setCarryoverInAppMessage.RemoteActionCompatParcelizer(name, (String) W4i.Wy.MediaSessionCompatResultReceiverWrapper(), false)) {
            return null;
        }
        onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = W4i.UCj;
        if (!setCarryoverInAppMessage.read(name, (String) onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper(), false)) {
            return null;
        }
        String strRemoteActionCompatParcelizer = hideCurrentlyDisplayingInAppMessage.RemoteActionCompatParcelizer(name, (String) onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper());
        if (new File(ff$$ExternalSyntheticOutline0.m(new StringBuilder(), (String) W4i.mSo.MediaSessionCompatResultReceiverWrapper(), strRemoteActionCompatParcelizer)).exists()) {
            return strRemoteActionCompatParcelizer;
        }
        return null;
    }
}
