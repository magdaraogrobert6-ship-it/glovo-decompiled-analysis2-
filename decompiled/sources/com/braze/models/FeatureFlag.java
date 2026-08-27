package com.braze.models;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.g8;
import bo.app.h8;
import bo.app.m1$$ExternalSyntheticLambda25;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.Serializable;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.DefaultInAppMessageSlideupViewFactory;
import o.beforeInAppMessageViewClosed;
import o.getAppropriateFullView;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isAdapterPositionOnScreen;
import o.onCloseClicked;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Serializable
public final class FeatureFlag implements IPutIntoJson<JSONObject>, IPropertiesObject {
    public static final h8 Companion = new h8();
    public static final String ENABLED = "enabled";
    public static final String ID = "id";
    public static final String TRACKING_STRING = "fts";
    private final boolean enabled;
    private final String id;
    private final onViewDetachedFromWindowlambda1 properties$delegate;
    private final String propertiesJson;
    private final String trackingString;

    private final String component3() {
        return this.propertiesJson;
    }

    @getAppropriateFullView(serializer = ENABLED)
    public static /* synthetic */ void getEnabled$annotations() {
    }

    @getAppropriateFullView(serializer = "id")
    public static /* synthetic */ void getId$annotations() {
    }

    @getAppropriateFullView(serializer = "properties")
    private static /* synthetic */ void getPropertiesJson$annotations() {
    }

    @getAppropriateFullView(serializer = TRACKING_STRING)
    public static /* synthetic */ void getTrackingString$android_sdk_base_release$annotations() {
    }

    public final String component1() {
        return this.id;
    }

    public final boolean component2() {
        return this.enabled;
    }

    public final String component4$android_sdk_base_release() {
        return this.trackingString;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTrackingString$android_sdk_base_release() {
        return this.trackingString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject _init_$lambda$0(FeatureFlag featureFlag) {
        try {
            return hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) featureFlag.propertiesJson) ? new JSONObject() : new JSONObject(featureFlag.propertiesJson);
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) featureFlag, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new m1$$ExternalSyntheticLambda25(featureFlag, 4), 4, (Object) null);
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String forJsonPut$lambda$0() {
        return "Caught exception creating FeatureFlag Json.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject properties_delegate$lambda$0(FeatureFlag featureFlag) {
        try {
            return hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) featureFlag.propertiesJson) ? new JSONObject() : new JSONObject(featureFlag.propertiesJson);
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) featureFlag, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new m1$$ExternalSyntheticLambda25(featureFlag, 5), 4, (Object) null);
            return new JSONObject();
        }
    }

    public final FeatureFlag deepcopy$android_sdk_base_release() {
        return new FeatureFlag(this.id, this.enabled, JsonUtils.deepcopy(getProperties()), this.trackingString);
    }

    @Override // com.braze.models.IPutIntoJson
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.id);
            jSONObject.put(ENABLED, this.enabled);
            jSONObject.put("properties", getProperties());
            jSONObject.put(TRACKING_STRING, this.trackingString);
            return jSONObject;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new Banner$$ExternalSyntheticLambda0(8), 4, (Object) null);
            return jSONObject;
        }
    }

    @Override // com.braze.models.IPropertiesObject
    public JSONObject getProperties() {
        return (JSONObject) this.properties$delegate.MediaSessionCompatResultReceiverWrapper();
    }

    public int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.enabled), 31, this.propertiesJson);
        String str = this.trackingString;
        return iM + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.id;
        boolean z = this.enabled;
        return ff$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m("FeatureFlag(id=", str, ", enabled=", ", propertiesJson=", z), this.propertiesJson, ", trackingString=", this.trackingString, ")");
    }

    public static final /* synthetic */ void write$Self$android_sdk_base_release(FeatureFlag featureFlag, DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactory, r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0, featureFlag.id);
        defaultInAppMessageSlideupViewFactory.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1, featureFlag.enabled);
        defaultInAppMessageSlideupViewFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2, featureFlag.propertiesJson);
        if (!defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda) && featureFlag.trackingString == null) {
            return;
        }
        defaultInAppMessageSlideupViewFactory.read(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, featureFlag.trackingString);
    }

    public final FeatureFlag copy$android_sdk_base_release(String str, boolean z, String str2, String str3) {
        str.getClass();
        str2.getClass();
        return new FeatureFlag(str, z, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0$0(FeatureFlag featureFlag) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to parse properties JSON: ", featureFlag.propertiesJson);
    }

    public static /* synthetic */ FeatureFlag copy$android_sdk_base_release$default(FeatureFlag featureFlag, String str, boolean z, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = featureFlag.id;
        }
        if ((i & 2) != 0) {
            z = featureFlag.enabled;
        }
        if ((i & 4) != 0) {
            str2 = featureFlag.propertiesJson;
        }
        if ((i & 8) != 0) {
            str3 = featureFlag.trackingString;
        }
        return featureFlag.copy$android_sdk_base_release(str, z, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String properties_delegate$lambda$0$0(FeatureFlag featureFlag) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Failed to parse properties JSON: ", featureFlag.propertiesJson);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeatureFlag)) {
            return false;
        }
        FeatureFlag featureFlag = (FeatureFlag) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, featureFlag.id}, getCieXyz.write())).booleanValue() || this.enabled != featureFlag.enabled) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.propertiesJson, featureFlag.propertiesJson}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.trackingString, featureFlag.trackingString}, getCieXyz.write())).booleanValue();
    }

    public FeatureFlag(int i, String str, boolean z, String str2, String str3, onCloseClicked oncloseclicked) {
        if (7 == (i & 7)) {
            this.id = str;
            this.enabled = z;
            this.propertiesJson = str2;
            if ((i & 8) == 0) {
                this.trackingString = null;
            } else {
                this.trackingString = str3;
            }
            this.properties$delegate = new isAdapterPositionOnScreen(new m1$$ExternalSyntheticLambda25(this, 3));
            return;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 7, g8.a.getDescriptor());
        throw null;
    }

    public FeatureFlag(String str, boolean z, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.enabled = z;
        this.propertiesJson = str2;
        this.trackingString = str3;
        this.properties$delegate = new isAdapterPositionOnScreen(new m1$$ExternalSyntheticLambda25(this, 2));
    }

    public /* synthetic */ FeatureFlag(String str, boolean z, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, str2, (i & 8) != 0 ? null : str3);
    }

    public /* synthetic */ FeatureFlag(String str, boolean z, JSONObject jSONObject, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, jSONObject, (i & 8) != 0 ? null : str2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FeatureFlag(String str, boolean z, JSONObject jSONObject, String str2) {
        str.getClass();
        jSONObject.getClass();
        String string = jSONObject.toString();
        string.getClass();
        this(str, z, string, str2);
    }
}
