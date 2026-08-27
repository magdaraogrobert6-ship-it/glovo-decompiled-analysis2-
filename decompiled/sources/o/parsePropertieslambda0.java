package o;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class parsePropertieslambda0 implements Closeable {
    public final setCustomUserAttributeArraylambda0 IconCompatParcelizer;
    public final /* synthetic */ logPurchaseWithJSONlambda1 serializer;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.IconCompatParcelizer.close();
    }

    public final void serializer(int i, int i2, boolean z) {
        if (z) {
            this.serializer.serializer++;
        }
        setCustomUserAttributeArraylambda0 setcustomuserattributearraylambda0 = this.IconCompatParcelizer;
        synchronized (setcustomuserattributearraylambda0) {
            if (setcustomuserattributearraylambda0.read) {
                throw new IOException("closed");
            }
            setcustomuserattributearraylambda0.read(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            setcustomuserattributearraylambda0.IconCompatParcelizer.IconCompatParcelizer(i);
            setcustomuserattributearraylambda0.IconCompatParcelizer.IconCompatParcelizer(i2);
            setcustomuserattributearraylambda0.IconCompatParcelizer.flush();
        }
    }

    public final void serializer(int i, r8lambdatmTe9dbjpRe9qF6mggphoyHct6s r8lambdatmte9dbjpre9qf6mggphoyhct6s) {
        this.serializer.serializer++;
        setCustomUserAttributeArraylambda0 setcustomuserattributearraylambda0 = this.IconCompatParcelizer;
        synchronized (setcustomuserattributearraylambda0) {
            if (setcustomuserattributearraylambda0.read) {
                throw new IOException("closed");
            }
            if (r8lambdatmte9dbjpre9qf6mggphoyhct6s.httpCode == -1) {
                throw new IllegalArgumentException();
            }
            setcustomuserattributearraylambda0.read(i, 4, (byte) 3, (byte) 0);
            setcustomuserattributearraylambda0.IconCompatParcelizer.IconCompatParcelizer(r8lambdatmte9dbjpre9qf6mggphoyhct6s.httpCode);
            setcustomuserattributearraylambda0.IconCompatParcelizer.flush();
        }
    }

    public final void serializer(getDateMillisOrDefault getdatemillisordefault) {
        this.serializer.serializer++;
        setCustomUserAttributeArraylambda0 setcustomuserattributearraylambda0 = this.IconCompatParcelizer;
        synchronized (setcustomuserattributearraylambda0) {
            if (setcustomuserattributearraylambda0.read) {
                throw new IOException("closed");
            }
            int i = setcustomuserattributearraylambda0.write;
            if ((getdatemillisordefault.RemoteActionCompatParcelizer & 32) != 0) {
                i = getdatemillisordefault.read[5];
            }
            setcustomuserattributearraylambda0.write = i;
            setcustomuserattributearraylambda0.read(0, 0, (byte) 4, (byte) 1);
            setcustomuserattributearraylambda0.IconCompatParcelizer.flush();
        }
    }

    public final void serializer(r8lambdatmTe9dbjpRe9qF6mggphoyHct6s r8lambdatmte9dbjpre9qf6mggphoyhct6s, byte[] bArr) {
        setCustomUserAttributeArraylambda0 setcustomuserattributearraylambda0 = this.IconCompatParcelizer;
        synchronized (setcustomuserattributearraylambda0) {
            if (setcustomuserattributearraylambda0.read) {
                throw new IOException("closed");
            }
            if (r8lambdatmte9dbjpre9qf6mggphoyhct6s.httpCode == -1) {
                java.util.Locale locale = java.util.Locale.US;
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            setcustomuserattributearraylambda0.read(0, bArr.length + 8, (byte) 7, (byte) 0);
            setcustomuserattributearraylambda0.IconCompatParcelizer.IconCompatParcelizer(0);
            setcustomuserattributearraylambda0.IconCompatParcelizer.IconCompatParcelizer(r8lambdatmte9dbjpre9qf6mggphoyhct6s.httpCode);
            if (bArr.length > 0) {
                setcustomuserattributearraylambda0.IconCompatParcelizer.RemoteActionCompatParcelizer(bArr);
            }
            setcustomuserattributearraylambda0.IconCompatParcelizer.flush();
        }
    }

    public final void write() {
        setCustomUserAttributeArraylambda0 setcustomuserattributearraylambda0 = this.IconCompatParcelizer;
        synchronized (setcustomuserattributearraylambda0) {
            if (setcustomuserattributearraylambda0.read) {
                throw new IOException("closed");
            }
            setcustomuserattributearraylambda0.IconCompatParcelizer.flush();
        }
    }

    public final void write(getDateMillisOrDefault getdatemillisordefault) {
        int i;
        setCustomUserAttributeArraylambda0 setcustomuserattributearraylambda0 = this.IconCompatParcelizer;
        synchronized (setcustomuserattributearraylambda0) {
            if (setcustomuserattributearraylambda0.read) {
                throw new IOException("closed");
            }
            int i2 = 0;
            setcustomuserattributearraylambda0.read(0, Integer.bitCount(getdatemillisordefault.RemoteActionCompatParcelizer) * 6, (byte) 4, (byte) 0);
            while (i2 < 10) {
                if (getdatemillisordefault.write(i2)) {
                    if (i2 == 4) {
                        i = 3;
                    } else {
                        i = i2 == 7 ? 4 : i2;
                    }
                    setcustomuserattributearraylambda0.IconCompatParcelizer.MediaSessionCompatQueueItem(i);
                    setcustomuserattributearraylambda0.IconCompatParcelizer.IconCompatParcelizer(getdatemillisordefault.read[i2]);
                }
                i2++;
            }
            setcustomuserattributearraylambda0.IconCompatParcelizer.flush();
        }
    }

    public parsePropertieslambda0(logPurchaseWithJSONlambda1 logpurchasewithjsonlambda1, setCustomUserAttributeArraylambda0 setcustomuserattributearraylambda0) {
        this.serializer = logpurchasewithjsonlambda1;
        this.IconCompatParcelizer = setcustomuserattributearraylambda0;
    }

    public final void IconCompatParcelizer() {
        setCustomUserAttributeArraylambda0 setcustomuserattributearraylambda0 = this.IconCompatParcelizer;
        synchronized (setcustomuserattributearraylambda0) {
            if (setcustomuserattributearraylambda0.read) {
                throw new IOException("closed");
            }
            java.util.logging.Logger logger = setCustomLocationAttributelambda2.write;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(">> CONNECTION " + setCustomLocationAttributelambda2.IconCompatParcelizer.IconCompatParcelizer());
            }
            setcustomuserattributearraylambda0.IconCompatParcelizer.RemoteActionCompatParcelizer(setCustomLocationAttributelambda2.IconCompatParcelizer.MediaDescriptionCompat());
            setcustomuserattributearraylambda0.IconCompatParcelizer.flush();
        }
    }

    public final void IconCompatParcelizer(int i, long j) {
        setCustomUserAttributeArraylambda0 setcustomuserattributearraylambda0 = this.IconCompatParcelizer;
        synchronized (setcustomuserattributearraylambda0) {
            if (setcustomuserattributearraylambda0.read) {
                throw new IOException("closed");
            }
            if (j == 0 || j > 2147483647L) {
                java.util.Locale locale = java.util.Locale.US;
                throw new IllegalArgumentException("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j);
            }
            setcustomuserattributearraylambda0.read(i, 4, (byte) 8, (byte) 0);
            setcustomuserattributearraylambda0.IconCompatParcelizer.IconCompatParcelizer((int) j);
            setcustomuserattributearraylambda0.IconCompatParcelizer.flush();
        }
    }
}
