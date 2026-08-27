package com.incognia.internal;

import androidx.compose.ui.graphics.Fields;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import o.isAdapterPositionOnScreen;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes2.dex */
public final class DEk {
    public final Xxc BGx;
    public final onViewDetachedFromWindowlambda1 HQ = new isAdapterPositionOnScreen(new CaU(this));
    public final FW mbG;

    /* JADX WARN: Code duplicated, block: B:37:0x0092 A[PHI: r3 r8
  0x0092: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v3 java.lang.String) binds: [B:36:0x0090, B:30:0x0086] A[DONT_GENERATE, DONT_INLINE]
  0x0092: PHI (r8v5 java.lang.Process) = (r8v4 java.lang.Process), (r8v9 java.lang.Process) binds: [B:36:0x0090, B:30:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static final BO8 BGx(DEk dEk) {
        BufferedReader bufferedReader;
        String string;
        Process processExec;
        BufferedReader bufferedReader2;
        FW fw = dEk.mbG;
        String str = (String) W4i.AWJ.MediaSessionCompatResultReceiverWrapper();
        fw.getClass();
        String string2 = null;
        try {
            StringBuilder sb = new StringBuilder(Fields.RotationY);
            bufferedReader = new BufferedReader(new FileReader(str));
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append((CharSequence) line, 0, Math.min(line.length(), Fields.RotationY));
                }
                string = sb.toString();
                try {
                    bufferedReader.close();
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused3) {
                    }
                }
                string = null;
            }
        } catch (Throwable unused4) {
            bufferedReader = null;
        }
        Xxc xxc = dEk.BGx;
        String str2 = (String) W4i.BXK.MediaSessionCompatResultReceiverWrapper();
        try {
            StringBuilder sb2 = new StringBuilder();
            Runtime runtimeBGx = xxc.BGx();
            processExec = runtimeBGx != null ? runtimeBGx.exec(str2) : null;
            try {
                bufferedReader2 = new BufferedReader(new InputStreamReader(processExec != null ? processExec.getInputStream() : null));
                try {
                    String line2 = bufferedReader2.readLine();
                    if (line2 != null) {
                        sb2.append((CharSequence) line2, 0, Math.min(line2.length(), Fields.RotationY));
                        string2 = sb2.toString();
                    }
                    try {
                        bufferedReader2.close();
                    } catch (Throwable unused5) {
                    }
                    if (processExec != null) {
                        processExec.destroy();
                    }
                } catch (Throwable unused6) {
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (Throwable unused7) {
                        }
                    }
                    if (processExec != null) {
                        processExec.destroy();
                    }
                }
            } catch (Throwable unused8) {
                bufferedReader2 = null;
                if (bufferedReader2 != null) {
                    bufferedReader2.close();
                }
                if (processExec != null) {
                    processExec.destroy();
                }
                return new BO8(string, string2);
            }
        } catch (Throwable unused9) {
            processExec = null;
        }
        return new BO8(string, string2);
    }

    public DEk(Xxc xxc, FW fw) {
        this.BGx = xxc;
        this.mbG = fw;
    }
}
