package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import o.Image;
import o.ImageKt;
import o.ScrollState;
import o.accessgetNumPadDividecp;
import o.accessgetSystemNavigationDowncp;

/* JADX INFO: loaded from: classes2.dex */
public class AvailabilityException extends Exception {
    public final ImageKt read;

    @Override // java.lang.Throwable
    public final String getMessage() {
        ArrayList arrayList = new ArrayList();
        ImageKt imageKt = this.read;
        Iterator it = ((Image) imageKt.keySet()).iterator();
        boolean z = true;
        while (true) {
            ScrollState scrollState = (ScrollState) it;
            if (!scrollState.hasNext()) {
                break;
            }
            accessgetNumPadDividecp accessgetnumpaddividecp = (accessgetNumPadDividecp) scrollState.next();
            ConnectionResult connectionResult = (ConnectionResult) imageKt.get(accessgetnumpaddividecp);
            accessgetSystemNavigationDowncp.IconCompatParcelizer(connectionResult);
            z &= !connectionResult.read();
            String str = accessgetnumpaddividecp.write.write;
            String strValueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + strValueOf.length());
            sb.append(str);
            sb.append(": ");
            sb.append(strValueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }

    public AvailabilityException(ImageKt imageKt) {
        this.read = imageKt;
    }
}
