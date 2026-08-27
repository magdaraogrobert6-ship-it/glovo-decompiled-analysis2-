package o;

import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes4.dex */
public final class getFromStorage extends setEvaluationsfwf_client_release {
    public final short[][][] IconCompatParcelizer;
    public final byte[] MediaBrowserCompatMediaItem;
    public final short[][][] MediaDescriptionCompat;
    public final short[][][] MediaMetadataCompat;
    public final short[][][] MediaSessionCompatQueueItem;
    public final short[][] MediaSessionCompatResultReceiverWrapper;
    public final short[][] MediaSessionCompatToken;
    public final short[][] ParcelableVolumeInfo;
    public final byte[] PlaybackStateCompat;
    public final short[][] PlaybackStateCompatCustomAction;
    public final byte[] RatingCompat;
    public final short[][][] RemoteActionCompatParcelizer;
    public final short[][][] serializer;
    public final short[][][] write;

    public final byte[] read() {
        getFeaturesUpdateTime getfeaturesupdatetime = ((getRuntimeFeatureKeys) this.ResultReceiver).MediaSessionCompatToken;
        getFeaturesUpdateTime getfeaturesupdatetime2 = getFeaturesUpdateTime.COMPRESSED;
        byte[] bArr = this.PlaybackStateCompat;
        byte[] bArr2 = this.RatingCompat;
        if (getfeaturesupdatetime == getfeaturesupdatetime2) {
            return accessbootstrapIfNeeded.read(bArr2, bArr);
        }
        return accessbootstrapIfNeeded.read(getfeaturesupdatetime == getfeaturesupdatetime2 ? accessbootstrapIfNeeded.read(bArr2, bArr) : accessbootstrapIfNeeded.read(accessbootstrapIfNeeded.read(accessbootstrapIfNeeded.read(accessbootstrapIfNeeded.read(accessbootstrapIfNeeded.read(accessbootstrapIfNeeded.read(accessbootstrapIfNeeded.read(accessbootstrapIfNeeded.read(accessbootstrapIfNeeded.read(accessbootstrapIfNeeded.read(accessbootstrapIfNeeded.read(bArr, r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.read(this.PlaybackStateCompatCustomAction)), r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.read(this.MediaSessionCompatResultReceiverWrapper)), r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.read(this.ParcelableVolumeInfo)), r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.read(this.MediaSessionCompatToken)), r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.RemoteActionCompatParcelizer(this.write, true)), r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.RemoteActionCompatParcelizer(this.IconCompatParcelizer, false)), r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, true)), r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.RemoteActionCompatParcelizer(this.serializer, false)), r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.RemoteActionCompatParcelizer(this.MediaMetadataCompat, false)), r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.RemoteActionCompatParcelizer(this.MediaSessionCompatQueueItem, true)), r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.RemoteActionCompatParcelizer(this.MediaDescriptionCompat, false)), this.MediaBrowserCompatMediaItem);
    }

    public getFromStorage(getRuntimeFeatureKeys getruntimefeaturekeys, byte[] bArr) {
        super(true, getruntimefeaturekeys);
        getEvent getevent = getruntimefeaturekeys.MediaSessionCompatQueueItem;
        int i = getruntimefeaturekeys.PlaybackStateCompat;
        int i2 = getruntimefeaturekeys.RatingCompat;
        int i3 = getruntimefeaturekeys.PlaybackStateCompatCustomAction;
        getFeaturesUpdateTime getfeaturesupdatetime = getruntimefeaturekeys.MediaSessionCompatToken;
        getFeaturesUpdateTime getfeaturesupdatetime2 = getFeaturesUpdateTime.COMPRESSED;
        Class cls = Short.TYPE;
        if (getfeaturesupdatetime == getfeaturesupdatetime2) {
            byte[] bArrSerializer = accessbootstrapIfNeeded.serializer(bArr, 0, 32);
            this.RatingCompat = bArrSerializer;
            byte[] bArrSerializer2 = accessbootstrapIfNeeded.serializer(bArr, 32, 64);
            this.PlaybackStateCompat = bArrSerializer2;
            byte[] bArrRemoteActionCompatParcelizer = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArrSerializer2);
            byte[] bArrRemoteActionCompatParcelizer2 = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArrSerializer);
            decodeHoldouts decodeholdouts = new decodeHoldouts(bArrRemoteActionCompatParcelizer, getevent);
            decodeHoldouts decodeholdouts2 = new decodeHoldouts(bArrRemoteActionCompatParcelizer2, getevent);
            short[][] sArrWrite = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.write(decodeholdouts, i2, i);
            short[][] sArrWrite2 = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.write(decodeholdouts, i3, i2);
            short[][] sArrWrite3 = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.write(decodeholdouts, i3, i);
            short[][] sArrWrite4 = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.write(decodeholdouts, i2, i);
            short[][] sArrWrite5 = decodeInitialData.write(decodeInitialData.read(sArrWrite2, sArrWrite4), sArrWrite3);
            short[][][] sArrIconCompatParcelizer = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.IconCompatParcelizer(decodeholdouts2, i2, i3, i3, true);
            short[][][] sArrIconCompatParcelizer2 = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.IconCompatParcelizer(decodeholdouts2, i2, i3, i2, false);
            short[][][] sArrIconCompatParcelizer3 = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.IconCompatParcelizer(decodeholdouts2, i, i3, i3, true);
            short[][][] sArrIconCompatParcelizer4 = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.IconCompatParcelizer(decodeholdouts2, i, i3, i2, false);
            short[][][] sArrIconCompatParcelizer5 = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.IconCompatParcelizer(decodeholdouts2, i, i3, i, false);
            short[][][] sArrIconCompatParcelizer6 = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.IconCompatParcelizer(decodeholdouts2, i, i2, i2, true);
            short[][][] sArrIconCompatParcelizer7 = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.IconCompatParcelizer(decodeholdouts2, i, i2, i, false);
            short[][][] sArr = decodeInitialData.read(sArrWrite, sArrIconCompatParcelizer3, sArrIconCompatParcelizer);
            short[][][] sArr2 = decodeInitialData.read(sArrWrite, sArrIconCompatParcelizer4, sArrIconCompatParcelizer2);
            short[][][] sArrIconCompatParcelizer8 = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.IconCompatParcelizer(sArr);
            short[][][] sArr3 = new short[i2][][];
            int i4 = 0;
            while (i4 < i2) {
                short[][][] sArr4 = sArr;
                short[][] sArr5 = decodeInitialData.read(sArr[i4]);
                sArr3[i4] = sArr5;
                short[][] sArr6 = decodeInitialData.read(sArr5, sArrWrite2);
                sArr3[i4] = sArr6;
                sArr3[i4] = decodeInitialData.write(sArr6, sArr2[i4]);
                i4++;
                i2 = i2;
                sArr = sArr4;
            }
            short[][][] sArr7 = new short[i][][];
            short[][][] sArr8 = new short[i][][];
            short[][][] sArr9 = new short[i][][];
            short[][][] sArr10 = new short[i][][];
            short[][][] sArrIconCompatParcelizer9 = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.IconCompatParcelizer(sArrIconCompatParcelizer3);
            int i5 = 0;
            while (i5 < i) {
                int i6 = i;
                short[][] sArr11 = decodeInitialData.read(sArrIconCompatParcelizer3[i5]);
                byte[] bArr2 = bArrRemoteActionCompatParcelizer;
                short[][] sArr12 = decodeInitialData.read(sArr11, sArrWrite2);
                sArr7[i5] = sArr12;
                short[][][] sArr13 = sArrIconCompatParcelizer7;
                sArr7[i5] = decodeInitialData.write(sArr12, sArrIconCompatParcelizer4[i5]);
                sArr8[i5] = decodeInitialData.read(sArr11, sArrWrite5);
                short[][] sArrWrite6 = decodeInitialData.write(sArr8[i5], decodeInitialData.read(sArrIconCompatParcelizer4[i5], sArrWrite4));
                sArr8[i5] = sArrWrite6;
                sArr8[i5] = decodeInitialData.write(sArrWrite6, sArrIconCompatParcelizer5[i5]);
                short[][] sArrWrite7 = decodeInitialData.write(decodeInitialData.read(sArrIconCompatParcelizer3[i5], sArrWrite2), sArrIconCompatParcelizer4[i5]);
                short[][] sArrWrite8 = decodeInitialData.write(sArrWrite2);
                short[][] sArr14 = decodeInitialData.read(sArrWrite8, sArrWrite7);
                sArr9[i5] = sArr14;
                short[][] sArrWrite9 = decodeInitialData.write(sArr14, sArrIconCompatParcelizer6[i5]);
                sArr9[i5] = sArrWrite9;
                short[][][] sArr15 = sArrIconCompatParcelizer3;
                if (sArrWrite9.length == sArrWrite9[0].length) {
                    short[][] sArr16 = (short[][]) Array.newInstance((Class<?>) cls, sArrWrite9.length, sArrWrite9.length);
                    short[][][] sArr17 = sArrIconCompatParcelizer5;
                    int i7 = 0;
                    while (i7 < sArrWrite9.length) {
                        sArr16[i7][i7] = sArrWrite9[i7][i7];
                        int i8 = i7 + 1;
                        Class cls2 = cls;
                        while (i8 < sArrWrite9[0].length) {
                            short[] sArr18 = sArr16[i7];
                            short s = sArrWrite9[i7][i8];
                            short s2 = sArrWrite9[i8][i7];
                            byte[][] bArr3 = getFeatureWithLock.read;
                            sArr18[i8] = (short) (s ^ s2);
                            i8++;
                            sArrWrite9 = sArrWrite9;
                        }
                        i7 = i8;
                        cls = cls2;
                    }
                    sArr9[i5] = sArr16;
                    sArr10[i5] = decodeInitialData.read(sArrWrite8, sArr8[i5]);
                    sArr10[i5] = decodeInitialData.write(sArr10[i5], decodeInitialData.read(decodeInitialData.write(sArrIconCompatParcelizer4[i5]), sArrWrite5));
                    short[][] sArrWrite10 = decodeInitialData.write(sArr10[i5], decodeInitialData.read(decodeInitialData.read(sArrIconCompatParcelizer6[i5]), sArrWrite4));
                    sArr10[i5] = sArrWrite10;
                    sArr10[i5] = decodeInitialData.write(sArrWrite10, sArr13[i5]);
                    i5++;
                    bArrRemoteActionCompatParcelizer = bArr2;
                    i = i6;
                    sArrIconCompatParcelizer7 = sArr13;
                    sArrIconCompatParcelizer3 = sArr15;
                    sArrIconCompatParcelizer5 = sArr17;
                } else {
                    ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Computation to upper triangular matrix is not possible!");
                    throw null;
                }
            }
            getFromStorage getfromstorage = new getFromStorage(getruntimefeaturekeys, bArrRemoteActionCompatParcelizer, sArrWrite, sArrWrite2, sArrWrite4, sArrWrite5, sArrIconCompatParcelizer8, sArr3, sArrIconCompatParcelizer9, sArr7, sArr8, sArr9, sArr10);
            this.MediaBrowserCompatMediaItem = null;
            this.PlaybackStateCompatCustomAction = getfromstorage.PlaybackStateCompatCustomAction;
            this.MediaSessionCompatResultReceiverWrapper = getfromstorage.MediaSessionCompatResultReceiverWrapper;
            this.MediaSessionCompatToken = getfromstorage.MediaSessionCompatToken;
            this.ParcelableVolumeInfo = getfromstorage.ParcelableVolumeInfo;
            this.write = getfromstorage.write;
            this.IconCompatParcelizer = getfromstorage.IconCompatParcelizer;
            this.RemoteActionCompatParcelizer = getfromstorage.RemoteActionCompatParcelizer;
            this.serializer = getfromstorage.serializer;
            this.MediaMetadataCompat = getfromstorage.MediaMetadataCompat;
            this.MediaSessionCompatQueueItem = getfromstorage.MediaSessionCompatQueueItem;
            this.MediaDescriptionCompat = getfromstorage.MediaDescriptionCompat;
            return;
        }
        short[][] sArr19 = (short[][]) Array.newInstance((Class<?>) cls, i2, i);
        this.PlaybackStateCompatCustomAction = sArr19;
        short[][] sArr20 = (short[][]) Array.newInstance((Class<?>) cls, i3, i2);
        this.MediaSessionCompatResultReceiverWrapper = sArr20;
        short[][] sArr21 = (short[][]) Array.newInstance((Class<?>) cls, i3, i);
        this.ParcelableVolumeInfo = sArr21;
        short[][] sArr22 = (short[][]) Array.newInstance((Class<?>) cls, i2, i);
        this.MediaSessionCompatToken = sArr22;
        short[][][] sArr23 = (short[][][]) Array.newInstance((Class<?>) cls, i2, i3, i3);
        this.write = sArr23;
        short[][][] sArr24 = (short[][][]) Array.newInstance((Class<?>) cls, i2, i3, i2);
        this.IconCompatParcelizer = sArr24;
        short[][][] sArr25 = (short[][][]) Array.newInstance((Class<?>) cls, i, i3, i3);
        this.RemoteActionCompatParcelizer = sArr25;
        short[][][] sArr26 = (short[][][]) Array.newInstance((Class<?>) cls, i, i3, i2);
        this.serializer = sArr26;
        short[][][] sArr27 = (short[][][]) Array.newInstance((Class<?>) cls, i, i3, i);
        this.MediaMetadataCompat = sArr27;
        short[][][] sArr28 = (short[][][]) Array.newInstance((Class<?>) cls, i, i2, i2);
        this.MediaSessionCompatQueueItem = sArr28;
        short[][][] sArr29 = (short[][][]) Array.newInstance((Class<?>) cls, i, i2, i);
        this.MediaDescriptionCompat = sArr29;
        this.RatingCompat = null;
        byte[] bArrSerializer3 = accessbootstrapIfNeeded.serializer(bArr, 0, 32);
        this.PlaybackStateCompat = bArrSerializer3;
        int length = bArrSerializer3.length;
        int iSerializer = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.serializer(sArr19, bArr, length) + length;
        int iSerializer2 = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.serializer(sArr20, bArr, iSerializer) + iSerializer;
        int iSerializer3 = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.serializer(sArr21, bArr, iSerializer2) + iSerializer2;
        int iSerializer4 = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.serializer(sArr22, bArr, iSerializer3) + iSerializer3;
        int iSerializer5 = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.serializer(sArr23, bArr, iSerializer4, true) + iSerializer4;
        int iSerializer6 = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.serializer(sArr24, bArr, iSerializer5, false) + iSerializer5;
        int iSerializer7 = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.serializer(sArr25, bArr, iSerializer6, true) + iSerializer6;
        int iSerializer8 = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.serializer(sArr26, bArr, iSerializer7, false) + iSerializer7;
        int iSerializer9 = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.serializer(sArr27, bArr, iSerializer8, false) + iSerializer8;
        int iSerializer10 = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.serializer(sArr28, bArr, iSerializer9, true) + iSerializer9;
        this.MediaBrowserCompatMediaItem = accessbootstrapIfNeeded.serializer(bArr, r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.serializer(sArr29, bArr, iSerializer10, false) + iSerializer10, bArr.length);
    }

    public getFromStorage(getRuntimeFeatureKeys getruntimefeaturekeys, byte[] bArr, short[][] sArr, short[][] sArr2, short[][] sArr3, short[][] sArr4, short[][][] sArr5, short[][][] sArr6, short[][][] sArr7, short[][][] sArr8, short[][][] sArr9, short[][][] sArr10, short[][][] sArr11) {
        super(true, getruntimefeaturekeys);
        this.RatingCompat = null;
        this.MediaBrowserCompatMediaItem = null;
        this.PlaybackStateCompat = (byte[]) bArr.clone();
        this.PlaybackStateCompatCustomAction = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.RemoteActionCompatParcelizer(sArr);
        this.MediaSessionCompatResultReceiverWrapper = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.RemoteActionCompatParcelizer(sArr2);
        this.MediaSessionCompatToken = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.RemoteActionCompatParcelizer(sArr3);
        this.ParcelableVolumeInfo = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.RemoteActionCompatParcelizer(sArr4);
        this.write = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.IconCompatParcelizer(sArr5);
        this.IconCompatParcelizer = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.IconCompatParcelizer(sArr6);
        this.RemoteActionCompatParcelizer = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.IconCompatParcelizer(sArr7);
        this.serializer = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.IconCompatParcelizer(sArr8);
        this.MediaMetadataCompat = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.IconCompatParcelizer(sArr9);
        this.MediaSessionCompatQueueItem = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.IconCompatParcelizer(sArr10);
        this.MediaDescriptionCompat = r8lambdaSMZfgeuuAmx3jlwU4oNMm8PFms.IconCompatParcelizer(sArr11);
    }
}
