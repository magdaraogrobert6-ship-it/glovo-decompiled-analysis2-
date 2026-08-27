package o;

import android.app.Application;
import android.net.Uri;
import android.os.Environment;
import android.os.Process;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/* JADX INFO: loaded from: classes3.dex */
public final class optionalFontFamilyFromName implements getDefault_3YsG6Y {
    public static int IconCompatParcelizer = 0;
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public static int read;
    public final AnnotatedStringCompanion RemoteActionCompatParcelizer;
    public final AnnotatedStringspecialinlinedsortedBy1 serializer;
    public final DateTimeFormatter write;

    public optionalFontFamilyFromName(AnnotatedStringspecialinlinedsortedBy1 annotatedStringspecialinlinedsortedBy1, AnnotatedStringCompanion annotatedStringCompanion) {
        annotatedStringspecialinlinedsortedBy1.getClass();
        annotatedStringCompanion.getClass();
        this.serializer = annotatedStringspecialinlinedsortedBy1;
        this.RemoteActionCompatParcelizer = annotatedStringCompanion;
        this.write = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss").withLocale(java.util.Locale.getDefault()).withZone(ZoneId.of("UTC"));
    }

    @Override // o.getDefault_3YsG6Y
    public final applyPausedPrecomposition RemoteActionCompatParcelizer(String str) {
        applyPausedPrecomposition experimentalTextApi;
        Uri uriFromFile;
        int i = 2 % 2;
        AnnotatedStringspecialinlinedsortedBy1 annotatedStringspecialinlinedsortedBy1 = this.serializer;
        str.getClass();
        try {
            String strConcat = "JPEG_".concat(str + BundleUtil.UNDERLINE_TAG + this.write.format(Instant.now()));
            annotatedStringspecialinlinedsortedBy1.getClass();
            Application application = annotatedStringspecialinlinedsortedBy1.serializer;
            File fileCreateTempFile = File.createTempFile(strConcat, ".jpg", application.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
            fileCreateTempFile.getClass();
            AnnotatedStringCompanion annotatedStringCompanion = this.RemoteActionCompatParcelizer;
            String absolutePath = fileCreateTempFile.getAbsolutePath();
            absolutePath.getClass();
            AnnotatedStringRange annotatedStringRange = (AnnotatedStringRange) annotatedStringCompanion;
            annotatedStringRange.getClass();
            annotatedStringRange.IconCompatParcelizer = absolutePath;
            try {
                uriFromFile = clearFocusdefault.write(application, fileCreateTempFile, annotatedStringspecialinlinedsortedBy1.IconCompatParcelizer);
                uriFromFile.getClass();
            } catch (Exception unused) {
                uriFromFile = Uri.fromFile(fileCreateTempFile);
                uriFromFile.getClass();
            }
            experimentalTextApi = new addSpan(uriFromFile);
        } catch (IOException e) {
            experimentalTextApi = new ExperimentalTextApi(new Throwable(e.getLocalizedMessage()));
        }
        int i2 = MediaDescriptionCompat + 1;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return experimentalTextApi;
    }

    public static int write() {
        int i = IconCompatParcelizer;
        int i2 = i % 7905329;
        IconCompatParcelizer = i + 1;
        if (i2 != 0) {
            return read;
        }
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        read = startUptimeMillis;
        return startUptimeMillis;
    }
}
