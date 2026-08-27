package com.incognia.internal;

import android.os.Process;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.sourceInformationContextOfdefault;

/* JADX INFO: loaded from: classes2.dex */
public final class P5 {
    public static String BGx() {
        String string;
        try {
            Scanner scanner = new Scanner(new File((String) W4i.pH.MediaSessionCompatResultReceiverWrapper()));
            while (scanner.hasNextLine()) {
                try {
                    List listSerializer = hideCurrentlyDisplayingInAppMessage.serializer(scanner.nextLine(), new String[]{": "}, 6);
                    if (listSerializer.size() > 1 && hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) listSerializer.get(0), (CharSequence) W4i.Fp5.MediaSessionCompatResultReceiverWrapper(), false)) {
                        string = hideCurrentlyDisplayingInAppMessage.read((CharSequence) listSerializer.get(1)).toString();
                        scanner.close();
                        return string;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{scanner, th}, sourceInformationContextOfdefault.read());
                        throw th2;
                    }
                }
                return null;
            }
            string = null;
            scanner.close();
            return string;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static BufferedReader mbG() {
        try {
            return new BufferedReader(new FileReader(String.format((String) W4i.d7D.MediaSessionCompatResultReceiverWrapper(), Arrays.copyOf(new Object[]{Integer.valueOf(Process.myPid())}, 1))));
        } catch (Throwable unused) {
            return null;
        }
    }
}
