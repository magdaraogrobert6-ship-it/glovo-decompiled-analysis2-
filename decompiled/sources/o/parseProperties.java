package o;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class parseProperties implements Closeable {
    public static final java.util.logging.Logger IconCompatParcelizer = java.util.logging.Logger.getLogger(r8lambda1DLeNeBWPKsDsvf_XikspXtDEU.class.getName());
    public final OkHttpCall$1 RemoteActionCompatParcelizer;
    public final parsePropertieslambda0 read;
    public final r8lambda1DLeNeBWPKsDsvf_XikspXtDEU write;

    public final void RemoteActionCompatParcelizer(boolean z, int i, RegistryMissingComponentException registryMissingComponentException, int i2) {
        OkHttpCall$1 okHttpCall$1 = this.RemoteActionCompatParcelizer;
        r8lambda7VEfmhucObW6FHAh05Peqg_b3XM r8lambda7vefmhucobw6fhah05peqg_b3xm = r8lambda7VEfmhucObW6FHAh05Peqg_b3XM.OUTBOUND;
        registryMissingComponentException.getClass();
        okHttpCall$1.write(r8lambda7vefmhucobw6fhah05peqg_b3xm, i, registryMissingComponentException, i2, z);
        try {
            setCustomUserAttributeArraylambda0 setcustomuserattributearraylambda0 = this.read.IconCompatParcelizer;
            synchronized (setcustomuserattributearraylambda0) {
                if (setcustomuserattributearraylambda0.read) {
                    throw new IOException("closed");
                }
                setcustomuserattributearraylambda0.read(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
                if (i2 > 0) {
                    setcustomuserattributearraylambda0.IconCompatParcelizer.write(registryMissingComponentException, i2);
                }
            }
        } catch (IOException e) {
            this.write.IconCompatParcelizer(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.read.close();
        } catch (IOException e) {
            IconCompatParcelizer.log(e.getClass().equals(IOException.class) ? Level.FINE : Level.INFO, "Failed closing connection", (Throwable) e);
        }
    }

    public final void read(getDateMillisOrDefault getdatemillisordefault) {
        r8lambda7VEfmhucObW6FHAh05Peqg_b3XM r8lambda7vefmhucobw6fhah05peqg_b3xm = r8lambda7VEfmhucObW6FHAh05Peqg_b3XM.OUTBOUND;
        OkHttpCall$1 okHttpCall$1 = this.RemoteActionCompatParcelizer;
        if (okHttpCall$1.MediaBrowserCompatMediaItem()) {
            ((java.util.logging.Logger) okHttpCall$1.write).log((Level) okHttpCall$1.serializer, r8lambda7vefmhucobw6fhah05peqg_b3xm + " SETTINGS: ack=true");
        }
        try {
            this.read.serializer(getdatemillisordefault);
        } catch (IOException e) {
            this.write.IconCompatParcelizer(e);
        }
    }

    public final void serializer() {
        try {
            this.read.write();
        } catch (IOException e) {
            this.write.IconCompatParcelizer(e);
        }
    }

    public final void write(int i, long j) {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(r8lambda7VEfmhucObW6FHAh05Peqg_b3XM.OUTBOUND, i, j);
        try {
            this.read.IconCompatParcelizer(i, j);
        } catch (IOException e) {
            this.write.IconCompatParcelizer(e);
        }
    }

    public final void write(int i, r8lambdatmTe9dbjpRe9qF6mggphoyHct6s r8lambdatmte9dbjpre9qf6mggphoyhct6s) {
        this.RemoteActionCompatParcelizer.read(r8lambda7VEfmhucObW6FHAh05Peqg_b3XM.OUTBOUND, i, r8lambdatmte9dbjpre9qf6mggphoyhct6s);
        try {
            this.read.serializer(i, r8lambdatmte9dbjpre9qf6mggphoyhct6s);
        } catch (IOException e) {
            this.write.IconCompatParcelizer(e);
        }
    }

    public final void write(r8lambdatmTe9dbjpRe9qF6mggphoyHct6s r8lambdatmte9dbjpre9qf6mggphoyhct6s, byte[] bArr) {
        parsePropertieslambda0 parsepropertieslambda0 = this.read;
        r8lambda7VEfmhucObW6FHAh05Peqg_b3XM r8lambda7vefmhucobw6fhah05peqg_b3xm = r8lambda7VEfmhucObW6FHAh05Peqg_b3XM.OUTBOUND;
        RequestBuilder requestBuilder = RequestBuilder.EMPTY;
        this.RemoteActionCompatParcelizer.serializer(r8lambda7vefmhucobw6fhah05peqg_b3xm, 0, r8lambdatmte9dbjpre9qf6mggphoyhct6s, ImageHeaderParserImageType.IconCompatParcelizer(bArr));
        try {
            parsepropertieslambda0.serializer(r8lambdatmte9dbjpre9qf6mggphoyhct6s, bArr);
            parsepropertieslambda0.write();
        } catch (IOException e) {
            this.write.IconCompatParcelizer(e);
        }
    }

    public parseProperties(r8lambda1DLeNeBWPKsDsvf_XikspXtDEU r8lambda1dlenebwpksdsvf_xikspxtdeu, parsePropertieslambda0 parsepropertieslambda0) {
        Level level = Level.FINE;
        this.RemoteActionCompatParcelizer = new OkHttpCall$1();
        this.write = r8lambda1dlenebwpksdsvf_xikspxtdeu;
        this.read = parsepropertieslambda0;
    }

    public final void read(int i, int i2, boolean z) {
        OkHttpCall$1 okHttpCall$1 = this.RemoteActionCompatParcelizer;
        if (z) {
            r8lambda7VEfmhucObW6FHAh05Peqg_b3XM r8lambda7vefmhucobw6fhah05peqg_b3xm = r8lambda7VEfmhucObW6FHAh05Peqg_b3XM.OUTBOUND;
            long j = i;
            long j2 = i2;
            if (okHttpCall$1.MediaBrowserCompatMediaItem()) {
                ((java.util.logging.Logger) okHttpCall$1.write).log((Level) okHttpCall$1.serializer, r8lambda7vefmhucobw6fhah05peqg_b3xm + " PING: ack=true bytes=" + ((4294967295L & j2) | (j << 32)));
            }
        } else {
            okHttpCall$1.RemoteActionCompatParcelizer(r8lambda7VEfmhucObW6FHAh05Peqg_b3XM.OUTBOUND, (4294967295L & ((long) i2)) | (((long) i) << 32));
        }
        try {
            this.read.serializer(i, i2, z);
        } catch (IOException e) {
            this.write.IconCompatParcelizer(e);
        }
    }
}
