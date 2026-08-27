package io.sentry;

import com.google.firebase.inappmessaging.CommonTypesProto$TriggeringCondition;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import io.reactivex.functions.Predicate;
import io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
import io.sentry.util.MediaSessionCompatQueueItem;
import io.sentry.util.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
import java.nio.charset.Charset;
import o.BrazeActionUtils;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.r8lambdaaCm2JcMru73kJeywi54SW2Mni8U;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class SpanId$$ExternalSyntheticLambda1 implements Predicate, ObjectConstructor, MediaSessionCompatQueueItem, r8lambdaaCm2JcMru73kJeywi54SW2Mni8U {
    public final /* synthetic */ String serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ SpanId$$ExternalSyntheticLambda1(r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, String str) {
        this.write = 9;
        this.serializer = str;
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        int i = this.write;
        String str = this.serializer;
        if (i == 2) {
            return ConstructorConstructor.lambda$newUnsafeAllocator$20(str);
        }
        if (i == 3) {
            return ConstructorConstructor.lambda$newDefaultConstructor$7(str);
        }
        if (i == 4) {
            return ConstructorConstructor.lambda$newDefaultConstructor$8(str);
        }
        if (i != 5) {
            return i != 6 ? ConstructorConstructor.lambda$get$4(str) : ConstructorConstructor.lambda$get$3(str);
        }
        return ConstructorConstructor.lambda$get$2(str);
    }

    @Override // io.sentry.util.MediaSessionCompatQueueItem
    public Object evaluate() {
        int i = this.write;
        String str = this.serializer;
        if (i == 0 || i != 9) {
            return str;
        }
        Charset charset = r8lambda54BeH8ZsBru0CXI2CCSP2syNys.IconCompatParcelizer;
        if (str.equals("0000-0000")) {
            str = "00000000-0000-0000-0000-000000000000";
        }
        return str.replace("-", "");
    }

    @Override // o.r8lambdaaCm2JcMru73kJeywi54SW2Mni8U
    public void write(BrazeActionUtils brazeActionUtils) {
        brazeActionUtils.IconCompatParcelizer(this.serializer);
    }

    @Override // io.reactivex.functions.Predicate
    public boolean read(Object obj) {
        CampaignProto$ThickContent campaignProto$ThickContent = (CampaignProto$ThickContent) obj;
        String str = this.serializer;
        if (str.equals("ON_FOREGROUND") && campaignProto$ThickContent.getIsTestCampaign()) {
            return true;
        }
        for (CommonTypesProto$TriggeringCondition commonTypesProto$TriggeringCondition : campaignProto$ThickContent.getTriggeringConditionsList()) {
            if (commonTypesProto$TriggeringCondition.getFiamTrigger().toString().equals(str) || commonTypesProto$TriggeringCondition.getEvent().getName().equals(str)) {
                DefaultContentCardsUpdateHandlerCompanionCREATOR1.RemoteActionCompatParcelizer();
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ SpanId$$ExternalSyntheticLambda1(String str, int i) {
        this.write = i;
        this.serializer = str;
    }
}
