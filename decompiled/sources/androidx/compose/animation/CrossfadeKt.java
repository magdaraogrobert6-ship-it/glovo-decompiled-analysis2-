package androidx.compose.animation;

import androidx.collection.ObjectList$toString$1;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionState;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.af$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import io.sentry.SentryUUID;
import java.util.List;
import java.util.ListIterator;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.Arrangement;
import o.BlockDropShadowNodeobtainPainter1;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.ScrollExtensionsKtanimateScrollBy2;
import o.ScrollExtensionsKtstopScroll2;
import o.ScrollableKt;
import o.awaitRelease;
import o.createFromParcel;
import o.detectDragGestures;
import o.getBirthDateFull;
import o.getBrush;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.isAppSetIdReadingEnabled;
import o.onContentCardDismissed;
import o.onRemeasuredozmzZPI;
import o.onShowTranslationui;
import o.onViewAttachedToWindow;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.requiredHeightInVpY3zN4default;
import o.requiredSize3ABfNKs;
import o.requiredWidth3ABfNKs;
import o.reset;
import o.setNativeShader;

/* JADX INFO: loaded from: classes.dex */
public abstract class CrossfadeKt {
    /* JADX WARN: Code duplicated, block: B:54:0x011f  */
    /* JADX WARN: Code duplicated, block: B:56:0x012a  */
    /* JADX WARN: Code duplicated, block: B:57:0x012c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0135  */
    public static final void Crossfade(final Transition transition, Modifier modifier, final Arrangement arrangement, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        boolean z;
        boolean z2;
        boolean z3;
        Object objComponentActivity;
        TransitionState transitionState = transition.MediaSessionCompatToken;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1877370462);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(transition) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(arrangement) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? Fields.Clip : 8192;
        }
        int i4 = 0;
        if (getpostalcode.write(i3 & 1, (i3 & 9363) != 9362)) {
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = reset.RemoteActionCompatParcelizer;
                getpostalcode.write(objComponentActivity2);
            }
            r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2;
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            Object obj = objComponentActivity3;
            if (objComponentActivity3 == androidContentCaptureManager) {
                SnapshotStateList snapshotStateList = new SnapshotStateList();
                snapshotStateList.add(transitionState.IconCompatParcelizer());
                getpostalcode.write(snapshotStateList);
                obj = snapshotStateList;
            }
            SnapshotStateList snapshotStateList2 = (SnapshotStateList) obj;
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (objComponentActivity4 == androidContentCaptureManager) {
                long[] jArr = detectDragGestures.write;
                objComponentActivity4 = new onRemeasuredozmzZPI();
                getpostalcode.write(objComponentActivity4);
            }
            onRemeasuredozmzZPI onremeasuredozmzzpi = (onRemeasuredozmzZPI) objComponentActivity4;
            onShowTranslationui onshowtranslationui = (onShowTranslationui) transition.MediaBrowserCompatMediaItem;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{transitionState.IconCompatParcelizer(), onshowtranslationui.getValue()}, getCieXyz.write())).booleanValue()) {
                getpostalcode.serializer(321145192);
                if (snapshotStateList2.size() == 1) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{snapshotStateList2.get(0), onshowtranslationui.getValue()}, getCieXyz.write())).booleanValue()) {
                        getpostalcode.serializer(321469824);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(321279546);
                        if ((i3 & 14) == 4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        objComponentActivity = getpostalcode.ComponentActivity();
                        if (!z3 || objComponentActivity == androidContentCaptureManager) {
                            objComponentActivity = new ScrollExtensionsKtanimateScrollBy2(transition, i4);
                            getpostalcode.write(objComponentActivity);
                        }
                        onContentCardDismissed.write((List) snapshotStateList2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity);
                        onremeasuredozmzzpi.IconCompatParcelizer();
                        getpostalcode.IconCompatParcelizer(false);
                    }
                } else {
                    getpostalcode.serializer(321279546);
                    if ((i3 & 14) == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objComponentActivity = getpostalcode.ComponentActivity();
                    if (!z3) {
                        objComponentActivity = new ScrollExtensionsKtanimateScrollBy2(transition, i4);
                        getpostalcode.write(objComponentActivity);
                    } else {
                        objComponentActivity = new ScrollExtensionsKtanimateScrollBy2(transition, i4);
                        getpostalcode.write(objComponentActivity);
                    }
                    onContentCardDismissed.write((List) snapshotStateList2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity);
                    onremeasuredozmzzpi.IconCompatParcelizer();
                    getpostalcode.IconCompatParcelizer(false);
                }
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(321475776);
                getpostalcode.IconCompatParcelizer(false);
            }
            if (!onremeasuredozmzzpi.serializer(onshowtranslationui.getValue())) {
                getpostalcode.serializer(321536443);
                ListIterator listIterator = snapshotStateList2.listIterator();
                int i5 = 0;
                while (true) {
                    BlockDropShadowNodeobtainPainter1 blockDropShadowNodeobtainPainter1 = (BlockDropShadowNodeobtainPainter1) listIterator;
                    if (!blockDropShadowNodeobtainPainter1.hasNext()) {
                        i5 = -1;
                        break;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(blockDropShadowNodeobtainPainter1.next()), r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(onshowtranslationui.getValue())}, getCieXyz.write())).booleanValue()) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 == -1) {
                    snapshotStateList2.add(onshowtranslationui.getValue());
                } else {
                    snapshotStateList2.set(i5, onshowtranslationui.getValue());
                }
                onremeasuredozmzzpi.IconCompatParcelizer();
                int size = snapshotStateList2.size();
                for (int i6 = 0; i6 < size; i6++) {
                    final Object obj2 = snapshotStateList2.get(i6);
                    onremeasuredozmzzpi.write(obj2, ExtrasKt.write(-934471669, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

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
                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj3, Object obj4) {
                            Object objIconCompatParcelizer;
                            getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj3;
                            int iIntValue = ((Number) obj4).intValue();
                            int i7 = 0;
                            getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                            if (getpostalcode2.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                                CrossfadeKt$Crossfade$5$1$alpha$2 crossfadeKt$Crossfade$5$1$alpha$2 = new CrossfadeKt$Crossfade$5$1$alpha$2(i7, arrangement);
                                Transition transition2 = transition;
                                boolean zSerializer = transition2.serializer();
                                TransitionState transitionState2 = transition2.MediaSessionCompatToken;
                                AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
                                if (!zSerializer) {
                                    getpostalcode2.serializer(1666573488);
                                    boolean z4 = getpostalcode2.read(transition2);
                                    objIconCompatParcelizer = getpostalcode2.ComponentActivity();
                                    if (z4 || objIconCompatParcelizer == androidContentCaptureManager2) {
                                        int iSerializer = isAppSetIdReadingEnabled.serializer();
                                        getBrush getbrush = (getBrush) setNativeShader.read(676141147, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], iSerializer, isAppSetIdReadingEnabled.serializer(), -676141143);
                                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem = getbrush != null ? getbrush.MediaSessionCompatQueueItem() : null;
                                        int iSerializer2 = isAppSetIdReadingEnabled.serializer();
                                        getBrush getbrush2 = (getBrush) setNativeShader.read(1384483406, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{getbrush}, iSerializer2, isAppSetIdReadingEnabled.serializer(), -1384483406);
                                        try {
                                            Object objIconCompatParcelizer2 = transitionState2.IconCompatParcelizer();
                                            setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
                                            getpostalcode2.write(objIconCompatParcelizer2);
                                            objIconCompatParcelizer = objIconCompatParcelizer2;
                                        } catch (Throwable th) {
                                            setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
                                            throw th;
                                        }
                                    }
                                    getpostalcode2.IconCompatParcelizer(false);
                                } else {
                                    getpostalcode2.serializer(1666827533);
                                    getpostalcode2.IconCompatParcelizer(false);
                                    objIconCompatParcelizer = transitionState2.IconCompatParcelizer();
                                }
                                getpostalcode2.serializer(1378811975);
                                Object obj5 = obj2;
                                float f = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{objIconCompatParcelizer, obj5}, getCieXyz.write())).booleanValue() ? 1.0f : 0.0f;
                                getpostalcode2.IconCompatParcelizer(false);
                                boolean z5 = getpostalcode2.read(transition2);
                                Object objComponentActivity5 = getpostalcode2.ComponentActivity();
                                if (z5 || objComponentActivity5 == androidContentCaptureManager2) {
                                    objComponentActivity5 = CompositionKt.serializer(new ScrollableKt(transition2, 0));
                                    getpostalcode2.write(objComponentActivity5);
                                }
                                Object value = ((onViewAttachedToWindow) objComponentActivity5).getValue();
                                getpostalcode2.serializer(1378811975);
                                float f2 = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{value, obj5}, getCieXyz.write())).booleanValue() ? 1.0f : 0.0f;
                                getpostalcode2.IconCompatParcelizer(false);
                                boolean z6 = getpostalcode2.read(transition2);
                                Object objComponentActivity6 = getpostalcode2.ComponentActivity();
                                if (z6 || objComponentActivity6 == androidContentCaptureManager2) {
                                    objComponentActivity6 = CompositionKt.serializer(new ScrollableKt(transition2, 1));
                                    getpostalcode2.write(objComponentActivity6);
                                }
                                requiredSize3ABfNKs requiredsize3abfnksSerializer = requiredHeightInVpY3zN4default.serializer(transition2, Float.valueOf(f), Float.valueOf(f2), (Arrangement) crossfadeKt$Crossfade$5$1$alpha$2.invoke(((onViewAttachedToWindow) objComponentActivity6).getValue(), getpostalcode2, 0), requiredWidth3ABfNKs.read, "FloatAnimation", getpostalcode2, 0);
                                Modifier.Companion companion = Modifier.Companion;
                                boolean z7 = getpostalcode2.read(requiredsize3abfnksSerializer);
                                Object objComponentActivity7 = getpostalcode2.ComponentActivity();
                                if (z7 || objComponentActivity7 == androidContentCaptureManager2) {
                                    objComponentActivity7 = new ObjectList$toString$1(5, requiredsize3abfnksSerializer);
                                    getpostalcode2.write(objComponentActivity7);
                                }
                                Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity7);
                                MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
                                int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
                                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierGraphicsLayer);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
                                if (getpostalcode2.read != null) {
                                    getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                                    if (getpostalcode2.ComponentActivity) {
                                        getpostalcode2.serializer(constructor);
                                    } else {
                                        getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                                    }
                                    af$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                                    AndroidContentCaptureManagerCompanion.RemoteActionCompatParcelizer(getpostalcode2, Integer.valueOf(iHashCode), companion2.getSetCompositeKeyHash());
                                    AndroidContentCaptureManagerCompanion.write(getpostalcode2, companion2.getApplyOnDeactivatedNodeAssertion());
                                    AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, companion2.getSetModifier());
                                    dragAndDropTargetModifierNode.invoke(obj5, getpostalcode2, 0);
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
                    }, getpostalcode));
                }
                z = false;
                getpostalcode.IconCompatParcelizer(false);
            } else {
                z = false;
                getpostalcode.serializer(322279296);
                getpostalcode.IconCompatParcelizer(false);
            }
            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), z);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
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
                af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.RemoteActionCompatParcelizer(getpostalcode, Integer.valueOf(iHashCode), companion.getSetCompositeKeyHash());
                AndroidContentCaptureManagerCompanion.write(getpostalcode, companion.getApplyOnDeactivatedNodeAssertion());
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, companion.getSetModifier());
                getpostalcode.serializer(-1312707512);
                int size2 = snapshotStateList2.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    Object obj3 = snapshotStateList2.get(i7);
                    getpostalcode.RemoteActionCompatParcelizer(1171574969, r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(obj3));
                    r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) onremeasuredozmzzpi.MediaBrowserCompatMediaItem(obj3);
                    if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 == null) {
                        getpostalcode.serializer(1959122128);
                        z2 = false;
                    } else {
                        getpostalcode.serializer(1171576145);
                        z2 = false;
                        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(getpostalcode, 0);
                    }
                    getpostalcode.IconCompatParcelizer(z2);
                    getpostalcode.IconCompatParcelizer(z2);
                }
                getpostalcode.IconCompatParcelizer(false);
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new ScrollExtensionsKtstopScroll2(transition, modifier, arrangement, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, dragAndDropTargetModifierNode, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public static final void serializer(Object obj, Modifier modifier, Arrangement arrangement, String str, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str2;
        int i5;
        boolean z;
        Modifier modifier3;
        String str3;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        Modifier modifier4;
        int i6;
        int i7;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-513216493);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? getpostalcode.read(obj) : getpostalcode.IconCompatParcelizer(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= getpostalcode.read(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if (getpostalcode.IconCompatParcelizer(arrangement)) {
                    i7 = Fields.RotationX;
                } else {
                    i7 = Fields.SpotShadowColor;
                }
                i3 |= i7;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    str2 = str;
                    if (getpostalcode.read(str2)) {
                        i5 = Fields.CameraDistance;
                    } else {
                        i5 = Fields.RotationZ;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                        i6 = Fields.Clip;
                    } else {
                        i6 = 8192;
                    }
                    i3 |= i6;
                }
                if ((i3 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (getpostalcode.write(i3 & 1, z)) {
                    if (i8 != 0) {
                        modifier4 = Modifier.Companion;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i4 != 0) {
                        str3 = "Crossfade";
                    } else {
                        str3 = str2;
                    }
                    Crossfade(requiredHeightInVpY3zN4default.serializer(obj, str3, getpostalcode, (i3 & 14) | ((i3 >> 6) & 112), 0), modifier4, arrangement, null, dragAndDropTargetModifierNode, getpostalcode, i3 & 58352);
                    modifier3 = modifier4;
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    modifier3 = modifier2;
                    str3 = str2;
                }
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new awaitRelease(obj, modifier3, arrangement, str3, dragAndDropTargetModifierNode, i, i2);
                }
            }
            i3 |= 3072;
            str2 = str;
            if ((i & 24576) == 0) {
                if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                    i6 = Fields.Clip;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (getpostalcode.write(i3 & 1, z)) {
                if (i8 != 0) {
                    modifier4 = Modifier.Companion;
                } else {
                    modifier4 = modifier2;
                }
                if (i4 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str2;
                }
                Crossfade(requiredHeightInVpY3zN4default.serializer(obj, str3, getpostalcode, (i3 & 14) | ((i3 >> 6) & 112), 0), modifier4, arrangement, null, dragAndDropTargetModifierNode, getpostalcode, i3 & 58352);
                modifier3 = modifier4;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier3 = modifier2;
                str3 = str2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new awaitRelease(obj, modifier3, arrangement, str3, dragAndDropTargetModifierNode, i, i2);
            }
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) != 0) {
            if (getpostalcode.IconCompatParcelizer(arrangement)) {
                i7 = Fields.RotationX;
            } else {
                i7 = Fields.SpotShadowColor;
            }
            i3 |= i7;
        }
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                str2 = str;
                if (getpostalcode.read(str2)) {
                    i5 = Fields.CameraDistance;
                } else {
                    i5 = Fields.RotationZ;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                    i6 = Fields.Clip;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (getpostalcode.write(i3 & 1, z)) {
                if (i8 != 0) {
                    modifier4 = Modifier.Companion;
                } else {
                    modifier4 = modifier2;
                }
                if (i4 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str2;
                }
                Crossfade(requiredHeightInVpY3zN4default.serializer(obj, str3, getpostalcode, (i3 & 14) | ((i3 >> 6) & 112), 0), modifier4, arrangement, null, dragAndDropTargetModifierNode, getpostalcode, i3 & 58352);
                modifier3 = modifier4;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier3 = modifier2;
                str3 = str2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new awaitRelease(obj, modifier3, arrangement, str3, dragAndDropTargetModifierNode, i, i2);
            }
        }
        i3 |= 3072;
        str2 = str;
        if ((i & 24576) == 0) {
            if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                i6 = Fields.Clip;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i3 & 1, z)) {
            if (i8 != 0) {
                modifier4 = Modifier.Companion;
            } else {
                modifier4 = modifier2;
            }
            if (i4 != 0) {
                str3 = "Crossfade";
            } else {
                str3 = str2;
            }
            Crossfade(requiredHeightInVpY3zN4default.serializer(obj, str3, getpostalcode, (i3 & 14) | ((i3 >> 6) & 112), 0), modifier4, arrangement, null, dragAndDropTargetModifierNode, getpostalcode, i3 & 58352);
            modifier3 = modifier4;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier3 = modifier2;
            str3 = str2;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new awaitRelease(obj, modifier3, arrangement, str3, dragAndDropTargetModifierNode, i, i2);
        }
    }
}
