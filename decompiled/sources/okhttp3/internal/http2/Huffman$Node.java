package okhttp3.internal.http2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import androidx.compose.ui.graphics.Fields;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.List;
import kotlinx.serialization.SerializationException;
import o.DrawableTransformation;
import o.accessgetTvMediaContextMenucp;

/* JADX INFO: loaded from: classes4.dex */
public final class Huffman$Node {
    public int read;
    public int serializer;
    public Object write;

    public void RemoteActionCompatParcelizer() {
        this.serializer = 0;
        this.read = 0;
    }

    public int read() {
        PackageInfo packageInfo;
        int i;
        synchronized (this) {
            if (this.serializer == 0) {
                try {
                    packageInfo = accessgetTvMediaContextMenucp.serializer((Context) this.write).read(0, "com.google.android.gms");
                } catch (PackageManager.NameNotFoundException e) {
                    SentryLogcatAdapter.IconCompatParcelizer("Metadata", "Failed to find package ".concat(e.toString()));
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    this.serializer = packageInfo.versionCode;
                }
            }
            i = this.serializer;
        }
        return i;
    }

    public int write() {
        synchronized (this) {
            int i = this.read;
            if (i != 0) {
                return i;
            }
            Context context = (Context) this.write;
            PackageManager packageManager = context.getPackageManager();
            if (accessgetTvMediaContextMenucp.serializer(context).write.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                SentryLogcatAdapter.serializer("Metadata", "Google Play services missing or without correct permission.");
                return 0;
            }
            Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
            if (listQueryBroadcastReceivers != null && !listQueryBroadcastReceivers.isEmpty()) {
                this.read = 2;
                return 2;
            }
            SentryLogcatAdapter.IconCompatParcelizer("Metadata", "Failed to resolve IID implementation package, falling back");
            this.read = 2;
            return 2;
        }
    }

    public int IconCompatParcelizer() {
        int i = this.read;
        if (i >= this.serializer) {
            return -1;
        }
        byte[] bArr = (byte[]) this.write;
        this.read = i + 1;
        return bArr[i] & 255;
    }

    public long serializer(boolean z) {
        int i = this.read;
        int i2 = this.serializer;
        if (i == i2) {
            if (z) {
                return -1L;
            }
            DrawableTransformation.serializer("Unexpected EOF");
            return 0L;
        }
        byte[] bArr = (byte[]) this.write;
        int i3 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            this.read = i3;
            return j;
        }
        if (i2 - i > 1) {
            long j2 = j ^ (((long) bArr[i3]) << 7);
            if (j2 < 0) {
                this.read = i + 2;
                return (-128) ^ j2;
            }
        }
        long j3 = 0;
        for (int i4 = 0; i4 < 64; i4 += 7) {
            int iIconCompatParcelizer = IconCompatParcelizer();
            j3 |= ((long) (iIconCompatParcelizer & 127)) << i4;
            if ((iIconCompatParcelizer & Fields.SpotShadowColor) == 0) {
                return j3;
            }
        }
        DrawableTransformation.serializer("Input stream is malformed: Varint too long (exceeded 64 bits)");
        return 0L;
    }

    public void serializer(int i) {
        int i2 = this.serializer;
        int i3 = this.read;
        if (i <= i2 - i3) {
            return;
        }
        throw new SerializationException("Unexpected EOF, available " + (i2 - i3) + " bytes, requested: " + i);
    }

    public Huffman$Node(int i, int i2, int i3) {
        if (i3 != 3) {
            this.write = null;
            this.serializer = i;
            int i4 = i2 & 7;
            this.read = i4 != 0 ? i4 : 8;
            return;
        }
        this.write = null;
        this.serializer = i;
        int i5 = i2 & 7;
        this.read = i5 != 0 ? i5 : 8;
    }

    public Huffman$Node(int i) {
        if (i != 3) {
            this.write = new Huffman$Node[Fields.RotationX];
            this.serializer = 0;
            this.read = 0;
        } else {
            this.write = new Huffman$Node[Fields.RotationX];
            this.serializer = 0;
            this.read = 0;
        }
    }

    public Huffman$Node(byte[] bArr, int i) {
        bArr.getClass();
        this.write = bArr;
        this.serializer = i;
    }

    public Huffman$Node() {
    }
}
