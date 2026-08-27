package androidx.compose.material3.pulltorefresh;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.MultiParagraph$$ExternalSyntheticLambda0;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.CoroutineLiveData$$ExternalSyntheticLambda0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AutofillApi27Helper;
import o.AutofillModifierKtcontentType1;
import o.AutofillNode;
import o.AutofillTree;
import o.AwaitFirstLayoutModifier;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.InlineChildren;
import o.RemoteActionCompatParcelizer;
import o.TapGestureDetectorKtprocessTapGestureresetJob1;
import o.accessgetMediumcp;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getEventType;
import o.getHandleruiannotations;
import o.getOnFill;
import o.getPostalCode;
import o.isText;
import o.onViewAttachedToWindow;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.removeNodeAtDepth;
import o.resolvePointerPrecision;
import o.setFocused;

/* JADX INFO: loaded from: classes.dex */
public abstract class PullToRefreshKt {
    public static final float MediaBrowserCompatMediaItem = Dp.m3673constructorimpl(2.5f);
    public static final float serializer = Dp.m3673constructorimpl(5.5f);
    public static final float read = Dp.m3673constructorimpl(16.0f);
    public static final float IconCompatParcelizer = Dp.m3673constructorimpl(40.0f);
    public static final float RemoteActionCompatParcelizer = Dp.m3673constructorimpl(10.0f);
    public static final float write = Dp.m3673constructorimpl(5.0f);

    public static final getOnFill RemoteActionCompatParcelizer(getBirthDateFull getbirthdatefull) {
        Object[] objArr = new Object[0];
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        Object objComponentActivity = getpostalcode.ComponentActivity();
        if (objComponentActivity == getCreditCardExpirationMonth.write) {
            objComponentActivity = new RemoteActionCompatParcelizer(20);
            getpostalcode.write(objComponentActivity);
        }
        return (getOnFill) getEventType.RemoteActionCompatParcelizer(objArr, getOnFill.RemoteActionCompatParcelizer, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 384);
    }

    public static final void IconCompatParcelizer(isText istext, long j, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Object obj;
        boolean zIconCompatParcelizer;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1353562852);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode.read(istext);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(istext);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.serializer(j) ? 32 : 16;
        }
        int i3 = i2;
        if (getpostalcode.write(i3 & 1, (i3 & 19) != 18)) {
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                obj = objComponentActivity;
                Path Path = AndroidPath_androidKt.Path();
                Path.mo612setFillTypeoQ8Xj4U(PathFillType.Companion.m1021getEvenOddRgk1Os());
                getpostalcode.write(Path);
                obj = Path;
            }
            obj = objComponentActivity;
            Path path = (Path) obj;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = CompositionKt.serializer(new CoroutineLiveData$$ExternalSyntheticLambda0(21, istext));
                getpostalcode.write(objComponentActivity2);
            }
            onViewAttachedToWindow onviewattachedtowindowIconCompatParcelizer = TapGestureDetectorKtprocessTapGestureresetJob1.IconCompatParcelizer(((Number) ((onViewAttachedToWindow) objComponentActivity2).getValue()).floatValue(), resolvePointerPrecision.serializer(AutofillTree.DefaultEffects, getpostalcode), null, null, getpostalcode, 0, 28);
            Modifier.Companion companion = Modifier.Companion;
            int i4 = i3 & 14;
            boolean z = i4 == 4 || ((i3 & 8) != 0 && getpostalcode.IconCompatParcelizer(istext));
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (z || objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new InlineChildren(23, istext);
                getpostalcode.write(objComponentActivity3);
            }
            Modifier modifierM83size3ABfNKs = SizeKt.m83size3ABfNKs(SemanticsModifierKt.clearAndSetSemantics(companion, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3), read);
            boolean z2 = i4 == 4 || ((i3 & 8) != 0 && getpostalcode.IconCompatParcelizer(istext));
            boolean z3 = getpostalcode.read(onviewattachedtowindowIconCompatParcelizer);
            boolean z4 = (i3 & 112) == 32;
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(path);
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if ((z2 | z3 | z4 | zIconCompatParcelizer2) || objComponentActivity4 == androidContentCaptureManager) {
                MultiParagraph$$ExternalSyntheticLambda0 multiParagraph$$ExternalSyntheticLambda0 = new MultiParagraph$$ExternalSyntheticLambda0(istext, onviewattachedtowindowIconCompatParcelizer, j, path, 2);
                getpostalcode.write(multiParagraph$$ExternalSyntheticLambda0);
                objComponentActivity4 = multiParagraph$$ExternalSyntheticLambda0;
            }
            AwaitFirstLayoutModifier.serializer(modifierM83size3ABfNKs, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4, getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new setFocused(istext, j, i);
        }
    }

    /* JADX INFO: renamed from: drawArrow-uDrxG_w, reason: not valid java name */
    public static final void m137drawArrowuDrxG_w(DrawScope drawScope, Path path, Rect rect, long j, float f, AutofillApi27Helper autofillApi27Helper, float f2) {
        path.reset();
        path.moveTo(0.0f, 0.0f);
        float f3 = RemoteActionCompatParcelizer;
        float fMo48toPx0680j_4 = drawScope.mo48toPx0680j_4(f3);
        float f4 = autofillApi27Helper.serializer;
        path.lineTo((fMo48toPx0680j_4 * f4) / 2.0f, drawScope.mo48toPx0680j_4(write) * f4);
        path.lineTo(drawScope.mo48toPx0680j_4(f3) * f4, 0.0f);
        float fMin = Math.min(rect.getRight() - rect.getLeft(), rect.getBottom() - rect.getTop()) / 2.0f;
        float fMo48toPx0680j_5 = (drawScope.mo48toPx0680j_4(f3) * f4) / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (rect.m507getCenterF1C5BW0() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (rect.m507getCenterF1C5BW0() & 4294967295L));
        float fMo48toPx0680j_6 = drawScope.mo48toPx0680j_4(f2);
        path.mo614translatek4lQ0M(Offset.m469constructorimpl((((long) Float.floatToRawIntBits((fIntBitsToFloat + fMin) - fMo48toPx0680j_5)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2 - fMo48toPx0680j_6)) & 4294967295L)));
        float f5 = autofillApi27Helper.RemoteActionCompatParcelizer;
        float fMo48toPx0680j_7 = drawScope.mo48toPx0680j_4(f2);
        long jMo1303getCenterF1C5BW0 = drawScope.mo1303getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo1231rotateUv8p0NA(f5 - fMo48toPx0680j_7, jMo1303getCenterF1C5BW0);
            DrawScope.m1294drawPathLG529CI$default(drawScope, path, j, f, new Stroke(drawScope.mo48toPx0680j_4(f2), 0.0f, 0, 0, null, 30, null), null, 0, 48, null);
        } finally {
            c8$$ExternalSyntheticOutline0.m(drawContext, jMo1225getSizeNHjbRc);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x0107  */
    /* JADX WARN: Code duplicated, block: B:79:0x010e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0112  */
    /* JADX WARN: Code duplicated, block: B:83:0x011d  */
    /* JADX WARN: Code duplicated, block: B:85:0x014b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0179  */
    /* JADX WARN: Code duplicated, block: B:89:0x017e  */
    /* JADX WARN: Code duplicated, block: B:92:0x018b  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public static final void PullToRefreshBox(boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getOnFill getonfill, Alignment alignment, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        getOnFill getonfillRemoteActionCompatParcelizer;
        Alignment alignment2;
        int i4;
        boolean z2;
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
        getOnFill getonfill2;
        Alignment alignment3;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        Alignment topStart;
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnryWrite;
        MeasurePolicy measurePolicy;
        int iSerializer;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer;
        Modifier modifierMaterializeModifier;
        ComposeUiNode.Companion companion;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M;
        int i5;
        int i6;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-532332839);
        if ((i & 6) == 0) {
            i3 = (getpostalcode.write(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                getonfillRemoteActionCompatParcelizer = getonfill;
                if (getpostalcode.read(getonfillRemoteActionCompatParcelizer)) {
                    i6 = Fields.CameraDistance;
                }
                i3 |= i6;
            } else {
                getonfillRemoteActionCompatParcelizer = getonfill;
            }
            i6 = Fields.RotationZ;
            i3 |= i6;
        } else {
            getonfillRemoteActionCompatParcelizer = getonfill;
        }
        int i7 = i2 & 16;
        if (i7 == 0) {
            if ((i & 24576) == 0) {
                alignment2 = alignment;
                i3 |= getpostalcode.read(alignment2) ? Fields.Clip : 8192;
            }
            i4 = i3 | 196608;
            if ((1572864 & i) == 0) {
                if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                    i5 = 1048576;
                } else {
                    i5 = Fields.BlendMode;
                }
                i4 |= i5;
            }
            if ((599187 & i4) != 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (getpostalcode.write(i4 & 1, z2)) {
                getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                if ((i & 1) == 0 && !getpostalcode.PlaybackStateCompat()) {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    if ((i2 & 8) != 0) {
                        i4 &= -7169;
                    }
                    topStart = alignment2;
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnryWrite = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
                } else {
                    if ((i2 & 8) != 0) {
                        getonfillRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getpostalcode);
                        i4 &= -7169;
                    }
                    if (i7 != 0) {
                        topStart = Alignment.Companion.getTopStart();
                    } else {
                        topStart = alignment2;
                    }
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnryWrite = ExtrasKt.write(1028036671, new AutofillNode(getonfillRemoteActionCompatParcelizer, z), getpostalcode);
                }
                getpostalcode.RemoteActionCompatParcelizer();
                Modifier modifierThen = modifier.then(new AutofillModifierKtcontentType1(z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getonfillRemoteActionCompatParcelizer, PullToRefreshDefaults.read));
                measurePolicy = BoxKt.read(topStart, false);
                iSerializer = SentryUUID.serializer(getpostalcode);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen);
                companion = ComposeUiNode.Companion;
                constructor = companion.getConstructor();
                if (getpostalcode.read != null) {
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    if (!getpostalcode.ComponentActivity) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                            c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                        }
                    } else {
                        c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                    }
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, companion.getSetModifier());
                    Object obj = BoxScopeInstance.serializer;
                    dragAndDropTargetModifierNode.invoke(obj, getpostalcode, Integer.valueOf(((i4 >> 15) & 112) | 6));
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnryWrite.invoke(obj, getpostalcode, Integer.valueOf(((i4 >> 12) & 112) | 6));
                    getpostalcode.IconCompatParcelizer(true);
                    getonfill2 = getonfillRemoteActionCompatParcelizer;
                    alignment3 = topStart;
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnryWrite;
                } else {
                    SentryUUID.write();
                    throw null;
                }
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
                getonfill2 = getonfillRemoteActionCompatParcelizer;
                alignment3 = alignment2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetMediumcp(z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, getonfill2, alignment3, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, dragAndDropTargetModifierNode, i, i2);
            }
        }
        i3 |= 24576;
        alignment2 = alignment;
        i4 = i3 | 196608;
        if ((1572864 & i) == 0) {
            if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                i5 = 1048576;
            } else {
                i5 = Fields.BlendMode;
            }
            i4 |= i5;
        }
        if ((599187 & i4) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (getpostalcode.write(i4 & 1, z2)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) == 0) {
                if ((i2 & 8) != 0) {
                    getonfillRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getpostalcode);
                    i4 &= -7169;
                }
                if (i7 != 0) {
                    topStart = Alignment.Companion.getTopStart();
                } else {
                    topStart = alignment2;
                }
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnryWrite = ExtrasKt.write(1028036671, new AutofillNode(getonfillRemoteActionCompatParcelizer, z), getpostalcode);
            } else {
                if ((i2 & 8) != 0) {
                    getonfillRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(getpostalcode);
                    i4 &= -7169;
                }
                if (i7 != 0) {
                    topStart = Alignment.Companion.getTopStart();
                } else {
                    topStart = alignment2;
                }
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnryWrite = ExtrasKt.write(1028036671, new AutofillNode(getonfillRemoteActionCompatParcelizer, z), getpostalcode);
            }
            getpostalcode.RemoteActionCompatParcelizer();
            Modifier modifierThen2 = modifier.then(new AutofillModifierKtcontentType1(z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getonfillRemoteActionCompatParcelizer, PullToRefreshDefaults.read));
            measurePolicy = BoxKt.read(topStart, false);
            iSerializer = SentryUUID.serializer(getpostalcode);
            dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen2);
            companion = ComposeUiNode.Companion;
            constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M = m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                if (!getpostalcode.ComponentActivity) {
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                        c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                    }
                } else {
                    c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode, iSerializer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0M);
                }
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, companion.getSetModifier());
                Object obj2 = BoxScopeInstance.serializer;
                dragAndDropTargetModifierNode.invoke(obj2, getpostalcode, Integer.valueOf(((i4 >> 15) & 112) | 6));
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnryWrite.invoke(obj2, getpostalcode, Integer.valueOf(((i4 >> 12) & 112) | 6));
                getpostalcode.IconCompatParcelizer(true);
                getonfill2 = getonfillRemoteActionCompatParcelizer;
                alignment3 = topStart;
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnryWrite;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
            getonfill2 = getonfillRemoteActionCompatParcelizer;
            alignment3 = alignment2;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new accessgetMediumcp(z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, getonfill2, alignment3, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, dragAndDropTargetModifierNode, i, i2);
        }
    }
}
