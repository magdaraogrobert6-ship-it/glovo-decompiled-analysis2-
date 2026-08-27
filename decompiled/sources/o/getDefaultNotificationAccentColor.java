package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.okhttp3.internal.http2.ErrorCode;
import com.sentiance.okio.ByteString;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
public final class getDefaultNotificationAccentColor implements Closeable {
    public static final java.util.logging.Logger RemoteActionCompatParcelizer = java.util.logging.Logger.getLogger(getContextandroid_sdk_base_releaseannotations.class.getName());
    public final boolean IconCompatParcelizer;
    public final r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k read;
    public final getDoesHandlePushDeepLinksAutomatically serializer;
    public final getDefaultNotificationAccentColorannotations write;

    public final boolean read(boolean z, getCustomHtmlWebViewActivityClassName getcustomhtmlwebviewactivityclassname) throws IOException {
        getDeviceObjectAllowlist[] getdeviceobjectallowlistArr;
        try {
            this.read.MediaDescriptionCompat(9L);
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.read);
            if (iRemoteActionCompatParcelizer >= 0) {
                int i = androidx.compose.ui.graphics.Fields.Clip;
                if (iRemoteActionCompatParcelizer <= 16384) {
                    byte bMediaBrowserCompatMediaItem = (byte) (this.read.MediaBrowserCompatMediaItem() & 255);
                    if (z && bMediaBrowserCompatMediaItem != 4) {
                        getContextandroid_sdk_base_releaseannotations.write("Expected a SETTINGS frame but was %s", Byte.valueOf(bMediaBrowserCompatMediaItem));
                        throw null;
                    }
                    byte bMediaBrowserCompatMediaItem2 = (byte) (this.read.MediaBrowserCompatMediaItem() & 255);
                    int iParcelableVolumeInfo = this.read.ParcelableVolumeInfo();
                    int i2 = Integer.MAX_VALUE & iParcelableVolumeInfo;
                    java.util.logging.Logger logger = RemoteActionCompatParcelizer;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(getContextandroid_sdk_base_releaseannotations.write(true, i2, iRemoteActionCompatParcelizer, bMediaBrowserCompatMediaItem, bMediaBrowserCompatMediaItem2));
                    }
                    try {
                        switch (bMediaBrowserCompatMediaItem) {
                            case 0:
                                RemoteActionCompatParcelizer(getcustomhtmlwebviewactivityclassname, iRemoteActionCompatParcelizer, bMediaBrowserCompatMediaItem2, i2);
                                return true;
                            case 1:
                                read(getcustomhtmlwebviewactivityclassname, iRemoteActionCompatParcelizer, bMediaBrowserCompatMediaItem2, i2);
                                return true;
                            case 2:
                                if (iRemoteActionCompatParcelizer != 5) {
                                    getContextandroid_sdk_base_releaseannotations.write("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iRemoteActionCompatParcelizer));
                                    throw null;
                                }
                                if (i2 == 0) {
                                    getContextandroid_sdk_base_releaseannotations.write("TYPE_PRIORITY streamId == 0", new Object[0]);
                                    throw null;
                                }
                                r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k r8lambdaoorzolqoybc_uxebbkbnmvlvm7k = this.read;
                                r8lambdaoorzolqoybc_uxebbkbnmvlvm7k.ParcelableVolumeInfo();
                                r8lambdaoorzolqoybc_uxebbkbnmvlvm7k.MediaBrowserCompatMediaItem();
                                return true;
                            case 3:
                                if (iRemoteActionCompatParcelizer != 4) {
                                    getContextandroid_sdk_base_releaseannotations.write("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(iRemoteActionCompatParcelizer));
                                    throw null;
                                }
                                if (i2 == 0) {
                                    getContextandroid_sdk_base_releaseannotations.write("TYPE_RST_STREAM streamId == 0", new Object[0]);
                                    throw null;
                                }
                                int iParcelableVolumeInfo2 = this.read.ParcelableVolumeInfo();
                                ErrorCode errorCodeFromHttp2 = ErrorCode.fromHttp2(iParcelableVolumeInfo2);
                                if (errorCodeFromHttp2 == null) {
                                    getContextandroid_sdk_base_releaseannotations.write("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(iParcelableVolumeInfo2));
                                    throw null;
                                }
                                getGenericEnumSetFromStringSet getgenericenumsetfromstringset = (getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write;
                                if (i2 != 0 && (iParcelableVolumeInfo & 1) == 0) {
                                    getgenericenumsetfromstringset.write(new getApplicationIconResourceId(getgenericenumsetfromstringset, new Object[]{getgenericenumsetfromstringset.ParcelableVolumeInfo, Integer.valueOf(i2)}, i2, errorCodeFromHttp2));
                                    return true;
                                }
                                getDeviceObjectAllowlist getdeviceobjectallowlistSerializer = getgenericenumsetfromstringset.serializer(i2);
                                if (getdeviceobjectallowlistSerializer != null) {
                                    synchronized (getdeviceobjectallowlistSerializer) {
                                        if (getdeviceobjectallowlistSerializer.ParcelableVolumeInfo == null) {
                                            getdeviceobjectallowlistSerializer.ParcelableVolumeInfo = errorCodeFromHttp2;
                                            getdeviceobjectallowlistSerializer.notifyAll();
                                        }
                                        break;
                                    }
                                    return true;
                                }
                                return true;
                            case 4:
                                r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k r8lambdaoorzolqoybc_uxebbkbnmvlvm7k2 = this.read;
                                if (i2 != 0) {
                                    getContextandroid_sdk_base_releaseannotations.write("TYPE_SETTINGS streamId != 0", new Object[0]);
                                    throw null;
                                }
                                if ((bMediaBrowserCompatMediaItem2 & 1) == 0) {
                                    if (iRemoteActionCompatParcelizer % 6 != 0) {
                                        getContextandroid_sdk_base_releaseannotations.write("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(iRemoteActionCompatParcelizer));
                                        throw null;
                                    }
                                    onFling onfling = new onFling(1);
                                    int i3 = 0;
                                    while (i3 < iRemoteActionCompatParcelizer) {
                                        int iMediaSessionCompatToken = r8lambdaoorzolqoybc_uxebbkbnmvlvm7k2.MediaSessionCompatToken() & 65535;
                                        int iParcelableVolumeInfo3 = r8lambdaoorzolqoybc_uxebbkbnmvlvm7k2.ParcelableVolumeInfo();
                                        if (iMediaSessionCompatToken == 2) {
                                            if (iParcelableVolumeInfo3 != 0 && iParcelableVolumeInfo3 != 1) {
                                                getContextandroid_sdk_base_releaseannotations.write("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                                throw null;
                                            }
                                        } else if (iMediaSessionCompatToken == 3) {
                                            iMediaSessionCompatToken = 4;
                                        } else if (iMediaSessionCompatToken != 4) {
                                            if (iMediaSessionCompatToken == 5 && (iParcelableVolumeInfo3 < i || iParcelableVolumeInfo3 > 16777215)) {
                                                getContextandroid_sdk_base_releaseannotations.write("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(iParcelableVolumeInfo3));
                                                throw null;
                                            }
                                        } else {
                                            if (iParcelableVolumeInfo3 < 0) {
                                                getContextandroid_sdk_base_releaseannotations.write("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                                throw null;
                                            }
                                            iMediaSessionCompatToken = 7;
                                        }
                                        onfling.IconCompatParcelizer(iMediaSessionCompatToken, iParcelableVolumeInfo3);
                                        i3 += 6;
                                        i = androidx.compose.ui.graphics.Fields.Clip;
                                    }
                                    getGenericEnumSetFromStringSet getgenericenumsetfromstringset2 = (getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write;
                                    getgenericenumsetfromstringset2.PlaybackStateCompat.execute(new getCustomHtmlWebViewActivityClassName(getcustomhtmlwebviewactivityclassname, new Object[]{getgenericenumsetfromstringset2.ParcelableVolumeInfo}, onfling));
                                    break;
                                } else if (iRemoteActionCompatParcelizer != 0) {
                                    getContextandroid_sdk_base_releaseannotations.write("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                                    throw null;
                                }
                                return true;
                            case 5:
                                serializer(getcustomhtmlwebviewactivityclassname, iRemoteActionCompatParcelizer, bMediaBrowserCompatMediaItem2, i2);
                                return true;
                            case 6:
                                if (iRemoteActionCompatParcelizer != 8) {
                                    getContextandroid_sdk_base_releaseannotations.write("TYPE_PING length != 8: %s", Integer.valueOf(iRemoteActionCompatParcelizer));
                                    throw null;
                                }
                                if (i2 != 0) {
                                    getContextandroid_sdk_base_releaseannotations.write("TYPE_PING streamId != 0", new Object[0]);
                                    throw null;
                                }
                                int iParcelableVolumeInfo4 = this.read.ParcelableVolumeInfo();
                                int iParcelableVolumeInfo5 = this.read.ParcelableVolumeInfo();
                                i = (bMediaBrowserCompatMediaItem2 & 1) != 0 ? 1 : 0;
                                getGenericEnumSetFromStringSet getgenericenumsetfromstringset3 = (getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write;
                                if (i != 0) {
                                    synchronized (getgenericenumsetfromstringset3) {
                                        try {
                                            if (iParcelableVolumeInfo4 == 1) {
                                                ((getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write).ResultReceiver++;
                                            } else if (iParcelableVolumeInfo4 == 2) {
                                                ((getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write).r8lambda54BeH8ZsBru0CXI2CCSP2syNys++;
                                            } else if (iParcelableVolumeInfo4 == 3) {
                                                ((getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write).notifyAll();
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                        break;
                                    }
                                } else {
                                    getgenericenumsetfromstringset3.PlaybackStateCompat.execute(new getCustomLocationProviderNames(getgenericenumsetfromstringset3, iParcelableVolumeInfo4, iParcelableVolumeInfo5));
                                    break;
                                }
                                return true;
                            case 7:
                                if (iRemoteActionCompatParcelizer < 8) {
                                    getContextandroid_sdk_base_releaseannotations.write("TYPE_GOAWAY length < 8: %s", Integer.valueOf(iRemoteActionCompatParcelizer));
                                    throw null;
                                }
                                if (i2 != 0) {
                                    getContextandroid_sdk_base_releaseannotations.write("TYPE_GOAWAY streamId != 0", new Object[0]);
                                    throw null;
                                }
                                int iParcelableVolumeInfo6 = this.read.ParcelableVolumeInfo();
                                int iParcelableVolumeInfo7 = this.read.ParcelableVolumeInfo();
                                int i4 = iRemoteActionCompatParcelizer - 8;
                                if (ErrorCode.fromHttp2(iParcelableVolumeInfo7) == null) {
                                    getContextandroid_sdk_base_releaseannotations.write("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(iParcelableVolumeInfo7));
                                    throw null;
                                }
                                ByteString byteString = ByteString.write;
                                if (i4 > 0) {
                                    byteString = this.read.read(i4);
                                }
                                byteString.write();
                                synchronized (((getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write)) {
                                    getdeviceobjectallowlistArr = (getDeviceObjectAllowlist[]) ((getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write).MediaMetadataCompat.values().toArray(new getDeviceObjectAllowlist[((getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write).MediaMetadataCompat.size()]);
                                    ((getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write).PlaybackStateCompatCustomAction = true;
                                    break;
                                }
                                for (getDeviceObjectAllowlist getdeviceobjectallowlist : getdeviceobjectallowlistArr) {
                                    if (getdeviceobjectallowlist.read > iParcelableVolumeInfo6 && getdeviceobjectallowlist.RemoteActionCompatParcelizer()) {
                                        ErrorCode errorCode = ErrorCode.REFUSED_STREAM;
                                        synchronized (getdeviceobjectallowlist) {
                                            if (getdeviceobjectallowlist.ParcelableVolumeInfo == null) {
                                                getdeviceobjectallowlist.ParcelableVolumeInfo = errorCode;
                                                getdeviceobjectallowlist.notifyAll();
                                            }
                                            break;
                                        }
                                        ((getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write).serializer(getdeviceobjectallowlist.read);
                                    }
                                }
                                return true;
                            case 8:
                                if (iRemoteActionCompatParcelizer != 4) {
                                    getContextandroid_sdk_base_releaseannotations.write("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iRemoteActionCompatParcelizer));
                                    throw null;
                                }
                                long jParcelableVolumeInfo = ((long) this.read.ParcelableVolumeInfo()) & 2147483647L;
                                if (jParcelableVolumeInfo == 0) {
                                    getContextandroid_sdk_base_releaseannotations.write("windowSizeIncrement was 0", Long.valueOf(jParcelableVolumeInfo));
                                    throw null;
                                }
                                getGenericEnumSetFromStringSet getgenericenumsetfromstringset4 = (getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write;
                                if (i2 == 0) {
                                    synchronized (getgenericenumsetfromstringset4) {
                                        getGenericEnumSetFromStringSet getgenericenumsetfromstringset5 = (getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write;
                                        getgenericenumsetfromstringset5.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM += jParcelableVolumeInfo;
                                        getgenericenumsetfromstringset5.notifyAll();
                                        break;
                                    }
                                    return true;
                                }
                                getDeviceObjectAllowlist getdeviceobjectallowlistWrite = getgenericenumsetfromstringset4.write(i2);
                                if (getdeviceobjectallowlistWrite != null) {
                                    synchronized (getdeviceobjectallowlistWrite) {
                                        getdeviceobjectallowlistWrite.write += jParcelableVolumeInfo;
                                        if (jParcelableVolumeInfo > 0) {
                                            getdeviceobjectallowlistWrite.notifyAll();
                                        }
                                        break;
                                    }
                                    return true;
                                }
                                return true;
                            default:
                                this.read.IconCompatParcelizer(iRemoteActionCompatParcelizer);
                                return true;
                        }
                    } catch (RejectedExecutionException unused) {
                    }
                }
            }
            getContextandroid_sdk_base_releaseannotations.write("FRAME_SIZE_ERROR: %s", Integer.valueOf(iRemoteActionCompatParcelizer));
            throw null;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.read.close();
    }

    public getDefaultNotificationAccentColor(readResourceValuelambda1 readresourcevaluelambda1, boolean z) {
        this.read = readresourcevaluelambda1;
        this.IconCompatParcelizer = z;
        getDoesHandlePushDeepLinksAutomatically getdoeshandlepushdeeplinksautomatically = new getDoesHandlePushDeepLinksAutomatically(readresourcevaluelambda1);
        this.serializer = getdoeshandlepushdeeplinksautomatically;
        this.write = new getDefaultNotificationAccentColorannotations(getdoeshandlepushdeeplinksautomatically);
    }

    public final void serializer(getCustomHtmlWebViewActivityClassName getcustomhtmlwebviewactivityclassname, int i, byte b, int i2) throws IOException {
        if (i2 != 0) {
            short sMediaBrowserCompatMediaItem = (b & 8) != 0 ? (short) (this.read.MediaBrowserCompatMediaItem() & 255) : (short) 0;
            int iParcelableVolumeInfo = this.read.ParcelableVolumeInfo() & Integer.MAX_VALUE;
            ArrayList arrayListRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(write(i - 4, b, sMediaBrowserCompatMediaItem), sMediaBrowserCompatMediaItem, b, i2);
            getGenericEnumSetFromStringSet getgenericenumsetfromstringset = (getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write;
            synchronized (getgenericenumsetfromstringset) {
                if (getgenericenumsetfromstringset.RatingCompat.contains(Integer.valueOf(iParcelableVolumeInfo))) {
                    getgenericenumsetfromstringset.serializer(iParcelableVolumeInfo, ErrorCode.PROTOCOL_ERROR);
                    return;
                }
                getgenericenumsetfromstringset.RatingCompat.add(Integer.valueOf(iParcelableVolumeInfo));
                try {
                    getgenericenumsetfromstringset.write(new getApplicationIconResourceId(getgenericenumsetfromstringset, new Object[]{getgenericenumsetfromstringset.ParcelableVolumeInfo, Integer.valueOf(iParcelableVolumeInfo)}, iParcelableVolumeInfo, arrayListRemoteActionCompatParcelizer));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
        }
        getContextandroid_sdk_base_releaseannotations.write("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        throw null;
    }

    public final void read(getCustomHtmlWebViewActivityClassName getcustomhtmlwebviewactivityclassname, int i, byte b, int i2) throws IOException {
        boolean zWrite;
        if (i2 != 0) {
            boolean z = (b & 1) != 0;
            short sMediaBrowserCompatMediaItem = (b & 8) != 0 ? (short) (this.read.MediaBrowserCompatMediaItem() & 255) : (short) 0;
            if ((b & 32) != 0) {
                r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k r8lambdaoorzolqoybc_uxebbkbnmvlvm7k = this.read;
                r8lambdaoorzolqoybc_uxebbkbnmvlvm7k.ParcelableVolumeInfo();
                r8lambdaoorzolqoybc_uxebbkbnmvlvm7k.MediaBrowserCompatMediaItem();
                i -= 5;
            }
            ArrayList arrayListRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(write(i, b, sMediaBrowserCompatMediaItem), sMediaBrowserCompatMediaItem, b, i2);
            getGenericEnumSetFromStringSet getgenericenumsetfromstringset = (getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write;
            if (i2 != 0 && (i2 & 1) == 0) {
                try {
                    getgenericenumsetfromstringset.write(new getApplicationIconResourceId(getgenericenumsetfromstringset, new Object[]{getgenericenumsetfromstringset.ParcelableVolumeInfo, Integer.valueOf(i2)}, i2, arrayListRemoteActionCompatParcelizer, z));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (getgenericenumsetfromstringset) {
                getDeviceObjectAllowlist getdeviceobjectallowlistWrite = ((getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write).write(i2);
                if (getdeviceobjectallowlistWrite == null) {
                    getGenericEnumSetFromStringSet getgenericenumsetfromstringset2 = (getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write;
                    if (getgenericenumsetfromstringset2.PlaybackStateCompatCustomAction) {
                        return;
                    }
                    if (i2 <= getgenericenumsetfromstringset2.MediaSessionCompatResultReceiverWrapper) {
                        return;
                    }
                    if (i2 % 2 == getgenericenumsetfromstringset2.MediaSessionCompatToken % 2) {
                        return;
                    }
                    getDeviceObjectAllowlist getdeviceobjectallowlist = new getDeviceObjectAllowlist(i2, (getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write, false, z, r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.IconCompatParcelizer(arrayListRemoteActionCompatParcelizer));
                    getGenericEnumSetFromStringSet getgenericenumsetfromstringset3 = (getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write;
                    getgenericenumsetfromstringset3.MediaSessionCompatResultReceiverWrapper = i2;
                    getgenericenumsetfromstringset3.MediaMetadataCompat.put(Integer.valueOf(i2), getdeviceobjectallowlist);
                    getGenericEnumSetFromStringSet.IconCompatParcelizer.execute(new getCustomHtmlWebViewActivityClassName(getcustomhtmlwebviewactivityclassname, new Object[]{((getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write).ParcelableVolumeInfo, Integer.valueOf(i2)}, getdeviceobjectallowlist));
                    return;
                }
                synchronized (getdeviceobjectallowlistWrite) {
                    getdeviceobjectallowlistWrite.MediaMetadataCompat = true;
                    getdeviceobjectallowlistWrite.serializer.add(r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.IconCompatParcelizer(arrayListRemoteActionCompatParcelizer));
                    zWrite = getdeviceobjectallowlistWrite.write();
                    getdeviceobjectallowlistWrite.notifyAll();
                }
                if (!zWrite) {
                    getdeviceobjectallowlistWrite.IconCompatParcelizer.serializer(getdeviceobjectallowlistWrite.read);
                }
                if (z) {
                    getdeviceobjectallowlistWrite.MediaBrowserCompatMediaItem();
                    return;
                }
                return;
            }
        }
        getContextandroid_sdk_base_releaseannotations.write("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        throw null;
    }

    public final void write(getCustomHtmlWebViewActivityClassName getcustomhtmlwebviewactivityclassname) {
        if (this.IconCompatParcelizer) {
            if (read(true, getcustomhtmlwebviewactivityclassname)) {
                return;
            }
            getContextandroid_sdk_base_releaseannotations.write("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
        ByteString byteString = getContextandroid_sdk_base_releaseannotations.IconCompatParcelizer;
        ByteString byteString2 = this.read.read(byteString.write());
        Level level = Level.FINE;
        java.util.logging.Logger logger = RemoteActionCompatParcelizer;
        if (logger.isLoggable(level)) {
            String str = byteString2.read();
            byte[] bArr = r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.RemoteActionCompatParcelizer;
            java.util.Locale locale = java.util.Locale.US;
            logger.fine("<< CONNECTION " + str);
        }
        if (byteString.equals(byteString2)) {
            return;
        }
        getContextandroid_sdk_base_releaseannotations.write("Expected a connection header but was %s", byteString2.RatingCompat());
        throw null;
    }

    public final ArrayList RemoteActionCompatParcelizer(int i, short s, byte b, int i2) throws IOException {
        getDoesHandlePushDeepLinksAutomatically getdoeshandlepushdeeplinksautomatically = this.serializer;
        getdoeshandlepushdeeplinksautomatically.serializer = i;
        getdoeshandlepushdeeplinksautomatically.read = i;
        getdoeshandlepushdeeplinksautomatically.MediaMetadataCompat = s;
        getdoeshandlepushdeeplinksautomatically.RemoteActionCompatParcelizer = b;
        getdoeshandlepushdeeplinksautomatically.IconCompatParcelizer = i2;
        getDefaultNotificationAccentColorannotations getdefaultnotificationaccentcolorannotations = this.write;
        readResourceValuelambda1 readresourcevaluelambda1 = getdefaultnotificationaccentcolorannotations.IconCompatParcelizer;
        ArrayList arrayList = getdefaultnotificationaccentcolorannotations.write;
        while (!readresourcevaluelambda1.RemoteActionCompatParcelizer()) {
            byte bMediaBrowserCompatMediaItem = readresourcevaluelambda1.MediaBrowserCompatMediaItem();
            int i3 = bMediaBrowserCompatMediaItem & 255;
            if (i3 == 128) {
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer("index == 0");
                return null;
            }
            if ((bMediaBrowserCompatMediaItem & 128) == 128) {
                int iRemoteActionCompatParcelizer = getdefaultnotificationaccentcolorannotations.RemoteActionCompatParcelizer(i3, 127);
                int i4 = iRemoteActionCompatParcelizer - 1;
                if (i4 >= 0) {
                    _get_defaultNotificationAccentColor_lambda0[] _get_defaultnotificationaccentcolor_lambda0Arr = _get_sdkFlavor_lambda0.write;
                    if (i4 <= _get_defaultnotificationaccentcolor_lambda0Arr.length - 1) {
                        arrayList.add(_get_defaultnotificationaccentcolor_lambda0Arr[i4]);
                    }
                }
                int length = getdefaultnotificationaccentcolorannotations.MediaBrowserCompatMediaItem + 1 + (i4 - _get_sdkFlavor_lambda0.write.length);
                if (length >= 0) {
                    _get_defaultNotificationAccentColor_lambda0[] _get_defaultnotificationaccentcolor_lambda0Arr2 = getdefaultnotificationaccentcolorannotations.read;
                    if (length < _get_defaultnotificationaccentcolor_lambda0Arr2.length) {
                        arrayList.add(_get_defaultnotificationaccentcolor_lambda0Arr2[length]);
                    }
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.serializer(c8$$ExternalSyntheticOutline0.m(iRemoteActionCompatParcelizer, "Header index too large "));
                return null;
            }
            if (i3 == 64) {
                ByteString byteStringRemoteActionCompatParcelizer = getdefaultnotificationaccentcolorannotations.RemoteActionCompatParcelizer();
                _get_sdkFlavor_lambda0.serializer(byteStringRemoteActionCompatParcelizer);
                getdefaultnotificationaccentcolorannotations.IconCompatParcelizer(new _get_defaultNotificationAccentColor_lambda0(byteStringRemoteActionCompatParcelizer, getdefaultnotificationaccentcolorannotations.RemoteActionCompatParcelizer()));
            } else if ((bMediaBrowserCompatMediaItem & 64) == 64) {
                getdefaultnotificationaccentcolorannotations.IconCompatParcelizer(new _get_defaultNotificationAccentColor_lambda0(getdefaultnotificationaccentcolorannotations.read(getdefaultnotificationaccentcolorannotations.RemoteActionCompatParcelizer(i3, 63) - 1), getdefaultnotificationaccentcolorannotations.RemoteActionCompatParcelizer()));
            } else if ((bMediaBrowserCompatMediaItem & 32) == 32) {
                int iRemoteActionCompatParcelizer2 = getdefaultnotificationaccentcolorannotations.RemoteActionCompatParcelizer(i3, 31);
                getdefaultnotificationaccentcolorannotations.serializer = iRemoteActionCompatParcelizer2;
                if (iRemoteActionCompatParcelizer2 >= 0 && iRemoteActionCompatParcelizer2 <= getdefaultnotificationaccentcolorannotations.RemoteActionCompatParcelizer) {
                    int i5 = getdefaultnotificationaccentcolorannotations.MediaDescriptionCompat;
                    if (iRemoteActionCompatParcelizer2 < i5) {
                        if (iRemoteActionCompatParcelizer2 == 0) {
                            Arrays.fill(getdefaultnotificationaccentcolorannotations.read, (Object) null);
                            getdefaultnotificationaccentcolorannotations.MediaBrowserCompatMediaItem = getdefaultnotificationaccentcolorannotations.read.length - 1;
                            getdefaultnotificationaccentcolorannotations.MediaSessionCompatQueueItem = 0;
                            getdefaultnotificationaccentcolorannotations.MediaDescriptionCompat = 0;
                        } else {
                            getdefaultnotificationaccentcolorannotations.write(i5 - iRemoteActionCompatParcelizer2);
                        }
                    }
                } else {
                    DrawableTransformation.RemoteActionCompatParcelizer(getdefaultnotificationaccentcolorannotations.serializer, "Invalid dynamic table size update ");
                    return null;
                }
            } else if (i3 != 16 && i3 != 0) {
                arrayList.add(new _get_defaultNotificationAccentColor_lambda0(getdefaultnotificationaccentcolorannotations.read(getdefaultnotificationaccentcolorannotations.RemoteActionCompatParcelizer(i3, 15) - 1), getdefaultnotificationaccentcolorannotations.RemoteActionCompatParcelizer()));
            } else {
                ByteString byteStringRemoteActionCompatParcelizer2 = getdefaultnotificationaccentcolorannotations.RemoteActionCompatParcelizer();
                _get_sdkFlavor_lambda0.serializer(byteStringRemoteActionCompatParcelizer2);
                arrayList.add(new _get_defaultNotificationAccentColor_lambda0(byteStringRemoteActionCompatParcelizer2, getdefaultnotificationaccentcolorannotations.RemoteActionCompatParcelizer()));
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        return arrayList2;
    }

    public final void RemoteActionCompatParcelizer(getCustomHtmlWebViewActivityClassName getcustomhtmlwebviewactivityclassname, int i, byte b, int i2) throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        if (i2 == 0) {
            getContextandroid_sdk_base_releaseannotations.write("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
            throw null;
        }
        boolean z4 = (b & 1) != 0;
        if ((b & 32) == 0) {
            short sMediaBrowserCompatMediaItem = (b & 8) != 0 ? (short) (this.read.MediaBrowserCompatMediaItem() & 255) : (short) 0;
            int iWrite = write(i, b, sMediaBrowserCompatMediaItem);
            r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k r8lambdaoorzolqoybc_uxebbkbnmvlvm7k = this.read;
            getGenericEnumSetFromStringSet getgenericenumsetfromstringset = (getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write;
            if (i2 != 0 && (i2 & 1) == 0) {
                r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans = new r8lambdaBEyrNr8p6809BwlBoRO_sTaNs();
                long j2 = iWrite;
                r8lambdaoorzolqoybc_uxebbkbnmvlvm7k.MediaDescriptionCompat(j2);
                r8lambdaoorzolqoybc_uxebbkbnmvlvm7k.read(r8lambdabeyrnr8p6809bwlboro_stans, j2);
                if (r8lambdabeyrnr8p6809bwlboro_stans.serializer == j2) {
                    getgenericenumsetfromstringset.write(new getVersionCodeannotations(getgenericenumsetfromstringset, new Object[]{getgenericenumsetfromstringset.ParcelableVolumeInfo, Integer.valueOf(i2)}, i2, r8lambdabeyrnr8p6809bwlboro_stans, iWrite, z4));
                } else {
                    throw new IOException(r8lambdabeyrnr8p6809bwlboro_stans.serializer + " != " + iWrite);
                }
            } else {
                getDeviceObjectAllowlist getdeviceobjectallowlistWrite = getgenericenumsetfromstringset.write(i2);
                if (getdeviceobjectallowlistWrite == null) {
                    ((getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write).serializer(i2, ErrorCode.PROTOCOL_ERROR);
                    long j3 = iWrite;
                    ((getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write).serializer(j3);
                    r8lambdaoorzolqoybc_uxebbkbnmvlvm7k.IconCompatParcelizer(j3);
                } else {
                    getDefaultNotificationChannelDescription getdefaultnotificationchanneldescription = getdeviceobjectallowlistWrite.MediaSessionCompatQueueItem;
                    long j4 = iWrite;
                    while (true) {
                        if (j4 > 0) {
                            synchronized (getdefaultnotificationchanneldescription.MediaMetadataCompat) {
                                z2 = getdefaultnotificationchanneldescription.RemoteActionCompatParcelizer;
                                z = z4;
                                z3 = getdefaultnotificationchanneldescription.serializer.serializer + j4 > getdefaultnotificationchanneldescription.IconCompatParcelizer;
                            }
                            if (z3) {
                                r8lambdaoorzolqoybc_uxebbkbnmvlvm7k.IconCompatParcelizer(j4);
                                getDeviceObjectAllowlist getdeviceobjectallowlist = getdefaultnotificationchanneldescription.MediaMetadataCompat;
                                ErrorCode errorCode = ErrorCode.FLOW_CONTROL_ERROR;
                                if (!getdeviceobjectallowlist.RemoteActionCompatParcelizer(errorCode)) {
                                    break;
                                }
                                getdeviceobjectallowlist.IconCompatParcelizer.serializer(getdeviceobjectallowlist.read, errorCode);
                                break;
                            }
                            if (z2) {
                                r8lambdaoorzolqoybc_uxebbkbnmvlvm7k.IconCompatParcelizer(j4);
                                break;
                            }
                            long j5 = r8lambdaoorzolqoybc_uxebbkbnmvlvm7k.read(getdefaultnotificationchanneldescription.read, j4);
                            if (j5 != -1) {
                                j4 -= j5;
                                synchronized (getdefaultnotificationchanneldescription.MediaMetadataCompat) {
                                    if (getdefaultnotificationchanneldescription.write) {
                                        r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans2 = getdefaultnotificationchanneldescription.read;
                                        j = r8lambdabeyrnr8p6809bwlboro_stans2.serializer;
                                        r8lambdabeyrnr8p6809bwlboro_stans2.serializer();
                                    } else {
                                        r8lambdaBEyrNr8p6809BwlBoRO_sTaNs r8lambdabeyrnr8p6809bwlboro_stans3 = getdefaultnotificationchanneldescription.serializer;
                                        boolean z5 = r8lambdabeyrnr8p6809bwlboro_stans3.serializer == 0;
                                        r8lambdabeyrnr8p6809bwlboro_stans3.IconCompatParcelizer(getdefaultnotificationchanneldescription.read);
                                        if (z5) {
                                            getdefaultnotificationchanneldescription.MediaMetadataCompat.notifyAll();
                                        }
                                        j = 0;
                                    }
                                }
                                if (j > 0) {
                                    getdefaultnotificationchanneldescription.MediaMetadataCompat.IconCompatParcelizer.serializer(j);
                                }
                                z4 = z;
                            } else {
                                DrawableTransformation.IconCompatParcelizer();
                                return;
                            }
                        } else {
                            z = z4;
                            getdefaultnotificationchanneldescription.getClass();
                            break;
                        }
                    }
                    if (z) {
                        getdeviceobjectallowlistWrite.MediaBrowserCompatMediaItem();
                    }
                }
            }
            this.read.IconCompatParcelizer(sMediaBrowserCompatMediaItem);
            return;
        }
        getContextandroid_sdk_base_releaseannotations.write("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        throw null;
    }

    public static int RemoteActionCompatParcelizer(r8lambdaooRzoLQOYBC_UxEBBKBnMvlVm7k r8lambdaoorzolqoybc_uxebbkbnmvlvm7k) {
        return (r8lambdaoorzolqoybc_uxebbkbnmvlvm7k.MediaBrowserCompatMediaItem() & 255) | ((r8lambdaoorzolqoybc_uxebbkbnmvlvm7k.MediaBrowserCompatMediaItem() & 255) << 16) | ((r8lambdaoorzolqoybc_uxebbkbnmvlvm7k.MediaBrowserCompatMediaItem() & 255) << 8);
    }

    public static int write(int i, byte b, short s) {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        getContextandroid_sdk_base_releaseannotations.write("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }
}
