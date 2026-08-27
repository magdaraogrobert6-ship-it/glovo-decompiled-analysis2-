package o;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ScrollCapture {
    static {
        Uri.parse("content://com.huawei.hwid");
    }

    public static FileInputStream write(Context context) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.createDeviceProtectedStorageContext().getFilesDir());
        String str = File.separator;
        sb2.append(str);
        sb2.append("aegis");
        sb.append(sb2.toString());
        sb.append(str);
        sb.append("hmsrootcas.bks");
        if (!new File(sb.toString()).exists()) {
            return null;
        }
        scrollTo.write("BksUtil");
        try {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(context.createDeviceProtectedStorageContext().getFilesDir() + str + "aegis");
            sb3.append(str);
            sb3.append("hmsrootcas.bks");
            return new FileInputStream(sb3.toString());
        } catch (FileNotFoundException unused) {
            scrollTo.read("BksUtil", "FileNotFoundExceptio: ");
            return null;
        }
    }
}
