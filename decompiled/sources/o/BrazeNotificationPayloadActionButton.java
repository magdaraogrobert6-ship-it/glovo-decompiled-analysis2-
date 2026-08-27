package o;

import android.content.Context;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.configuration.ConfigurationManager;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "KeepAwake", componentName = "KeepAwake")
public class BrazeNotificationPayloadActionButton extends createOrGetDataStorelambda00 {
    private final com.sentiance.sdk.util.c IconCompatParcelizer;
    private long MediaSessionCompatQueueItem;
    private final r8lambdafxbJOrD4Rv7HbEvEIn3jpfsEg RatingCompat;
    private final Context RemoteActionCompatParcelizer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI read;
    private final parseLonglambda0 serializer;
    private final ConfigurationManager write;

    private void RemoteActionCompatParcelizer(boolean z) {
        Long lValueOf;
        Long lAddMenuProvider;
        this.serializer.IconCompatParcelizer("Running keep awake", new Object[0]);
        Long lIconCompatParcelizer = IconCompatParcelizer();
        r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni = this.read;
        if (lIconCompatParcelizer == null || (lAddMenuProvider = this.write.addMenuProvider()) == null) {
            lValueOf = null;
        } else if (lIconCompatParcelizer.longValue() == 0) {
            r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
            lValueOf = Long.valueOf(System.currentTimeMillis());
        } else {
            r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
            lValueOf = Long.valueOf((lIconCompatParcelizer.longValue() + System.currentTimeMillis()) - lAddMenuProvider.longValue());
        }
        if (lValueOf == null) {
            r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
            lValueOf = Long.valueOf(System.currentTimeMillis());
        }
        this.IconCompatParcelizer.read(lValueOf.longValue(), "lastFiredTimestamp");
        this.MediaSessionCompatQueueItem = lValueOf.longValue();
        readBoolean.write(new getActionId(this, z));
    }

    @Override // o.createOrGetDataStorelambda00
    public final boolean read(Context context) {
        return false;
    }

    public final void write(boolean z) {
        synchronized (this) {
            Long lAddMenuProvider = this.write.addMenuProvider();
            if (lAddMenuProvider == null) {
                if (z) {
                    serializer(false);
                }
                return;
            }
            this.read.getClass();
            if (System.currentTimeMillis() - this.MediaSessionCompatQueueItem > lAddMenuProvider.longValue()) {
                RemoteActionCompatParcelizer(z);
            }
        }
    }

    public final Long IconCompatParcelizer() {
        ConfigurationManager configurationManager = this.write;
        if (configurationManager.addMenuProvider() == null || configurationManager.addOnMultiWindowModeChangedListener() == null) {
            return null;
        }
        long time = com.sentiance.sdk.util.x.IconCompatParcelizer().getTime();
        this.read.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long millis = TimeUnit.HOURS.toMillis(configurationManager.addOnMultiWindowModeChangedListener().byteValue());
        long jLongValue = configurationManager.addMenuProvider().longValue();
        long j = time + millis;
        return Long.valueOf(((((long) Math.ceil((jCurrentTimeMillis - j) / jLongValue)) * jLongValue) + j) - jCurrentTimeMillis);
    }

    public BrazeNotificationPayloadActionButton(Context context, parseLonglambda0 parselonglambda0, com.sentiance.sdk.util.c cVar, ConfigurationManager configurationManager, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambdafxbJOrD4Rv7HbEvEIn3jpfsEg r8lambdafxbjord4rv7hbevein3jpfseg) {
        this.RemoteActionCompatParcelizer = context;
        this.serializer = parselonglambda0;
        this.IconCompatParcelizer = cVar;
        this.write = configurationManager;
        this.read = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.RatingCompat = r8lambdafxbjord4rv7hbevein3jpfseg;
        this.MediaSessionCompatQueueItem = cVar.IconCompatParcelizer("lastFiredTimestamp", 0L);
    }

    @Override // o.createOrGetDataStorelambda00
    public final boolean RemoteActionCompatParcelizer(Context context, createOrGetDataStorelambda010 createorgetdatastorelambda010) {
        if (this.RatingCompat.serializer(null) > 29) {
            return false;
        }
        write(true);
        if (IconCompatParcelizer() == null) {
            return false;
        }
        createorgetdatastorelambda010.read((createOrGetDataStorelambda00) this, true);
        return false;
    }

    @Override // o.createOrGetDataStorelambda00
    public final accesssetEventPublishercp RemoteActionCompatParcelizer() {
        Long lIconCompatParcelizer = IconCompatParcelizer();
        publishExceptionlambda0 publishexceptionlambda0 = new publishExceptionlambda0();
        publishexceptionlambda0.IconCompatParcelizer(lIconCompatParcelizer == null ? 0L : lIconCompatParcelizer.longValue());
        publishexceptionlambda0.write(false);
        publishexceptionlambda0.write("KeepAwake");
        return publishexceptionlambda0.RemoteActionCompatParcelizer();
    }
}
