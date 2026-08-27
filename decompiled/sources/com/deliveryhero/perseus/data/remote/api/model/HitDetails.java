package com.deliveryhero.perseus.data.remote.api.model;

import androidx.annotation.Keep;
import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.perseus.Consent;
import com.deliveryhero.perseus.data.local.db.entity.EcommerceComponent;
import com.deliveryhero.perseus.data.local.db.entity.EcommerceItem;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.onContentCardClicked;
import o.onItemDismisslambda0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@onItemDismisslambda0
public class HitDetails extends BaseHitDetails {

    @SerializedName("ecommerceComponents")
    private List<EcommerceComponent> ecommerceComponents;

    @SerializedName("ecommerceItems")
    private List<EcommerceItem> ecommerceItems;

    @SerializedName("eventVariables")
    private Map<String, String> eventVariables;

    public final List<EcommerceComponent> getEcommerceComponents() {
        return this.ecommerceComponents;
    }

    public final List<EcommerceItem> getEcommerceItems() {
        return this.ecommerceItems;
    }

    public final Map<String, String> getEventVariables() {
        return this.eventVariables;
    }

    public final void setEcommerceComponents(List<EcommerceComponent> list) {
        this.ecommerceComponents = list;
    }

    public final void setEcommerceItems(List<EcommerceItem> list) {
        this.ecommerceItems = list;
    }

    public String toString() {
        return onContentCardClicked.serializer(new String[]{r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("platform = ", getPlatform()), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("payloadTimestamp = ", getPayloadTimestamp()), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("clientSentTimestamp = ", getClientSentTimestamp()), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("country = ", getCountry()), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("advertisingId = ", getAdvertisingId()), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("appId = ", getAppId()), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("appName = ", getAppName()), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("appVersionCode = ", getAppVersionCode()), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("adjustId = ", getAdjustId()), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("userAgent = ", getUserAgent()), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("userId = ", getUserId()), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("uaId = ", getUaId()), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("clientId = ", getClientId()), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("sessionId = ", getSessionId()), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("sdkVersion = ", getSdkVersion()), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("globalEntityId = ", getGlobalEntityId()), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("consent = ", getConsent()), "hitNumber = " + getHitNumber(), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("deviceInfo = ", getDeviceInfo()), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("operatingSystemVersion = ", getOperatingSystemVersion()), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("screenResolution = ", getScreenResolution()), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("marketingName = ", getMarketingName()), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("deviceModel = ", getDeviceModel()), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("deviceBrand = ", getDeviceBrand()), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("deviceLanguage = ", getDeviceLanguage()), "eventVariables = " + this.eventVariables, c8$$ExternalSyntheticOutline0.m("ecommerceItems = ", this.ecommerceItems), c8$$ExternalSyntheticOutline0.m("ecommerceComponents = ", this.ecommerceComponents), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("isDebug = ", isDebug()), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("appBuildVersion = ", getAppBuildVersion()), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("rechargeTo = ", getRechargeTo())}, ", ", null, null, 62);
    }

    public final void setEventVariables(Map<String, String> map) {
        map.getClass();
        this.eventVariables = map;
    }

    public final String getHitMatchId$perseus_release() {
        String str = this.eventVariables.get("hitMatchId");
        return str == null ? "" : str;
    }

    public /* synthetic */ HitDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Consent consent, Long l, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Map map, List list, List list2, boolean z, String str24, String str25, String str26, Integer num, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, (i & Fields.CompositingStrategy) != 0 ? null : str16, (i & 65536) != 0 ? null : consent, (i & Fields.RenderEffect) != 0 ? null : l, str17, str18, str19, str20, str21, str22, str23, map, (i & 67108864) != 0 ? null : list, (i & 134217728) != 0 ? null : list2, z, (i & 536870912) != 0 ? "" : str24, (i & 1073741824) != 0 ? "" : str25, (i & Integer.MIN_VALUE) != 0 ? "" : str26, (i2 & 1) != 0 ? null : num);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HitDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Consent consent, Long l, String str17, String str18, String str19, String str20, String str21, String str22, String str23, Map<String, String> map, List<EcommerceItem> list, List<EcommerceComponent> list2, boolean z, String str24, String str25, String str26, Integer num) {
        super(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str16, consent != null ? consent.getStringRepresentation() : null, str15, l, str17, str18, str19, str20, str21, str22, str23, z, null, str24, str25, str26, num, 67108864, null);
        m1$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str6);
        m1$$ExternalSyntheticOutline0.m(str7, str8, str10, str11, str13);
        m1$$ExternalSyntheticOutline0.m(str14, str15, str17, str18, str19);
        str20.getClass();
        str21.getClass();
        str22.getClass();
        str23.getClass();
        map.getClass();
        str26.getClass();
        this.eventVariables = map;
        this.ecommerceItems = list;
        this.ecommerceComponents = list2;
    }
}
