package o;

import com.roadrunner.domain.util.RetryWithDelay;
import com.sentiance.core.model.thrift.O$b;
import java.lang.reflect.Array;
import org.tukaani.xz.CorruptedInputException;

/* JADX INFO: loaded from: classes4.dex */
public final class FwFClientExtensionKt {
    public final short[][] IconCompatParcelizer;
    public final RetryWithDelay MediaBrowserCompatMediaItem;
    public final short[] MediaDescriptionCompat;
    public final short[] MediaMetadataCompat;
    public final short[][] MediaSessionCompatQueueItem;
    public final O$b MediaSessionCompatResultReceiverWrapper;
    public final int MediaSessionCompatToken;
    public final FwFClientConfigKt ParcelableVolumeInfo;
    public final setUseEvaluationsCachefwf_client_release PlaybackStateCompat;
    public final O$b PlaybackStateCompatCustomAction;
    public final short[] RatingCompat;
    public final short[][] RemoteActionCompatParcelizer;
    public final short[][] read;
    public final short[] serializer;
    public final short[] write;
    public final int[] ComponentActivity = new int[4];
    public final getUseEvaluationsCachefwf_client_release r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new getUseEvaluationsCachefwf_client_release(0);

    public FwFClientExtensionKt(setUseEvaluationsCachefwf_client_release setuseevaluationscachefwf_client_release, FwFClientConfigKt fwFClientConfigKt, int i, int i2, int i3) {
        Class cls = Short.TYPE;
        this.IconCompatParcelizer = (short[][]) Array.newInstance((Class<?>) cls, 12, 16);
        this.serializer = new short[12];
        this.RatingCompat = new short[12];
        this.MediaMetadataCompat = new short[12];
        this.MediaDescriptionCompat = new short[12];
        this.MediaSessionCompatQueueItem = (short[][]) Array.newInstance((Class<?>) cls, 12, 16);
        this.RemoteActionCompatParcelizer = (short[][]) Array.newInstance((Class<?>) cls, 4, 64);
        this.read = new short[][]{new short[2], new short[2], new short[4], new short[4], new short[8], new short[8], new short[16], new short[16], new short[32], new short[32]};
        this.write = new short[16];
        this.MediaSessionCompatToken = (1 << i3) - 1;
        this.PlaybackStateCompatCustomAction = new O$b(this);
        this.MediaSessionCompatResultReceiverWrapper = new O$b(this);
        this.PlaybackStateCompat = setuseevaluationscachefwf_client_release;
        this.ParcelableVolumeInfo = fwFClientConfigKt;
        this.MediaBrowserCompatMediaItem = new RetryWithDelay(this, i, i2);
        write();
    }

    public final void IconCompatParcelizer() throws CorruptedInputException {
        int iIconCompatParcelizer;
        int i;
        setUseEvaluationsCachefwf_client_release setuseevaluationscachefwf_client_release = this.PlaybackStateCompat;
        int i2 = setuseevaluationscachefwf_client_release.MediaMetadataCompat;
        if (i2 > 0) {
            setuseevaluationscachefwf_client_release.IconCompatParcelizer(setuseevaluationscachefwf_client_release.serializer, i2);
        }
        while (true) {
            int i3 = setuseevaluationscachefwf_client_release.MediaDescriptionCompat;
            int i4 = setuseevaluationscachefwf_client_release.IconCompatParcelizer;
            FwFClientConfigKt fwFClientConfigKt = this.ParcelableVolumeInfo;
            if (i3 >= i4) {
                fwFClientConfigKt.serializer();
                return;
            }
            int i5 = i3 & this.MediaSessionCompatToken;
            short[][] sArr = this.IconCompatParcelizer;
            getUseEvaluationsCachefwf_client_release getuseevaluationscachefwf_client_release = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            int iRemoteActionCompatParcelizer = 1;
            if (fwFClientConfigKt.IconCompatParcelizer(sArr[getuseevaluationscachefwf_client_release.write], i5) == 0) {
                RetryWithDelay retryWithDelay = this.MediaBrowserCompatMediaItem;
                setUseEvaluationsCachefwf_client_release setuseevaluationscachefwf_client_release2 = ((FwFClientExtensionKt) retryWithDelay.read).PlaybackStateCompat;
                int i6 = setuseevaluationscachefwf_client_release2.MediaDescriptionCompat;
                int i7 = i6 - 1;
                if (i6 <= 0) {
                    i7 += setuseevaluationscachefwf_client_release2.read;
                }
                byte b = setuseevaluationscachefwf_client_release2.RemoteActionCompatParcelizer[i7];
                int i8 = retryWithDelay.write;
                r8lambda1MNczrzuv4oWduWgKg6cjtSWs r8lambda1mnczrzuv4owduwgkg6cjtsws = ((r8lambda1MNczrzuv4oWduWgKg6cjtSWs[]) retryWithDelay.IconCompatParcelizer)[((b & 255) >> (8 - i8)) + ((i6 & retryWithDelay.RemoteActionCompatParcelizer) << i8)];
                short[] sArr2 = (short[]) r8lambda1mnczrzuv4owduwgkg6cjtsws.write;
                FwFClientExtensionKt fwFClientExtensionKt = (FwFClientExtensionKt) ((RetryWithDelay) r8lambda1mnczrzuv4owduwgkg6cjtsws.IconCompatParcelizer).read;
                setUseEvaluationsCachefwf_client_release setuseevaluationscachefwf_client_release3 = fwFClientExtensionKt.PlaybackStateCompat;
                FwFClientConfigKt fwFClientConfigKt2 = fwFClientExtensionKt.ParcelableVolumeInfo;
                getUseEvaluationsCachefwf_client_release getuseevaluationscachefwf_client_release2 = fwFClientExtensionKt.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                if (getuseevaluationscachefwf_client_release2.write < 7) {
                    iIconCompatParcelizer = 1;
                    do {
                        iIconCompatParcelizer = (iIconCompatParcelizer << 1) | fwFClientConfigKt2.IconCompatParcelizer(sArr2, iIconCompatParcelizer);
                    } while (iIconCompatParcelizer < 256);
                } else {
                    int i9 = fwFClientExtensionKt.ComponentActivity[0];
                    int i10 = setuseevaluationscachefwf_client_release3.MediaDescriptionCompat;
                    int i11 = (i10 - i9) - 1;
                    if (i9 >= i10) {
                        i11 += setuseevaluationscachefwf_client_release3.read;
                    }
                    int i12 = setuseevaluationscachefwf_client_release3.RemoteActionCompatParcelizer[i11] & 255;
                    int i13 = 1;
                    int i14 = 256;
                    do {
                        i12 <<= 1;
                        int i15 = i12 & i14;
                        int iIconCompatParcelizer2 = fwFClientConfigKt2.IconCompatParcelizer(sArr2, i14 + i15 + i13);
                        i13 = (i13 << 1) | iIconCompatParcelizer2;
                        i14 &= (~i15) ^ (0 - iIconCompatParcelizer2);
                    } while (i13 < 256);
                    iIconCompatParcelizer = i13;
                }
                byte[] bArr = setuseevaluationscachefwf_client_release3.RemoteActionCompatParcelizer;
                int i16 = setuseevaluationscachefwf_client_release3.MediaDescriptionCompat;
                int i17 = i16 + 1;
                setuseevaluationscachefwf_client_release3.MediaDescriptionCompat = i17;
                bArr[i16] = (byte) iIconCompatParcelizer;
                if (setuseevaluationscachefwf_client_release3.write < i17) {
                    setuseevaluationscachefwf_client_release3.write = i17;
                }
                int i18 = getuseevaluationscachefwf_client_release2.write;
                if (i18 <= 3) {
                    getuseevaluationscachefwf_client_release2.write = 0;
                } else if (i18 <= 9) {
                    getuseevaluationscachefwf_client_release2.write = i18 - 3;
                } else {
                    getuseevaluationscachefwf_client_release2.write = i18 - 6;
                }
            } else {
                int iIconCompatParcelizer3 = fwFClientConfigKt.IconCompatParcelizer(this.serializer, getuseevaluationscachefwf_client_release.write);
                int[] iArr = this.ComponentActivity;
                if (iIconCompatParcelizer3 == 0) {
                    getuseevaluationscachefwf_client_release.write = getuseevaluationscachefwf_client_release.write >= 7 ? 10 : 7;
                    iArr[3] = iArr[2];
                    iArr[2] = iArr[1];
                    iArr[1] = iArr[0];
                    int iRemoteActionCompatParcelizer2 = this.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(i5);
                    int iRemoteActionCompatParcelizer3 = fwFClientConfigKt.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer[iRemoteActionCompatParcelizer2 < 6 ? iRemoteActionCompatParcelizer2 - 2 : 3]);
                    if (iRemoteActionCompatParcelizer3 < 4) {
                        iArr[0] = iRemoteActionCompatParcelizer3;
                    } else {
                        int i19 = iRemoteActionCompatParcelizer3 >> 1;
                        int i20 = ((iRemoteActionCompatParcelizer3 & 1) | 2) << (i19 - 1);
                        iArr[0] = i20;
                        if (iRemoteActionCompatParcelizer3 < 14) {
                            short[] sArr3 = this.read[iRemoteActionCompatParcelizer3 - 4];
                            int i21 = 0;
                            int i22 = 0;
                            int i23 = 1;
                            while (true) {
                                int iIconCompatParcelizer4 = fwFClientConfigKt.IconCompatParcelizer(sArr3, i23);
                                i23 = (i23 << 1) | iIconCompatParcelizer4;
                                i21 |= iIconCompatParcelizer4 << i22;
                                if (i23 >= sArr3.length) {
                                    break;
                                } else {
                                    i22++;
                                }
                            }
                            iArr[0] = i20 | i21;
                        } else {
                            int i24 = i19 - 5;
                            int i25 = 0;
                            do {
                                fwFClientConfigKt.serializer();
                                int i26 = fwFClientConfigKt.RemoteActionCompatParcelizer >>> 1;
                                fwFClientConfigKt.RemoteActionCompatParcelizer = i26;
                                int i27 = fwFClientConfigKt.write;
                                int i28 = (i27 - i26) >>> 31;
                                fwFClientConfigKt.write = i27 - (i26 & (i28 - 1));
                                i25 = (i25 << 1) | (1 - i28);
                                i24--;
                            } while (i24 != 0);
                            int i29 = i20 | (i25 << 4);
                            iArr[0] = i29;
                            int i30 = 0;
                            int i31 = 0;
                            int i32 = 1;
                            while (true) {
                                short[] sArr4 = this.write;
                                int iIconCompatParcelizer5 = fwFClientConfigKt.IconCompatParcelizer(sArr4, i32);
                                i32 = (i32 << 1) | iIconCompatParcelizer5;
                                i30 |= iIconCompatParcelizer5 << i31;
                                if (i32 >= sArr4.length) {
                                    break;
                                } else {
                                    i31++;
                                }
                            }
                            iArr[0] = i29 | i30;
                        }
                    }
                    iRemoteActionCompatParcelizer = iRemoteActionCompatParcelizer2;
                } else {
                    if (fwFClientConfigKt.IconCompatParcelizer(this.RatingCompat, getuseevaluationscachefwf_client_release.write) != 0) {
                        if (fwFClientConfigKt.IconCompatParcelizer(this.MediaMetadataCompat, getuseevaluationscachefwf_client_release.write) == 0) {
                            i = iArr[1];
                        } else {
                            if (fwFClientConfigKt.IconCompatParcelizer(this.MediaDescriptionCompat, getuseevaluationscachefwf_client_release.write) == 0) {
                                i = iArr[2];
                            } else {
                                i = iArr[3];
                                iArr[3] = iArr[2];
                            }
                            iArr[2] = iArr[1];
                        }
                        iArr[1] = iArr[0];
                        iArr[0] = i;
                    } else if (fwFClientConfigKt.IconCompatParcelizer(this.MediaSessionCompatQueueItem[getuseevaluationscachefwf_client_release.write], i5) == 0) {
                        getuseevaluationscachefwf_client_release.write = getuseevaluationscachefwf_client_release.write >= 7 ? 11 : 9;
                    }
                    getuseevaluationscachefwf_client_release.write = getuseevaluationscachefwf_client_release.write < 7 ? 8 : 11;
                    iRemoteActionCompatParcelizer = this.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer(i5);
                }
                setuseevaluationscachefwf_client_release.IconCompatParcelizer(iArr[0], iRemoteActionCompatParcelizer);
            }
        }
    }

    public final void write() {
        int[] iArr = this.ComponentActivity;
        int i = 0;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write = 0;
        int i2 = 0;
        while (true) {
            short[][] sArr = this.IconCompatParcelizer;
            if (i2 >= sArr.length) {
                break;
            }
            FwFClientConfigKt.write(sArr[i2]);
            i2++;
        }
        FwFClientConfigKt.write(this.serializer);
        FwFClientConfigKt.write(this.RatingCompat);
        FwFClientConfigKt.write(this.MediaMetadataCompat);
        FwFClientConfigKt.write(this.MediaDescriptionCompat);
        int i3 = 0;
        while (true) {
            short[][] sArr2 = this.MediaSessionCompatQueueItem;
            if (i3 >= sArr2.length) {
                break;
            }
            FwFClientConfigKt.write(sArr2[i3]);
            i3++;
        }
        int i4 = 0;
        while (true) {
            short[][] sArr3 = this.RemoteActionCompatParcelizer;
            if (i4 >= sArr3.length) {
                break;
            }
            FwFClientConfigKt.write(sArr3[i4]);
            i4++;
        }
        int i5 = 0;
        while (true) {
            short[][] sArr4 = this.read;
            if (i5 >= sArr4.length) {
                break;
            }
            FwFClientConfigKt.write(sArr4[i5]);
            i5++;
        }
        FwFClientConfigKt.write(this.write);
        while (true) {
            r8lambda1MNczrzuv4oWduWgKg6cjtSWs[] r8lambda1mnczrzuv4owduwgkg6cjtswsArr = (r8lambda1MNczrzuv4oWduWgKg6cjtSWs[]) this.MediaBrowserCompatMediaItem.IconCompatParcelizer;
            if (i >= r8lambda1mnczrzuv4owduwgkg6cjtswsArr.length) {
                this.PlaybackStateCompatCustomAction.ParcelableVolumeInfo();
                this.MediaSessionCompatResultReceiverWrapper.ParcelableVolumeInfo();
                return;
            } else {
                FwFClientConfigKt.write((short[]) r8lambda1mnczrzuv4owduwgkg6cjtswsArr[i].write);
                i++;
            }
        }
    }
}
