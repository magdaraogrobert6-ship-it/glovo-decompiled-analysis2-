package o;

import android.content.Context;
import com.sentiance.sdk.logging.LogFilePurpose;
import com.sentiance.sdk.logging.Resource;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.EnumMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class parseStringAsColorIntlambda1 {
    private static final String write = LogFilePurpose.USAGE.getFileName();
    private final parseStringlambda0 read;
    private final Object IconCompatParcelizer = new Object();
    private final EnumMap RemoteActionCompatParcelizer = new EnumMap(Resource.class);
    private final SimpleDateFormat serializer = new SimpleDateFormat("HH:mm:ss.SSS", java.util.Locale.ENGLISH);

    public final void RemoteActionCompatParcelizer(long j, String str, Resource resource) {
        synchronized (this.IconCompatParcelizer) {
            parseStringAsBooleanlambda1 parsestringasbooleanlambda1 = (parseStringAsBooleanlambda1) this.RemoteActionCompatParcelizer.get(resource);
            if (parsestringasbooleanlambda1 == null) {
                return;
            }
            long[] jArrSerializer = parsestringasbooleanlambda1.serializer(j, str);
            if (jArrSerializer[0] == -1) {
                return;
            }
            try {
                this.read.read(String.format(java.util.Locale.ENGLISH, "%s\t%-30s\t%-7d\t%-7d\t%s", this.serializer.format(Calendar.getInstance().getTime()), resource.name(), Long.valueOf(jArrSerializer[0]), Long.valueOf(jArrSerializer[1]), str));
            } catch (Exception unused) {
            }
        }
    }

    public final void a(long j, String str, Resource resource) {
        synchronized (this.IconCompatParcelizer) {
            parseStringAsBooleanlambda1 parsestringasbooleanlambda1 = (parseStringAsBooleanlambda1) this.RemoteActionCompatParcelizer.get(resource);
            if (parsestringasbooleanlambda1 == null) {
                parsestringasbooleanlambda1 = new parseStringAsBooleanlambda1();
                parsestringasbooleanlambda1.RemoteActionCompatParcelizer = new LinkedHashMap();
                this.RemoteActionCompatParcelizer.put(resource, parsestringasbooleanlambda1);
            }
            LinkedHashMap linkedHashMap = parsestringasbooleanlambda1.RemoteActionCompatParcelizer;
            if (linkedHashMap.get(str) == null) {
                if (linkedHashMap.size() == 0) {
                    parsestringasbooleanlambda1.write = j;
                }
                linkedHashMap.put(str, Long.valueOf(j));
            }
        }
    }

    public parseStringAsColorIntlambda1(Context context, r8lambdabeyXiieoVXePlp1OH2wlzR3AbD0 r8lambdabeyxiieovxeplp1oh2wlzr3abd0, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni) {
        this.read = new parseStringlambda0(context, write, r8lambdabeyxiieovxeplp1oh2wlzr3abd0, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni);
    }
}
