package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionState;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$1$1;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImagePainter$launchJob$1;
import io.sentry.SentryUUID;
import java.util.Map;
import kotlinx.coroutines.DelayKt;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.BoxKt;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.IndirectPointerInputDragCycleDetectorKt;
import o.MouseWheelScrollingLogicKt;
import o.MouseWheelScrollingLogicdispatchMouseWheelScroll3;
import o.NonTouchScrollingLogic;
import o.NonTouchScrollingLogicKtbusyReceive2job1;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ScrollExtensionsKt;
import o.ScrollingLogicdoFlingAnimation2reverseScope1;
import o.ShortNewsContentCardView;
import o.TapGestureDetectorKt;
import o.WindowInsetsAnimationCancelledException;
import o.accesssemanticsScrollByd4ec7I;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.onKeyEventZmokQxo;
import o.onShowTranslationui;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.requiredHeightInVpY3zN4default;
import o.requiredWidthInVpY3zN4default;
import o.reset;
import o.toFloatk4lQ0M;
import o.userScrollfoundation;
import o.width;

/* JADX INFO: loaded from: classes.dex */
public abstract class AnimatedVisibilityKt {
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:68:0x0110  */
    /* JADX WARN: Code duplicated, block: B:70:0x0136  */
    /* JADX WARN: Code duplicated, block: B:73:0x0144  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void IconCompatParcelizer(boolean z, Modifier modifier, ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1, TapGestureDetectorKt tapGestureDetectorKt, String str, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope2;
        int i5;
        int i6;
        TapGestureDetectorKt tapGestureDetectorKt2;
        int i7;
        int i8;
        boolean z2;
        String str2;
        Modifier modifier3;
        ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope3;
        TapGestureDetectorKt tapGestureDetectorKt3;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        Modifier modifier4;
        ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1Serializer;
        Object objComponentActivity;
        int i9;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(234057107);
        if ((i & 48) == 0) {
            i3 = (getpostalcode.write(z) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= getpostalcode.read(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    scrollingLogicdoFlingAnimation2reverseScope2 = scrollingLogicdoFlingAnimation2reverseScope1;
                    if (getpostalcode.read(scrollingLogicdoFlingAnimation2reverseScope2)) {
                        i5 = Fields.CameraDistance;
                    } else {
                        i5 = Fields.RotationZ;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        tapGestureDetectorKt2 = tapGestureDetectorKt;
                        if (getpostalcode.read(tapGestureDetectorKt2)) {
                            i7 = Fields.Clip;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i3 | 196608;
                    if ((1572864 & i) == 0) {
                        if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                            i9 = 1048576;
                        } else {
                            i9 = Fields.BlendMode;
                        }
                        i8 |= i9;
                    }
                    if ((599185 & i8) != 599184) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (getpostalcode.write(i8 & 1, z2)) {
                        if (i10 != 0) {
                            modifier4 = Modifier.Companion;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i4 != 0) {
                            ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1Serializer2 = onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 3);
                            IntSize.Companion companion = IntSize.Companion;
                            Map map = WindowInsetsAnimationCancelledException.serializer;
                            width widthVarIconCompatParcelizer = DelayKt.IconCompatParcelizer(0.0f, 400.0f, 1, IntSize.m3836boximpl(IntSize.m3839constructorimpl(InlineClassHelperKt.Uint64Low32)));
                            Alignment alignmentWrite = onKeyEventZmokQxo.write(Alignment.Companion.getEnd());
                            final toFloatk4lQ0M tofloatk4lq0m = toFloatk4lQ0M.read;
                            scrollingLogicdoFlingAnimation2reverseScope1Serializer = scrollingLogicdoFlingAnimation2reverseScope1Serializer2.serializer(onKeyEventZmokQxo.IconCompatParcelizer(widthVarIconCompatParcelizer, alignmentWrite, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$2
                                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                public final Object invoke(Object obj) {
                                    long jM3848unboximpl = ((IntSize) obj).m3848unboximpl();
                                    return IntSize.m3836boximpl(IntSize.m3839constructorimpl((((long) ((Number) tofloatk4lq0m.invoke(Integer.valueOf((int) (jM3848unboximpl >> 32)))).intValue()) << 32) | (((long) ((int) (jM3848unboximpl & 4294967295L))) & 4294967295L)));
                                }

                                {
                                    super(1);
                                }
                            }));
                        } else {
                            scrollingLogicdoFlingAnimation2reverseScope1Serializer = scrollingLogicdoFlingAnimation2reverseScope2;
                        }
                        if (i6 != 0) {
                            tapGestureDetectorKt3 = onKeyEventZmokQxo.write(null, 3).read(onKeyEventZmokQxo.RemoteActionCompatParcelizer(null, 15));
                        } else {
                            tapGestureDetectorKt3 = tapGestureDetectorKt2;
                        }
                        int i11 = i8 >> 3;
                        Transition transitionSerializer = requiredHeightInVpY3zN4default.serializer(Boolean.valueOf(z), "AnimatedVisibility", getpostalcode, (i11 & 14) | ((i8 >> 12) & 112), 0);
                        objComponentActivity = getpostalcode.ComponentActivity();
                        if (objComponentActivity == getCreditCardExpirationMonth.write) {
                            objComponentActivity = reset.read;
                            getpostalcode.write(objComponentActivity);
                        }
                        IconCompatParcelizer(transitionSerializer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, modifier4, scrollingLogicdoFlingAnimation2reverseScope1Serializer, tapGestureDetectorKt3, dragAndDropTargetModifierNode, getpostalcode, (i8 & 7168) | (i8 & 896) | 48 | (57344 & i8) | (i11 & 458752));
                        modifier3 = modifier4;
                        scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope1Serializer;
                        str2 = "AnimatedVisibility";
                    } else {
                        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        str2 = str;
                        modifier3 = modifier2;
                        scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope2;
                        tapGestureDetectorKt3 = tapGestureDetectorKt2;
                    }
                    gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                    if (gethandleruiannotationsMediaDescriptionCompat != null) {
                        gethandleruiannotationsMediaDescriptionCompat.serializer = new NonTouchScrollingLogicKtbusyReceive2job1(z, modifier3, scrollingLogicdoFlingAnimation2reverseScope3, tapGestureDetectorKt3, str2, dragAndDropTargetModifierNode, i, i2);
                    }
                }
                i3 |= 24576;
                tapGestureDetectorKt2 = tapGestureDetectorKt;
                i8 = i3 | 196608;
                if ((1572864 & i) == 0) {
                    if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                        i9 = 1048576;
                    } else {
                        i9 = Fields.BlendMode;
                    }
                    i8 |= i9;
                }
                if ((599185 & i8) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (getpostalcode.write(i8 & 1, z2)) {
                    if (i10 != 0) {
                        modifier4 = Modifier.Companion;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i4 != 0) {
                        ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1Serializer3 = onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 3);
                        IntSize.Companion companion2 = IntSize.Companion;
                        Map map2 = WindowInsetsAnimationCancelledException.serializer;
                        width widthVarIconCompatParcelizer2 = DelayKt.IconCompatParcelizer(0.0f, 400.0f, 1, IntSize.m3836boximpl(IntSize.m3839constructorimpl(InlineClassHelperKt.Uint64Low32)));
                        Alignment alignmentWrite2 = onKeyEventZmokQxo.write(Alignment.Companion.getEnd());
                        final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM tofloatk4lq0m2 = toFloatk4lQ0M.read;
                        scrollingLogicdoFlingAnimation2reverseScope1Serializer = scrollingLogicdoFlingAnimation2reverseScope1Serializer3.serializer(onKeyEventZmokQxo.IconCompatParcelizer(widthVarIconCompatParcelizer2, alignmentWrite2, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$2
                            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                            public final Object invoke(Object obj) {
                                long jM3848unboximpl = ((IntSize) obj).m3848unboximpl();
                                return IntSize.m3836boximpl(IntSize.m3839constructorimpl((((long) ((Number) tofloatk4lq0m2.invoke(Integer.valueOf((int) (jM3848unboximpl >> 32)))).intValue()) << 32) | (((long) ((int) (jM3848unboximpl & 4294967295L))) & 4294967295L)));
                            }

                            {
                                super(1);
                            }
                        }));
                    } else {
                        scrollingLogicdoFlingAnimation2reverseScope1Serializer = scrollingLogicdoFlingAnimation2reverseScope2;
                    }
                    if (i6 != 0) {
                        tapGestureDetectorKt3 = onKeyEventZmokQxo.write(null, 3).read(onKeyEventZmokQxo.RemoteActionCompatParcelizer(null, 15));
                    } else {
                        tapGestureDetectorKt3 = tapGestureDetectorKt2;
                    }
                    int i12 = i8 >> 3;
                    Transition transitionSerializer2 = requiredHeightInVpY3zN4default.serializer(Boolean.valueOf(z), "AnimatedVisibility", getpostalcode, (i12 & 14) | ((i8 >> 12) & 112), 0);
                    objComponentActivity = getpostalcode.ComponentActivity();
                    if (objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = reset.read;
                        getpostalcode.write(objComponentActivity);
                    }
                    IconCompatParcelizer(transitionSerializer2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, modifier4, scrollingLogicdoFlingAnimation2reverseScope1Serializer, tapGestureDetectorKt3, dragAndDropTargetModifierNode, getpostalcode, (i8 & 7168) | (i8 & 896) | 48 | (57344 & i8) | (i12 & 458752));
                    modifier3 = modifier4;
                    scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope1Serializer;
                    str2 = "AnimatedVisibility";
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    str2 = str;
                    modifier3 = modifier2;
                    scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope2;
                    tapGestureDetectorKt3 = tapGestureDetectorKt2;
                }
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new NonTouchScrollingLogicKtbusyReceive2job1(z, modifier3, scrollingLogicdoFlingAnimation2reverseScope3, tapGestureDetectorKt3, str2, dragAndDropTargetModifierNode, i, i2);
                }
            }
            i3 |= 3072;
            scrollingLogicdoFlingAnimation2reverseScope2 = scrollingLogicdoFlingAnimation2reverseScope1;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    tapGestureDetectorKt2 = tapGestureDetectorKt;
                    if (getpostalcode.read(tapGestureDetectorKt2)) {
                        i7 = Fields.Clip;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i3 | 196608;
                if ((1572864 & i) == 0) {
                    if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                        i9 = 1048576;
                    } else {
                        i9 = Fields.BlendMode;
                    }
                    i8 |= i9;
                }
                if ((599185 & i8) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (getpostalcode.write(i8 & 1, z2)) {
                    if (i10 != 0) {
                        modifier4 = Modifier.Companion;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i4 != 0) {
                        ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1Serializer4 = onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 3);
                        IntSize.Companion companion3 = IntSize.Companion;
                        Map map3 = WindowInsetsAnimationCancelledException.serializer;
                        width widthVarIconCompatParcelizer3 = DelayKt.IconCompatParcelizer(0.0f, 400.0f, 1, IntSize.m3836boximpl(IntSize.m3839constructorimpl(InlineClassHelperKt.Uint64Low32)));
                        Alignment alignmentWrite3 = onKeyEventZmokQxo.write(Alignment.Companion.getEnd());
                        final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM tofloatk4lq0m3 = toFloatk4lQ0M.read;
                        scrollingLogicdoFlingAnimation2reverseScope1Serializer = scrollingLogicdoFlingAnimation2reverseScope1Serializer4.serializer(onKeyEventZmokQxo.IconCompatParcelizer(widthVarIconCompatParcelizer3, alignmentWrite3, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$2
                            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                            public final Object invoke(Object obj) {
                                long jM3848unboximpl = ((IntSize) obj).m3848unboximpl();
                                return IntSize.m3836boximpl(IntSize.m3839constructorimpl((((long) ((Number) tofloatk4lq0m3.invoke(Integer.valueOf((int) (jM3848unboximpl >> 32)))).intValue()) << 32) | (((long) ((int) (jM3848unboximpl & 4294967295L))) & 4294967295L)));
                            }

                            {
                                super(1);
                            }
                        }));
                    } else {
                        scrollingLogicdoFlingAnimation2reverseScope1Serializer = scrollingLogicdoFlingAnimation2reverseScope2;
                    }
                    if (i6 != 0) {
                        tapGestureDetectorKt3 = onKeyEventZmokQxo.write(null, 3).read(onKeyEventZmokQxo.RemoteActionCompatParcelizer(null, 15));
                    } else {
                        tapGestureDetectorKt3 = tapGestureDetectorKt2;
                    }
                    int i13 = i8 >> 3;
                    Transition transitionSerializer3 = requiredHeightInVpY3zN4default.serializer(Boolean.valueOf(z), "AnimatedVisibility", getpostalcode, (i13 & 14) | ((i8 >> 12) & 112), 0);
                    objComponentActivity = getpostalcode.ComponentActivity();
                    if (objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = reset.read;
                        getpostalcode.write(objComponentActivity);
                    }
                    IconCompatParcelizer(transitionSerializer3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, modifier4, scrollingLogicdoFlingAnimation2reverseScope1Serializer, tapGestureDetectorKt3, dragAndDropTargetModifierNode, getpostalcode, (i8 & 7168) | (i8 & 896) | 48 | (57344 & i8) | (i13 & 458752));
                    modifier3 = modifier4;
                    scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope1Serializer;
                    str2 = "AnimatedVisibility";
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    str2 = str;
                    modifier3 = modifier2;
                    scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope2;
                    tapGestureDetectorKt3 = tapGestureDetectorKt2;
                }
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new NonTouchScrollingLogicKtbusyReceive2job1(z, modifier3, scrollingLogicdoFlingAnimation2reverseScope3, tapGestureDetectorKt3, str2, dragAndDropTargetModifierNode, i, i2);
                }
            }
            i3 |= 24576;
            tapGestureDetectorKt2 = tapGestureDetectorKt;
            i8 = i3 | 196608;
            if ((1572864 & i) == 0) {
                if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                    i9 = 1048576;
                } else {
                    i9 = Fields.BlendMode;
                }
                i8 |= i9;
            }
            if ((599185 & i8) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (getpostalcode.write(i8 & 1, z2)) {
                if (i10 != 0) {
                    modifier4 = Modifier.Companion;
                } else {
                    modifier4 = modifier2;
                }
                if (i4 != 0) {
                    ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1Serializer5 = onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 3);
                    IntSize.Companion companion4 = IntSize.Companion;
                    Map map4 = WindowInsetsAnimationCancelledException.serializer;
                    width widthVarIconCompatParcelizer4 = DelayKt.IconCompatParcelizer(0.0f, 400.0f, 1, IntSize.m3836boximpl(IntSize.m3839constructorimpl(InlineClassHelperKt.Uint64Low32)));
                    Alignment alignmentWrite4 = onKeyEventZmokQxo.write(Alignment.Companion.getEnd());
                    final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM tofloatk4lq0m4 = toFloatk4lQ0M.read;
                    scrollingLogicdoFlingAnimation2reverseScope1Serializer = scrollingLogicdoFlingAnimation2reverseScope1Serializer5.serializer(onKeyEventZmokQxo.IconCompatParcelizer(widthVarIconCompatParcelizer4, alignmentWrite4, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$2
                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public final Object invoke(Object obj) {
                            long jM3848unboximpl = ((IntSize) obj).m3848unboximpl();
                            return IntSize.m3836boximpl(IntSize.m3839constructorimpl((((long) ((Number) tofloatk4lq0m4.invoke(Integer.valueOf((int) (jM3848unboximpl >> 32)))).intValue()) << 32) | (((long) ((int) (jM3848unboximpl & 4294967295L))) & 4294967295L)));
                        }

                        {
                            super(1);
                        }
                    }));
                } else {
                    scrollingLogicdoFlingAnimation2reverseScope1Serializer = scrollingLogicdoFlingAnimation2reverseScope2;
                }
                if (i6 != 0) {
                    tapGestureDetectorKt3 = onKeyEventZmokQxo.write(null, 3).read(onKeyEventZmokQxo.RemoteActionCompatParcelizer(null, 15));
                } else {
                    tapGestureDetectorKt3 = tapGestureDetectorKt2;
                }
                int i14 = i8 >> 3;
                Transition transitionSerializer4 = requiredHeightInVpY3zN4default.serializer(Boolean.valueOf(z), "AnimatedVisibility", getpostalcode, (i14 & 14) | ((i8 >> 12) & 112), 0);
                objComponentActivity = getpostalcode.ComponentActivity();
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = reset.read;
                    getpostalcode.write(objComponentActivity);
                }
                IconCompatParcelizer(transitionSerializer4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, modifier4, scrollingLogicdoFlingAnimation2reverseScope1Serializer, tapGestureDetectorKt3, dragAndDropTargetModifierNode, getpostalcode, (i8 & 7168) | (i8 & 896) | 48 | (57344 & i8) | (i14 & 458752));
                modifier3 = modifier4;
                scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope1Serializer;
                str2 = "AnimatedVisibility";
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                str2 = str;
                modifier3 = modifier2;
                scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope2;
                tapGestureDetectorKt3 = tapGestureDetectorKt2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new NonTouchScrollingLogicKtbusyReceive2job1(z, modifier3, scrollingLogicdoFlingAnimation2reverseScope3, tapGestureDetectorKt3, str2, dragAndDropTargetModifierNode, i, i2);
            }
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                scrollingLogicdoFlingAnimation2reverseScope2 = scrollingLogicdoFlingAnimation2reverseScope1;
                if (getpostalcode.read(scrollingLogicdoFlingAnimation2reverseScope2)) {
                    i5 = Fields.CameraDistance;
                } else {
                    i5 = Fields.RotationZ;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    tapGestureDetectorKt2 = tapGestureDetectorKt;
                    if (getpostalcode.read(tapGestureDetectorKt2)) {
                        i7 = Fields.Clip;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i3 | 196608;
                if ((1572864 & i) == 0) {
                    if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                        i9 = 1048576;
                    } else {
                        i9 = Fields.BlendMode;
                    }
                    i8 |= i9;
                }
                if ((599185 & i8) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (getpostalcode.write(i8 & 1, z2)) {
                    if (i10 != 0) {
                        modifier4 = Modifier.Companion;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i4 != 0) {
                        ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1Serializer6 = onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 3);
                        IntSize.Companion companion5 = IntSize.Companion;
                        Map map5 = WindowInsetsAnimationCancelledException.serializer;
                        width widthVarIconCompatParcelizer5 = DelayKt.IconCompatParcelizer(0.0f, 400.0f, 1, IntSize.m3836boximpl(IntSize.m3839constructorimpl(InlineClassHelperKt.Uint64Low32)));
                        Alignment alignmentWrite5 = onKeyEventZmokQxo.write(Alignment.Companion.getEnd());
                        final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM tofloatk4lq0m5 = toFloatk4lQ0M.read;
                        scrollingLogicdoFlingAnimation2reverseScope1Serializer = scrollingLogicdoFlingAnimation2reverseScope1Serializer6.serializer(onKeyEventZmokQxo.IconCompatParcelizer(widthVarIconCompatParcelizer5, alignmentWrite5, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$2
                            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                            public final Object invoke(Object obj) {
                                long jM3848unboximpl = ((IntSize) obj).m3848unboximpl();
                                return IntSize.m3836boximpl(IntSize.m3839constructorimpl((((long) ((Number) tofloatk4lq0m5.invoke(Integer.valueOf((int) (jM3848unboximpl >> 32)))).intValue()) << 32) | (((long) ((int) (jM3848unboximpl & 4294967295L))) & 4294967295L)));
                            }

                            {
                                super(1);
                            }
                        }));
                    } else {
                        scrollingLogicdoFlingAnimation2reverseScope1Serializer = scrollingLogicdoFlingAnimation2reverseScope2;
                    }
                    if (i6 != 0) {
                        tapGestureDetectorKt3 = onKeyEventZmokQxo.write(null, 3).read(onKeyEventZmokQxo.RemoteActionCompatParcelizer(null, 15));
                    } else {
                        tapGestureDetectorKt3 = tapGestureDetectorKt2;
                    }
                    int i15 = i8 >> 3;
                    Transition transitionSerializer5 = requiredHeightInVpY3zN4default.serializer(Boolean.valueOf(z), "AnimatedVisibility", getpostalcode, (i15 & 14) | ((i8 >> 12) & 112), 0);
                    objComponentActivity = getpostalcode.ComponentActivity();
                    if (objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = reset.read;
                        getpostalcode.write(objComponentActivity);
                    }
                    IconCompatParcelizer(transitionSerializer5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, modifier4, scrollingLogicdoFlingAnimation2reverseScope1Serializer, tapGestureDetectorKt3, dragAndDropTargetModifierNode, getpostalcode, (i8 & 7168) | (i8 & 896) | 48 | (57344 & i8) | (i15 & 458752));
                    modifier3 = modifier4;
                    scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope1Serializer;
                    str2 = "AnimatedVisibility";
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    str2 = str;
                    modifier3 = modifier2;
                    scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope2;
                    tapGestureDetectorKt3 = tapGestureDetectorKt2;
                }
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new NonTouchScrollingLogicKtbusyReceive2job1(z, modifier3, scrollingLogicdoFlingAnimation2reverseScope3, tapGestureDetectorKt3, str2, dragAndDropTargetModifierNode, i, i2);
                }
            }
            i3 |= 24576;
            tapGestureDetectorKt2 = tapGestureDetectorKt;
            i8 = i3 | 196608;
            if ((1572864 & i) == 0) {
                if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                    i9 = 1048576;
                } else {
                    i9 = Fields.BlendMode;
                }
                i8 |= i9;
            }
            if ((599185 & i8) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (getpostalcode.write(i8 & 1, z2)) {
                if (i10 != 0) {
                    modifier4 = Modifier.Companion;
                } else {
                    modifier4 = modifier2;
                }
                if (i4 != 0) {
                    ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1Serializer7 = onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 3);
                    IntSize.Companion companion6 = IntSize.Companion;
                    Map map6 = WindowInsetsAnimationCancelledException.serializer;
                    width widthVarIconCompatParcelizer6 = DelayKt.IconCompatParcelizer(0.0f, 400.0f, 1, IntSize.m3836boximpl(IntSize.m3839constructorimpl(InlineClassHelperKt.Uint64Low32)));
                    Alignment alignmentWrite6 = onKeyEventZmokQxo.write(Alignment.Companion.getEnd());
                    final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM tofloatk4lq0m6 = toFloatk4lQ0M.read;
                    scrollingLogicdoFlingAnimation2reverseScope1Serializer = scrollingLogicdoFlingAnimation2reverseScope1Serializer7.serializer(onKeyEventZmokQxo.IconCompatParcelizer(widthVarIconCompatParcelizer6, alignmentWrite6, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$2
                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public final Object invoke(Object obj) {
                            long jM3848unboximpl = ((IntSize) obj).m3848unboximpl();
                            return IntSize.m3836boximpl(IntSize.m3839constructorimpl((((long) ((Number) tofloatk4lq0m6.invoke(Integer.valueOf((int) (jM3848unboximpl >> 32)))).intValue()) << 32) | (((long) ((int) (jM3848unboximpl & 4294967295L))) & 4294967295L)));
                        }

                        {
                            super(1);
                        }
                    }));
                } else {
                    scrollingLogicdoFlingAnimation2reverseScope1Serializer = scrollingLogicdoFlingAnimation2reverseScope2;
                }
                if (i6 != 0) {
                    tapGestureDetectorKt3 = onKeyEventZmokQxo.write(null, 3).read(onKeyEventZmokQxo.RemoteActionCompatParcelizer(null, 15));
                } else {
                    tapGestureDetectorKt3 = tapGestureDetectorKt2;
                }
                int i16 = i8 >> 3;
                Transition transitionSerializer6 = requiredHeightInVpY3zN4default.serializer(Boolean.valueOf(z), "AnimatedVisibility", getpostalcode, (i16 & 14) | ((i8 >> 12) & 112), 0);
                objComponentActivity = getpostalcode.ComponentActivity();
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = reset.read;
                    getpostalcode.write(objComponentActivity);
                }
                IconCompatParcelizer(transitionSerializer6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, modifier4, scrollingLogicdoFlingAnimation2reverseScope1Serializer, tapGestureDetectorKt3, dragAndDropTargetModifierNode, getpostalcode, (i8 & 7168) | (i8 & 896) | 48 | (57344 & i8) | (i16 & 458752));
                modifier3 = modifier4;
                scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope1Serializer;
                str2 = "AnimatedVisibility";
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                str2 = str;
                modifier3 = modifier2;
                scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope2;
                tapGestureDetectorKt3 = tapGestureDetectorKt2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new NonTouchScrollingLogicKtbusyReceive2job1(z, modifier3, scrollingLogicdoFlingAnimation2reverseScope3, tapGestureDetectorKt3, str2, dragAndDropTargetModifierNode, i, i2);
            }
        }
        i3 |= 3072;
        scrollingLogicdoFlingAnimation2reverseScope2 = scrollingLogicdoFlingAnimation2reverseScope1;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                tapGestureDetectorKt2 = tapGestureDetectorKt;
                if (getpostalcode.read(tapGestureDetectorKt2)) {
                    i7 = Fields.Clip;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i3 | 196608;
            if ((1572864 & i) == 0) {
                if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                    i9 = 1048576;
                } else {
                    i9 = Fields.BlendMode;
                }
                i8 |= i9;
            }
            if ((599185 & i8) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (getpostalcode.write(i8 & 1, z2)) {
                if (i10 != 0) {
                    modifier4 = Modifier.Companion;
                } else {
                    modifier4 = modifier2;
                }
                if (i4 != 0) {
                    ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1Serializer8 = onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 3);
                    IntSize.Companion companion7 = IntSize.Companion;
                    Map map7 = WindowInsetsAnimationCancelledException.serializer;
                    width widthVarIconCompatParcelizer7 = DelayKt.IconCompatParcelizer(0.0f, 400.0f, 1, IntSize.m3836boximpl(IntSize.m3839constructorimpl(InlineClassHelperKt.Uint64Low32)));
                    Alignment alignmentWrite7 = onKeyEventZmokQxo.write(Alignment.Companion.getEnd());
                    final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM tofloatk4lq0m7 = toFloatk4lQ0M.read;
                    scrollingLogicdoFlingAnimation2reverseScope1Serializer = scrollingLogicdoFlingAnimation2reverseScope1Serializer8.serializer(onKeyEventZmokQxo.IconCompatParcelizer(widthVarIconCompatParcelizer7, alignmentWrite7, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$2
                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public final Object invoke(Object obj) {
                            long jM3848unboximpl = ((IntSize) obj).m3848unboximpl();
                            return IntSize.m3836boximpl(IntSize.m3839constructorimpl((((long) ((Number) tofloatk4lq0m7.invoke(Integer.valueOf((int) (jM3848unboximpl >> 32)))).intValue()) << 32) | (((long) ((int) (jM3848unboximpl & 4294967295L))) & 4294967295L)));
                        }

                        {
                            super(1);
                        }
                    }));
                } else {
                    scrollingLogicdoFlingAnimation2reverseScope1Serializer = scrollingLogicdoFlingAnimation2reverseScope2;
                }
                if (i6 != 0) {
                    tapGestureDetectorKt3 = onKeyEventZmokQxo.write(null, 3).read(onKeyEventZmokQxo.RemoteActionCompatParcelizer(null, 15));
                } else {
                    tapGestureDetectorKt3 = tapGestureDetectorKt2;
                }
                int i17 = i8 >> 3;
                Transition transitionSerializer7 = requiredHeightInVpY3zN4default.serializer(Boolean.valueOf(z), "AnimatedVisibility", getpostalcode, (i17 & 14) | ((i8 >> 12) & 112), 0);
                objComponentActivity = getpostalcode.ComponentActivity();
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = reset.read;
                    getpostalcode.write(objComponentActivity);
                }
                IconCompatParcelizer(transitionSerializer7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, modifier4, scrollingLogicdoFlingAnimation2reverseScope1Serializer, tapGestureDetectorKt3, dragAndDropTargetModifierNode, getpostalcode, (i8 & 7168) | (i8 & 896) | 48 | (57344 & i8) | (i17 & 458752));
                modifier3 = modifier4;
                scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope1Serializer;
                str2 = "AnimatedVisibility";
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                str2 = str;
                modifier3 = modifier2;
                scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope2;
                tapGestureDetectorKt3 = tapGestureDetectorKt2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new NonTouchScrollingLogicKtbusyReceive2job1(z, modifier3, scrollingLogicdoFlingAnimation2reverseScope3, tapGestureDetectorKt3, str2, dragAndDropTargetModifierNode, i, i2);
            }
        }
        i3 |= 24576;
        tapGestureDetectorKt2 = tapGestureDetectorKt;
        i8 = i3 | 196608;
        if ((1572864 & i) == 0) {
            if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                i9 = 1048576;
            } else {
                i9 = Fields.BlendMode;
            }
            i8 |= i9;
        }
        if ((599185 & i8) != 599184) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (getpostalcode.write(i8 & 1, z2)) {
            if (i10 != 0) {
                modifier4 = Modifier.Companion;
            } else {
                modifier4 = modifier2;
            }
            if (i4 != 0) {
                ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1Serializer9 = onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 3);
                IntSize.Companion companion8 = IntSize.Companion;
                Map map8 = WindowInsetsAnimationCancelledException.serializer;
                width widthVarIconCompatParcelizer8 = DelayKt.IconCompatParcelizer(0.0f, 400.0f, 1, IntSize.m3836boximpl(IntSize.m3839constructorimpl(InlineClassHelperKt.Uint64Low32)));
                Alignment alignmentWrite8 = onKeyEventZmokQxo.write(Alignment.Companion.getEnd());
                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM tofloatk4lq0m8 = toFloatk4lQ0M.read;
                scrollingLogicdoFlingAnimation2reverseScope1Serializer = scrollingLogicdoFlingAnimation2reverseScope1Serializer9.serializer(onKeyEventZmokQxo.IconCompatParcelizer(widthVarIconCompatParcelizer8, alignmentWrite8, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$2
                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj) {
                        long jM3848unboximpl = ((IntSize) obj).m3848unboximpl();
                        return IntSize.m3836boximpl(IntSize.m3839constructorimpl((((long) ((Number) tofloatk4lq0m8.invoke(Integer.valueOf((int) (jM3848unboximpl >> 32)))).intValue()) << 32) | (((long) ((int) (jM3848unboximpl & 4294967295L))) & 4294967295L)));
                    }

                    {
                        super(1);
                    }
                }));
            } else {
                scrollingLogicdoFlingAnimation2reverseScope1Serializer = scrollingLogicdoFlingAnimation2reverseScope2;
            }
            if (i6 != 0) {
                tapGestureDetectorKt3 = onKeyEventZmokQxo.write(null, 3).read(onKeyEventZmokQxo.RemoteActionCompatParcelizer(null, 15));
            } else {
                tapGestureDetectorKt3 = tapGestureDetectorKt2;
            }
            int i18 = i8 >> 3;
            Transition transitionSerializer8 = requiredHeightInVpY3zN4default.serializer(Boolean.valueOf(z), "AnimatedVisibility", getpostalcode, (i18 & 14) | ((i8 >> 12) & 112), 0);
            objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = reset.read;
                getpostalcode.write(objComponentActivity);
            }
            IconCompatParcelizer(transitionSerializer8, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, modifier4, scrollingLogicdoFlingAnimation2reverseScope1Serializer, tapGestureDetectorKt3, dragAndDropTargetModifierNode, getpostalcode, (i8 & 7168) | (i8 & 896) | 48 | (57344 & i8) | (i18 & 458752));
            modifier3 = modifier4;
            scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope1Serializer;
            str2 = "AnimatedVisibility";
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            str2 = str;
            modifier3 = modifier2;
            scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope2;
            tapGestureDetectorKt3 = tapGestureDetectorKt2;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new NonTouchScrollingLogicKtbusyReceive2job1(z, modifier3, scrollingLogicdoFlingAnimation2reverseScope3, tapGestureDetectorKt3, str2, dragAndDropTargetModifierNode, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:70:0x010a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0118  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void RemoteActionCompatParcelizer(boolean z, Modifier modifier, ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1, TapGestureDetectorKt tapGestureDetectorKt, String str, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope2;
        int i5;
        int i6;
        TapGestureDetectorKt tapGestureDetectorKt2;
        int i7;
        int i8;
        boolean z2;
        String str2;
        Modifier modifier3;
        ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope3;
        TapGestureDetectorKt tapGestureDetectorKt3;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        Modifier modifier4;
        ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1Serializer;
        Object objComponentActivity;
        int i9;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1448730565);
        if ((i & 6) == 0) {
            i3 = (getpostalcode.write(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= getpostalcode.read(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    scrollingLogicdoFlingAnimation2reverseScope2 = scrollingLogicdoFlingAnimation2reverseScope1;
                    if (getpostalcode.read(scrollingLogicdoFlingAnimation2reverseScope2)) {
                        i5 = Fields.RotationX;
                    } else {
                        i5 = Fields.SpotShadowColor;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        tapGestureDetectorKt2 = tapGestureDetectorKt;
                        if (getpostalcode.read(tapGestureDetectorKt2)) {
                            i7 = Fields.CameraDistance;
                        } else {
                            i7 = Fields.RotationZ;
                        }
                        i3 |= i7;
                    }
                    i8 = i3 | 24576;
                    if ((196608 & i) == 0) {
                        if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                            i9 = Fields.RenderEffect;
                        } else {
                            i9 = 65536;
                        }
                        i8 |= i9;
                    }
                    if ((74899 & i8) != 74898) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (getpostalcode.write(i8 & 1, z2)) {
                        if (i10 != 0) {
                            modifier4 = Modifier.Companion;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i4 != 0) {
                            scrollingLogicdoFlingAnimation2reverseScope1Serializer = onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 3).serializer(onKeyEventZmokQxo.write(null, null, 15));
                        } else {
                            scrollingLogicdoFlingAnimation2reverseScope1Serializer = scrollingLogicdoFlingAnimation2reverseScope2;
                        }
                        if (i6 != 0) {
                            tapGestureDetectorKt3 = onKeyEventZmokQxo.IconCompatParcelizer((requiredWidthInVpY3zN4default) null, (Alignment) null, 15).read(onKeyEventZmokQxo.write(null, 3));
                        } else {
                            tapGestureDetectorKt3 = tapGestureDetectorKt2;
                        }
                        Transition transitionSerializer = requiredHeightInVpY3zN4default.serializer(Boolean.valueOf(z), "AnimatedVisibility", getpostalcode, (i8 & 14) | ((i8 >> 9) & 112), 0);
                        objComponentActivity = getpostalcode.ComponentActivity();
                        if (objComponentActivity == getCreditCardExpirationMonth.write) {
                            objComponentActivity = EnterExitTransitionKt$expandIn$1.IconCompatParcelizer;
                            getpostalcode.write(objComponentActivity);
                        }
                        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity;
                        int i11 = i8 << 3;
                        IconCompatParcelizer(transitionSerializer, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier4, scrollingLogicdoFlingAnimation2reverseScope1Serializer, tapGestureDetectorKt3, dragAndDropTargetModifierNode, getpostalcode, (i8 & 458752) | (i11 & 7168) | (i11 & 896) | 48 | (57344 & i11));
                        modifier3 = modifier4;
                        scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope1Serializer;
                        str2 = "AnimatedVisibility";
                    } else {
                        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        str2 = str;
                        modifier3 = modifier2;
                        scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope2;
                        tapGestureDetectorKt3 = tapGestureDetectorKt2;
                    }
                    gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                    if (gethandleruiannotationsMediaDescriptionCompat != null) {
                        gethandleruiannotationsMediaDescriptionCompat.serializer = new NonTouchScrollingLogic(z, modifier3, scrollingLogicdoFlingAnimation2reverseScope3, tapGestureDetectorKt3, str2, dragAndDropTargetModifierNode, i, i2, 0);
                    }
                }
                i3 |= 3072;
                tapGestureDetectorKt2 = tapGestureDetectorKt;
                i8 = i3 | 24576;
                if ((196608 & i) == 0) {
                    if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                        i9 = Fields.RenderEffect;
                    } else {
                        i9 = 65536;
                    }
                    i8 |= i9;
                }
                if ((74899 & i8) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (getpostalcode.write(i8 & 1, z2)) {
                    if (i10 != 0) {
                        modifier4 = Modifier.Companion;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i4 != 0) {
                        scrollingLogicdoFlingAnimation2reverseScope1Serializer = onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 3).serializer(onKeyEventZmokQxo.write(null, null, 15));
                    } else {
                        scrollingLogicdoFlingAnimation2reverseScope1Serializer = scrollingLogicdoFlingAnimation2reverseScope2;
                    }
                    if (i6 != 0) {
                        tapGestureDetectorKt3 = onKeyEventZmokQxo.IconCompatParcelizer((requiredWidthInVpY3zN4default) null, (Alignment) null, 15).read(onKeyEventZmokQxo.write(null, 3));
                    } else {
                        tapGestureDetectorKt3 = tapGestureDetectorKt2;
                    }
                    Transition transitionSerializer2 = requiredHeightInVpY3zN4default.serializer(Boolean.valueOf(z), "AnimatedVisibility", getpostalcode, (i8 & 14) | ((i8 >> 9) & 112), 0);
                    objComponentActivity = getpostalcode.ComponentActivity();
                    if (objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = EnterExitTransitionKt$expandIn$1.IconCompatParcelizer;
                        getpostalcode.write(objComponentActivity);
                    }
                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity;
                    int i12 = i8 << 3;
                    IconCompatParcelizer(transitionSerializer2, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier4, scrollingLogicdoFlingAnimation2reverseScope1Serializer, tapGestureDetectorKt3, dragAndDropTargetModifierNode, getpostalcode, (i8 & 458752) | (i12 & 7168) | (i12 & 896) | 48 | (57344 & i12));
                    modifier3 = modifier4;
                    scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope1Serializer;
                    str2 = "AnimatedVisibility";
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    str2 = str;
                    modifier3 = modifier2;
                    scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope2;
                    tapGestureDetectorKt3 = tapGestureDetectorKt2;
                }
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new NonTouchScrollingLogic(z, modifier3, scrollingLogicdoFlingAnimation2reverseScope3, tapGestureDetectorKt3, str2, dragAndDropTargetModifierNode, i, i2, 0);
                }
            }
            i3 |= 384;
            scrollingLogicdoFlingAnimation2reverseScope2 = scrollingLogicdoFlingAnimation2reverseScope1;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    tapGestureDetectorKt2 = tapGestureDetectorKt;
                    if (getpostalcode.read(tapGestureDetectorKt2)) {
                        i7 = Fields.CameraDistance;
                    } else {
                        i7 = Fields.RotationZ;
                    }
                    i3 |= i7;
                }
                i8 = i3 | 24576;
                if ((196608 & i) == 0) {
                    if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                        i9 = Fields.RenderEffect;
                    } else {
                        i9 = 65536;
                    }
                    i8 |= i9;
                }
                if ((74899 & i8) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (getpostalcode.write(i8 & 1, z2)) {
                    if (i10 != 0) {
                        modifier4 = Modifier.Companion;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i4 != 0) {
                        scrollingLogicdoFlingAnimation2reverseScope1Serializer = onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 3).serializer(onKeyEventZmokQxo.write(null, null, 15));
                    } else {
                        scrollingLogicdoFlingAnimation2reverseScope1Serializer = scrollingLogicdoFlingAnimation2reverseScope2;
                    }
                    if (i6 != 0) {
                        tapGestureDetectorKt3 = onKeyEventZmokQxo.IconCompatParcelizer((requiredWidthInVpY3zN4default) null, (Alignment) null, 15).read(onKeyEventZmokQxo.write(null, 3));
                    } else {
                        tapGestureDetectorKt3 = tapGestureDetectorKt2;
                    }
                    Transition transitionSerializer3 = requiredHeightInVpY3zN4default.serializer(Boolean.valueOf(z), "AnimatedVisibility", getpostalcode, (i8 & 14) | ((i8 >> 9) & 112), 0);
                    objComponentActivity = getpostalcode.ComponentActivity();
                    if (objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = EnterExitTransitionKt$expandIn$1.IconCompatParcelizer;
                        getpostalcode.write(objComponentActivity);
                    }
                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity;
                    int i13 = i8 << 3;
                    IconCompatParcelizer(transitionSerializer3, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, modifier4, scrollingLogicdoFlingAnimation2reverseScope1Serializer, tapGestureDetectorKt3, dragAndDropTargetModifierNode, getpostalcode, (i8 & 458752) | (i13 & 7168) | (i13 & 896) | 48 | (57344 & i13));
                    modifier3 = modifier4;
                    scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope1Serializer;
                    str2 = "AnimatedVisibility";
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    str2 = str;
                    modifier3 = modifier2;
                    scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope2;
                    tapGestureDetectorKt3 = tapGestureDetectorKt2;
                }
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new NonTouchScrollingLogic(z, modifier3, scrollingLogicdoFlingAnimation2reverseScope3, tapGestureDetectorKt3, str2, dragAndDropTargetModifierNode, i, i2, 0);
                }
            }
            i3 |= 3072;
            tapGestureDetectorKt2 = tapGestureDetectorKt;
            i8 = i3 | 24576;
            if ((196608 & i) == 0) {
                if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                    i9 = Fields.RenderEffect;
                } else {
                    i9 = 65536;
                }
                i8 |= i9;
            }
            if ((74899 & i8) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (getpostalcode.write(i8 & 1, z2)) {
                if (i10 != 0) {
                    modifier4 = Modifier.Companion;
                } else {
                    modifier4 = modifier2;
                }
                if (i4 != 0) {
                    scrollingLogicdoFlingAnimation2reverseScope1Serializer = onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 3).serializer(onKeyEventZmokQxo.write(null, null, 15));
                } else {
                    scrollingLogicdoFlingAnimation2reverseScope1Serializer = scrollingLogicdoFlingAnimation2reverseScope2;
                }
                if (i6 != 0) {
                    tapGestureDetectorKt3 = onKeyEventZmokQxo.IconCompatParcelizer((requiredWidthInVpY3zN4default) null, (Alignment) null, 15).read(onKeyEventZmokQxo.write(null, 3));
                } else {
                    tapGestureDetectorKt3 = tapGestureDetectorKt2;
                }
                Transition transitionSerializer4 = requiredHeightInVpY3zN4default.serializer(Boolean.valueOf(z), "AnimatedVisibility", getpostalcode, (i8 & 14) | ((i8 >> 9) & 112), 0);
                objComponentActivity = getpostalcode.ComponentActivity();
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = EnterExitTransitionKt$expandIn$1.IconCompatParcelizer;
                    getpostalcode.write(objComponentActivity);
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity;
                int i14 = i8 << 3;
                IconCompatParcelizer(transitionSerializer4, r8lambdaunavo3sxub_pc9xroryotnrlvsm4, modifier4, scrollingLogicdoFlingAnimation2reverseScope1Serializer, tapGestureDetectorKt3, dragAndDropTargetModifierNode, getpostalcode, (i8 & 458752) | (i14 & 7168) | (i14 & 896) | 48 | (57344 & i14));
                modifier3 = modifier4;
                scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope1Serializer;
                str2 = "AnimatedVisibility";
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                str2 = str;
                modifier3 = modifier2;
                scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope2;
                tapGestureDetectorKt3 = tapGestureDetectorKt2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new NonTouchScrollingLogic(z, modifier3, scrollingLogicdoFlingAnimation2reverseScope3, tapGestureDetectorKt3, str2, dragAndDropTargetModifierNode, i, i2, 0);
            }
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                scrollingLogicdoFlingAnimation2reverseScope2 = scrollingLogicdoFlingAnimation2reverseScope1;
                if (getpostalcode.read(scrollingLogicdoFlingAnimation2reverseScope2)) {
                    i5 = Fields.RotationX;
                } else {
                    i5 = Fields.SpotShadowColor;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    tapGestureDetectorKt2 = tapGestureDetectorKt;
                    if (getpostalcode.read(tapGestureDetectorKt2)) {
                        i7 = Fields.CameraDistance;
                    } else {
                        i7 = Fields.RotationZ;
                    }
                    i3 |= i7;
                }
                i8 = i3 | 24576;
                if ((196608 & i) == 0) {
                    if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                        i9 = Fields.RenderEffect;
                    } else {
                        i9 = 65536;
                    }
                    i8 |= i9;
                }
                if ((74899 & i8) != 74898) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (getpostalcode.write(i8 & 1, z2)) {
                    if (i10 != 0) {
                        modifier4 = Modifier.Companion;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i4 != 0) {
                        scrollingLogicdoFlingAnimation2reverseScope1Serializer = onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 3).serializer(onKeyEventZmokQxo.write(null, null, 15));
                    } else {
                        scrollingLogicdoFlingAnimation2reverseScope1Serializer = scrollingLogicdoFlingAnimation2reverseScope2;
                    }
                    if (i6 != 0) {
                        tapGestureDetectorKt3 = onKeyEventZmokQxo.IconCompatParcelizer((requiredWidthInVpY3zN4default) null, (Alignment) null, 15).read(onKeyEventZmokQxo.write(null, 3));
                    } else {
                        tapGestureDetectorKt3 = tapGestureDetectorKt2;
                    }
                    Transition transitionSerializer5 = requiredHeightInVpY3zN4default.serializer(Boolean.valueOf(z), "AnimatedVisibility", getpostalcode, (i8 & 14) | ((i8 >> 9) & 112), 0);
                    objComponentActivity = getpostalcode.ComponentActivity();
                    if (objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = EnterExitTransitionKt$expandIn$1.IconCompatParcelizer;
                        getpostalcode.write(objComponentActivity);
                    }
                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm5 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity;
                    int i15 = i8 << 3;
                    IconCompatParcelizer(transitionSerializer5, r8lambdaunavo3sxub_pc9xroryotnrlvsm5, modifier4, scrollingLogicdoFlingAnimation2reverseScope1Serializer, tapGestureDetectorKt3, dragAndDropTargetModifierNode, getpostalcode, (i8 & 458752) | (i15 & 7168) | (i15 & 896) | 48 | (57344 & i15));
                    modifier3 = modifier4;
                    scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope1Serializer;
                    str2 = "AnimatedVisibility";
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    str2 = str;
                    modifier3 = modifier2;
                    scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope2;
                    tapGestureDetectorKt3 = tapGestureDetectorKt2;
                }
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new NonTouchScrollingLogic(z, modifier3, scrollingLogicdoFlingAnimation2reverseScope3, tapGestureDetectorKt3, str2, dragAndDropTargetModifierNode, i, i2, 0);
                }
            }
            i3 |= 3072;
            tapGestureDetectorKt2 = tapGestureDetectorKt;
            i8 = i3 | 24576;
            if ((196608 & i) == 0) {
                if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                    i9 = Fields.RenderEffect;
                } else {
                    i9 = 65536;
                }
                i8 |= i9;
            }
            if ((74899 & i8) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (getpostalcode.write(i8 & 1, z2)) {
                if (i10 != 0) {
                    modifier4 = Modifier.Companion;
                } else {
                    modifier4 = modifier2;
                }
                if (i4 != 0) {
                    scrollingLogicdoFlingAnimation2reverseScope1Serializer = onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 3).serializer(onKeyEventZmokQxo.write(null, null, 15));
                } else {
                    scrollingLogicdoFlingAnimation2reverseScope1Serializer = scrollingLogicdoFlingAnimation2reverseScope2;
                }
                if (i6 != 0) {
                    tapGestureDetectorKt3 = onKeyEventZmokQxo.IconCompatParcelizer((requiredWidthInVpY3zN4default) null, (Alignment) null, 15).read(onKeyEventZmokQxo.write(null, 3));
                } else {
                    tapGestureDetectorKt3 = tapGestureDetectorKt2;
                }
                Transition transitionSerializer6 = requiredHeightInVpY3zN4default.serializer(Boolean.valueOf(z), "AnimatedVisibility", getpostalcode, (i8 & 14) | ((i8 >> 9) & 112), 0);
                objComponentActivity = getpostalcode.ComponentActivity();
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = EnterExitTransitionKt$expandIn$1.IconCompatParcelizer;
                    getpostalcode.write(objComponentActivity);
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm6 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity;
                int i16 = i8 << 3;
                IconCompatParcelizer(transitionSerializer6, r8lambdaunavo3sxub_pc9xroryotnrlvsm6, modifier4, scrollingLogicdoFlingAnimation2reverseScope1Serializer, tapGestureDetectorKt3, dragAndDropTargetModifierNode, getpostalcode, (i8 & 458752) | (i16 & 7168) | (i16 & 896) | 48 | (57344 & i16));
                modifier3 = modifier4;
                scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope1Serializer;
                str2 = "AnimatedVisibility";
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                str2 = str;
                modifier3 = modifier2;
                scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope2;
                tapGestureDetectorKt3 = tapGestureDetectorKt2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new NonTouchScrollingLogic(z, modifier3, scrollingLogicdoFlingAnimation2reverseScope3, tapGestureDetectorKt3, str2, dragAndDropTargetModifierNode, i, i2, 0);
            }
        }
        i3 |= 384;
        scrollingLogicdoFlingAnimation2reverseScope2 = scrollingLogicdoFlingAnimation2reverseScope1;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                tapGestureDetectorKt2 = tapGestureDetectorKt;
                if (getpostalcode.read(tapGestureDetectorKt2)) {
                    i7 = Fields.CameraDistance;
                } else {
                    i7 = Fields.RotationZ;
                }
                i3 |= i7;
            }
            i8 = i3 | 24576;
            if ((196608 & i) == 0) {
                if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                    i9 = Fields.RenderEffect;
                } else {
                    i9 = 65536;
                }
                i8 |= i9;
            }
            if ((74899 & i8) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (getpostalcode.write(i8 & 1, z2)) {
                if (i10 != 0) {
                    modifier4 = Modifier.Companion;
                } else {
                    modifier4 = modifier2;
                }
                if (i4 != 0) {
                    scrollingLogicdoFlingAnimation2reverseScope1Serializer = onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 3).serializer(onKeyEventZmokQxo.write(null, null, 15));
                } else {
                    scrollingLogicdoFlingAnimation2reverseScope1Serializer = scrollingLogicdoFlingAnimation2reverseScope2;
                }
                if (i6 != 0) {
                    tapGestureDetectorKt3 = onKeyEventZmokQxo.IconCompatParcelizer((requiredWidthInVpY3zN4default) null, (Alignment) null, 15).read(onKeyEventZmokQxo.write(null, 3));
                } else {
                    tapGestureDetectorKt3 = tapGestureDetectorKt2;
                }
                Transition transitionSerializer7 = requiredHeightInVpY3zN4default.serializer(Boolean.valueOf(z), "AnimatedVisibility", getpostalcode, (i8 & 14) | ((i8 >> 9) & 112), 0);
                objComponentActivity = getpostalcode.ComponentActivity();
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = EnterExitTransitionKt$expandIn$1.IconCompatParcelizer;
                    getpostalcode.write(objComponentActivity);
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm7 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity;
                int i17 = i8 << 3;
                IconCompatParcelizer(transitionSerializer7, r8lambdaunavo3sxub_pc9xroryotnrlvsm7, modifier4, scrollingLogicdoFlingAnimation2reverseScope1Serializer, tapGestureDetectorKt3, dragAndDropTargetModifierNode, getpostalcode, (i8 & 458752) | (i17 & 7168) | (i17 & 896) | 48 | (57344 & i17));
                modifier3 = modifier4;
                scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope1Serializer;
                str2 = "AnimatedVisibility";
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                str2 = str;
                modifier3 = modifier2;
                scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope2;
                tapGestureDetectorKt3 = tapGestureDetectorKt2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new NonTouchScrollingLogic(z, modifier3, scrollingLogicdoFlingAnimation2reverseScope3, tapGestureDetectorKt3, str2, dragAndDropTargetModifierNode, i, i2, 0);
            }
        }
        i3 |= 3072;
        tapGestureDetectorKt2 = tapGestureDetectorKt;
        i8 = i3 | 24576;
        if ((196608 & i) == 0) {
            if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                i9 = Fields.RenderEffect;
            } else {
                i9 = 65536;
            }
            i8 |= i9;
        }
        if ((74899 & i8) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (getpostalcode.write(i8 & 1, z2)) {
            if (i10 != 0) {
                modifier4 = Modifier.Companion;
            } else {
                modifier4 = modifier2;
            }
            if (i4 != 0) {
                scrollingLogicdoFlingAnimation2reverseScope1Serializer = onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 3).serializer(onKeyEventZmokQxo.write(null, null, 15));
            } else {
                scrollingLogicdoFlingAnimation2reverseScope1Serializer = scrollingLogicdoFlingAnimation2reverseScope2;
            }
            if (i6 != 0) {
                tapGestureDetectorKt3 = onKeyEventZmokQxo.IconCompatParcelizer((requiredWidthInVpY3zN4default) null, (Alignment) null, 15).read(onKeyEventZmokQxo.write(null, 3));
            } else {
                tapGestureDetectorKt3 = tapGestureDetectorKt2;
            }
            Transition transitionSerializer8 = requiredHeightInVpY3zN4default.serializer(Boolean.valueOf(z), "AnimatedVisibility", getpostalcode, (i8 & 14) | ((i8 >> 9) & 112), 0);
            objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = EnterExitTransitionKt$expandIn$1.IconCompatParcelizer;
                getpostalcode.write(objComponentActivity);
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm8 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity;
            int i18 = i8 << 3;
            IconCompatParcelizer(transitionSerializer8, r8lambdaunavo3sxub_pc9xroryotnrlvsm8, modifier4, scrollingLogicdoFlingAnimation2reverseScope1Serializer, tapGestureDetectorKt3, dragAndDropTargetModifierNode, getpostalcode, (i8 & 458752) | (i18 & 7168) | (i18 & 896) | 48 | (57344 & i18));
            modifier3 = modifier4;
            scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope1Serializer;
            str2 = "AnimatedVisibility";
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            str2 = str;
            modifier3 = modifier2;
            scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope2;
            tapGestureDetectorKt3 = tapGestureDetectorKt2;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new NonTouchScrollingLogic(z, modifier3, scrollingLogicdoFlingAnimation2reverseScope3, tapGestureDetectorKt3, str2, dragAndDropTargetModifierNode, i, i2, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:70:0x010c  */
    /* JADX WARN: Code duplicated, block: B:73:0x011a  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void serializer(boolean z, Modifier modifier, ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1, TapGestureDetectorKt tapGestureDetectorKt, String str, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope2;
        int i5;
        int i6;
        TapGestureDetectorKt tapGestureDetectorKt2;
        int i7;
        int i8;
        boolean z2;
        String str2;
        Modifier modifier3;
        ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope3;
        TapGestureDetectorKt tapGestureDetectorKt3;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        Modifier modifier4;
        ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1Serializer;
        Object objComponentActivity;
        int i9;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1799879339);
        if ((i & 48) == 0) {
            i3 = (getpostalcode.write(z) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= getpostalcode.read(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    scrollingLogicdoFlingAnimation2reverseScope2 = scrollingLogicdoFlingAnimation2reverseScope1;
                    if (getpostalcode.read(scrollingLogicdoFlingAnimation2reverseScope2)) {
                        i5 = Fields.CameraDistance;
                    } else {
                        i5 = Fields.RotationZ;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        tapGestureDetectorKt2 = tapGestureDetectorKt;
                        if (getpostalcode.read(tapGestureDetectorKt2)) {
                            i7 = Fields.Clip;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i3 | 196608;
                    if ((1572864 & i) == 0) {
                        if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                            i9 = 1048576;
                        } else {
                            i9 = Fields.BlendMode;
                        }
                        i8 |= i9;
                    }
                    if ((599185 & i8) != 599184) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (getpostalcode.write(i8 & 1, z2)) {
                        if (i10 != 0) {
                            modifier4 = Modifier.Companion;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i4 != 0) {
                            scrollingLogicdoFlingAnimation2reverseScope1Serializer = onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 3).serializer(onKeyEventZmokQxo.RemoteActionCompatParcelizer(null, null, 15));
                        } else {
                            scrollingLogicdoFlingAnimation2reverseScope1Serializer = scrollingLogicdoFlingAnimation2reverseScope2;
                        }
                        if (i6 != 0) {
                            tapGestureDetectorKt3 = onKeyEventZmokQxo.write(null, 3).read(onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, (Alignment.Vertical) null, 15));
                        } else {
                            tapGestureDetectorKt3 = tapGestureDetectorKt2;
                        }
                        int i11 = i8 >> 3;
                        Transition transitionSerializer = requiredHeightInVpY3zN4default.serializer(Boolean.valueOf(z), "AnimatedVisibility", getpostalcode, (i11 & 14) | ((i8 >> 12) & 112), 0);
                        objComponentActivity = getpostalcode.ComponentActivity();
                        if (objComponentActivity == getCreditCardExpirationMonth.write) {
                            objComponentActivity = EnterExitTransitionKt$expandIn$1.write;
                            getpostalcode.write(objComponentActivity);
                        }
                        IconCompatParcelizer(transitionSerializer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, modifier4, scrollingLogicdoFlingAnimation2reverseScope1Serializer, tapGestureDetectorKt3, dragAndDropTargetModifierNode, getpostalcode, (i8 & 7168) | (i8 & 896) | 48 | (57344 & i8) | (i11 & 458752));
                        modifier3 = modifier4;
                        scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope1Serializer;
                        str2 = "AnimatedVisibility";
                    } else {
                        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        str2 = str;
                        modifier3 = modifier2;
                        scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope2;
                        tapGestureDetectorKt3 = tapGestureDetectorKt2;
                    }
                    gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                    if (gethandleruiannotationsMediaDescriptionCompat != null) {
                        gethandleruiannotationsMediaDescriptionCompat.serializer = new NonTouchScrollingLogic(z, modifier3, scrollingLogicdoFlingAnimation2reverseScope3, tapGestureDetectorKt3, str2, dragAndDropTargetModifierNode, i, i2, 1);
                    }
                }
                i3 |= 24576;
                tapGestureDetectorKt2 = tapGestureDetectorKt;
                i8 = i3 | 196608;
                if ((1572864 & i) == 0) {
                    if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                        i9 = 1048576;
                    } else {
                        i9 = Fields.BlendMode;
                    }
                    i8 |= i9;
                }
                if ((599185 & i8) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (getpostalcode.write(i8 & 1, z2)) {
                    if (i10 != 0) {
                        modifier4 = Modifier.Companion;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i4 != 0) {
                        scrollingLogicdoFlingAnimation2reverseScope1Serializer = onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 3).serializer(onKeyEventZmokQxo.RemoteActionCompatParcelizer(null, null, 15));
                    } else {
                        scrollingLogicdoFlingAnimation2reverseScope1Serializer = scrollingLogicdoFlingAnimation2reverseScope2;
                    }
                    if (i6 != 0) {
                        tapGestureDetectorKt3 = onKeyEventZmokQxo.write(null, 3).read(onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, (Alignment.Vertical) null, 15));
                    } else {
                        tapGestureDetectorKt3 = tapGestureDetectorKt2;
                    }
                    int i12 = i8 >> 3;
                    Transition transitionSerializer2 = requiredHeightInVpY3zN4default.serializer(Boolean.valueOf(z), "AnimatedVisibility", getpostalcode, (i12 & 14) | ((i8 >> 12) & 112), 0);
                    objComponentActivity = getpostalcode.ComponentActivity();
                    if (objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = EnterExitTransitionKt$expandIn$1.write;
                        getpostalcode.write(objComponentActivity);
                    }
                    IconCompatParcelizer(transitionSerializer2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, modifier4, scrollingLogicdoFlingAnimation2reverseScope1Serializer, tapGestureDetectorKt3, dragAndDropTargetModifierNode, getpostalcode, (i8 & 7168) | (i8 & 896) | 48 | (57344 & i8) | (i12 & 458752));
                    modifier3 = modifier4;
                    scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope1Serializer;
                    str2 = "AnimatedVisibility";
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    str2 = str;
                    modifier3 = modifier2;
                    scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope2;
                    tapGestureDetectorKt3 = tapGestureDetectorKt2;
                }
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new NonTouchScrollingLogic(z, modifier3, scrollingLogicdoFlingAnimation2reverseScope3, tapGestureDetectorKt3, str2, dragAndDropTargetModifierNode, i, i2, 1);
                }
            }
            i3 |= 3072;
            scrollingLogicdoFlingAnimation2reverseScope2 = scrollingLogicdoFlingAnimation2reverseScope1;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    tapGestureDetectorKt2 = tapGestureDetectorKt;
                    if (getpostalcode.read(tapGestureDetectorKt2)) {
                        i7 = Fields.Clip;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i3 | 196608;
                if ((1572864 & i) == 0) {
                    if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                        i9 = 1048576;
                    } else {
                        i9 = Fields.BlendMode;
                    }
                    i8 |= i9;
                }
                if ((599185 & i8) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (getpostalcode.write(i8 & 1, z2)) {
                    if (i10 != 0) {
                        modifier4 = Modifier.Companion;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i4 != 0) {
                        scrollingLogicdoFlingAnimation2reverseScope1Serializer = onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 3).serializer(onKeyEventZmokQxo.RemoteActionCompatParcelizer(null, null, 15));
                    } else {
                        scrollingLogicdoFlingAnimation2reverseScope1Serializer = scrollingLogicdoFlingAnimation2reverseScope2;
                    }
                    if (i6 != 0) {
                        tapGestureDetectorKt3 = onKeyEventZmokQxo.write(null, 3).read(onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, (Alignment.Vertical) null, 15));
                    } else {
                        tapGestureDetectorKt3 = tapGestureDetectorKt2;
                    }
                    int i13 = i8 >> 3;
                    Transition transitionSerializer3 = requiredHeightInVpY3zN4default.serializer(Boolean.valueOf(z), "AnimatedVisibility", getpostalcode, (i13 & 14) | ((i8 >> 12) & 112), 0);
                    objComponentActivity = getpostalcode.ComponentActivity();
                    if (objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = EnterExitTransitionKt$expandIn$1.write;
                        getpostalcode.write(objComponentActivity);
                    }
                    IconCompatParcelizer(transitionSerializer3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, modifier4, scrollingLogicdoFlingAnimation2reverseScope1Serializer, tapGestureDetectorKt3, dragAndDropTargetModifierNode, getpostalcode, (i8 & 7168) | (i8 & 896) | 48 | (57344 & i8) | (i13 & 458752));
                    modifier3 = modifier4;
                    scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope1Serializer;
                    str2 = "AnimatedVisibility";
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    str2 = str;
                    modifier3 = modifier2;
                    scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope2;
                    tapGestureDetectorKt3 = tapGestureDetectorKt2;
                }
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new NonTouchScrollingLogic(z, modifier3, scrollingLogicdoFlingAnimation2reverseScope3, tapGestureDetectorKt3, str2, dragAndDropTargetModifierNode, i, i2, 1);
                }
            }
            i3 |= 24576;
            tapGestureDetectorKt2 = tapGestureDetectorKt;
            i8 = i3 | 196608;
            if ((1572864 & i) == 0) {
                if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                    i9 = 1048576;
                } else {
                    i9 = Fields.BlendMode;
                }
                i8 |= i9;
            }
            if ((599185 & i8) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (getpostalcode.write(i8 & 1, z2)) {
                if (i10 != 0) {
                    modifier4 = Modifier.Companion;
                } else {
                    modifier4 = modifier2;
                }
                if (i4 != 0) {
                    scrollingLogicdoFlingAnimation2reverseScope1Serializer = onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 3).serializer(onKeyEventZmokQxo.RemoteActionCompatParcelizer(null, null, 15));
                } else {
                    scrollingLogicdoFlingAnimation2reverseScope1Serializer = scrollingLogicdoFlingAnimation2reverseScope2;
                }
                if (i6 != 0) {
                    tapGestureDetectorKt3 = onKeyEventZmokQxo.write(null, 3).read(onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, (Alignment.Vertical) null, 15));
                } else {
                    tapGestureDetectorKt3 = tapGestureDetectorKt2;
                }
                int i14 = i8 >> 3;
                Transition transitionSerializer4 = requiredHeightInVpY3zN4default.serializer(Boolean.valueOf(z), "AnimatedVisibility", getpostalcode, (i14 & 14) | ((i8 >> 12) & 112), 0);
                objComponentActivity = getpostalcode.ComponentActivity();
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = EnterExitTransitionKt$expandIn$1.write;
                    getpostalcode.write(objComponentActivity);
                }
                IconCompatParcelizer(transitionSerializer4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, modifier4, scrollingLogicdoFlingAnimation2reverseScope1Serializer, tapGestureDetectorKt3, dragAndDropTargetModifierNode, getpostalcode, (i8 & 7168) | (i8 & 896) | 48 | (57344 & i8) | (i14 & 458752));
                modifier3 = modifier4;
                scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope1Serializer;
                str2 = "AnimatedVisibility";
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                str2 = str;
                modifier3 = modifier2;
                scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope2;
                tapGestureDetectorKt3 = tapGestureDetectorKt2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new NonTouchScrollingLogic(z, modifier3, scrollingLogicdoFlingAnimation2reverseScope3, tapGestureDetectorKt3, str2, dragAndDropTargetModifierNode, i, i2, 1);
            }
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                scrollingLogicdoFlingAnimation2reverseScope2 = scrollingLogicdoFlingAnimation2reverseScope1;
                if (getpostalcode.read(scrollingLogicdoFlingAnimation2reverseScope2)) {
                    i5 = Fields.CameraDistance;
                } else {
                    i5 = Fields.RotationZ;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    tapGestureDetectorKt2 = tapGestureDetectorKt;
                    if (getpostalcode.read(tapGestureDetectorKt2)) {
                        i7 = Fields.Clip;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i3 | 196608;
                if ((1572864 & i) == 0) {
                    if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                        i9 = 1048576;
                    } else {
                        i9 = Fields.BlendMode;
                    }
                    i8 |= i9;
                }
                if ((599185 & i8) != 599184) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (getpostalcode.write(i8 & 1, z2)) {
                    if (i10 != 0) {
                        modifier4 = Modifier.Companion;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i4 != 0) {
                        scrollingLogicdoFlingAnimation2reverseScope1Serializer = onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 3).serializer(onKeyEventZmokQxo.RemoteActionCompatParcelizer(null, null, 15));
                    } else {
                        scrollingLogicdoFlingAnimation2reverseScope1Serializer = scrollingLogicdoFlingAnimation2reverseScope2;
                    }
                    if (i6 != 0) {
                        tapGestureDetectorKt3 = onKeyEventZmokQxo.write(null, 3).read(onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, (Alignment.Vertical) null, 15));
                    } else {
                        tapGestureDetectorKt3 = tapGestureDetectorKt2;
                    }
                    int i15 = i8 >> 3;
                    Transition transitionSerializer5 = requiredHeightInVpY3zN4default.serializer(Boolean.valueOf(z), "AnimatedVisibility", getpostalcode, (i15 & 14) | ((i8 >> 12) & 112), 0);
                    objComponentActivity = getpostalcode.ComponentActivity();
                    if (objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = EnterExitTransitionKt$expandIn$1.write;
                        getpostalcode.write(objComponentActivity);
                    }
                    IconCompatParcelizer(transitionSerializer5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, modifier4, scrollingLogicdoFlingAnimation2reverseScope1Serializer, tapGestureDetectorKt3, dragAndDropTargetModifierNode, getpostalcode, (i8 & 7168) | (i8 & 896) | 48 | (57344 & i8) | (i15 & 458752));
                    modifier3 = modifier4;
                    scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope1Serializer;
                    str2 = "AnimatedVisibility";
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    str2 = str;
                    modifier3 = modifier2;
                    scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope2;
                    tapGestureDetectorKt3 = tapGestureDetectorKt2;
                }
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new NonTouchScrollingLogic(z, modifier3, scrollingLogicdoFlingAnimation2reverseScope3, tapGestureDetectorKt3, str2, dragAndDropTargetModifierNode, i, i2, 1);
                }
            }
            i3 |= 24576;
            tapGestureDetectorKt2 = tapGestureDetectorKt;
            i8 = i3 | 196608;
            if ((1572864 & i) == 0) {
                if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                    i9 = 1048576;
                } else {
                    i9 = Fields.BlendMode;
                }
                i8 |= i9;
            }
            if ((599185 & i8) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (getpostalcode.write(i8 & 1, z2)) {
                if (i10 != 0) {
                    modifier4 = Modifier.Companion;
                } else {
                    modifier4 = modifier2;
                }
                if (i4 != 0) {
                    scrollingLogicdoFlingAnimation2reverseScope1Serializer = onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 3).serializer(onKeyEventZmokQxo.RemoteActionCompatParcelizer(null, null, 15));
                } else {
                    scrollingLogicdoFlingAnimation2reverseScope1Serializer = scrollingLogicdoFlingAnimation2reverseScope2;
                }
                if (i6 != 0) {
                    tapGestureDetectorKt3 = onKeyEventZmokQxo.write(null, 3).read(onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, (Alignment.Vertical) null, 15));
                } else {
                    tapGestureDetectorKt3 = tapGestureDetectorKt2;
                }
                int i16 = i8 >> 3;
                Transition transitionSerializer6 = requiredHeightInVpY3zN4default.serializer(Boolean.valueOf(z), "AnimatedVisibility", getpostalcode, (i16 & 14) | ((i8 >> 12) & 112), 0);
                objComponentActivity = getpostalcode.ComponentActivity();
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = EnterExitTransitionKt$expandIn$1.write;
                    getpostalcode.write(objComponentActivity);
                }
                IconCompatParcelizer(transitionSerializer6, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, modifier4, scrollingLogicdoFlingAnimation2reverseScope1Serializer, tapGestureDetectorKt3, dragAndDropTargetModifierNode, getpostalcode, (i8 & 7168) | (i8 & 896) | 48 | (57344 & i8) | (i16 & 458752));
                modifier3 = modifier4;
                scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope1Serializer;
                str2 = "AnimatedVisibility";
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                str2 = str;
                modifier3 = modifier2;
                scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope2;
                tapGestureDetectorKt3 = tapGestureDetectorKt2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new NonTouchScrollingLogic(z, modifier3, scrollingLogicdoFlingAnimation2reverseScope3, tapGestureDetectorKt3, str2, dragAndDropTargetModifierNode, i, i2, 1);
            }
        }
        i3 |= 3072;
        scrollingLogicdoFlingAnimation2reverseScope2 = scrollingLogicdoFlingAnimation2reverseScope1;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                tapGestureDetectorKt2 = tapGestureDetectorKt;
                if (getpostalcode.read(tapGestureDetectorKt2)) {
                    i7 = Fields.Clip;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i3 | 196608;
            if ((1572864 & i) == 0) {
                if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                    i9 = 1048576;
                } else {
                    i9 = Fields.BlendMode;
                }
                i8 |= i9;
            }
            if ((599185 & i8) != 599184) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (getpostalcode.write(i8 & 1, z2)) {
                if (i10 != 0) {
                    modifier4 = Modifier.Companion;
                } else {
                    modifier4 = modifier2;
                }
                if (i4 != 0) {
                    scrollingLogicdoFlingAnimation2reverseScope1Serializer = onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 3).serializer(onKeyEventZmokQxo.RemoteActionCompatParcelizer(null, null, 15));
                } else {
                    scrollingLogicdoFlingAnimation2reverseScope1Serializer = scrollingLogicdoFlingAnimation2reverseScope2;
                }
                if (i6 != 0) {
                    tapGestureDetectorKt3 = onKeyEventZmokQxo.write(null, 3).read(onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, (Alignment.Vertical) null, 15));
                } else {
                    tapGestureDetectorKt3 = tapGestureDetectorKt2;
                }
                int i17 = i8 >> 3;
                Transition transitionSerializer7 = requiredHeightInVpY3zN4default.serializer(Boolean.valueOf(z), "AnimatedVisibility", getpostalcode, (i17 & 14) | ((i8 >> 12) & 112), 0);
                objComponentActivity = getpostalcode.ComponentActivity();
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = EnterExitTransitionKt$expandIn$1.write;
                    getpostalcode.write(objComponentActivity);
                }
                IconCompatParcelizer(transitionSerializer7, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, modifier4, scrollingLogicdoFlingAnimation2reverseScope1Serializer, tapGestureDetectorKt3, dragAndDropTargetModifierNode, getpostalcode, (i8 & 7168) | (i8 & 896) | 48 | (57344 & i8) | (i17 & 458752));
                modifier3 = modifier4;
                scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope1Serializer;
                str2 = "AnimatedVisibility";
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                str2 = str;
                modifier3 = modifier2;
                scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope2;
                tapGestureDetectorKt3 = tapGestureDetectorKt2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new NonTouchScrollingLogic(z, modifier3, scrollingLogicdoFlingAnimation2reverseScope3, tapGestureDetectorKt3, str2, dragAndDropTargetModifierNode, i, i2, 1);
            }
        }
        i3 |= 24576;
        tapGestureDetectorKt2 = tapGestureDetectorKt;
        i8 = i3 | 196608;
        if ((1572864 & i) == 0) {
            if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                i9 = 1048576;
            } else {
                i9 = Fields.BlendMode;
            }
            i8 |= i9;
        }
        if ((599185 & i8) != 599184) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (getpostalcode.write(i8 & 1, z2)) {
            if (i10 != 0) {
                modifier4 = Modifier.Companion;
            } else {
                modifier4 = modifier2;
            }
            if (i4 != 0) {
                scrollingLogicdoFlingAnimation2reverseScope1Serializer = onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 3).serializer(onKeyEventZmokQxo.RemoteActionCompatParcelizer(null, null, 15));
            } else {
                scrollingLogicdoFlingAnimation2reverseScope1Serializer = scrollingLogicdoFlingAnimation2reverseScope2;
            }
            if (i6 != 0) {
                tapGestureDetectorKt3 = onKeyEventZmokQxo.write(null, 3).read(onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, (Alignment.Vertical) null, 15));
            } else {
                tapGestureDetectorKt3 = tapGestureDetectorKt2;
            }
            int i18 = i8 >> 3;
            Transition transitionSerializer8 = requiredHeightInVpY3zN4default.serializer(Boolean.valueOf(z), "AnimatedVisibility", getpostalcode, (i18 & 14) | ((i8 >> 12) & 112), 0);
            objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = EnterExitTransitionKt$expandIn$1.write;
                getpostalcode.write(objComponentActivity);
            }
            IconCompatParcelizer(transitionSerializer8, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, modifier4, scrollingLogicdoFlingAnimation2reverseScope1Serializer, tapGestureDetectorKt3, dragAndDropTargetModifierNode, getpostalcode, (i8 & 7168) | (i8 & 896) | 48 | (57344 & i8) | (i18 & 458752));
            modifier3 = modifier4;
            scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope1Serializer;
            str2 = "AnimatedVisibility";
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            str2 = str;
            modifier3 = modifier2;
            scrollingLogicdoFlingAnimation2reverseScope3 = scrollingLogicdoFlingAnimation2reverseScope2;
            tapGestureDetectorKt3 = tapGestureDetectorKt2;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new NonTouchScrollingLogic(z, modifier3, scrollingLogicdoFlingAnimation2reverseScope3, tapGestureDetectorKt3, str2, dragAndDropTargetModifierNode, i, i2, 1);
        }
    }

    public static final accesssemanticsScrollByd4ec7I IconCompatParcelizer(Transition transition, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Object obj, getBirthDateFull getbirthdatefull) {
        accesssemanticsScrollByd4ec7I accesssemanticsscrollbyd4ec7i;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.RemoteActionCompatParcelizer(-422486745, transition);
        boolean zSerializer = transition.serializer();
        TransitionState transitionState = transition.MediaSessionCompatToken;
        if (zSerializer) {
            getpostalcode.serializer(-212166497);
            getpostalcode.IconCompatParcelizer(false);
            if (((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj)).booleanValue()) {
                accesssemanticsscrollbyd4ec7i = accesssemanticsScrollByd4ec7I.Visible;
            } else {
                accesssemanticsscrollbyd4ec7i = ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(transitionState.IconCompatParcelizer())).booleanValue() ? accesssemanticsScrollByd4ec7I.PostExit : accesssemanticsScrollByd4ec7I.PreEnter;
            }
        } else {
            getpostalcode.serializer(-211892364);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                getpostalcode.write(objComponentActivity);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity;
            if (((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(transitionState.IconCompatParcelizer())).booleanValue()) {
                populateViewStructure_androidKtpopulate7.setValue(Boolean.TRUE);
            }
            if (((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(obj)).booleanValue()) {
                accesssemanticsscrollbyd4ec7i = accesssemanticsScrollByd4ec7I.Visible;
            } else {
                accesssemanticsscrollbyd4ec7i = ((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue() ? accesssemanticsScrollByd4ec7I.PostExit : accesssemanticsScrollByd4ec7I.PreEnter;
            }
            getpostalcode.IconCompatParcelizer(false);
        }
        getpostalcode.IconCompatParcelizer(false);
        return accesssemanticsscrollbyd4ec7i;
    }

    public static final void IconCompatParcelizer(final Transition transition, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1, TapGestureDetectorKt tapGestureDetectorKt, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1706321816);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(transition) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.read(scrollingLogicdoFlingAnimation2reverseScope1) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.read(tapGestureDetectorKt) ? Fields.Clip : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? Fields.RenderEffect : 65536;
        }
        if (getpostalcode.write(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            int i4 = i2 & 14;
            boolean z2 = i4 == 4;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if ((z | z2) || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1
                    /* JADX WARN: Code duplicated, block: B:7:0x003b  */
                    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        long jM3839constructorimpl;
                        MeasureScope measureScope = (MeasureScope) obj;
                        Placeable placeableMo2209measureBRTryo0 = ((Measurable) obj2).mo2209measureBRTryo0(((Constraints) obj3).m3632unboximpl());
                        if (measureScope.isLookingAhead()) {
                            if (((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(((onShowTranslationui) transition.MediaBrowserCompatMediaItem).getValue())).booleanValue()) {
                                jM3839constructorimpl = IntSize.m3839constructorimpl((((long) placeableMo2209measureBRTryo0.getWidth()) << 32) | (((long) placeableMo2209measureBRTryo0.getHeight()) & 4294967295L));
                            } else {
                                jM3839constructorimpl = IntSize.Companion.m3849getZeroYbymL2g();
                            }
                        } else {
                            jM3839constructorimpl = IntSize.m3839constructorimpl((((long) placeableMo2209measureBRTryo0.getWidth()) << 32) | (((long) placeableMo2209measureBRTryo0.getHeight()) & 4294967295L));
                        }
                        return MeasureScope.layout$default(measureScope, (int) (jM3839constructorimpl >> 32), (int) (4294967295L & jM3839constructorimpl), null, new MouseWheelScrollingLogicKt(placeableMo2209measureBRTryo0), 4, null);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }
                };
                getpostalcode.write(objComponentActivity);
            }
            Modifier modifierLayout = LayoutModifierKt.layout(modifier, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = userScrollfoundation.RemoteActionCompatParcelizer;
                getpostalcode.write(objComponentActivity2);
            }
            AnimatedEnterExitImpl(transition, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifierLayout, scrollingLogicdoFlingAnimation2reverseScope1, tapGestureDetectorKt, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity2, dragAndDropTargetModifierNode, getpostalcode, i4 | 196608 | i3 | (i2 & 7168) | (57344 & i2) | ((i2 << 6) & 29360128));
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new IndirectPointerInputDragCycleDetectorKt(transition, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier, scrollingLogicdoFlingAnimation2reverseScope1, tapGestureDetectorKt, dragAndDropTargetModifierNode, i);
        }
    }

    public static final void AnimatedEnterExitImpl(Transition transition, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1, TapGestureDetectorKt tapGestureDetectorKt, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1912839215);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(transition) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.read(scrollingLogicdoFlingAnimation2reverseScope1) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.read(tapGestureDetectorKt) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? Fields.RenderEffect : 65536;
        }
        int i3 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode) ? 8388608 : 4194304;
        }
        int i4 = i3;
        if (getpostalcode.write(i4 & 1, (i4 & 4793491) != 4793490)) {
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = transition.MediaBrowserCompatMediaItem;
            TransitionState transitionState = transition.MediaSessionCompatToken;
            if (!((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(((onShowTranslationui) populateViewStructure_androidKtpopulate7).getValue())).booleanValue() && !((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(transitionState.IconCompatParcelizer())).booleanValue() && !transition.serializer() && !transition.getHasInitialValueAnimations()) {
                getpostalcode.serializer(-229362829);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-232386135);
                int i5 = i4 & 14;
                int i6 = i5 | 48;
                int i7 = i6 & 14;
                boolean z2 = ((i7 ^ 6) > 4 && getpostalcode.read(transition)) || (i6 & 6) == 4;
                Object objComponentActivity = getpostalcode.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (z2 || objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = transitionState.IconCompatParcelizer();
                    getpostalcode.write(objComponentActivity);
                }
                if (transition.serializer()) {
                    objComponentActivity = transitionState.IconCompatParcelizer();
                }
                getpostalcode.serializer(1844425648);
                accesssemanticsScrollByd4ec7I accesssemanticsscrollbyd4ec7iIconCompatParcelizer = IconCompatParcelizer(transition, r8lambdaunavo3sxub_pc9xroryotnrlvsm, objComponentActivity, getpostalcode);
                getpostalcode.IconCompatParcelizer(false);
                Object value = ((onShowTranslationui) transition.MediaBrowserCompatMediaItem).getValue();
                getpostalcode.serializer(1844425648);
                accesssemanticsScrollByd4ec7I accesssemanticsscrollbyd4ec7iIconCompatParcelizer2 = IconCompatParcelizer(transition, r8lambdaunavo3sxub_pc9xroryotnrlvsm, value, getpostalcode);
                getpostalcode.IconCompatParcelizer(false);
                int i8 = i7 | 3072;
                int i9 = (i8 & 14) ^ 6;
                boolean z3 = (i9 > 4 && getpostalcode.read(transition)) || (i8 & 6) == 4;
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (z3 || objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new Transition(new BoxKt(accesssemanticsscrollbyd4ec7iIconCompatParcelizer), transition, ff$$ExternalSyntheticOutline0.m(new StringBuilder(), transition.write, " > EnterExitTransition"));
                    getpostalcode.write(objComponentActivity2);
                }
                Transition transition2 = (Transition) objComponentActivity2;
                boolean z4 = (i9 > 4 && getpostalcode.read(transition)) || (i8 & 6) == 4;
                boolean z5 = getpostalcode.read(transition2);
                Object objComponentActivity3 = getpostalcode.ComponentActivity();
                if ((z4 | z5) || objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new Recomposer$$ExternalSyntheticLambda4(transition, 3, transition2);
                    getpostalcode.write(objComponentActivity3);
                }
                getPhoneNumberNational.serializer(transition2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, getpostalcode);
                if (transition.serializer()) {
                    transition2.seek(transition.MediaSessionCompatQueueItem, accesssemanticsscrollbyd4ec7iIconCompatParcelizer, accesssemanticsscrollbyd4ec7iIconCompatParcelizer2);
                } else {
                    transition2.updateTarget$animation_core(accesssemanticsscrollbyd4ec7iIconCompatParcelizer2);
                    ((onShowTranslationui) transition2.IconCompatParcelizer).setValue(Boolean.FALSE);
                }
                ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1RemoteActionCompatParcelizer = onKeyEventZmokQxo.RemoteActionCompatParcelizer(transition2, scrollingLogicdoFlingAnimation2reverseScope1, getpostalcode, (i4 >> 6) & 112);
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8 = transition2.MediaBrowserCompatMediaItem;
                TransitionState transitionState2 = transition2.MediaSessionCompatToken;
                TapGestureDetectorKt tapGestureDetectorKt2 = onKeyEventZmokQxo.read(transition2, tapGestureDetectorKt, getpostalcode, (i4 >> 9) & 112);
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Serializer = CompositionKt.serializer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getpostalcode);
                onShowTranslationui onshowtranslationui = (onShowTranslationui) populateViewStructure_androidKtpopulate8;
                Object objInvoke = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(transitionState2.IconCompatParcelizer(), onshowtranslationui.getValue());
                boolean z6 = getpostalcode.read(transition2);
                boolean z7 = getpostalcode.read(populateViewStructure_androidKtpopulate7Serializer);
                Object objComponentActivity4 = getpostalcode.ComponentActivity();
                ShortNewsContentCardView shortNewsContentCardView = null;
                if ((z6 | z7) || objComponentActivity4 == androidContentCaptureManager) {
                    objComponentActivity4 = new AsyncImagePainter$launchJob$1(transition2, populateViewStructure_androidKtpopulate7Serializer, shortNewsContentCardView, 1);
                    getpostalcode.write(objComponentActivity4);
                }
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity4;
                Object objComponentActivity5 = getpostalcode.ComponentActivity();
                if (objComponentActivity5 == androidContentCaptureManager) {
                    objComponentActivity5 = CompositionKt.RemoteActionCompatParcelizer(objInvoke);
                    getpostalcode.write(objComponentActivity5);
                }
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate9 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity5;
                boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1);
                Object objComponentActivity6 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer || objComponentActivity6 == androidContentCaptureManager) {
                    objComponentActivity6 = new SnapshotStateKt__ProduceStateKt$produceState$1$1(r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, populateViewStructure_androidKtpopulate9, null, 0);
                    getpostalcode.write(objComponentActivity6);
                }
                getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, createFromParcel.INSTANCE, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity6);
                Object objIconCompatParcelizer = transitionState2.IconCompatParcelizer();
                accesssemanticsScrollByd4ec7I accesssemanticsscrollbyd4ec7i = accesssemanticsScrollByd4ec7I.PostExit;
                if (objIconCompatParcelizer == accesssemanticsscrollbyd4ec7i && onshowtranslationui.getValue() == accesssemanticsscrollbyd4ec7i && ((Boolean) populateViewStructure_androidKtpopulate9.getValue()).booleanValue()) {
                    getpostalcode.serializer(-229368781);
                    getpostalcode.IconCompatParcelizer(false);
                    z = false;
                } else {
                    getpostalcode.serializer(-230699766);
                    boolean z8 = i5 == 4;
                    Object objComponentActivity7 = getpostalcode.ComponentActivity();
                    if (z8 || objComponentActivity7 == androidContentCaptureManager) {
                        objComponentActivity7 = new ScrollExtensionsKt(transition2);
                        getpostalcode.write(objComponentActivity7);
                    }
                    ScrollExtensionsKt scrollExtensionsKt = (ScrollExtensionsKt) objComponentActivity7;
                    z = false;
                    Modifier modifierRemoteActionCompatParcelizer = onKeyEventZmokQxo.RemoteActionCompatParcelizer(transition2, scrollingLogicdoFlingAnimation2reverseScope1RemoteActionCompatParcelizer, tapGestureDetectorKt2, "Built-in", getpostalcode, 199680, 8);
                    getpostalcode.serializer(-7404393);
                    getpostalcode.IconCompatParcelizer(false);
                    Modifier modifierThen = modifier.then(modifierRemoteActionCompatParcelizer.then(Modifier.Companion));
                    Object objComponentActivity8 = getpostalcode.ComponentActivity();
                    if (objComponentActivity8 == androidContentCaptureManager) {
                        objComponentActivity8 = new AnimatedEnterExitMeasurePolicy(scrollExtensionsKt);
                        getpostalcode.write(objComponentActivity8);
                    }
                    AnimatedEnterExitMeasurePolicy animatedEnterExitMeasurePolicy = (AnimatedEnterExitMeasurePolicy) objComponentActivity8;
                    int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen);
                    ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
                    if (getpostalcode.read != null) {
                        getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode.ComponentActivity) {
                            getpostalcode.serializer(constructor);
                        } else {
                            getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, animatedEnterExitMeasurePolicy, companion.getSetMeasurePolicy());
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer, companion.getSetResolvedCompositionLocals());
                        AndroidContentCaptureManagerCompanion.RemoteActionCompatParcelizer(getpostalcode, Integer.valueOf(iHashCode), companion.getSetCompositeKeyHash());
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, companion.getApplyOnDeactivatedNodeAssertion());
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, companion.getSetModifier());
                        dragAndDropTargetModifierNode.invoke(scrollExtensionsKt, getpostalcode, Integer.valueOf((i4 >> 18) & 112));
                        getpostalcode.IconCompatParcelizer(true);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        SentryUUID.write();
                        throw null;
                    }
                }
                getpostalcode.IconCompatParcelizer(z);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new MouseWheelScrollingLogicdispatchMouseWheelScroll3(transition, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier, scrollingLogicdoFlingAnimation2reverseScope1, tapGestureDetectorKt, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, dragAndDropTargetModifierNode, i);
        }
    }
}
