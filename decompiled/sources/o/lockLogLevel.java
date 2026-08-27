package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.roadrunner.rider.state.provider.data.model.CourierResponse$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;
import o.setLogLevelString;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class lockLogLevel {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static int serializer = 1;
    private static int write;
    public final Boolean agreedToExtendCurrentShift;
    public final GooglePlayServicesClientGooglePlayServicesInterface balanceLimit;
    public final Boolean canExtendShift;
    public final String city;
    public final int cityId;
    public final String contractType;
    public final long id;
    public final Boolean isBreakScheduled;
    public final Boolean isEndBreakAllowed;
    public final List shifts;
    public final getInstallBeginTimestampSeconds startingArea;
    public final String status;
    public final String statusEndingTime;
    public final String zone;
    public static final CourierResponse$Companion Companion = new Object() { // from class: com.roadrunner.rider.state.provider.data.model.CourierResponse$Companion
        private static int IconCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 15;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                setLogLevelString setloglevelstring = setLogLevelString.write;
                throw null;
            }
            setLogLevelString setloglevelstring2 = setLogLevelString.write;
            int i3 = read + 25;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return setloglevelstring2;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new waExternalSyntheticLambda3(23)), null, null, null, null, null, null, null};

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.state.provider.data.model.CourierResponse$Companion] */
    static {
        int i = RemoteActionCompatParcelizer + 5;
        read = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ lockLogLevel(int i, long j, String str, String str2, int i2, String str3, String str4, List list, String str5, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, getInstallBeginTimestampSeconds getinstallbegintimestampseconds, GooglePlayServicesClientGooglePlayServicesInterface googlePlayServicesClientGooglePlayServicesInterface) {
        Boolean bool5;
        Boolean bool6;
        Object obj = null;
        if (63 != (i & 63)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 63, setLogLevelString.write.getDescriptor());
            throw null;
        }
        this.id = j;
        this.status = str;
        this.city = str2;
        this.cityId = i2;
        this.contractType = str3;
        this.zone = str4;
        if ((i & 64) == 0) {
            this.shifts = null;
        } else {
            this.shifts = list;
        }
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) == 0) {
            this.statusEndingTime = null;
            int i3 = 2 % 2;
        } else {
            this.statusEndingTime = str5;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationX) == 0) {
            int i4 = write + 5;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                this.isEndBreakAllowed = Boolean.FALSE;
                int i5 = 78 / 0;
            } else {
                this.isEndBreakAllowed = Boolean.FALSE;
            }
        } else {
            this.isEndBreakAllowed = bool;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationY) == 0) {
            this.isBreakScheduled = Boolean.FALSE;
        } else {
            this.isBreakScheduled = bool2;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationZ) == 0) {
            int i6 = serializer + 49;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            bool5 = Boolean.FALSE;
        } else {
            bool5 = bool3;
        }
        this.canExtendShift = bool5;
        int i8 = write;
        int i9 = i8 + 19;
        serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        int i11 = 2 % 2;
        if ((i & androidx.compose.ui.graphics.Fields.CameraDistance) == 0) {
            int i12 = i8 + 83;
            serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i13 = i12 % 2;
            bool6 = Boolean.FALSE;
        } else {
            bool6 = bool4;
        }
        this.agreedToExtendCurrentShift = bool6;
        int i14 = write + 83;
        int i15 = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i15;
        if (i14 % 2 != 0 ? (i & androidx.compose.ui.graphics.Fields.TransformOrigin) != 0 : (i & 32738) != 0) {
            this.startingArea = getinstallbegintimestampseconds;
        } else {
            int i16 = i15 + 67;
            write = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i16 % 2 != 0) {
                this.startingArea = null;
                obj.hashCode();
                throw null;
            }
            this.startingArea = null;
        }
        if ((i & 8192) == 0) {
            this.balanceLimit = null;
        } else {
            this.balanceLimit = googlePlayServicesClientGooglePlayServicesInterface;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 23;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sb = getBitmapFromCache.read("CourierResponse(id=", ", status=", this.id, this.status);
        sb.append(", city=");
        sb.append(this.city);
        sb.append(", cityId=");
        sb.append(this.cityId);
        c8$$ExternalSyntheticOutline0.m(sb, ", contractType=", this.contractType, ", zone=", this.zone);
        sb.append(", shifts=");
        sb.append(this.shifts);
        sb.append(", statusEndingTime=");
        sb.append(this.statusEndingTime);
        sb.append(", isEndBreakAllowed=");
        sb.append(this.isEndBreakAllowed);
        sb.append(", isBreakScheduled=");
        sb.append(this.isBreakScheduled);
        sb.append(", canExtendShift=");
        sb.append(this.canExtendShift);
        sb.append(", agreedToExtendCurrentShift=");
        sb.append(this.agreedToExtendCurrentShift);
        sb.append(", startingArea=");
        sb.append(this.startingArea);
        sb.append(", balanceLimit=");
        sb.append(this.balanceLimit);
        sb.append(")");
        String string = sb.toString();
        int i4 = write + 17;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
        return string;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.cityId, af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(Long.hashCode(this.id) * 31, 31, this.status), 31, this.city), 31), 31, this.contractType), 31, this.zone);
        List list = this.shifts;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        String str = this.statusEndingTime;
        if (str == null) {
            int i2 = write + 111;
            serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        Boolean bool = this.isEndBreakAllowed;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.isBreakScheduled;
        int iHashCode6 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.canExtendShift;
        if (bool3 == null) {
            int i4 = serializer + 95;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = bool3.hashCode();
        }
        Boolean bool4 = this.agreedToExtendCurrentShift;
        int iHashCode7 = bool4 == null ? 0 : bool4.hashCode();
        getInstallBeginTimestampSeconds getinstallbegintimestampseconds = this.startingArea;
        if (getinstallbegintimestampseconds == null) {
            int i6 = serializer + 7;
            write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = getinstallbegintimestampseconds.hashCode();
        }
        GooglePlayServicesClientGooglePlayServicesInterface googlePlayServicesClientGooglePlayServicesInterface = this.balanceLimit;
        return ((((((((((((((iM + iHashCode4) * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode2) * 31) + iHashCode7) * 31) + iHashCode3) * 31) + (googlePlayServicesClientGooglePlayServicesInterface != null ? googlePlayServicesClientGooglePlayServicesInterface.hashCode() : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if ((r22 instanceof o.lockLogLevel) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r4 = r4 + 61;
        o.lockLogLevel.serializer = r4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        r1 = (o.lockLogLevel) r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r21.id == r1.id) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if ((!((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.status, r1.status}, o.getCieXyz.write())).booleanValue()) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        r1 = o.lockLogLevel.serializer + 75;
        o.lockLogLevel.write = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.city, r1.city}, o.getCieXyz.write())).booleanValue() != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0091, code lost:
    
        r1 = o.lockLogLevel.serializer + 69;
        o.lockLogLevel.write = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
    
        if (r21.cityId == r1.cityId) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a1, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c7, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.contractType, r1.contractType}, o.getCieXyz.write())).booleanValue() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c9, code lost:
    
        r1 = o.lockLogLevel.serializer + 121;
        o.lockLogLevel.write = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d2, code lost:
    
        if ((r1 % 2) == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d4, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d5, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fb, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.zone, r1.zone}, o.getCieXyz.write())).booleanValue() != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fd, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0123, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.shifts, r1.shifts}, o.getCieXyz.write())).booleanValue() != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0125, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x014c, code lost:
    
        if ((!((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.statusEndingTime, r1.statusEndingTime}, o.getCieXyz.write())).booleanValue()) == true) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0174, code lost:
    
        if ((!((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.isEndBreakAllowed, r1.isEndBreakAllowed}, o.getCieXyz.write())).booleanValue()) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0176, code lost:
    
        r1 = o.lockLogLevel.write + 9;
        o.lockLogLevel.serializer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x017f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01a5, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.isBreakScheduled, r1.isBreakScheduled}, o.getCieXyz.write())).booleanValue() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01a7, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01cd, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.canExtendShift, r1.canExtendShift}, o.getCieXyz.write())).booleanValue() == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01f4, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.agreedToExtendCurrentShift, r1.agreedToExtendCurrentShift}, o.getCieXyz.write())).booleanValue() != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01f6, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x021c, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.startingArea, r1.startingArea}, o.getCieXyz.write())).booleanValue() != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x021e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0244, code lost:
    
        if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), new java.lang.Object[]{r21.balanceLimit, r1.balanceLimit}, o.getCieXyz.write())).booleanValue() != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0246, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0247, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0248, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0249, code lost:
    
        r1 = o.lockLogLevel.serializer + 43;
        r3 = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        o.lockLogLevel.write = r3;
        r1 = r1 % 2;
        r3 = r3 + 31;
        o.lockLogLevel.serializer = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0259, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r21 == r22) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.lockLogLevel.equals(java.lang.Object):boolean");
    }
}
