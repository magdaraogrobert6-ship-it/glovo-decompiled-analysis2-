package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import o.accessgetNumPadRightParenthesiscp;
import o.accessgetPictureSymbolscp;
import o.accessgetSystemNavigationDowncp;

/* JADX INFO: loaded from: classes2.dex */
public final class TaskApiCall$Builder {
    public boolean IconCompatParcelizer;
    public accessgetNumPadRightParenthesiscp RemoteActionCompatParcelizer;
    public Feature[] read;
    public boolean serializer;
    public int write;

    public final accessgetPictureSymbolscp read() {
        int length;
        boolean z = false;
        accessgetSystemNavigationDowncp.write("execute parameter required", this.RemoteActionCompatParcelizer != null);
        if (!this.IconCompatParcelizer) {
            Feature[] featureArr = this.read;
            if (featureArr != null && (length = featureArr.length) != 0) {
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = true;
                        break;
                    }
                    if (!featureArr[i].write) {
                        break;
                    }
                    i++;
                }
            }
            this.serializer = z;
        }
        return new accessgetPictureSymbolscp(this, this.read, this.serializer, this.write);
    }
}
