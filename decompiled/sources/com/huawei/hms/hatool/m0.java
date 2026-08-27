package com.huawei.hms.hatool;

import android.util.Log;
import bo.app.af$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public class m0 {
    private boolean a = false;
    private int b = 4;

    public void b(int i, String str, String str2) {
        a(i, "FormalHASDK", af$$ExternalSyntheticOutline0.m(str, "=> ", str2));
    }

    private static String a() {
        return "FormalHASDK_2.2.0.315" + p.a();
    }

    public boolean b(int i) {
        return this.a && i >= this.b;
    }

    public void a(int i) {
        System.lineSeparator();
        System.lineSeparator();
        a();
        System.lineSeparator();
        this.b = i;
        this.a = true;
    }

    public void a(int i, String str, String str2) {
        if (i != 3) {
            if (i == 5) {
                Log.w(str, str2);
            } else {
                if (i != 6) {
                    return;
                }
                Log.e(str, str2);
            }
        }
    }
}
