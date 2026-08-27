package androidx.compose.material3;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionState;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.CheckboxTokens;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.riemann.location.common.utils.Constant;
import kotlinx.coroutines.DelayKt;
import o.AndroidContentCaptureManager;
import o.Arrangement;
import o.AutofillTree;
import o.AwaitFirstLayoutModifier;
import o.FlowLayoutBuildingBlocksWrapInfo;
import o.PersistentOrderedSet;
import o.PopulateViewStructure_androidKtpopulate7;
import o.SessionMutexwithSessionCancellingPrevious2;
import o.TapGestureDetectorKtdetectTapGestures21;
import o.UiComposable;
import o.ZIndexNode;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getFartKroMQ;
import o.getHandleruiannotations;
import o.getHasCamera;
import o.getHasMicrophone;
import o.getJob;
import o.getKeyboardKindJ9_QTjY;
import o.getNewPassword;
import o.getPointerPrecisionfpxItnM;
import o.getPostalCode;
import o.onReceive;
import o.onShowTranslationui;
import o.onViewAttachedToWindow;
import o.paddingqDBjuR0default;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdapbG_fqEcit8CH1waoNmDxLhROlU;
import o.requiredHeightInVpY3zN4default;
import o.requiredSize3ABfNKs;
import o.requiredSizeInqDBjuR0default;
import o.requiredWidth3ABfNKs;
import o.resolvePointerPrecision;

/* JADX INFO: loaded from: classes.dex */
public abstract class CheckboxKt {
    public static final float IconCompatParcelizer = Dp.m3673constructorimpl(2.0f);
    public static final float RemoteActionCompatParcelizer = Dp.m3673constructorimpl(20.0f);
    public static final float write = Dp.m3673constructorimpl(2.0f);

    public static final void TriStateCheckbox(ToggleableState toggleableState, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Stroke stroke, Stroke stroke2, Modifier modifier, SessionMutexwithSessionCancellingPrevious2 sessionMutexwithSessionCancellingPrevious2, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifierSerializer;
        Modifier modifierThen;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-406243761);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(toggleableState.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(stroke) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(stroke2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.write(true) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode.read(sessionMutexwithSessionCancellingPrevious2) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i2 |= getpostalcode.read((Object) null) ? 8388608 : 4194304;
        }
        if (getpostalcode.write(i2 & 1, (4793491 & i2) != 4793490)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0 && !getpostalcode.PlaybackStateCompat()) {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            getpostalcode.RemoteActionCompatParcelizer();
            if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 != null) {
                modifierSerializer = PersistentOrderedSet.serializer(Modifier.Companion, toggleableState, onReceive.serializer(Dp.m3673constructorimpl(CheckboxTokens.RemoteActionCompatParcelizer / 2.0f), 0L, 4), Role.m2807boximpl(Role.Companion.m2816getCheckboxo7Vup1c()), r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            } else {
                modifierSerializer = Modifier.Companion;
            }
            if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 != null) {
                Modifier.Companion companion = Modifier.Companion;
                HorizontalAlignmentLine horizontalAlignmentLine = getFartKroMQ.IconCompatParcelizer;
                modifierThen = companion.then(ZIndexNode.serializer);
            } else {
                modifierThen = Modifier.Companion;
            }
            Modifier modifierWrite = PaddingKt.write(modifier.then(modifierThen).then(modifierSerializer), IconCompatParcelizer);
            int i3 = i2 << 6;
            read(toggleableState, modifierWrite, sessionMutexwithSessionCancellingPrevious2, stroke, stroke2, getpostalcode, ((i2 >> 9) & 7168) | ((i2 >> 15) & 14) | ((i2 << 3) & 112) | (57344 & i3) | (i3 & 458752));
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getKeyboardKindJ9_QTjY(toggleableState, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, stroke, stroke2, modifier, sessionMutexwithSessionCancellingPrevious2, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:107:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:108:0x0201  */
    /* JADX WARN: Code duplicated, block: B:118:0x022e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0265  */
    /* JADX WARN: Code duplicated, block: B:133:0x02c4  */
    public static final void read(ToggleableState toggleableState, Modifier modifier, SessionMutexwithSessionCancellingPrevious2 sessionMutexwithSessionCancellingPrevious2, final Stroke stroke, final Stroke stroke2, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        float f;
        float f2;
        int i3;
        float f3;
        Arrangement flowLayoutBuildingBlocksWrapInfo;
        final requiredSize3ABfNKs requiredsize3abfnksSerializer;
        Object objComponentActivity;
        AndroidContentCaptureManager androidContentCaptureManager;
        final getJob getjob;
        long j;
        final onViewAttachedToWindow onviewattachedtowindowIconCompatParcelizer;
        int i4;
        long j2;
        final onViewAttachedToWindow onviewattachedtowindowIconCompatParcelizer2;
        int i5;
        long j3;
        final onViewAttachedToWindow onviewattachedtowindowIconCompatParcelizer3;
        boolean z;
        boolean z2;
        boolean zIconCompatParcelizer;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean zIconCompatParcelizer2;
        Object objComponentActivity2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-891330208);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.write(true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(toggleableState.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.read(sessionMutexwithSessionCancellingPrevious2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(stroke) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(stroke2) ? Fields.RenderEffect : 65536;
        }
        if (getpostalcode.write(i2 & 1, (74899 & i2) != 74898)) {
            Transition transitionSerializer = requiredHeightInVpY3zN4default.serializer(toggleableState, null, getpostalcode, (i2 >> 3) & 14, 2);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = transitionSerializer.MediaBrowserCompatMediaItem;
            TransitionState transitionState = transitionSerializer.MediaSessionCompatToken;
            Arrangement arrangementSerializer = resolvePointerPrecision.serializer(AutofillTree.DefaultSpatial, getpostalcode);
            ToggleableState toggleableState2 = (ToggleableState) transitionState.IconCompatParcelizer();
            getpostalcode.serializer(-768316570);
            int[] iArr = getHasMicrophone.write;
            int i6 = iArr[toggleableState2.ordinal()];
            float f4 = 1.0f;
            if (i6 == 1) {
                f = 1.0f;
            } else if (i6 != 2) {
                if (i6 != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
                }
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            getpostalcode.IconCompatParcelizer(false);
            onShowTranslationui onshowtranslationui = (onShowTranslationui) populateViewStructure_androidKtpopulate7;
            ToggleableState toggleableState3 = (ToggleableState) onshowtranslationui.getValue();
            getpostalcode.serializer(-768316570);
            int i7 = iArr[toggleableState3.ordinal()];
            if (i7 == 1) {
                f2 = 1.0f;
            } else if (i7 != 2) {
                if (i7 != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
                }
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            getpostalcode.IconCompatParcelizer(false);
            paddingqDBjuR0default paddingqdbjur0defaultIconCompatParcelizer = transitionSerializer.IconCompatParcelizer();
            getpostalcode.serializer(1780794470);
            Object objSerializer = paddingqdbjur0defaultIconCompatParcelizer.serializer();
            ToggleableState toggleableState4 = ToggleableState.Off;
            Arrangement flowLayoutBuildingBlocksWrapInfo2 = (objSerializer != toggleableState4 && paddingqdbjur0defaultIconCompatParcelizer.read() == toggleableState4) ? new FlowLayoutBuildingBlocksWrapInfo(100) : arrangementSerializer;
            getpostalcode.IconCompatParcelizer(false);
            requiredSizeInqDBjuR0default requiredsizeinqdbjur0default = requiredWidth3ABfNKs.read;
            final requiredSize3ABfNKs requiredsize3abfnksSerializer2 = requiredHeightInVpY3zN4default.serializer(transitionSerializer, Float.valueOf(f), Float.valueOf(f2), flowLayoutBuildingBlocksWrapInfo2, requiredsizeinqdbjur0default, "FloatAnimation", getpostalcode, 0);
            ToggleableState toggleableState5 = (ToggleableState) transitionState.IconCompatParcelizer();
            getpostalcode.serializer(1840054703);
            int i8 = iArr[toggleableState5.ordinal()];
            if (i8 == 1 || i8 == 2) {
                i3 = 3;
                f3 = 0.0f;
            } else {
                i3 = 3;
                if (i8 != 3) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
                }
                f3 = 1.0f;
            }
            getpostalcode.IconCompatParcelizer(false);
            ToggleableState toggleableState6 = (ToggleableState) onshowtranslationui.getValue();
            getpostalcode.serializer(1840054703);
            int i9 = iArr[toggleableState6.ordinal()];
            if (i9 == 1 || i9 == 2) {
                f4 = 0.0f;
            } else if (i9 != i3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            }
            getpostalcode.IconCompatParcelizer(false);
            paddingqDBjuR0default paddingqdbjur0defaultIconCompatParcelizer2 = transitionSerializer.IconCompatParcelizer();
            getpostalcode.serializer(630790831);
            if (paddingqdbjur0defaultIconCompatParcelizer2.serializer() == toggleableState4) {
                arrangementSerializer = (FlowLayoutBuildingBlocksWrapInfo) DelayKt.write(-61142219, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), 61142223, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[0]);
            } else {
                if (paddingqdbjur0defaultIconCompatParcelizer2.read() == toggleableState4) {
                    flowLayoutBuildingBlocksWrapInfo = new FlowLayoutBuildingBlocksWrapInfo(100);
                }
                getpostalcode.IconCompatParcelizer(false);
                requiredsize3abfnksSerializer = requiredHeightInVpY3zN4default.serializer(transitionSerializer, Float.valueOf(f3), Float.valueOf(f4), flowLayoutBuildingBlocksWrapInfo, requiredsizeinqdbjur0default, "FloatAnimation", getpostalcode, 0);
                objComponentActivity = getpostalcode.ComponentActivity();
                androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new getJob();
                    getpostalcode.write(objComponentActivity);
                }
                getjob = (getJob) objComponentActivity;
                if (toggleableState == toggleableState4) {
                    j = sessionMutexwithSessionCancellingPrevious2.MediaSessionCompatResultReceiverWrapper;
                } else {
                    j = sessionMutexwithSessionCancellingPrevious2.IconCompatParcelizer;
                }
                onviewattachedtowindowIconCompatParcelizer = TapGestureDetectorKtdetectTapGestures21.IconCompatParcelizer(j, SessionMutexwithSessionCancellingPrevious2.write(toggleableState, getpostalcode), null, null, getpostalcode, 0, 12);
                int[] iArr2 = UiComposable.RemoteActionCompatParcelizer;
                i4 = iArr2[toggleableState.ordinal()];
                if (i4 != 1 || i4 == 2) {
                    j2 = sessionMutexwithSessionCancellingPrevious2.read;
                } else if (i4 == 3) {
                    j2 = sessionMutexwithSessionCancellingPrevious2.PlaybackStateCompatCustomAction;
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
                }
                getpostalcode.serializer(496051715);
                onviewattachedtowindowIconCompatParcelizer2 = TapGestureDetectorKtdetectTapGestures21.IconCompatParcelizer(j2, SessionMutexwithSessionCancellingPrevious2.write(toggleableState, getpostalcode), null, null, getpostalcode, 0, 12);
                getpostalcode.IconCompatParcelizer(false);
                i5 = iArr2[toggleableState.ordinal()];
                if (i5 != 1 || i5 == 2) {
                    j3 = sessionMutexwithSessionCancellingPrevious2.serializer;
                } else if (i5 == 3) {
                    j3 = sessionMutexwithSessionCancellingPrevious2.MediaDescriptionCompat;
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return;
                }
                getpostalcode.serializer(633231558);
                onviewattachedtowindowIconCompatParcelizer3 = TapGestureDetectorKtdetectTapGestures21.IconCompatParcelizer(j3, SessionMutexwithSessionCancellingPrevious2.write(toggleableState, getpostalcode), null, null, getpostalcode, 0, 12);
                getpostalcode.IconCompatParcelizer(false);
                Modifier modifierM78requiredSize3ABfNKs = SizeKt.m78requiredSize3ABfNKs(SizeKt.IconCompatParcelizer(modifier, Alignment.Companion.getCenter(), 2), RemoteActionCompatParcelizer);
                z = getpostalcode.read(onviewattachedtowindowIconCompatParcelizer2);
                z2 = getpostalcode.read(onviewattachedtowindowIconCompatParcelizer3);
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(stroke2);
                z3 = getpostalcode.read(onviewattachedtowindowIconCompatParcelizer);
                z4 = getpostalcode.read(requiredsize3abfnksSerializer2);
                z5 = getpostalcode.read(requiredsize3abfnksSerializer);
                zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(stroke);
                objComponentActivity2 = getpostalcode.ComponentActivity();
                if (!(z | z2 | zIconCompatParcelizer | z3 | z4 | z5 | zIconCompatParcelizer2) || objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.getWindowHeightD9Ej5fM
                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public final Object invoke(Object obj) {
                            androidx.compose.ui.graphics.drawscope.DrawScope drawScope;
                            androidx.compose.ui.graphics.drawscope.DrawScope drawScope2 = (androidx.compose.ui.graphics.drawscope.DrawScope) obj;
                            long jM732unboximpl = ((androidx.compose.ui.graphics.Color) onviewattachedtowindowIconCompatParcelizer2.getValue()).m732unboximpl();
                            long jM732unboximpl2 = ((androidx.compose.ui.graphics.Color) onviewattachedtowindowIconCompatParcelizer3.getValue()).m732unboximpl();
                            float fMo48toPx0680j_4 = drawScope2.mo48toPx0680j_4(androidx.compose.material3.CheckboxKt.write);
                            androidx.compose.ui.graphics.drawscope.Stroke stroke3 = stroke2;
                            float width = stroke3.getWidth() / 2.0f;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope2.mo1304getSizeNHjbRc() >> 32));
                            if (androidx.compose.ui.graphics.Color.m723equalsimpl0(jM732unboximpl, jM732unboximpl2)) {
                                drawScope = drawScope2;
                                androidx.compose.ui.graphics.drawscope.DrawScope.m1300drawRoundRectuAw5IA$default(drawScope2, jM732unboximpl, 0L, androidx.compose.ui.geometry.Size.m537constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L)), androidx.compose.ui.geometry.CornerRadius.m431constructorimpl((((long) Float.floatToRawIntBits(fMo48toPx0680j_4)) << 32) | (((long) Float.floatToRawIntBits(fMo48toPx0680j_4)) & 4294967295L)), androidx.compose.ui.graphics.drawscope.Fill.INSTANCE, 0.0f, null, 0, Constant.ERROR_WSS_SPEED_JUMP, null);
                            } else {
                                drawScope = drawScope2;
                                long jM469constructorimpl = androidx.compose.ui.geometry.Offset.m469constructorimpl((((long) Float.floatToRawIntBits(stroke3.getWidth())) << 32) | (((long) Float.floatToRawIntBits(stroke3.getWidth())) & 4294967295L));
                                float width2 = stroke3.getWidth();
                                float width3 = stroke3.getWidth();
                                long jM537constructorimpl = androidx.compose.ui.geometry.Size.m537constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat - (width2 * 2.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat - (width3 * 2.0f))) & 4294967295L));
                                float fMax = Math.max(0.0f, fMo48toPx0680j_4 - stroke3.getWidth());
                                androidx.compose.ui.graphics.drawscope.DrawScope.m1300drawRoundRectuAw5IA$default(drawScope, jM732unboximpl, jM469constructorimpl, jM537constructorimpl, androidx.compose.ui.geometry.CornerRadius.m431constructorimpl((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L)), androidx.compose.ui.graphics.drawscope.Fill.INSTANCE, 0.0f, null, 0, Constant.ERROR_WSS_INVALID, null);
                                long jM469constructorimpl2 = androidx.compose.ui.geometry.Offset.m469constructorimpl((((long) Float.floatToRawIntBits(width)) << 32) | (((long) Float.floatToRawIntBits(width)) & 4294967295L));
                                float width4 = stroke3.getWidth();
                                float f5 = fMo48toPx0680j_4 - width;
                                androidx.compose.ui.graphics.drawscope.DrawScope.m1300drawRoundRectuAw5IA$default(drawScope, jM732unboximpl2, jM469constructorimpl2, androidx.compose.ui.geometry.Size.m537constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat - stroke3.getWidth())) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat - width4) << 32)), androidx.compose.ui.geometry.CornerRadius.m431constructorimpl((((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L)), stroke3, 0.0f, null, 0, Constant.ERROR_WSS_INVALID, null);
                            }
                            long jM732unboximpl3 = ((androidx.compose.ui.graphics.Color) onviewattachedtowindowIconCompatParcelizer.getValue()).m732unboximpl();
                            float fFloatValue = ((Number) requiredsize3abfnksSerializer2.getValue()).floatValue();
                            float fFloatValue2 = ((Number) requiredsize3abfnksSerializer.getValue()).floatValue();
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() >> 32));
                            float fLerp = androidx.compose.ui.util.MathHelpersKt.lerp(0.4f, 0.5f, fFloatValue2);
                            float fLerp2 = androidx.compose.ui.util.MathHelpersKt.lerp(0.7f, 0.5f, fFloatValue2);
                            float fLerp3 = androidx.compose.ui.util.MathHelpersKt.lerp(0.5f, 0.5f, fFloatValue2);
                            float fLerp4 = androidx.compose.ui.util.MathHelpersKt.lerp(0.3f, 0.5f, fFloatValue2);
                            getJob getjob2 = getjob;
                            getjob2.serializer.rewind();
                            androidx.compose.ui.graphics.Path path = getjob2.serializer;
                            path.moveTo(0.2f * fIntBitsToFloat2, fLerp3 * fIntBitsToFloat2);
                            path.lineTo(fLerp * fIntBitsToFloat2, fLerp2 * fIntBitsToFloat2);
                            path.lineTo(0.8f * fIntBitsToFloat2, fIntBitsToFloat2 * fLerp4);
                            androidx.compose.ui.graphics.PathMeasure pathMeasure = getjob2.RemoteActionCompatParcelizer;
                            pathMeasure.setPath(path, false);
                            androidx.compose.ui.graphics.Path path2 = getjob2.IconCompatParcelizer;
                            path2.rewind();
                            pathMeasure.getSegment(0.0f, pathMeasure.getLength() * fFloatValue, path2, true);
                            androidx.compose.ui.graphics.drawscope.DrawScope.m1294drawPathLG529CI$default(drawScope, getjob2.IconCompatParcelizer, jM732unboximpl3, 0.0f, stroke, null, 0, 52, null);
                            return createFromParcel.INSTANCE;
                        }
                    };
                    getpostalcode.write(objComponentActivity2);
                }
                AwaitFirstLayoutModifier.serializer(modifierM78requiredSize3ABfNKs, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 0);
            }
            flowLayoutBuildingBlocksWrapInfo = arrangementSerializer;
            getpostalcode.IconCompatParcelizer(false);
            requiredsize3abfnksSerializer = requiredHeightInVpY3zN4default.serializer(transitionSerializer, Float.valueOf(f3), Float.valueOf(f4), flowLayoutBuildingBlocksWrapInfo, requiredsizeinqdbjur0default, "FloatAnimation", getpostalcode, 0);
            objComponentActivity = getpostalcode.ComponentActivity();
            androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new getJob();
                getpostalcode.write(objComponentActivity);
            }
            getjob = (getJob) objComponentActivity;
            if (toggleableState == toggleableState4) {
                j = sessionMutexwithSessionCancellingPrevious2.MediaSessionCompatResultReceiverWrapper;
            } else {
                j = sessionMutexwithSessionCancellingPrevious2.IconCompatParcelizer;
            }
            onviewattachedtowindowIconCompatParcelizer = TapGestureDetectorKtdetectTapGestures21.IconCompatParcelizer(j, SessionMutexwithSessionCancellingPrevious2.write(toggleableState, getpostalcode), null, null, getpostalcode, 0, 12);
            int[] iArr3 = UiComposable.RemoteActionCompatParcelizer;
            i4 = iArr3[toggleableState.ordinal()];
            if (i4 != 1) {
                j2 = sessionMutexwithSessionCancellingPrevious2.read;
            } else {
                j2 = sessionMutexwithSessionCancellingPrevious2.read;
            }
            getpostalcode.serializer(496051715);
            onviewattachedtowindowIconCompatParcelizer2 = TapGestureDetectorKtdetectTapGestures21.IconCompatParcelizer(j2, SessionMutexwithSessionCancellingPrevious2.write(toggleableState, getpostalcode), null, null, getpostalcode, 0, 12);
            getpostalcode.IconCompatParcelizer(false);
            i5 = iArr3[toggleableState.ordinal()];
            if (i5 != 1) {
                j3 = sessionMutexwithSessionCancellingPrevious2.serializer;
            } else {
                j3 = sessionMutexwithSessionCancellingPrevious2.serializer;
            }
            getpostalcode.serializer(633231558);
            onviewattachedtowindowIconCompatParcelizer3 = TapGestureDetectorKtdetectTapGestures21.IconCompatParcelizer(j3, SessionMutexwithSessionCancellingPrevious2.write(toggleableState, getpostalcode), null, null, getpostalcode, 0, 12);
            getpostalcode.IconCompatParcelizer(false);
            Modifier modifierM78requiredSize3ABfNKs2 = SizeKt.m78requiredSize3ABfNKs(SizeKt.IconCompatParcelizer(modifier, Alignment.Companion.getCenter(), 2), RemoteActionCompatParcelizer);
            z = getpostalcode.read(onviewattachedtowindowIconCompatParcelizer2);
            z2 = getpostalcode.read(onviewattachedtowindowIconCompatParcelizer3);
            zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(stroke2);
            z3 = getpostalcode.read(onviewattachedtowindowIconCompatParcelizer);
            z4 = getpostalcode.read(requiredsize3abfnksSerializer2);
            z5 = getpostalcode.read(requiredsize3abfnksSerializer);
            zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(stroke);
            objComponentActivity2 = getpostalcode.ComponentActivity();
            if (!(z | z2 | zIconCompatParcelizer | z3 | z4 | z5 | zIconCompatParcelizer2)) {
                objComponentActivity2 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.getWindowHeightD9Ej5fM
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj) {
                        androidx.compose.ui.graphics.drawscope.DrawScope drawScope;
                        androidx.compose.ui.graphics.drawscope.DrawScope drawScope2 = (androidx.compose.ui.graphics.drawscope.DrawScope) obj;
                        long jM732unboximpl = ((androidx.compose.ui.graphics.Color) onviewattachedtowindowIconCompatParcelizer2.getValue()).m732unboximpl();
                        long jM732unboximpl2 = ((androidx.compose.ui.graphics.Color) onviewattachedtowindowIconCompatParcelizer3.getValue()).m732unboximpl();
                        float fMo48toPx0680j_4 = drawScope2.mo48toPx0680j_4(androidx.compose.material3.CheckboxKt.write);
                        androidx.compose.ui.graphics.drawscope.Stroke stroke3 = stroke2;
                        float width = stroke3.getWidth() / 2.0f;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope2.mo1304getSizeNHjbRc() >> 32));
                        if (androidx.compose.ui.graphics.Color.m723equalsimpl0(jM732unboximpl, jM732unboximpl2)) {
                            drawScope = drawScope2;
                            androidx.compose.ui.graphics.drawscope.DrawScope.m1300drawRoundRectuAw5IA$default(drawScope2, jM732unboximpl, 0L, androidx.compose.ui.geometry.Size.m537constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L)), androidx.compose.ui.geometry.CornerRadius.m431constructorimpl((((long) Float.floatToRawIntBits(fMo48toPx0680j_4)) << 32) | (((long) Float.floatToRawIntBits(fMo48toPx0680j_4)) & 4294967295L)), androidx.compose.ui.graphics.drawscope.Fill.INSTANCE, 0.0f, null, 0, Constant.ERROR_WSS_SPEED_JUMP, null);
                        } else {
                            drawScope = drawScope2;
                            long jM469constructorimpl = androidx.compose.ui.geometry.Offset.m469constructorimpl((((long) Float.floatToRawIntBits(stroke3.getWidth())) << 32) | (((long) Float.floatToRawIntBits(stroke3.getWidth())) & 4294967295L));
                            float width2 = stroke3.getWidth();
                            float width3 = stroke3.getWidth();
                            long jM537constructorimpl = androidx.compose.ui.geometry.Size.m537constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat - (width2 * 2.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat - (width3 * 2.0f))) & 4294967295L));
                            float fMax = Math.max(0.0f, fMo48toPx0680j_4 - stroke3.getWidth());
                            androidx.compose.ui.graphics.drawscope.DrawScope.m1300drawRoundRectuAw5IA$default(drawScope, jM732unboximpl, jM469constructorimpl, jM537constructorimpl, androidx.compose.ui.geometry.CornerRadius.m431constructorimpl((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L)), androidx.compose.ui.graphics.drawscope.Fill.INSTANCE, 0.0f, null, 0, Constant.ERROR_WSS_INVALID, null);
                            long jM469constructorimpl2 = androidx.compose.ui.geometry.Offset.m469constructorimpl((((long) Float.floatToRawIntBits(width)) << 32) | (((long) Float.floatToRawIntBits(width)) & 4294967295L));
                            float width4 = stroke3.getWidth();
                            float f5 = fMo48toPx0680j_4 - width;
                            androidx.compose.ui.graphics.drawscope.DrawScope.m1300drawRoundRectuAw5IA$default(drawScope, jM732unboximpl2, jM469constructorimpl2, androidx.compose.ui.geometry.Size.m537constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat - stroke3.getWidth())) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat - width4) << 32)), androidx.compose.ui.geometry.CornerRadius.m431constructorimpl((((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L)), stroke3, 0.0f, null, 0, Constant.ERROR_WSS_INVALID, null);
                        }
                        long jM732unboximpl3 = ((androidx.compose.ui.graphics.Color) onviewattachedtowindowIconCompatParcelizer.getValue()).m732unboximpl();
                        float fFloatValue = ((Number) requiredsize3abfnksSerializer2.getValue()).floatValue();
                        float fFloatValue2 = ((Number) requiredsize3abfnksSerializer.getValue()).floatValue();
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() >> 32));
                        float fLerp = androidx.compose.ui.util.MathHelpersKt.lerp(0.4f, 0.5f, fFloatValue2);
                        float fLerp2 = androidx.compose.ui.util.MathHelpersKt.lerp(0.7f, 0.5f, fFloatValue2);
                        float fLerp3 = androidx.compose.ui.util.MathHelpersKt.lerp(0.5f, 0.5f, fFloatValue2);
                        float fLerp4 = androidx.compose.ui.util.MathHelpersKt.lerp(0.3f, 0.5f, fFloatValue2);
                        getJob getjob2 = getjob;
                        getjob2.serializer.rewind();
                        androidx.compose.ui.graphics.Path path = getjob2.serializer;
                        path.moveTo(0.2f * fIntBitsToFloat2, fLerp3 * fIntBitsToFloat2);
                        path.lineTo(fLerp * fIntBitsToFloat2, fLerp2 * fIntBitsToFloat2);
                        path.lineTo(0.8f * fIntBitsToFloat2, fIntBitsToFloat2 * fLerp4);
                        androidx.compose.ui.graphics.PathMeasure pathMeasure = getjob2.RemoteActionCompatParcelizer;
                        pathMeasure.setPath(path, false);
                        androidx.compose.ui.graphics.Path path2 = getjob2.IconCompatParcelizer;
                        path2.rewind();
                        pathMeasure.getSegment(0.0f, pathMeasure.getLength() * fFloatValue, path2, true);
                        androidx.compose.ui.graphics.drawscope.DrawScope.m1294drawPathLG529CI$default(drawScope, getjob2.IconCompatParcelizer, jM732unboximpl3, 0.0f, stroke, null, 0, 52, null);
                        return createFromParcel.INSTANCE;
                    }
                };
                getpostalcode.write(objComponentActivity2);
            } else {
                objComponentActivity2 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.getWindowHeightD9Ej5fM
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj) {
                        androidx.compose.ui.graphics.drawscope.DrawScope drawScope;
                        androidx.compose.ui.graphics.drawscope.DrawScope drawScope2 = (androidx.compose.ui.graphics.drawscope.DrawScope) obj;
                        long jM732unboximpl = ((androidx.compose.ui.graphics.Color) onviewattachedtowindowIconCompatParcelizer2.getValue()).m732unboximpl();
                        long jM732unboximpl2 = ((androidx.compose.ui.graphics.Color) onviewattachedtowindowIconCompatParcelizer3.getValue()).m732unboximpl();
                        float fMo48toPx0680j_4 = drawScope2.mo48toPx0680j_4(androidx.compose.material3.CheckboxKt.write);
                        androidx.compose.ui.graphics.drawscope.Stroke stroke3 = stroke2;
                        float width = stroke3.getWidth() / 2.0f;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope2.mo1304getSizeNHjbRc() >> 32));
                        if (androidx.compose.ui.graphics.Color.m723equalsimpl0(jM732unboximpl, jM732unboximpl2)) {
                            drawScope = drawScope2;
                            androidx.compose.ui.graphics.drawscope.DrawScope.m1300drawRoundRectuAw5IA$default(drawScope2, jM732unboximpl, 0L, androidx.compose.ui.geometry.Size.m537constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L)), androidx.compose.ui.geometry.CornerRadius.m431constructorimpl((((long) Float.floatToRawIntBits(fMo48toPx0680j_4)) << 32) | (((long) Float.floatToRawIntBits(fMo48toPx0680j_4)) & 4294967295L)), androidx.compose.ui.graphics.drawscope.Fill.INSTANCE, 0.0f, null, 0, Constant.ERROR_WSS_SPEED_JUMP, null);
                        } else {
                            drawScope = drawScope2;
                            long jM469constructorimpl = androidx.compose.ui.geometry.Offset.m469constructorimpl((((long) Float.floatToRawIntBits(stroke3.getWidth())) << 32) | (((long) Float.floatToRawIntBits(stroke3.getWidth())) & 4294967295L));
                            float width2 = stroke3.getWidth();
                            float width3 = stroke3.getWidth();
                            long jM537constructorimpl = androidx.compose.ui.geometry.Size.m537constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat - (width2 * 2.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat - (width3 * 2.0f))) & 4294967295L));
                            float fMax = Math.max(0.0f, fMo48toPx0680j_4 - stroke3.getWidth());
                            androidx.compose.ui.graphics.drawscope.DrawScope.m1300drawRoundRectuAw5IA$default(drawScope, jM732unboximpl, jM469constructorimpl, jM537constructorimpl, androidx.compose.ui.geometry.CornerRadius.m431constructorimpl((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L)), androidx.compose.ui.graphics.drawscope.Fill.INSTANCE, 0.0f, null, 0, Constant.ERROR_WSS_INVALID, null);
                            long jM469constructorimpl2 = androidx.compose.ui.geometry.Offset.m469constructorimpl((((long) Float.floatToRawIntBits(width)) << 32) | (((long) Float.floatToRawIntBits(width)) & 4294967295L));
                            float width4 = stroke3.getWidth();
                            float f5 = fMo48toPx0680j_4 - width;
                            androidx.compose.ui.graphics.drawscope.DrawScope.m1300drawRoundRectuAw5IA$default(drawScope, jM732unboximpl2, jM469constructorimpl2, androidx.compose.ui.geometry.Size.m537constructorimpl((((long) Float.floatToRawIntBits(fIntBitsToFloat - stroke3.getWidth())) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat - width4) << 32)), androidx.compose.ui.geometry.CornerRadius.m431constructorimpl((((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L)), stroke3, 0.0f, null, 0, Constant.ERROR_WSS_INVALID, null);
                        }
                        long jM732unboximpl3 = ((androidx.compose.ui.graphics.Color) onviewattachedtowindowIconCompatParcelizer.getValue()).m732unboximpl();
                        float fFloatValue = ((Number) requiredsize3abfnksSerializer2.getValue()).floatValue();
                        float fFloatValue2 = ((Number) requiredsize3abfnksSerializer.getValue()).floatValue();
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() >> 32));
                        float fLerp = androidx.compose.ui.util.MathHelpersKt.lerp(0.4f, 0.5f, fFloatValue2);
                        float fLerp2 = androidx.compose.ui.util.MathHelpersKt.lerp(0.7f, 0.5f, fFloatValue2);
                        float fLerp3 = androidx.compose.ui.util.MathHelpersKt.lerp(0.5f, 0.5f, fFloatValue2);
                        float fLerp4 = androidx.compose.ui.util.MathHelpersKt.lerp(0.3f, 0.5f, fFloatValue2);
                        getJob getjob2 = getjob;
                        getjob2.serializer.rewind();
                        androidx.compose.ui.graphics.Path path = getjob2.serializer;
                        path.moveTo(0.2f * fIntBitsToFloat2, fLerp3 * fIntBitsToFloat2);
                        path.lineTo(fLerp * fIntBitsToFloat2, fLerp2 * fIntBitsToFloat2);
                        path.lineTo(0.8f * fIntBitsToFloat2, fIntBitsToFloat2 * fLerp4);
                        androidx.compose.ui.graphics.PathMeasure pathMeasure = getjob2.RemoteActionCompatParcelizer;
                        pathMeasure.setPath(path, false);
                        androidx.compose.ui.graphics.Path path2 = getjob2.IconCompatParcelizer;
                        path2.rewind();
                        pathMeasure.getSegment(0.0f, pathMeasure.getLength() * fFloatValue, path2, true);
                        androidx.compose.ui.graphics.drawscope.DrawScope.m1294drawPathLG529CI$default(drawScope, getjob2.IconCompatParcelizer, jM732unboximpl3, 0.0f, stroke, null, 0, 52, null);
                        return createFromParcel.INSTANCE;
                    }
                };
                getpostalcode.write(objComponentActivity2);
            }
            AwaitFirstLayoutModifier.serializer(modifierM78requiredSize3ABfNKs2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getPointerPrecisionfpxItnM(toggleableState, modifier, sessionMutexwithSessionCancellingPrevious2, stroke, stroke2, i, 0);
        }
    }

    public static final void IconCompatParcelizer(ToggleableState toggleableState, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, SessionMutexwithSessionCancellingPrevious2 sessionMutexwithSessionCancellingPrevious2, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1608358065);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(toggleableState.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= getpostalcode.write(true) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i3 |= getpostalcode.read(sessionMutexwithSessionCancellingPrevious2) ? Fields.Clip : 8192;
        }
        int i4 = i3 | 196608;
        if (getpostalcode.write(i4 & 1, (74899 & i4) != 74898)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0 && !getpostalcode.PlaybackStateCompat()) {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier2 = modifier;
            } else {
                modifier2 = Modifier.Companion;
            }
            getpostalcode.RemoteActionCompatParcelizer();
            float fFloor = (float) Math.floor(((Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity())).mo48toPx0680j_4(CheckboxDefaults.write));
            Stroke stroke = new Stroke(fFloor, 0.0f, StrokeCap.Companion.m1101getSquareKaPHkGw(), 0, null, 26, null);
            Stroke stroke2 = new Stroke(fFloor, 0.0f, 0, 0, null, 30, null);
            int i5 = i4 << 6;
            TriStateCheckbox(toggleableState, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, stroke, stroke2, modifier2, sessionMutexwithSessionCancellingPrevious2, getpostalcode, (29360128 & i5) | (i4 & 126) | (57344 & i5) | (458752 & i5) | (i5 & 3670016));
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getHasCamera(toggleableState, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, sessionMutexwithSessionCancellingPrevious2, i, 0);
        }
    }
}
