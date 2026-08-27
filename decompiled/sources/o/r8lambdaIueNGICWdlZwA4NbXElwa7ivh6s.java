package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.braze.support.BrazeImageUtils$$ExternalSyntheticLambda20;
import com.roadrunner.delivery.ontheway.navigation.presentation.compose.NavigationButtonKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r8lambdaIueNGICWdlZwA4NbXElwa7ivh6s implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ boolean serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ r8lambdaIueNGICWdlZwA4NbXElwa7ivh6s(boolean z, int i) {
        this.write = i;
        this.serializer = z;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 111;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.write == 0) {
            r8lambdaLkT0v6bslMXeH9UIdc7Vd9zwj1w r8lambdalkt0v6bslmxeh9uidc7vd9zwj1w = (r8lambdaLkT0v6bslMXeH9UIdc7Vd9zwj1w) obj2;
            r8lambdalkt0v6bslmxeh9uidc7vd9zwj1w.getClass();
            String str = r8lambdalkt0v6bslmxeh9uidc7vd9zwj1w.type;
            String str2 = r8lambdalkt0v6bslmxeh9uidc7vd9zwj1w.label;
            String str3 = r8lambdalkt0v6bslmxeh9uidc7vd9zwj1w.timeRange;
            String str4 = r8lambdalkt0v6bslmxeh9uidc7vd9zwj1w.iconUrl;
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            return new r8lambdaLkT0v6bslMXeH9UIdc7Vd9zwj1w(str, str2, str3, str4, this.serializer);
        }
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if ((iIntValue & 3) != 2) {
            int i3 = read + 43;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, z)) {
            ArrangementHorizontal arrangementHorizontal = ArrangementCenter1.read("NavigationButton.infiniteTransition", getpostalcode, 0);
            Object[] objArr = {400, 0, performFling.read, 2};
            placeSpaceBetweenfoundation_layout placespacebetweenfoundation_layoutIconCompatParcelizer = ArrangementCenter1.IconCompatParcelizer(arrangementHorizontal, 0.0f, 1.0f, DelayKt.RemoteActionCompatParcelizer((requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), objArr), BoxMeasurePolicy.Reverse, 4), "NavigationButton.travelRate", getpostalcode, 29112, 0);
            float f = -((androidx.compose.ui.unit.Density) getpostalcode.write((getNewPassword) androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity())).mo48toPx0680j_4(androidx.compose.ui.unit.Dp.m3673constructorimpl(8.0f));
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
            float f2 = Dimensions.setStackedBackground;
            androidx.compose.ui.Modifier modifierIconCompatParcelizer = androidx.compose.foundation.layout.PaddingKt.IconCompatParcelizer(companion, new SwitchDefaults(f2, f2, f2, f2));
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(androidx.compose.foundation.layout.Arrangement.MediaBrowserCompatMediaItem, androidx.compose.ui.Alignment.Companion.getTop(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            androidx.compose.ui.Modifier modifierMaterializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode, modifierIconCompatParcelizer);
            androidx.compose.ui.node.ComposeUiNode.Companion companion2 = androidx.compose.ui.node.ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
                int i5 = read + 99;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            boolean z2 = getpostalcode.read(placespacebetweenfoundation_layoutIconCompatParcelizer);
            boolean zSerializer = getpostalcode.serializer(f);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((z2 | zSerializer) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new BrazeImageUtils$$ExternalSyntheticLambda20(f, placespacebetweenfoundation_layoutIconCompatParcelizer, 1);
                getpostalcode.write(objComponentActivity);
            }
            NavigationButtonKt.read(this.serializer, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 0);
            getpostalcode.IconCompatParcelizer(true);
            int i7 = read + 37;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }
}
