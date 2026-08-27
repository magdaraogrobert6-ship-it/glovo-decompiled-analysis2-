package com.deliveryhero.fwf_logger;

import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class FwFLogger implements IFwFLogging {
    @Override // com.deliveryhero.fwf_logger.IFwFLogging
    public void logFwF(FwFLogLevel fwFLogLevel, String str, String str2) {
        fwFLogLevel.getClass();
        str.getClass();
        str2.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(fwFLogLevel);
        sb.append(":");
        System.out.println((Object) d$$ExternalSyntheticOutline0.m(sb, str, ":", str2));
    }
}
