package o;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface UncheckedColor extends Closeable {
    void IconCompatParcelizer();

    List MediaBrowserCompatMediaItem();

    boolean MediaDescriptionCompat();

    void MediaMetadataCompat();

    String MediaSessionCompatQueueItem();

    void MediaSessionCompatResultReceiverWrapper();

    boolean PlaybackStateCompatCustomAction();

    boolean RatingCompat();

    Cursor RemoteActionCompatParcelizer(compositeOverOWjLjI compositeoverowjlji, CancellationSignal cancellationSignal);

    void RemoteActionCompatParcelizer();

    void RemoteActionCompatParcelizer(String str);

    void read();

    void read(Object[] objArr);

    Cursor serializer(String str);

    Cursor serializer(compositeOverOWjLjI compositeoverowjlji);

    void serializer();

    int write(ContentValues contentValues, Object[] objArr);

    luminance8_81llA write(String str);

    boolean write();
}
