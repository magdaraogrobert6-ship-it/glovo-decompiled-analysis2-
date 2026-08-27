package o;

import android.text.TextUtils;
import com.huawei.location.nlp.scan.FB;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class integerResource {
    public static String IconCompatParcelizer(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(RemoteActionCompatParcelizer(str));
            try {
                byte[] bArr = new byte[androidx.compose.ui.graphics.Fields.RotationZ];
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i == -1) {
                        String string = sb.toString();
                        fileInputStream.close();
                        return string;
                    }
                    sb.append(new String(bArr, 0, i, StandardCharsets.UTF_8));
                    WrappedCompositionsetContent1211.read("FileUtils", "read data from file failed");
                    return null;
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            WrappedCompositionsetContent1211.read("FileUtils", "read data from file failed");
            return null;
        }
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00ce: MOVE (r3 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:56:0x00ce */
    public static boolean write(String str, String str2, String str3) throws Throwable {
        String str4;
        boolean zWrite;
        boolean z;
        boolean z2;
        File file = new File(str2);
        boolean z3 = false;
        if (!file.exists() && !file.mkdirs()) {
            WrappedCompositionsetContent1211.read();
            return false;
        }
        try {
            try {
                try {
                    FileInputStream fileInputStream = new FileInputStream(new File(RemoteActionCompatParcelizer(str)));
                    try {
                        try {
                            ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
                            try {
                                zWrite = false;
                                for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                                    try {
                                        String name = nextEntry.getName();
                                        boolean z4 = true;
                                        if (name.contains("../")) {
                                            WrappedCompositionsetContent1211.read("FileUtils", " is not security!!!");
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                        if (!z2) {
                                            zipInputStream.close();
                                            fileInputStream.close();
                                            return false;
                                        }
                                        if (nextEntry.isDirectory()) {
                                            File file2 = new File(RemoteActionCompatParcelizer(str2 + File.separator + name));
                                            if (file2.exists() || file2.mkdirs()) {
                                                z4 = false;
                                            } else {
                                                WrappedCompositionsetContent1211.read();
                                            }
                                            zWrite = z4;
                                        } else {
                                            zWrite = write(new File(RemoteActionCompatParcelizer(str2 + File.separator + str3)), zipInputStream);
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        try {
                                            zipInputStream.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                }
                                zipInputStream.close();
                                fileInputStream.close();
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                fileInputStream.close();
                            } catch (Throwable th5) {
                                th.addSuppressed(th5);
                            }
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        fileInputStream.close();
                        throw th;
                    }
                } catch (FileNotFoundException unused) {
                    z3 = z;
                    str4 = "zip error: file not found";
                    WrappedCompositionsetContent1211.read("FileUtils", str4);
                    zWrite = z3;
                }
            } catch (FileNotFoundException unused2) {
                str4 = "zip error: file not found";
                WrappedCompositionsetContent1211.read("FileUtils", str4);
                zWrite = z3;
            }
        } catch (IOException unused3) {
            str4 = "zip error";
            WrappedCompositionsetContent1211.read("FileUtils", str4);
            zWrite = z3;
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("FileUtils", "The unzip file is decompressed: " + zWrite);
        return zWrite;
    }

    public static void IconCompatParcelizer(int i, String str) {
        String str2;
        File file = new File(str);
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length >= i) {
                Arrays.sort(fileArrListFiles, new FB(18));
                for (int i2 = i - 1; i2 < fileArrListFiles.length; i2++) {
                    if (!fileArrListFiles[i2].delete()) {
                        WrappedCompositionsetContent1211.read();
                    }
                }
                return;
            }
            str2 = "The number of files does not exceed the limit.";
        } else {
            str2 = "The directory does not exist.";
        }
        WrappedCompositionsetContent1211.read("FileUtils", str2);
    }

    public static String serializer(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("FileUtils", "Failed to combine paths, the local dir is empty");
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("FileUtils", "Failed to combine paths, the download Url is empty");
            return null;
        }
        int iLastIndexOf = str2.lastIndexOf(File.separator);
        if (iLastIndexOf >= 0 && iLastIndexOf != str2.length() - 1) {
            String strSubstring = str2.substring(iLastIndexOf + 1);
            if (!Pattern.compile("[a-zA-Z0-9\\.\\-\\_]+").matcher(strSubstring).matches()) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("FileUtils", "Failed to combine paths, The file path contains invalid characters.");
                return null;
            }
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(str, strSubstring);
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("FileUtils", "Failed to combine paths, The download url is abnormal.");
        return null;
    }

    public static String RemoteActionCompatParcelizer(String str) {
        if (str == null || "".equals(str.trim())) {
            return str;
        }
        if (str.contains("../")) {
            str = str.trim().replaceAll("\\.\\./", "");
        }
        return str.contains("..\\") ? str.trim().replaceAll("\\.\\.\\\\", "") : str;
    }

    public static boolean write(File file, ZipInputStream zipInputStream) {
        byte[] bArr = new byte[androidx.compose.ui.graphics.Fields.RotationZ];
        if (!file.exists() && file.createNewFile()) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    int i = zipInputStream.read(bArr);
                    boolean z = false;
                    while (i != -1) {
                        fileOutputStream.write(bArr, 0, i);
                        i = zipInputStream.read(bArr);
                        z = true;
                    }
                    fileOutputStream.close();
                    return z;
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
                WrappedCompositionsetContent1211.read("FileUtils", "zip fos error is: ");
            }
        }
        return false;
    }

    public static void RemoteActionCompatParcelizer(File file, String str) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[androidx.compose.ui.graphics.Fields.RotationZ];
                    while (true) {
                        int i = byteArrayInputStream.read(bArr);
                        if (i == -1) {
                            fileOutputStream.close();
                            byteArrayInputStream.close();
                            return;
                        }
                        fileOutputStream.write(bArr, 0, i);
                        try {
                            byteArrayInputStream.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                byteArrayInputStream.close();
                throw th4;
            }
        } catch (IOException unused) {
            WrappedCompositionsetContent1211.read("FileUtils", "write data to file failed");
        }
    }
}
