package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import io.sentry.util.UrlUtils;
import o.trackEventI;

/* JADX INFO: loaded from: classes2.dex */
public final class zzh implements Parcelable.Creator {
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ zzh(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        double dMediaMetadataCompat = 0.0d;
        int iPlaybackStateCompatCustomAction = 0;
        String[] strArrWrite = null;
        String strSerializer = null;
        String strSerializer2 = null;
        String strSerializer3 = null;
        String strSerializer4 = null;
        String strSerializer5 = null;
        String strSerializer6 = null;
        zzp zzpVar = null;
        String[] strArrWrite2 = null;
        String strSerializer7 = null;
        String strSerializer8 = null;
        String strSerializer9 = null;
        String strSerializer10 = null;
        String strSerializer11 = null;
        String strSerializer12 = null;
        String strSerializer13 = null;
        String strSerializer14 = null;
        String strSerializer15 = null;
        switch (this.RemoteActionCompatParcelizer) {
            case 0:
                int iWrite = UrlUtils.write(parcel);
                while (parcel.dataPosition() < iWrite) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 2) {
                        iPlaybackStateCompatCustomAction = UrlUtils.PlaybackStateCompatCustomAction(parcel, i);
                    } else if (c != 3) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i);
                    } else {
                        strArrWrite = UrlUtils.write(parcel, i);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite)});
                zzi zziVar = new zzi();
                zziVar.RemoteActionCompatParcelizer = iPlaybackStateCompatCustomAction;
                zziVar.write = strArrWrite;
                return zziVar;
            case 1:
                int iWrite2 = UrlUtils.write(parcel);
                String strSerializer16 = null;
                String strSerializer17 = null;
                while (parcel.dataPosition() < iWrite2) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 2) {
                        iPlaybackStateCompatCustomAction = UrlUtils.PlaybackStateCompatCustomAction(parcel, i2);
                    } else if (c2 == 3) {
                        strSerializer15 = UrlUtils.serializer(parcel, i2);
                    } else if (c2 == 4) {
                        strSerializer16 = UrlUtils.serializer(parcel, i2);
                    } else if (c2 != 5) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i2);
                    } else {
                        strSerializer17 = UrlUtils.serializer(parcel, i2);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite2)});
                zzn zznVar = new zzn();
                zznVar.write = iPlaybackStateCompatCustomAction;
                zznVar.IconCompatParcelizer = strSerializer15;
                zznVar.RemoteActionCompatParcelizer = strSerializer16;
                zznVar.read = strSerializer17;
                return zznVar;
            case 2:
                int iWrite3 = UrlUtils.write(parcel);
                double dMediaMetadataCompat2 = 0.0d;
                while (parcel.dataPosition() < iWrite3) {
                    int i3 = parcel.readInt();
                    char c3 = (char) i3;
                    if (c3 == 2) {
                        dMediaMetadataCompat = UrlUtils.MediaMetadataCompat(parcel, i3);
                    } else if (c3 != 3) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i3);
                    } else {
                        dMediaMetadataCompat2 = UrlUtils.MediaMetadataCompat(parcel, i3);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite3)});
                zzo zzoVar = new zzo();
                zzoVar.write = dMediaMetadataCompat;
                zzoVar.RemoteActionCompatParcelizer = dMediaMetadataCompat2;
                return zzoVar;
            case 3:
                int iWrite4 = UrlUtils.write(parcel);
                String strSerializer18 = null;
                String strSerializer19 = null;
                String strSerializer20 = null;
                String strSerializer21 = null;
                String strSerializer22 = null;
                String strSerializer23 = null;
                while (parcel.dataPosition() < iWrite4) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case 2:
                            strSerializer14 = UrlUtils.serializer(parcel, i4);
                            break;
                        case 3:
                            strSerializer18 = UrlUtils.serializer(parcel, i4);
                            break;
                        case 4:
                            strSerializer19 = UrlUtils.serializer(parcel, i4);
                            break;
                        case 5:
                            strSerializer20 = UrlUtils.serializer(parcel, i4);
                            break;
                        case 6:
                            strSerializer21 = UrlUtils.serializer(parcel, i4);
                            break;
                        case 7:
                            strSerializer22 = UrlUtils.serializer(parcel, i4);
                            break;
                        case '\b':
                            strSerializer23 = UrlUtils.serializer(parcel, i4);
                            break;
                        default:
                            UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i4);
                            break;
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite4)});
                zzp zzpVar2 = new zzp();
                zzpVar2.IconCompatParcelizer = strSerializer14;
                zzpVar2.read = strSerializer18;
                zzpVar2.serializer = strSerializer19;
                zzpVar2.write = strSerializer20;
                zzpVar2.RemoteActionCompatParcelizer = strSerializer21;
                zzpVar2.MediaDescriptionCompat = strSerializer22;
                zzpVar2.MediaSessionCompatQueueItem = strSerializer23;
                return zzpVar2;
            case 4:
                int iWrite5 = UrlUtils.write(parcel);
                while (parcel.dataPosition() < iWrite5) {
                    int i5 = parcel.readInt();
                    char c4 = (char) i5;
                    if (c4 == 2) {
                        iPlaybackStateCompatCustomAction = UrlUtils.PlaybackStateCompatCustomAction(parcel, i5);
                    } else if (c4 != 3) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i5);
                    } else {
                        strSerializer13 = UrlUtils.serializer(parcel, i5);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite5)});
                zzq zzqVar = new zzq();
                zzqVar.serializer = iPlaybackStateCompatCustomAction;
                zzqVar.write = strSerializer13;
                return zzqVar;
            case 5:
                int iWrite6 = UrlUtils.write(parcel);
                String strSerializer24 = null;
                while (parcel.dataPosition() < iWrite6) {
                    int i6 = parcel.readInt();
                    char c5 = (char) i6;
                    if (c5 == 2) {
                        strSerializer12 = UrlUtils.serializer(parcel, i6);
                    } else if (c5 != 3) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i6);
                    } else {
                        strSerializer24 = UrlUtils.serializer(parcel, i6);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite6)});
                zzr zzrVar = new zzr();
                zzrVar.serializer = strSerializer12;
                zzrVar.RemoteActionCompatParcelizer = strSerializer24;
                return zzrVar;
            case 6:
                int iWrite7 = UrlUtils.write(parcel);
                String strSerializer25 = null;
                while (parcel.dataPosition() < iWrite7) {
                    int i7 = parcel.readInt();
                    char c6 = (char) i7;
                    if (c6 == 2) {
                        strSerializer11 = UrlUtils.serializer(parcel, i7);
                    } else if (c6 != 3) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i7);
                    } else {
                        strSerializer25 = UrlUtils.serializer(parcel, i7);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite7)});
                zzs zzsVar = new zzs();
                zzsVar.IconCompatParcelizer = strSerializer11;
                zzsVar.read = strSerializer25;
                return zzsVar;
            case 7:
                int iWrite8 = UrlUtils.write(parcel);
                String strSerializer26 = null;
                while (parcel.dataPosition() < iWrite8) {
                    int i8 = parcel.readInt();
                    char c7 = (char) i8;
                    if (c7 == 2) {
                        strSerializer10 = UrlUtils.serializer(parcel, i8);
                    } else if (c7 == 3) {
                        strSerializer26 = UrlUtils.serializer(parcel, i8);
                    } else if (c7 != 4) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i8);
                    } else {
                        iPlaybackStateCompatCustomAction = UrlUtils.PlaybackStateCompatCustomAction(parcel, i8);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite8)});
                zzt zztVar = new zzt();
                zztVar.RemoteActionCompatParcelizer = strSerializer10;
                zztVar.write = strSerializer26;
                zztVar.serializer = iPlaybackStateCompatCustomAction;
                return zztVar;
            case 8:
                int iWrite9 = UrlUtils.write(parcel);
                boolean zMediaSessionCompatQueueItem = false;
                while (parcel.dataPosition() < iWrite9) {
                    int i9 = parcel.readInt();
                    char c8 = (char) i9;
                    if (c8 == 2) {
                        iPlaybackStateCompatCustomAction = UrlUtils.PlaybackStateCompatCustomAction(parcel, i9);
                    } else if (c8 != 3) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i9);
                    } else {
                        zMediaSessionCompatQueueItem = UrlUtils.MediaSessionCompatQueueItem(parcel, i9);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite9)});
                zzah zzahVar = new zzah();
                zzahVar.read = iPlaybackStateCompatCustomAction;
                zzahVar.RemoteActionCompatParcelizer = zMediaSessionCompatQueueItem;
                return zzahVar;
            case 9:
                int iWrite10 = UrlUtils.write(parcel);
                long jPlaybackStateCompat = 0;
                int iPlaybackStateCompatCustomAction2 = 0;
                int iPlaybackStateCompatCustomAction3 = 0;
                int iPlaybackStateCompatCustomAction4 = 0;
                int iPlaybackStateCompatCustomAction5 = 0;
                while (parcel.dataPosition() < iWrite10) {
                    int i10 = parcel.readInt();
                    char c9 = (char) i10;
                    if (c9 == 2) {
                        iPlaybackStateCompatCustomAction2 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i10);
                    } else if (c9 == 3) {
                        iPlaybackStateCompatCustomAction3 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i10);
                    } else if (c9 == 4) {
                        iPlaybackStateCompatCustomAction4 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i10);
                    } else if (c9 == 5) {
                        jPlaybackStateCompat = UrlUtils.PlaybackStateCompat(parcel, i10);
                    } else if (c9 != 6) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i10);
                    } else {
                        iPlaybackStateCompatCustomAction5 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i10);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite10)});
                return new zzan(jPlaybackStateCompat, iPlaybackStateCompatCustomAction2, iPlaybackStateCompatCustomAction3, iPlaybackStateCompatCustomAction4, iPlaybackStateCompatCustomAction5);
            case 10:
                int iWrite11 = UrlUtils.write(parcel);
                int iPlaybackStateCompatCustomAction6 = 0;
                boolean zMediaSessionCompatQueueItem2 = false;
                byte[] bArrRemoteActionCompatParcelizer = null;
                String strSerializer27 = null;
                Point[] pointArr = null;
                zzn zznVar2 = null;
                zzq zzqVar2 = null;
                zzr zzrVar2 = null;
                zzt zztVar2 = null;
                zzs zzsVar2 = null;
                zzo zzoVar2 = null;
                zzk zzkVar = null;
                zzl zzlVar = null;
                zzm zzmVar = null;
                while (parcel.dataPosition() < iWrite11) {
                    int i11 = parcel.readInt();
                    zzt zztVar3 = zztVar2;
                    switch ((char) i11) {
                        case 2:
                            iPlaybackStateCompatCustomAction = UrlUtils.PlaybackStateCompatCustomAction(parcel, i11);
                            break;
                        case 3:
                            strSerializer9 = UrlUtils.serializer(parcel, i11);
                            break;
                        case 4:
                            strSerializer27 = UrlUtils.serializer(parcel, i11);
                            break;
                        case 5:
                            iPlaybackStateCompatCustomAction6 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i11);
                            break;
                        case 6:
                            pointArr = (Point[]) UrlUtils.serializer(parcel, i11, Point.CREATOR);
                            break;
                        case 7:
                            zznVar2 = (zzn) UrlUtils.read(parcel, i11, zzn.CREATOR);
                            break;
                        case '\b':
                            zzqVar2 = (zzq) UrlUtils.read(parcel, i11, zzq.CREATOR);
                            break;
                        case '\t':
                            zzrVar2 = (zzr) UrlUtils.read(parcel, i11, zzr.CREATOR);
                            break;
                        case '\n':
                            zztVar2 = (zzt) UrlUtils.read(parcel, i11, zzt.CREATOR);
                            continue;
                        case 11:
                            zzsVar2 = (zzs) UrlUtils.read(parcel, i11, zzs.CREATOR);
                            break;
                        case '\f':
                            zzoVar2 = (zzo) UrlUtils.read(parcel, i11, zzo.CREATOR);
                            break;
                        case '\r':
                            zzkVar = (zzk) UrlUtils.read(parcel, i11, zzk.CREATOR);
                            break;
                        case 14:
                            zzlVar = (zzl) UrlUtils.read(parcel, i11, zzl.CREATOR);
                            break;
                        case 15:
                            zzmVar = (zzm) UrlUtils.read(parcel, i11, zzm.CREATOR);
                            break;
                        case 16:
                            bArrRemoteActionCompatParcelizer = UrlUtils.RemoteActionCompatParcelizer(parcel, i11);
                            break;
                        case 17:
                            zMediaSessionCompatQueueItem2 = UrlUtils.MediaSessionCompatQueueItem(parcel, i11);
                            break;
                        case 18:
                            dMediaMetadataCompat = UrlUtils.MediaMetadataCompat(parcel, i11);
                            break;
                        default:
                            UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i11);
                            break;
                    }
                    zztVar2 = zztVar3;
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite11)});
                zzu zzuVar = new zzu();
                zzuVar.write = iPlaybackStateCompatCustomAction;
                zzuVar.RemoteActionCompatParcelizer = strSerializer9;
                zzuVar.MediaSessionCompatResultReceiverWrapper = bArrRemoteActionCompatParcelizer;
                zzuVar.serializer = strSerializer27;
                zzuVar.IconCompatParcelizer = iPlaybackStateCompatCustomAction6;
                zzuVar.read = pointArr;
                zzuVar.ComponentActivity = zMediaSessionCompatQueueItem2;
                zzuVar.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = dMediaMetadataCompat;
                zzuVar.MediaSessionCompatQueueItem = zznVar2;
                zzuVar.MediaBrowserCompatMediaItem = zzqVar2;
                zzuVar.RatingCompat = zzrVar2;
                zzuVar.MediaDescriptionCompat = zztVar2;
                zzuVar.MediaMetadataCompat = zzsVar2;
                zzuVar.PlaybackStateCompat = zzoVar2;
                zzuVar.MediaSessionCompatToken = zzkVar;
                zzuVar.ParcelableVolumeInfo = zzlVar;
                zzuVar.PlaybackStateCompatCustomAction = zzmVar;
                return zzuVar;
            case 11:
                int iWrite12 = UrlUtils.write(parcel);
                int iPlaybackStateCompatCustomAction7 = 0;
                int iPlaybackStateCompatCustomAction8 = 0;
                int iPlaybackStateCompatCustomAction9 = 0;
                int iPlaybackStateCompatCustomAction10 = 0;
                int iPlaybackStateCompatCustomAction11 = 0;
                boolean zMediaSessionCompatQueueItem3 = false;
                while (parcel.dataPosition() < iWrite12) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 2:
                            iPlaybackStateCompatCustomAction = UrlUtils.PlaybackStateCompatCustomAction(parcel, i12);
                            break;
                        case 3:
                            iPlaybackStateCompatCustomAction7 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i12);
                            break;
                        case 4:
                            iPlaybackStateCompatCustomAction8 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i12);
                            break;
                        case 5:
                            iPlaybackStateCompatCustomAction9 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i12);
                            break;
                        case 6:
                            iPlaybackStateCompatCustomAction10 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i12);
                            break;
                        case 7:
                            iPlaybackStateCompatCustomAction11 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i12);
                            break;
                        case '\b':
                            zMediaSessionCompatQueueItem3 = UrlUtils.MediaSessionCompatQueueItem(parcel, i12);
                            break;
                        case '\t':
                            strSerializer8 = UrlUtils.serializer(parcel, i12);
                            break;
                        default:
                            UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i12);
                            break;
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite12)});
                zzj zzjVar = new zzj();
                zzjVar.RemoteActionCompatParcelizer = iPlaybackStateCompatCustomAction;
                zzjVar.IconCompatParcelizer = iPlaybackStateCompatCustomAction7;
                zzjVar.write = iPlaybackStateCompatCustomAction8;
                zzjVar.read = iPlaybackStateCompatCustomAction9;
                zzjVar.serializer = iPlaybackStateCompatCustomAction10;
                zzjVar.MediaBrowserCompatMediaItem = iPlaybackStateCompatCustomAction11;
                zzjVar.MediaSessionCompatQueueItem = zMediaSessionCompatQueueItem3;
                zzjVar.MediaMetadataCompat = strSerializer8;
                return zzjVar;
            case 12:
                int iWrite13 = UrlUtils.write(parcel);
                String strSerializer28 = null;
                String strSerializer29 = null;
                String strSerializer30 = null;
                String strSerializer31 = null;
                zzj zzjVar2 = null;
                zzj zzjVar3 = null;
                while (parcel.dataPosition() < iWrite13) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 2:
                            strSerializer7 = UrlUtils.serializer(parcel, i13);
                            break;
                        case 3:
                            strSerializer28 = UrlUtils.serializer(parcel, i13);
                            break;
                        case 4:
                            strSerializer29 = UrlUtils.serializer(parcel, i13);
                            break;
                        case 5:
                            strSerializer30 = UrlUtils.serializer(parcel, i13);
                            break;
                        case 6:
                            strSerializer31 = UrlUtils.serializer(parcel, i13);
                            break;
                        case 7:
                            zzjVar2 = (zzj) UrlUtils.read(parcel, i13, zzj.CREATOR);
                            break;
                        case '\b':
                            zzjVar3 = (zzj) UrlUtils.read(parcel, i13, zzj.CREATOR);
                            break;
                        default:
                            UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i13);
                            break;
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite13)});
                zzk zzkVar2 = new zzk();
                zzkVar2.write = strSerializer7;
                zzkVar2.IconCompatParcelizer = strSerializer28;
                zzkVar2.RemoteActionCompatParcelizer = strSerializer29;
                zzkVar2.read = strSerializer30;
                zzkVar2.serializer = strSerializer31;
                zzkVar2.MediaMetadataCompat = zzjVar2;
                zzkVar2.MediaBrowserCompatMediaItem = zzjVar3;
                return zzkVar2;
            case 13:
                int iWrite14 = UrlUtils.write(parcel);
                while (parcel.dataPosition() < iWrite14) {
                    int i14 = parcel.readInt();
                    char c10 = (char) i14;
                    if (c10 == 1) {
                        iPlaybackStateCompatCustomAction = UrlUtils.PlaybackStateCompatCustomAction(parcel, i14);
                    } else if (c10 != 2) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i14);
                    } else {
                        strArrWrite2 = UrlUtils.write(parcel, i14);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite14)});
                return new zzxp(strArrWrite2, iPlaybackStateCompatCustomAction);
            case 14:
                int iWrite15 = UrlUtils.write(parcel);
                String strSerializer32 = null;
                String strSerializer33 = null;
                zzq[] zzqVarArr = null;
                zzn[] zznVarArr = null;
                String[] strArrWrite3 = null;
                zzi[] zziVarArr = null;
                while (parcel.dataPosition() < iWrite15) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 2:
                            zzpVar = (zzp) UrlUtils.read(parcel, i15, zzp.CREATOR);
                            break;
                        case 3:
                            strSerializer32 = UrlUtils.serializer(parcel, i15);
                            break;
                        case 4:
                            strSerializer33 = UrlUtils.serializer(parcel, i15);
                            break;
                        case 5:
                            zzqVarArr = (zzq[]) UrlUtils.serializer(parcel, i15, zzq.CREATOR);
                            break;
                        case 6:
                            zznVarArr = (zzn[]) UrlUtils.serializer(parcel, i15, zzn.CREATOR);
                            break;
                        case 7:
                            strArrWrite3 = UrlUtils.write(parcel, i15);
                            break;
                        case '\b':
                            zziVarArr = (zzi[]) UrlUtils.serializer(parcel, i15, zzi.CREATOR);
                            break;
                        default:
                            UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i15);
                            break;
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite15)});
                zzl zzlVar2 = new zzl();
                zzlVar2.serializer = zzpVar;
                zzlVar2.write = strSerializer32;
                zzlVar2.RemoteActionCompatParcelizer = strSerializer33;
                zzlVar2.IconCompatParcelizer = zzqVarArr;
                zzlVar2.read = zznVarArr;
                zzlVar2.MediaBrowserCompatMediaItem = strArrWrite3;
                zzlVar2.MediaDescriptionCompat = zziVarArr;
                return zzlVar2;
            case 15:
                int iWrite16 = UrlUtils.write(parcel);
                int iPlaybackStateCompatCustomAction12 = 0;
                int iPlaybackStateCompatCustomAction13 = 0;
                String strSerializer34 = null;
                String strSerializer35 = null;
                byte[] bArrRemoteActionCompatParcelizer2 = null;
                Point[] pointArr2 = null;
                zzxu zzxuVar = null;
                zzxx zzxxVar = null;
                zzxy zzxyVar = null;
                zzya zzyaVar = null;
                zzxz zzxzVar = null;
                zzxv zzxvVar = null;
                zzxr zzxrVar = null;
                zzxs zzxsVar = null;
                zzxt zzxtVar = null;
                while (parcel.dataPosition() < iWrite16) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 1:
                            iPlaybackStateCompatCustomAction12 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i16);
                            break;
                        case 2:
                            strSerializer34 = UrlUtils.serializer(parcel, i16);
                            break;
                        case 3:
                            strSerializer35 = UrlUtils.serializer(parcel, i16);
                            break;
                        case 4:
                            bArrRemoteActionCompatParcelizer2 = UrlUtils.RemoteActionCompatParcelizer(parcel, i16);
                            break;
                        case 5:
                            pointArr2 = (Point[]) UrlUtils.serializer(parcel, i16, Point.CREATOR);
                            break;
                        case 6:
                            iPlaybackStateCompatCustomAction13 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i16);
                            break;
                        case 7:
                            zzxuVar = (zzxu) UrlUtils.read(parcel, i16, zzxu.CREATOR);
                            break;
                        case '\b':
                            zzxxVar = (zzxx) UrlUtils.read(parcel, i16, zzxx.CREATOR);
                            break;
                        case '\t':
                            zzxyVar = (zzxy) UrlUtils.read(parcel, i16, zzxy.CREATOR);
                            break;
                        case '\n':
                            zzyaVar = (zzya) UrlUtils.read(parcel, i16, zzya.CREATOR);
                            break;
                        case 11:
                            zzxzVar = (zzxz) UrlUtils.read(parcel, i16, zzxz.CREATOR);
                            break;
                        case '\f':
                            zzxvVar = (zzxv) UrlUtils.read(parcel, i16, zzxv.CREATOR);
                            break;
                        case '\r':
                            zzxrVar = (zzxr) UrlUtils.read(parcel, i16, zzxr.CREATOR);
                            break;
                        case 14:
                            zzxsVar = (zzxs) UrlUtils.read(parcel, i16, zzxs.CREATOR);
                            break;
                        case 15:
                            zzxtVar = (zzxt) UrlUtils.read(parcel, i16, zzxt.CREATOR);
                            break;
                        default:
                            UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i16);
                            break;
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite16)});
                return new zzyb(iPlaybackStateCompatCustomAction12, strSerializer34, strSerializer35, bArrRemoteActionCompatParcelizer2, pointArr2, iPlaybackStateCompatCustomAction13, zzxuVar, zzxxVar, zzxyVar, zzyaVar, zzxzVar, zzxvVar, zzxrVar, zzxsVar, zzxtVar);
            case 16:
                int iWrite17 = UrlUtils.write(parcel);
                boolean zMediaSessionCompatQueueItem4 = false;
                while (parcel.dataPosition() < iWrite17) {
                    int i17 = parcel.readInt();
                    char c11 = (char) i17;
                    if (c11 == 1) {
                        iPlaybackStateCompatCustomAction = UrlUtils.PlaybackStateCompatCustomAction(parcel, i17);
                    } else if (c11 != 2) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i17);
                    } else {
                        zMediaSessionCompatQueueItem4 = UrlUtils.MediaSessionCompatQueueItem(parcel, i17);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite17)});
                return new zzyd(iPlaybackStateCompatCustomAction, zMediaSessionCompatQueueItem4);
            case 17:
                int iWrite18 = UrlUtils.write(parcel);
                int iPlaybackStateCompatCustomAction14 = 0;
                int iPlaybackStateCompatCustomAction15 = 0;
                int iPlaybackStateCompatCustomAction16 = 0;
                int iPlaybackStateCompatCustomAction17 = 0;
                int iPlaybackStateCompatCustomAction18 = 0;
                int iPlaybackStateCompatCustomAction19 = 0;
                boolean zMediaSessionCompatQueueItem5 = false;
                String strSerializer36 = null;
                while (parcel.dataPosition() < iWrite18) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            iPlaybackStateCompatCustomAction14 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i18);
                            break;
                        case 2:
                            iPlaybackStateCompatCustomAction15 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i18);
                            break;
                        case 3:
                            iPlaybackStateCompatCustomAction16 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i18);
                            break;
                        case 4:
                            iPlaybackStateCompatCustomAction17 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i18);
                            break;
                        case 5:
                            iPlaybackStateCompatCustomAction18 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i18);
                            break;
                        case 6:
                            iPlaybackStateCompatCustomAction19 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i18);
                            break;
                        case 7:
                            zMediaSessionCompatQueueItem5 = UrlUtils.MediaSessionCompatQueueItem(parcel, i18);
                            break;
                        case '\b':
                            strSerializer36 = UrlUtils.serializer(parcel, i18);
                            break;
                        default:
                            UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i18);
                            break;
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite18)});
                return new zzxq(iPlaybackStateCompatCustomAction14, iPlaybackStateCompatCustomAction15, iPlaybackStateCompatCustomAction16, iPlaybackStateCompatCustomAction17, iPlaybackStateCompatCustomAction18, iPlaybackStateCompatCustomAction19, zMediaSessionCompatQueueItem5, strSerializer36);
            case 18:
                int iWrite19 = UrlUtils.write(parcel);
                String strSerializer37 = null;
                String strSerializer38 = null;
                String strSerializer39 = null;
                String strSerializer40 = null;
                String strSerializer41 = null;
                zzxq zzxqVar = null;
                zzxq zzxqVar2 = null;
                while (parcel.dataPosition() < iWrite19) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 1:
                            strSerializer37 = UrlUtils.serializer(parcel, i19);
                            break;
                        case 2:
                            strSerializer38 = UrlUtils.serializer(parcel, i19);
                            break;
                        case 3:
                            strSerializer39 = UrlUtils.serializer(parcel, i19);
                            break;
                        case 4:
                            strSerializer40 = UrlUtils.serializer(parcel, i19);
                            break;
                        case 5:
                            strSerializer41 = UrlUtils.serializer(parcel, i19);
                            break;
                        case 6:
                            zzxqVar = (zzxq) UrlUtils.read(parcel, i19, zzxq.CREATOR);
                            break;
                        case 7:
                            zzxqVar2 = (zzxq) UrlUtils.read(parcel, i19, zzxq.CREATOR);
                            break;
                        default:
                            UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i19);
                            break;
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite19)});
                return new zzxr(strSerializer37, strSerializer38, strSerializer39, strSerializer40, strSerializer41, zzxqVar, zzxqVar2);
            case 19:
                int iWrite20 = UrlUtils.write(parcel);
                zzxw zzxwVar = null;
                String strSerializer42 = null;
                String strSerializer43 = null;
                zzxx[] zzxxVarArr = null;
                zzxu[] zzxuVarArr = null;
                String[] strArrWrite4 = null;
                zzxp[] zzxpVarArr = null;
                while (parcel.dataPosition() < iWrite20) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            zzxwVar = (zzxw) UrlUtils.read(parcel, i20, zzxw.CREATOR);
                            break;
                        case 2:
                            strSerializer42 = UrlUtils.serializer(parcel, i20);
                            break;
                        case 3:
                            strSerializer43 = UrlUtils.serializer(parcel, i20);
                            break;
                        case 4:
                            zzxxVarArr = (zzxx[]) UrlUtils.serializer(parcel, i20, zzxx.CREATOR);
                            break;
                        case 5:
                            zzxuVarArr = (zzxu[]) UrlUtils.serializer(parcel, i20, zzxu.CREATOR);
                            break;
                        case 6:
                            strArrWrite4 = UrlUtils.write(parcel, i20);
                            break;
                        case 7:
                            zzxpVarArr = (zzxp[]) UrlUtils.serializer(parcel, i20, zzxp.CREATOR);
                            break;
                        default:
                            UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i20);
                            break;
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite20)});
                return new zzxs(zzxwVar, strSerializer42, strSerializer43, zzxxVarArr, zzxuVarArr, strArrWrite4, zzxpVarArr);
            case 20:
                int iWrite21 = UrlUtils.write(parcel);
                String strSerializer44 = null;
                String strSerializer45 = null;
                String strSerializer46 = null;
                String strSerializer47 = null;
                String strSerializer48 = null;
                String strSerializer49 = null;
                String strSerializer50 = null;
                String strSerializer51 = null;
                String strSerializer52 = null;
                String strSerializer53 = null;
                String strSerializer54 = null;
                String strSerializer55 = null;
                String strSerializer56 = null;
                String strSerializer57 = null;
                while (parcel.dataPosition() < iWrite21) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 1:
                            strSerializer44 = UrlUtils.serializer(parcel, i21);
                            break;
                        case 2:
                            strSerializer45 = UrlUtils.serializer(parcel, i21);
                            break;
                        case 3:
                            strSerializer46 = UrlUtils.serializer(parcel, i21);
                            break;
                        case 4:
                            strSerializer47 = UrlUtils.serializer(parcel, i21);
                            break;
                        case 5:
                            strSerializer48 = UrlUtils.serializer(parcel, i21);
                            break;
                        case 6:
                            strSerializer49 = UrlUtils.serializer(parcel, i21);
                            break;
                        case 7:
                            strSerializer50 = UrlUtils.serializer(parcel, i21);
                            break;
                        case '\b':
                            strSerializer51 = UrlUtils.serializer(parcel, i21);
                            break;
                        case '\t':
                            strSerializer52 = UrlUtils.serializer(parcel, i21);
                            break;
                        case '\n':
                            strSerializer53 = UrlUtils.serializer(parcel, i21);
                            break;
                        case 11:
                            strSerializer54 = UrlUtils.serializer(parcel, i21);
                            break;
                        case '\f':
                            strSerializer55 = UrlUtils.serializer(parcel, i21);
                            break;
                        case '\r':
                            strSerializer56 = UrlUtils.serializer(parcel, i21);
                            break;
                        case 14:
                            strSerializer57 = UrlUtils.serializer(parcel, i21);
                            break;
                        default:
                            UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i21);
                            break;
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite21)});
                return new zzxt(strSerializer44, strSerializer45, strSerializer46, strSerializer47, strSerializer48, strSerializer49, strSerializer50, strSerializer51, strSerializer52, strSerializer53, strSerializer54, strSerializer55, strSerializer56, strSerializer57);
            case 21:
                int iWrite22 = UrlUtils.write(parcel);
                String strSerializer58 = null;
                String strSerializer59 = null;
                while (parcel.dataPosition() < iWrite22) {
                    int i22 = parcel.readInt();
                    char c12 = (char) i22;
                    if (c12 == 1) {
                        iPlaybackStateCompatCustomAction = UrlUtils.PlaybackStateCompatCustomAction(parcel, i22);
                    } else if (c12 == 2) {
                        strSerializer6 = UrlUtils.serializer(parcel, i22);
                    } else if (c12 == 3) {
                        strSerializer58 = UrlUtils.serializer(parcel, i22);
                    } else if (c12 != 4) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i22);
                    } else {
                        strSerializer59 = UrlUtils.serializer(parcel, i22);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite22)});
                return new zzxu(iPlaybackStateCompatCustomAction, strSerializer6, strSerializer58, strSerializer59);
            case 22:
                int iWrite23 = UrlUtils.write(parcel);
                double dMediaMetadataCompat3 = 0.0d;
                while (parcel.dataPosition() < iWrite23) {
                    int i23 = parcel.readInt();
                    char c13 = (char) i23;
                    if (c13 == 1) {
                        dMediaMetadataCompat = UrlUtils.MediaMetadataCompat(parcel, i23);
                    } else if (c13 != 2) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i23);
                    } else {
                        dMediaMetadataCompat3 = UrlUtils.MediaMetadataCompat(parcel, i23);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite23)});
                return new zzxv(dMediaMetadataCompat, dMediaMetadataCompat3);
            case 23:
                int iWrite24 = UrlUtils.write(parcel);
                String strSerializer60 = null;
                String strSerializer61 = null;
                String strSerializer62 = null;
                String strSerializer63 = null;
                String strSerializer64 = null;
                String strSerializer65 = null;
                String strSerializer66 = null;
                while (parcel.dataPosition() < iWrite24) {
                    int i24 = parcel.readInt();
                    switch ((char) i24) {
                        case 1:
                            strSerializer60 = UrlUtils.serializer(parcel, i24);
                            break;
                        case 2:
                            strSerializer61 = UrlUtils.serializer(parcel, i24);
                            break;
                        case 3:
                            strSerializer62 = UrlUtils.serializer(parcel, i24);
                            break;
                        case 4:
                            strSerializer63 = UrlUtils.serializer(parcel, i24);
                            break;
                        case 5:
                            strSerializer64 = UrlUtils.serializer(parcel, i24);
                            break;
                        case 6:
                            strSerializer65 = UrlUtils.serializer(parcel, i24);
                            break;
                        case 7:
                            strSerializer66 = UrlUtils.serializer(parcel, i24);
                            break;
                        default:
                            UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i24);
                            break;
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite24)});
                return new zzxw(strSerializer60, strSerializer61, strSerializer62, strSerializer63, strSerializer64, strSerializer65, strSerializer66);
            case 24:
                int iWrite25 = UrlUtils.write(parcel);
                while (parcel.dataPosition() < iWrite25) {
                    int i25 = parcel.readInt();
                    char c14 = (char) i25;
                    if (c14 == 1) {
                        iPlaybackStateCompatCustomAction = UrlUtils.PlaybackStateCompatCustomAction(parcel, i25);
                    } else if (c14 != 2) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i25);
                    } else {
                        strSerializer5 = UrlUtils.serializer(parcel, i25);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite25)});
                return new zzxx(iPlaybackStateCompatCustomAction, strSerializer5);
            case 25:
                int iWrite26 = UrlUtils.write(parcel);
                String strSerializer67 = null;
                while (parcel.dataPosition() < iWrite26) {
                    int i26 = parcel.readInt();
                    char c15 = (char) i26;
                    if (c15 == 1) {
                        strSerializer4 = UrlUtils.serializer(parcel, i26);
                    } else if (c15 != 2) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i26);
                    } else {
                        strSerializer67 = UrlUtils.serializer(parcel, i26);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite26)});
                return new zzxy(strSerializer4, strSerializer67);
            case 26:
                int iWrite27 = UrlUtils.write(parcel);
                String strSerializer68 = null;
                while (parcel.dataPosition() < iWrite27) {
                    int i27 = parcel.readInt();
                    char c16 = (char) i27;
                    if (c16 == 1) {
                        strSerializer3 = UrlUtils.serializer(parcel, i27);
                    } else if (c16 != 2) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i27);
                    } else {
                        strSerializer68 = UrlUtils.serializer(parcel, i27);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite27)});
                return new zzxz(strSerializer3, strSerializer68);
            case 27:
                int iWrite28 = UrlUtils.write(parcel);
                String strSerializer69 = null;
                while (parcel.dataPosition() < iWrite28) {
                    int i28 = parcel.readInt();
                    char c17 = (char) i28;
                    if (c17 == 1) {
                        strSerializer2 = UrlUtils.serializer(parcel, i28);
                    } else if (c17 == 2) {
                        strSerializer69 = UrlUtils.serializer(parcel, i28);
                    } else if (c17 != 3) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i28);
                    } else {
                        iPlaybackStateCompatCustomAction = UrlUtils.PlaybackStateCompatCustomAction(parcel, i28);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite28)});
                return new zzya(strSerializer2, strSerializer69, iPlaybackStateCompatCustomAction);
            case 28:
                int iWrite29 = UrlUtils.write(parcel);
                long jPlaybackStateCompat2 = 0;
                int iPlaybackStateCompatCustomAction20 = 0;
                int iPlaybackStateCompatCustomAction21 = 0;
                int iPlaybackStateCompatCustomAction22 = 0;
                int iPlaybackStateCompatCustomAction23 = 0;
                while (parcel.dataPosition() < iWrite29) {
                    int i29 = parcel.readInt();
                    char c18 = (char) i29;
                    if (c18 == 1) {
                        iPlaybackStateCompatCustomAction20 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i29);
                    } else if (c18 == 2) {
                        iPlaybackStateCompatCustomAction21 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i29);
                    } else if (c18 == 3) {
                        iPlaybackStateCompatCustomAction22 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i29);
                    } else if (c18 == 4) {
                        iPlaybackStateCompatCustomAction23 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i29);
                    } else if (c18 != 5) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i29);
                    } else {
                        jPlaybackStateCompat2 = UrlUtils.PlaybackStateCompat(parcel, i29);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite29)});
                return new zzyu(jPlaybackStateCompat2, iPlaybackStateCompatCustomAction20, iPlaybackStateCompatCustomAction21, iPlaybackStateCompatCustomAction22, iPlaybackStateCompatCustomAction23);
            default:
                int iWrite30 = UrlUtils.write(parcel);
                String strSerializer70 = null;
                String strSerializer71 = null;
                String strSerializer72 = null;
                String strSerializer73 = null;
                String strSerializer74 = null;
                String strSerializer75 = null;
                String strSerializer76 = null;
                String strSerializer77 = null;
                String strSerializer78 = null;
                String strSerializer79 = null;
                String strSerializer80 = null;
                String strSerializer81 = null;
                String strSerializer82 = null;
                while (parcel.dataPosition() < iWrite30) {
                    int i30 = parcel.readInt();
                    String str = strSerializer81;
                    switch ((char) i30) {
                        case 2:
                            strSerializer = UrlUtils.serializer(parcel, i30);
                            break;
                        case 3:
                            strSerializer70 = UrlUtils.serializer(parcel, i30);
                            break;
                        case 4:
                            strSerializer71 = UrlUtils.serializer(parcel, i30);
                            break;
                        case 5:
                            strSerializer72 = UrlUtils.serializer(parcel, i30);
                            break;
                        case 6:
                            strSerializer73 = UrlUtils.serializer(parcel, i30);
                            break;
                        case 7:
                            strSerializer74 = UrlUtils.serializer(parcel, i30);
                            break;
                        case '\b':
                            strSerializer75 = UrlUtils.serializer(parcel, i30);
                            break;
                        case '\t':
                            strSerializer76 = UrlUtils.serializer(parcel, i30);
                            break;
                        case '\n':
                            strSerializer77 = UrlUtils.serializer(parcel, i30);
                            break;
                        case 11:
                            strSerializer78 = UrlUtils.serializer(parcel, i30);
                            break;
                        case '\f':
                            strSerializer79 = UrlUtils.serializer(parcel, i30);
                            break;
                        case '\r':
                            strSerializer80 = UrlUtils.serializer(parcel, i30);
                            break;
                        case 14:
                            strSerializer81 = UrlUtils.serializer(parcel, i30);
                            continue;
                        case 15:
                            strSerializer82 = UrlUtils.serializer(parcel, i30);
                            break;
                        default:
                            UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i30);
                            break;
                    }
                    strSerializer81 = str;
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite30)});
                zzm zzmVar2 = new zzm();
                zzmVar2.IconCompatParcelizer = strSerializer;
                zzmVar2.write = strSerializer70;
                zzmVar2.read = strSerializer71;
                zzmVar2.RemoteActionCompatParcelizer = strSerializer72;
                zzmVar2.serializer = strSerializer73;
                zzmVar2.MediaDescriptionCompat = strSerializer74;
                zzmVar2.MediaSessionCompatQueueItem = strSerializer75;
                zzmVar2.RatingCompat = strSerializer76;
                zzmVar2.MediaMetadataCompat = strSerializer77;
                zzmVar2.MediaBrowserCompatMediaItem = strSerializer78;
                zzmVar2.MediaSessionCompatResultReceiverWrapper = strSerializer79;
                zzmVar2.MediaSessionCompatToken = strSerializer80;
                zzmVar2.ParcelableVolumeInfo = strSerializer81;
                zzmVar2.PlaybackStateCompatCustomAction = strSerializer82;
                return zzmVar2;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.RemoteActionCompatParcelizer) {
            case 0:
                return new zzi[i];
            case 1:
                return new zzn[i];
            case 2:
                return new zzo[i];
            case 3:
                return new zzp[i];
            case 4:
                return new zzq[i];
            case 5:
                return new zzr[i];
            case 6:
                return new zzs[i];
            case 7:
                return new zzt[i];
            case 8:
                return new zzah[i];
            case 9:
                return new zzan[i];
            case 10:
                return new zzu[i];
            case 11:
                return new zzj[i];
            case 12:
                return new zzk[i];
            case 13:
                return new zzxp[i];
            case 14:
                return new zzl[i];
            case 15:
                return new zzyb[i];
            case 16:
                return new zzyd[i];
            case 17:
                return new zzxq[i];
            case 18:
                return new zzxr[i];
            case 19:
                return new zzxs[i];
            case 20:
                return new zzxt[i];
            case 21:
                return new zzxu[i];
            case 22:
                return new zzxv[i];
            case 23:
                return new zzxw[i];
            case 24:
                return new zzxx[i];
            case 25:
                return new zzxy[i];
            case 26:
                return new zzxz[i];
            case 27:
                return new zzya[i];
            case 28:
                return new zzyu[i];
            default:
                return new zzm[i];
        }
    }
}
