package o;

import android.content.Context;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.sentiance.sdk.logging.LogFilePurpose;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class parseObjectAsIntegerlambda1 {
    private static File IconCompatParcelizer;
    private String MediaBrowserCompatMediaItem;
    private String MediaMetadataCompat;
    private boolean RatingCompat;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI RemoteActionCompatParcelizer;
    private final Context read;
    private final com.sentiance.sdk.util.c serializer;
    private final String write;

    private File serializer() {
        return new File(read(this.read), ff$$ExternalSyntheticOutline0.m(new StringBuilder(), this.write, ".gz"));
    }

    public parseObjectAsIntegerlambda1(com.sentiance.sdk.util.c cVar, Context context, String str, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni) {
        this.serializer = cVar;
        this.read = context;
        this.write = str;
        this.RemoteActionCompatParcelizer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
    }

    private void read() {
        File file;
        File fileSerializer = serializer();
        boolean zExists = fileSerializer.exists();
        Context context = this.read;
        if (zExists) {
            File file2 = read(context);
            StringBuilder sb = new StringBuilder();
            sb.append(LogFilePurpose.INFERENCE.getFileName());
            sb.append("-");
            sb.append(this.MediaBrowserCompatMediaItem);
            sb.append("-");
            File file3 = new File(file2, ff$$ExternalSyntheticOutline0.m(sb, this.MediaMetadataCompat, ".gz"));
            fileSerializer.renameTo(file3);
            file = file3;
        } else {
            file = null;
        }
        if (file != null) {
            try {
                migrateSealedSessionsMapToJsonlambda0.IconCompatParcelizer(file, new File(parseStringlambda0.IconCompatParcelizer(context), file.getName()));
                file.delete();
            } catch (IOException unused) {
            }
        }
    }

    public final void RemoteActionCompatParcelizer(String str) {
        if (this.RatingCompat) {
            return;
        }
        String str2 = this.MediaMetadataCompat;
        com.sentiance.sdk.util.c cVar = this.serializer;
        if (str2 == null) {
            this.MediaMetadataCompat = cVar.write("model_io_logger_session_timestamp", (String) null);
        }
        if (this.MediaBrowserCompatMediaItem == null) {
            this.MediaBrowserCompatMediaItem = cVar.write("model_io_logger_model_identifier", (String) null);
        }
        read();
        this.RemoteActionCompatParcelizer.getClass();
        r8lambdatH7eJ6arfN_8GL3LXu9dc2bQ8 r8lambdath7ej6arfn_8gl3lxu9dc2bq8 = new r8lambdatH7eJ6arfN_8GL3LXu9dc2bQ8();
        String str3 = com.sentiance.sdk.util.x.serializer(r8lambdath7ej6arfn_8gl3lxu9dc2bq8.serializer(), "yyyyMMddHHmmss") + "." + String.format(java.util.Locale.US, "%09d", Integer.valueOf(r8lambdath7ej6arfn_8gl3lxu9dc2bq8.RemoteActionCompatParcelizer()));
        this.MediaMetadataCompat = str3;
        this.MediaBrowserCompatMediaItem = str;
        cVar.RemoteActionCompatParcelizer("model_io_logger_session_timestamp", str3);
        cVar.RemoteActionCompatParcelizer("model_io_logger_model_identifier", str);
        this.RatingCompat = true;
    }

    public final void write() {
        if (this.RatingCompat) {
            read();
            this.MediaMetadataCompat = null;
            this.MediaBrowserCompatMediaItem = null;
            com.sentiance.sdk.util.c cVar = this.serializer;
            cVar.read("model_io_logger_session_timestamp");
            cVar.read("model_io_logger_model_identifier");
            synchronized (this) {
                File[] fileArrListFiles = read(this.read).listFiles(new getTemplateFieldAtIndexlambda0(this));
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        if (file.exists() && !file.isDirectory()) {
                            file.delete();
                        }
                    }
                }
            }
            this.RatingCompat = false;
        }
    }

    public final void read(r8lambdaQL6ub89hblyhJQInoVzkJXjcYls r8lambdaql6ub89hblyhjqinovzkjxjcyls) {
        if (this.RatingCompat) {
            File fileSerializer = serializer();
            synchronized (this) {
                try {
                    getResourceConfigurationValuelambda0 getresourceconfigurationvaluelambda0 = new getResourceConfigurationValuelambda0(new readResourceValuelambda2(getResourceIdentifier.write(fileSerializer)));
                    IconCompatParcelizer(r8lambdaql6ub89hblyhjqinovzkjxjcyls, getresourceconfigurationvaluelambda0);
                    getresourceconfigurationvaluelambda0.flush();
                    getresourceconfigurationvaluelambda0.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void IconCompatParcelizer(r8lambdaQL6ub89hblyhJQInoVzkJXjcYls r8lambdaql6ub89hblyhjqinovzkjxjcyls, getResourceConfigurationValuelambda0 getresourceconfigurationvaluelambda0) throws IOException {
        r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
        r8lambdaaJvt3gXGJaLioJupTNHztNFUpQ r8lambdaajvt3gxgjaliojuptnhztnfupq = new r8lambdaaJvt3gXGJaLioJupTNHztNFUpQ(new r8lambdaTlqvW4KpMdTE6ntJJ3lie_ZvAAQ(r8lambdabeyrnr8p6809bwlboro_stans));
        r8lambdaQL6ub89hblyhJQInoVzkJXjcYls.serializer.read(r8lambdaajvt3gxgjaliojuptnhztnfupq, r8lambdaql6ub89hblyhjqinovzkjxjcyls);
        r8lambdaajvt3gxgjaliojuptnhztnfupq.MediaSessionCompatQueueItem();
        r8lambdaajvt3gxgjaliojuptnhztnfupq.close();
        int i = (int) r8lambdabeyrnr8p6809bwlboro_stans.serializer;
        r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans2 = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
        r8lambdabeyrnr8p6809bwlboro_stans2.read(i);
        getresourceconfigurationvaluelambda0.serializer(r8lambdabeyrnr8p6809bwlboro_stans2, r8lambdabeyrnr8p6809bwlboro_stans2.serializer);
        getresourceconfigurationvaluelambda0.serializer(r8lambdabeyrnr8p6809bwlboro_stans, i);
    }

    private static File read(Context context) {
        File file;
        synchronized (parseObjectAsIntegerlambda1.class) {
            if (IconCompatParcelizer == null) {
                File file2 = new File(context.getNoBackupFilesDir(), "sentiance/inference-logs");
                IconCompatParcelizer = file2;
                if (!file2.exists()) {
                    IconCompatParcelizer.mkdirs();
                }
            }
            file = IconCompatParcelizer;
        }
        return file;
    }
}
