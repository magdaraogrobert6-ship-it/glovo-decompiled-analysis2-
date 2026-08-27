package androidx.compose.foundation.text;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.Constraints;
import androidx.room.RoomDatabase$$ExternalSyntheticLambda2;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import io.sentry.SentryUUID;
import java.util.ArrayList;
import java.util.List;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.SizeKt;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.instance_delegatelambda0;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes.dex */
public abstract class AnnotatedStringResolveInlineContentKt {
    public static final onViewAttachedToWindowlambda0 write;

    static {
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        write = new onViewAttachedToWindowlambda0(instance_delegatelambda0Var, instance_delegatelambda0Var);
    }

    public static final void InlineChildren(AnnotatedString annotatedString, List list, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1794596951);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(annotatedString) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(list) ? 32 : 16;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 19) != 18)) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                AnnotatedString.Range range = (AnnotatedString.Range) list.get(i3);
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) range.component1();
                int iComponent2 = range.component2();
                int iComponent3 = range.component3();
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new MeasurePolicy() { // from class: androidx.compose.foundation.text.AnnotatedStringResolveInlineContentKt$InlineChildren$1$2$1
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        /* JADX INFO: renamed from: measure-3p2s80s */
                        public final MeasureResult mo6measure3p2s80s(MeasureScope measureScope, List list2, long j) {
                            ArrayList arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i4 = 0; i4 < size2; i4++) {
                                arrayList.add(((Measurable) list2.get(i4)).mo2209measureBRTryo0(j));
                            }
                            return MeasureScope.layout$default(measureScope, Constraints.m3626getMaxWidthimpl(j), Constraints.m3625getMaxHeightimpl(j), null, new RoomDatabase$$ExternalSyntheticLambda2(4, arrayList), 4, null);
                        }
                    };
                    getpostalcode.write(objComponentActivity);
                }
                MeasurePolicy measurePolicy = (MeasurePolicy) objComponentActivity;
                Modifier.Companion companion = Modifier.Companion;
                int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, companion);
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
                if (getpostalcode.read != null) {
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(annotatedString.subSequence(iComponent2, iComponent3).getText(), getpostalcode, 0);
                    getpostalcode.IconCompatParcelizer(true);
                } else {
                    SentryUUID.write();
                    throw null;
                }
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new SizeKt(i, 1, annotatedString, list);
        }
    }
}
