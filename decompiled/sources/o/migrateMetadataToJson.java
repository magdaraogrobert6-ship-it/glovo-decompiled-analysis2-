package o;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public abstract class migrateMetadataToJson {
    public static void IconCompatParcelizer(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[androidx.compose.ui.graphics.Fields.TransformOrigin];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    public static void write(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
