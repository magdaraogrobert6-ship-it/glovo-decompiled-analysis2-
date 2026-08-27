package com.incognia.internal;

import o.ensureSubscribedToInAppMessageEvents;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class IA {
    public static final String BGx(String str) {
        if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "\"", false) && setCarryoverInAppMessage.read(str, "\"", false)) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(1, 1, str);
        }
        try {
            return new String(l0y.BGx(str), ensureSubscribedToInAppMessageEvents.write);
        } catch (Exception unused) {
            return null;
        }
    }
}
