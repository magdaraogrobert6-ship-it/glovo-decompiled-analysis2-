package com.incognia.internal;

import android.os.Process;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;
import o.hideCurrentlyDisplayingInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class Xxc {
    public Runtime BGx;

    public final ArrayList BGx(String str, Set set) {
        InputStream inputStream;
        Process processExec;
        ArrayList arrayList = new ArrayList();
        if (!set.isEmpty()) {
            try {
                Runtime runtimeBGx = BGx();
                inputStream = (runtimeBGx == null || (processExec = runtimeBGx.exec(String.format(str, Arrays.copyOf(new Object[]{Integer.valueOf(Process.myPid())}, 1)))) == null) ? null : processExec.getInputStream();
            } catch (Throwable unused) {
            }
            if (inputStream == null) {
                return null;
            }
            Scanner scanner = new Scanner(inputStream);
            while (scanner.hasNextLine()) {
                String lowerCase = scanner.nextLine().toLowerCase(Locale.ROOT);
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) lowerCase, (CharSequence) it.next(), false)) {
                        arrayList.add(lowerCase);
                        break;
                    }
                }
            }
            scanner.close();
        }
        return arrayList;
    }

    public final Runtime BGx() {
        Runtime runtime;
        synchronized (this) {
            try {
                if (this.BGx == null) {
                    this.BGx = Runtime.getRuntime();
                }
                runtime = this.BGx;
            } catch (Throwable unused) {
                return null;
            }
        }
        return runtime;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0031  */
    /* JADX WARN: Code duplicated, block: B:23:0x0036  */
    public final String BGx(String[] strArr, String[] strArr2) throws IOException {
        InputStream inputStream;
        Scanner scanner;
        Process processExec;
        String strNextLine = null;
        try {
            Runtime runtimeBGx = BGx();
            if (runtimeBGx != null && (processExec = runtimeBGx.exec(strArr, strArr2)) != null && (inputStream = processExec.getInputStream()) != null) {
                try {
                    scanner = new Scanner(inputStream);
                    try {
                        if (scanner.hasNext()) {
                            strNextLine = scanner.nextLine();
                        } else {
                            strNextLine = "";
                        }
                        scanner.close();
                        inputStream.close();
                    } catch (Throwable unused) {
                        if (scanner != null) {
                            scanner.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        return null;
                    }
                } catch (Throwable unused2) {
                    scanner = null;
                    if (scanner != null) {
                        scanner.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return null;
                }
            }
            return strNextLine;
        } catch (Throwable unused3) {
            inputStream = null;
        }
    }
}
