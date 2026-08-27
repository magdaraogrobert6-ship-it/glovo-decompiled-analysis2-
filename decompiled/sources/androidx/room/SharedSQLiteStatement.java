package androidx.room;

import bo.app.h$$ExternalSyntheticLambda0;
import java.util.concurrent.atomic.AtomicBoolean;
import o.isAdapterPositionOnScreen;
import o.luminance8_81llA;
import o.onViewDetachedFromWindowlambda1;

/* JADX INFO: loaded from: classes.dex */
public abstract class SharedSQLiteStatement {
    private final AtomicBoolean IconCompatParcelizer;
    private final RoomDatabase RemoteActionCompatParcelizer;
    private final onViewDetachedFromWindowlambda1 serializer;

    public abstract String createQuery();

    public void assertNotMainThread() {
        this.RemoteActionCompatParcelizer.assertNotMainThread();
    }

    public SharedSQLiteStatement(RoomDatabase roomDatabase) {
        roomDatabase.getClass();
        this.RemoteActionCompatParcelizer = roomDatabase;
        this.IconCompatParcelizer = new AtomicBoolean(false);
        this.serializer = new isAdapterPositionOnScreen(new h$$ExternalSyntheticLambda0(1, this));
    }

    public luminance8_81llA acquire() {
        assertNotMainThread();
        return this.IconCompatParcelizer.compareAndSet(false, true) ? (luminance8_81llA) this.serializer.MediaSessionCompatResultReceiverWrapper() : createNewStatement();
    }

    public void release(luminance8_81llA luminance8_81lla) {
        luminance8_81lla.getClass();
        if (luminance8_81lla == ((luminance8_81llA) this.serializer.MediaSessionCompatResultReceiverWrapper())) {
            this.IconCompatParcelizer.set(false);
        }
    }

    public final luminance8_81llA createNewStatement() {
        return this.RemoteActionCompatParcelizer.compileStatement(createQuery());
    }
}
