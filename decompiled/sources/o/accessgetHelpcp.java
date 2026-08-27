package o;

import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetHelpcp {
    public static final java.util.logging.Logger RemoteActionCompatParcelizer = java.util.logging.Logger.getLogger(accessgetF2cp.class.getName());
    public final accessgetF9cp IconCompatParcelizer;
    public final androidx.emoji2.text.EmojiProcessor RatingCompat;
    public final Executor read;
    public final SQLiteEventStore serializer;
    public final SQLiteEventStore write;

    public accessgetHelpcp(Executor executor, accessgetF9cp accessgetf9cp, androidx.emoji2.text.EmojiProcessor emojiProcessor, SQLiteEventStore sQLiteEventStore, SQLiteEventStore sQLiteEventStore2) {
        this.read = executor;
        this.IconCompatParcelizer = accessgetf9cp;
        this.RatingCompat = emojiProcessor;
        this.serializer = sQLiteEventStore;
        this.write = sQLiteEventStore2;
    }
}
