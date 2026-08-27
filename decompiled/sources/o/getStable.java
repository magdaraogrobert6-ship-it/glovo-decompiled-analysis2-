package o;

import android.net.Uri;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableTaskUiItem$DispatcherData$Companion;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.SlotTreeKt;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class getStable {
    public static final onViewDetachedFromWindowlambda1[] $childSerializers;
    public static final CustomerUnavailableTaskUiItem$DispatcherData$Companion Companion = new Object() { // from class: com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableTaskUiItem$DispatcherData$Companion
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = write + 89;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return SlotTreeKt.serializer;
            }
            SlotTreeKt slotTreeKt = SlotTreeKt.serializer;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    };
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    public final String afterTimerDescription;
    public final String description;
    public final String dispatcherChatButtonTitle;
    public final String duringTimerDescription;
    public final Uri helpCenterDeeplinkUri;
    public final String id;
    public final List requiredSteps;
    public final String title;
    public final List trackingEvents;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.roadrunner.delivery.pickupdropoff.tasks.model.CustomerUnavailableTaskUiItem$DispatcherData$Companion] */
    static {
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        $childSerializers = new onViewDetachedFromWindowlambda1[]{null, null, null, null, null, null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new sourceInformationContextOfdefault(7)), null, LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new sourceInformationContextOfdefault(8))};
        int i = RemoteActionCompatParcelizer + 5;
        IconCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final Uri RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = serializer + 125;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.helpCenterDeeplinkUri;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public /* synthetic */ getStable(int i, String str, String str2, String str3, String str4, String str5, Uri uri, List list, String str6, List list2) {
        if (511 == (i & 511)) {
            this.title = str;
            this.description = str2;
            this.duringTimerDescription = str3;
            this.afterTimerDescription = str4;
            this.dispatcherChatButtonTitle = str5;
            this.helpCenterDeeplinkUri = uri;
            this.trackingEvents = list;
            this.id = str6;
            this.requiredSteps = list2;
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 511, SlotTreeKt.serializer.getDescriptor());
        throw null;
    }

    public getStable(String str, String str2, String str3, String str4, String str5, Uri uri, List list, String str6, List list2) {
        m1$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        uri.getClass();
        list.getClass();
        this.title = str;
        this.description = str2;
        this.duringTimerDescription = str3;
        this.afterTimerDescription = str4;
        this.dispatcherChatButtonTitle = str5;
        this.helpCenterDeeplinkUri = uri;
        this.trackingEvents = list;
        this.id = str6;
        this.requiredSteps = list2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020 A[PHI: r2
  0x0020: PHI (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v12 java.lang.String) binds: [B:9:0x001e, B:5:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016 A[PHI: r2
  0x0016: PHI (r2v11 java.lang.String) = (r2v4 java.lang.String), (r2v12 java.lang.String) binds: [B:9:0x001e, B:5:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    public static getStable read(getStable getstable, String str, Uri uri, int i) {
        String str2;
        String str3;
        String str4;
        int i2 = 2 % 2;
        int i3 = serializer + 15;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i4;
        if (i3 % 2 != 0) {
            str2 = getstable.title;
            if ((i & 4) != 0) {
                String str5 = getstable.description;
                int i5 = i4 + 45;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                str3 = str2;
                str4 = str5;
            } else {
                str4 = str;
                str3 = str2;
            }
        } else {
            str2 = getstable.title;
            if ((i & 2) != 0) {
                String str6 = getstable.description;
                int i7 = i4 + 45;
                serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                str3 = str2;
                str4 = str6;
            } else {
                str4 = str;
                str3 = str2;
            }
        }
        String str7 = getstable.duringTimerDescription;
        String str8 = getstable.afterTimerDescription;
        String str9 = getstable.dispatcherChatButtonTitle;
        Uri uri2 = (i & 32) != 0 ? getstable.helpCenterDeeplinkUri : uri;
        List list = getstable.trackingEvents;
        String str10 = getstable.id;
        List list2 = getstable.requiredSteps;
        getstable.getClass();
        str3.getClass();
        str4.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        uri2.getClass();
        list.getClass();
        getStable getstable2 = new getStable(str3, str4, str7, str8, str9, uri2, list, str10, list2);
        int i9 = read + 13;
        serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return getstable2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = read + 23;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = c8$$ExternalSyntheticOutline0.m(this.trackingEvents, (this.helpCenterDeeplinkUri.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.description), 31, this.duringTimerDescription), 31, this.afterTimerDescription), 31, this.dispatcherChatButtonTitle)) * 31, 31);
        String str = this.id;
        if (str == null) {
            int i4 = serializer + 17;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        List list = this.requiredSteps;
        return ((iM + iHashCode) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = serializer + 11;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("DispatcherData(title=", this.title, ", description=", this.description, ", duringTimerDescription=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.duringTimerDescription, ", afterTimerDescription=", this.afterTimerDescription, ", dispatcherChatButtonTitle=");
        sbM.append(this.dispatcherChatButtonTitle);
        sbM.append(", helpCenterDeeplinkUri=");
        sbM.append(this.helpCenterDeeplinkUri);
        sbM.append(", trackingEvents=");
        sbM.append(this.trackingEvents);
        sbM.append(", id=");
        sbM.append(this.id);
        sbM.append(", requiredSteps=");
        String str = MediaSessionCompatQueueItem.read(sbM, this.requiredSteps, ")");
        int i4 = read + 37;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 121;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getStable)) {
            return false;
        }
        getStable getstable = (getStable) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.title, getstable.title}, getCieXyz.write())).booleanValue()) {
            int i3 = serializer + 105;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, getstable.description}, getCieXyz.write())).booleanValue()) {
            int i5 = serializer + 125;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 89 / 0;
            }
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.duringTimerDescription, getstable.duringTimerDescription}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.afterTimerDescription, getstable.afterTimerDescription}, getCieXyz.write())).booleanValue()) {
            int i7 = serializer + 35;
            read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.dispatcherChatButtonTitle, getstable.dispatcherChatButtonTitle}, getCieXyz.write())).booleanValue()) {
            int i9 = serializer + 39;
            read = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.helpCenterDeeplinkUri, getstable.helpCenterDeeplinkUri}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingEvents, getstable.trackingEvents}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, getstable.id}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.requiredSteps, getstable.requiredSteps}, getCieXyz.write())).booleanValue();
        }
        int i11 = serializer + 95;
        read = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return false;
    }
}
