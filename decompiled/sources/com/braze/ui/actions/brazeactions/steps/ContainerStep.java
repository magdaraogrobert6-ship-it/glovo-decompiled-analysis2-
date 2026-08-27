package com.braze.ui.actions.brazeactions.steps;

import android.content.Context;
import com.braze.ui.actions.brazeactions.BrazeActionParser;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;
import kotlin.ranges.RangesKt;
import o.BackspaceCommand;
import o.ensureSubscribedToInAppMessageEventslambda7;
import o.getContentCardsActionListener;
import o.onContentCardDismissed;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.resetAfterInAppMessageCloselambda2;
import o.verifyOrientationStatuslambda1;
import o.verifyOrientationStatuslambda3;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ContainerStep extends BaseBrazeActionStep {
    public static final ContainerStep INSTANCE = new ContainerStep();
    public static final String STEPS = "steps";

    private ContainerStep() {
        super(null);
    }

    public final Iterator getChildStepIterator$android_sdk_ui_release(StepData stepData) {
        stepData.getClass();
        final JSONArray jSONArray = stepData.getSrcJson().getJSONArray(STEPS);
        if (jSONArray == null) {
            return getContentCardsActionListener.IconCompatParcelizer;
        }
        Object[] objArr = {0, Integer.valueOf(jSONArray.length())};
        int iWrite = BackspaceCommand.write();
        return new verifyOrientationStatuslambda1(new verifyOrientationStatuslambda3(resetAfterInAppMessageCloselambda2.read(onContentCardDismissed.read((ensureSubscribedToInAppMessageEventslambda7) RangesKt.read(281231685, BackspaceCommand.write(), BackspaceCommand.write(), objArr, BackspaceCommand.write(), -281231677, iWrite)), new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.braze.ui.actions.brazeactions.steps.ContainerStep$getChildStepIterator$$inlined$iterator$1
            public final Boolean invoke(int i) {
                return Boolean.valueOf(jSONArray.opt(i) instanceof JSONObject);
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }), new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.braze.ui.actions.brazeactions.steps.ContainerStep$getChildStepIterator$$inlined$iterator$2
            public final JSONObject invoke(int i) throws JSONException {
                Object obj = jSONArray.get(i);
                if (obj != null) {
                    return (JSONObject) obj;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("null cannot be cast to non-null type org.json.JSONObject");
                return null;
            }

            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }));
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public boolean isValid(StepData stepData) {
        stepData.getClass();
        return stepData.getSrcJson().has(STEPS);
    }

    @Override // com.braze.ui.actions.brazeactions.steps.IBrazeActionStep
    public void run(Context context, StepData stepData) {
        context.getClass();
        stepData.getClass();
        Iterator childStepIterator$android_sdk_ui_release = getChildStepIterator$android_sdk_ui_release(stepData);
        while (childStepIterator$android_sdk_ui_release.hasNext()) {
            BrazeActionParser.INSTANCE.parse$android_sdk_ui_release(context, StepData.copy$default(stepData, (JSONObject) childStepIterator$android_sdk_ui_release.next(), null, 2, null));
        }
    }
}
