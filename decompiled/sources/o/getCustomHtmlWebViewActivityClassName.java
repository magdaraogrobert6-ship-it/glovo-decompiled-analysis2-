package o;

import com.sentiance.okhttp3.internal.http2.ErrorCode;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class getCustomHtmlWebViewActivityClassName extends r8lambda0S3kvX2wuurB_sOm2dk25CPetL8 {
    public final Object read;
    public final /* synthetic */ int serializer = 1;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getCustomHtmlWebViewActivityClassName(getGenericEnumSetFromStringSet getgenericenumsetfromstringset, getDefaultNotificationAccentColor getdefaultnotificationaccentcolor) {
        super("OkHttp %s", getgenericenumsetfromstringset.ParcelableVolumeInfo);
        this.write = getgenericenumsetfromstringset;
        this.read = getdefaultnotificationaccentcolor;
    }

    @Override // o.r8lambda0S3kvX2wuurB_sOm2dk25CPetL8
    public final void RemoteActionCompatParcelizer() throws Throwable {
        getDeviceObjectAllowlist[] getdeviceobjectallowlistArr;
        long j;
        int i = this.serializer;
        ErrorCode errorCode = null;
        if (i != 0) {
            if (i == 1) {
                getDeviceObjectAllowlist getdeviceobjectallowlist = (getDeviceObjectAllowlist) this.read;
                getGenericEnumSetFromStringSet getgenericenumsetfromstringset = (getGenericEnumSetFromStringSet) ((getCustomHtmlWebViewActivityClassName) this.write).write;
                try {
                    getgenericenumsetfromstringset.MediaSessionCompatQueueItem.write(getdeviceobjectallowlist);
                    return;
                } catch (IOException e) {
                    getLoggerInitialLogLevel.RatingCompat.read(4, "Http2Connection.Listener failure for " + getgenericenumsetfromstringset.ParcelableVolumeInfo, e);
                    try {
                        getdeviceobjectallowlist.write(ErrorCode.PROTOCOL_ERROR);
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            }
            getCustomHtmlWebViewActivityClassName getcustomhtmlwebviewactivityclassname = (getCustomHtmlWebViewActivityClassName) this.write;
            onFling onfling = (onFling) this.read;
            synchronized (((getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write).write) {
                synchronized (((getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write)) {
                    int iIconCompatParcelizer = ((getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write).serializer.IconCompatParcelizer();
                    onFling onfling2 = ((getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write).serializer;
                    onfling2.getClass();
                    for (int i2 = 0; i2 < 10; i2++) {
                        if ((onfling.read & (1 << i2)) != 0) {
                            onfling2.IconCompatParcelizer(i2, onfling.write[i2]);
                        }
                    }
                    int iIconCompatParcelizer2 = ((getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write).serializer.IconCompatParcelizer();
                    getdeviceobjectallowlistArr = null;
                    if (iIconCompatParcelizer2 == -1 || iIconCompatParcelizer2 == iIconCompatParcelizer) {
                        j = 0;
                    } else {
                        j = iIconCompatParcelizer2 - iIconCompatParcelizer;
                        if (!((getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write).MediaMetadataCompat.isEmpty()) {
                            getdeviceobjectallowlistArr = (getDeviceObjectAllowlist[]) ((getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write).MediaMetadataCompat.values().toArray(new getDeviceObjectAllowlist[((getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write).MediaMetadataCompat.size()]);
                        }
                    }
                }
                try {
                    getGenericEnumSetFromStringSet getgenericenumsetfromstringset2 = (getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write;
                    getgenericenumsetfromstringset2.write.write(getgenericenumsetfromstringset2.serializer);
                } catch (IOException unused2) {
                    ((getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write).RemoteActionCompatParcelizer();
                }
            }
            if (getdeviceobjectallowlistArr != null) {
                for (getDeviceObjectAllowlist getdeviceobjectallowlist2 : getdeviceobjectallowlistArr) {
                    synchronized (getdeviceobjectallowlist2) {
                        getdeviceobjectallowlist2.write += j;
                        if (j > 0) {
                            getdeviceobjectallowlist2.notifyAll();
                        }
                    }
                }
            }
            getGenericEnumSetFromStringSet.IconCompatParcelizer.execute(new getServerTargetannotations(getcustomhtmlwebviewactivityclassname, new Object[]{((getGenericEnumSetFromStringSet) getcustomhtmlwebviewactivityclassname.write).ParcelableVolumeInfo}));
            return;
        }
        getGenericEnumSetFromStringSet getgenericenumsetfromstringset3 = (getGenericEnumSetFromStringSet) this.write;
        getDefaultNotificationAccentColor getdefaultnotificationaccentcolor = (getDefaultNotificationAccentColor) this.read;
        ErrorCode errorCode2 = ErrorCode.INTERNAL_ERROR;
        try {
            try {
                try {
                    getdefaultnotificationaccentcolor.write(this);
                    while (getdefaultnotificationaccentcolor.read(false, this)) {
                    }
                    errorCode = ErrorCode.NO_ERROR;
                    try {
                        errorCode2 = ErrorCode.CANCEL;
                        getgenericenumsetfromstringset3.serializer(errorCode, errorCode2);
                    } catch (IOException unused3) {
                        errorCode = ErrorCode.PROTOCOL_ERROR;
                        getgenericenumsetfromstringset3.serializer(errorCode, errorCode);
                    }
                } catch (IOException unused4) {
                }
            } catch (IOException unused5) {
            } catch (Throwable th) {
                th = th;
                errorCode = errorCode2;
                try {
                    getgenericenumsetfromstringset3.serializer(errorCode, errorCode2);
                } catch (IOException unused6) {
                }
                r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.serializer(getdefaultnotificationaccentcolor);
                throw th;
            }
            r8lambdaNPXAuu7h2_IDXjHh7d85MaN3p08.serializer(getdefaultnotificationaccentcolor);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getCustomHtmlWebViewActivityClassName(getCustomHtmlWebViewActivityClassName getcustomhtmlwebviewactivityclassname, Object[] objArr, getDeviceObjectAllowlist getdeviceobjectallowlist) {
        super("OkHttp %s stream %d", objArr);
        this.write = getcustomhtmlwebviewactivityclassname;
        this.read = getdeviceobjectallowlist;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getCustomHtmlWebViewActivityClassName(getCustomHtmlWebViewActivityClassName getcustomhtmlwebviewactivityclassname, Object[] objArr, onFling onfling) {
        super("OkHttp %s ACK Settings", objArr);
        this.write = getcustomhtmlwebviewactivityclassname;
        this.read = onfling;
    }
}
