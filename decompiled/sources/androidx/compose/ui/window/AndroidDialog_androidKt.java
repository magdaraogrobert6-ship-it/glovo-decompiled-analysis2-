package androidx.compose.ui.window;

import android.os.IBinder;
import android.view.View;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.GapComposer$CompositionContextImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import io.sentry.SentryUUID;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.ContentType_androidKt;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.PopulateViewStructure_androidKtpopulate7;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getEventType;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPersonMiddleInitial;
import o.getPersonNamePrefix;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.onViewAttachedToWindow;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidDialog_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 Dialog$lambda$0(onViewAttachedToWindow onviewattachedtowindow) {
        return (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) onviewattachedtowindow.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DialogLayout(final Modifier modifier, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getBirthDateFull getbirthdatefull, final int i, final int i2) {
        int i3;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1090521195);
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
                objComponentActivity = new MeasurePolicy() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final MeasureResult mo6measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                        final ArrayList arrayList = new ArrayList(list.size());
                        int size = list.size();
                        int iM3627getMinHeightimpl = 0;
                        int iM3628getMinWidthimpl = 0;
                        for (int i5 = 0; i5 < size; i5++) {
                            Placeable placeableMo2209measureBRTryo0 = list.get(i5).mo2209measureBRTryo0(j);
                            iM3628getMinWidthimpl = Math.max(iM3628getMinWidthimpl, placeableMo2209measureBRTryo0.getWidth());
                            iM3627getMinHeightimpl = Math.max(iM3627getMinHeightimpl, placeableMo2209measureBRTryo0.getHeight());
                            arrayList.add(placeableMo2209measureBRTryo0);
                        }
                        if (list.isEmpty()) {
                            iM3628getMinWidthimpl = Constraints.m3628getMinWidthimpl(j);
                            iM3627getMinHeightimpl = Constraints.m3627getMinHeightimpl(j);
                        }
                        return MeasureScope.layout$default(measureScope, iM3628getMinWidthimpl, iM3627getMinHeightimpl, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            public final void invoke(Placeable.PlacementScope placementScope) {
                                List<Placeable> list2 = arrayList;
                                int size2 = list2.size();
                                for (int i6 = 0; i6 < size2; i6++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list2.get(i6), 0, 0, 0.0f, 4, null);
                                }
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
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
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
            af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(getpostalcode, Integer.valueOf((((((((i3 << 3) & 112) | (((i3 >> 3) & 14) | 384)) << 6) & 896) | 6) >> 6) & 14));
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt.DialogLayout.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(getBirthDateFull getbirthdatefull2, int i5) {
                    AndroidDialog_androidKt.DialogLayout(modifier, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                }

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:49:0x0114  */
    /* JADX WARN: Code duplicated, block: B:52:0x012a  */
    /* JADX WARN: Code duplicated, block: B:53:0x012c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0133  */
    /* JADX WARN: Code duplicated, block: B:57:0x0135  */
    /* JADX WARN: Code duplicated, block: B:61:0x0149  */
    /* JADX WARN: Code duplicated, block: B:63:0x015a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0163  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public static final void Dialog(final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, DialogProperties dialogProperties, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getBirthDateFull getbirthdatefull, final int i, final int i2) {
        int i3;
        final DialogProperties dialogProperties2;
        int i4;
        boolean z;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        final DialogProperties dialogProperties3;
        View view;
        Density density;
        final LayoutDirection layoutDirection;
        GapComposer$CompositionContextImpl gapComposer$CompositionContextImplRemoteActionCompatParcelizer;
        final PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Serializer;
        Object objComponentActivity;
        AndroidContentCaptureManager androidContentCaptureManager;
        UUID uuid;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Object obj;
        final DialogWrapper dialogWrapper;
        boolean zIconCompatParcelizer;
        Object objComponentActivity2;
        boolean zIconCompatParcelizer2;
        boolean z7;
        boolean z8;
        boolean z9;
        Object objComponentActivity3;
        int i5;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(826668973);
        if ((i & 6) == 0) {
            i3 = (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                dialogProperties2 = dialogProperties;
                i3 |= getpostalcode.read(dialogProperties2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                    i5 = Fields.RotationX;
                } else {
                    i5 = Fields.SpotShadowColor;
                }
                i3 |= i5;
            }
            i4 = i3;
            if ((i4 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (getpostalcode.write(i4 & 1, z)) {
                if (i6 != 0) {
                    dialogProperties3 = new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null);
                } else {
                    dialogProperties3 = dialogProperties2;
                }
                view = (View) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalView());
                density = (Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
                layoutDirection = (LayoutDirection) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalLayoutDirection());
                gapComposer$CompositionContextImplRemoteActionCompatParcelizer = SentryUUID.RemoteActionCompatParcelizer(getpostalcode);
                populateViewStructure_androidKtpopulate7Serializer = CompositionKt.serializer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getpostalcode);
                Object[] objArr = new Object[0];
                objComponentActivity = getpostalcode.ComponentActivity();
                androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialogId$1$1
                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final UUID invoke() {
                            return UUID.randomUUID();
                        }
                    };
                    getpostalcode.write(objComponentActivity);
                }
                uuid = (UUID) getEventType.IconCompatParcelizer(objArr, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 48);
                int windowType = dialogProperties3.getWindowType();
                IBinder windowToken = dialogProperties3.getWindowToken();
                z2 = getpostalcode.read(view);
                z3 = getpostalcode.read(density);
                z4 = getpostalcode.read(windowType);
                z5 = getpostalcode.read(windowToken);
                Object objComponentActivity4 = getpostalcode.ComponentActivity();
                if ((!(z2 | z3 | z4) && !z5) || objComponentActivity4 == androidContentCaptureManager) {
                    DialogWrapper dialogWrapper2 = new DialogWrapper(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, dialogProperties3, view, layoutDirection, density, uuid);
                    z6 = true;
                    dialogWrapper2.setContent(gapComposer$CompositionContextImplRemoteActionCompatParcelizer, new DragAndDropTargetModifierNode(new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1
                        {
                            super(2);
                        }

                        public final void invoke(getBirthDateFull getbirthdatefull2, int i7) {
                            getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                            if (getpostalcode2.write(i7 & 1, (i7 & 3) != 2)) {
                                Modifier.Companion companion = Modifier.Companion;
                                Object objComponentActivity5 = getpostalcode2.ComponentActivity();
                                if (objComponentActivity5 == getCreditCardExpirationMonth.write) {
                                    objComponentActivity5 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1$1$1
                                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                            invoke((SemanticsPropertyReceiver) obj2);
                                            return createFromParcel.INSTANCE;
                                        }

                                        public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            SemanticsPropertiesKt.dialog(semanticsPropertyReceiver);
                                        }
                                    };
                                    getpostalcode2.write(objComponentActivity5);
                                }
                                AndroidDialog_androidKt.DialogLayout(SemanticsModifierKt.semantics$default(companion, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity5, 1, null), AndroidDialog_androidKt.Dialog$lambda$0(populateViewStructure_androidKtpopulate7Serializer), getpostalcode2, 0, 0);
                                return;
                            }
                            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        }

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public /* synthetic */ Object invoke(Object obj2, Object obj3) {
                            invoke((getBirthDateFull) obj2, ((Number) obj3).intValue());
                            return createFromParcel.INSTANCE;
                        }
                    }, true, -1338939603));
                    getpostalcode.write(dialogWrapper2);
                    obj = dialogWrapper2;
                } else {
                    z6 = true;
                    obj = objComponentActivity4;
                }
                dialogWrapper = (DialogWrapper) obj;
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(dialogWrapper);
                objComponentActivity2 = getpostalcode.ComponentActivity();
                if (!zIconCompatParcelizer || objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$1
                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public final getPersonMiddleInitial invoke(getPersonNamePrefix getpersonnameprefix) {
                            dialogWrapper.show();
                            final DialogWrapper dialogWrapper3 = dialogWrapper;
                            return new getPersonMiddleInitial() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$1$invoke$$inlined$onDispose$1
                                @Override // o.getPersonMiddleInitial
                                public void dispose() {
                                    dialogWrapper3.dismiss();
                                    dialogWrapper3.disposeComposition();
                                }
                            };
                        }

                        {
                            super(1);
                        }
                    };
                    getpostalcode.write(objComponentActivity2);
                }
                getPhoneNumberNational.serializer(dialogWrapper, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode);
                zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(dialogWrapper);
                if ((i4 & 14) == 4) {
                    z7 = z6;
                } else {
                    z7 = false;
                }
                if ((i4 & 112) == 32) {
                    z8 = z6;
                } else {
                    z8 = false;
                }
                z9 = getpostalcode.read(layoutDirection.ordinal());
                objComponentActivity3 = getpostalcode.ComponentActivity();
                if (!(zIconCompatParcelizer2 | z7 | z8 | z9) || objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m3937invoke() {
                            dialogWrapper.updateParameters(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, dialogProperties3, layoutDirection);
                        }

                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m3937invoke();
                            return createFromParcel.INSTANCE;
                        }
                    };
                    getpostalcode.write(objComponentActivity3);
                }
                getPhoneNumberNational.write((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, getpostalcode);
                dialogProperties2 = dialogProperties3;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt.Dialog.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void invoke(getBirthDateFull getbirthdatefull2, int i7) {
                        AndroidDialog_androidKt.Dialog(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, dialogProperties2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                    }

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke((getBirthDateFull) obj2, ((Number) obj3).intValue());
                        return createFromParcel.INSTANCE;
                    }
                };
            }
        }
        i3 |= 48;
        dialogProperties2 = dialogProperties;
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                i5 = Fields.RotationX;
            } else {
                i5 = Fields.SpotShadowColor;
            }
            i3 |= i5;
        }
        i4 = i3;
        if ((i4 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i4 & 1, z)) {
            if (i6 != 0) {
                dialogProperties3 = new DialogProperties(false, false, false, 7, (DefaultConstructorMarker) null);
            } else {
                dialogProperties3 = dialogProperties2;
            }
            view = (View) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalView());
            density = (Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
            layoutDirection = (LayoutDirection) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalLayoutDirection());
            gapComposer$CompositionContextImplRemoteActionCompatParcelizer = SentryUUID.RemoteActionCompatParcelizer(getpostalcode);
            populateViewStructure_androidKtpopulate7Serializer = CompositionKt.serializer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getpostalcode);
            Object[] objArr2 = new Object[0];
            objComponentActivity = getpostalcode.ComponentActivity();
            androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialogId$1$1
                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final UUID invoke() {
                        return UUID.randomUUID();
                    }
                };
                getpostalcode.write(objComponentActivity);
            }
            uuid = (UUID) getEventType.IconCompatParcelizer(objArr2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 48);
            int windowType2 = dialogProperties3.getWindowType();
            IBinder windowToken2 = dialogProperties3.getWindowToken();
            z2 = getpostalcode.read(view);
            z3 = getpostalcode.read(density);
            z4 = getpostalcode.read(windowType2);
            z5 = getpostalcode.read(windowToken2);
            Object objComponentActivity5 = getpostalcode.ComponentActivity();
            if (!(z2 | z3 | z4 | z5)) {
                DialogWrapper dialogWrapper3 = new DialogWrapper(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, dialogProperties3, view, layoutDirection, density, uuid);
                z6 = true;
                dialogWrapper3.setContent(gapComposer$CompositionContextImplRemoteActionCompatParcelizer, new DragAndDropTargetModifierNode(new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1
                    {
                        super(2);
                    }

                    public final void invoke(getBirthDateFull getbirthdatefull2, int i7) {
                        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                        if (getpostalcode2.write(i7 & 1, (i7 & 3) != 2)) {
                            Modifier.Companion companion = Modifier.Companion;
                            Object objComponentActivity6 = getpostalcode2.ComponentActivity();
                            if (objComponentActivity6 == getCreditCardExpirationMonth.write) {
                                objComponentActivity6 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1$1$1
                                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        invoke((SemanticsPropertyReceiver) obj2);
                                        return createFromParcel.INSTANCE;
                                    }

                                    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        SemanticsPropertiesKt.dialog(semanticsPropertyReceiver);
                                    }
                                };
                                getpostalcode2.write(objComponentActivity6);
                            }
                            AndroidDialog_androidKt.DialogLayout(SemanticsModifierKt.semantics$default(companion, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity6, 1, null), AndroidDialog_androidKt.Dialog$lambda$0(populateViewStructure_androidKtpopulate7Serializer), getpostalcode2, 0, 0);
                            return;
                        }
                        getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke((getBirthDateFull) obj2, ((Number) obj3).intValue());
                        return createFromParcel.INSTANCE;
                    }
                }, true, -1338939603));
                getpostalcode.write(dialogWrapper3);
                obj = dialogWrapper3;
            } else {
                DialogWrapper dialogWrapper4 = new DialogWrapper(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, dialogProperties3, view, layoutDirection, density, uuid);
                z6 = true;
                dialogWrapper4.setContent(gapComposer$CompositionContextImplRemoteActionCompatParcelizer, new DragAndDropTargetModifierNode(new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1
                    {
                        super(2);
                    }

                    public final void invoke(getBirthDateFull getbirthdatefull2, int i7) {
                        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                        if (getpostalcode2.write(i7 & 1, (i7 & 3) != 2)) {
                            Modifier.Companion companion = Modifier.Companion;
                            Object objComponentActivity6 = getpostalcode2.ComponentActivity();
                            if (objComponentActivity6 == getCreditCardExpirationMonth.write) {
                                objComponentActivity6 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1$1$1
                                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        invoke((SemanticsPropertyReceiver) obj2);
                                        return createFromParcel.INSTANCE;
                                    }

                                    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                        SemanticsPropertiesKt.dialog(semanticsPropertyReceiver);
                                    }
                                };
                                getpostalcode2.write(objComponentActivity6);
                            }
                            AndroidDialog_androidKt.DialogLayout(SemanticsModifierKt.semantics$default(companion, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity6, 1, null), AndroidDialog_androidKt.Dialog$lambda$0(populateViewStructure_androidKtpopulate7Serializer), getpostalcode2, 0, 0);
                            return;
                        }
                        getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public /* synthetic */ Object invoke(Object obj2, Object obj3) {
                        invoke((getBirthDateFull) obj2, ((Number) obj3).intValue());
                        return createFromParcel.INSTANCE;
                    }
                }, true, -1338939603));
                getpostalcode.write(dialogWrapper4);
                obj = dialogWrapper4;
            }
            dialogWrapper = (DialogWrapper) obj;
            zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(dialogWrapper);
            objComponentActivity2 = getpostalcode.ComponentActivity();
            if (!zIconCompatParcelizer) {
                objComponentActivity2 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$1
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final getPersonMiddleInitial invoke(getPersonNamePrefix getpersonnameprefix) {
                        dialogWrapper.show();
                        final DialogWrapper dialogWrapper5 = dialogWrapper;
                        return new getPersonMiddleInitial() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$1$invoke$$inlined$onDispose$1
                            @Override // o.getPersonMiddleInitial
                            public void dispose() {
                                dialogWrapper5.dismiss();
                                dialogWrapper5.disposeComposition();
                            }
                        };
                    }

                    {
                        super(1);
                    }
                };
                getpostalcode.write(objComponentActivity2);
            } else {
                objComponentActivity2 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$1
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final getPersonMiddleInitial invoke(getPersonNamePrefix getpersonnameprefix) {
                        dialogWrapper.show();
                        final DialogWrapper dialogWrapper5 = dialogWrapper;
                        return new getPersonMiddleInitial() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$1$invoke$$inlined$onDispose$1
                            @Override // o.getPersonMiddleInitial
                            public void dispose() {
                                dialogWrapper5.dismiss();
                                dialogWrapper5.disposeComposition();
                            }
                        };
                    }

                    {
                        super(1);
                    }
                };
                getpostalcode.write(objComponentActivity2);
            }
            getPhoneNumberNational.serializer(dialogWrapper, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode);
            zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(dialogWrapper);
            if ((i4 & 14) == 4) {
                z7 = z6;
            } else {
                z7 = false;
            }
            if ((i4 & 112) == 32) {
                z8 = z6;
            } else {
                z8 = false;
            }
            z9 = getpostalcode.read(layoutDirection.ordinal());
            objComponentActivity3 = getpostalcode.ComponentActivity();
            if (!(zIconCompatParcelizer2 | z7 | z8 | z9)) {
                objComponentActivity3 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m3937invoke() {
                        dialogWrapper.updateParameters(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, dialogProperties3, layoutDirection);
                    }

                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m3937invoke();
                        return createFromParcel.INSTANCE;
                    }
                };
                getpostalcode.write(objComponentActivity3);
            } else {
                objComponentActivity3 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m3937invoke() {
                        dialogWrapper.updateParameters(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, dialogProperties3, layoutDirection);
                    }

                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m3937invoke();
                        return createFromParcel.INSTANCE;
                    }
                };
                getpostalcode.write(objComponentActivity3);
            }
            getPhoneNumberNational.write((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, getpostalcode);
            dialogProperties2 = dialogProperties3;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt.Dialog.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(getBirthDateFull getbirthdatefull2, int i7) {
                    AndroidDialog_androidKt.Dialog(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, dialogProperties2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                }

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((getBirthDateFull) obj2, ((Number) obj3).intValue());
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }
}
