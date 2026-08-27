package o;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambdat75EosP28hUrWqv7WpBxuG4oxpM {
    private final int IconCompatParcelizer;
    private ByteBuffer MediaMetadataCompat;
    private final String MediaSessionCompatQueueItem;
    private final parseLonglambda0 RemoteActionCompatParcelizer;
    private final Context read;
    private final float serializer;
    private final boolean write;

    public final ByteBuffer RemoteActionCompatParcelizer() {
        return this.MediaMetadataCompat;
    }

    public final void read() {
        this.MediaMetadataCompat = null;
    }

    private static File IconCompatParcelizer(Context context, String str) {
        File file;
        synchronized (r8lambdat75EosP28hUrWqv7WpBxuG4oxpM.class) {
            synchronized (r8lambdat75EosP28hUrWqv7WpBxuG4oxpM.class) {
                file = new File(context.getNoBackupFilesDir(), "com.sentiance.sdk/ondevice/model_states/");
                file.mkdirs();
            }
            return new File(file, str);
        }
        return new File(file, str);
    }

    public final ByteBuffer IconCompatParcelizer() {
        ByteBuffer byteBufferIconCompatParcelizer = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.IconCompatParcelizer, this.MediaMetadataCompat);
        this.MediaMetadataCompat = byteBufferIconCompatParcelizer;
        byteBufferIconCompatParcelizer.rewind();
        int iCapacity = byteBufferIconCompatParcelizer.capacity() / 4;
        for (int i = 0; i < iCapacity; i++) {
            byteBufferIconCompatParcelizer.putFloat(this.serializer);
        }
        byteBufferIconCompatParcelizer.rewind();
        this.MediaMetadataCompat = byteBufferIconCompatParcelizer;
        File fileIconCompatParcelizer = IconCompatParcelizer(this.read, this.MediaSessionCompatQueueItem);
        if (fileIconCompatParcelizer.exists()) {
            fileIconCompatParcelizer.delete();
        }
        return this.MediaMetadataCompat;
    }

    public r8lambdat75EosP28hUrWqv7WpBxuG4oxpM(Context context, parseLonglambda0 parselonglambda0, int i, float f, boolean z, String str) {
        this.read = context;
        this.RemoteActionCompatParcelizer = parselonglambda0;
        this.IconCompatParcelizer = i;
        this.serializer = f;
        this.write = z;
        this.MediaSessionCompatQueueItem = str;
    }

    public final void serializer() {
        if (!this.write || this.MediaMetadataCompat == null) {
            return;
        }
        String str = this.MediaSessionCompatQueueItem;
        parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
        parselonglambda0.IconCompatParcelizer("Saving %s model state to file", str);
        try {
            try {
                readResourceValuelambda2 readresourcevaluelambda2 = new readResourceValuelambda2(getResourceIdentifier.serializer(IconCompatParcelizer(this.read, str)));
                try {
                    this.MediaMetadataCompat.rewind();
                    readresourcevaluelambda2.write(this.MediaMetadataCompat);
                    readresourcevaluelambda2.close();
                } catch (Throwable th) {
                    try {
                        readresourcevaluelambda2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                parselonglambda0.IconCompatParcelizer(false, e, "Failed to write %s model state to file", str);
            }
            this.MediaMetadataCompat.rewind();
        } catch (Throwable th3) {
            this.MediaMetadataCompat.rewind();
            throw th3;
        }
    }

    public final void write() {
        if (this.write) {
            Context context = this.read;
            String str = this.MediaSessionCompatQueueItem;
            if (IconCompatParcelizer(context, str).exists()) {
                parseLonglambda0 parselonglambda0 = this.RemoteActionCompatParcelizer;
                parselonglambda0.IconCompatParcelizer("Loading %s model state from file", str);
                this.MediaMetadataCompat = r8lambdasqEWQRqdeYssa9AXo75ZLCRd6g.IconCompatParcelizer(this.IconCompatParcelizer, this.MediaMetadataCompat);
                try {
                    try {
                        isSdkAuthenticationEnabled issdkauthenticationenabledIconCompatParcelizer = getResourceIdentifier.IconCompatParcelizer(IconCompatParcelizer(context, str));
                        r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
                        try {
                            this.MediaMetadataCompat.rewind();
                            ByteBuffer byteBuffer = this.MediaMetadataCompat;
                            if (r8lambdabeyrnr8p6809bwlboro_stans.serializer != 0 || issdkauthenticationenabledIconCompatParcelizer.read(r8lambdabeyrnr8p6809bwlboro_stans, 8192L) != -1) {
                                r8lambdabeyrnr8p6809bwlboro_stans.read(byteBuffer);
                            }
                            issdkauthenticationenabledIconCompatParcelizer.close();
                            r8lambdabeyrnr8p6809bwlboro_stans.serializer();
                            this.MediaMetadataCompat.rewind();
                            return;
                        } catch (Throwable th) {
                            try {
                                issdkauthenticationenabledIconCompatParcelizer.close();
                                r8lambdabeyrnr8p6809bwlboro_stans.serializer();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IOException e) {
                        parselonglambda0.IconCompatParcelizer(false, e, "Failed to read %s model state from file. Resetting state buffer.", str);
                        IconCompatParcelizer();
                    }
                } catch (Throwable th3) {
                    this.MediaMetadataCompat.rewind();
                    throw th3;
                }
            }
        }
        IconCompatParcelizer();
    }
}
