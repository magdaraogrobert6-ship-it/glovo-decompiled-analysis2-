package androidx.savedstate.internal;

import androidx.compose.ui.graphics.Fields;
import com.mapbox.maps.plugin.lifecycle.ViewLifecycleOwner;
import o.AndroidColorSpace_androidKt;
import o.PopulateViewStructure_androidKtpopulate7;
import o.accessisRenderNodeCompatiblecp;
import o.accessregisterComponentCallback;
import o.getRed0d7_KjU;
import o.toAndroidColorSpace;
import o.toColorLong8_81llA;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SavedStateRegistryImpl$$ExternalSyntheticLambda0 implements toAndroidColorSpace {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;

    public /* synthetic */ SavedStateRegistryImpl$$ExternalSyntheticLambda0(int i, Object obj) {
        this.RemoteActionCompatParcelizer = i;
        this.read = obj;
    }

    @Override // o.toAndroidColorSpace
    public final void onStateChanged(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, AndroidColorSpace_androidKt androidColorSpace_androidKt) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        Object obj = this.read;
        boolean z = false;
        if (i2 == 0) {
            getRed0d7_KjU getred0d7_kju = (getRed0d7_KjU) obj;
            if (androidColorSpace_androidKt != AndroidColorSpace_androidKt.ON_START) {
                if (androidColorSpace_androidKt == AndroidColorSpace_androidKt.ON_STOP) {
                    getred0d7_kju.read = false;
                    return;
                }
                return;
            } else {
                int i3 = IconCompatParcelizer + 23;
                write = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                getred0d7_kju.read = true;
                return;
            }
        }
        if (i2 != 1) {
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) obj;
            if (androidColorSpace_androidKt == AndroidColorSpace_androidKt.ON_RESUME) {
                int i5 = write + 49;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                z = true;
            }
            populateViewStructure_androidKtpopulate7.setValue(Boolean.valueOf(z));
            return;
        }
        ViewLifecycleOwner viewLifecycleOwner = (ViewLifecycleOwner) obj;
        accessregisterComponentCallback accessregistercomponentcallback = viewLifecycleOwner.viewLifecycleRegistry;
        boolean zIsAtLeast = accessregistercomponentcallback.RatingCompat.isAtLeast(toColorLong8_81llA.CREATED);
        if (!viewLifecycleOwner.isAttached) {
            int i7 = write + 37;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                int i8 = 33 / 0;
                if (!zIsAtLeast) {
                    return;
                }
            } else if (!zIsAtLeast) {
                return;
            }
            if (androidColorSpace_androidKt != AndroidColorSpace_androidKt.ON_DESTROY) {
                return;
            }
        }
        accessregistercomponentcallback.serializer(androidColorSpace_androidKt);
    }
}
