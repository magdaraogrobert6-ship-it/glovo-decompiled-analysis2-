package o;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getToggleOff5zf0vsI {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final forEachImmediateDelegateui read;
    public final PendingIntent write;

    public abstract Object IconCompatParcelizer(Intent intent);

    public abstract ArrayList IconCompatParcelizer(Object obj);

    public abstract void IconCompatParcelizer();

    public abstract void RemoteActionCompatParcelizer();

    public abstract boolean RemoteActionCompatParcelizer(Intent intent);

    public abstract ArrayList read(Object obj);

    public abstract void read();

    public abstract Object serializer(Intent intent);

    public abstract void write();

    public abstract boolean write(Intent intent);

    public getToggleOff5zf0vsI(int i, PendingIntent pendingIntent) {
        this.write = pendingIntent;
        this.read = new forEachImmediateDelegateui(i);
    }

    public static long serializer(long j, TimeUnit timeUnit) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 3;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        timeUnit.getClass();
        long jConvert = TimeUnit.MILLISECONDS.convert(j, timeUnit) + (DateTime.now().getMillis() - SystemClock.elapsedRealtime());
        int i4 = serializer + 75;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return jConvert;
    }
}
