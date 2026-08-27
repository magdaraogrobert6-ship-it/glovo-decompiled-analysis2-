package o;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.instant.shifts.presentation.InstantShiftsUiModel;

/* JADX INFO: loaded from: classes3.dex */
public final class shouldIgnore {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    public final int IconCompatParcelizer;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final String RatingCompat;
    public final String RemoteActionCompatParcelizer;
    public final InstantShiftsUiModel.read read;
    public final String serializer;
    public final String write;

    public static /* synthetic */ Object IconCompatParcelizer(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i6;
        int i8 = ~(i7 | i4);
        int i9 = ~i5;
        int i10 = ~(i9 | i4);
        int i11 = i8 | i10;
        int i12 = ~i4;
        int i13 = ~(i12 | i6);
        int i14 = (~(i5 | i7)) | i13 | i10;
        int i15 = (~(i9 | i6)) | (~(i12 | i9)) | i13;
        int i16 = i4 + i6 + i + ((-954185507) * i3) + (2055044340 * i2);
        int i17 = i16 * i16;
        int i18 = ((1110557339 * i4) - 760807424) + ((-878567756) * i6) + ((-1537228134) * i11) + (i14 * 768614067) + (768614067 * i15) + ((-1647181824) * i) + (1313472512 * i3) + (606601216 * i2) + ((-1232666624) * i17);
        int i19 = (i4 * 1290134917) + 267690129 + (i6 * 1290136780) + (i11 * (-1242)) + (i14 * 621) + (i15 * 621) + (i * 1290136159) + (i3 * 826674179) + (i2 * 1594648204) + (i17 * 572063744);
        return i18 + ((i19 * i19) * 607715328) != 1 ? write(objArr) : read(objArr);
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        shouldIgnore shouldignore = (shouldIgnore) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem;
        int i3 = i2 + 91;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        String str = shouldignore.MediaMetadataCompat;
        int i5 = i2 + 35;
        MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 1;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.serializer;
        }
        int i3 = 85 / 0;
        return this.serializer;
    }

    public final String MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 17;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i3;
        int i4 = i2 % 2;
        String str = this.MediaSessionCompatQueueItem;
        int i5 = i3 + 49;
        MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final String MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 53;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i3;
        int i4 = i2 % 2;
        String str = this.RatingCompat;
        int i5 = i3 + 37;
        MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public final InstantShiftsUiModel.read RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem;
        int i3 = i2 + 125;
        MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        InstantShiftsUiModel.read readVar = this.read;
        int i5 = i2 + 9;
        MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return readVar;
    }

    public final String serializer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 121;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.RemoteActionCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int write() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 65;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.IconCompatParcelizer;
        }
        int i3 = 46 / 0;
        return this.IconCompatParcelizer;
    }

    public shouldIgnore(int i, String str, String str2, String str3, String str4, String str5, String str6, InstantShiftsUiModel.read readVar) {
        str2.getClass();
        str5.getClass();
        readVar.getClass();
        this.IconCompatParcelizer = i;
        this.MediaMetadataCompat = str;
        this.RemoteActionCompatParcelizer = str2;
        this.RatingCompat = str3;
        this.serializer = str4;
        this.MediaSessionCompatQueueItem = str5;
        this.write = str6;
        this.read = readVar;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 73;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.IconCompatParcelizer) * 31, 31, this.MediaMetadataCompat), 31, this.RemoteActionCompatParcelizer), 31, this.RatingCompat), 31, this.serializer), 31, this.MediaSessionCompatQueueItem), 31, this.write);
        int i4 = MediaDescriptionCompat + 89;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        shouldIgnore shouldignore = (shouldIgnore) objArr[0];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 95;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("InstantShiftViewEntity(shiftId=", shouldignore.IconCompatParcelizer, ", shiftMonth=", shouldignore.MediaMetadataCompat, ", shiftDay=");
        c8$$ExternalSyntheticOutline0.m(sbM, shouldignore.RemoteActionCompatParcelizer, ", shiftNameOfDay=", shouldignore.RatingCompat, ", duration=");
        c8$$ExternalSyntheticOutline0.m(sbM, shouldignore.serializer, ", zone=", shouldignore.MediaSessionCompatQueueItem, ", buttonText=");
        sbM.append(shouldignore.write);
        sbM.append(", action=");
        sbM.append(shouldignore.read);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = MediaDescriptionCompat + 99;
        MediaBrowserCompatMediaItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
    
        if (r20.read != r1.read) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            int r3 = r2 % r2
            int r3 = o.shouldIgnore.MediaDescriptionCompat
            int r3 = r3 + 11
            int r4 = r3 % 128
            o.shouldIgnore.MediaBrowserCompatMediaItem = r4
            int r3 = r3 % r2
            r3 = 0
            if (r0 != r1) goto L15
            goto Lab
        L15:
            boolean r4 = r1 instanceof o.shouldIgnore
            if (r4 != 0) goto L1b
            goto Laa
        L1b:
            o.shouldIgnore r1 = (o.shouldIgnore) r1
            int r4 = r0.IconCompatParcelizer
            int r5 = r1.IconCompatParcelizer
            if (r4 == r5) goto L25
            goto Laa
        L25:
            java.lang.String r4 = r0.MediaMetadataCompat
            java.lang.String r5 = r1.MediaMetadataCompat
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L31
            goto Laa
        L31:
            java.lang.String r4 = r0.RemoteActionCompatParcelizer
            java.lang.String r5 = r1.RemoteActionCompatParcelizer
            java.lang.Object[] r11 = new java.lang.Object[]{r4, r5}
            int r6 = o.getCieXyz.write()
            int r10 = o.getCieXyz.write()
            int r12 = o.getCieXyz.write()
            int r9 = o.getCieXyz.write()
            r14 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
            r15 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
            r7 = r14
            r8 = r15
            java.lang.Object r4 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r6, r7, r8, r9, r10, r11, r12)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L5e
            goto Laa
        L5e:
            java.lang.String r4 = r0.RatingCompat
            java.lang.String r5 = r1.RatingCompat
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L69
            goto Laa
        L69:
            java.lang.String r4 = r0.serializer
            java.lang.String r5 = r1.serializer
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L74
            goto Laa
        L74:
            java.lang.String r4 = r0.MediaSessionCompatQueueItem
            java.lang.String r5 = r1.MediaSessionCompatQueueItem
            java.lang.Object[] r18 = new java.lang.Object[]{r4, r5}
            int r13 = o.getCieXyz.write()
            int r17 = o.getCieXyz.write()
            int r19 = o.getCieXyz.write()
            int r16 = o.getCieXyz.write()
            java.lang.Object r4 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L99
            goto Laa
        L99:
            java.lang.String r4 = r0.write
            java.lang.String r5 = r1.write
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto La4
            goto Laa
        La4:
            com.roadrunner.instant.shifts.presentation.InstantShiftsUiModel$read r4 = r0.read
            com.roadrunner.instant.shifts.presentation.InstantShiftsUiModel$read r1 = r1.read
            if (r4 == r1) goto Lab
        Laa:
            return r3
        Lab:
            int r1 = o.shouldIgnore.MediaDescriptionCompat
            int r1 = r1 + 9
            int r4 = r1 % 128
            o.shouldIgnore.MediaBrowserCompatMediaItem = r4
            int r1 = r1 % r2
            r2 = 1
            if (r1 == 0) goto Lba
            r1 = 81
            int r1 = r1 / r3
        Lba:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.shouldIgnore.equals(java.lang.Object):boolean");
    }

    public final String toString() {
        int iWrite = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
        int iWrite2 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
        int iWrite3 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
        return (String) IconCompatParcelizer(iWrite2, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), iWrite3, -1282312462, iWrite, 1282312463, new Object[]{this});
    }

    public final String read() {
        int iWrite = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
        int iWrite2 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
        int iWrite3 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
        return (String) IconCompatParcelizer(iWrite2, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), iWrite3, 462833260, iWrite, -462833260, new Object[]{this});
    }
}
