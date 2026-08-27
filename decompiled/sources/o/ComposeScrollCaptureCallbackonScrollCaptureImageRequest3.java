package o;

import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ComposeScrollCaptureCallbackonScrollCaptureImageRequest3 {
    public static final String[] read = {"SHA-256", "SHA-384", "SHA-512"};

    /* JADX WARN: Code duplicated, block: B:59:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v4, types: [long] */
    public static boolean read(File file, String str) throws Throwable {
        String strRemoteActionCompatParcelizer;
        FileInputStream fileInputStream;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.isEmpty("SHA-256")) {
            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("FileSHA256", "algorithm is empty or not safe");
            strRemoteActionCompatParcelizer = "";
        } else {
            int i = 0;
            while (true) {
                if (i >= 3) {
                    ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("FileSHA256", "algorithm is empty or not safe");
                    break;
                }
                if (read[i].equals("SHA-256")) {
                    if (file != null && file.exists()) {
                        ?? length = file.length();
                        if (length > 0) {
                            ?? r4 = 0;
                            strRemoteActionCompatParcelizer = null;
                            strRemoteActionCompatParcelizer = null;
                            strRemoteActionCompatParcelizer = null;
                            try {
                                try {
                                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                                    fileInputStream = new FileInputStream(file);
                                    try {
                                        byte[] bArr = new byte[8192];
                                        boolean z = false;
                                        while (true) {
                                            int i2 = fileInputStream.read(bArr);
                                            if (i2 <= 0) {
                                                break;
                                            }
                                            messageDigest.update(bArr, 0, i2);
                                            z = true;
                                        }
                                        strRemoteActionCompatParcelizer = z ? accessmaxIntrinsicWidthjd.RemoteActionCompatParcelizer(messageDigest.digest()) : null;
                                        try {
                                            fileInputStream.close();
                                        } catch (IOException unused) {
                                            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("IOUtil", "closeSecure IOException");
                                        }
                                    } catch (IOException e) {
                                        e = e;
                                        ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("FileSHA256", "IOException" + e.getMessage());
                                        if (fileInputStream != null) {
                                            try {
                                                fileInputStream.close();
                                            } catch (IOException unused2) {
                                                ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("IOUtil", "closeSecure IOException");
                                            }
                                        }
                                    } catch (NoSuchAlgorithmException e2) {
                                        e = e2;
                                        ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("FileSHA256", "NoSuchAlgorithmException" + e.getMessage());
                                        if (fileInputStream != null) {
                                            fileInputStream.close();
                                        }
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    r4 = length;
                                    if (r4 != 0) {
                                        try {
                                            r4.close();
                                        } catch (IOException unused3) {
                                            ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("IOUtil", "closeSecure IOException");
                                        }
                                    }
                                    throw th;
                                }
                            } catch (IOException e3) {
                                e = e3;
                                fileInputStream = null;
                            } catch (NoSuchAlgorithmException e4) {
                                e = e4;
                                fileInputStream = null;
                            } catch (Throwable th2) {
                                th = th2;
                                if (r4 != 0) {
                                    r4.close();
                                }
                                throw th;
                            }
                        }
                    }
                    ComposeScrollCaptureCallback_androidKtlaunchWithCancellationSignal1.serializer("FileSHA256", "file is not valid");
                    break;
                }
                i++;
            }
            strRemoteActionCompatParcelizer = "";
        }
        return str.equalsIgnoreCase(strRemoteActionCompatParcelizer);
    }
}
