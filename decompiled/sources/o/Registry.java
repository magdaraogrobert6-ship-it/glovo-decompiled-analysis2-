package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class Registry implements Closeable {
    public RegistryMissingComponentException IconCompatParcelizer;
    public SVGParseException MediaDescriptionCompat;
    public byte[] RemoteActionCompatParcelizer;
    public boolean write;
    public long serializer = -1;
    public int MediaMetadataCompat = -1;
    public int read = -1;

    public final void IconCompatParcelizer(long j) {
        RegistryMissingComponentException registryMissingComponentException = this.IconCompatParcelizer;
        if (registryMissingComponentException == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("not attached to a buffer");
            return;
        }
        if (!this.write) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("resizeBuffer() only permitted for read/write buffers");
            return;
        }
        long j2 = registryMissingComponentException.size;
        if (j <= j2) {
            if (j < 0) {
                DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(j, "newSize < 0: "));
                return;
            }
            long j3 = j2 - j;
            while (j3 > 0) {
                SVGParseException sVGParseException = registryMissingComponentException.head;
                sVGParseException.getClass();
                SVGParseException sVGParseException2 = sVGParseException.prev;
                sVGParseException2.getClass();
                int i = sVGParseException2.limit;
                long j4 = i - sVGParseException2.pos;
                if (j4 > j3) {
                    sVGParseException2.limit = i - ((int) j3);
                    break;
                } else {
                    registryMissingComponentException.head = sVGParseException2.read();
                    ApiErrorCompanion.RemoteActionCompatParcelizer(sVGParseException2);
                    j3 -= j4;
                }
            }
            this.MediaDescriptionCompat = null;
            this.serializer = j;
            this.RemoteActionCompatParcelizer = null;
            this.MediaMetadataCompat = -1;
            this.read = -1;
        } else if (j > j2) {
            long j5 = j - j2;
            int i2 = 1;
            boolean z = true;
            for (long j6 = 0; j5 > j6; j6 = 0) {
                SVGParseException sVGParseExceptionRemoteActionCompatParcelizer = registryMissingComponentException.RemoteActionCompatParcelizer(i2);
                int iMin = (int) Math.min(j5, 8192 - sVGParseExceptionRemoteActionCompatParcelizer.limit);
                int i3 = sVGParseExceptionRemoteActionCompatParcelizer.limit + iMin;
                sVGParseExceptionRemoteActionCompatParcelizer.limit = i3;
                j5 -= (long) iMin;
                if (z) {
                    this.MediaDescriptionCompat = sVGParseExceptionRemoteActionCompatParcelizer;
                    this.serializer = j2;
                    this.RemoteActionCompatParcelizer = sVGParseExceptionRemoteActionCompatParcelizer.data;
                    this.MediaMetadataCompat = i3 - iMin;
                    this.read = i3;
                    z = false;
                }
                i2 = 1;
            }
        }
        registryMissingComponentException.size = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.IconCompatParcelizer == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("not attached to a buffer");
            return;
        }
        this.IconCompatParcelizer = null;
        this.MediaDescriptionCompat = null;
        this.serializer = -1L;
        this.RemoteActionCompatParcelizer = null;
        this.MediaMetadataCompat = -1;
        this.read = -1;
    }

    public final int serializer(long j) {
        RegistryMissingComponentException registryMissingComponentException = this.IconCompatParcelizer;
        if (registryMissingComponentException == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("not attached to a buffer");
            return 0;
        }
        if (j >= -1) {
            long j2 = registryMissingComponentException.size;
            if (j <= j2) {
                if (j == -1 || j == j2) {
                    this.MediaDescriptionCompat = null;
                    this.serializer = j;
                    this.RemoteActionCompatParcelizer = null;
                    this.MediaMetadataCompat = -1;
                    this.read = -1;
                    return -1;
                }
                SVGParseException sVGParseException = registryMissingComponentException.head;
                SVGParseException sVGParseException2 = this.MediaDescriptionCompat;
                long j3 = 0;
                if (sVGParseException2 != null) {
                    long j4 = this.serializer - ((long) (this.MediaMetadataCompat - sVGParseException2.pos));
                    if (j4 > j) {
                        j2 = j4;
                    } else {
                        j3 = j4;
                        sVGParseException2 = sVGParseException;
                        sVGParseException = sVGParseException2;
                    }
                } else {
                    sVGParseException2 = sVGParseException;
                }
                if (j2 - j > j - j3) {
                    while (true) {
                        sVGParseException.getClass();
                        long j5 = ((long) (sVGParseException.limit - sVGParseException.pos)) + j3;
                        if (j < j5) {
                            break;
                        }
                        sVGParseException = sVGParseException.next;
                        j3 = j5;
                    }
                } else {
                    while (j2 > j) {
                        sVGParseException2.getClass();
                        sVGParseException2 = sVGParseException2.prev;
                        sVGParseException2.getClass();
                        j2 -= (long) (sVGParseException2.limit - sVGParseException2.pos);
                    }
                    j3 = j2;
                    sVGParseException = sVGParseException2;
                }
                if (this.write) {
                    sVGParseException.getClass();
                    if (sVGParseException.shared) {
                        byte[] bArr = sVGParseException.data;
                        SVGParseException sVGParseException3 = new SVGParseException(Arrays.copyOf(bArr, bArr.length), sVGParseException.pos, sVGParseException.limit, false, true);
                        if (registryMissingComponentException.head == sVGParseException) {
                            registryMissingComponentException.head = sVGParseException3;
                        }
                        sVGParseException.IconCompatParcelizer(sVGParseException3);
                        SVGParseException sVGParseException4 = sVGParseException3.prev;
                        sVGParseException4.getClass();
                        sVGParseException4.read();
                        sVGParseException = sVGParseException3;
                    }
                }
                this.MediaDescriptionCompat = sVGParseException;
                this.serializer = j;
                sVGParseException.getClass();
                this.RemoteActionCompatParcelizer = sVGParseException.data;
                int i = sVGParseException.pos + ((int) (j - j3));
                this.MediaMetadataCompat = i;
                int i2 = sVGParseException.limit;
                this.read = i2;
                return i2 - i;
            }
        }
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(j, "offset=", " > size=");
        sbM.append(registryMissingComponentException.size);
        throw new ArrayIndexOutOfBoundsException(sbM.toString());
    }
}
