package com.braze.ui.actions.brazeactions;

import android.net.Uri;
import androidx.sqlite.SQLite;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.MessageButton;
import com.braze.ui.actions.brazeactions.steps.ContainerStep;
import com.braze.ui.actions.brazeactions.steps.StepData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o.accessgetInstancedelegatecp;
import o.getQueryParameterslambda2;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.onViewAttachedToWindowlambda0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class BrazeActionUtils {
    public static final /* synthetic */ List getAllUris(IInAppMessage iInAppMessage) {
        if (iInAppMessage == null) {
            return instance_delegatelambda0.write;
        }
        ArrayList arrayList = new ArrayList();
        Uri uri = iInAppMessage.getUri();
        if (uri != null) {
            arrayList.add(uri);
        }
        if (iInAppMessage instanceof IInAppMessageImmersive) {
            List<MessageButton> messageButtons = ((IInAppMessageImmersive) iInAppMessage).getMessageButtons();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = messageButtons.iterator();
            while (it.hasNext()) {
                Uri uri2 = ((MessageButton) it.next()).getUri();
                if (uri2 != null) {
                    arrayList2.add(uri2);
                }
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrazeActionParser.ActionType.values().length];
            try {
                iArr[BrazeActionParser.ActionType.CONTAINER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean containsAnyPushPermissionBrazeActions(IInAppMessage iInAppMessage) {
        iInAppMessage.getClass();
        return doAnyTypesMatch(BrazeActionParser.ActionType.REQUEST_PUSH_PERMISSION, getAllUris(iInAppMessage));
    }

    public static final boolean containsInvalidBrazeAction(Card card) {
        card.getClass();
        String url = card.getUrl();
        if (url == null) {
            return false;
        }
        BrazeActionParser.ActionType actionType = BrazeActionParser.ActionType.INVALID;
        Object[] objArr = {Uri.parse(url)};
        int iSerializer = getQueryParameterslambda2.serializer();
        return doAnyTypesMatch(actionType, (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, objArr, getQueryParameterslambda2.serializer(), -516583649, iSerializer));
    }

    public static final boolean doAnyTypesMatch(BrazeActionParser.ActionType actionType, List<? extends Uri> list) {
        JSONObject jSONObject;
        actionType.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (BrazeActionParser.INSTANCE.isBrazeActionUri((Uri) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            onViewAttachedToWindowlambda0 brazeActionVersionAndJson$android_sdk_ui_release = BrazeActionParser.INSTANCE.getBrazeActionVersionAndJson$android_sdk_ui_release((Uri) it.next());
            if (brazeActionVersionAndJson$android_sdk_ui_release == null || (jSONObject = (JSONObject) brazeActionVersionAndJson$android_sdk_ui_release.write) == null) {
                jSONObject = new JSONObject();
            }
            arrayList2.add(jSONObject);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) getAllBrazeActionStepTypes((JSONObject) it2.next()), (Collection) arrayList3);
        }
        if (arrayList3.isEmpty()) {
            return false;
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            if (((BrazeActionParser.ActionType) it3.next()) == actionType) {
                return true;
            }
        }
        return false;
    }

    public static final /* synthetic */ List getAllBrazeActionStepTypes(JSONObject jSONObject) {
        jSONObject.getClass();
        ArrayList arrayList = new ArrayList();
        StepData stepData = new StepData(jSONObject, null, 2, null);
        BrazeActionParser.ActionType actionType$android_sdk_ui_release = BrazeActionParser.INSTANCE.getActionType$android_sdk_ui_release(stepData);
        if (WhenMappings.$EnumSwitchMapping$0[actionType$android_sdk_ui_release.ordinal()] != 1) {
            arrayList.add(actionType$android_sdk_ui_release);
            return arrayList;
        }
        Iterator childStepIterator$android_sdk_ui_release = ContainerStep.INSTANCE.getChildStepIterator$android_sdk_ui_release(stepData);
        while (childStepIterator$android_sdk_ui_release.hasNext()) {
            arrayList.addAll(getAllBrazeActionStepTypes((JSONObject) childStepIterator$android_sdk_ui_release.next()));
        }
        return arrayList;
    }

    public static final boolean containsInvalidBrazeAction(IInAppMessage iInAppMessage) {
        iInAppMessage.getClass();
        return doAnyTypesMatch(BrazeActionParser.ActionType.INVALID, getAllUris(iInAppMessage));
    }
}
