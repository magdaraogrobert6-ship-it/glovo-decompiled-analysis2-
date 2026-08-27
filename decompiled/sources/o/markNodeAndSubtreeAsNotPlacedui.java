package o;

import io.sentry.android.core.SentryLogcatAdapter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class markNodeAndSubtreeAsNotPlacedui implements getPerformMeasureBlockui {
    public static final Charset IconCompatParcelizer = Charset.forName(com.adjust.sdk.Constants.ENCODING);
    public onAttachedToNullParent serializer;
    public final File write;

    public final void IconCompatParcelizer() {
        File file = this.write;
        if (this.serializer == null) {
            try {
                this.serializer = new onAttachedToNullParent(file);
            } catch (IOException e) {
                SentryLogcatAdapter.read("FirebaseCrashlytics", "Could not open log file: " + file, e);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    @Override // o.getPerformMeasureBlockui
    public final String RemoteActionCompatParcelizer() {
        CSSParseException cSSParseException;
        byte[] bArr;
        if (this.write.exists()) {
            IconCompatParcelizer();
            onAttachedToNullParent onattachedtonullparent = this.serializer;
            if (onattachedtonullparent == null) {
                cSSParseException = null;
            } else {
                int[] iArr = {0};
                byte[] bArr2 = new byte[onattachedtonullparent.write()];
                try {
                    this.serializer.read(new getPlacedOnceui(iArr, bArr2));
                } catch (IOException e) {
                    SentryLogcatAdapter.read("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e);
                }
                cSSParseException = new CSSParseException(bArr2, iArr[0], 5);
            }
        } else {
            cSSParseException = null;
        }
        if (cSSParseException == null) {
            bArr = null;
        } else {
            int i = cSSParseException.IconCompatParcelizer;
            bArr = new byte[i];
            System.arraycopy((byte[]) cSSParseException.RemoteActionCompatParcelizer, 0, bArr, 0, i);
        }
        if (bArr != null) {
            return new String(bArr, IconCompatParcelizer);
        }
        return null;
    }

    public markNodeAndSubtreeAsNotPlacedui(File file) {
        this.write = file;
    }

    @Override // o.getPerformMeasureBlockui
    public final void read() {
        accessgetOuterCoordinator.IconCompatParcelizer(this.serializer, "There was a problem closing the Crashlytics log file.");
        this.serializer = null;
    }

    @Override // o.getPerformMeasureBlockui
    public final void IconCompatParcelizer(long j, String str) {
        IconCompatParcelizer();
        if (this.serializer == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "...".concat(str.substring(str.length() - androidx.compose.ui.graphics.Fields.Clip));
            }
            this.serializer.IconCompatParcelizer(String.format(java.util.Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(IconCompatParcelizer));
            while (!this.serializer.read() && this.serializer.write() > 65536) {
                this.serializer.serializer();
            }
        } catch (IOException e) {
            SentryLogcatAdapter.read("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e);
        }
    }
}
