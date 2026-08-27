package com.huawei.hms.opendevice;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.braze.Constants;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.IOUtils;
import com.logistics.rider.glovo.R;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import o.ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1;
import o.ComposeScrollCaptureCallbackonScrollCaptureImageRequest1;
import o.FixedScale;
import o.accessmaxIntrinsicWidthjd;
import o.accessminIntrinsicHeightjd;
import o.launchWithCancellationSignallambda0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l {
    private static final String a = "l";
    private static Map<String, String> b = new HashMap();
    private static final Object c = new Object();

    public static void c(Context context) {
        synchronized (c) {
            d(context.getApplicationContext());
            if (i()) {
                HMSLog.i(a, "The local secret is already in separate file mode.");
                return;
            }
            File file = new File(e.c(context.getApplicationContext()) + "/shared_prefs/LocalAvengers.xml");
            if (file.exists()) {
                if (file.exists() && !file.delete()) {
                    Log.e("IOUtil", "deleteSecure exception");
                }
                HMSLog.i(a, "destroy C, delete file LocalAvengers.xml.");
            }
            byte[] bArrRemoteActionCompatParcelizer = accessminIntrinsicHeightjd.RemoteActionCompatParcelizer(32);
            byte[] bArrRemoteActionCompatParcelizer2 = accessminIntrinsicHeightjd.RemoteActionCompatParcelizer(32);
            byte[] bArrRemoteActionCompatParcelizer3 = accessminIntrinsicHeightjd.RemoteActionCompatParcelizer(32);
            byte[] bArrRemoteActionCompatParcelizer4 = accessminIntrinsicHeightjd.RemoteActionCompatParcelizer(32);
            String strA = d.a(bArrRemoteActionCompatParcelizer);
            String strA2 = d.a(bArrRemoteActionCompatParcelizer2);
            String strA3 = d.a(bArrRemoteActionCompatParcelizer3);
            String strA4 = d.a(bArrRemoteActionCompatParcelizer4);
            a(strA, strA2, strA3, strA4, ComposeScrollCaptureCallbackonScrollCaptureImageRequest1.IconCompatParcelizer(d.a(accessminIntrinsicHeightjd.RemoteActionCompatParcelizer(32)), a(strA, strA2, strA3, strA4)), context);
            HMSLog.i(a, "generate D.");
        }
    }

    private static String e(Context context) {
        synchronized (l.class) {
            String strWrite = ComposeScrollCaptureCallbackonScrollCaptureImageRequest1.write(f(), b());
            if (n.a(strWrite)) {
                HMSLog.i(a, "keyS has been upgraded, no require operate again.");
                return strWrite;
            }
            String strWrite2 = ComposeScrollCaptureCallbackonScrollCaptureImageRequest1.write(f(), (byte[]) h().serializer.clone());
            if (n.a(strWrite2)) {
                HMSLog.i(a, "keyS is encrypt by RootKeyUtil, upgrade encrypt mode.");
                a(ComposeScrollCaptureCallbackonScrollCaptureImageRequest1.IconCompatParcelizer(strWrite2, b()), context);
                return strWrite2;
            }
            String strWrite3 = ComposeScrollCaptureCallbackonScrollCaptureImageRequest1.write(f(), FixedScale.IconCompatParcelizer(d(), e(), c(), accessmaxIntrinsicWidthjd.RemoteActionCompatParcelizer(g()), 32, false));
            if (!n.a(strWrite3)) {
                HMSLog.e(a, "all mode unable to decrypt root key.");
                return "";
            }
            HMSLog.i(a, "keyS is encrypt by ExportRootKey with sha1, upgrade encrypt mode to sha256.");
            a(ComposeScrollCaptureCallbackonScrollCaptureImageRequest1.IconCompatParcelizer(strWrite3, b()), context);
            return strWrite3;
        }
    }

    private static String f() {
        return a(Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY);
    }

    private static String g() {
        return a(Constants.BRAZE_PUSH_TITLE_KEY);
    }

    private static void a(String str, String str2, String str3, String str4, String str5, Context context) throws Throwable {
        String strC = e.c(context.getApplicationContext());
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        try {
            a("m", str, strC + "/files/math/m");
            a(Constants.BRAZE_PUSH_PRIORITY_KEY, str2, strC + "/files/panda/p");
            a(Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, str3, strC + "/files/panda/d");
            a(Constants.BRAZE_PUSH_TITLE_KEY, str4, strC + "/files/math/t");
            a(Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, str5, strC + "/files/s");
        } catch (IOException unused) {
            HMSLog.e(a, "save key IOException.");
        }
    }

    private static launchWithCancellationSignallambda0 h() {
        String strD = d();
        String strE = e();
        String strC = c();
        String strG = g();
        launchWithCancellationSignallambda0 launchwithcancellationsignallambda0 = new launchWithCancellationSignallambda0();
        launchwithcancellationsignallambda0.serializer = null;
        byte[] bArrRemoteActionCompatParcelizer = accessmaxIntrinsicWidthjd.RemoteActionCompatParcelizer(strG);
        ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.write("RootKeyUtil");
        launchwithcancellationsignallambda0.serializer = FixedScale.IconCompatParcelizer(strD, strE, strC, bArrRemoteActionCompatParcelizer, 16, true);
        return launchwithcancellationsignallambda0;
    }

    private static boolean i() {
        return !TextUtils.isEmpty(f());
    }

    public static String b(Context context) {
        if (!i()) {
            HMSLog.i(a, "work key is empty, execute init.");
            c(context);
        }
        String strWrite = ComposeScrollCaptureCallbackonScrollCaptureImageRequest1.write(f(), b());
        return n.a(strWrite) ? strWrite : e(context);
    }

    private static void d(Context context) throws Throwable {
        if (i()) {
            HMSLog.i(a, "secretKeyCache not empty.");
            return;
        }
        b.clear();
        String strC = e.c(context);
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        String strA = m.a(strC + "/files/math/m");
        String strA2 = m.a(strC + "/files/panda/p");
        String strA3 = m.a(strC + "/files/panda/d");
        String strA4 = m.a(strC + "/files/math/t");
        String strA5 = m.a(strC + "/files/s");
        if (n.a(strA, strA2, strA3, strA4, strA5)) {
            b.put("m", strA);
            b.put(Constants.BRAZE_PUSH_PRIORITY_KEY, strA2);
            b.put(Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, strA3);
            b.put(Constants.BRAZE_PUSH_TITLE_KEY, strA4);
            b.put(Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, strA5);
        }
    }

    private static byte[] b() {
        return a(d(), e(), c(), g());
    }

    private static String a() {
        return "2A57086C86EF54970C1E6EB37BFC72B1";
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null && bArr.length != 0 && bArr2.length != 0) {
            int length = bArr.length;
            if (length != bArr2.length) {
                return new byte[0];
            }
            byte[] bArr3 = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
            }
            return bArr3;
        }
        return new byte[0];
    }

    private static byte[] a(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = (byte) (bArr[i] >> 2);
            }
            return bArr;
        }
        return new byte[0];
    }

    public static byte[] a(Context context) {
        byte[] bArrA = d.a(context.getString(R.string.push_cat_head));
        byte[] bArrA2 = d.a(context.getString(R.string.push_cat_body));
        return a(a(a(bArrA, bArrA2), d.a(a())));
    }

    private static void a(String str, Context context) throws Throwable {
        String strC = e.c(context.getApplicationContext());
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        try {
            a(Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, str, strC + "/files/s");
        } catch (IOException unused) {
            HMSLog.e(a, "save keyS IOException.");
        }
    }

    private static void a(String str, String str2, String str3) throws Throwable {
        BufferedWriter bufferedWriter;
        HMSLog.i(a, "save local secret key.");
        OutputStreamWriter outputStreamWriter = null;
        try {
            File file = new File(str3);
            m.a(file);
            OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(file), com.adjust.sdk.Constants.ENCODING);
            try {
                bufferedWriter = new BufferedWriter(outputStreamWriter2);
                try {
                    bufferedWriter.write(str2);
                    bufferedWriter.flush();
                    b.put(str, str2);
                    IOUtils.closeQuietly((Writer) outputStreamWriter2);
                    IOUtils.closeQuietly((Writer) bufferedWriter);
                } catch (Throwable th) {
                    th = th;
                    outputStreamWriter = outputStreamWriter2;
                    IOUtils.closeQuietly((Writer) outputStreamWriter);
                    IOUtils.closeQuietly((Writer) bufferedWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = null;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter = null;
        }
    }

    private static String c() {
        return a(Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE);
    }

    private static byte[] a(String str, String str2, String str3, String str4) {
        return FixedScale.IconCompatParcelizer(str, str2, str3, accessmaxIntrinsicWidthjd.RemoteActionCompatParcelizer(str4), 32, true);
    }

    private static String e() {
        return a(Constants.BRAZE_PUSH_PRIORITY_KEY);
    }

    private static String a(String str) {
        String str2 = b.get(str);
        return TextUtils.isEmpty(str2) ? "" : str2;
    }

    private static String d() {
        return a("m");
    }
}
