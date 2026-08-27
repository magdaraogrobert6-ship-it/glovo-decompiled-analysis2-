package androidx.compose.ui.layout;

import androidx.compose.runtime.GapComposer$CompositionContextImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.ContentType_androidKt;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class SubcomposeLayoutKt {
    private static final boolean ExtraLoggingEnabled = false;
    private static final SubcomposeLayoutKt$ReusedSlotId$1 ReusedSlotId = new Object() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$ReusedSlotId$1
        public String toString() {
            return "ReusedSlotId";
        }
    };
    private static final Object UnspecifiedSlotId = new Object();

    public static final SubcomposeSlotReusePolicy SubcomposeSlotReusePolicy(int i) {
        return new FixedCountSubcomposeSlotReusePolicy(i);
    }

    @UiComposable
    public static final void SubcomposeLayout(final SubcomposeLayoutState subcomposeLayoutState, Modifier modifier, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getBirthDateFull getbirthdatefull, final int i, final int i2) {
        int i3;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-511989831);
        if ((i & 6) == 0) {
            i3 = (getpostalcode.IconCompatParcelizer(subcomposeLayoutState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= getpostalcode.read(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (getpostalcode.write(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            GapComposer$CompositionContextImpl gapComposer$CompositionContextImplRemoteActionCompatParcelizer = SentryUUID.RemoteActionCompatParcelizer(getpostalcode);
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor$ui = LayoutNode.Companion.getConstructor$ui();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor$ui);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            AndroidContentCaptureManagerCompanion.write(getpostalcode, subcomposeLayoutState, subcomposeLayoutState.getSetRoot$ui());
            AndroidContentCaptureManagerCompanion.write(getpostalcode, gapComposer$CompositionContextImplRemoteActionCompatParcelizer, subcomposeLayoutState.getSetCompositionContext$ui());
            AndroidContentCaptureManagerCompanion.write(getpostalcode, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, subcomposeLayoutState.getSetMeasurePolicy$ui());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            AndroidContentCaptureManagerCompanion.write(getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer, companion.getSetResolvedCompositionLocals());
            AndroidContentCaptureManagerCompanion.write(getpostalcode, companion.getApplyOnDeactivatedNodeAssertion());
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, companion.getSetModifier());
            AndroidContentCaptureManagerCompanion.write(getpostalcode, Integer.valueOf(iHashCode), companion.getSetCompositeKeyHash());
            getpostalcode.IconCompatParcelizer(true);
            if (getpostalcode.MediaSessionCompatToken()) {
                getpostalcode.serializer(-1259187287);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-1259245908);
                boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(subcomposeLayoutState);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer || objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$4$1
                        {
                            super(0);
                        }

                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m2347invoke();
                            return createFromParcel.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m2347invoke() {
                            subcomposeLayoutState.forceRecomposeChildren$ui();
                        }
                    };
                    getpostalcode.write(objComponentActivity);
                }
                getPhoneNumberNational.write((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        final Modifier modifier2 = modifier;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt.SubcomposeLayout.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(getBirthDateFull getbirthdatefull2, int i5) {
                    SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState, modifier2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                }

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }

    public static final void SubcomposeLayout(final Modifier modifier, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getBirthDateFull getbirthdatefull, final int i, final int i2) {
        int i3;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1298353104);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (getpostalcode.read(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 32 : 16;
        }
        if (getpostalcode.write(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new SubcomposeLayoutState();
                getpostalcode.write(objComponentActivity);
            }
            SubcomposeLayout((SubcomposeLayoutState) objComponentActivity, modifier, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getpostalcode, (i3 << 3) & 1008, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt.SubcomposeLayout.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(getBirthDateFull getbirthdatefull2, int i5) {
                    SubcomposeLayoutKt.SubcomposeLayout(modifier, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
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
