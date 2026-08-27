package com.roadrunner.helpcenter.data.help_center_url;

import androidx.compose.ui.graphics.Fields;
import com.huawei.agconnect.config.impl.m;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterUrlRepository$fetchHelpCenterUrl$1 extends ContinuationImpl {
    private static int read = 1;
    private static int serializer;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ m RemoteActionCompatParcelizer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpCenterUrlRepository$fetchHelpCenterUrl$1(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 1;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objM4504fetchHelpCenterUrlgIAlus = this.RemoteActionCompatParcelizer.m4504fetchHelpCenterUrlgIAlus(null, this);
        if (objM4504fetchHelpCenterUrlgIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4504fetchHelpCenterUrlgIAlus);
        }
        int i4 = serializer + 115;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objM4504fetchHelpCenterUrlgIAlus;
    }
}
