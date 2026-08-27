package o;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.GregorianCalendar;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public abstract class runInTransaction {
    private static int read = 0;
    private static int serializer = 1;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    public static Uri RemoteActionCompatParcelizer(File file, valueOf valueof) {
        Uri uri;
        int i = 2 % 2;
        int i2 = serializer + 65;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        try {
            try {
                if (i2 % 2 != 0) {
                    valueof.getClass();
                    uri = read(file, (File) valueof.RemoteActionCompatParcelizer);
                    file.delete();
                    int i3 = 90 / 0;
                } else {
                    valueof.getClass();
                    uri = read(file, (File) valueof.RemoteActionCompatParcelizer);
                    file.delete();
                }
                int i4 = serializer + 99;
                read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                file = i4 % 2;
                return uri;
            } catch (IOException unused) {
                throw new androidx.camera.core.ImageCaptureException(1, "Failed to write to OutputStream.", null);
            }
        } catch (Throwable th) {
            file.delete();
            throw th;
        }
    }

    public static Uri read(File file, File file2) throws androidx.camera.core.ImageCaptureException {
        int i = 2 % 2;
        if (file2.exists()) {
            int i2 = read + 109;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            file2.delete();
        }
        if (!file.renameTo(file2)) {
            throw new androidx.camera.core.ImageCaptureException(1, "Failed to overwrite the file: " + file2.getAbsolutePath(), null);
        }
        Uri uriFromFile = Uri.fromFile(file2);
        int i4 = serializer + 57;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
        return uriFromFile;
    }

    public static File IconCompatParcelizer(valueOf valueof) throws androidx.camera.core.ImageCaptureException {
        String strSubstring;
        int i = 2 % 2;
        try {
            File file = (File) valueof.RemoteActionCompatParcelizer;
            String parent = file.getParent();
            StringBuilder sb = new StringBuilder("CameraX");
            sb.append(UUID.randomUUID().toString());
            String name = file.getName();
            int iLastIndexOf = name.lastIndexOf(46);
            if (iLastIndexOf >= 0) {
                int i2 = serializer + 69;
                read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    name.substring(iLastIndexOf);
                    throw null;
                }
                strSubstring = name.substring(iLastIndexOf);
            } else {
                int i3 = serializer + 65;
                read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                strSubstring = "";
            }
            sb.append(strSubstring);
            return new File(parent, sb.toString());
        } catch (IOException e) {
            throw new androidx.camera.core.ImageCaptureException(1, "Failed to create temp file.", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static GregorianCalendar write(String str) {
        ZonedDateTime zonedDateTime;
        int i = 2 % 2;
        str.getClass();
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        zoneIdSystemDefault.getClass();
        Object objMediaSessionCompatResultReceiverWrapper = RoomDatabaseExternalSyntheticLambda1.serializer.MediaSessionCompatResultReceiverWrapper();
        objMediaSessionCompatResultReceiverWrapper.getClass();
        TemporalAccessor best = ((DateTimeFormatter) objMediaSessionCompatResultReceiverWrapper).parseBest(str, new useConnection(0), new useConnection(2));
        if (best instanceof ZonedDateTime) {
            int i2 = serializer + 33;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 6 / 0;
                zonedDateTime = (ZonedDateTime) best;
            } else {
                zonedDateTime = (ZonedDateTime) best;
            }
        } else {
            best.getClass();
            ChronoZonedDateTime<LocalDate> chronoZonedDateTimeAtZone = ((LocalDateTime) best).atZone(zoneIdSystemDefault);
            chronoZonedDateTimeAtZone.getClass();
            int i4 = serializer + 87;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            zonedDateTime = chronoZonedDateTimeAtZone;
        }
        GregorianCalendar gregorianCalendarFrom = GregorianCalendar.from(zonedDateTime);
        gregorianCalendarFrom.getClass();
        return gregorianCalendarFrom;
    }
}
