package o;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.rider.state.provider.data.model.ShiftResponse$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.closeReferrerClient;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class InstallReferrer {
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final String bonusMultiplier;
    public final List bonusTypes;
    public final Boolean calendarEnabled;
    public final String endedAt;
    public final long id;
    public final IRunActivityHandler metadata;
    public final String startedAt;
    public final InstallReferrer1 zone;
    public final long zoneId;
    public static final ShiftResponse$Companion Companion = new Object() { // from class: com.roadrunner.rider.state.provider.data.model.ShiftResponse$Companion
        private static int IconCompatParcelizer = 0;
        private static int serializer = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = serializer + 39;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            closeReferrerClient closereferrerclient = closeReferrerClient.serializer;
            int i4 = IconCompatParcelizer + 125;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return closereferrerclient;
        }
    };
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new getSessionParameters(11)), null, null};

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = (~(i | i4)) | i6;
        int i8 = (~((~i4) | i)) | i6;
        int i9 = (~i6) | i;
        int i10 = i6 + i + i5 + (440753341 * i3) + ((-634449194) * i2);
        int i11 = i10 * i10;
        int i12 = ((-907101825) * i6) + 1075183616 + ((-1421434046) * i) + (i7 * (-1603099839)) + ((-1603099839) * i8) + (1603099839 * i9) + (181665792 * i5) + (780402688 * i3) + ((-180879360) * i2) + (353763328 * i11);
        int i13 = (i6 * 892202253) + 1676176333 + (i * 892200102) + (i7 * (-717)) + (i8 * (-717)) + (i9 * 717) + (i5 * 892200819) + (i3 * (-770690073)) + (i2 * 448958498) + (i11 * 1390542848);
        if (i12 + (i13 * i13 * (-1042677760)) != 1) {
            return IconCompatParcelizer(objArr);
        }
        InstallReferrer installReferrer = (InstallReferrer) objArr[0];
        int i14 = 2 % 2;
        int i15 = write;
        int i16 = i15 + 77;
        read = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i17 = i16 % 2;
        String str = installReferrer.startedAt;
        int i18 = i15 + 113;
        read = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i19 = i18 % 2;
        return str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.rider.state.provider.data.model.ShiftResponse$Companion] */
    static {
        int i = IconCompatParcelizer + 83;
        serializer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        InstallReferrer installReferrer = (InstallReferrer) objArr[0];
        int i = 2 % 2;
        int i2 = write + 9;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return installReferrer.bonusMultiplier;
        }
        String str = installReferrer.bonusMultiplier;
        throw null;
    }

    public static final /* synthetic */ onViewDetachedFromWindowlambda1[] RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 105;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        onViewDetachedFromWindowlambda1[] onviewdetachedfromwindowlambda1Arr = $childSerializers;
        int i5 = i3 + 119;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return onviewdetachedfromwindowlambda1Arr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 71;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        List list = this.bonusTypes;
        int i5 = i2 + 75;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final long MediaBrowserCompatMediaItem() {
        long j;
        int i = 2 % 2;
        int i2 = write + 59;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        if (i2 % 2 != 0) {
            j = this.zoneId;
            int i4 = 66 / 0;
        } else {
            j = this.zoneId;
        }
        int i5 = i3 + 83;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return j;
    }

    public final InstallReferrer1 MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = read + 35;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.zone;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final IRunActivityHandler MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 11;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        IRunActivityHandler iRunActivityHandler = this.metadata;
        int i5 = i2 + 87;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return iRunActivityHandler;
    }

    public final long MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = write + 5;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.id;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Boolean read() {
        Boolean bool;
        int i = 2 % 2;
        int i2 = read + 19;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i3;
        if (i2 % 2 == 0) {
            bool = this.calendarEnabled;
            int i4 = 59 / 0;
        } else {
            bool = this.calendarEnabled;
        }
        int i5 = i3 + 105;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return bool;
        }
        throw null;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = write + 95;
        int i3 = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        String str = this.endedAt;
        int i5 = i3 + 61;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return str;
    }

    public /* synthetic */ InstallReferrer(int i, long j, String str, String str2, InstallReferrer1 installReferrer1, long j2, String str3, List list, Boolean bool, IRunActivityHandler iRunActivityHandler) {
        if (31 != (i & 31)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 31, closeReferrerClient.serializer.getDescriptor());
            throw null;
        }
        this.id = j;
        this.startedAt = str;
        this.endedAt = str2;
        this.zone = installReferrer1;
        this.zoneId = j2;
        if ((i & 32) == 0) {
            this.bonusMultiplier = null;
        } else {
            this.bonusMultiplier = str3;
        }
        if ((i & 64) == 0) {
            int i2 = write + 21;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                this.bonusTypes = null;
                int i3 = 83 / 0;
            } else {
                this.bonusTypes = null;
            }
        } else {
            this.bonusTypes = list;
            int i4 = write + 61;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
        if ((i & androidx.compose.ui.graphics.Fields.SpotShadowColor) == 0) {
            this.calendarEnabled = null;
            int i7 = read + 67;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                int i8 = 2 % 2;
            }
        } else {
            this.calendarEnabled = bool;
        }
        if ((i & androidx.compose.ui.graphics.Fields.RotationX) == 0) {
            this.metadata = null;
        } else {
            this.metadata = iRunActivityHandler;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = write + 59;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sb = getBitmapFromCache.read("ShiftResponse(id=", ", startedAt=", this.id, this.startedAt);
        sb.append(", endedAt=");
        sb.append(this.endedAt);
        sb.append(", zone=");
        sb.append(this.zone);
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sb, ", zoneId=", this.zoneId, ", bonusMultiplier=");
        MediaSessionCompatQueueItem.RemoteActionCompatParcelizer(sb, this.bonusMultiplier, ", bonusTypes=", this.bonusTypes, ", calendarEnabled=");
        sb.append(this.calendarEnabled);
        sb.append(", metadata=");
        sb.append(this.metadata);
        sb.append(")");
        String string = sb.toString();
        int i4 = read + 77;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iM = d$$ExternalSyntheticOutline0.m((this.zone.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(Long.hashCode(this.id) * 31, 31, this.startedAt), 31, this.endedAt)) * 31, 31, this.zoneId);
        String str = this.bonusMultiplier;
        int iHashCode3 = 0;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        List list = this.bonusTypes;
        if (list == null) {
            int i2 = write + 43;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        Boolean bool = this.calendarEnabled;
        if (bool == null) {
            int i4 = write + 117;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = bool.hashCode();
        }
        IRunActivityHandler iRunActivityHandler = this.metadata;
        if (iRunActivityHandler == null) {
            int i6 = write + 55;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            iHashCode3 = iRunActivityHandler.hashCode();
        }
        return ((((((iM + iHashCode4) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 117;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof InstallReferrer)) {
            return false;
        }
        InstallReferrer installReferrer = (InstallReferrer) obj;
        if (this.id != installReferrer.id) {
            return false;
        }
        Object[] objArr = {this.startedAt, installReferrer.startedAt};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {this.endedAt, installReferrer.endedAt};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr3 = {this.zone, installReferrer.zone};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (this.zoneId != installReferrer.zoneId) {
            int i4 = write + 85;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        Object[] objArr4 = {this.bonusMultiplier, installReferrer.bonusMultiplier};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr5 = {this.bonusTypes, installReferrer.bonusTypes};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr6 = {this.calendarEnabled, installReferrer.calendarEnabled};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr6, getCieXyz.write())).booleanValue()) {
            int i6 = write + 11;
            read = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        Object[] objArr7 = {this.metadata, installReferrer.metadata};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr7, getCieXyz.write())).booleanValue()) {
            return true;
        }
        int i8 = read + 39;
        write = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006b  */
    public static final /* synthetic */ void serializer(InstallReferrer installReferrer, DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        int i = 2 % 2;
        int i2 = read + 55;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long j = installReferrer.id;
        IRunActivityHandler iRunActivityHandler = installReferrer.metadata;
        Boolean bool = installReferrer.calendarEnabled;
        List list = installReferrer.bonusTypes;
        String str = installReferrer.bonusMultiplier;
        defaultInAppMessageSlideupViewFactory.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, j);
        defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, installReferrer.startedAt);
        defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, installReferrer.endedAt);
        defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, getResponseCode.RemoteActionCompatParcelizer, installReferrer.zone);
        defaultInAppMessageSlideupViewFactory.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, installReferrer.zoneId);
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || str != null) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
        }
        if (!defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            if (list != null) {
            }
            if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || bool != null) {
                defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, getWasCloseMessageCalled.write, bool);
            }
            if (!defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) && iRunActivityHandler == null) {
                return;
            }
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, sendSdkClick.write, iRunActivityHandler);
        }
        int i4 = read + 31;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, (setGraphicModalMaxWidthDp) $childSerializers[6].MediaSessionCompatResultReceiverWrapper(), list);
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, getWasCloseMessageCalled.write, bool);
        } else {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, getWasCloseMessageCalled.write, bool);
        }
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda)) {
            return;
        }
        defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, sendSdkClick.write, iRunActivityHandler);
    }

    public final String RatingCompat() {
        int iWrite = extractAuthorizationHeader.write();
        int iWrite2 = extractAuthorizationHeader.write();
        int iWrite3 = extractAuthorizationHeader.write();
        return (String) RemoteActionCompatParcelizer(835465541, extractAuthorizationHeader.write(), iWrite3, new Object[]{this}, iWrite, iWrite2, -835465540);
    }

    public final String serializer() {
        int iWrite = extractAuthorizationHeader.write();
        int iWrite2 = extractAuthorizationHeader.write();
        int iWrite3 = extractAuthorizationHeader.write();
        return (String) RemoteActionCompatParcelizer(589302202, extractAuthorizationHeader.write(), iWrite3, new Object[]{this}, iWrite, iWrite2, -589302202);
    }
}
