package com.huawei.hms.hatool;

import androidx.compose.ui.graphics.Fields;
import java.io.File;
import java.io.IOException;
import o.ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1;
import o.accessmaxIntrinsicWidthjd;
import o.accessminIntrinsicHeightjd;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes2.dex */
public class x {
    private String a = q0.i().getFilesDir().getPath();

    public static boolean c() {
        return b(new File(q0.i().getFilesDir().getPath() + "/hms"));
    }

    private String d() {
        return "f6040d0e807aaec325ecf44823765544e92905158169f694b282bf17388632cf95a83bae7d2d235c1f039b0df1dcca5fda619b6f7f459f2ff8d70ddb7b601592fe29fcae58c028f319b3b12495e67aa5390942a997a8cb572c8030b2df5c2b622608bea02b0c3e5d4dff3f72c9e3204049a45c0760cd3604af8d57f0e0c693cc";
    }

    private static boolean b(File file) {
        File[] fileArrListFiles;
        if (file == null || !file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length == 0) {
            return false;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isFile()) {
                if (!file2.delete()) {
                    v.c("hmsSdk", "delete file failed : " + file2.getName());
                }
            } else if (file2.isDirectory()) {
                b(file2);
            }
        }
        return file.delete();
    }

    public String a() throws Throwable {
        String strB;
        String strB2;
        String strB3;
        String strB4;
        byte[] bArr;
        String strD = d();
        if (b()) {
            v.c("hmsSdk", "refresh components");
            strB = accessminIntrinsicHeightjd.read(Fields.SpotShadowColor);
            a("aprpap", strB);
            strB2 = accessminIntrinsicHeightjd.read(Fields.SpotShadowColor);
            a("febdoc", strB2);
            strB3 = accessminIntrinsicHeightjd.read(Fields.SpotShadowColor);
            a("marfil", strB3);
            strB4 = accessminIntrinsicHeightjd.read(Fields.SpotShadowColor);
            a("maywnj", strB4);
            d.b(q0.i(), "Privacy_MY", "assemblyFlash", System.currentTimeMillis());
        } else {
            strB = b("aprpap");
            strB2 = b("febdoc");
            strB3 = b("marfil");
            strB4 = b("maywnj");
        }
        char[] cArrA = a(strB, strB2, strB3, strD);
        byte[] bArrRemoteActionCompatParcelizer = accessmaxIntrinsicWidthjd.RemoteActionCompatParcelizer(strB4);
        if (cArrA == null || cArrA.length <= 0) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("PBKDF2", "pbkdf password is empty.");
            bArr = new byte[0];
        } else if (bArrRemoteActionCompatParcelizer.length <= 0) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("PBKDF2", "pbkdf salt is empty.");
            bArr = new byte[0];
        } else if (bArrRemoteActionCompatParcelizer.length < 16) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("PBKDF2", "pbkdf salt parameter length is not enough, length must be more than 16.");
            bArr = new byte[0];
        } else {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("PBKDF2", "pbkdf bytes parameter count is less than 256.");
            bArr = new byte[0];
        }
        return accessmaxIntrinsicWidthjd.RemoteActionCompatParcelizer(bArr);
    }

    private boolean b() {
        long jA = d.a(q0.i(), "Privacy_MY", "assemblyFlash", -1L);
        if (-1 != jA) {
            return System.currentTimeMillis() - jA > 31536000000L;
        }
        v.c("hmsSdk", "First init components");
        return true;
    }

    private String b(String str) throws Throwable {
        File file = new File(a(str), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("hianalytics_", str));
        if (a(file)) {
            return k1.a(file);
        }
        String str2 = accessminIntrinsicHeightjd.read(Fields.SpotShadowColor);
        k1.a(file, str2);
        return str2;
    }

    private String a(String str) {
        return this.a + "/hms/component/".replace("component", str);
    }

    private void a(String str, String str2) throws Throwable {
        File file = new File(a(str));
        File file2 = new File(a(str), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("hianalytics_", str));
        if (!file.exists() && file.mkdirs()) {
            v.c("hmsSdk", "file directory is mkdirs");
        }
        if (a(file2)) {
            k1.a(file2, str2);
        } else {
            v.f("hmsSdk", "refreshComponent():file is not found,and file is create failed");
        }
    }

    private boolean a(File file) {
        if (file.exists()) {
            return true;
        }
        try {
            return file.createNewFile();
        } catch (IOException unused) {
            v.f("hmsSdk", "create new file error!");
            return false;
        }
    }

    private char[] a(String str, String str2, String str3, String str4) {
        byte[] bArrRemoteActionCompatParcelizer = accessmaxIntrinsicWidthjd.RemoteActionCompatParcelizer(str);
        byte[] bArrRemoteActionCompatParcelizer2 = accessmaxIntrinsicWidthjd.RemoteActionCompatParcelizer(str2);
        byte[] bArrRemoteActionCompatParcelizer3 = accessmaxIntrinsicWidthjd.RemoteActionCompatParcelizer(str3);
        byte[] bArrRemoteActionCompatParcelizer4 = accessmaxIntrinsicWidthjd.RemoteActionCompatParcelizer(str4);
        int length = bArrRemoteActionCompatParcelizer.length;
        if (length > bArrRemoteActionCompatParcelizer2.length) {
            length = bArrRemoteActionCompatParcelizer2.length;
        }
        if (length > bArrRemoteActionCompatParcelizer3.length) {
            length = bArrRemoteActionCompatParcelizer3.length;
        }
        if (length > bArrRemoteActionCompatParcelizer4.length) {
            length = bArrRemoteActionCompatParcelizer4.length;
        }
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) (((bArrRemoteActionCompatParcelizer[i] ^ bArrRemoteActionCompatParcelizer2[i]) ^ bArrRemoteActionCompatParcelizer3[i]) ^ bArrRemoteActionCompatParcelizer4[i]);
        }
        return cArr;
    }
}
