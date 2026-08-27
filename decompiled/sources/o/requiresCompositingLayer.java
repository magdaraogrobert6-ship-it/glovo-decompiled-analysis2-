package o;

import android.app.Application;
import android.net.Uri;
import android.os.Environment;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class requiresCompositingLayer implements applyClip {
    public final setTopLeftgyyYBs IconCompatParcelizer;
    public final calculateMatrix write;

    public requiresCompositingLayer(calculateMatrix calculatematrix, setTopLeftgyyYBs settopleftgyyybs) {
        this.write = calculatematrix;
        this.IconCompatParcelizer = settopleftgyyybs;
    }

    @Override // o.applyClip
    public final getAnyChangeConsumedimpl RemoteActionCompatParcelizer(String str) {
        Uri uriFromFile;
        calculateMatrix calculatematrix = this.write;
        try {
            File fileCreateTempFile = File.createTempFile("JPEG_".concat(str + '_' + new SimpleDateFormat("yyyyMMdd_HHmmss", java.util.Locale.getDefault()).format(new Date())), ".jpg", ((discardDisplayList) calculatematrix).write.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
            fileCreateTempFile.getClass();
            setTopLeftgyyYBs settopleftgyyybs = this.IconCompatParcelizer;
            String absolutePath = fileCreateTempFile.getAbsolutePath();
            absolutePath.getClass();
            ((GraphicsLayerImpl) settopleftgyyybs).write = absolutePath;
            Application application = ((discardDisplayList) calculatematrix).write;
            try {
                uriFromFile = clearFocusdefault.write(application, fileCreateTempFile, application.getPackageName() + ".com.deliveryhero.customerchat.image.provider");
                uriFromFile.getClass();
            } catch (Exception unused) {
                uriFromFile = Uri.fromFile(fileCreateTempFile);
                uriFromFile.getClass();
            }
            return new applyCompositingStrategyWpw9cng(uriFromFile);
        } catch (IOException e) {
            return new accesssetTestFailCreateRenderNodecp(new Throwable(e.getLocalizedMessage()));
        }
    }
}
