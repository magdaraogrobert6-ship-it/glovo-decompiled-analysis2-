package o;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ViewRootForTest {
    public static void serializer(String str, String str2) {
        String str3;
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(str2);
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[androidx.compose.ui.graphics.Fields.RotationZ];
                        while (true) {
                            int i = fileInputStream.read(bArr);
                            if (i == -1) {
                                fileOutputStream.write(byteArrayOutputStream.toByteArray());
                                byteArrayOutputStream.close();
                                fileOutputStream.close();
                                fileInputStream.close();
                                return;
                            }
                            byteArrayOutputStream.write(bArr, 0, i);
                            try {
                                throw th;
                            } catch (Throwable th) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Throwable th5) {
                                th3.addSuppressed(th5);
                            }
                            throw th4;
                        }
                    }
                } catch (Throwable th6) {
                    throw th6;
                }
            } catch (Throwable th7) {
                try {
                    throw th7;
                } catch (Throwable th8) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th9) {
                        th7.addSuppressed(th9);
                    }
                    throw th8;
                }
            }
        } catch (FileNotFoundException unused) {
            str3 = "FileNotFoundException";
            Log.e("SdmLocationLite", str3);
        } catch (IOException unused2) {
            str3 = "IOException";
            Log.e("SdmLocationLite", str3);
        }
    }
}
