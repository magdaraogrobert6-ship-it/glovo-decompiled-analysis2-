package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class resetimpl extends setimpl {
    public final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    public final Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public resetimpl(UncheckedColor uncheckedColor, String str) {
        super(uncheckedColor, str);
        uncheckedColor.getClass();
        str.getClass();
        this.serializer = uncheckedColor.write(str);
    }

    @Override // o.UncheckedColordefault
    public final void IconCompatParcelizer(int i) {
        int i2 = this.RemoteActionCompatParcelizer;
        Object obj = this.serializer;
        if (i2 == 0) {
            MediaDescriptionCompat();
            ((luminance8_81llA) obj).serializer(i);
        } else if (i2 == 1) {
            ((setToRotateBlueimpl) obj).IconCompatParcelizer(i);
        } else {
            MediaDescriptionCompat();
            androidx.sqlite.SQLite.read(25, "column index out of range");
            throw null;
        }
    }

    @Override // o.UncheckedColordefault
    public final void IconCompatParcelizer(int i, String str) {
        int i2 = this.RemoteActionCompatParcelizer;
        Object obj = this.serializer;
        if (i2 == 0) {
            str.getClass();
            MediaDescriptionCompat();
            ((luminance8_81llA) obj).serializer(i, str);
        } else if (i2 == 1) {
            str.getClass();
            ((setToRotateBlueimpl) obj).IconCompatParcelizer(i, str);
        } else {
            str.getClass();
            MediaDescriptionCompat();
            androidx.sqlite.SQLite.read(25, "column index out of range");
            throw null;
        }
    }

    @Override // o.UncheckedColordefault
    public final void IconCompatParcelizer(int i, byte[] bArr) {
        int i2 = this.RemoteActionCompatParcelizer;
        Object obj = this.serializer;
        if (i2 == 0) {
            MediaDescriptionCompat();
            ((luminance8_81llA) obj).IconCompatParcelizer(i, bArr);
        } else if (i2 == 1) {
            ((setToRotateBlueimpl) obj).IconCompatParcelizer(i, bArr);
        } else {
            MediaDescriptionCompat();
            androidx.sqlite.SQLite.read(25, "column index out of range");
            throw null;
        }
    }

    @Override // o.UncheckedColordefault
    public final boolean IconCompatParcelizer() {
        int i = this.RemoteActionCompatParcelizer;
        UncheckedColor uncheckedColor = this.read;
        Object obj = this.serializer;
        if (i == 0) {
            MediaDescriptionCompat();
            ((luminance8_81llA) obj).serializer();
            return false;
        }
        if (i == 1) {
            setToRotateBlueimpl settorotateblueimpl = (setToRotateBlueimpl) obj;
            boolean zIconCompatParcelizer = settorotateblueimpl.IconCompatParcelizer();
            if (settorotateblueimpl.read(0).equalsIgnoreCase("wal")) {
                uncheckedColor.write();
            } else {
                uncheckedColor.IconCompatParcelizer();
            }
            return zIconCompatParcelizer;
        }
        int i2 = setToScaleimpl.read[((rotateInternalimpl) obj).ordinal()];
        if (i2 == 1) {
            uncheckedColor.MediaSessionCompatResultReceiverWrapper();
            uncheckedColor.MediaMetadataCompat();
        } else if (i2 == 2) {
            uncheckedColor.MediaMetadataCompat();
        } else if (i2 == 3) {
            uncheckedColor.serializer();
        } else if (i2 == 4) {
            uncheckedColor.RemoteActionCompatParcelizer();
        } else if (i2 == 5) {
            uncheckedColor.read();
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        }
        return false;
    }

    @Override // o.UncheckedColordefault
    public final void RemoteActionCompatParcelizer(int i, long j) {
        int i2 = this.RemoteActionCompatParcelizer;
        Object obj = this.serializer;
        if (i2 == 0) {
            MediaDescriptionCompat();
            ((luminance8_81llA) obj).IconCompatParcelizer(i, j);
        } else if (i2 == 1) {
            ((setToRotateBlueimpl) obj).RemoteActionCompatParcelizer(i, j);
        } else {
            MediaDescriptionCompat();
            androidx.sqlite.SQLite.read(25, "column index out of range");
            throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.serializer;
        if (i == 0) {
            ((luminance8_81llA) obj).close();
            this.write = true;
        } else if (i != 1) {
            this.write = true;
        } else {
            ((setToRotateBlueimpl) obj).close();
        }
    }

    @Override // o.setimpl, o.UncheckedColordefault
    public void read() {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.serializer;
        if (i == 0) {
            MediaDescriptionCompat();
            ((luminance8_81llA) obj).IconCompatParcelizer();
        } else if (i != 1) {
            super.read();
        } else {
            ((setToRotateBlueimpl) obj).read();
        }
    }

    @Override // o.UncheckedColordefault
    public boolean serializer() {
        return this.RemoteActionCompatParcelizer != 1 ? super.serializer() : ((setToRotateBlueimpl) this.serializer).serializer();
    }

    @Override // o.setimpl, o.UncheckedColordefault
    public void write() {
        if (this.RemoteActionCompatParcelizer != 1) {
            super.write();
        } else {
            ((setToRotateBlueimpl) this.serializer).write();
        }
    }

    @Override // o.UncheckedColordefault
    public final int RemoteActionCompatParcelizer() {
        int i = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            MediaDescriptionCompat();
            return 0;
        }
        if (i == 1) {
            return ((setToRotateBlueimpl) this.serializer).RemoteActionCompatParcelizer();
        }
        MediaDescriptionCompat();
        return 0;
    }

    @Override // o.UncheckedColordefault
    public final boolean MediaSessionCompatQueueItem(int i) {
        int i2 = this.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            MediaDescriptionCompat();
            androidx.sqlite.SQLite.read(21, "no row");
            throw null;
        }
        if (i2 == 1) {
            return ((setToRotateBlueimpl) this.serializer).MediaSessionCompatQueueItem(i);
        }
        MediaDescriptionCompat();
        androidx.sqlite.SQLite.read(21, "no row");
        throw null;
    }

    @Override // o.UncheckedColordefault
    public final String RemoteActionCompatParcelizer(int i) {
        int i2 = this.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            MediaDescriptionCompat();
            androidx.sqlite.SQLite.read(21, "no row");
            throw null;
        }
        if (i2 == 1) {
            return ((setToRotateBlueimpl) this.serializer).RemoteActionCompatParcelizer(i);
        }
        MediaDescriptionCompat();
        androidx.sqlite.SQLite.read(21, "no row");
        throw null;
    }

    @Override // o.UncheckedColordefault
    public final String read(int i) {
        int i2 = this.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            MediaDescriptionCompat();
            androidx.sqlite.SQLite.read(21, "no row");
            throw null;
        }
        if (i2 == 1) {
            return ((setToRotateBlueimpl) this.serializer).read(i);
        }
        MediaDescriptionCompat();
        androidx.sqlite.SQLite.read(21, "no row");
        throw null;
    }

    @Override // o.UncheckedColordefault
    public final long serializer(int i) {
        int i2 = this.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            MediaDescriptionCompat();
            androidx.sqlite.SQLite.read(21, "no row");
            throw null;
        }
        if (i2 == 1) {
            return ((setToRotateBlueimpl) this.serializer).serializer(i);
        }
        MediaDescriptionCompat();
        androidx.sqlite.SQLite.read(21, "no row");
        throw null;
    }

    @Override // o.UncheckedColordefault
    public final byte[] write(int i) {
        int i2 = this.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            MediaDescriptionCompat();
            androidx.sqlite.SQLite.read(21, "no row");
            throw null;
        }
        if (i2 == 1) {
            return ((setToRotateBlueimpl) this.serializer).write(i);
        }
        MediaDescriptionCompat();
        androidx.sqlite.SQLite.read(21, "no row");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public resetimpl(UncheckedColor uncheckedColor, String str, setToRotateBlueimpl settorotateblueimpl) {
        super(uncheckedColor, str);
        uncheckedColor.getClass();
        str.getClass();
        this.serializer = settorotateblueimpl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public resetimpl(UncheckedColor uncheckedColor, String str, rotateInternalimpl rotateinternalimpl) {
        super(uncheckedColor, str);
        uncheckedColor.getClass();
        str.getClass();
        this.serializer = rotateinternalimpl;
    }
}
