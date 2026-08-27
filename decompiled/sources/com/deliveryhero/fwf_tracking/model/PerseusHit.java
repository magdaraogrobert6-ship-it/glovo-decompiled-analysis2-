package com.deliveryhero.fwf_tracking.model;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.fwf_http.PlatformKt;
import com.deliveryhero.fwf_http.PlatformName;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.Serializable;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.DefaultInAppMessageSlideupViewFactory;
import o.IconCompatParcelizer;
import o.beforeInAppMessageViewClosed;
import o.beforeOpened;
import o.getCieXyz;
import o.onCloseClicked;
import o.onItemDismisslambda0;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.removeNodeAtDepth;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class PerseusHit {
    private static final setGraphicModalMaxWidthDp[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private final String brand;
    private final String clientId;
    private final String consent;
    private final String country;
    private final Map<String, String> eventVariables;
    private final String globalEntityId;
    private final String payloadTimestamp;
    private final String platform;
    private final String rechargeTo;
    private final String sessionId;
    private final String timestamp;
    private final String userId;

    public final String component1() {
        return this.country;
    }

    public final String component10() {
        return this.brand;
    }

    public final String component11() {
        return this.rechargeTo;
    }

    public final String component2() {
        return this.globalEntityId;
    }

    public final String component3() {
        return this.consent;
    }

    public final String component4() {
        return this.clientId;
    }

    public final Map<String, String> component5() {
        return this.eventVariables;
    }

    public final String component6() {
        return this.payloadTimestamp;
    }

    public final String component7() {
        return this.timestamp;
    }

    public final String component8() {
        return this.sessionId;
    }

    public final String component9() {
        return this.userId;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final String getConsent() {
        return this.consent;
    }

    public final String getCountry() {
        return this.country;
    }

    public final Map<String, String> getEventVariables() {
        return this.eventVariables;
    }

    public final String getGlobalEntityId() {
        return this.globalEntityId;
    }

    public final String getPayloadTimestamp() {
        return this.payloadTimestamp;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getRechargeTo() {
        return this.rechargeTo;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final String getUserId() {
        return this.userId;
    }

    public static final /* synthetic */ void write$Self$fwf_client_release(PerseusHit perseusHit, DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = $childSerializers;
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || perseusHit.country != null) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, perseusHit.country);
        }
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, beforeinappmessageviewclosed, perseusHit.globalEntityId);
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || perseusHit.consent != null) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, beforeinappmessageviewclosed, perseusHit.consent);
        }
        defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, perseusHit.clientId);
        defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4, setgraphicmodalmaxwidthdpArr[4], perseusHit.eventVariables);
        defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5, perseusHit.payloadTimestamp);
        defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6, perseusHit.timestamp);
        defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7, perseusHit.sessionId);
        if (defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) || perseusHit.userId != null) {
            defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8, beforeinappmessageviewclosed, perseusHit.userId);
        }
        defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9, perseusHit.brand);
        defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10, beforeinappmessageviewclosed, perseusHit.rechargeTo);
        defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11, perseusHit.platform);
    }

    public String toString() {
        String str = this.country;
        String str2 = this.globalEntityId;
        String str3 = this.consent;
        String str4 = this.clientId;
        Map<String, String> map = this.eventVariables;
        String str5 = this.payloadTimestamp;
        String str6 = this.timestamp;
        String str7 = this.sessionId;
        String str8 = this.userId;
        String str9 = this.brand;
        String str10 = this.rechargeTo;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("PerseusHit(country=", str, ", globalEntityId=", str2, ", consent=");
        c8$$ExternalSyntheticOutline0.m(sbM, str3, ", clientId=", str4, ", eventVariables=");
        sbM.append(map);
        sbM.append(", payloadTimestamp=");
        sbM.append(str5);
        sbM.append(", timestamp=");
        c8$$ExternalSyntheticOutline0.m(sbM, str6, ", sessionId=", str7, ", userId=");
        c8$$ExternalSyntheticOutline0.m(sbM, str8, ", brand=", str9, ", rechargeTo=");
        return ff$$ExternalSyntheticOutline0.m(sbM, str10, ")");
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final setGraphicModalMaxWidthDp serializer() {
            return PerseusHit$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlatformName.values().length];
            try {
                iArr[PlatformName.ANDROID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlatformName.JVM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        $childSerializers = new setGraphicModalMaxWidthDp[]{null, null, null, null, new beforeOpened(beforeinappmessageviewclosed, beforeinappmessageviewclosed), null, null, null, null, null, null, null};
    }

    public final PerseusHit copy(String str, String str2, String str3, String str4, Map<String, String> map, String str5, String str6, String str7, String str8, String str9, String str10) {
        str4.getClass();
        map.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str9.getClass();
        return new PerseusHit(str, str2, str3, str4, map, str5, str6, str7, str8, str9, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PerseusHit)) {
            return false;
        }
        PerseusHit perseusHit = (PerseusHit) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.country, perseusHit.country}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.globalEntityId, perseusHit.globalEntityId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.consent, perseusHit.consent}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.clientId, perseusHit.clientId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.eventVariables, perseusHit.eventVariables}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.payloadTimestamp, perseusHit.payloadTimestamp}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.timestamp, perseusHit.timestamp}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sessionId, perseusHit.sessionId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.userId, perseusHit.userId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.brand, perseusHit.brand}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.rechargeTo, perseusHit.rechargeTo}, getCieXyz.write())).booleanValue();
    }

    @onItemDismisslambda0
    public PerseusHit(int i, String str, String str2, String str3, String str4, Map map, String str5, String str6, String str7, String str8, String str9, String str10, String str11, onCloseClicked oncloseclicked) {
        if (3834 == (i & 3834)) {
            if ((i & 1) == 0) {
                this.country = null;
            } else {
                this.country = str;
            }
            this.globalEntityId = str2;
            if ((i & 4) == 0) {
                this.consent = null;
            } else {
                this.consent = str3;
            }
            this.clientId = str4;
            this.eventVariables = map;
            this.payloadTimestamp = str5;
            this.timestamp = str6;
            this.sessionId = str7;
            if ((i & Fields.RotationX) == 0) {
                this.userId = null;
            } else {
                this.userId = str8;
            }
            this.brand = str9;
            this.rechargeTo = str10;
            this.platform = str11;
            int i2 = WhenMappings.$EnumSwitchMapping$0[PlatformKt.getPlatform().getDeviceOS().ordinal()];
            if (i2 == 1) {
                this.platform = "Android";
                return;
            } else if (i2 == 2) {
                this.platform = "Backend";
                return;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                throw null;
            }
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 3834, PerseusHit$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public int hashCode() {
        String str = this.country;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.globalEntityId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.consent;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(IconCompatParcelizer.RemoteActionCompatParcelizer(af$$ExternalSyntheticOutline0.m(((((iHashCode * 31) + iHashCode2) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.clientId), this.eventVariables, 31), 31, this.payloadTimestamp), 31, this.timestamp), 31, this.sessionId);
        String str4 = this.userId;
        int iM2 = af$$ExternalSyntheticOutline0.m((iM + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.brand);
        String str5 = this.rechargeTo;
        return iM2 + (str5 != null ? str5.hashCode() : 0);
    }

    public PerseusHit(String str, String str2, String str3, String str4, Map<String, String> map, String str5, String str6, String str7, String str8, String str9, String str10) {
        str4.getClass();
        map.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str9.getClass();
        this.country = str;
        this.globalEntityId = str2;
        this.consent = str3;
        this.clientId = str4;
        this.eventVariables = map;
        this.payloadTimestamp = str5;
        this.timestamp = str6;
        this.sessionId = str7;
        this.userId = str8;
        this.brand = str9;
        this.rechargeTo = str10;
        int i = WhenMappings.$EnumSwitchMapping$0[PlatformKt.getPlatform().getDeviceOS().ordinal()];
        if (i == 1) {
            this.platform = "Android";
        } else if (i == 2) {
            this.platform = "Backend";
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            throw null;
        }
    }

    public /* synthetic */ PerseusHit(String str, String str2, String str3, String str4, Map map, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? null : str3, str4, map, str5, str6, str7, (i & Fields.RotationX) != 0 ? null : str8, str9, str10);
    }
}
