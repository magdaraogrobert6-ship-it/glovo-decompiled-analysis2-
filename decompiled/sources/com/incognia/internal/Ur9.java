package com.incognia.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Process;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import kotlin.io.TextStreamsKt;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.resetAfterInAppMessageCloselambda2;
import o.sourceInformationContextOfdefault;

/* JADX INFO: loaded from: classes2.dex */
public final class Ur9 {
    public static Integer mbG() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return Integer.valueOf(runningAppProcessInfo.importance);
        } catch (Exception unused) {
            return null;
        }
    }

    public final String BGx() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(String.format((String) W4i.TgJ.MediaSessionCompatResultReceiverWrapper(), Arrays.copyOf(new Object[]{Integer.valueOf(Process.myPid())}, 1))));
            try {
                String str = (String) resetAfterInAppMessageCloselambda2.serializer(resetAfterInAppMessageCloselambda2.RemoteActionCompatParcelizer(TextStreamsKt.write(bufferedReader), new JOq(this)));
                bufferedReader.close();
                return str;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    int i = sourceInformationContextOfdefault.read();
                    int i2 = sourceInformationContextOfdefault.read();
                    int i3 = sourceInformationContextOfdefault.read();
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i, i2, -871780639, sourceInformationContextOfdefault.read(), new Object[]{bufferedReader, th}, i3);
                    throw th2;
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public static String HQ() {
        try {
            if (XUh.BGx(XUh.BGx, 33, 0, 2)) {
                return Process.myProcessName();
            }
            int i = XUh.S;
            if (28 > i || i > 32) {
                return null;
            }
            return Application.getProcessName();
        } catch (Exception unused) {
            return null;
        }
    }
}
