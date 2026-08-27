package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.delivery.accept.autoaccept.presentation.compose.EarningsComposableKt;
import com.roadrunner.delivery.accept.earnings.presentation.compose.EarningsContentKt;
import io.sentry.SentryUUID;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class isLineEndSpace implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ lookupAndInterpolate RemoteActionCompatParcelizer;
    public final /* synthetic */ getDEFAULT_LAYOUT_ALIGNMENTui_text read;
    public final /* synthetic */ int write;

    public /* synthetic */ isLineEndSpace(lookupAndInterpolate lookupandinterpolate, getDEFAULT_LAYOUT_ALIGNMENTui_text getdefault_layout_alignmentui_text, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer = lookupandinterpolate;
        this.read = getdefault_layout_alignmentui_text;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003c  */
    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getDEFAULT_LAYOUT_ALIGNMENTui_text getdefault_layout_alignmentui_text = this.read;
        lookupAndInterpolate lookupandinterpolate = this.RemoteActionCompatParcelizer;
        ProgressIndicatorKt progressIndicatorKt = (ProgressIndicatorKt) obj;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        Object obj4 = null;
        if (i2 == 0) {
            progressIndicatorKt.getClass();
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(iIntValue & 1, (iIntValue & 17) != 16)) {
                int i3 = IconCompatParcelizer + 79;
                serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                if (lookupandinterpolate == null) {
                    getpostalcode.serializer(-63476462);
                } else {
                    getpostalcode.serializer(-63476461);
                    EarningsContentKt.PromoBonus(lookupandinterpolate, null, getpostalcode, 0);
                }
                getpostalcode.IconCompatParcelizer(false);
                if (getdefault_layout_alignmentui_text == null) {
                    getpostalcode.serializer(-63423669);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(-63423668);
                    io.sentry.hints.PlaybackStateCompatCustomAction playbackStateCompatCustomAction = androidx.compose.foundation.layout.Arrangement.MediaBrowserCompatMediaItem;
                    snapElevation snapelevationIconCompatParcelizer = androidx.compose.foundation.layout.Arrangement.IconCompatParcelizer(androidx.compose.ui.unit.Dp.m3673constructorimpl(0.0f));
                    androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.Companion.getCenterVertically();
                    androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
                    supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(snapelevationIconCompatParcelizer, centerVertically, getpostalcode, 54);
                    int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                    androidx.compose.ui.Modifier modifierMaterializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode, companion);
                    androidx.compose.ui.node.ComposeUiNode.Companion companion2 = androidx.compose.ui.node.ComposeUiNode.Companion;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
                    if (getpostalcode.read == null) {
                        SentryUUID.write();
                        throw null;
                    }
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        int i5 = IconCompatParcelizer + 5;
                        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i6 = i5 % 2;
                    }
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                    if (lookupandinterpolate != null) {
                        getpostalcode.serializer(-1712350534);
                        EarningsContentKt.read(getpostalcode, 0);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(-1712300562);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    EarningsContentKt.Multiplier(getdefault_layout_alignmentui_text, null, getpostalcode, 0);
                    getpostalcode.IconCompatParcelizer(true);
                    getpostalcode.IconCompatParcelizer(false);
                }
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        progressIndicatorKt.getClass();
        if ((iIntValue & 17) != 16) {
            int i7 = serializer + 57;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        if (!getpostalcode2.write(iIntValue & 1, z)) {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            if (lookupandinterpolate == null) {
                getpostalcode2.serializer(1241085422);
            } else {
                getpostalcode2.serializer(1241085423);
                EarningsComposableKt.PromoBonus(lookupandinterpolate, null, getpostalcode2, 0);
            }
            getpostalcode2.IconCompatParcelizer(false);
            if (getdefault_layout_alignmentui_text == null) {
                getpostalcode2.serializer(1241138215);
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                getpostalcode2.serializer(1241138216);
                io.sentry.hints.PlaybackStateCompatCustomAction playbackStateCompatCustomAction2 = androidx.compose.foundation.layout.Arrangement.MediaBrowserCompatMediaItem;
                snapElevation snapelevationIconCompatParcelizer2 = androidx.compose.foundation.layout.Arrangement.IconCompatParcelizer(androidx.compose.ui.unit.Dp.m3673constructorimpl(0.0f));
                androidx.compose.ui.Alignment.Vertical centerVertically2 = androidx.compose.ui.Alignment.Companion.getCenterVertically();
                androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.Companion;
                supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer2 = TextFieldDefaults.serializer(snapelevationIconCompatParcelizer2, centerVertically2, getpostalcode2, 54);
                int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
                androidx.compose.ui.Modifier modifierMaterializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode2, companion3);
                androidx.compose.ui.node.ComposeUiNode.Companion companion4 = androidx.compose.ui.node.ComposeUiNode.Companion;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion4.getConstructor();
                if (getpostalcode2.read == null) {
                    SentryUUID.write();
                    throw null;
                }
                int i8 = serializer + 1;
                IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    boolean z2 = getpostalcode2.ComponentActivity;
                    obj4.hashCode();
                    throw null;
                }
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor2);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion4, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer2, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
                if (lookupandinterpolate != null) {
                    int i9 = serializer + 5;
                    IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    getpostalcode2.serializer(-205523540);
                    EarningsComposableKt.write(getpostalcode2, 0);
                    getpostalcode2.IconCompatParcelizer(false);
                } else {
                    getpostalcode2.serializer(-205473568);
                    getpostalcode2.IconCompatParcelizer(false);
                }
                EarningsComposableKt.Multiplier(getdefault_layout_alignmentui_text, null, getpostalcode2, 0);
                getpostalcode2.IconCompatParcelizer(true);
                getpostalcode2.IconCompatParcelizer(false);
            }
        }
        return createfromparcel;
    }
}
