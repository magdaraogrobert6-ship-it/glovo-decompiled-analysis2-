package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import o.accessgetButton13cp;
import o.accessgetF6cp;
import o.accessgetF8cp;
import o.accessgetForwardcp;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class CctBackendFactory {
    public accessgetForwardcp create(accessgetF8cp accessgetf8cp) {
        accessgetF6cp accessgetf6cp = (accessgetF6cp) accessgetf8cp;
        return new accessgetButton13cp(accessgetf6cp.serializer, accessgetf6cp.RemoteActionCompatParcelizer, accessgetf6cp.read);
    }
}
