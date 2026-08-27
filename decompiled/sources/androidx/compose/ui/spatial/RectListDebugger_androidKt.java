package androidx.compose.ui.spatial;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.ContentType_androidKt;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
public final class RectListDebugger_androidKt {
    public static final void RectListDebugger(final Modifier modifier, getBirthDateFull getbirthdatefull, final int i, final int i2) {
        int i3;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(949081399);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (getpostalcode.read(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (getpostalcode.write(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            Modifier modifierThen = modifier.then(RectListDebuggerModifierElement.INSTANCE);
            EmptyFillMeasurePolicy emptyFillMeasurePolicy = EmptyFillMeasurePolicy.INSTANCE;
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
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
            AndroidContentCaptureManagerCompanion.write(getpostalcode, emptyFillMeasurePolicy, companion.getSetMeasurePolicy());
            AndroidContentCaptureManagerCompanion.write(getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer, companion.getSetResolvedCompositionLocals());
            AndroidContentCaptureManagerCompanion.write(getpostalcode, companion.getApplyOnDeactivatedNodeAssertion());
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, companion.getSetModifier());
            AndroidContentCaptureManagerCompanion.write(getpostalcode, Integer.valueOf(iHashCode), companion.getSetCompositeKeyHash());
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.spatial.RectListDebugger_androidKt.RectListDebugger.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(getBirthDateFull getbirthdatefull2, int i5) {
                    RectListDebugger_androidKt.RectListDebugger(modifier, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                }

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }
}
