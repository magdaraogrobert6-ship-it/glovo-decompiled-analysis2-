package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.domain.util.RetryWithDelay;

/* JADX INFO: loaded from: classes4.dex */
public final class UnreadCountDetailsChat extends getTangenttuRUvjQ {
    public final RetryWithDelay IconCompatParcelizer;
    public final EnumC0167getChatId MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public final /* synthetic */ getPushID MediaSessionCompatQueueItem;
    public int RemoteActionCompatParcelizer;
    public boolean read;
    public final RetryWithDelay serializer;
    public byte[] write = toJson.IconCompatParcelizer;

    @Override // o.getTangenttuRUvjQ
    public final boolean RemoteActionCompatParcelizer() {
        return !this.read;
    }

    @Override // o.getTangenttuRUvjQ
    public final int IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer - this.MediaMetadataCompat;
    }

    public UnreadCountDetailsChat(getPushID getpushid, EnumC0167getChatId enumC0167getChatId, int[] iArr, int[] iArr2) {
        this.MediaSessionCompatQueueItem = getpushid;
        this.MediaDescriptionCompat = enumC0167getChatId;
        this.IconCompatParcelizer = getPushID.read(iArr);
        this.serializer = getPushID.read(iArr2);
    }

    @Override // o.getTangenttuRUvjQ
    public final EnumC0167getChatId serializer() {
        return this.read ? EnumC0167getChatId.INITIAL : this.MediaDescriptionCompat;
    }

    @Override // o.getTangenttuRUvjQ
    public final int serializer(byte[] bArr, int i, int i2) {
        int iMin;
        int iMin2;
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (this.read) {
            return -1;
        }
        int i4 = this.RemoteActionCompatParcelizer - this.MediaMetadataCompat;
        if (i4 > 0) {
            iMin = Math.min(i2, i4);
            System.arraycopy(this.write, this.MediaMetadataCompat, bArr, i, iMin);
            this.MediaMetadataCompat += iMin;
        } else {
            iMin = 0;
        }
        while (iMin < i2) {
            getPushID getpushid = this.MediaSessionCompatQueueItem;
            getChatType getchattype = getpushid.MediaDescriptionCompat;
            InternalPointerEvent internalPointerEvent = getpushid.RatingCompat;
            byte[] bArr2 = (byte[]) internalPointerEvent.read;
            int i5 = getPushID.read(getchattype, this.IconCompatParcelizer);
            int i6 = 65535;
            if (i5 >= 256) {
                if (i5 <= 256) {
                    this.read = true;
                    break;
                }
                short s = getPushID.RemoteActionCompatParcelizer[i5 - 257];
                try {
                    int iAddExact = Math.addExact(s >>> 5, Math.toIntExact(getPushID.serializer(getpushid.MediaDescriptionCompat, s & 31)));
                    int i7 = getPushID.IconCompatParcelizer[getPushID.read(getpushid.MediaDescriptionCompat, this.serializer)];
                    try {
                        int iAddExact2 = Math.addExact(i7 >>> 4, Math.toIntExact(getPushID.serializer(getpushid.MediaDescriptionCompat, i7 & 15)));
                        if (this.write.length < iAddExact) {
                            this.write = new byte[iAddExact];
                        }
                        this.RemoteActionCompatParcelizer = iAddExact;
                        this.MediaMetadataCompat = i3;
                        byte[] bArr3 = this.write;
                        if (iAddExact2 > bArr2.length) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write(c8$$ExternalSyntheticOutline0.m(iAddExact2, "Illegal distance parameter: "));
                            return 0;
                        }
                        int i8 = internalPointerEvent.IconCompatParcelizer;
                        int i9 = (i8 - iAddExact2) & 65535;
                        if (!internalPointerEvent.RemoteActionCompatParcelizer && i9 >= i8) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write(c8$$ExternalSyntheticOutline0.m(iAddExact2, "Attempt to read beyond memory: dist="));
                            return i3;
                        }
                        int i10 = i3;
                        while (i10 < iAddExact) {
                            byte b = bArr2[i9];
                            int i11 = internalPointerEvent.IconCompatParcelizer;
                            bArr2[i11] = b;
                            int i12 = (i11 + 1) & i6;
                            if (!internalPointerEvent.RemoteActionCompatParcelizer && i12 < i11) {
                                internalPointerEvent.RemoteActionCompatParcelizer = true;
                            }
                            internalPointerEvent.IconCompatParcelizer = i12;
                            bArr3[i10] = b;
                            i10++;
                            i6 = 65535;
                            int i13 = (i9 + 1) & 65535;
                            if (!internalPointerEvent.RemoteActionCompatParcelizer && i13 < i9) {
                                internalPointerEvent.RemoteActionCompatParcelizer = true;
                            }
                            i9 = i13;
                        }
                        int i14 = this.RemoteActionCompatParcelizer - this.MediaMetadataCompat;
                        if (i14 > 0) {
                            iMin2 = Math.min(i2 - iMin, i14);
                            System.arraycopy(this.write, this.MediaMetadataCompat, bArr, i + iMin, iMin2);
                            this.MediaMetadataCompat += iMin2;
                        } else {
                            iMin2 = 0;
                        }
                        iMin = iMin2 + iMin;
                    } catch (ArithmeticException e) {
                        throw new IllegalArgumentException("Argument too large or result overflows", e);
                    }
                } catch (ArithmeticException e2) {
                    throw new IllegalArgumentException("Argument too large or result overflows", e2);
                }
            } else {
                int i15 = iMin + 1;
                byte b2 = (byte) i5;
                int i16 = internalPointerEvent.IconCompatParcelizer;
                bArr2[i16] = b2;
                int i17 = (i16 + 1) & 65535;
                if (!internalPointerEvent.RemoteActionCompatParcelizer && i17 < i16) {
                    internalPointerEvent.RemoteActionCompatParcelizer = true;
                }
                internalPointerEvent.IconCompatParcelizer = i17;
                bArr[iMin + i] = b2;
                iMin = i15;
            }
            i3 = 0;
        }
        return iMin;
    }
}
