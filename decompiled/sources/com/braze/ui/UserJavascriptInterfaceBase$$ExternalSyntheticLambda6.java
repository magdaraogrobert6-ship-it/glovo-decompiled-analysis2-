package com.braze.ui;

import com.braze.BrazeUser;
import com.braze.ui.actions.brazeactions.steps.AddToCustomAttributeArrayStep;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class UserJavascriptInterfaceBase$$ExternalSyntheticLambda6 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ UserJavascriptInterfaceBase$$ExternalSyntheticLambda6(String str, String str2, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = str2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        String str = this.f$1;
        String str2 = this.f$0;
        BrazeUser brazeUser = (BrazeUser) obj;
        if (i == 0) {
            return UserJavascriptInterfaceBase.addAlias$lambda$0(str2, str, brazeUser);
        }
        if (i != 1) {
            return i != 2 ? AddToCustomAttributeArrayStep.run$lambda$0(str2, str, brazeUser) : UserJavascriptInterfaceBase.addToCustomAttributeArray$lambda$0(str2, str, brazeUser);
        }
        return UserJavascriptInterfaceBase.removeFromCustomAttributeArray$lambda$0(str2, str, brazeUser);
    }
}
