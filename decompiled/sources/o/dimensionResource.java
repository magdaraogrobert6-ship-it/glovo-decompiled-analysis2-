package o;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dimensionResource {
    public static final char[] RemoteActionCompatParcelizer = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String serializer(String str, String str2) {
        String str3;
        byte[] bArrDigest;
        File file = new File(integerResource.RemoteActionCompatParcelizer(str));
        byte[] bytes = str2.getBytes(Charset.forName(com.adjust.sdk.Constants.ENCODING));
        int i = 0;
        if (file.exists()) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    byte[] bArr = new byte[8192];
                    int i2 = 0;
                    for (int i3 = bufferedInputStream.read(bArr); i3 != -1; i3 = bufferedInputStream.read(bArr)) {
                        messageDigest.update(bArr, 0, i3);
                        i2 += i3;
                    }
                    if (i2 > 0) {
                        if (bytes != null && bytes.length > 0) {
                            int i4 = 0;
                            while (i4 < bytes.length) {
                                int i5 = i4 + 8192;
                                if (i5 <= bytes.length) {
                                    messageDigest.update(bytes, i4, 8192);
                                } else {
                                    messageDigest.update(bytes, i4, bytes.length - i4);
                                }
                                i4 = i5;
                            }
                        }
                        bArrDigest = messageDigest.digest();
                        bufferedInputStream.close();
                    } else {
                        bufferedInputStream.close();
                        bArrDigest = null;
                    }
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused) {
                str3 = "FileNotFoundException.";
                WrappedCompositionsetContent1211.read("dC", str3);
            } catch (IOException unused2) {
                str3 = "IOException.";
                WrappedCompositionsetContent1211.read("dC", str3);
            } catch (NoSuchAlgorithmException unused3) {
                str3 = "NoSuchAlgorithmException.";
                WrappedCompositionsetContent1211.read("dC", str3);
            }
            if (bArrDigest != null || bArrDigest.length <= 0) {
                return null;
            }
            int length = bArrDigest.length;
            char[] cArr = new char[length << 1];
            int i6 = 0;
            while (i6 < length) {
                byte b = bArrDigest[i6];
                char[] cArr2 = RemoteActionCompatParcelizer;
                cArr[i] = cArr2[(b & 240) >>> 4];
                cArr[i + 1] = cArr2[b & 15];
                i6++;
                i += 2;
            }
            return new String(cArr);
        }
        str3 = "file not exist";
        WrappedCompositionsetContent1211.read("dC", str3);
        bArrDigest = null;
        if (bArrDigest != null) {
        }
        return null;
    }
}
