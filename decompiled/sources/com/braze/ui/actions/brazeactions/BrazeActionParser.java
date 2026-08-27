package com.braze.ui.actions.brazeactions;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.n$$ExternalSyntheticLambda2;
import coil3.util.UtilsKt;
import com.braze.enums.Channel;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.support.i$$ExternalSyntheticLambda0;
import com.braze.support.i$$ExternalSyntheticLambda1;
import com.braze.ui.actions.UriAction$$ExternalSyntheticLambda4;
import com.braze.ui.actions.brazeactions.steps.AddToCustomAttributeArrayStep;
import com.braze.ui.actions.brazeactions.steps.AddToSubscriptionGroupStep;
import com.braze.ui.actions.brazeactions.steps.ContainerStep;
import com.braze.ui.actions.brazeactions.steps.IBrazeActionStep;
import com.braze.ui.actions.brazeactions.steps.LogCustomEventStep;
import com.braze.ui.actions.brazeactions.steps.NoOpStep;
import com.braze.ui.actions.brazeactions.steps.OpenLinkExternallyStep;
import com.braze.ui.actions.brazeactions.steps.OpenLinkInWebViewStep;
import com.braze.ui.actions.brazeactions.steps.RemoveFromCustomAttributeArrayStep;
import com.braze.ui.actions.brazeactions.steps.RemoveFromSubscriptionGroupStep;
import com.braze.ui.actions.brazeactions.steps.RequestPushPermissionStep;
import com.braze.ui.actions.brazeactions.steps.SetCustomUserAttributeStep;
import com.braze.ui.actions.brazeactions.steps.SetEmailSubscriptionStep;
import com.braze.ui.actions.brazeactions.steps.SetPushNotificationSubscriptionStep;
import com.braze.ui.actions.brazeactions.steps.StepData;
import com.braze.ui.actions.brazeactions.steps.StepData$$ExternalSyntheticLambda1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.SweepGradientShader9KIMszodefault;
import o.accessgetInstancedelegatecp;
import o.getCieXyz;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeActionParser {
    public static final String BRAZE_ACTIONS_SCHEME = "brazeActions";
    private static final String BRAZE_ACTIONS_V1 = "v1";
    public static final BrazeActionParser INSTANCE = new BrazeActionParser();
    public static final String TYPE = "type";

    public enum ActionType {
        CONTAINER("container", ContainerStep.INSTANCE),
        LOG_CUSTOM_EVENT("logCustomEvent", LogCustomEventStep.INSTANCE),
        SET_CUSTOM_ATTRIBUTE("setCustomUserAttribute", SetCustomUserAttributeStep.INSTANCE),
        REQUEST_PUSH_PERMISSION("requestPushPermission", RequestPushPermissionStep.INSTANCE),
        ADD_TO_SUBSCRIPTION_GROUP("addToSubscriptionGroup", AddToSubscriptionGroupStep.INSTANCE),
        REMOVE_FROM_SUBSCRIPTION_GROUP("removeFromSubscriptionGroup", RemoveFromSubscriptionGroupStep.INSTANCE),
        ADD_TO_CUSTOM_ATTRIBUTE_ARRAY("addToCustomAttributeArray", AddToCustomAttributeArrayStep.INSTANCE),
        REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY("removeFromCustomAttributeArray", RemoveFromCustomAttributeArrayStep.INSTANCE),
        SET_EMAIL_SUBSCRIPTION("setEmailNotificationSubscriptionType", SetEmailSubscriptionStep.INSTANCE),
        SET_PUSH_NOTIFICATION_SUBSCRIPTION("setPushNotificationSubscriptionType", SetPushNotificationSubscriptionStep.INSTANCE),
        OPEN_LINK_IN_WEBVIEW("openLinkInWebview", OpenLinkInWebViewStep.INSTANCE),
        OPEN_LINK_EXTERNALLY("openLink", OpenLinkExternallyStep.INSTANCE),
        INVALID("", NoOpStep.INSTANCE);

        private static final Map<String, ActionType> map;
        private final IBrazeActionStep impl;
        private final String key;
        private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());
        public static final Companion Companion = new Companion(null);

        public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
            return $ENTRIES;
        }

        public final IBrazeActionStep getImpl() {
            return this.impl;
        }

        public final String getKey() {
            return this.key;
        }

        public static final ActionType fromValue(String str) {
            return Companion.fromValue(str);
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final ActionType fromValue(String str) {
                Map map = ActionType.map;
                if (str == null) {
                    str = "";
                }
                Object obj = map.get(str);
                if (obj == null) {
                    obj = ActionType.INVALID;
                }
                return (ActionType) obj;
            }
        }

        ActionType(String str, IBrazeActionStep iBrazeActionStep) {
            this.key = str;
            this.impl = iBrazeActionStep;
        }

        static {
            r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U entries = getEntries();
            int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(entries, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer < 16 ? 16 : iRemoteActionCompatParcelizer);
            for (Object obj : entries) {
                linkedHashMap.put(((ActionType) obj).key, obj);
            }
            map = linkedHashMap;
        }
    }

    private BrazeActionParser() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$1() {
        return "Failed to decode Braze Action into both version and json components. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBrazeActionVersionAndJson$lambda$0(Uri uri) {
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(uri, "Failed to parse version and encoded action from uri: ");
    }

    public final boolean isBrazeActionUri(Uri uri) {
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{uri != null ? uri.getScheme() : null, BRAZE_ACTIONS_SCHEME}, getCieXyz.write())).booleanValue();
    }

    public final void execute(Context context, Uri uri, Channel channel) {
        context.getClass();
        uri.getClass();
        channel.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda2(channel, 29, uri), 6, (Object) null);
        try {
            onViewAttachedToWindowlambda0 brazeActionVersionAndJson$android_sdk_ui_release = getBrazeActionVersionAndJson$android_sdk_ui_release(uri);
            if (brazeActionVersionAndJson$android_sdk_ui_release == null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda0(14), 6, (Object) null);
                return;
            }
            String str = (String) brazeActionVersionAndJson$android_sdk_ui_release.serializer;
            JSONObject jSONObject = (JSONObject) brazeActionVersionAndJson$android_sdk_ui_release.write;
            Object[] objArr = {str, BRAZE_ACTIONS_V1};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda1(str, 20), 7, (Object) null);
            } else {
                parse$android_sdk_ui_release(context, new StepData(jSONObject, channel));
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new UriAction$$ExternalSyntheticLambda4(9, uri), 6, (Object) null);
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new UriAction$$ExternalSyntheticLambda4(8, uri), 4, (Object) null);
        }
    }

    public final /* synthetic */ ActionType getActionType$android_sdk_ui_release(StepData stepData) {
        stepData.getClass();
        ActionType actionTypeFromValue = ActionType.Companion.fromValue(JsonUtils.getOptionalString(stepData.getSrcJson(), "type"));
        if (actionTypeFromValue.getImpl().isValid(stepData)) {
            return actionTypeFromValue;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeActionParser$$ExternalSyntheticLambda0(actionTypeFromValue, stepData, 0), 7, (Object) null);
        return ActionType.INVALID;
    }

    public final /* synthetic */ onViewAttachedToWindowlambda0 getBrazeActionVersionAndJson$android_sdk_ui_release(Uri uri) {
        JSONObject encodedActionToJson$android_sdk_ui_release;
        uri.getClass();
        String host = uri.getHost();
        String lastPathSegment = uri.getLastPathSegment();
        if (host == null || lastPathSegment == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) uri, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new UriAction$$ExternalSyntheticLambda4(7, uri), 7, (Object) null);
            return null;
        }
        try {
            encodedActionToJson$android_sdk_ui_release = parseEncodedActionToJson$android_sdk_ui_release(lastPathSegment);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) uri, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda1(lastPathSegment, 19), 4, (Object) null);
            encodedActionToJson$android_sdk_ui_release = null;
        }
        if (encodedActionToJson$android_sdk_ui_release == null) {
            return null;
        }
        return new onViewAttachedToWindowlambda0(host, encodedActionToJson$android_sdk_ui_release);
    }

    public final /* synthetic */ void parse$android_sdk_ui_release(Context context, StepData stepData) {
        context.getClass();
        stepData.getClass();
        int i = 1;
        try {
            ActionType actionType$android_sdk_ui_release = getActionType$android_sdk_ui_release(stepData);
            if (actionType$android_sdk_ui_release == ActionType.INVALID) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeActionParser$$ExternalSyntheticLambda0(actionType$android_sdk_ui_release, stepData, i), 6, (Object) null);
            actionType$android_sdk_ui_release.getImpl().run(context, stepData);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new StepData$$ExternalSyntheticLambda1(i, stepData), 4, (Object) null);
        }
    }

    public static /* synthetic */ void execute$default(BrazeActionParser brazeActionParser, Context context, Uri uri, Channel channel, int i, Object obj) {
        if ((i & 4) != 0) {
            channel = Channel.UNKNOWN;
        }
        brazeActionParser.execute(context, uri, channel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$0(Channel channel, Uri uri) {
        return "Attempting to parse Braze Action with channel " + channel + " and uri:\n'" + uri + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$2(String str) {
        return ff$$ExternalSyntheticOutline0.m("Braze Actions version ", str, " is unsupported. Version must be v1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$3(Uri uri) {
        return "Failed to parse uri as a Braze Action.\n'" + uri + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$4(Uri uri) {
        return "Done handling Braze uri\n'" + uri + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getActionType$lambda$0(ActionType actionType, StepData stepData) {
        return "Cannot parse invalid action of type " + actionType + " and data " + stepData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBrazeActionVersionAndJson$lambda$1(String str) {
        return ff$$ExternalSyntheticOutline0.m("Failed to decode action into json. Action:\n'", str, "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parse$lambda$0(ActionType actionType, StepData stepData) {
        return "Performing Braze Action type " + actionType + " with data " + stepData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parse$lambda$1(StepData stepData) {
        return "Failed to run with data " + stepData;
    }

    public final /* synthetic */ JSONObject parseEncodedActionToJson$android_sdk_ui_release(String str) {
        str.getClass();
        byte[] bArrDecode = Base64.decode(str, 8);
        bArrDecode.getClass();
        int length = bArrDecode.length / 2;
        int[] iArr = new int[length];
        int i = TuplesKt.read(0, bArrDecode.length - 1, 2);
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                iArr[i2 / 2] = (bArrDecode[i2] & 255) | ((bArrDecode[i2 + 1] & 255) << 8);
                if (i2 == i) {
                    break;
                }
                i2 += 2;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i4 < 0 || i4 > 65535) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i4, "Invalid Char code: "));
                return null;
            }
            sb.append((char) i4);
        }
        return new JSONObject(sb.toString());
    }
}
