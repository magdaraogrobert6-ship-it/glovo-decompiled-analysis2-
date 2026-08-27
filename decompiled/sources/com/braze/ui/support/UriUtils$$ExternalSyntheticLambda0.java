package com.braze.ui.support;

import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.graphics.Fields;
import com.braze.ui.inappmessage.views.InAppMessageBaseView;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class UriUtils$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ UriUtils$$ExternalSyntheticLambda0(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = write + 85;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i3 = this.$r8$classId;
        String str = this.f$0;
        if (i3 == 0) {
            return UriUtils.isActivityRegisteredInManifest$lambda$0(str);
        }
        if (i3 != 1) {
            return CompositionKt.RemoteActionCompatParcelizer(str);
        }
        String appropriateImageUrl$lambda$0 = InAppMessageBaseView.Companion.getAppropriateImageUrl$lambda$0(str);
        int i4 = IconCompatParcelizer + 73;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return appropriateImageUrl$lambda$0;
    }
}
