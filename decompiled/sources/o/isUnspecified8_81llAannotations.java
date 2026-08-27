package o;

import android.content.Context;
import androidx.sqlite.db.SupportSQLiteOpenHelper$Callback;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper;
import bo.app.a5$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class isUnspecified8_81llAannotations implements compositeComponent {
    public final SupportSQLiteOpenHelper$Callback IconCompatParcelizer;
    public boolean MediaDescriptionCompat;
    public final boolean MediaSessionCompatQueueItem;
    public final isAdapterPositionOnScreen RemoteActionCompatParcelizer;
    public final boolean read;
    public final String serializer;
    public final Context write;

    @Override // o.compositeComponent
    public final String write() {
        return this.serializer;
    }

    @Override // o.compositeComponent
    public final UncheckedColor IconCompatParcelizer() {
        return ((FrameworkSQLiteOpenHelper$OpenHelper) this.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).serializer(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        isAdapterPositionOnScreen isadapterpositiononscreen = this.RemoteActionCompatParcelizer;
        if (isadapterpositiononscreen.MediaSessionCompatToken()) {
            ((FrameworkSQLiteOpenHelper$OpenHelper) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()).close();
        }
    }

    @Override // o.compositeComponent
    public final void serializer(boolean z) {
        isAdapterPositionOnScreen isadapterpositiononscreen = this.RemoteActionCompatParcelizer;
        if (isadapterpositiononscreen.MediaSessionCompatToken()) {
            ((FrameworkSQLiteOpenHelper$OpenHelper) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper()).setWriteAheadLoggingEnabled(z);
        }
        this.MediaDescriptionCompat = z;
    }

    public isUnspecified8_81llAannotations(Context context, String str, SupportSQLiteOpenHelper$Callback supportSQLiteOpenHelper$Callback, boolean z, boolean z2) {
        context.getClass();
        supportSQLiteOpenHelper$Callback.getClass();
        this.write = context;
        this.serializer = str;
        this.IconCompatParcelizer = supportSQLiteOpenHelper$Callback;
        this.MediaSessionCompatQueueItem = z;
        this.read = z2;
        this.RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new a5$$ExternalSyntheticLambda0(13, this));
    }
}
