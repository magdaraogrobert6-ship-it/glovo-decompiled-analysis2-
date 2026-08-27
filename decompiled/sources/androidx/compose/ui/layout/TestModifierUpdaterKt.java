package androidx.compose.ui.layout;

import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import io.sentry.SentryUUID;
import java.util.List;
import o.AndroidContentCaptureManagerCompanion;
import o.ContentType_androidKt;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.onItemDismisslambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
public final class TestModifierUpdaterKt {
    @onItemDismisslambda0
    public static final void TestModifierUpdaterLayout(final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1673066036);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 3) != 2)) {
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new MeasurePolicy() { // from class: androidx.compose.ui.layout.TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final MeasureResult mo6measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                        return MeasureScope.layout$default(measureScope, Constraints.m3626getMaxWidthimpl(j), Constraints.m3625getMaxHeightimpl(j), null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.layout.TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1$1.1
                            public final void invoke(Placeable.PlacementScope placementScope) {
                            }

                            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((Placeable.PlacementScope) obj);
                                return createFromParcel.INSTANCE;
                            }
                        }, 4, null);
                    }
                };
                getpostalcode.write(objComponentActivity);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objComponentActivity;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor$ui = LayoutNode.Companion.getConstructor$ui();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.write(125, 1, null, null);
            getpostalcode.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = true;
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor$ui);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            AndroidContentCaptureManagerCompanion.write(getpostalcode, measurePolicy, companion.getSetMeasurePolicy());
            AndroidContentCaptureManagerCompanion.write(getpostalcode, Integer.valueOf(iHashCode), companion.getSetCompositeKeyHash());
            AndroidContentCaptureManagerCompanion.read(getpostalcode, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.layout.TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1
                {
                    super(1);
                }

                public final void invoke(LayoutNode layoutNode) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new TestModifierUpdater(layoutNode));
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((LayoutNode) obj);
                    return createFromParcel.INSTANCE;
                }
            });
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.layout.TestModifierUpdaterKt.TestModifierUpdaterLayout.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                    return createFromParcel.INSTANCE;
                }

                public final void invoke(getBirthDateFull getbirthdatefull2, int i3) {
                    TestModifierUpdaterKt.TestModifierUpdaterLayout(r8lambdaunavo3sxub_pc9xroryotnrlvsm, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                }
            };
        }
    }
}
