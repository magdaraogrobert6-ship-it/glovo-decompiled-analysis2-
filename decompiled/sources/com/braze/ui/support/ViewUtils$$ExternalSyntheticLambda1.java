package com.braze.ui.support;

import android.app.Activity;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum;
import com.braze.enums.inappmessage.Orientation;
import com.braze.support.BrazeImageUtils;
import java.net.URL;
import o.AndroidAssetFont;
import o.ForgottenCoroutineScopeException;
import o.TextDecorationSpan;
import o.accessanyjd;
import o.createBrazeUserChangeEventSubscriberlambda01;
import o.getSkewX;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewUtils$$ExternalSyntheticLambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ViewUtils$$ExternalSyntheticLambda1(int i, Object obj, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
        this.f$1 = obj;
    }

    public /* synthetic */ ViewUtils$$ExternalSyntheticLambda1(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$0 = i;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        getSkewX getskewx;
        int i = 2 % 2;
        int i2 = write + 51;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i3 = this.$r8$classId;
        int i4 = this.f$0;
        Object obj2 = this.f$1;
        if (i3 == 0) {
            return ViewUtils.setActivityRequestedOrientation$lambda$0(i4, (Activity) obj2);
        }
        boolean z = true;
        if (i3 == 1) {
            return new ForgottenCoroutineScopeException(i4, 0.0f, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj2);
        }
        if (i3 == 2) {
            return Integer.valueOf(((accessanyjd) obj2).serializer.getLineForOffset(i4));
        }
        if (i3 == 3) {
            return LoremIpsum.generateLoremIpsum$lambda$0((createBrazeUserChangeEventSubscriberlambda01) obj2, i4);
        }
        if (i3 == 4) {
            return BrazeImageUtils.getRemoteBitmap$lambda$1(i4, (URL) obj2);
        }
        if (i3 == 5) {
            return ViewUtils.isCurrentOrientationValid$lambda$2(i4, (Orientation) obj2);
        }
        ((AndroidAssetFont) obj2).getClass();
        if (i4 == 2) {
            int i5 = write + 17;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                getSkewX getskewx2 = getSkewX.NORMAL;
                throw null;
            }
            getskewx = getSkewX.NORMAL;
        } else {
            getskewx = getSkewX.SILENT;
        }
        if (i4 != 1) {
            int i6 = RemoteActionCompatParcelizer + 81;
            write = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0 ? i4 != 2 : i4 != 4) {
                z = false;
            }
        }
        return new TextDecorationSpan(getskewx, z);
    }
}
