package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.CompositingStrategy;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.lifecycle.BlockRunner$maybeRun$1;
import androidx.room.RoomDatabase;
import bo.app.ah$$ExternalSyntheticLambda0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import io.sentry.SentryUUID;
import java.util.ArrayList;
import java.util.List;
import o.AndroidAutofillManager;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidPath_androidKtWhenMappings;
import o.AutofillTree;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.UpdatableAnimationState;
import o.accessgetReusableRectp;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCoarsefpxItnM;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getLength;
import o.getNewPassword;
import o.getNoneJ9_QTjY;
import o.getNonefpxItnM;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.mainAxisk4lQ0M;
import o.onShowTranslationui;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.removeNodeAtDepth;
import o.resolvePointerPrecision;
import o.setFocusable;
import o.setRootAutofillId;
import o.width;

/* JADX INFO: loaded from: classes.dex */
public abstract class SnackbarHostKt {
    public static final void read(SnackbarHostState snackbarHostState, Modifier modifier, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1077081618);
        if ((i & 6) == 0) {
            i3 = (getpostalcode.read(snackbarHostState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= getpostalcode.read(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (getpostalcode.write(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (i5 != 0) {
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = getNoneJ9_QTjY.IconCompatParcelizer;
            }
            setRootAutofillId setrootautofillid = (setRootAutofillId) ((onShowTranslationui) snackbarHostState.read).getValue();
            AccessibilityManager accessibilityManager = (AccessibilityManager) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalAccessibilityManager());
            boolean z = getpostalcode.read(setrootautofillid);
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(accessibilityManager);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((z | zIconCompatParcelizer) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new BlockRunner$maybeRun$1(setrootautofillid, accessibilityManager, null, 21);
                getpostalcode.write(objComponentActivity);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, setrootautofillid, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity);
            FadeInFadeOutWithScale((setRootAutofillId) ((onShowTranslationui) snackbarHostState.read).getValue(), modifier, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getpostalcode, i3 & 1008);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        Modifier modifier2 = modifier;
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidAutofillManager(snackbarHostState, modifier2, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, i, i2, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0178  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void FadeInFadeOutWithScale(final setRootAutofillId setrootautofillid, Modifier modifier, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Object obj;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-977568115);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(setrootautofillid) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            final String str = setFocusable.read(getpostalcode, R.string.m3c_snackbar_pane_title);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                obj = objComponentActivity;
                getNonefpxItnM getnonefpxitnm = new getNonefpxItnM();
                getnonefpxitnm.write = new Object();
                getnonefpxitnm.IconCompatParcelizer = new ArrayList();
                getpostalcode.write(getnonefpxitnm);
                obj = getnonefpxitnm;
            }
            obj = objComponentActivity;
            final getNonefpxItnM getnonefpxitnm2 = (getNonefpxItnM) obj;
            Object obj2 = getnonefpxitnm2.write;
            ArrayList arrayList = getnonefpxitnm2.IconCompatParcelizer;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setrootautofillid, obj2}, getCieXyz.write())).booleanValue()) {
                getpostalcode.serializer(1154891761);
                getnonefpxitnm2.write = setrootautofillid;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList2.add((setRootAutofillId) ((getCoarsefpxItnM) arrayList.get(i3)).read);
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (!arrayList3.contains(setrootautofillid)) {
                    arrayList3.add(setrootautofillid);
                }
                arrayList.clear();
                List listFastFilterNotNull = ListUtilsKt.fastFilterNotNull(arrayList3);
                int size2 = listFastFilterNotNull.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    final setRootAutofillId setrootautofillid2 = (setRootAutofillId) listFastFilterNotNull.get(i4);
                    arrayList.add(new getCoarsefpxItnM(setrootautofillid2, ExtrasKt.write(-1952400805, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1
                        /* JADX WARN: Code duplicated, block: B:55:0x020f  */
                        @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj3;
                            getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj4;
                            int iIntValue = ((Number) obj5).intValue();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= ((getPostalCode) getbirthdatefull2).IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 4 : 2;
                            }
                            getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                            if (getpostalcode2.write(iIntValue & 1, (iIntValue & 19) != 18)) {
                                setRootAutofillId setrootautofillid3 = setrootautofillid;
                                setRootAutofillId setrootautofillid4 = setrootautofillid2;
                                boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setrootautofillid4, setrootautofillid3}, getCieXyz.write())).booleanValue();
                                width widthVarSerializer = resolvePointerPrecision.serializer(AutofillTree.FastEffects, getpostalcode2);
                                boolean z = getpostalcode2.read(setrootautofillid4);
                                getNonefpxItnM getnonefpxitnm3 = getnonefpxitnm2;
                                boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(getnonefpxitnm3);
                                Object objComponentActivity2 = getpostalcode2.ComponentActivity();
                                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                                if ((z | zIconCompatParcelizer) || objComponentActivity2 == androidContentCaptureManager) {
                                    objComponentActivity2 = new ah$$ExternalSyntheticLambda0(setrootautofillid4, 14, getnonefpxitnm3);
                                    getpostalcode2.write(objComponentActivity2);
                                }
                                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2;
                                Object objComponentActivity3 = getpostalcode2.ComponentActivity();
                                if (objComponentActivity3 == androidContentCaptureManager) {
                                    objComponentActivity3 = mainAxisk4lQ0M.write(!zBooleanValue ? 1.0f : 0.0f);
                                    getpostalcode2.write(objComponentActivity3);
                                }
                                Animatable animatable = (Animatable) objComponentActivity3;
                                Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                                boolean zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(animatable);
                                boolean zWrite = getpostalcode2.write(zBooleanValue);
                                boolean zIconCompatParcelizer3 = getpostalcode2.IconCompatParcelizer(widthVarSerializer);
                                boolean z2 = getpostalcode2.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                                Object objComponentActivity4 = getpostalcode2.ComponentActivity();
                                if ((zIconCompatParcelizer2 | zWrite | zIconCompatParcelizer3 | z2) || objComponentActivity4 == androidContentCaptureManager) {
                                    RoomDatabase.AnonymousClass1.C00051 c00051 = new RoomDatabase.AnonymousClass1.C00051(animatable, zBooleanValue, widthVarSerializer, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, 2);
                                    getpostalcode2.write(c00051);
                                    objComponentActivity4 = c00051;
                                }
                                getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2, boolValueOf, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity4);
                                UpdatableAnimationState updatableAnimationState = animatable.IconCompatParcelizer;
                                width widthVarSerializer2 = resolvePointerPrecision.serializer(AutofillTree.FastSpatial, getpostalcode2);
                                Object objComponentActivity5 = getpostalcode2.ComponentActivity();
                                if (objComponentActivity5 == androidContentCaptureManager) {
                                    objComponentActivity5 = mainAxisk4lQ0M.write(zBooleanValue ? 0.8f : 1.0f);
                                    getpostalcode2.write(objComponentActivity5);
                                }
                                Animatable animatable2 = (Animatable) objComponentActivity5;
                                boolean zIconCompatParcelizer4 = getpostalcode2.IconCompatParcelizer(animatable2);
                                boolean zWrite2 = getpostalcode2.write(zBooleanValue);
                                boolean zIconCompatParcelizer5 = getpostalcode2.IconCompatParcelizer(widthVarSerializer2);
                                Object objComponentActivity6 = getpostalcode2.ComponentActivity();
                                if ((zIconCompatParcelizer4 | zWrite2 | zIconCompatParcelizer5) || objComponentActivity6 == androidContentCaptureManager) {
                                    RoomDatabase.AnonymousClass1 anonymousClass1 = new RoomDatabase.AnonymousClass1(animatable2, zBooleanValue, widthVarSerializer2, null, 1);
                                    getpostalcode2.write(anonymousClass1);
                                    objComponentActivity6 = anonymousClass1;
                                }
                                getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2, Boolean.valueOf(zBooleanValue), (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity6);
                                UpdatableAnimationState updatableAnimationState2 = animatable2.IconCompatParcelizer;
                                Modifier modifierM887graphicsLayerAp8cVGQ = GraphicsLayerModifierKt.m887graphicsLayerAp8cVGQ(Modifier.Companion, (124895 & 1) != 0 ? 1.0f : ((Number) ((onShowTranslationui) updatableAnimationState2.write).getValue()).floatValue(), (124895 & 2) != 0 ? 1.0f : ((Number) ((onShowTranslationui) updatableAnimationState2.write).getValue()).floatValue(), (124895 & 4) == 0 ? ((Number) ((onShowTranslationui) updatableAnimationState.write).getValue()).floatValue() : 1.0f, (124895 & 8) != 0 ? 0.0f : 0.0f, (124895 & 16) != 0 ? 0.0f : 0.0f, (124895 & 32) != 0 ? 0.0f : 0.0f, (124895 & 64) != 0 ? 0.0f : 0.0f, (124895 & Fields.SpotShadowColor) != 0 ? 0.0f : 0.0f, (124895 & Fields.RotationX) == 0 ? 0.0f : 0.0f, (124895 & Fields.RotationY) != 0 ? 8.0f : 0.0f, (124895 & Fields.RotationZ) != 0 ? TransformOrigin.Companion.m1138getCenterSzJe1aQ() : 0L, (124895 & Fields.CameraDistance) != 0 ? RectangleShapeKt.getRectangleShape() : null, (124895 & Fields.TransformOrigin) != 0 ? false : false, (124895 & 8192) != 0 ? null : null, (124895 & Fields.Clip) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : 0L, (124895 & Fields.CompositingStrategy) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : 0L, (124895 & 65536) != 0 ? CompositingStrategy.Companion.m814getAutoNrFUSI() : 0);
                                boolean zWrite3 = getpostalcode2.write(zBooleanValue);
                                boolean z3 = getpostalcode2.read(setrootautofillid4);
                                String str2 = str;
                                boolean z4 = getpostalcode2.read(str2);
                                Object objComponentActivity7 = getpostalcode2.ComponentActivity();
                                if ((zWrite3 | z3 | z4) || objComponentActivity7 == androidContentCaptureManager) {
                                    objComponentActivity7 = new getLength(zBooleanValue, str2, setrootautofillid4, 3);
                                    getpostalcode2.write(objComponentActivity7);
                                }
                                Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierM887graphicsLayerAp8cVGQ, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity7, 1, null);
                                MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
                                int iSerializer = SentryUUID.serializer(getpostalcode2);
                                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierSemantics$default);
                                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
                                if (getpostalcode2.read != null) {
                                    getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                                    if (getpostalcode2.ComponentActivity) {
                                        getpostalcode2.serializer(constructor);
                                    } else {
                                        getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                                    }
                                    r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                                    if (!getpostalcode2.ComponentActivity) {
                                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode2.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                                            c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode2, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                                        }
                                    } else {
                                        c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode2, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                                    }
                                    AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, companion.getSetModifier());
                                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(getpostalcode2, Integer.valueOf(iIntValue & 14));
                                    getpostalcode2.IconCompatParcelizer(true);
                                } else {
                                    SentryUUID.write();
                                    throw null;
                                }
                            } else {
                                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                            }
                            return createFromParcel.INSTANCE;
                        }
                    }, getpostalcode)));
                }
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(1443908949);
                getpostalcode.IconCompatParcelizer(false);
            }
            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
            int iSerializer = SentryUUID.serializer(getpostalcode);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                if (getpostalcode.ComponentActivity) {
                    c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                } else {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                        c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                    }
                }
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, companion.getSetModifier());
                getHandleruiannotations gethandleruiannotationsMediaSessionCompatResultReceiverWrapper = getpostalcode.MediaSessionCompatResultReceiverWrapper();
                if (gethandleruiannotationsMediaSessionCompatResultReceiverWrapper != null) {
                    gethandleruiannotationsMediaSessionCompatResultReceiverWrapper.write |= 1;
                    getnonefpxitnm2.serializer = gethandleruiannotationsMediaSessionCompatResultReceiverWrapper;
                    getpostalcode.serializer(-1888182177);
                    int size3 = arrayList.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        getCoarsefpxItnM getcoarsefpxitnm = (getCoarsefpxItnM) arrayList.get(i5);
                        setRootAutofillId setrootautofillid3 = (setRootAutofillId) getcoarsefpxitnm.read;
                        DragAndDropTargetModifierNode dragAndDropTargetModifierNode = getcoarsefpxitnm.write;
                        getpostalcode.RemoteActionCompatParcelizer(1325010085, setrootautofillid3);
                        dragAndDropTargetModifierNode.invoke(ExtrasKt.write(-1893791890, new AndroidPath_androidKtWhenMappings(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, 3, setrootautofillid3), getpostalcode), getpostalcode, 6);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    getpostalcode.IconCompatParcelizer(false);
                    getpostalcode.IconCompatParcelizer(true);
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("no recompose scope found");
                    return;
                }
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetReusableRectp(i, 0, setrootautofillid, modifier, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry);
        }
    }
}
