package o;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class getTotalUnreadMessageCount extends getTangenttuRUvjQ {
    public final /* synthetic */ getPushID IconCompatParcelizer;
    public final long serializer;
    public long write;

    @Override // o.getTangenttuRUvjQ
    public final int IconCompatParcelizer() {
        long j = this.serializer;
        long j2 = this.write;
        getChatType getchattype = this.IconCompatParcelizer.MediaDescriptionCompat;
        return (int) Math.min(j - j2, ((((long) getchattype.write.available()) * 8) + ((long) getchattype.RemoteActionCompatParcelizer)) / 8);
    }

    @Override // o.getTangenttuRUvjQ
    public final boolean RemoteActionCompatParcelizer() {
        return this.write < this.serializer;
    }

    @Override // o.getTangenttuRUvjQ
    public final int serializer(byte[] bArr, int i, int i2) throws IOException {
        getPushID getpushid = this.IconCompatParcelizer;
        InternalPointerEvent internalPointerEvent = getpushid.RatingCompat;
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        int iMin = (int) Math.min(this.serializer - this.write, i2);
        while (i3 < iMin) {
            getChatType getchattype = getpushid.MediaDescriptionCompat;
            int i4 = 1;
            if (getchattype.RemoteActionCompatParcelizer > 0) {
                byte bSerializer = (byte) getPushID.serializer(getchattype, 8);
                byte[] bArr2 = (byte[]) internalPointerEvent.read;
                int i5 = internalPointerEvent.IconCompatParcelizer;
                bArr2[i5] = bSerializer;
                int i6 = (i5 + 1) & 65535;
                if (!internalPointerEvent.RemoteActionCompatParcelizer && i6 < i5) {
                    internalPointerEvent.RemoteActionCompatParcelizer = true;
                }
                internalPointerEvent.IconCompatParcelizer = i6;
                bArr[i + i3] = bSerializer;
            } else {
                int i7 = i + i3;
                int i8 = getpushid.MediaSessionCompatQueueItem.read(bArr, i7, iMin - i3);
                if (i8 == -1) {
                    throw new EOFException("Truncated Deflate64 Stream");
                }
                for (int i9 = i7; i9 < i7 + i8; i9++) {
                    byte b = bArr[i9];
                    byte[] bArr3 = (byte[]) internalPointerEvent.read;
                    int i10 = internalPointerEvent.IconCompatParcelizer;
                    bArr3[i10] = b;
                    int i11 = (i10 + 1) & 65535;
                    if (!internalPointerEvent.RemoteActionCompatParcelizer && i11 < i10) {
                        internalPointerEvent.RemoteActionCompatParcelizer = true;
                    }
                    internalPointerEvent.IconCompatParcelizer = i11;
                }
                i4 = i8;
            }
            this.write += (long) i4;
            i3 += i4;
        }
        return iMin;
    }

    @Override // o.getTangenttuRUvjQ
    public final EnumC0167getChatId serializer() {
        return this.write < this.serializer ? EnumC0167getChatId.STORED : EnumC0167getChatId.INITIAL;
    }

    public getTotalUnreadMessageCount(getPushID getpushid, long j) {
        this.IconCompatParcelizer = getpushid;
        this.serializer = j;
    }
}
