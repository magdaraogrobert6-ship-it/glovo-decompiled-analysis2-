package com.braze.ui.actions.brazeactions.steps;

import com.braze.enums.Channel;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.ui.support.ViewUtils$$ExternalSyntheticLambda6;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import o.BackspaceCommand;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getCieXyz;
import o.getContentCardsActionListener;
import o.isAdapterPositionOnScreen;
import o.onContentCardDismissed;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.resetAfterInAppMessageCloselambda2;
import o.verifyOrientationStatuslambda1;
import o.verifyOrientationStatuslambda3;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class StepData {
    public static final String ARGS = "args";
    public static final Companion Companion = new Companion(null);
    private final onViewDetachedFromWindowlambda1 args$delegate;
    private final Channel channel;
    private final onViewDetachedFromWindowlambda1 firstArg$delegate;
    private final onViewDetachedFromWindowlambda1 secondArg$delegate;
    private final JSONObject srcJson;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object firstArg_delegate$lambda$0(StepData stepData) {
        return stepData.getArg$android_sdk_ui_release(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object secondArg_delegate$lambda$0(StepData stepData) {
        return stepData.getArg$android_sdk_ui_release(1);
    }

    public final JSONObject component1() {
        return this.srcJson;
    }

    public final Channel component2() {
        return this.channel;
    }

    public final Channel getChannel() {
        return this.channel;
    }

    public final JSONObject getSrcJson() {
        return this.srcJson;
    }

    private final List<Object> getArgs() {
        return (List) this.args$delegate.MediaSessionCompatResultReceiverWrapper();
    }

    public final Object getFirstArg() {
        return this.firstArg$delegate.MediaSessionCompatResultReceiverWrapper();
    }

    public final Object getSecondArg() {
        return this.secondArg$delegate.MediaSessionCompatResultReceiverWrapper();
    }

    public int hashCode() {
        return this.channel.hashCode() + (this.srcJson.hashCode() * 31);
    }

    public String toString() {
        return "Channel " + this.channel + " and json\n" + JsonUtils.getPrettyPrintedString(this.srcJson);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public StepData(JSONObject jSONObject, Channel channel) {
        jSONObject.getClass();
        channel.getClass();
        this.srcJson = jSONObject;
        this.channel = channel;
        this.args$delegate = new isAdapterPositionOnScreen(new StepData$$ExternalSyntheticLambda1(0, this));
        this.firstArg$delegate = new isAdapterPositionOnScreen(new StepData$$ExternalSyntheticLambda1(4, this));
        this.secondArg$delegate = new isAdapterPositionOnScreen(new StepData$$ExternalSyntheticLambda1(5, this));
    }

    public final StepData copy(JSONObject jSONObject, Channel channel) {
        jSONObject.getClass();
        channel.getClass();
        return new StepData(jSONObject, channel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List args_delegate$lambda$0(StepData stepData) {
        Iterator verifyorientationstatuslambda1;
        final JSONArray jSONArrayOptJSONArray = stepData.srcJson.optJSONArray(ARGS);
        if (jSONArrayOptJSONArray == null) {
            verifyorientationstatuslambda1 = getContentCardsActionListener.IconCompatParcelizer;
        } else {
            Object[] objArr = {0, Integer.valueOf(jSONArrayOptJSONArray.length())};
            int iWrite = BackspaceCommand.write();
            verifyorientationstatuslambda1 = new verifyOrientationStatuslambda1(new verifyOrientationStatuslambda3(resetAfterInAppMessageCloselambda2.read(onContentCardDismissed.read((ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -281231677, iWrite)), new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$args_delegate$lambda$0$$inlined$iterator$1
                public final Boolean invoke(int i) {
                    return Boolean.valueOf(Objects.nonNull(jSONArrayOptJSONArray.opt(i)));
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }
            }), new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.braze.ui.actions.brazeactions.steps.StepData$args_delegate$lambda$0$$inlined$iterator$2
                public final Object invoke(int i) throws JSONException {
                    Object obj = jSONArrayOptJSONArray.get(i);
                    if (obj != null) {
                        return obj;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("null cannot be cast to non-null type kotlin.Any");
                    return null;
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* synthetic */ Object invoke(Object obj) {
                    return invoke(((Number) obj).intValue());
                }
            }));
        }
        return resetAfterInAppMessageCloselambda2.read(resetAfterInAppMessageCloselambda2.serializer(verifyorientationstatuslambda1));
    }

    public static /* synthetic */ StepData copy$default(StepData stepData, JSONObject jSONObject, Channel channel, int i, Object obj) {
        if ((i & 1) != 0) {
            jSONObject = stepData.srcJson;
        }
        if ((i & 2) != 0) {
            channel = stepData.channel;
        }
        return stepData.copy(jSONObject, channel);
    }

    public final BrazeProperties coerceArgToPropertiesOrNull(int i) {
        Object obj = onContentCardDismissed.read(i, getArgs());
        if (obj == null || !(obj instanceof JSONObject)) {
            return null;
        }
        return new BrazeProperties((JSONObject) obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepData)) {
            return false;
        }
        StepData stepData = (StepData) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.srcJson, stepData.srcJson}, getCieXyz.write())).booleanValue() && this.channel == stepData.channel;
    }

    public final Object getArg$android_sdk_ui_release(int i) {
        return onContentCardDismissed.read(i, getArgs());
    }

    public final boolean isArgCountInBounds(int i, ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7) {
        if (i != -1 && getArgs().size() != i) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new StepData$$ExternalSyntheticLambda0(i, this, 2), 7, (Object) null);
            return false;
        }
        int i2 = 1;
        if (ensuresubscribedtoinappmessageeventslambda7 == null || ensuresubscribedtoinappmessageeventslambda7.serializer(getArgs().size())) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ViewUtils$$ExternalSyntheticLambda6(ensuresubscribedtoinappmessageeventslambda7, i2, this), 7, (Object) null);
        return false;
    }

    public final boolean isArgString(int i) {
        if (getArg$android_sdk_ui_release(i) instanceof String) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new StepData$$ExternalSyntheticLambda0(i, this, 0), 7, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isArgOptionalJsonObject$lambda$0(int i, StepData stepData) {
        return "Argument [" + i + "] is not a JSONObject. Source: " + stepData.srcJson;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isArgString$lambda$0(int i, StepData stepData) {
        return "Argument [" + i + "] is not a String. Source: " + stepData.srcJson;
    }

    public final boolean isArgOptionalJsonObject(int i) {
        Object arg$android_sdk_ui_release = getArg$android_sdk_ui_release(i);
        int i2 = 1;
        if (arg$android_sdk_ui_release == null || (arg$android_sdk_ui_release instanceof JSONObject)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new StepData$$ExternalSyntheticLambda0(i, this, i2), 7, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isArgCountInBounds$lambda$0(int i, StepData stepData) {
        return "Expected " + i + " arguments. Got: " + stepData.getArgs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isArgCountInBounds$lambda$1(ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7, StepData stepData) {
        return "Expected " + ensuresubscribedtoinappmessageeventslambda7 + " arguments. Got: " + stepData.getArgs();
    }

    public static /* synthetic */ boolean isArgCountInBounds$default(StepData stepData, int i, ensureSubscribedToInAppMessageEventslambda7 ensuresubscribedtoinappmessageeventslambda7, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        if ((i2 & 2) != 0) {
            ensuresubscribedtoinappmessageeventslambda7 = null;
        }
        return stepData.isArgCountInBounds(i, ensuresubscribedtoinappmessageeventslambda7);
    }

    public /* synthetic */ StepData(JSONObject jSONObject, Channel channel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject, (i & 2) != 0 ? Channel.UNKNOWN : channel);
    }
}
