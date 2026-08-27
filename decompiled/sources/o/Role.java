package o;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Role {
    public static String IconCompatParcelizer(FileInputStream fileInputStream) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, com.adjust.sdk.Constants.ENCODING);
        try {
            StringWriter stringWriter = new StringWriter();
            try {
                char[] cArr = new char[androidx.compose.ui.graphics.Fields.TransformOrigin];
                while (true) {
                    int i = inputStreamReader.read(cArr);
                    if (-1 != i) {
                        stringWriter.write(cArr, 0, i);
                    } else {
                        String string = stringWriter.toString();
                        stringWriter.close();
                        inputStreamReader.close();
                        return string;
                    }
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    stringWriter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            inputStreamReader.close();
            throw th4;
        }
    }
}
