package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class painterResource {
    public static final AtomicInteger read = new AtomicInteger(0);

    public static void read() {
        integerResource.RemoteActionCompatParcelizer(new File(ff$$ExternalSyntheticOutline0.m(new StringBuilder(), getTheme.write, "DailyDownloads")), String.valueOf(read.incrementAndGet()));
    }

    public static int serializer() {
        String strM = ff$$ExternalSyntheticOutline0.m(new StringBuilder(), getTheme.write, "DailyDownloads");
        File file = new File(strM);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String str = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
        String str2 = simpleDateFormat.format(Long.valueOf(file.lastModified()));
        boolean zExists = file.exists();
        AtomicInteger atomicInteger = read;
        if (!zExists || !str.equals(str2)) {
            integerResource.RemoteActionCompatParcelizer(file, String.valueOf(0));
            atomicInteger.set(0);
        } else if (atomicInteger.get() <= 0) {
            try {
                atomicInteger.set(Integer.parseInt(integerResource.IconCompatParcelizer(strM)));
            } catch (NumberFormatException e) {
                WrappedCompositionsetContent1211.read("DailyDownloadsUtil", "get delay downloads error:" + e.getMessage());
                if (file.delete()) {
                    WrappedCompositionsetContent1211.read("DailyDownloadsUtil", "downloads file delete error:" + e.getMessage());
                }
            }
        }
        return atomicInteger.get();
    }
}
