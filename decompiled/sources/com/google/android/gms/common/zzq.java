package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.common.internal.zay;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.internal.location.zze;
import com.google.android.gms.internal.location.zzeg;
import com.google.android.gms.internal.location.zzei;
import com.google.android.gms.internal.location.zzek;
import com.google.android.gms.internal.location.zzem;
import com.google.android.gms.internal.location.zzh;
import com.google.android.gms.internal.location.zzl;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzom;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzoq;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.signin.internal.zaa;
import com.google.android.gms.signin.internal.zag;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import com.google.firebase.Timestamp;
import com.google.firebase.messaging.RemoteMessage;
import com.huawei.location.base.activity.entity.ClientInfo;
import com.huawei.location.base.activity.entity.MovementEvent;
import com.huawei.location.lite.common.http.response.ResponseInfo;
import com.huawei.location.lite.common.util.filedownload.DownloadFileParam;
import com.huawei.location.req.LocationRequestInfo;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import java.util.List;
import o.trackEventI;

/* JADX INFO: loaded from: classes2.dex */
public final class zzq implements Parcelable.Creator {
    public final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ zzq(int i) {
        this.IconCompatParcelizer = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        long jPlaybackStateCompat = 0;
        int iPlaybackStateCompatCustomAction = 0;
        int iPlaybackStateCompatCustomAction2 = 0;
        int iPlaybackStateCompatCustomAction3 = 0;
        int iPlaybackStateCompatCustomAction4 = 0;
        int iPlaybackStateCompatCustomAction5 = 0;
        boolean zMediaSessionCompatQueueItem = false;
        String strSerializer = null;
        Bundle bundleIconCompatParcelizer = null;
        ConnectionResult connectionResult = null;
        zay zayVar = null;
        ArrayList arrayListMediaBrowserCompatMediaItem = null;
        Intent intent = null;
        ArrayList arrayListWrite = null;
        String strSerializer2 = null;
        Bundle bundleIconCompatParcelizer2 = null;
        Status status = null;
        zzh zzhVar = null;
        String strSerializer3 = null;
        ArrayList arrayListMediaBrowserCompatMediaItem2 = null;
        switch (this.IconCompatParcelizer) {
            case 0:
                int iWrite = UrlUtils.write(parcel);
                boolean zMediaSessionCompatQueueItem2 = false;
                boolean zMediaSessionCompatQueueItem3 = false;
                boolean zMediaSessionCompatQueueItem4 = false;
                boolean zMediaSessionCompatQueueItem5 = false;
                boolean zMediaSessionCompatQueueItem6 = false;
                String strSerializer4 = null;
                IBinder iBinder = null;
                while (parcel.dataPosition() < iWrite) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 1:
                            strSerializer4 = UrlUtils.serializer(parcel, i);
                            break;
                        case 2:
                            zMediaSessionCompatQueueItem2 = UrlUtils.MediaSessionCompatQueueItem(parcel, i);
                            break;
                        case 3:
                            zMediaSessionCompatQueueItem3 = UrlUtils.MediaSessionCompatQueueItem(parcel, i);
                            break;
                        case 4:
                            iBinder = (IBinder) UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), -635127719, 635127725, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(i)});
                            break;
                        case 5:
                            zMediaSessionCompatQueueItem4 = UrlUtils.MediaSessionCompatQueueItem(parcel, i);
                            break;
                        case 6:
                            zMediaSessionCompatQueueItem5 = UrlUtils.MediaSessionCompatQueueItem(parcel, i);
                            break;
                        case 7:
                        default:
                            UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i);
                            break;
                        case '\b':
                            zMediaSessionCompatQueueItem6 = UrlUtils.MediaSessionCompatQueueItem(parcel, i);
                            break;
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite)});
                return new zzp(strSerializer4, zMediaSessionCompatQueueItem2, zMediaSessionCompatQueueItem3, iBinder, zMediaSessionCompatQueueItem4, zMediaSessionCompatQueueItem5, zMediaSessionCompatQueueItem6);
            case 1:
                int iWrite2 = UrlUtils.write(parcel);
                boolean zMediaSessionCompatQueueItem7 = false;
                while (parcel.dataPosition() < iWrite2) {
                    int i2 = parcel.readInt();
                    char c = (char) i2;
                    if (c == 1) {
                        iPlaybackStateCompatCustomAction = UrlUtils.PlaybackStateCompatCustomAction(parcel, i2);
                    } else if (c != 2) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i2);
                    } else {
                        zMediaSessionCompatQueueItem7 = UrlUtils.MediaSessionCompatQueueItem(parcel, i2);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite2)});
                return new ModuleInstallResponse(iPlaybackStateCompatCustomAction, zMediaSessionCompatQueueItem7);
            case 2:
                int iWrite3 = UrlUtils.write(parcel);
                long jPlaybackStateCompat2 = -1;
                int iPlaybackStateCompatCustomAction6 = 0;
                int iPlaybackStateCompatCustomAction7 = 0;
                boolean zMediaSessionCompatQueueItem8 = false;
                String strSerializer5 = null;
                while (parcel.dataPosition() < iWrite3) {
                    int i3 = parcel.readInt();
                    char c2 = (char) i3;
                    if (c2 == 1) {
                        zMediaSessionCompatQueueItem8 = UrlUtils.MediaSessionCompatQueueItem(parcel, i3);
                    } else if (c2 == 2) {
                        strSerializer5 = UrlUtils.serializer(parcel, i3);
                    } else if (c2 == 3) {
                        iPlaybackStateCompatCustomAction6 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i3);
                    } else if (c2 == 4) {
                        iPlaybackStateCompatCustomAction7 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i3);
                    } else if (c2 != 5) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i3);
                    } else {
                        jPlaybackStateCompat2 = UrlUtils.PlaybackStateCompat(parcel, i3);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite3)});
                return new zzr(iPlaybackStateCompatCustomAction6, iPlaybackStateCompatCustomAction7, jPlaybackStateCompat2, strSerializer5, zMediaSessionCompatQueueItem8);
            case 3:
                int iWrite4 = UrlUtils.write(parcel);
                boolean zMediaSessionCompatQueueItem9 = false;
                IBinder iBinder2 = null;
                while (parcel.dataPosition() < iWrite4) {
                    int i4 = parcel.readInt();
                    char c3 = (char) i4;
                    if (c3 == 1) {
                        strSerializer = UrlUtils.serializer(parcel, i4);
                    } else if (c3 == 2) {
                        iBinder2 = (IBinder) UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), -635127719, 635127725, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(i4)});
                    } else if (c3 == 3) {
                        zMediaSessionCompatQueueItem = UrlUtils.MediaSessionCompatQueueItem(parcel, i4);
                    } else if (c3 != 4) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i4);
                    } else {
                        zMediaSessionCompatQueueItem9 = UrlUtils.MediaSessionCompatQueueItem(parcel, i4);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite4)});
                return new zzt(strSerializer, iBinder2, zMediaSessionCompatQueueItem, zMediaSessionCompatQueueItem9);
            case 4:
                int iWrite5 = UrlUtils.write(parcel);
                long jPlaybackStateCompat3 = Long.MAX_VALUE;
                boolean zMediaSessionCompatQueueItem10 = false;
                boolean zMediaSessionCompatQueueItem11 = false;
                boolean zMediaSessionCompatQueueItem12 = false;
                boolean zMediaSessionCompatQueueItem13 = false;
                LocationRequest locationRequest = null;
                ArrayList arrayListWrite2 = null;
                while (parcel.dataPosition() < iWrite5) {
                    int i5 = parcel.readInt();
                    char c4 = (char) i5;
                    if (c4 == 1) {
                        locationRequest = (LocationRequest) UrlUtils.read(parcel, i5, LocationRequest.CREATOR);
                    } else if (c4 == 5) {
                        arrayListWrite2 = UrlUtils.write(parcel, i5, ClientIdentity.CREATOR);
                    } else if (c4 == '\b') {
                        zMediaSessionCompatQueueItem10 = UrlUtils.MediaSessionCompatQueueItem(parcel, i5);
                    } else if (c4 != '\t') {
                        switch (c4) {
                            case 11:
                                zMediaSessionCompatQueueItem12 = UrlUtils.MediaSessionCompatQueueItem(parcel, i5);
                                break;
                            case '\f':
                                zMediaSessionCompatQueueItem13 = UrlUtils.MediaSessionCompatQueueItem(parcel, i5);
                                break;
                            case '\r':
                                UrlUtils.serializer(parcel, i5);
                                break;
                            case 14:
                                jPlaybackStateCompat3 = UrlUtils.PlaybackStateCompat(parcel, i5);
                                break;
                            default:
                                UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i5);
                                break;
                        }
                    } else {
                        zMediaSessionCompatQueueItem11 = UrlUtils.MediaSessionCompatQueueItem(parcel, i5);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite5)});
                return new zzeg(locationRequest, arrayListWrite2, zMediaSessionCompatQueueItem10, zMediaSessionCompatQueueItem11, zMediaSessionCompatQueueItem12, zMediaSessionCompatQueueItem13, jPlaybackStateCompat3);
            case 5:
                int iWrite6 = UrlUtils.write(parcel);
                int iPlaybackStateCompatCustomAction8 = 1;
                zzeg zzegVar = null;
                IBinder iBinder3 = null;
                IBinder iBinder4 = null;
                PendingIntent pendingIntent = null;
                IBinder iBinder5 = null;
                String strSerializer6 = null;
                while (parcel.dataPosition() < iWrite6) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 1:
                            iPlaybackStateCompatCustomAction8 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i6);
                            break;
                        case 2:
                            zzegVar = (zzeg) UrlUtils.read(parcel, i6, zzeg.CREATOR);
                            break;
                        case 3:
                            iBinder3 = (IBinder) UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), -635127719, 635127725, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(i6)});
                            break;
                        case 4:
                            pendingIntent = (PendingIntent) UrlUtils.read(parcel, i6, PendingIntent.CREATOR);
                            break;
                        case 5:
                            iBinder4 = (IBinder) UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), -635127719, 635127725, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(i6)});
                            break;
                        case 6:
                            iBinder5 = (IBinder) UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), -635127719, 635127725, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(i6)});
                            break;
                        case 7:
                        default:
                            UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i6);
                            break;
                        case '\b':
                            strSerializer6 = UrlUtils.serializer(parcel, i6);
                            break;
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite6)});
                return new zzei(iPlaybackStateCompatCustomAction8, zzegVar, iBinder3, iBinder4, pendingIntent, iBinder5, strSerializer6);
            case 6:
                int iWrite7 = UrlUtils.write(parcel);
                int iPlaybackStateCompatCustomAction9 = -1;
                float fRatingCompat = 0.0f;
                double dMediaMetadataCompat = 0.0d;
                double dMediaMetadataCompat2 = 0.0d;
                long jPlaybackStateCompat4 = 0;
                int iPlaybackStateCompatCustomAction10 = 0;
                short s = 0;
                int iPlaybackStateCompatCustomAction11 = 0;
                String strSerializer7 = null;
                while (parcel.dataPosition() < iWrite7) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 1:
                            strSerializer7 = UrlUtils.serializer(parcel, i7);
                            break;
                        case 2:
                            jPlaybackStateCompat4 = UrlUtils.PlaybackStateCompat(parcel, i7);
                            break;
                        case 3:
                            UrlUtils.read(parcel, i7, 4);
                            s = (short) parcel.readInt();
                            break;
                        case 4:
                            dMediaMetadataCompat = UrlUtils.MediaMetadataCompat(parcel, i7);
                            break;
                        case 5:
                            dMediaMetadataCompat2 = UrlUtils.MediaMetadataCompat(parcel, i7);
                            break;
                        case 6:
                            fRatingCompat = UrlUtils.RatingCompat(parcel, i7);
                            break;
                        case 7:
                            iPlaybackStateCompatCustomAction10 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i7);
                            break;
                        case '\b':
                            iPlaybackStateCompatCustomAction11 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i7);
                            break;
                        case '\t':
                            iPlaybackStateCompatCustomAction9 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i7);
                            break;
                        default:
                            UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i7);
                            break;
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite7)});
                return new zzek(strSerializer7, iPlaybackStateCompatCustomAction10, s, dMediaMetadataCompat, dMediaMetadataCompat2, fRatingCompat, jPlaybackStateCompat4, iPlaybackStateCompatCustomAction11, iPlaybackStateCompatCustomAction9);
            case 7:
                int iWrite8 = UrlUtils.write(parcel);
                String strSerializer8 = "";
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < iWrite8) {
                    int i8 = parcel.readInt();
                    char c5 = (char) i8;
                    if (c5 == 1) {
                        arrayListMediaBrowserCompatMediaItem2 = UrlUtils.MediaBrowserCompatMediaItem(parcel, i8);
                    } else if (c5 == 2) {
                        pendingIntent2 = (PendingIntent) UrlUtils.read(parcel, i8, PendingIntent.CREATOR);
                    } else if (c5 != 3) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i8);
                    } else {
                        strSerializer8 = UrlUtils.serializer(parcel, i8);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite8)});
                return new zzem(arrayListMediaBrowserCompatMediaItem2, pendingIntent2, strSerializer8);
            case 8:
                int iWrite9 = UrlUtils.write(parcel);
                int iPlaybackStateCompatCustomAction12 = 0;
                String strSerializer9 = null;
                String strSerializer10 = null;
                String strSerializer11 = null;
                ArrayList arrayListWrite3 = null;
                zze zzeVar = null;
                while (parcel.dataPosition() < iWrite9) {
                    int i9 = parcel.readInt();
                    char c6 = (char) i9;
                    if (c6 == 1) {
                        iPlaybackStateCompatCustomAction12 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i9);
                    } else if (c6 == 3) {
                        strSerializer9 = UrlUtils.serializer(parcel, i9);
                    } else if (c6 == 4) {
                        strSerializer10 = UrlUtils.serializer(parcel, i9);
                    } else if (c6 == 6) {
                        strSerializer11 = UrlUtils.serializer(parcel, i9);
                    } else if (c6 == 7) {
                        zzeVar = (zze) UrlUtils.read(parcel, i9, zze.CREATOR);
                    } else if (c6 != '\b') {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i9);
                    } else {
                        arrayListWrite3 = UrlUtils.write(parcel, i9, Feature.CREATOR);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite9)});
                return new zze(iPlaybackStateCompatCustomAction12, strSerializer9, strSerializer10, strSerializer11, arrayListWrite3, zzeVar);
            case 9:
                int iWrite10 = UrlUtils.write(parcel);
                DeviceOrientationRequest deviceOrientationRequest = zzh.serializer;
                List listWrite = zzh.write;
                while (parcel.dataPosition() < iWrite10) {
                    int i10 = parcel.readInt();
                    char c7 = (char) i10;
                    if (c7 == 1) {
                        deviceOrientationRequest = (DeviceOrientationRequest) UrlUtils.read(parcel, i10, DeviceOrientationRequest.CREATOR);
                    } else if (c7 == 2) {
                        listWrite = UrlUtils.write(parcel, i10, ClientIdentity.CREATOR);
                    } else if (c7 != 3) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i10);
                    } else {
                        strSerializer3 = UrlUtils.serializer(parcel, i10);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite10)});
                return new zzh(deviceOrientationRequest, listWrite, strSerializer3);
            case 10:
                int iWrite11 = UrlUtils.write(parcel);
                int iPlaybackStateCompatCustomAction13 = 1;
                IBinder iBinder6 = null;
                IBinder iBinder7 = null;
                while (parcel.dataPosition() < iWrite11) {
                    int i11 = parcel.readInt();
                    char c8 = (char) i11;
                    if (c8 == 1) {
                        iPlaybackStateCompatCustomAction13 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i11);
                    } else if (c8 == 2) {
                        zzhVar = (zzh) UrlUtils.read(parcel, i11, zzh.CREATOR);
                    } else if (c8 == 3) {
                        iBinder6 = (IBinder) UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), -635127719, 635127725, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(i11)});
                    } else if (c8 != 4) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i11);
                    } else {
                        iBinder7 = (IBinder) UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), -635127719, 635127725, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(i11)});
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite11)});
                return new com.google.android.gms.internal.location.zzj(iPlaybackStateCompatCustomAction13, zzhVar, iBinder6, iBinder7);
            case 11:
                int iWrite12 = UrlUtils.write(parcel);
                while (parcel.dataPosition() < iWrite12) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 1) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i12);
                    } else {
                        status = (Status) UrlUtils.read(parcel, i12, Status.CREATOR);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite12)});
                return new zzl(status);
            case 12:
                int iWrite13 = UrlUtils.write(parcel);
                long jPlaybackStateCompat5 = 0;
                long jPlaybackStateCompat6 = 0;
                int iPlaybackStateCompatCustomAction14 = 0;
                while (parcel.dataPosition() < iWrite13) {
                    int i13 = parcel.readInt();
                    char c9 = (char) i13;
                    if (c9 == 1) {
                        jPlaybackStateCompat5 = UrlUtils.PlaybackStateCompat(parcel, i13);
                    } else if (c9 == 2) {
                        iPlaybackStateCompatCustomAction14 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i13);
                    } else if (c9 != 3) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i13);
                    } else {
                        jPlaybackStateCompat6 = UrlUtils.PlaybackStateCompat(parcel, i13);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite13)});
                return new zzaf(jPlaybackStateCompat5, jPlaybackStateCompat6, iPlaybackStateCompatCustomAction14);
            case 13:
                int iWrite14 = UrlUtils.write(parcel);
                long jPlaybackStateCompat7 = 0;
                long jPlaybackStateCompat8 = 0;
                long jPlaybackStateCompat9 = 0;
                boolean zMediaSessionCompatQueueItem14 = false;
                String strSerializer12 = null;
                String strSerializer13 = null;
                zzpl zzplVar = null;
                String strSerializer14 = null;
                zzbg zzbgVar = null;
                zzbg zzbgVar2 = null;
                zzbg zzbgVar3 = null;
                while (parcel.dataPosition() < iWrite14) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 2:
                            strSerializer12 = UrlUtils.serializer(parcel, i14);
                            break;
                        case 3:
                            strSerializer13 = UrlUtils.serializer(parcel, i14);
                            break;
                        case 4:
                            zzplVar = (zzpl) UrlUtils.read(parcel, i14, zzpl.CREATOR);
                            break;
                        case 5:
                            jPlaybackStateCompat7 = UrlUtils.PlaybackStateCompat(parcel, i14);
                            break;
                        case 6:
                            zMediaSessionCompatQueueItem14 = UrlUtils.MediaSessionCompatQueueItem(parcel, i14);
                            break;
                        case 7:
                            strSerializer14 = UrlUtils.serializer(parcel, i14);
                            break;
                        case '\b':
                            zzbgVar = (zzbg) UrlUtils.read(parcel, i14, zzbg.CREATOR);
                            break;
                        case '\t':
                            jPlaybackStateCompat8 = UrlUtils.PlaybackStateCompat(parcel, i14);
                            break;
                        case '\n':
                            zzbgVar2 = (zzbg) UrlUtils.read(parcel, i14, zzbg.CREATOR);
                            break;
                        case 11:
                            jPlaybackStateCompat9 = UrlUtils.PlaybackStateCompat(parcel, i14);
                            break;
                        case '\f':
                            zzbgVar3 = (zzbg) UrlUtils.read(parcel, i14, zzbg.CREATOR);
                            break;
                        default:
                            UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i14);
                            break;
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite14)});
                return new zzah(strSerializer12, strSerializer13, zzplVar, jPlaybackStateCompat7, zMediaSessionCompatQueueItem14, strSerializer14, zzbgVar, jPlaybackStateCompat8, zzbgVar2, jPlaybackStateCompat9, zzbgVar3);
            case 14:
                int iWrite15 = UrlUtils.write(parcel);
                while (parcel.dataPosition() < iWrite15) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 1) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i15);
                    } else {
                        bundleIconCompatParcelizer2 = UrlUtils.IconCompatParcelizer(parcel, i15);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite15)});
                return new zzao(bundleIconCompatParcelizer2);
            case 15:
                int iWrite16 = UrlUtils.write(parcel);
                while (parcel.dataPosition() < iWrite16) {
                    int i16 = parcel.readInt();
                    char c10 = (char) i16;
                    if (c10 == 1) {
                        strSerializer2 = UrlUtils.serializer(parcel, i16);
                    } else if (c10 == 2) {
                        jPlaybackStateCompat = UrlUtils.PlaybackStateCompat(parcel, i16);
                    } else if (c10 != 3) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i16);
                    } else {
                        iPlaybackStateCompatCustomAction5 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i16);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite16)});
                return new zzoh(strSerializer2, jPlaybackStateCompat, iPlaybackStateCompatCustomAction5);
            case 16:
                int iWrite17 = UrlUtils.write(parcel);
                long jPlaybackStateCompat10 = 0;
                long jPlaybackStateCompat11 = 0;
                int iPlaybackStateCompatCustomAction15 = 0;
                byte[] bArrRemoteActionCompatParcelizer = null;
                String strSerializer15 = null;
                Bundle bundleIconCompatParcelizer3 = null;
                String strSerializer16 = null;
                while (parcel.dataPosition() < iWrite17) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 1:
                            jPlaybackStateCompat10 = UrlUtils.PlaybackStateCompat(parcel, i17);
                            break;
                        case 2:
                            bArrRemoteActionCompatParcelizer = UrlUtils.RemoteActionCompatParcelizer(parcel, i17);
                            break;
                        case 3:
                            strSerializer15 = UrlUtils.serializer(parcel, i17);
                            break;
                        case 4:
                            bundleIconCompatParcelizer3 = UrlUtils.IconCompatParcelizer(parcel, i17);
                            break;
                        case 5:
                            iPlaybackStateCompatCustomAction15 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i17);
                            break;
                        case 6:
                            jPlaybackStateCompat11 = UrlUtils.PlaybackStateCompat(parcel, i17);
                            break;
                        case 7:
                            strSerializer16 = UrlUtils.serializer(parcel, i17);
                            break;
                        default:
                            UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i17);
                            break;
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite17)});
                return new zzom(jPlaybackStateCompat10, bArrRemoteActionCompatParcelizer, strSerializer15, bundleIconCompatParcelizer3, iPlaybackStateCompatCustomAction15, jPlaybackStateCompat11, strSerializer16);
            case 17:
                int iWrite18 = UrlUtils.write(parcel);
                while (true) {
                    ArrayList arrayList = null;
                    while (true) {
                        if (parcel.dataPosition() < iWrite18) {
                            int i18 = parcel.readInt();
                            if (((char) i18) != 1) {
                                UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i18);
                            } else {
                                int iParcelableVolumeInfo = UrlUtils.ParcelableVolumeInfo(parcel, i18);
                                int iDataPosition = parcel.dataPosition();
                                if (iParcelableVolumeInfo == 0) {
                                }
                                ArrayList arrayList2 = new ArrayList();
                                int i19 = parcel.readInt();
                                for (int i20 = 0; i20 < i19; i20++) {
                                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                                }
                                parcel.setDataPosition(iDataPosition + iParcelableVolumeInfo);
                                arrayList = arrayList2;
                            }
                        } else {
                            UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite18)});
                            return new zzoo(arrayList);
                        }
                        break;
                    }
                }
                break;
            case 18:
                int iWrite19 = UrlUtils.write(parcel);
                while (parcel.dataPosition() < iWrite19) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 1) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i21);
                    } else {
                        arrayListWrite = UrlUtils.write(parcel, i21, zzom.CREATOR);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite19)});
                return new zzoq(arrayListWrite);
            case 19:
                int iWrite20 = UrlUtils.write(parcel);
                int iPlaybackStateCompatCustomAction16 = 0;
                while (parcel.dataPosition() < iWrite20) {
                    int i22 = parcel.readInt();
                    char c11 = (char) i22;
                    if (c11 == 1) {
                        iPlaybackStateCompatCustomAction4 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i22);
                    } else if (c11 == 2) {
                        iPlaybackStateCompatCustomAction16 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i22);
                    } else if (c11 != 3) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i22);
                    } else {
                        intent = (Intent) UrlUtils.read(parcel, i22, Intent.CREATOR);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite20)});
                return new zaa(iPlaybackStateCompatCustomAction4, iPlaybackStateCompatCustomAction16, intent);
            case 20:
                int iWrite21 = UrlUtils.write(parcel);
                String strSerializer17 = null;
                while (parcel.dataPosition() < iWrite21) {
                    int i23 = parcel.readInt();
                    char c12 = (char) i23;
                    if (c12 == 1) {
                        arrayListMediaBrowserCompatMediaItem = UrlUtils.MediaBrowserCompatMediaItem(parcel, i23);
                    } else if (c12 != 2) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i23);
                    } else {
                        strSerializer17 = UrlUtils.serializer(parcel, i23);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite21)});
                return new zag(arrayListMediaBrowserCompatMediaItem, strSerializer17);
            case 21:
                int iWrite22 = UrlUtils.write(parcel);
                while (parcel.dataPosition() < iWrite22) {
                    int i24 = parcel.readInt();
                    char c13 = (char) i24;
                    if (c13 == 1) {
                        iPlaybackStateCompatCustomAction3 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i24);
                    } else if (c13 != 2) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i24);
                    } else {
                        zayVar = (zay) UrlUtils.read(parcel, i24, zay.CREATOR);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite22)});
                return new zai(iPlaybackStateCompatCustomAction3, zayVar);
            case 22:
                int iWrite23 = UrlUtils.write(parcel);
                zaaa zaaaVar = null;
                while (parcel.dataPosition() < iWrite23) {
                    int i25 = parcel.readInt();
                    char c14 = (char) i25;
                    if (c14 == 1) {
                        iPlaybackStateCompatCustomAction2 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i25);
                    } else if (c14 == 2) {
                        connectionResult = (ConnectionResult) UrlUtils.read(parcel, i25, ConnectionResult.CREATOR);
                    } else if (c14 != 3) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i25);
                    } else {
                        zaaaVar = (zaaa) UrlUtils.read(parcel, i25, zaaa.CREATOR);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite23)});
                return new zak(iPlaybackStateCompatCustomAction2, connectionResult, zaaaVar);
            case 23:
                parcel.getClass();
                return new Timestamp(parcel.readLong(), parcel.readInt());
            case 24:
                int iWrite24 = UrlUtils.write(parcel);
                while (parcel.dataPosition() < iWrite24) {
                    int i26 = parcel.readInt();
                    if (((char) i26) != 2) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i26);
                    } else {
                        bundleIconCompatParcelizer = UrlUtils.IconCompatParcelizer(parcel, i26);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite24)});
                return new RemoteMessage(bundleIconCompatParcelizer);
            case 25:
                return new ClientInfo(parcel);
            case 26:
                return new MovementEvent(parcel.readString(), parcel.readInt());
            case 27:
                return new ResponseInfo(parcel);
            case 28:
                return new DownloadFileParam(parcel);
            default:
                return new LocationRequestInfo(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.IconCompatParcelizer) {
            case 0:
                return new zzp[i];
            case 1:
                return new ModuleInstallResponse[i];
            case 2:
                return new zzr[i];
            case 3:
                return new zzt[i];
            case 4:
                return new zzeg[i];
            case 5:
                return new zzei[i];
            case 6:
                return new zzek[i];
            case 7:
                return new zzem[i];
            case 8:
                return new zze[i];
            case 9:
                return new zzh[i];
            case 10:
                return new com.google.android.gms.internal.location.zzj[i];
            case 11:
                return new zzl[i];
            case 12:
                return new zzaf[i];
            case 13:
                return new zzah[i];
            case 14:
                return new zzao[i];
            case 15:
                return new zzoh[i];
            case 16:
                return new zzom[i];
            case 17:
                return new zzoo[i];
            case 18:
                return new zzoq[i];
            case 19:
                return new zaa[i];
            case 20:
                return new zag[i];
            case 21:
                return new zai[i];
            case 22:
                return new zak[i];
            case 23:
                return new Timestamp[i];
            case 24:
                return new RemoteMessage[i];
            case 25:
                return new ClientInfo[i];
            case 26:
                return new MovementEvent[i];
            case 27:
                return new ResponseInfo[i];
            case 28:
                return new DownloadFileParam[i];
            default:
                return new LocationRequestInfo[i];
        }
    }
}
