package o;

import android.database.Cursor;
import coil3.Extras$Key;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class setToRotateBlueimpl extends setimpl {
    public Cursor MediaBrowserCompatMediaItem;
    public long[] MediaDescriptionCompat;
    public String[] MediaMetadataCompat;
    public double[] RatingCompat;
    public byte[][] RemoteActionCompatParcelizer;
    public int[] serializer;

    public static void IconCompatParcelizer(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            androidx.sqlite.SQLite.read(25, "column index out of range");
            throw null;
        }
    }

    public final void RemoteActionCompatParcelizer(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.serializer;
        if (iArr.length < i3) {
            this.serializer = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.MediaDescriptionCompat;
            if (jArr.length < i3) {
                this.MediaDescriptionCompat = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.RatingCompat;
            if (dArr.length < i3) {
                this.RatingCompat = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.MediaMetadataCompat;
            if (strArr.length < i3) {
                this.MediaMetadataCompat = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.RemoteActionCompatParcelizer;
        if (bArr.length < i3) {
            this.RemoteActionCompatParcelizer = (byte[][]) Arrays.copyOf(bArr, i3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setToRotateBlueimpl(UncheckedColor uncheckedColor, String str) {
        super(uncheckedColor, str);
        uncheckedColor.getClass();
        str.getClass();
        this.serializer = new int[0];
        this.MediaDescriptionCompat = new long[0];
        this.RatingCompat = new double[0];
        this.MediaMetadataCompat = new String[0];
        this.RemoteActionCompatParcelizer = new byte[0][];
    }

    @Override // o.UncheckedColordefault
    public final void IconCompatParcelizer(int i, String str) {
        str.getClass();
        MediaDescriptionCompat();
        RemoteActionCompatParcelizer(3, i);
        this.serializer[i] = 3;
        this.MediaMetadataCompat[i] = str;
    }

    @Override // o.UncheckedColordefault
    public final boolean IconCompatParcelizer() {
        MediaDescriptionCompat();
        MediaMetadataCompat();
        Cursor cursor = this.MediaBrowserCompatMediaItem;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Required value was null.");
        return false;
    }

    @Override // o.UncheckedColordefault
    public final boolean MediaSessionCompatQueueItem(int i) {
        MediaDescriptionCompat();
        Cursor cursorRatingCompat = RatingCompat();
        IconCompatParcelizer(cursorRatingCompat, i);
        return cursorRatingCompat.isNull(i);
    }

    @Override // o.UncheckedColordefault
    public final int RemoteActionCompatParcelizer() {
        MediaDescriptionCompat();
        MediaMetadataCompat();
        Cursor cursor = this.MediaBrowserCompatMediaItem;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // o.UncheckedColordefault
    public final String RemoteActionCompatParcelizer(int i) {
        MediaDescriptionCompat();
        MediaMetadataCompat();
        Cursor cursor = this.MediaBrowserCompatMediaItem;
        if (cursor == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Required value was null.");
            return null;
        }
        IconCompatParcelizer(cursor, i);
        String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // o.UncheckedColordefault
    public final String read(int i) {
        MediaDescriptionCompat();
        Cursor cursorRatingCompat = RatingCompat();
        IconCompatParcelizer(cursorRatingCompat, i);
        String string = cursorRatingCompat.getString(i);
        string.getClass();
        return string;
    }

    @Override // o.UncheckedColordefault
    public final long serializer(int i) {
        MediaDescriptionCompat();
        Cursor cursorRatingCompat = RatingCompat();
        IconCompatParcelizer(cursorRatingCompat, i);
        return cursorRatingCompat.getLong(i);
    }

    @Override // o.setimpl, o.UncheckedColordefault
    public final void write() {
        MediaDescriptionCompat();
        Cursor cursor = this.MediaBrowserCompatMediaItem;
        if (cursor != null) {
            cursor.close();
        }
        this.MediaBrowserCompatMediaItem = null;
    }

    @Override // o.UncheckedColordefault
    public final byte[] write(int i) {
        MediaDescriptionCompat();
        Cursor cursorRatingCompat = RatingCompat();
        IconCompatParcelizer(cursorRatingCompat, i);
        byte[] blob = cursorRatingCompat.getBlob(i);
        blob.getClass();
        return blob;
    }

    @Override // o.UncheckedColordefault
    public final void IconCompatParcelizer(int i) {
        MediaDescriptionCompat();
        RemoteActionCompatParcelizer(5, i);
        this.serializer[i] = 5;
    }

    @Override // o.UncheckedColordefault
    public final void IconCompatParcelizer(int i, byte[] bArr) {
        MediaDescriptionCompat();
        RemoteActionCompatParcelizer(4, i);
        this.serializer[i] = 4;
        this.RemoteActionCompatParcelizer[i] = bArr;
    }

    @Override // o.UncheckedColordefault
    public final void RemoteActionCompatParcelizer(int i, long j) {
        MediaDescriptionCompat();
        RemoteActionCompatParcelizer(1, i);
        this.serializer[i] = 1;
        this.MediaDescriptionCompat[i] = j;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.write) {
            read();
            write();
        }
        this.write = true;
    }

    @Override // o.setimpl, o.UncheckedColordefault
    public final void read() {
        MediaDescriptionCompat();
        this.serializer = new int[0];
        this.MediaDescriptionCompat = new long[0];
        this.RatingCompat = new double[0];
        this.MediaMetadataCompat = new String[0];
        this.RemoteActionCompatParcelizer = new byte[0][];
    }

    public final void MediaMetadataCompat() {
        if (this.MediaBrowserCompatMediaItem == null) {
            this.MediaBrowserCompatMediaItem = this.read.serializer(new Extras$Key(10, this));
        }
    }

    public final Cursor RatingCompat() {
        Cursor cursor = this.MediaBrowserCompatMediaItem;
        if (cursor != null) {
            return cursor;
        }
        androidx.sqlite.SQLite.read(21, "no row");
        throw null;
    }
}
