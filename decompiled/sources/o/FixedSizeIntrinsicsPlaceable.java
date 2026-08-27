package o;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_face.zzd;
import com.google.android.gms.internal.mlkit_vision_face.zzf;
import com.google.android.gms.internal.mlkit_vision_face.zzh;
import com.google.android.gms.internal.mlkit_vision_face.zzn;
import com.google.android.gms.internal.mlkit_vision_face.zzoq;
import com.google.android.gms.internal.mlkit_vision_face.zzos;
import com.google.android.gms.internal.mlkit_vision_face.zzou;
import com.google.android.gms.internal.mlkit_vision_face.zzow;
import com.google.android.gms.internal.mlkit_vision_face.zzp;
import com.google.android.gms.internal.mlkit_vision_face.zzpc;
import io.sentry.util.UrlUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class FixedSizeIntrinsicsPlaceable implements Parcelable.Creator {
    public final /* synthetic */ int serializer;

    public /* synthetic */ FixedSizeIntrinsicsPlaceable(int i) {
        this.serializer = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        float fRatingCompat = 0.0f;
        PointF[] pointFArr = null;
        PointF pointF = null;
        ArrayList arrayListWrite = null;
        int iPlaybackStateCompatCustomAction = 0;
        switch (this.serializer) {
            case 0:
                int iWrite = UrlUtils.write(parcel);
                while (parcel.dataPosition() < iWrite) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 2) {
                        pointFArr = (PointF[]) UrlUtils.serializer(parcel, i, PointF.CREATOR);
                    } else if (c != 3) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i);
                    } else {
                        iPlaybackStateCompatCustomAction = UrlUtils.PlaybackStateCompatCustomAction(parcel, i);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite)});
                return new zzd(pointFArr, iPlaybackStateCompatCustomAction);
            case 1:
                int iWrite2 = UrlUtils.write(parcel);
                float fRatingCompat2 = Float.MAX_VALUE;
                float fRatingCompat3 = Float.MAX_VALUE;
                float fRatingCompat4 = Float.MAX_VALUE;
                float fRatingCompat5 = -1.0f;
                float fRatingCompat6 = 0.0f;
                float fRatingCompat7 = 0.0f;
                float fRatingCompat8 = 0.0f;
                float fRatingCompat9 = 0.0f;
                float fRatingCompat10 = 0.0f;
                float fRatingCompat11 = 0.0f;
                float fRatingCompat12 = 0.0f;
                zzn[] zznVarArr = null;
                zzd[] zzdVarArr = null;
                int iPlaybackStateCompatCustomAction2 = 0;
                int iPlaybackStateCompatCustomAction3 = 0;
                while (parcel.dataPosition() < iWrite2) {
                    int i2 = parcel.readInt();
                    switch ((char) i2) {
                        case 1:
                            iPlaybackStateCompatCustomAction2 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i2);
                            break;
                        case 2:
                            iPlaybackStateCompatCustomAction3 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i2);
                            break;
                        case 3:
                            fRatingCompat6 = UrlUtils.RatingCompat(parcel, i2);
                            break;
                        case 4:
                            fRatingCompat7 = UrlUtils.RatingCompat(parcel, i2);
                            break;
                        case 5:
                            fRatingCompat8 = UrlUtils.RatingCompat(parcel, i2);
                            break;
                        case 6:
                            fRatingCompat9 = UrlUtils.RatingCompat(parcel, i2);
                            break;
                        case 7:
                            fRatingCompat2 = UrlUtils.RatingCompat(parcel, i2);
                            break;
                        case '\b':
                            fRatingCompat3 = UrlUtils.RatingCompat(parcel, i2);
                            break;
                        case '\t':
                            zznVarArr = (zzn[]) UrlUtils.serializer(parcel, i2, zzn.CREATOR);
                            break;
                        case '\n':
                            fRatingCompat10 = UrlUtils.RatingCompat(parcel, i2);
                            break;
                        case 11:
                            fRatingCompat11 = UrlUtils.RatingCompat(parcel, i2);
                            break;
                        case '\f':
                            fRatingCompat12 = UrlUtils.RatingCompat(parcel, i2);
                            break;
                        case '\r':
                            zzdVarArr = (zzd[]) UrlUtils.serializer(parcel, i2, zzd.CREATOR);
                            break;
                        case 14:
                            fRatingCompat4 = UrlUtils.RatingCompat(parcel, i2);
                            break;
                        case 15:
                            fRatingCompat5 = UrlUtils.RatingCompat(parcel, i2);
                            break;
                        default:
                            UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i2);
                            break;
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite2)});
                return new zzf(iPlaybackStateCompatCustomAction2, iPlaybackStateCompatCustomAction3, fRatingCompat6, fRatingCompat7, fRatingCompat8, fRatingCompat9, fRatingCompat2, fRatingCompat3, fRatingCompat4, zznVarArr, fRatingCompat10, fRatingCompat11, fRatingCompat12, zzdVarArr, fRatingCompat5);
            case 2:
                int iWrite3 = UrlUtils.write(parcel);
                float fRatingCompat13 = -1.0f;
                int iPlaybackStateCompatCustomAction4 = 0;
                int iPlaybackStateCompatCustomAction5 = 0;
                int iPlaybackStateCompatCustomAction6 = 0;
                boolean zMediaSessionCompatQueueItem = false;
                boolean zMediaSessionCompatQueueItem2 = false;
                while (parcel.dataPosition() < iWrite3) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 2:
                            iPlaybackStateCompatCustomAction4 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i3);
                            break;
                        case 3:
                            iPlaybackStateCompatCustomAction5 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i3);
                            break;
                        case 4:
                            iPlaybackStateCompatCustomAction6 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i3);
                            break;
                        case 5:
                            zMediaSessionCompatQueueItem = UrlUtils.MediaSessionCompatQueueItem(parcel, i3);
                            break;
                        case 6:
                            zMediaSessionCompatQueueItem2 = UrlUtils.MediaSessionCompatQueueItem(parcel, i3);
                            break;
                        case 7:
                            fRatingCompat13 = UrlUtils.RatingCompat(parcel, i3);
                            break;
                        default:
                            UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i3);
                            break;
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite3)});
                return new zzh(iPlaybackStateCompatCustomAction4, iPlaybackStateCompatCustomAction5, iPlaybackStateCompatCustomAction6, zMediaSessionCompatQueueItem, zMediaSessionCompatQueueItem2, fRatingCompat13);
            case 3:
                int iWrite4 = UrlUtils.write(parcel);
                float fRatingCompat14 = 0.0f;
                int iPlaybackStateCompatCustomAction7 = 0;
                while (parcel.dataPosition() < iWrite4) {
                    int i4 = parcel.readInt();
                    char c2 = (char) i4;
                    if (c2 == 1) {
                        iPlaybackStateCompatCustomAction = UrlUtils.PlaybackStateCompatCustomAction(parcel, i4);
                    } else if (c2 == 2) {
                        fRatingCompat = UrlUtils.RatingCompat(parcel, i4);
                    } else if (c2 == 3) {
                        fRatingCompat14 = UrlUtils.RatingCompat(parcel, i4);
                    } else if (c2 != 4) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i4);
                    } else {
                        iPlaybackStateCompatCustomAction7 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i4);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite4)});
                return new zzn(fRatingCompat, fRatingCompat14, iPlaybackStateCompatCustomAction, iPlaybackStateCompatCustomAction7);
            case 4:
                int iWrite5 = UrlUtils.write(parcel);
                long jPlaybackStateCompat = 0;
                int iPlaybackStateCompatCustomAction8 = 0;
                int iPlaybackStateCompatCustomAction9 = 0;
                int iPlaybackStateCompatCustomAction10 = 0;
                int iPlaybackStateCompatCustomAction11 = 0;
                while (parcel.dataPosition() < iWrite5) {
                    int i5 = parcel.readInt();
                    char c3 = (char) i5;
                    if (c3 == 1) {
                        iPlaybackStateCompatCustomAction8 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i5);
                    } else if (c3 == 2) {
                        iPlaybackStateCompatCustomAction9 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i5);
                    } else if (c3 == 3) {
                        iPlaybackStateCompatCustomAction10 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i5);
                    } else if (c3 == 4) {
                        iPlaybackStateCompatCustomAction11 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i5);
                    } else if (c3 != 5) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i5);
                    } else {
                        jPlaybackStateCompat = UrlUtils.PlaybackStateCompat(parcel, i5);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite5)});
                return new zzoq(jPlaybackStateCompat, iPlaybackStateCompatCustomAction8, iPlaybackStateCompatCustomAction9, iPlaybackStateCompatCustomAction10, iPlaybackStateCompatCustomAction11);
            case 5:
                int iWrite6 = UrlUtils.write(parcel);
                while (parcel.dataPosition() < iWrite6) {
                    int i6 = parcel.readInt();
                    char c4 = (char) i6;
                    if (c4 == 1) {
                        iPlaybackStateCompatCustomAction = UrlUtils.PlaybackStateCompatCustomAction(parcel, i6);
                    } else if (c4 != 2) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i6);
                    } else {
                        arrayListWrite = UrlUtils.write(parcel, i6, PointF.CREATOR);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite6)});
                return new zzos(iPlaybackStateCompatCustomAction, arrayListWrite);
            case 6:
                int iWrite7 = UrlUtils.write(parcel);
                float fRatingCompat15 = 0.0f;
                int iPlaybackStateCompatCustomAction12 = 0;
                int iPlaybackStateCompatCustomAction13 = 0;
                int iPlaybackStateCompatCustomAction14 = 0;
                int iPlaybackStateCompatCustomAction15 = 0;
                boolean zMediaSessionCompatQueueItem3 = false;
                while (parcel.dataPosition() < iWrite7) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 1:
                            iPlaybackStateCompatCustomAction12 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i7);
                            break;
                        case 2:
                            iPlaybackStateCompatCustomAction13 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i7);
                            break;
                        case 3:
                            iPlaybackStateCompatCustomAction14 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i7);
                            break;
                        case 4:
                            iPlaybackStateCompatCustomAction15 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i7);
                            break;
                        case 5:
                            zMediaSessionCompatQueueItem3 = UrlUtils.MediaSessionCompatQueueItem(parcel, i7);
                            break;
                        case 6:
                            fRatingCompat15 = UrlUtils.RatingCompat(parcel, i7);
                            break;
                        default:
                            UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i7);
                            break;
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite7)});
                return new zzou(iPlaybackStateCompatCustomAction12, iPlaybackStateCompatCustomAction13, iPlaybackStateCompatCustomAction14, iPlaybackStateCompatCustomAction15, zMediaSessionCompatQueueItem3, fRatingCompat15);
            case 7:
                int iWrite8 = UrlUtils.write(parcel);
                float fRatingCompat16 = 0.0f;
                float fRatingCompat17 = 0.0f;
                float fRatingCompat18 = 0.0f;
                float fRatingCompat19 = 0.0f;
                float fRatingCompat20 = 0.0f;
                float fRatingCompat21 = 0.0f;
                float fRatingCompat22 = 0.0f;
                android.graphics.Rect rect = null;
                ArrayList arrayListWrite2 = null;
                ArrayList arrayListWrite3 = null;
                int iPlaybackStateCompatCustomAction16 = 0;
                while (parcel.dataPosition() < iWrite8) {
                    int i8 = parcel.readInt();
                    switch ((char) i8) {
                        case 1:
                            iPlaybackStateCompatCustomAction16 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i8);
                            break;
                        case 2:
                            rect = (android.graphics.Rect) UrlUtils.read(parcel, i8, android.graphics.Rect.CREATOR);
                            break;
                        case 3:
                            fRatingCompat16 = UrlUtils.RatingCompat(parcel, i8);
                            break;
                        case 4:
                            fRatingCompat17 = UrlUtils.RatingCompat(parcel, i8);
                            break;
                        case 5:
                            fRatingCompat18 = UrlUtils.RatingCompat(parcel, i8);
                            break;
                        case 6:
                            fRatingCompat19 = UrlUtils.RatingCompat(parcel, i8);
                            break;
                        case 7:
                            fRatingCompat20 = UrlUtils.RatingCompat(parcel, i8);
                            break;
                        case '\b':
                            fRatingCompat21 = UrlUtils.RatingCompat(parcel, i8);
                            break;
                        case '\t':
                            fRatingCompat22 = UrlUtils.RatingCompat(parcel, i8);
                            break;
                        case '\n':
                            arrayListWrite2 = UrlUtils.write(parcel, i8, zzpc.CREATOR);
                            break;
                        case 11:
                            arrayListWrite3 = UrlUtils.write(parcel, i8, zzos.CREATOR);
                            break;
                        default:
                            UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i8);
                            break;
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite8)});
                return new zzow(iPlaybackStateCompatCustomAction16, rect, fRatingCompat16, fRatingCompat17, fRatingCompat18, fRatingCompat19, fRatingCompat20, fRatingCompat21, fRatingCompat22, arrayListWrite2, arrayListWrite3);
            case 8:
                int iWrite9 = UrlUtils.write(parcel);
                while (parcel.dataPosition() < iWrite9) {
                    int i9 = parcel.readInt();
                    char c5 = (char) i9;
                    if (c5 == 1) {
                        iPlaybackStateCompatCustomAction = UrlUtils.PlaybackStateCompatCustomAction(parcel, i9);
                    } else if (c5 != 2) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i9);
                    } else {
                        pointF = (PointF) UrlUtils.read(parcel, i9, PointF.CREATOR);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite9)});
                return new zzpc(iPlaybackStateCompatCustomAction, pointF);
            default:
                int iWrite10 = UrlUtils.write(parcel);
                long jPlaybackStateCompat2 = 0;
                int iPlaybackStateCompatCustomAction17 = 0;
                int iPlaybackStateCompatCustomAction18 = 0;
                int iPlaybackStateCompatCustomAction19 = 0;
                int iPlaybackStateCompatCustomAction20 = 0;
                while (parcel.dataPosition() < iWrite10) {
                    int i10 = parcel.readInt();
                    char c6 = (char) i10;
                    if (c6 == 2) {
                        iPlaybackStateCompatCustomAction17 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i10);
                    } else if (c6 == 3) {
                        iPlaybackStateCompatCustomAction18 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i10);
                    } else if (c6 == 4) {
                        iPlaybackStateCompatCustomAction19 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i10);
                    } else if (c6 == 5) {
                        jPlaybackStateCompat2 = UrlUtils.PlaybackStateCompat(parcel, i10);
                    } else if (c6 != 6) {
                        UrlUtils.MediaSessionCompatResultReceiverWrapper(parcel, i10);
                    } else {
                        iPlaybackStateCompatCustomAction20 = UrlUtils.PlaybackStateCompatCustomAction(parcel, i10);
                    }
                }
                UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), 282256975, -282256974, trackEventI.IconCompatParcelizer(), new Object[]{parcel, Integer.valueOf(iWrite10)});
                return new zzp(jPlaybackStateCompat2, iPlaybackStateCompatCustomAction17, iPlaybackStateCompatCustomAction18, iPlaybackStateCompatCustomAction19, iPlaybackStateCompatCustomAction20);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.serializer) {
            case 0:
                return new zzd[i];
            case 1:
                return new zzf[i];
            case 2:
                return new zzh[i];
            case 3:
                return new zzn[i];
            case 4:
                return new zzoq[i];
            case 5:
                return new zzos[i];
            case 6:
                return new zzou[i];
            case 7:
                return new zzow[i];
            case 8:
                return new zzpc[i];
            default:
                return new zzp[i];
        }
    }
}
