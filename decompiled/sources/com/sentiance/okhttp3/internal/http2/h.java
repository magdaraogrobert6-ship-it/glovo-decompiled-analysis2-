package com.sentiance.okhttp3.internal.http2;

import androidx.compose.ui.graphics.Fields;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.okio.ByteString;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import o._get_defaultNotificationAccentColor_lambda0;
import o._get_sdkFlavor_lambda0;
import o._get_versionCode_lambda0;
import o.getContextandroid_sdk_base_releaseannotations;
import o.onFling;
import o.r8lambdaBEyrNr8p6809BwlBoRO_sTaNs;
import o.r8lambdaMIqXXOzLMUUicX7GG348aw6pQE;
import o.r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08;
import o.readResourceValuelambda2;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Closeable {
    public static final Logger IconCompatParcelizer = Logger.getLogger(getContextandroid_sdk_base_releaseannotations.class.getName());
    public final _get_versionCode_lambda0 MediaBrowserCompatMediaItem;
    public boolean MediaSessionCompatQueueItem;
    public final r8lambdaMIqXXOzLMUUicX7GG348aw6pQE RemoteActionCompatParcelizer;
    public int read;
    public final r8lambdaBEyrNr8p6809BwlBoRO_sTaNs serializer;
    public final boolean write;

    public final void read() {
        synchronized (this) {
            if (this.MediaSessionCompatQueueItem) {
                throw new IOException("closed");
            }
            this.RemoteActionCompatParcelizer.flush();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.MediaSessionCompatQueueItem = true;
            this.RemoteActionCompatParcelizer.close();
        }
    }

    public h(readResourceValuelambda2 readresourcevaluelambda2, boolean z) {
        this.RemoteActionCompatParcelizer = readresourcevaluelambda2;
        this.write = z;
        r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
        this.serializer = r8lambdabeyrnr8p6809bwlboro_stans;
        this.MediaBrowserCompatMediaItem = new _get_versionCode_lambda0(r8lambdabeyrnr8p6809bwlboro_stans);
        this.read = Fields.Clip;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    public final void serializer(boolean z, int i, ArrayList arrayList) throws IOException {
        int length;
        int length2;
        if (!this.MediaSessionCompatQueueItem) {
            _get_versionCode_lambda0 _get_versioncode_lambda0 = this.MediaBrowserCompatMediaItem;
            if (_get_versioncode_lambda0.RemoteActionCompatParcelizer) {
                int i2 = _get_versioncode_lambda0.read;
                if (i2 < _get_versioncode_lambda0.serializer) {
                    _get_versioncode_lambda0.RemoteActionCompatParcelizer(i2, 31, 32);
                }
                _get_versioncode_lambda0.RemoteActionCompatParcelizer = false;
                _get_versioncode_lambda0.read = Integer.MAX_VALUE;
                _get_versioncode_lambda0.RemoteActionCompatParcelizer(_get_versioncode_lambda0.serializer, 31, 32);
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                _get_defaultNotificationAccentColor_lambda0 _get_defaultnotificationaccentcolor_lambda0 = (_get_defaultNotificationAccentColor_lambda0) arrayList.get(i3);
                ByteString byteStringSerializer = _get_defaultnotificationaccentcolor_lambda0.RatingCompat.serializer();
                ByteString byteString = _get_defaultnotificationaccentcolor_lambda0.MediaMetadataCompat;
                Integer num = (Integer) _get_sdkFlavor_lambda0.IconCompatParcelizer.get(byteStringSerializer);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (length2 <= 1 || length2 >= 8) {
                        length = -1;
                    } else {
                        _get_defaultNotificationAccentColor_lambda0[] _get_defaultnotificationaccentcolor_lambda0Arr = _get_sdkFlavor_lambda0.write;
                        if (r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.IconCompatParcelizer(_get_defaultnotificationaccentcolor_lambda0Arr[iIntValue].MediaMetadataCompat, byteString)) {
                            length = length2;
                        } else if (r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.IconCompatParcelizer(_get_defaultnotificationaccentcolor_lambda0Arr[length2].MediaMetadataCompat, byteString)) {
                            length = iIntValue + 2;
                        } else {
                            length = -1;
                        }
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length == -1) {
                    int length3 = _get_versioncode_lambda0.write.length;
                    for (int i4 = _get_versioncode_lambda0.MediaDescriptionCompat + 1; i4 < length3; i4++) {
                        if (r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.IconCompatParcelizer(_get_versioncode_lambda0.write[i4].RatingCompat, byteStringSerializer)) {
                            if (r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.IconCompatParcelizer(_get_versioncode_lambda0.write[i4].MediaMetadataCompat, byteString)) {
                                length = _get_sdkFlavor_lambda0.write.length + (i4 - _get_versioncode_lambda0.MediaDescriptionCompat);
                                break;
                            } else if (length2 == -1) {
                                length2 = (i4 - _get_versioncode_lambda0.MediaDescriptionCompat) + _get_sdkFlavor_lambda0.write.length;
                            }
                        }
                    }
                }
                if (length != -1) {
                    _get_versioncode_lambda0.RemoteActionCompatParcelizer(length, 127, Fields.SpotShadowColor);
                } else if (length2 == -1) {
                    _get_versioncode_lambda0.IconCompatParcelizer.write(64);
                    _get_versioncode_lambda0.write(byteStringSerializer);
                    _get_versioncode_lambda0.write(byteString);
                    _get_versioncode_lambda0.read(_get_defaultnotificationaccentcolor_lambda0);
                } else {
                    ByteString byteString2 = _get_defaultNotificationAccentColor_lambda0.write;
                    byteStringSerializer.getClass();
                    if (byteStringSerializer.IconCompatParcelizer(byteString2, byteString2.write()) && !_get_defaultNotificationAccentColor_lambda0.MediaSessionCompatQueueItem.equals(byteStringSerializer)) {
                        _get_versioncode_lambda0.RemoteActionCompatParcelizer(length2, 15, 0);
                        _get_versioncode_lambda0.write(byteString);
                    } else {
                        _get_versioncode_lambda0.RemoteActionCompatParcelizer(length2, 63, 64);
                        _get_versioncode_lambda0.write(byteString);
                        _get_versioncode_lambda0.read(_get_defaultnotificationaccentcolor_lambda0);
                    }
                }
            }
            r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = this.serializer;
            long j = r8lambdabeyrnr8p6809bwlboro_stans.serializer;
            int iMin = (int) Math.min(this.read, j);
            long j2 = iMin;
            byte b = j == j2 ? (byte) 4 : (byte) 0;
            if (z) {
                b = (byte) (b | 1);
            }
            RemoteActionCompatParcelizer(i, iMin, (byte) 1, b);
            r8lambdaMIqXXOzLMUUicX7GG348aw6pQE r8lambdamiqxxozlmuuicx7gg348aw6pqe = this.RemoteActionCompatParcelizer;
            r8lambdamiqxxozlmuuicx7gg348aw6pqe.serializer(r8lambdabeyrnr8p6809bwlboro_stans, j2);
            if (j > j2) {
                long j3 = j - j2;
                while (j3 > 0) {
                    int iMin2 = (int) Math.min(this.read, j3);
                    long j4 = iMin2;
                    j3 -= j4;
                    RemoteActionCompatParcelizer(i, iMin2, (byte) 9, j3 == 0 ? (byte) 4 : (byte) 0);
                    r8lambdamiqxxozlmuuicx7gg348aw6pqe.serializer(r8lambdabeyrnr8p6809bwlboro_stans, j4);
                }
                return;
            }
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("closed");
    }

    public final void read(int i, ErrorCode errorCode) {
        synchronized (this) {
            if (!this.MediaSessionCompatQueueItem) {
                if (errorCode.httpCode != -1) {
                    RemoteActionCompatParcelizer(i, 4, (byte) 3, (byte) 0);
                    this.RemoteActionCompatParcelizer.MediaMetadataCompat(errorCode.httpCode);
                    this.RemoteActionCompatParcelizer.flush();
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void RemoteActionCompatParcelizer(boolean z, int i, r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans, int i2) {
        synchronized (this) {
            if (!this.MediaSessionCompatQueueItem) {
                RemoteActionCompatParcelizer(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
                if (i2 > 0) {
                    this.RemoteActionCompatParcelizer.serializer(r8lambdabeyrnr8p6809bwlboro_stans, i2);
                }
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void read(int i, int i2, boolean z) {
        synchronized (this) {
            if (!this.MediaSessionCompatQueueItem) {
                RemoteActionCompatParcelizer(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
                this.RemoteActionCompatParcelizer.MediaMetadataCompat(i);
                this.RemoteActionCompatParcelizer.MediaMetadataCompat(i2);
                this.RemoteActionCompatParcelizer.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void IconCompatParcelizer(int i, ErrorCode errorCode, byte[] bArr) {
        synchronized (this) {
            if (!this.MediaSessionCompatQueueItem) {
                if (errorCode.httpCode != -1) {
                    RemoteActionCompatParcelizer(0, bArr.length + 8, (byte) 7, (byte) 0);
                    this.RemoteActionCompatParcelizer.MediaMetadataCompat(i);
                    this.RemoteActionCompatParcelizer.MediaMetadataCompat(errorCode.httpCode);
                    if (bArr.length > 0) {
                        this.RemoteActionCompatParcelizer.write(bArr);
                    }
                    this.RemoteActionCompatParcelizer.flush();
                } else {
                    getContextandroid_sdk_base_releaseannotations.read("errorCode.httpCode == -1", new Object[0]);
                    throw null;
                }
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void read(int i, long j) {
        synchronized (this) {
            if (this.MediaSessionCompatQueueItem) {
                throw new IOException("closed");
            }
            if (j != 0 && j <= 2147483647L) {
                RemoteActionCompatParcelizer(i, 4, (byte) 8, (byte) 0);
                this.RemoteActionCompatParcelizer.MediaMetadataCompat((int) j);
                this.RemoteActionCompatParcelizer.flush();
            } else {
                getContextandroid_sdk_base_releaseannotations.read("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
                throw null;
            }
        }
    }

    public final void RemoteActionCompatParcelizer(int i, int i2, byte b, byte b2) {
        Level level = Level.FINE;
        Logger logger = IconCompatParcelizer;
        if (logger.isLoggable(level)) {
            logger.fine(getContextandroid_sdk_base_releaseannotations.write(false, i, i2, b, b2));
        }
        int i3 = this.read;
        if (i2 > i3) {
            getContextandroid_sdk_base_releaseannotations.read("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            throw null;
        }
        if ((Integer.MIN_VALUE & i) == 0) {
            r8lambdaMIqXXOzLMUUicX7GG348aw6pQE r8lambdamiqxxozlmuuicx7gg348aw6pqe = this.RemoteActionCompatParcelizer;
            r8lambdamiqxxozlmuuicx7gg348aw6pqe.MediaSessionCompatQueueItem((i2 >>> 16) & 255);
            r8lambdamiqxxozlmuuicx7gg348aw6pqe.MediaSessionCompatQueueItem((i2 >>> 8) & 255);
            r8lambdamiqxxozlmuuicx7gg348aw6pqe.MediaSessionCompatQueueItem(i2 & 255);
            r8lambdamiqxxozlmuuicx7gg348aw6pqe.MediaSessionCompatQueueItem(b & 255);
            r8lambdamiqxxozlmuuicx7gg348aw6pqe.MediaSessionCompatQueueItem(b2 & 255);
            r8lambdamiqxxozlmuuicx7gg348aw6pqe.MediaMetadataCompat(i & Integer.MAX_VALUE);
            return;
        }
        getContextandroid_sdk_base_releaseannotations.read("reserved bit set: %s", Integer.valueOf(i));
        throw null;
    }

    public final void write(onFling onfling) {
        synchronized (this) {
            if (!this.MediaSessionCompatQueueItem) {
                int i = this.read;
                int i2 = onfling.read;
                if ((i2 & 32) != 0) {
                    i = onfling.write[5];
                }
                this.read = i;
                int i3 = i2 & 2;
                if (i3 != 0) {
                    if (onfling.write[1] != -1) {
                        _get_versionCode_lambda0 _get_versioncode_lambda0 = this.MediaBrowserCompatMediaItem;
                        int iMin = Math.min(i3 != 0 ? onfling.write[1] : -1, Fields.Clip);
                        int i4 = _get_versioncode_lambda0.serializer;
                        if (i4 != iMin) {
                            if (iMin < i4) {
                                _get_versioncode_lambda0.read = Math.min(_get_versioncode_lambda0.read, iMin);
                            }
                            _get_versioncode_lambda0.RemoteActionCompatParcelizer = true;
                            _get_versioncode_lambda0.serializer = iMin;
                            int i5 = _get_versioncode_lambda0.MediaMetadataCompat;
                            if (iMin < i5) {
                                if (iMin == 0) {
                                    Arrays.fill(_get_versioncode_lambda0.write, (Object) null);
                                    _get_versioncode_lambda0.MediaDescriptionCompat = _get_versioncode_lambda0.write.length - 1;
                                    _get_versioncode_lambda0.MediaBrowserCompatMediaItem = 0;
                                    _get_versioncode_lambda0.MediaMetadataCompat = 0;
                                } else {
                                    _get_versioncode_lambda0.write(i5 - iMin);
                                }
                            }
                        }
                    }
                }
                RemoteActionCompatParcelizer(0, 0, (byte) 4, (byte) 1);
                this.RemoteActionCompatParcelizer.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }
}
