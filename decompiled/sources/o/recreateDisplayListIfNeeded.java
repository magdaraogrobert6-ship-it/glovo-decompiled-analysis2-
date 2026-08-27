package o;

import android.app.Application;
import android.net.Uri;
import android.os.Environment;
import com.foodora.courier.app.application.CourierApplication;
import java.io.File;
import java.io.IOException;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final class recreateDisplayListIfNeeded implements resetOutlineParams {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final recordInternal IconCompatParcelizer;
    public final Application write;

    public recreateDisplayListIfNeeded(Application application, recordInternal recordinternal) {
        this.write = application;
        this.IconCompatParcelizer = recordinternal;
    }

    public final Uri read(File file) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 77;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        file.getClass();
        String string = ((CourierApplication) ((getExponentimpl) this.IconCompatParcelizer).read).getString(com.logistics.rider.glovo.R.string.AUTHORITIES_PICTURE_FILE_PROVIDER);
        string.getClass();
        Uri uriWrite = clearFocusdefault.write(this.write, file, string);
        uriWrite.getClass();
        int i4 = RemoteActionCompatParcelizer + 103;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return uriWrite;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final File IconCompatParcelizer(String str) throws IOException {
        Uri uriWrite;
        int i = 2 % 2;
        Application application = this.write;
        File file = new File(application.getFilesDir(), Environment.DIRECTORY_PICTURES);
        if (!file.exists()) {
            file.mkdirs();
        }
        File fileCreateTempFile = File.createTempFile(str, ".jpg", file);
        fileCreateTempFile.getClass();
        try {
            String string = ((CourierApplication) ((getExponentimpl) this.IconCompatParcelizer).read).getString(com.logistics.rider.glovo.R.string.AUTHORITIES_PICTURE_FILE_PROVIDER);
            string.getClass();
            uriWrite = clearFocusdefault.write(application, fileCreateTempFile, string);
            uriWrite.getClass();
        } catch (IllegalArgumentException unused) {
            uriWrite = Uri.EMPTY;
            uriWrite.getClass();
        }
        if (uriWrite.equals(Uri.EMPTY)) {
            Timber.RemoteActionCompatParcelizer.write(new Throwable("Empty URI for file in internal directory"));
            fileCreateTempFile = File.createTempFile(str, ".jpg", application.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
            fileCreateTempFile.getClass();
            int i2 = read + 23;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
        }
        int i4 = RemoteActionCompatParcelizer + 121;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
        return fileCreateTempFile;
    }
}
