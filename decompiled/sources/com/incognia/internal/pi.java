package com.incognia.internal;

import kotlin.collections.ReversedListReadOnly;
import kotlin.jvm.internal.Lambda;
import o.getIsCurrentlyDisplayingInAppMessage;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class pi extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final pi BGx = new pi();

    public pi() {
        super(1);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        getIsCurrentlyDisplayingInAppMessage getiscurrentlydisplayinginappmessage = (getIsCurrentlyDisplayingInAppMessage) obj;
        return new FMn((String) ((ReversedListReadOnly) getiscurrentlydisplayinginappmessage.IconCompatParcelizer()).get(1), Boolean.valueOf(((CharSequence) ((ReversedListReadOnly) getiscurrentlydisplayinginappmessage.IconCompatParcelizer()).get(2)).length() > 0));
    }
}
