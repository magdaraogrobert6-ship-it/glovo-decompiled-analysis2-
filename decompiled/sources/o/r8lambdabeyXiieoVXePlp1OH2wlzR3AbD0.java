package o;

import android.content.Context;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.logging.LogFilePurpose;
import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "LogDirMaintainer")
public class r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0 {
    private final accessstringAndKey IconCompatParcelizer;
    private final Context RemoteActionCompatParcelizer;
    private ConfigurationManager read;
    private parseLonglambda0 serializer;

    public final void IconCompatParcelizer() {
        synchronized (this) {
            for (File file : migrateSealedSessionsMapToJsonlambda0.IconCompatParcelizer(parseStringlambda0.IconCompatParcelizer(this.RemoteActionCompatParcelizer), true)) {
                if (!IconCompatParcelizer(file.getName())) {
                    file.delete();
                } else if (!RemoteActionCompatParcelizer(file)) {
                    write(file);
                }
            }
        }
    }

    public r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0(Context context, accessstringAndKey accessstringandkey) {
        this.RemoteActionCompatParcelizer = context;
        this.IconCompatParcelizer = accessstringandkey;
    }

    private boolean RemoteActionCompatParcelizer(File file) {
        ConfigurationManager configurationManager;
        String name = file.getName();
        this.IconCompatParcelizer.getClass();
        Date dateWrite = accessstringAndKey.write(name);
        if (dateWrite == null) {
            RemoteActionCompatParcelizer().write("Could not parse date information from the file: ", name);
            if (!file.delete()) {
                return false;
            }
            RemoteActionCompatParcelizer().write("File deleted: ", name);
            return true;
        }
        synchronized (this) {
            if (this.read == null) {
                this.read = (ConfigurationManager) setPushUniqueId.read(ConfigurationManager.class);
            }
            configurationManager = this.read;
        }
        if (!dateWrite.before(new Date(com.sentiance.sdk.util.x.RemoteActionCompatParcelizer().getTime() - TimeUnit.DAYS.toMillis(configurationManager.read()))) || !file.delete()) {
            return false;
        }
        RemoteActionCompatParcelizer().write("Deleted outdated file: %s", name);
        return true;
    }

    private void write(File file) {
        String name = file.getName();
        this.IconCompatParcelizer.getClass();
        Date dateWrite = accessstringAndKey.write(name);
        if (dateWrite != null) {
            long time = dateWrite.getTime();
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(time);
            int i = calendar.get(5);
            int i2 = calendar.get(2);
            int i3 = calendar.get(1);
            int i4 = calendar2.get(5);
            int i5 = calendar2.get(2);
            int i6 = calendar2.get(1);
            if ((i == i4 && i2 == i5 && i3 == i6) || name.endsWith(".gz")) {
                return;
            }
            if (migrateSealedSessionsMapToJsonlambda0.read(file, "", null) == null) {
                RemoteActionCompatParcelizer().RemoteActionCompatParcelizer("Failed to gzip file: ".concat(name), new Object[0]);
            } else if (file.delete()) {
                RemoteActionCompatParcelizer().IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m("File ", name, " was removed."), new Object[0]);
            }
        }
    }

    private parseLonglambda0 RemoteActionCompatParcelizer() {
        if (this.serializer == null) {
            this.serializer = (parseLonglambda0) setPushUniqueId.read(parseLonglambda0.class, getClass());
        }
        return this.serializer;
    }

    public static boolean IconCompatParcelizer(String str) {
        for (LogFilePurpose logFilePurpose : LogFilePurpose.values()) {
            if (str.startsWith(logFilePurpose.getFileName() + "-")) {
                return true;
            }
        }
        return false;
    }
}
