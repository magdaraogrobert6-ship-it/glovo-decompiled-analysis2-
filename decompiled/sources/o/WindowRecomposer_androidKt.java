package o;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class WindowRecomposer_androidKt {
    /* JADX WARN: Code duplicated, block: B:38:0x008b A[Catch: IOException -> 0x0087, TryCatch #0 {IOException -> 0x0087, blocks: (B:34:0x0083, B:38:0x008b, B:40:0x0090), top: B:57:0x0083 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0090 A[Catch: IOException -> 0x0087, TRY_LEAVE, TryCatch #0 {IOException -> 0x0087, blocks: (B:34:0x0083, B:38:0x008b, B:40:0x0090), top: B:57:0x0083 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00b4 A[Catch: IOException -> 0x00b0, TryCatch #6 {IOException -> 0x00b0, blocks: (B:47:0x00ac, B:51:0x00b4, B:53:0x00b9), top: B:64:0x00ac }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00b9 A[Catch: IOException -> 0x00b0, TRY_LEAVE, TryCatch #6 {IOException -> 0x00b0, blocks: (B:47:0x00ac, B:51:0x00b4, B:53:0x00b9), top: B:64:0x00ac }] */
    public static boolean IconCompatParcelizer(String str, String str2) throws Throwable {
        Throwable th;
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        Exception e;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                fileOutputStream = new FileOutputStream(str2);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        try {
                            byte[] bArr = new byte[androidx.compose.ui.graphics.Fields.RotationZ];
                            while (true) {
                                int i = fileInputStream.read(bArr);
                                if (i == -1) {
                                    fileOutputStream.write(byteArrayOutputStream.toByteArray());
                                    try {
                                        byteArrayOutputStream.close();
                                        fileOutputStream.close();
                                        fileInputStream.close();
                                        return true;
                                    } catch (IOException e2) {
                                        Log.e("LibraryUtils", "close fileStream error: " + e2.getMessage());
                                        return true;
                                    }
                                }
                                byteArrayOutputStream.write(bArr, 0, i);
                                th = th;
                                byteArrayOutputStream2 = byteArrayOutputStream;
                                if (byteArrayOutputStream2 != null) {
                                    try {
                                        byteArrayOutputStream2.close();
                                        if (fileOutputStream != null) {
                                            fileOutputStream.close();
                                        }
                                        if (fileInputStream != null) {
                                            fileInputStream.close();
                                        }
                                    } catch (IOException e3) {
                                        Log.e("LibraryUtils", "close fileStream error: " + e3.getMessage());
                                    }
                                } else {
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                    if (fileInputStream != null) {
                                        fileInputStream.close();
                                    }
                                }
                                throw th;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            Log.e("LibraryUtils", "copy file error: " + e.getMessage());
                            if (byteArrayOutputStream != null) {
                                try {
                                    byteArrayOutputStream.close();
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                    if (fileInputStream != null) {
                                        fileInputStream.close();
                                    }
                                } catch (IOException e5) {
                                    Log.e("LibraryUtils", "close fileStream error: " + e5.getMessage());
                                    return false;
                                }
                            } else {
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                            }
                            return false;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        byteArrayOutputStream2 = byteArrayOutputStream;
                    }
                } catch (Exception e6) {
                    e = e6;
                    byteArrayOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e7) {
                byteArrayOutputStream = null;
                e = e7;
                fileOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
        } catch (Exception e8) {
            byteArrayOutputStream = null;
            fileInputStream = null;
            e = e8;
            fileOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = null;
            fileInputStream = null;
        }
    }
}
