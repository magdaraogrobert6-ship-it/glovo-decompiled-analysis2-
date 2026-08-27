package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class setCustomUserAttributeArraylambda0 implements Closeable {
    public final SingleRequest IconCompatParcelizer;
    public final RegistryMissingComponentException RemoteActionCompatParcelizer;
    public boolean read;
    public final setCustomLocationAttributelambda0 serializer;
    public int write;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.read = true;
            this.IconCompatParcelizer.close();
        }
    }

    public final void read(int i, int i2, byte b, byte b2) {
        java.util.logging.Logger logger = setCustomLocationAttributelambda2.write;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(setDateOfBirthlambda1.read(false, i, i2, b, b2));
        }
        int i3 = this.write;
        if (i2 > i3) {
            java.util.Locale locale = java.util.Locale.US;
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(i3, "FRAME_SIZE_ERROR length > ", i2, ": "));
            return;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            java.util.Locale locale2 = java.util.Locale.US;
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "reserved bit set: "));
            return;
        }
        SingleRequest singleRequest = this.IconCompatParcelizer;
        singleRequest.serializer((i2 >>> 16) & 255);
        singleRequest.serializer((i2 >>> 8) & 255);
        singleRequest.serializer(i2 & 255);
        singleRequest.serializer(b & 255);
        singleRequest.serializer(b2 & 255);
        singleRequest.IconCompatParcelizer(i & Integer.MAX_VALUE);
    }

    public setCustomUserAttributeArraylambda0(SingleRequest singleRequest) {
        this.IconCompatParcelizer = singleRequest;
        RegistryMissingComponentException registryMissingComponentException = new RegistryMissingComponentException();
        this.RemoteActionCompatParcelizer = registryMissingComponentException;
        this.serializer = new setCustomLocationAttributelambda0(registryMissingComponentException);
        this.write = androidx.compose.ui.graphics.Fields.Clip;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    public final void IconCompatParcelizer(List list, boolean z, int i) throws IOException {
        int length;
        int length2;
        if (!this.read) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                incrementCustomUserAttributelambda1 incrementcustomuserattributelambda1 = (incrementCustomUserAttributelambda1) list.get(i2);
                RequestBuilder requestBuilderWrite = incrementcustomuserattributelambda1.MediaSessionCompatQueueItem.write();
                RequestBuilder requestBuilder = incrementcustomuserattributelambda1.MediaBrowserCompatMediaItem;
                Integer num = (Integer) setCustomLocationAttributelambda1.serializer.get(requestBuilderWrite);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (length2 < 2 || length2 > 7) {
                        length = -1;
                    } else {
                        incrementCustomUserAttributelambda1[] incrementcustomuserattributelambda1Arr = setCustomLocationAttributelambda1.IconCompatParcelizer;
                        if (incrementcustomuserattributelambda1Arr[iIntValue].MediaBrowserCompatMediaItem.equals(requestBuilder)) {
                            length = length2;
                        } else if (incrementcustomuserattributelambda1Arr[length2].MediaBrowserCompatMediaItem.equals(requestBuilder)) {
                            length = iIntValue + 2;
                        } else {
                            length = -1;
                        }
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                setCustomLocationAttributelambda0 setcustomlocationattributelambda0 = this.serializer;
                if (length == -1) {
                    int i3 = setcustomlocationattributelambda0.RemoteActionCompatParcelizer + 1;
                    while (true) {
                        incrementCustomUserAttributelambda1[] incrementcustomuserattributelambda1Arr2 = setcustomlocationattributelambda0.write;
                        if (i3 >= incrementcustomuserattributelambda1Arr2.length) {
                            break;
                        }
                        if (incrementcustomuserattributelambda1Arr2[i3].MediaSessionCompatQueueItem.equals(requestBuilderWrite)) {
                            if (setcustomlocationattributelambda0.write[i3].MediaBrowserCompatMediaItem.equals(requestBuilder)) {
                                length = setCustomLocationAttributelambda1.IconCompatParcelizer.length + (i3 - setcustomlocationattributelambda0.RemoteActionCompatParcelizer);
                                break;
                            } else if (length2 == -1) {
                                length2 = (i3 - setcustomlocationattributelambda0.RemoteActionCompatParcelizer) + setCustomLocationAttributelambda1.IconCompatParcelizer.length;
                            }
                        }
                        i3++;
                    }
                }
                if (length != -1) {
                    setcustomlocationattributelambda0.read(length, 127, androidx.compose.ui.graphics.Fields.SpotShadowColor);
                } else if (length2 == -1) {
                    setcustomlocationattributelambda0.serializer.read(64);
                    setcustomlocationattributelambda0.serializer(requestBuilderWrite);
                    setcustomlocationattributelambda0.serializer(requestBuilder);
                    setcustomlocationattributelambda0.read(incrementcustomuserattributelambda1);
                } else {
                    RequestBuilder requestBuilder2 = setCustomLocationAttributelambda1.read;
                    requestBuilderWrite.getClass();
                    requestBuilder2.getClass();
                    if (requestBuilderWrite.write(0, requestBuilder2, requestBuilder2.serializer()) && !incrementCustomUserAttributelambda1.read.equals(requestBuilderWrite)) {
                        setcustomlocationattributelambda0.read(length2, 15, 0);
                        setcustomlocationattributelambda0.serializer(requestBuilder);
                    } else {
                        setcustomlocationattributelambda0.read(length2, 63, 64);
                        setcustomlocationattributelambda0.serializer(requestBuilder);
                        setcustomlocationattributelambda0.read(incrementcustomuserattributelambda1);
                    }
                }
            }
            RegistryMissingComponentException registryMissingComponentException = this.RemoteActionCompatParcelizer;
            long j = registryMissingComponentException.size;
            int iMin = (int) Math.min(this.write, j);
            long j2 = iMin;
            byte b = j == j2 ? (byte) 4 : (byte) 0;
            if (z) {
                b = (byte) (b | 1);
            }
            read(i, iMin, (byte) 1, b);
            SingleRequest singleRequest = this.IconCompatParcelizer;
            singleRequest.write(registryMissingComponentException, j2);
            if (j > j2) {
                long j3 = j - j2;
                while (j3 > 0) {
                    int iMin2 = (int) Math.min(this.write, j3);
                    long j4 = iMin2;
                    j3 -= j4;
                    read(i, iMin2, (byte) 9, j3 == 0 ? (byte) 4 : (byte) 0);
                    singleRequest.write(registryMissingComponentException, j4);
                }
                return;
            }
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("closed");
    }
}
