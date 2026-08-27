package com.google.android.gms.common;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.internal.location.zzee;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.firebase.perf.metrics.Counter;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.Timer;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import com.mapbox.maps.ImageHolder;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.plugin.LocationPuck;
import com.mapbox.maps.plugin.LocationPuck2D;
import com.mapbox.maps.plugin.PuckBearing;
import com.mapbox.maps.plugin.ScrollMode;
import com.mapbox.maps.plugin.attribution.generated.AttributionSettings;
import com.mapbox.maps.plugin.compass.generated.CompassSettings;
import com.mapbox.maps.plugin.gestures.generated.GesturesSettings;
import com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettings;
import com.roadrunner.delivery.state.TrackingEvent;
import com.roadrunner.permission.api.model.PermissionModel;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import o.r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08;
import o.trackEventI;

/* JADX INFO: loaded from: classes2.dex */
public final class zza implements Parcelable.Creator {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ int serializer;

    public /* synthetic */ zza(int i) {
        this.serializer = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        switch (this.serializer) {
            case 0:
                return new ConnectionResult[i];
            case 1:
                return new Status[i];
            case 2:
                RootTelemetryConfiguration[] rootTelemetryConfigurationArr = new RootTelemetryConfiguration[i];
                int i3 = IconCompatParcelizer + 29;
                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return rootTelemetryConfigurationArr;
            case 3:
                return new com.google.android.gms.common.internal.zzj[i];
            case 4:
                return new GetServiceRequest[i];
            case 5:
                return new Feature[i];
            case 6:
                return new zzee[i];
            case 7:
                return new zzdd[i];
            case 8:
                return new zzdf[i];
            case 9:
                return new zzbe[i];
            case 10:
                return new zzbg[i];
            case 11:
                return new zzpl[i];
            case 12:
                return new com.google.android.gms.measurement.internal.zzr[i];
            case 13:
                return new Counter[i];
            case 14:
                return new Trace[i];
            case 15:
                return new PerfSession[i];
            case 16:
                return new Timer[i];
            case 17:
                return new LocationPuck2D[i];
            case 18:
                return new AttributionSettings[i];
            case 19:
                CompassSettings[] compassSettingsArr = new CompassSettings[i];
                int i5 = RemoteActionCompatParcelizer + 109;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 9 / 0;
                }
                return compassSettingsArr;
            case 20:
                return new GesturesSettings[i];
            case 21:
                return new LocationComponentSettings[i];
            case 22:
                return new TrackingEvent[i];
            default:
                return new PermissionModel[i];
        }
    }

    public static void write(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 79;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = SQLite.read(20293, parcel);
        int i6 = getServiceRequest.read;
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(i6);
        int i7 = getServiceRequest.serializer;
        SQLite.RemoteActionCompatParcelizer(parcel, 2, 4);
        parcel.writeInt(i7);
        int i8 = getServiceRequest.IconCompatParcelizer;
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 4);
        parcel.writeInt(i8);
        SQLite.serializer(parcel, 4, getServiceRequest.MediaDescriptionCompat);
        SQLite.write(parcel, 5, getServiceRequest.RatingCompat);
        SQLite.serializer(parcel, 6, getServiceRequest.MediaSessionCompatQueueItem, i);
        SQLite.IconCompatParcelizer(parcel, 7, getServiceRequest.MediaMetadataCompat);
        SQLite.RemoteActionCompatParcelizer(parcel, 8, getServiceRequest.MediaBrowserCompatMediaItem, i);
        SQLite.serializer(parcel, 10, getServiceRequest.MediaSessionCompatResultReceiverWrapper, i);
        SQLite.serializer(parcel, 11, getServiceRequest.PlaybackStateCompatCustomAction, i);
        boolean z = getServiceRequest.MediaSessionCompatToken;
        SQLite.RemoteActionCompatParcelizer(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i9 = getServiceRequest.PlaybackStateCompat;
        SQLite.RemoteActionCompatParcelizer(parcel, 13, 4);
        parcel.writeInt(i9);
        boolean z2 = getServiceRequest.ParcelableVolumeInfo;
        SQLite.RemoteActionCompatParcelizer(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        SQLite.serializer(parcel, 15, getServiceRequest.ComponentActivity);
        SQLite.serializer(i5, parcel);
        int i10 = RemoteActionCompatParcelizer + 87;
        IconCompatParcelizer = i10 % Fields.SpotShadowColor;
        int i11 = i10 % 2;
    }

    public static void IconCompatParcelizer(zzbg zzbgVar, Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 21;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = zzbgVar.IconCompatParcelizer;
        int i5 = SQLite.read(20293, parcel);
        SQLite.serializer(parcel, 2, str);
        SQLite.RemoteActionCompatParcelizer(parcel, 3, zzbgVar.read, i);
        SQLite.serializer(parcel, 4, zzbgVar.write);
        long j = zzbgVar.serializer;
        SQLite.RemoteActionCompatParcelizer(parcel, 5, 8);
        parcel.writeLong(j);
        SQLite.serializer(i5, parcel);
        int i6 = RemoteActionCompatParcelizer + 81;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public static void write(zzpl zzplVar, Parcel parcel) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 43;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = zzplVar.read;
        int i5 = SQLite.read(20293, parcel);
        SQLite.RemoteActionCompatParcelizer(parcel, 1, 4);
        parcel.writeInt(i4);
        SQLite.serializer(parcel, 2, zzplVar.write);
        long j = zzplVar.IconCompatParcelizer;
        SQLite.RemoteActionCompatParcelizer(parcel, 3, 8);
        parcel.writeLong(j);
        Long l = zzplVar.RemoteActionCompatParcelizer;
        if (l != null) {
            SQLite.RemoteActionCompatParcelizer(parcel, 4, 8);
            parcel.writeLong(l.longValue());
        }
        SQLite.serializer(parcel, 6, zzplVar.serializer);
        SQLite.serializer(parcel, 7, zzplVar.MediaBrowserCompatMediaItem);
        Double d = zzplVar.MediaMetadataCompat;
        if (d != null) {
            SQLite.RemoteActionCompatParcelizer(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
            int i6 = RemoteActionCompatParcelizer + 69;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        SQLite.serializer(i5, parcel);
        int i8 = IconCompatParcelizer + 125;
        RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:294:0x06b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:296:0x06b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:531:0x052d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:532:0x0528 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:533:0x0524 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:534:0x0522 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:582:0x06f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:583:0x06cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:584:0x06b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:585:0x06b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:588:0x06c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:589:0x06bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:590:0x06b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:591:0x06a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:592:0x069d A[SYNTHETIC] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        char c;
        int i2;
        int i3;
        boolean z;
        int i4 = 2 % 2;
        Bundle bundleIconCompatParcelizer = null;
        LinkedHashMap linkedHashMap = null;
        Bundle bundleIconCompatParcelizer2 = null;
        String strSerializer = null;
        int iPlaybackStateCompatCustomAction = 0;
        switch (this.serializer) {
            case 0:
                int iWrite = UrlUtils.write(parcel);
                PendingIntent pendingIntent = null;
                String strSerializer2 = null;
                Integer numValueOf = null;
                int iPlaybackStateCompatCustomAction2 = 0;
                int iPlaybackStateCompatCustomAction3 = 0;
                while (parcel.dataPosition() < iWrite) {
                    int i5 = IconCompatParcelizer + 109;
                    RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    int i7 = parcel.readInt();
                    char c2 = (char) i7;
                    if (c2 == 1) {
                        iPlaybackStateCompatCustomAction2 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i7);
                    } else if (c2 == 2) {
                        iPlaybackStateCompatCustomAction3 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i7);
                    } else if (c2 == 3) {
                        pendingIntent = (PendingIntent) UrlUtils.read(parcel, i7, PendingIntent.CREATOR);
                    } else if (c2 == 4) {
                        strSerializer2 = UrlUtils.serializer(parcel, i7);
                    } else if (c2 != 5) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i7);
                    } else {
                        int iParcelableVolumeInfo = UrlUtils.ParcelableVolumeInfo(parcel, i7);
                        if (iParcelableVolumeInfo == 0) {
                            numValueOf = null;
                        } else {
                            UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 155175255, -155175253, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iParcelableVolumeInfo), 4});
                            numValueOf = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite)});
                return new ConnectionResult(iPlaybackStateCompatCustomAction2, iPlaybackStateCompatCustomAction3, pendingIntent, strSerializer2, numValueOf);
            case 1:
                int iWrite2 = UrlUtils.write(parcel);
                String strSerializer3 = null;
                PendingIntent pendingIntent2 = null;
                ConnectionResult connectionResult = null;
                while (parcel.dataPosition() < iWrite2) {
                    int i8 = parcel.readInt();
                    char c3 = (char) i8;
                    if (c3 == 1) {
                        iPlaybackStateCompatCustomAction = UrlUtils.PlaybackStateCompatCustomAction(parcel, i8);
                    } else if (c3 == 2) {
                        strSerializer3 = UrlUtils.serializer(parcel, i8);
                    } else if (c3 == 3) {
                        pendingIntent2 = (PendingIntent) UrlUtils.read(parcel, i8, PendingIntent.CREATOR);
                    } else if (c3 == 4) {
                        connectionResult = (ConnectionResult) UrlUtils.read(parcel, i8, ConnectionResult.CREATOR);
                    } else {
                        int i9 = RemoteActionCompatParcelizer + 125;
                        IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                        if (i9 % 2 == 0) {
                            UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i8);
                        } else {
                            UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i8);
                            bundleIconCompatParcelizer.hashCode();
                            throw null;
                        }
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite2)});
                return new Status(iPlaybackStateCompatCustomAction, strSerializer3, pendingIntent2, connectionResult);
            case 2:
                int iWrite3 = UrlUtils.write(parcel);
                boolean zMediaSessionCompatQueueItem = false;
                int iPlaybackStateCompatCustomAction4 = 0;
                boolean zMediaSessionCompatQueueItem2 = false;
                int iPlaybackStateCompatCustomAction5 = 0;
                int iPlaybackStateCompatCustomAction6 = 0;
                while (parcel.dataPosition() < iWrite3) {
                    int i10 = parcel.readInt();
                    char c4 = (char) i10;
                    if (c4 == 1) {
                        iPlaybackStateCompatCustomAction4 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i10);
                    } else if (c4 == 2) {
                        zMediaSessionCompatQueueItem = UrlUtils.MediaSessionCompatQueueItem(parcel, i10);
                    } else if (c4 == 3) {
                        zMediaSessionCompatQueueItem2 = UrlUtils.MediaSessionCompatQueueItem(parcel, i10);
                    } else if (c4 == 4) {
                        iPlaybackStateCompatCustomAction5 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i10);
                    } else if (c4 != 5) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i10);
                    } else {
                        iPlaybackStateCompatCustomAction6 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i10);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite3)});
                return new RootTelemetryConfiguration(zMediaSessionCompatQueueItem, iPlaybackStateCompatCustomAction4, zMediaSessionCompatQueueItem2, iPlaybackStateCompatCustomAction5, iPlaybackStateCompatCustomAction6);
            case 3:
                int iWrite4 = UrlUtils.write(parcel);
                Feature[] featureArr = null;
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
                while (parcel.dataPosition() < iWrite4) {
                    int i11 = parcel.readInt();
                    char c5 = (char) i11;
                    if (c5 == 1) {
                        bundleIconCompatParcelizer = UrlUtils.IconCompatParcelizer(parcel, i11);
                    } else if (c5 == 2) {
                        featureArr = (Feature[]) UrlUtils.serializer(parcel, i11, Feature.CREATOR);
                    } else if (c5 == 3) {
                        iPlaybackStateCompatCustomAction = UrlUtils.PlaybackStateCompatCustomAction(parcel, i11);
                    } else if (c5 != 4) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i11);
                    } else {
                        connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) UrlUtils.read(parcel, i11, ConnectionTelemetryConfiguration.CREATOR);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite4)});
                com.google.android.gms.common.internal.zzj zzjVar = new com.google.android.gms.common.internal.zzj();
                zzjVar.RemoteActionCompatParcelizer = bundleIconCompatParcelizer;
                zzjVar.write = featureArr;
                zzjVar.read = iPlaybackStateCompatCustomAction;
                zzjVar.serializer = connectionTelemetryConfiguration;
                return zzjVar;
            case 4:
                int iWrite5 = UrlUtils.write(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = GetServiceRequest.write;
                Feature[] featureArr2 = GetServiceRequest.RemoteActionCompatParcelizer;
                Feature[] featureArr3 = featureArr2;
                String strSerializer4 = null;
                IBinder iBinder = null;
                Account account = null;
                String strSerializer5 = null;
                int iPlaybackStateCompatCustomAction7 = 0;
                int iPlaybackStateCompatCustomAction8 = 0;
                int iPlaybackStateCompatCustomAction9 = 0;
                boolean zMediaSessionCompatQueueItem3 = false;
                int iPlaybackStateCompatCustomAction10 = 0;
                boolean zMediaSessionCompatQueueItem4 = false;
                while (parcel.dataPosition() < iWrite5) {
                    int i12 = RemoteActionCompatParcelizer + 99;
                    IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                    if (i12 % 2 == 0) {
                        int i13 = parcel.readInt();
                        switch ((char) i13) {
                            case 1:
                                iPlaybackStateCompatCustomAction7 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i13);
                                break;
                            case 2:
                                iPlaybackStateCompatCustomAction8 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i13);
                                break;
                            case 3:
                                iPlaybackStateCompatCustomAction9 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i13);
                                break;
                            case 4:
                                strSerializer4 = UrlUtils.serializer(parcel, i13);
                                break;
                            case 5:
                                iBinder = (IBinder) UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), -635127719, 635127725, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(i13)});
                                break;
                            case 6:
                                scopeArr = (Scope[]) UrlUtils.serializer(parcel, i13, Scope.CREATOR);
                                break;
                            case 7:
                                bundle = UrlUtils.IconCompatParcelizer(parcel, i13);
                                break;
                            case '\b':
                                account = (Account) UrlUtils.read(parcel, i13, Account.CREATOR);
                                break;
                            case '\t':
                            default:
                                UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i13);
                                break;
                            case '\n':
                                featureArr2 = (Feature[]) UrlUtils.serializer(parcel, i13, Feature.CREATOR);
                                break;
                            case 11:
                                featureArr3 = (Feature[]) UrlUtils.serializer(parcel, i13, Feature.CREATOR);
                                break;
                            case '\f':
                                zMediaSessionCompatQueueItem3 = UrlUtils.MediaSessionCompatQueueItem(parcel, i13);
                                break;
                            case '\r':
                                iPlaybackStateCompatCustomAction10 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i13);
                                break;
                            case 14:
                                zMediaSessionCompatQueueItem4 = UrlUtils.MediaSessionCompatQueueItem(parcel, i13);
                                break;
                            case 15:
                                strSerializer5 = UrlUtils.serializer(parcel, i13);
                                break;
                        }
                    } else {
                        parcel.readInt();
                        throw null;
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite5)});
                return new GetServiceRequest(iPlaybackStateCompatCustomAction7, iPlaybackStateCompatCustomAction8, iPlaybackStateCompatCustomAction9, strSerializer4, iBinder, scopeArr, bundle, account, featureArr2, featureArr3, zMediaSessionCompatQueueItem3, iPlaybackStateCompatCustomAction10, zMediaSessionCompatQueueItem4, strSerializer5);
            case 5:
                int iWrite6 = UrlUtils.write(parcel);
                long jPlaybackStateCompat = -1;
                String strSerializer6 = null;
                int iPlaybackStateCompatCustomAction11 = 0;
                boolean zMediaSessionCompatQueueItem5 = false;
                while (parcel.dataPosition() < iWrite6) {
                    int i14 = parcel.readInt();
                    char c6 = (char) i14;
                    if (c6 == 1) {
                        strSerializer6 = UrlUtils.serializer(parcel, i14);
                    } else if (c6 == 2) {
                        iPlaybackStateCompatCustomAction11 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i14);
                    } else if (c6 == 3) {
                        jPlaybackStateCompat = UrlUtils.PlaybackStateCompat(parcel, i14);
                    } else {
                        int i15 = IconCompatParcelizer + 3;
                        RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                        if (i15 % 2 == 0) {
                            if (c6 != 4) {
                                UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i14);
                            } else {
                                zMediaSessionCompatQueueItem5 = UrlUtils.MediaSessionCompatQueueItem(parcel, i14);
                            }
                        } else if (c6 != 4) {
                            UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i14);
                        } else {
                            zMediaSessionCompatQueueItem5 = UrlUtils.MediaSessionCompatQueueItem(parcel, i14);
                        }
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite6)});
                return new Feature(strSerializer6, iPlaybackStateCompatCustomAction11, jPlaybackStateCompat, zMediaSessionCompatQueueItem5);
            case 6:
                int iWrite7 = UrlUtils.write(parcel);
                IBinder iBinder2 = null;
                IBinder iBinder3 = null;
                PendingIntent pendingIntent3 = null;
                String strSerializer7 = null;
                int iPlaybackStateCompatCustomAction12 = 0;
                while (parcel.dataPosition() < iWrite7) {
                    int i16 = RemoteActionCompatParcelizer + 51;
                    IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                    if (i16 % 2 != 0) {
                        i = parcel.readInt();
                        c = (char) i;
                        if (c == 1) {
                            iPlaybackStateCompatCustomAction12 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i);
                        } else if (c != 2) {
                            int i17 = RemoteActionCompatParcelizer + 13;
                            i2 = i17 % Fields.SpotShadowColor;
                            IconCompatParcelizer = i2;
                            int i18 = i17 % 2;
                            if (c != 3) {
                                i3 = i2 + 85;
                                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                                if (i3 % 2 == 0) {
                                    if (c != 4) {
                                        pendingIntent3 = (PendingIntent) UrlUtils.read(parcel, i, PendingIntent.CREATOR);
                                    } else if (c != 6) {
                                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i);
                                    } else {
                                        strSerializer7 = UrlUtils.serializer(parcel, i);
                                    }
                                } else if (c != 4) {
                                    pendingIntent3 = (PendingIntent) UrlUtils.read(parcel, i, PendingIntent.CREATOR);
                                } else if (c != 6) {
                                    UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i);
                                } else {
                                    strSerializer7 = UrlUtils.serializer(parcel, i);
                                }
                            } else {
                                iBinder3 = (IBinder) UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), -635127719, 635127725, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(i)});
                            }
                        } else {
                            iBinder2 = (IBinder) UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), -635127719, 635127725, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(i)});
                        }
                    } else {
                        i = parcel.readInt();
                        c = (char) i;
                        if (c == 1) {
                            iPlaybackStateCompatCustomAction12 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i);
                        } else if (c != 2) {
                            int i19 = RemoteActionCompatParcelizer + 13;
                            i2 = i19 % Fields.SpotShadowColor;
                            IconCompatParcelizer = i2;
                            int i110 = i19 % 2;
                            if (c != 3) {
                                i3 = i2 + 85;
                                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                                if (i3 % 2 == 0) {
                                    if (c != 4) {
                                        pendingIntent3 = (PendingIntent) UrlUtils.read(parcel, i, PendingIntent.CREATOR);
                                    } else if (c != 6) {
                                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i);
                                    } else {
                                        strSerializer7 = UrlUtils.serializer(parcel, i);
                                    }
                                } else if (c != 4) {
                                    pendingIntent3 = (PendingIntent) UrlUtils.read(parcel, i, PendingIntent.CREATOR);
                                } else if (c != 6) {
                                    UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i);
                                } else {
                                    strSerializer7 = UrlUtils.serializer(parcel, i);
                                }
                            } else {
                                iBinder3 = (IBinder) UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), -635127719, 635127725, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(i)});
                            }
                        } else {
                            iBinder2 = (IBinder) UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), -635127719, 635127725, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(i)});
                        }
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite7)});
                return new zzee(iPlaybackStateCompatCustomAction12, iBinder2, iBinder3, pendingIntent3, strSerializer7);
            case 7:
                int iWrite8 = UrlUtils.write(parcel);
                long jPlaybackStateCompat2 = 0;
                long jPlaybackStateCompat3 = 0;
                Bundle bundleIconCompatParcelizer3 = null;
                String strSerializer8 = null;
                boolean zMediaSessionCompatQueueItem6 = false;
                while (parcel.dataPosition() < iWrite8) {
                    int i20 = parcel.readInt();
                    char c7 = (char) i20;
                    if (c7 == 1) {
                        jPlaybackStateCompat2 = UrlUtils.PlaybackStateCompat(parcel, i20);
                    } else if (c7 == 2) {
                        jPlaybackStateCompat3 = UrlUtils.PlaybackStateCompat(parcel, i20);
                    } else if (c7 == 3) {
                        zMediaSessionCompatQueueItem6 = UrlUtils.MediaSessionCompatQueueItem(parcel, i20);
                    } else if (c7 == 7) {
                        bundleIconCompatParcelizer3 = UrlUtils.IconCompatParcelizer(parcel, i20);
                    } else if (c7 != '\b') {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i20);
                    } else {
                        strSerializer8 = UrlUtils.serializer(parcel, i20);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite8)});
                return new zzdd(jPlaybackStateCompat2, jPlaybackStateCompat3, zMediaSessionCompatQueueItem6, bundleIconCompatParcelizer3, strSerializer8);
            case 8:
                int iWrite9 = UrlUtils.write(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < iWrite9) {
                    int i21 = parcel.readInt();
                    char c8 = (char) i21;
                    if (c8 == 1) {
                        iPlaybackStateCompatCustomAction = UrlUtils.PlaybackStateCompatCustomAction(parcel, i21);
                    } else if (c8 == 2) {
                        strSerializer = UrlUtils.serializer(parcel, i21);
                    } else if (c8 != 3) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i21);
                    } else {
                        intent = (Intent) UrlUtils.read(parcel, i21, Intent.CREATOR);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite9)});
                return new zzdf(iPlaybackStateCompatCustomAction, strSerializer, intent);
            case 9:
                int iWrite10 = UrlUtils.write(parcel);
                while (parcel.dataPosition() < iWrite10) {
                    int i22 = parcel.readInt();
                    if (((char) i22) != 2) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i22);
                    } else {
                        bundleIconCompatParcelizer2 = UrlUtils.IconCompatParcelizer(parcel, i22);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite10)});
                return new zzbe(bundleIconCompatParcelizer2);
            case 10:
                int iWrite11 = UrlUtils.write(parcel);
                long jPlaybackStateCompat4 = 0;
                String strSerializer9 = null;
                zzbe zzbeVar = null;
                String strSerializer10 = null;
                while (parcel.dataPosition() < iWrite11) {
                    int i23 = parcel.readInt();
                    char c9 = (char) i23;
                    if (c9 == 2) {
                        strSerializer9 = UrlUtils.serializer(parcel, i23);
                    } else {
                        int i24 = RemoteActionCompatParcelizer + 3;
                        IconCompatParcelizer = i24 % Fields.SpotShadowColor;
                        if (i24 % 2 != 0) {
                            if (c9 == 3) {
                                zzbeVar = (zzbe) UrlUtils.read(parcel, i23, zzbe.CREATOR);
                            } else if (c9 != 4) {
                                strSerializer10 = UrlUtils.serializer(parcel, i23);
                                int i25 = RemoteActionCompatParcelizer + 109;
                                IconCompatParcelizer = i25 % Fields.SpotShadowColor;
                                int i26 = i25 % 2;
                            } else if (c9 != 5) {
                                UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i23);
                            } else {
                                jPlaybackStateCompat4 = UrlUtils.PlaybackStateCompat(parcel, i23);
                            }
                        } else if (c9 == 3) {
                            zzbeVar = (zzbe) UrlUtils.read(parcel, i23, zzbe.CREATOR);
                        } else if (c9 != 4) {
                            strSerializer10 = UrlUtils.serializer(parcel, i23);
                            int i27 = RemoteActionCompatParcelizer + 109;
                            IconCompatParcelizer = i27 % Fields.SpotShadowColor;
                            int i28 = i27 % 2;
                        } else if (c9 != 5) {
                            UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i23);
                        } else {
                            jPlaybackStateCompat4 = UrlUtils.PlaybackStateCompat(parcel, i23);
                        }
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite11)});
                return new zzbg(strSerializer9, zzbeVar, strSerializer10, jPlaybackStateCompat4);
            case 11:
                int iWrite12 = UrlUtils.write(parcel);
                long jPlaybackStateCompat5 = 0;
                String strSerializer11 = null;
                Long lValueOf = null;
                Float fValueOf = null;
                String strSerializer12 = null;
                String strSerializer13 = null;
                Double dValueOf = null;
                int iPlaybackStateCompatCustomAction13 = 0;
                while (parcel.dataPosition() < iWrite12) {
                    int i29 = parcel.readInt();
                    switch ((char) i29) {
                        case 1:
                            iPlaybackStateCompatCustomAction13 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i29);
                            break;
                        case 2:
                            strSerializer11 = UrlUtils.serializer(parcel, i29);
                            break;
                        case 3:
                            jPlaybackStateCompat5 = UrlUtils.PlaybackStateCompat(parcel, i29);
                            break;
                        case 4:
                            int iParcelableVolumeInfo2 = UrlUtils.ParcelableVolumeInfo(parcel, i29);
                            if (iParcelableVolumeInfo2 != 0) {
                                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 155175255, -155175253, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iParcelableVolumeInfo2), 8});
                                lValueOf = Long.valueOf(parcel.readLong());
                            } else {
                                lValueOf = null;
                            }
                            break;
                        case 5:
                            int iParcelableVolumeInfo3 = UrlUtils.ParcelableVolumeInfo(parcel, i29);
                            if (iParcelableVolumeInfo3 != 0) {
                                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 155175255, -155175253, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iParcelableVolumeInfo3), 4});
                                fValueOf = Float.valueOf(parcel.readFloat());
                            } else {
                                fValueOf = null;
                            }
                            break;
                        case 6:
                            strSerializer12 = UrlUtils.serializer(parcel, i29);
                            break;
                        case 7:
                            strSerializer13 = UrlUtils.serializer(parcel, i29);
                            break;
                        case '\b':
                            int iParcelableVolumeInfo4 = UrlUtils.ParcelableVolumeInfo(parcel, i29);
                            if (iParcelableVolumeInfo4 != 0) {
                                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 155175255, -155175253, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iParcelableVolumeInfo4), 8});
                                dValueOf = Double.valueOf(parcel.readDouble());
                            } else {
                                dValueOf = null;
                            }
                            break;
                        default:
                            UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i29);
                            break;
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite12)});
                return new zzpl(iPlaybackStateCompatCustomAction13, strSerializer11, jPlaybackStateCompat5, lValueOf, fValueOf, strSerializer12, strSerializer13, dValueOf);
            case 12:
                int iWrite13 = UrlUtils.write(parcel);
                String strSerializer14 = "";
                String strSerializer15 = strSerializer14;
                String strSerializer16 = strSerializer15;
                String strSerializer17 = strSerializer16;
                int iPlaybackStateCompatCustomAction14 = 100;
                long jPlaybackStateCompat6 = 0;
                long jPlaybackStateCompat7 = 0;
                long jPlaybackStateCompat8 = 0;
                long jPlaybackStateCompat9 = 0;
                long jPlaybackStateCompat10 = 0;
                long jPlaybackStateCompat11 = 0;
                long jPlaybackStateCompat12 = 0;
                String strSerializer18 = null;
                String strSerializer19 = null;
                String strSerializer20 = null;
                String strSerializer21 = null;
                String strSerializer22 = null;
                String strSerializer23 = null;
                Boolean boolValueOf = null;
                ArrayList arrayListMediaBrowserCompatMediaItem = null;
                String strSerializer24 = null;
                String strSerializer25 = null;
                boolean zMediaSessionCompatQueueItem7 = true;
                boolean zMediaSessionCompatQueueItem8 = true;
                boolean zMediaSessionCompatQueueItem9 = false;
                int iPlaybackStateCompatCustomAction15 = 0;
                boolean zMediaSessionCompatQueueItem10 = false;
                boolean zMediaSessionCompatQueueItem11 = false;
                int iPlaybackStateCompatCustomAction16 = 0;
                int iPlaybackStateCompatCustomAction17 = 0;
                long jPlaybackStateCompat13 = -2147483648L;
                while (parcel.dataPosition() < iWrite13) {
                    int i30 = parcel.readInt();
                    switch ((char) i30) {
                        case 2:
                            strSerializer18 = UrlUtils.serializer(parcel, i30);
                            break;
                        case 3:
                            strSerializer19 = UrlUtils.serializer(parcel, i30);
                            break;
                        case 4:
                            strSerializer20 = UrlUtils.serializer(parcel, i30);
                            break;
                        case 5:
                            strSerializer21 = UrlUtils.serializer(parcel, i30);
                            break;
                        case 6:
                            jPlaybackStateCompat6 = UrlUtils.PlaybackStateCompat(parcel, i30);
                            break;
                        case 7:
                            jPlaybackStateCompat7 = UrlUtils.PlaybackStateCompat(parcel, i30);
                            break;
                        case '\b':
                            strSerializer22 = UrlUtils.serializer(parcel, i30);
                            break;
                        case '\t':
                            zMediaSessionCompatQueueItem7 = UrlUtils.MediaSessionCompatQueueItem(parcel, i30);
                            break;
                        case '\n':
                            zMediaSessionCompatQueueItem9 = UrlUtils.MediaSessionCompatQueueItem(parcel, i30);
                            break;
                        case 11:
                            jPlaybackStateCompat13 = UrlUtils.PlaybackStateCompat(parcel, i30);
                            break;
                        case '\f':
                            strSerializer23 = UrlUtils.serializer(parcel, i30);
                            break;
                        case '\r':
                        case 17:
                        case 19:
                        case 20:
                        case 24:
                        case '!':
                        default:
                            UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i30);
                            break;
                        case 14:
                            jPlaybackStateCompat8 = UrlUtils.PlaybackStateCompat(parcel, i30);
                            break;
                        case 15:
                            iPlaybackStateCompatCustomAction15 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i30);
                            break;
                        case 16:
                            zMediaSessionCompatQueueItem8 = UrlUtils.MediaSessionCompatQueueItem(parcel, i30);
                            break;
                        case 18:
                            zMediaSessionCompatQueueItem10 = UrlUtils.MediaSessionCompatQueueItem(parcel, i30);
                            break;
                        case 21:
                            int iParcelableVolumeInfo5 = UrlUtils.ParcelableVolumeInfo(parcel, i30);
                            if (iParcelableVolumeInfo5 != 0) {
                                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 155175255, -155175253, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iParcelableVolumeInfo5), 4});
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                            } else {
                                boolValueOf = null;
                            }
                            break;
                        case 22:
                            jPlaybackStateCompat9 = UrlUtils.PlaybackStateCompat(parcel, i30);
                            break;
                        case 23:
                            arrayListMediaBrowserCompatMediaItem = UrlUtils.MediaBrowserCompatMediaItem(parcel, i30);
                            break;
                        case 25:
                            strSerializer14 = UrlUtils.serializer(parcel, i30);
                            break;
                        case 26:
                            strSerializer15 = UrlUtils.serializer(parcel, i30);
                            break;
                        case 27:
                            strSerializer24 = UrlUtils.serializer(parcel, i30);
                            break;
                        case 28:
                            zMediaSessionCompatQueueItem11 = UrlUtils.MediaSessionCompatQueueItem(parcel, i30);
                            break;
                        case 29:
                            jPlaybackStateCompat10 = UrlUtils.PlaybackStateCompat(parcel, i30);
                            break;
                        case 30:
                            iPlaybackStateCompatCustomAction14 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i30);
                            break;
                        case 31:
                            strSerializer16 = UrlUtils.serializer(parcel, i30);
                            break;
                        case ' ':
                            iPlaybackStateCompatCustomAction16 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i30);
                            break;
                        case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                            jPlaybackStateCompat11 = UrlUtils.PlaybackStateCompat(parcel, i30);
                            break;
                        case '#':
                            strSerializer25 = UrlUtils.serializer(parcel, i30);
                            break;
                        case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            strSerializer17 = UrlUtils.serializer(parcel, i30);
                            break;
                        case '%':
                            jPlaybackStateCompat12 = UrlUtils.PlaybackStateCompat(parcel, i30);
                            break;
                        case '&':
                            iPlaybackStateCompatCustomAction17 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i30);
                            break;
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite13)});
                return new com.google.android.gms.measurement.internal.zzr(strSerializer18, strSerializer19, strSerializer20, strSerializer21, jPlaybackStateCompat6, jPlaybackStateCompat7, strSerializer22, zMediaSessionCompatQueueItem7, zMediaSessionCompatQueueItem9, jPlaybackStateCompat13, strSerializer23, jPlaybackStateCompat8, iPlaybackStateCompatCustomAction15, zMediaSessionCompatQueueItem8, zMediaSessionCompatQueueItem10, boolValueOf, jPlaybackStateCompat9, arrayListMediaBrowserCompatMediaItem, strSerializer14, strSerializer15, strSerializer24, zMediaSessionCompatQueueItem11, jPlaybackStateCompat10, iPlaybackStateCompatCustomAction14, strSerializer16, iPlaybackStateCompatCustomAction16, jPlaybackStateCompat11, strSerializer25, strSerializer17, jPlaybackStateCompat12, iPlaybackStateCompatCustomAction17);
            case 13:
                return new Counter(parcel);
            case 14:
                return new Trace(parcel, false);
            case 15:
                return new PerfSession(parcel);
            case 16:
                return new Timer(parcel.readLong(), parcel.readLong());
            case 17:
                parcel.getClass();
                return new LocationPuck2D(parcel.readInt() == 0 ? null : ImageHolder.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ImageHolder.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ImageHolder.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readFloat());
            case 18:
                parcel.getClass();
                return new AttributionSettings(parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readInt() != 0);
            case 19:
                parcel.getClass();
                return new CompassSettings(parcel.readInt() != 0, parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0 ? ImageHolder.CREATOR.createFromParcel(parcel) : null);
            case 20:
                parcel.getClass();
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                boolean z4 = parcel.readInt() != 0;
                boolean z5 = parcel.readInt() != 0;
                boolean z6 = parcel.readInt() != 0;
                ScrollMode scrollModeValueOf = ScrollMode.valueOf(parcel.readString());
                boolean z7 = parcel.readInt() != 0;
                boolean z8 = parcel.readInt() != 0;
                boolean z9 = parcel.readInt() != 0;
                ScreenCoordinate screenCoordinate = (ScreenCoordinate) parcel.readSerializable();
                boolean z10 = parcel.readInt() != 0;
                boolean z11 = parcel.readInt() != 0;
                boolean z12 = parcel.readInt() != 0;
                boolean z13 = parcel.readInt() != 0;
                boolean z14 = parcel.readInt() != 0;
                float f = parcel.readFloat();
                boolean z15 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    int i31 = RemoteActionCompatParcelizer + 9;
                    IconCompatParcelizer = i31 % Fields.SpotShadowColor;
                    int i32 = i31 % 2;
                    z = true;
                } else {
                    z = false;
                }
                return new GesturesSettings(z2, z3, z4, z5, z6, scrollModeValueOf, z7, z8, z9, screenCoordinate, z10, z11, z12, z13, z14, f, z15, z);
            case 21:
                parcel.getClass();
                return new LocationComponentSettings(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readFloat(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, PuckBearing.valueOf(parcel.readString()), parcel.readString(), (LocationPuck) parcel.readParcelable(LocationComponentSettings.class.getClassLoader()));
            case 22:
                parcel.getClass();
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int i33 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(i33);
                    while (iPlaybackStateCompatCustomAction != i33) {
                        linkedHashMap.put(parcel.readString(), parcel.readValue(TrackingEvent.class.getClassLoader()));
                        iPlaybackStateCompatCustomAction++;
                    }
                }
                return new TrackingEvent(string, string2, linkedHashMap);
            default:
                parcel.getClass();
                return new PermissionModel(r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08.valueOf(parcel.readString()), parcel.readInt() != 0);
        }
    }
}
