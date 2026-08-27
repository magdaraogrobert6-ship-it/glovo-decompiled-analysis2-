package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import io.sentry.SentryUUID;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class AdjustBridgeInstance15 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY read;

    public /* synthetic */ AdjustBridgeInstance15(r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, int i) {
        this.IconCompatParcelizer = i;
        this.read = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        TextFieldKt textFieldKt = TextFieldKt.read;
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = this.read;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        boolean z = false;
        if (i2 != 0) {
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                io.sentry.hints.PlaybackStateCompatCustomAction playbackStateCompatCustomAction = androidx.compose.foundation.layout.Arrangement.MediaBrowserCompatMediaItem;
                snapElevation snapelevationIconCompatParcelizer = androidx.compose.foundation.layout.Arrangement.IconCompatParcelizer(HeaderKt.write);
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
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(textFieldKt, getpostalcode, 6);
                getpostalcode.IconCompatParcelizer(true);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                int i3 = serializer + 65;
                write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
            }
            return createfromparcel;
        }
        if ((iIntValue & 3) != 2) {
            int i5 = write + 103;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 3 / 2;
            }
            z = true;
        }
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        if (getpostalcode2.write(iIntValue & 1, z)) {
            io.sentry.hints.PlaybackStateCompatCustomAction playbackStateCompatCustomAction2 = androidx.compose.foundation.layout.Arrangement.MediaBrowserCompatMediaItem;
            snapElevation snapelevationIconCompatParcelizer2 = androidx.compose.foundation.layout.Arrangement.IconCompatParcelizer(HeaderKt.write);
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
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor2);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion4, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer2, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(textFieldKt, getpostalcode2, 6);
            getpostalcode2.IconCompatParcelizer(true);
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createfromparcel;
    }
}
