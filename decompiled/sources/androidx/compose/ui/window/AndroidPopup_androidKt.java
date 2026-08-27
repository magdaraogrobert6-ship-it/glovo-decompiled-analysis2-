package androidx.compose.ui.window;

import android.graphics.Rect;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.GapComposer$CompositionContextImpl;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import io.sentry.SentryUUID;
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
import o.getPhoneNumber;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.hideTranslatedText;
import o.onViewAttachedToWindow;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidPopup_androidKt {
    private static final int PopupPropertiesBaseFlags = 262144;
    private static final ProvidableCompositionLocal LocalPopupTestTag = new getPhoneNumber(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$LocalPopupTestTag$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    });
    private static final ProvidableCompositionLocal LocalIsInPopupLayout = new getPhoneNumber(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$LocalIsInPopupLayout$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    });

    public static final ProvidableCompositionLocal getLocalIsInPopupLayout() {
        return LocalIsInPopupLayout;
    }

    public static final ProvidableCompositionLocal getLocalPopupTestTag() {
        return LocalPopupTestTag;
    }

    private static final void SimpleStack(Modifier modifier, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        Object objComponentActivity = getpostalcode.ComponentActivity();
        if (objComponentActivity == getCreditCardExpirationMonth.write) {
            objComponentActivity = AndroidPopup_androidKt$SimpleStack$1$1.INSTANCE;
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
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(getpostalcode, Integer.valueOf((((((((i << 3) & 112) | (((i >> 3) & 14) | 384)) << 6) & 896) | 6) >> 6) & 14));
        getpostalcode.IconCompatParcelizer(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRect toIntBounds(Rect rect) {
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 Popup$lambda$0(onViewAttachedToWindow onviewattachedtowindow) {
        return (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) onviewattachedtowindow.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:78:0x0105  */
    /* JADX WARN: Code duplicated, block: B:80:0x0109  */
    /* JADX WARN: Code duplicated, block: B:82:0x0126  */
    /* JADX WARN: Code duplicated, block: B:85:0x0133  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: Popup-K5zGePQ, reason: not valid java name */
    public static final void m3938PopupK5zGePQ(Alignment alignment, long j, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, PopupProperties popupProperties, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getBirthDateFull getbirthdatefull, final int i, final int i2) throws Throwable {
        Alignment alignment2;
        int i3;
        long jM3795constructorimpl;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        int i4;
        PopupProperties popupProperties2;
        int i5;
        boolean z;
        final Alignment alignment3;
        final long j2;
        final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
        final PopupProperties popupProperties3;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        Alignment topStart;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Object objComponentActivity;
        int i6;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(71005054);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            alignment2 = alignment;
        } else if ((i & 6) == 0) {
            alignment2 = alignment;
            i3 = (getpostalcode.read(alignment2) ? 4 : 2) | i;
        } else {
            alignment2 = alignment;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
            jM3795constructorimpl = j;
        } else {
            jM3795constructorimpl = j;
            if ((i & 48) == 0) {
                i3 |= getpostalcode.serializer(jM3795constructorimpl) ? 32 : 16;
            }
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
                i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.RotationX : Fields.SpotShadowColor;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    popupProperties2 = popupProperties;
                    if (getpostalcode.read(popupProperties2)) {
                        i5 = Fields.CameraDistance;
                    } else {
                        i5 = Fields.RotationZ;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) != 0) {
                    if (getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
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
                    if (i7 != 0) {
                        topStart = Alignment.Companion.getTopStart();
                    } else {
                        topStart = alignment2;
                    }
                    if (i8 != 0) {
                        jM3795constructorimpl = IntOffset.m3795constructorimpl(0L);
                    }
                    if (i9 != 0) {
                        r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = null;
                    }
                    if (i4 != 0) {
                        popupProperties2 = new PopupProperties(false, false, false, false, false, 31, (DefaultConstructorMarker) null);
                    }
                    int windowType = popupProperties2.getWindowType();
                    IBinder windowToken = popupProperties2.getWindowToken();
                    if ((i3 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = (i3 & 112) == 32;
                    z4 = getpostalcode.read(windowType);
                    z5 = getpostalcode.read(windowToken);
                    objComponentActivity = getpostalcode.ComponentActivity();
                    if (!(z2 | z3 | z4 | z5) || objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = new AlignmentOffsetPositionProvider(topStart, jM3795constructorimpl, null);
                        getpostalcode.write(objComponentActivity);
                    }
                    Popup((AlignmentOffsetPositionProvider) objComponentActivity, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, popupProperties2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getpostalcode, (i3 >> 3) & 8176, 0);
                    j2 = jM3795constructorimpl;
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
                    popupProperties3 = popupProperties2;
                    alignment3 = topStart;
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    alignment3 = alignment2;
                    j2 = jM3795constructorimpl;
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
                    popupProperties3 = popupProperties2;
                }
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt.Popup.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void invoke(getBirthDateFull getbirthdatefull2, int i10) throws Throwable {
                            AndroidPopup_androidKt.m3938PopupK5zGePQ(alignment3, j2, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, popupProperties3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                        }

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                            invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                            return createFromParcel.INSTANCE;
                        }
                    };
                }
            }
            i3 |= 3072;
            popupProperties2 = popupProperties;
            if ((i & 24576) != 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
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
                if (i7 != 0) {
                    topStart = Alignment.Companion.getTopStart();
                } else {
                    topStart = alignment2;
                }
                if (i8 != 0) {
                    jM3795constructorimpl = IntOffset.m3795constructorimpl(0L);
                }
                if (i9 != 0) {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = null;
                }
                if (i4 != 0) {
                    popupProperties2 = new PopupProperties(false, false, false, false, false, 31, (DefaultConstructorMarker) null);
                }
                int windowType2 = popupProperties2.getWindowType();
                IBinder windowToken2 = popupProperties2.getWindowToken();
                if ((i3 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((i3 & 112) == 32) {
                }
                z4 = getpostalcode.read(windowType2);
                z5 = getpostalcode.read(windowToken2);
                objComponentActivity = getpostalcode.ComponentActivity();
                if (!(z2 | z3 | z4 | z5)) {
                    objComponentActivity = new AlignmentOffsetPositionProvider(topStart, jM3795constructorimpl, null);
                    getpostalcode.write(objComponentActivity);
                } else {
                    objComponentActivity = new AlignmentOffsetPositionProvider(topStart, jM3795constructorimpl, null);
                    getpostalcode.write(objComponentActivity);
                }
                Popup((AlignmentOffsetPositionProvider) objComponentActivity, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, popupProperties2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getpostalcode, (i3 >> 3) & 8176, 0);
                j2 = jM3795constructorimpl;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
                popupProperties3 = popupProperties2;
                alignment3 = topStart;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                alignment3 = alignment2;
                j2 = jM3795constructorimpl;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
                popupProperties3 = popupProperties2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt.Popup.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void invoke(getBirthDateFull getbirthdatefull2, int i10) throws Throwable {
                        AndroidPopup_androidKt.m3938PopupK5zGePQ(alignment3, j2, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, popupProperties3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                    }

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                        invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                        return createFromParcel.INSTANCE;
                    }
                };
            }
        }
        i3 |= 384;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                popupProperties2 = popupProperties;
                if (getpostalcode.read(popupProperties2)) {
                    i5 = Fields.CameraDistance;
                } else {
                    i5 = Fields.RotationZ;
                }
                i3 |= i5;
            }
            if ((i & 24576) != 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
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
                if (i7 != 0) {
                    topStart = Alignment.Companion.getTopStart();
                } else {
                    topStart = alignment2;
                }
                if (i8 != 0) {
                    jM3795constructorimpl = IntOffset.m3795constructorimpl(0L);
                }
                if (i9 != 0) {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = null;
                }
                if (i4 != 0) {
                    popupProperties2 = new PopupProperties(false, false, false, false, false, 31, (DefaultConstructorMarker) null);
                }
                int windowType3 = popupProperties2.getWindowType();
                IBinder windowToken3 = popupProperties2.getWindowToken();
                if ((i3 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((i3 & 112) == 32) {
                }
                z4 = getpostalcode.read(windowType3);
                z5 = getpostalcode.read(windowToken3);
                objComponentActivity = getpostalcode.ComponentActivity();
                if (!(z2 | z3 | z4 | z5)) {
                    objComponentActivity = new AlignmentOffsetPositionProvider(topStart, jM3795constructorimpl, null);
                    getpostalcode.write(objComponentActivity);
                } else {
                    objComponentActivity = new AlignmentOffsetPositionProvider(topStart, jM3795constructorimpl, null);
                    getpostalcode.write(objComponentActivity);
                }
                Popup((AlignmentOffsetPositionProvider) objComponentActivity, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, popupProperties2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getpostalcode, (i3 >> 3) & 8176, 0);
                j2 = jM3795constructorimpl;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
                popupProperties3 = popupProperties2;
                alignment3 = topStart;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                alignment3 = alignment2;
                j2 = jM3795constructorimpl;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
                popupProperties3 = popupProperties2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt.Popup.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void invoke(getBirthDateFull getbirthdatefull2, int i10) throws Throwable {
                        AndroidPopup_androidKt.m3938PopupK5zGePQ(alignment3, j2, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, popupProperties3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                    }

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                        invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                        return createFromParcel.INSTANCE;
                    }
                };
            }
        }
        i3 |= 3072;
        popupProperties2 = popupProperties;
        if ((i & 24576) != 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
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
            if (i7 != 0) {
                topStart = Alignment.Companion.getTopStart();
            } else {
                topStart = alignment2;
            }
            if (i8 != 0) {
                jM3795constructorimpl = IntOffset.m3795constructorimpl(0L);
            }
            if (i9 != 0) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = null;
            }
            if (i4 != 0) {
                popupProperties2 = new PopupProperties(false, false, false, false, false, 31, (DefaultConstructorMarker) null);
            }
            int windowType4 = popupProperties2.getWindowType();
            IBinder windowToken4 = popupProperties2.getWindowToken();
            if ((i3 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i3 & 112) == 32) {
            }
            z4 = getpostalcode.read(windowType4);
            z5 = getpostalcode.read(windowToken4);
            objComponentActivity = getpostalcode.ComponentActivity();
            if (!(z2 | z3 | z4 | z5)) {
                objComponentActivity = new AlignmentOffsetPositionProvider(topStart, jM3795constructorimpl, null);
                getpostalcode.write(objComponentActivity);
            } else {
                objComponentActivity = new AlignmentOffsetPositionProvider(topStart, jM3795constructorimpl, null);
                getpostalcode.write(objComponentActivity);
            }
            Popup((AlignmentOffsetPositionProvider) objComponentActivity, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, popupProperties2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getpostalcode, (i3 >> 3) & 8176, 0);
            j2 = jM3795constructorimpl;
            r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
            popupProperties3 = popupProperties2;
            alignment3 = topStart;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            alignment3 = alignment2;
            j2 = jM3795constructorimpl;
            r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
            popupProperties3 = popupProperties2;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt.Popup.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(getBirthDateFull getbirthdatefull2, int i10) throws Throwable {
                    AndroidPopup_androidKt.m3938PopupK5zGePQ(alignment3, j2, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, popupProperties3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                }

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                    invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }

    public static final boolean isFlagSecureEnabled(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    public static final void PopupTestTag(final String str, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1357513789);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? 32 : 16;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 19) != 18)) {
            AndroidContentCaptureManagerCompanion.read(LocalPopupTestTag.write(str), r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getpostalcode, (i2 & 112) | 8);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt.PopupTestTag.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(getBirthDateFull getbirthdatefull2, int i3) {
                    AndroidPopup_androidKt.PopupTestTag(str, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                }

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }

    public static /* synthetic */ boolean isPopupLayout$default(View view, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return isPopupLayout(view, str);
    }

    public static final boolean isPopupLayout(View view, String str) {
        if (view instanceof PopupLayout) {
            return str == null || str.equals(((PopupLayout) view).getTestTag());
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0252 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:102:0x0254  */
    /* JADX WARN: Code duplicated, block: B:105:0x0278  */
    /* JADX WARN: Code duplicated, block: B:107:0x027f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0283  */
    /* JADX WARN: Code duplicated, block: B:110:0x029d  */
    /* JADX WARN: Code duplicated, block: B:112:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:115:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x009c  */
    /* JADX WARN: Code duplicated, block: B:53:0x00db  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:57:0x0146  */
    /* JADX WARN: Code duplicated, block: B:60:0x015f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0161  */
    /* JADX WARN: Code duplicated, block: B:64:0x0169  */
    /* JADX WARN: Code duplicated, block: B:65:0x016d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0187 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x0189  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:73:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:91:0x0210 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x0215  */
    /* JADX WARN: Code duplicated, block: B:97:0x022f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x0231  */
    public static final void Popup(final PopupPositionProvider popupPositionProvider, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, PopupProperties popupProperties, final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getBirthDateFull getbirthdatefull, final int i, final int i2) throws Throwable {
        int i3;
        final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        int i4;
        PopupProperties popupProperties2;
        int i5;
        int i6;
        boolean z;
        final PopupProperties popupProperties3;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
        PopupProperties popupProperties4;
        View view;
        Density density;
        final String str;
        final LayoutDirection layoutDirection;
        GapComposer$CompositionContextImpl gapComposer$CompositionContextImplRemoteActionCompatParcelizer;
        final PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Serializer;
        Object objComponentActivity;
        AndroidContentCaptureManager androidContentCaptureManager;
        UUID uuid;
        boolean zBooleanValue;
        Object objComponentActivity2;
        boolean z2;
        boolean z3;
        final PopupLayout popupLayout;
        boolean zIconCompatParcelizer;
        int i7;
        boolean z4;
        int i8;
        boolean z5;
        boolean z6;
        boolean z7;
        Object objComponentActivity3;
        boolean zIconCompatParcelizer2;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        Object objComponentActivity4;
        boolean zIconCompatParcelizer3;
        boolean z12;
        Object objComponentActivity5;
        boolean zIconCompatParcelizer4;
        Object objComponentActivity6;
        Throwable th;
        boolean zIconCompatParcelizer5;
        Object objComponentActivity7;
        boolean zIconCompatParcelizer6;
        boolean z13;
        Object objComponentActivity8;
        MeasurePolicy measurePolicy;
        int iHashCode;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer;
        Modifier modifierMaterializeModifier;
        ComposeUiNode.Companion companion;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        int i9;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1772091631);
        if ((i & 6) == 0) {
            i3 = (getpostalcode.read(popupPositionProvider) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
                i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    popupProperties2 = popupProperties;
                    if (getpostalcode.read(popupProperties2)) {
                        i5 = 256;
                    } else {
                        i5 = Fields.SpotShadowColor;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if (getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                        i9 = Fields.CameraDistance;
                    } else {
                        i9 = Fields.RotationZ;
                    }
                    i3 |= i9;
                }
                i6 = i3;
                if ((i6 & 1171) != 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (getpostalcode.write(i6 & 1, z)) {
                    if (i10 != 0) {
                        r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = null;
                    } else {
                        r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
                    }
                    if (i4 != 0) {
                        popupProperties4 = new PopupProperties(false, false, false, false, false, 31, (DefaultConstructorMarker) null);
                    } else {
                        popupProperties4 = popupProperties2;
                    }
                    view = (View) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalView());
                    density = (Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
                    str = (String) getpostalcode.write((getNewPassword) LocalPopupTestTag);
                    layoutDirection = (LayoutDirection) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalLayoutDirection());
                    gapComposer$CompositionContextImplRemoteActionCompatParcelizer = SentryUUID.RemoteActionCompatParcelizer(getpostalcode);
                    populateViewStructure_androidKtpopulate7Serializer = CompositionKt.serializer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getpostalcode);
                    Object[] objArr = new Object[0];
                    objComponentActivity = getpostalcode.ComponentActivity();
                    androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    if (objComponentActivity == androidContentCaptureManager) {
                        objComponentActivity = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1$1
                            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                            public final UUID invoke() {
                                return UUID.randomUUID();
                            }
                        };
                        getpostalcode.write(objComponentActivity);
                    }
                    uuid = (UUID) getEventType.IconCompatParcelizer(objArr, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 48);
                    zBooleanValue = ((Boolean) getpostalcode.write((getNewPassword) LocalIsInPopupLayout)).booleanValue();
                    objComponentActivity2 = getpostalcode.ComponentActivity();
                    if (objComponentActivity2 == androidContentCaptureManager) {
                        z3 = false;
                        final PopupLayout popupLayout2 = new PopupLayout(r8lambdardpfsr94j4iebcwx_kpqzpm8k2, popupProperties4, str, view, density, popupPositionProvider, uuid, zBooleanValue, null, Fields.RotationX, null);
                        z2 = true;
                        popupLayout2.setContent(gapComposer$CompositionContextImplRemoteActionCompatParcelizer, new DragAndDropTargetModifierNode(new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void invoke(getBirthDateFull getbirthdatefull2, int i11) {
                                getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                                if (getpostalcode2.write(i11 & 1, (i11 & 3) != 2)) {
                                    hideTranslatedText hidetranslatedtextWrite = AndroidPopup_androidKt.getLocalIsInPopupLayout().write(Boolean.TRUE);
                                    final PopupLayout popupLayout3 = popupLayout2;
                                    final onViewAttachedToWindow onviewattachedtowindow = populateViewStructure_androidKtpopulate7Serializer;
                                    AndroidContentCaptureManagerCompanion.read(hidetranslatedtextWrite, ExtrasKt.write(1022273628, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        public final void invoke(getBirthDateFull getbirthdatefull3, int i12) {
                                            getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull3;
                                            if (getpostalcode3.write(i12 & 1, (i12 & 3) != 2)) {
                                                Modifier.Companion companion2 = Modifier.Companion;
                                                Object objComponentActivity9 = getpostalcode3.ComponentActivity();
                                                AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
                                                if (objComponentActivity9 == androidContentCaptureManager2) {
                                                    objComponentActivity9 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$1$1
                                                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                            invoke((SemanticsPropertyReceiver) obj);
                                                            return createFromParcel.INSTANCE;
                                                        }

                                                        public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                            SemanticsPropertiesKt.popup(semanticsPropertyReceiver);
                                                        }
                                                    };
                                                    getpostalcode3.write(objComponentActivity9);
                                                }
                                                Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion2, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity9, 1, null);
                                                boolean zIconCompatParcelizer7 = getpostalcode3.IconCompatParcelizer(popupLayout3);
                                                final PopupLayout popupLayout4 = popupLayout3;
                                                Object objComponentActivity10 = getpostalcode3.ComponentActivity();
                                                if (zIconCompatParcelizer7 || objComponentActivity10 == androidContentCaptureManager2) {
                                                    objComponentActivity10 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$2$1
                                                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                                        public /* synthetic */ Object invoke(Object obj) {
                                                            m3940invokeozmzZPI(((IntSize) obj).m3848unboximpl());
                                                            return createFromParcel.INSTANCE;
                                                        }

                                                        /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                                                        public final void m3940invokeozmzZPI(long j) {
                                                            popupLayout4.m3943setPopupContentSizefhxjrPA(IntSize.m3836boximpl(j));
                                                            popupLayout4.updatePosition();
                                                        }

                                                        {
                                                            super(1);
                                                        }
                                                    };
                                                    getpostalcode3.write(objComponentActivity10);
                                                }
                                                Modifier modifierAlpha = AlphaKt.alpha(OnRemeasuredModifierKt.onSizeChanged(modifierSemantics$default, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity10), popupLayout3.getCanCalculatePosition() ? 1.0f : 0.0f);
                                                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0Popup$lambda$0 = AndroidPopup_androidKt.Popup$lambda$0(onviewattachedtowindow);
                                                Object objComponentActivity11 = getpostalcode3.ComponentActivity();
                                                if (objComponentActivity11 == androidContentCaptureManager2) {
                                                    objComponentActivity11 = AndroidPopup_androidKt$SimpleStack$1$1.INSTANCE;
                                                    getpostalcode3.write(objComponentActivity11);
                                                }
                                                MeasurePolicy measurePolicy2 = (MeasurePolicy) objComponentActivity11;
                                                int iHashCode2 = Long.hashCode(getpostalcode3.RatingCompat);
                                                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode3.serializer();
                                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode3, modifierAlpha);
                                                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                                                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
                                                if (getpostalcode3.read != null) {
                                                    getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                                                    if (getpostalcode3.ComponentActivity) {
                                                        getpostalcode3.serializer(constructor2);
                                                    } else {
                                                        getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                                                    }
                                                    af$$ExternalSyntheticOutline0.m(companion3, getpostalcode3, measurePolicy2, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                                                    AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode3, Integer.valueOf(iHashCode2), getpostalcode3));
                                                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde0Popup$lambda$0.invoke(getpostalcode3, 0);
                                                    getpostalcode3.IconCompatParcelizer(true);
                                                    return;
                                                }
                                                SentryUUID.write();
                                                throw null;
                                            }
                                            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                                        }

                                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                                        public /* synthetic */ Object invoke(Object obj, Object obj2) {
                                            invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                                            return createFromParcel.INSTANCE;
                                        }
                                    }, getpostalcode2), getpostalcode2, 56);
                                    return;
                                }
                                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                            }

                            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                            public /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                                return createFromParcel.INSTANCE;
                            }
                        }, true, -297523940));
                        getpostalcode.write(popupLayout2);
                        objComponentActivity2 = popupLayout2;
                    } else {
                        z2 = true;
                        z3 = false;
                    }
                    popupLayout = (PopupLayout) objComponentActivity2;
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(popupLayout);
                    i7 = i6 & 112;
                    if (i7 == 32) {
                        z4 = z2;
                    } else {
                        z4 = z3;
                    }
                    i8 = i6 & 896;
                    if (i8 == 256) {
                        z5 = z2;
                    } else {
                        z5 = z3;
                    }
                    z6 = getpostalcode.read(str);
                    z7 = getpostalcode.read(layoutDirection.ordinal());
                    objComponentActivity3 = getpostalcode.ComponentActivity();
                    if (!(zIconCompatParcelizer | z4 | z5 | z6 | z7) || objComponentActivity3 == androidContentCaptureManager) {
                        final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
                        final PopupProperties popupProperties5 = popupProperties4;
                        objComponentActivity3 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                            public final getPersonMiddleInitial invoke(getPersonNamePrefix getpersonnameprefix) {
                                popupLayout.show();
                                popupLayout.updateParameters(r8lambdardpfsr94j4iebcwx_kpqzpm8k3, popupProperties5, str, layoutDirection);
                                final PopupLayout popupLayout3 = popupLayout;
                                return new getPersonMiddleInitial() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1
                                    @Override // o.getPersonMiddleInitial
                                    public void dispose() {
                                        popupLayout3.disposeComposition();
                                        popupLayout3.dismiss();
                                    }
                                };
                            }
                        };
                        getpostalcode.write(objComponentActivity3);
                    }
                    getPhoneNumberNational.serializer(popupLayout, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, getpostalcode);
                    zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(popupLayout);
                    if (i7 == 32) {
                        z8 = true;
                    } else {
                        z8 = z3;
                    }
                    if (i8 == 256) {
                        z9 = true;
                    } else {
                        z9 = z3;
                    }
                    z10 = getpostalcode.read(str);
                    z11 = getpostalcode.read(layoutDirection.ordinal());
                    objComponentActivity4 = getpostalcode.ComponentActivity();
                    if (!(zIconCompatParcelizer2 | z8 | z9 | z10 | z11) || objComponentActivity4 == androidContentCaptureManager) {
                        final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
                        final PopupProperties popupProperties6 = popupProperties4;
                        objComponentActivity4 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                            public final void m3939invoke() {
                                popupLayout.updateParameters(r8lambdardpfsr94j4iebcwx_kpqzpm8k4, popupProperties6, str, layoutDirection);
                            }

                            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m3939invoke();
                                return createFromParcel.INSTANCE;
                            }
                        };
                        getpostalcode.write(objComponentActivity4);
                    }
                    getPhoneNumberNational.write((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity4, getpostalcode);
                    zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(popupLayout);
                    if ((i6 & 14) == 4) {
                        z12 = true;
                    } else {
                        z12 = z3;
                    }
                    objComponentActivity5 = getpostalcode.ComponentActivity();
                    if (!(zIconCompatParcelizer3 | z12) || objComponentActivity5 == androidContentCaptureManager) {
                        objComponentActivity5 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                            public final getPersonMiddleInitial invoke(getPersonNamePrefix getpersonnameprefix) {
                                popupLayout.setPositionProvider(popupPositionProvider);
                                popupLayout.updatePosition();
                                return new getPersonMiddleInitial() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1$invoke$$inlined$onDispose$1
                                    @Override // o.getPersonMiddleInitial
                                    public void dispose() {
                                    }
                                };
                            }
                        };
                        getpostalcode.write(objComponentActivity5);
                    }
                    getPhoneNumberNational.serializer(popupPositionProvider, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity5, getpostalcode);
                    zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(popupLayout);
                    objComponentActivity6 = getpostalcode.ComponentActivity();
                    if (!zIconCompatParcelizer4 || objComponentActivity6 == androidContentCaptureManager) {
                        th = null;
                        objComponentActivity6 = new AndroidPopup_androidKt$Popup$5$1(popupLayout, null);
                        getpostalcode.write(objComponentActivity6);
                    } else {
                        th = null;
                    }
                    getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, popupLayout, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity6);
                    Modifier.Companion companion2 = Modifier.Companion;
                    zIconCompatParcelizer5 = getpostalcode.IconCompatParcelizer(popupLayout);
                    objComponentActivity7 = getpostalcode.ComponentActivity();
                    if (!zIconCompatParcelizer5 || objComponentActivity7 == androidContentCaptureManager) {
                        objComponentActivity7 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
                            {
                                super(1);
                            }

                            public final void invoke(LayoutCoordinates layoutCoordinates) {
                                LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
                                parentLayoutCoordinates.getClass();
                                popupLayout.updateParentLayoutCoordinates(parentLayoutCoordinates);
                            }

                            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                invoke((LayoutCoordinates) obj);
                                return createFromParcel.INSTANCE;
                            }
                        };
                        getpostalcode.write(objComponentActivity7);
                    }
                    Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity7);
                    zIconCompatParcelizer6 = getpostalcode.IconCompatParcelizer(popupLayout);
                    z13 = getpostalcode.read(layoutDirection.ordinal());
                    objComponentActivity8 = getpostalcode.ComponentActivity();
                    if (!(zIconCompatParcelizer6 | z13) || objComponentActivity8 == androidContentCaptureManager) {
                        objComponentActivity8 = new MeasurePolicy() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1
                            @Override // androidx.compose.ui.layout.MeasurePolicy
                            /* JADX INFO: renamed from: measure-3p2s80s */
                            public final MeasureResult mo6measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                                popupLayout.setParentLayoutDirection(layoutDirection);
                                return MeasureScope.layout$default(measureScope, 0, 0, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1.1
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
                        getpostalcode.write(objComponentActivity8);
                    }
                    measurePolicy = (MeasurePolicy) objComponentActivity8;
                    iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                    dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                    modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierOnGloballyPositioned);
                    companion = ComposeUiNode.Companion;
                    constructor = companion.getConstructor();
                    if (getpostalcode.read != null) {
                        getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode.ComponentActivity) {
                            getpostalcode.serializer(constructor);
                        } else {
                            getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                        getpostalcode.IconCompatParcelizer(true);
                        r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
                        popupProperties3 = popupProperties4;
                    } else {
                        SentryUUID.write();
                        throw th;
                    }
                } else {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    popupProperties3 = popupProperties2;
                }
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt.Popup.9
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void invoke(getBirthDateFull getbirthdatefull2, int i11) throws Throwable {
                            AndroidPopup_androidKt.Popup(popupPositionProvider, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, popupProperties3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                        }

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                            invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                            return createFromParcel.INSTANCE;
                        }
                    };
                }
            }
            i3 |= 384;
            popupProperties2 = popupProperties;
            if ((i & 3072) == 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                    i9 = Fields.CameraDistance;
                } else {
                    i9 = Fields.RotationZ;
                }
                i3 |= i9;
            }
            i6 = i3;
            if ((i6 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (getpostalcode.write(i6 & 1, z)) {
                if (i10 != 0) {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = null;
                } else {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
                }
                if (i4 != 0) {
                    popupProperties4 = new PopupProperties(false, false, false, false, false, 31, (DefaultConstructorMarker) null);
                } else {
                    popupProperties4 = popupProperties2;
                }
                view = (View) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalView());
                density = (Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
                str = (String) getpostalcode.write((getNewPassword) LocalPopupTestTag);
                layoutDirection = (LayoutDirection) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalLayoutDirection());
                gapComposer$CompositionContextImplRemoteActionCompatParcelizer = SentryUUID.RemoteActionCompatParcelizer(getpostalcode);
                populateViewStructure_androidKtpopulate7Serializer = CompositionKt.serializer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getpostalcode);
                Object[] objArr2 = new Object[0];
                objComponentActivity = getpostalcode.ComponentActivity();
                androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1$1
                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final UUID invoke() {
                            return UUID.randomUUID();
                        }
                    };
                    getpostalcode.write(objComponentActivity);
                }
                uuid = (UUID) getEventType.IconCompatParcelizer(objArr2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 48);
                zBooleanValue = ((Boolean) getpostalcode.write((getNewPassword) LocalIsInPopupLayout)).booleanValue();
                objComponentActivity2 = getpostalcode.ComponentActivity();
                if (objComponentActivity2 == androidContentCaptureManager) {
                    z3 = false;
                    final PopupLayout popupLayout3 = new PopupLayout(r8lambdardpfsr94j4iebcwx_kpqzpm8k2, popupProperties4, str, view, density, popupPositionProvider, uuid, zBooleanValue, null, Fields.RotationX, null);
                    z2 = true;
                    popupLayout3.setContent(gapComposer$CompositionContextImplRemoteActionCompatParcelizer, new DragAndDropTargetModifierNode(new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void invoke(getBirthDateFull getbirthdatefull2, int i11) {
                            getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                            if (getpostalcode2.write(i11 & 1, (i11 & 3) != 2)) {
                                hideTranslatedText hidetranslatedtextWrite = AndroidPopup_androidKt.getLocalIsInPopupLayout().write(Boolean.TRUE);
                                final PopupLayout popupLayout4 = popupLayout3;
                                final onViewAttachedToWindow onviewattachedtowindow = populateViewStructure_androidKtpopulate7Serializer;
                                AndroidContentCaptureManagerCompanion.read(hidetranslatedtextWrite, ExtrasKt.write(1022273628, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    public final void invoke(getBirthDateFull getbirthdatefull3, int i12) {
                                        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull3;
                                        if (getpostalcode3.write(i12 & 1, (i12 & 3) != 2)) {
                                            Modifier.Companion companion3 = Modifier.Companion;
                                            Object objComponentActivity9 = getpostalcode3.ComponentActivity();
                                            AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
                                            if (objComponentActivity9 == androidContentCaptureManager2) {
                                                objComponentActivity9 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$1$1
                                                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                        invoke((SemanticsPropertyReceiver) obj);
                                                        return createFromParcel.INSTANCE;
                                                    }

                                                    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                        SemanticsPropertiesKt.popup(semanticsPropertyReceiver);
                                                    }
                                                };
                                                getpostalcode3.write(objComponentActivity9);
                                            }
                                            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion3, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity9, 1, null);
                                            boolean zIconCompatParcelizer7 = getpostalcode3.IconCompatParcelizer(popupLayout4);
                                            final PopupLayout popupLayout5 = popupLayout4;
                                            Object objComponentActivity10 = getpostalcode3.ComponentActivity();
                                            if (zIconCompatParcelizer7 || objComponentActivity10 == androidContentCaptureManager2) {
                                                objComponentActivity10 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$2$1
                                                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                                    public /* synthetic */ Object invoke(Object obj) {
                                                        m3940invokeozmzZPI(((IntSize) obj).m3848unboximpl());
                                                        return createFromParcel.INSTANCE;
                                                    }

                                                    /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                                                    public final void m3940invokeozmzZPI(long j) {
                                                        popupLayout5.m3943setPopupContentSizefhxjrPA(IntSize.m3836boximpl(j));
                                                        popupLayout5.updatePosition();
                                                    }

                                                    {
                                                        super(1);
                                                    }
                                                };
                                                getpostalcode3.write(objComponentActivity10);
                                            }
                                            Modifier modifierAlpha = AlphaKt.alpha(OnRemeasuredModifierKt.onSizeChanged(modifierSemantics$default, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity10), popupLayout4.getCanCalculatePosition() ? 1.0f : 0.0f);
                                            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0Popup$lambda$0 = AndroidPopup_androidKt.Popup$lambda$0(onviewattachedtowindow);
                                            Object objComponentActivity11 = getpostalcode3.ComponentActivity();
                                            if (objComponentActivity11 == androidContentCaptureManager2) {
                                                objComponentActivity11 = AndroidPopup_androidKt$SimpleStack$1$1.INSTANCE;
                                                getpostalcode3.write(objComponentActivity11);
                                            }
                                            MeasurePolicy measurePolicy2 = (MeasurePolicy) objComponentActivity11;
                                            int iHashCode2 = Long.hashCode(getpostalcode3.RatingCompat);
                                            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode3.serializer();
                                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode3, modifierAlpha);
                                            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                                            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion4.getConstructor();
                                            if (getpostalcode3.read != null) {
                                                getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                                                if (getpostalcode3.ComponentActivity) {
                                                    getpostalcode3.serializer(constructor2);
                                                } else {
                                                    getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                                                }
                                                af$$ExternalSyntheticOutline0.m(companion4, getpostalcode3, measurePolicy2, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                                                AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode3, Integer.valueOf(iHashCode2), getpostalcode3));
                                                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0Popup$lambda$0.invoke(getpostalcode3, 0);
                                                getpostalcode3.IconCompatParcelizer(true);
                                                return;
                                            }
                                            SentryUUID.write();
                                            throw null;
                                        }
                                        getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                                    }

                                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                                        return createFromParcel.INSTANCE;
                                    }
                                }, getpostalcode2), getpostalcode2, 56);
                                return;
                            }
                            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        }

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                            return createFromParcel.INSTANCE;
                        }
                    }, true, -297523940));
                    getpostalcode.write(popupLayout3);
                    objComponentActivity2 = popupLayout3;
                } else {
                    z2 = true;
                    z3 = false;
                }
                popupLayout = (PopupLayout) objComponentActivity2;
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(popupLayout);
                i7 = i6 & 112;
                if (i7 == 32) {
                    z4 = z2;
                } else {
                    z4 = z3;
                }
                i8 = i6 & 896;
                if (i8 == 256) {
                    z5 = z2;
                } else {
                    z5 = z3;
                }
                z6 = getpostalcode.read(str);
                z7 = getpostalcode.read(layoutDirection.ordinal());
                objComponentActivity3 = getpostalcode.ComponentActivity();
                if (!(zIconCompatParcelizer | z4 | z5 | z6 | z7)) {
                    final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k5 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
                    final PopupProperties popupProperties7 = popupProperties4;
                    objComponentActivity3 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public final getPersonMiddleInitial invoke(getPersonNamePrefix getpersonnameprefix) {
                            popupLayout.show();
                            popupLayout.updateParameters(r8lambdardpfsr94j4iebcwx_kpqzpm8k5, popupProperties7, str, layoutDirection);
                            final PopupLayout popupLayout4 = popupLayout;
                            return new getPersonMiddleInitial() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1
                                @Override // o.getPersonMiddleInitial
                                public void dispose() {
                                    popupLayout4.disposeComposition();
                                    popupLayout4.dismiss();
                                }
                            };
                        }
                    };
                    getpostalcode.write(objComponentActivity3);
                } else {
                    final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k6 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
                    final PopupProperties popupProperties8 = popupProperties4;
                    objComponentActivity3 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public final getPersonMiddleInitial invoke(getPersonNamePrefix getpersonnameprefix) {
                            popupLayout.show();
                            popupLayout.updateParameters(r8lambdardpfsr94j4iebcwx_kpqzpm8k6, popupProperties8, str, layoutDirection);
                            final PopupLayout popupLayout4 = popupLayout;
                            return new getPersonMiddleInitial() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1
                                @Override // o.getPersonMiddleInitial
                                public void dispose() {
                                    popupLayout4.disposeComposition();
                                    popupLayout4.dismiss();
                                }
                            };
                        }
                    };
                    getpostalcode.write(objComponentActivity3);
                }
                getPhoneNumberNational.serializer(popupLayout, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, getpostalcode);
                zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(popupLayout);
                if (i7 == 32) {
                    z8 = true;
                } else {
                    z8 = z3;
                }
                if (i8 == 256) {
                    z9 = true;
                } else {
                    z9 = z3;
                }
                z10 = getpostalcode.read(str);
                z11 = getpostalcode.read(layoutDirection.ordinal());
                objComponentActivity4 = getpostalcode.ComponentActivity();
                if (!(zIconCompatParcelizer2 | z8 | z9 | z10 | z11)) {
                    final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k7 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
                    final PopupProperties popupProperties9 = popupProperties4;
                    objComponentActivity4 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m3939invoke() {
                            popupLayout.updateParameters(r8lambdardpfsr94j4iebcwx_kpqzpm8k7, popupProperties9, str, layoutDirection);
                        }

                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m3939invoke();
                            return createFromParcel.INSTANCE;
                        }
                    };
                    getpostalcode.write(objComponentActivity4);
                } else {
                    final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k8 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
                    final PopupProperties popupProperties10 = popupProperties4;
                    objComponentActivity4 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m3939invoke() {
                            popupLayout.updateParameters(r8lambdardpfsr94j4iebcwx_kpqzpm8k8, popupProperties10, str, layoutDirection);
                        }

                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m3939invoke();
                            return createFromParcel.INSTANCE;
                        }
                    };
                    getpostalcode.write(objComponentActivity4);
                }
                getPhoneNumberNational.write((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity4, getpostalcode);
                zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(popupLayout);
                if ((i6 & 14) == 4) {
                    z12 = true;
                } else {
                    z12 = z3;
                }
                objComponentActivity5 = getpostalcode.ComponentActivity();
                if (!(zIconCompatParcelizer3 | z12)) {
                    objComponentActivity5 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public final getPersonMiddleInitial invoke(getPersonNamePrefix getpersonnameprefix) {
                            popupLayout.setPositionProvider(popupPositionProvider);
                            popupLayout.updatePosition();
                            return new getPersonMiddleInitial() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1$invoke$$inlined$onDispose$1
                                @Override // o.getPersonMiddleInitial
                                public void dispose() {
                                }
                            };
                        }
                    };
                    getpostalcode.write(objComponentActivity5);
                } else {
                    objComponentActivity5 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public final getPersonMiddleInitial invoke(getPersonNamePrefix getpersonnameprefix) {
                            popupLayout.setPositionProvider(popupPositionProvider);
                            popupLayout.updatePosition();
                            return new getPersonMiddleInitial() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1$invoke$$inlined$onDispose$1
                                @Override // o.getPersonMiddleInitial
                                public void dispose() {
                                }
                            };
                        }
                    };
                    getpostalcode.write(objComponentActivity5);
                }
                getPhoneNumberNational.serializer(popupPositionProvider, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity5, getpostalcode);
                zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(popupLayout);
                objComponentActivity6 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer4) {
                    th = null;
                    objComponentActivity6 = new AndroidPopup_androidKt$Popup$5$1(popupLayout, null);
                    getpostalcode.write(objComponentActivity6);
                } else {
                    th = null;
                    objComponentActivity6 = new AndroidPopup_androidKt$Popup$5$1(popupLayout, null);
                    getpostalcode.write(objComponentActivity6);
                }
                getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, popupLayout, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity6);
                Modifier.Companion companion3 = Modifier.Companion;
                zIconCompatParcelizer5 = getpostalcode.IconCompatParcelizer(popupLayout);
                objComponentActivity7 = getpostalcode.ComponentActivity();
                if (!zIconCompatParcelizer5) {
                    objComponentActivity7 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
                        {
                            super(1);
                        }

                        public final void invoke(LayoutCoordinates layoutCoordinates) {
                            LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
                            parentLayoutCoordinates.getClass();
                            popupLayout.updateParentLayoutCoordinates(parentLayoutCoordinates);
                        }

                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((LayoutCoordinates) obj);
                            return createFromParcel.INSTANCE;
                        }
                    };
                    getpostalcode.write(objComponentActivity7);
                } else {
                    objComponentActivity7 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
                        {
                            super(1);
                        }

                        public final void invoke(LayoutCoordinates layoutCoordinates) {
                            LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
                            parentLayoutCoordinates.getClass();
                            popupLayout.updateParentLayoutCoordinates(parentLayoutCoordinates);
                        }

                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((LayoutCoordinates) obj);
                            return createFromParcel.INSTANCE;
                        }
                    };
                    getpostalcode.write(objComponentActivity7);
                }
                Modifier modifierOnGloballyPositioned2 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity7);
                zIconCompatParcelizer6 = getpostalcode.IconCompatParcelizer(popupLayout);
                z13 = getpostalcode.read(layoutDirection.ordinal());
                objComponentActivity8 = getpostalcode.ComponentActivity();
                if (!(zIconCompatParcelizer6 | z13)) {
                    objComponentActivity8 = new MeasurePolicy() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        /* JADX INFO: renamed from: measure-3p2s80s */
                        public final MeasureResult mo6measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                            popupLayout.setParentLayoutDirection(layoutDirection);
                            return MeasureScope.layout$default(measureScope, 0, 0, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1.1
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
                    getpostalcode.write(objComponentActivity8);
                } else {
                    objComponentActivity8 = new MeasurePolicy() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        /* JADX INFO: renamed from: measure-3p2s80s */
                        public final MeasureResult mo6measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                            popupLayout.setParentLayoutDirection(layoutDirection);
                            return MeasureScope.layout$default(measureScope, 0, 0, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1.1
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
                    getpostalcode.write(objComponentActivity8);
                }
                measurePolicy = (MeasurePolicy) objComponentActivity8;
                iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierOnGloballyPositioned2);
                companion = ComposeUiNode.Companion;
                constructor = companion.getConstructor();
                if (getpostalcode.read != null) {
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                    getpostalcode.IconCompatParcelizer(true);
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
                    popupProperties3 = popupProperties4;
                } else {
                    SentryUUID.write();
                    throw th;
                }
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                popupProperties3 = popupProperties2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt.Popup.9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void invoke(getBirthDateFull getbirthdatefull2, int i11) throws Throwable {
                        AndroidPopup_androidKt.Popup(popupPositionProvider, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, popupProperties3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                    }

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                        invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                        return createFromParcel.INSTANCE;
                    }
                };
            }
        }
        i3 |= 48;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                popupProperties2 = popupProperties;
                if (getpostalcode.read(popupProperties2)) {
                    i5 = 256;
                } else {
                    i5 = Fields.SpotShadowColor;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                    i9 = Fields.CameraDistance;
                } else {
                    i9 = Fields.RotationZ;
                }
                i3 |= i9;
            }
            i6 = i3;
            if ((i6 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (getpostalcode.write(i6 & 1, z)) {
                if (i10 != 0) {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = null;
                } else {
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
                }
                if (i4 != 0) {
                    popupProperties4 = new PopupProperties(false, false, false, false, false, 31, (DefaultConstructorMarker) null);
                } else {
                    popupProperties4 = popupProperties2;
                }
                view = (View) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalView());
                density = (Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
                str = (String) getpostalcode.write((getNewPassword) LocalPopupTestTag);
                layoutDirection = (LayoutDirection) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalLayoutDirection());
                gapComposer$CompositionContextImplRemoteActionCompatParcelizer = SentryUUID.RemoteActionCompatParcelizer(getpostalcode);
                populateViewStructure_androidKtpopulate7Serializer = CompositionKt.serializer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getpostalcode);
                Object[] objArr3 = new Object[0];
                objComponentActivity = getpostalcode.ComponentActivity();
                androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1$1
                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final UUID invoke() {
                            return UUID.randomUUID();
                        }
                    };
                    getpostalcode.write(objComponentActivity);
                }
                uuid = (UUID) getEventType.IconCompatParcelizer(objArr3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 48);
                zBooleanValue = ((Boolean) getpostalcode.write((getNewPassword) LocalIsInPopupLayout)).booleanValue();
                objComponentActivity2 = getpostalcode.ComponentActivity();
                if (objComponentActivity2 == androidContentCaptureManager) {
                    z3 = false;
                    final PopupLayout popupLayout4 = new PopupLayout(r8lambdardpfsr94j4iebcwx_kpqzpm8k2, popupProperties4, str, view, density, popupPositionProvider, uuid, zBooleanValue, null, Fields.RotationX, null);
                    z2 = true;
                    popupLayout4.setContent(gapComposer$CompositionContextImplRemoteActionCompatParcelizer, new DragAndDropTargetModifierNode(new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        public final void invoke(getBirthDateFull getbirthdatefull2, int i11) {
                            getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                            if (getpostalcode2.write(i11 & 1, (i11 & 3) != 2)) {
                                hideTranslatedText hidetranslatedtextWrite = AndroidPopup_androidKt.getLocalIsInPopupLayout().write(Boolean.TRUE);
                                final PopupLayout popupLayout5 = popupLayout4;
                                final onViewAttachedToWindow onviewattachedtowindow = populateViewStructure_androidKtpopulate7Serializer;
                                AndroidContentCaptureManagerCompanion.read(hidetranslatedtextWrite, ExtrasKt.write(1022273628, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    public final void invoke(getBirthDateFull getbirthdatefull3, int i12) {
                                        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull3;
                                        if (getpostalcode3.write(i12 & 1, (i12 & 3) != 2)) {
                                            Modifier.Companion companion4 = Modifier.Companion;
                                            Object objComponentActivity9 = getpostalcode3.ComponentActivity();
                                            AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
                                            if (objComponentActivity9 == androidContentCaptureManager2) {
                                                objComponentActivity9 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$1$1
                                                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                        invoke((SemanticsPropertyReceiver) obj);
                                                        return createFromParcel.INSTANCE;
                                                    }

                                                    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                        SemanticsPropertiesKt.popup(semanticsPropertyReceiver);
                                                    }
                                                };
                                                getpostalcode3.write(objComponentActivity9);
                                            }
                                            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion4, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity9, 1, null);
                                            boolean zIconCompatParcelizer7 = getpostalcode3.IconCompatParcelizer(popupLayout5);
                                            final PopupLayout popupLayout6 = popupLayout5;
                                            Object objComponentActivity10 = getpostalcode3.ComponentActivity();
                                            if (zIconCompatParcelizer7 || objComponentActivity10 == androidContentCaptureManager2) {
                                                objComponentActivity10 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$2$1
                                                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                                    public /* synthetic */ Object invoke(Object obj) {
                                                        m3940invokeozmzZPI(((IntSize) obj).m3848unboximpl());
                                                        return createFromParcel.INSTANCE;
                                                    }

                                                    /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                                                    public final void m3940invokeozmzZPI(long j) {
                                                        popupLayout6.m3943setPopupContentSizefhxjrPA(IntSize.m3836boximpl(j));
                                                        popupLayout6.updatePosition();
                                                    }

                                                    {
                                                        super(1);
                                                    }
                                                };
                                                getpostalcode3.write(objComponentActivity10);
                                            }
                                            Modifier modifierAlpha = AlphaKt.alpha(OnRemeasuredModifierKt.onSizeChanged(modifierSemantics$default, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity10), popupLayout5.getCanCalculatePosition() ? 1.0f : 0.0f);
                                            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0Popup$lambda$0 = AndroidPopup_androidKt.Popup$lambda$0(onviewattachedtowindow);
                                            Object objComponentActivity11 = getpostalcode3.ComponentActivity();
                                            if (objComponentActivity11 == androidContentCaptureManager2) {
                                                objComponentActivity11 = AndroidPopup_androidKt$SimpleStack$1$1.INSTANCE;
                                                getpostalcode3.write(objComponentActivity11);
                                            }
                                            MeasurePolicy measurePolicy2 = (MeasurePolicy) objComponentActivity11;
                                            int iHashCode2 = Long.hashCode(getpostalcode3.RatingCompat);
                                            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode3.serializer();
                                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode3, modifierAlpha);
                                            ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                                            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion5.getConstructor();
                                            if (getpostalcode3.read != null) {
                                                getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                                                if (getpostalcode3.ComponentActivity) {
                                                    getpostalcode3.serializer(constructor2);
                                                } else {
                                                    getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                                                }
                                                af$$ExternalSyntheticOutline0.m(companion5, getpostalcode3, measurePolicy2, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                                                AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion5, getpostalcode3, Integer.valueOf(iHashCode2), getpostalcode3));
                                                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0Popup$lambda$0.invoke(getpostalcode3, 0);
                                                getpostalcode3.IconCompatParcelizer(true);
                                                return;
                                            }
                                            SentryUUID.write();
                                            throw null;
                                        }
                                        getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                                    }

                                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                                        invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                                        return createFromParcel.INSTANCE;
                                    }
                                }, getpostalcode2), getpostalcode2, 56);
                                return;
                            }
                            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        }

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                            return createFromParcel.INSTANCE;
                        }
                    }, true, -297523940));
                    getpostalcode.write(popupLayout4);
                    objComponentActivity2 = popupLayout4;
                } else {
                    z2 = true;
                    z3 = false;
                }
                popupLayout = (PopupLayout) objComponentActivity2;
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(popupLayout);
                i7 = i6 & 112;
                if (i7 == 32) {
                    z4 = z2;
                } else {
                    z4 = z3;
                }
                i8 = i6 & 896;
                if (i8 == 256) {
                    z5 = z2;
                } else {
                    z5 = z3;
                }
                z6 = getpostalcode.read(str);
                z7 = getpostalcode.read(layoutDirection.ordinal());
                objComponentActivity3 = getpostalcode.ComponentActivity();
                if (!(zIconCompatParcelizer | z4 | z5 | z6 | z7)) {
                    final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k9 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
                    final PopupProperties popupProperties11 = popupProperties4;
                    objComponentActivity3 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public final getPersonMiddleInitial invoke(getPersonNamePrefix getpersonnameprefix) {
                            popupLayout.show();
                            popupLayout.updateParameters(r8lambdardpfsr94j4iebcwx_kpqzpm8k9, popupProperties11, str, layoutDirection);
                            final PopupLayout popupLayout5 = popupLayout;
                            return new getPersonMiddleInitial() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1
                                @Override // o.getPersonMiddleInitial
                                public void dispose() {
                                    popupLayout5.disposeComposition();
                                    popupLayout5.dismiss();
                                }
                            };
                        }
                    };
                    getpostalcode.write(objComponentActivity3);
                } else {
                    final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k10 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
                    final PopupProperties popupProperties12 = popupProperties4;
                    objComponentActivity3 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public final getPersonMiddleInitial invoke(getPersonNamePrefix getpersonnameprefix) {
                            popupLayout.show();
                            popupLayout.updateParameters(r8lambdardpfsr94j4iebcwx_kpqzpm8k10, popupProperties12, str, layoutDirection);
                            final PopupLayout popupLayout5 = popupLayout;
                            return new getPersonMiddleInitial() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1
                                @Override // o.getPersonMiddleInitial
                                public void dispose() {
                                    popupLayout5.disposeComposition();
                                    popupLayout5.dismiss();
                                }
                            };
                        }
                    };
                    getpostalcode.write(objComponentActivity3);
                }
                getPhoneNumberNational.serializer(popupLayout, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, getpostalcode);
                zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(popupLayout);
                if (i7 == 32) {
                    z8 = true;
                } else {
                    z8 = z3;
                }
                if (i8 == 256) {
                    z9 = true;
                } else {
                    z9 = z3;
                }
                z10 = getpostalcode.read(str);
                z11 = getpostalcode.read(layoutDirection.ordinal());
                objComponentActivity4 = getpostalcode.ComponentActivity();
                if (!(zIconCompatParcelizer2 | z8 | z9 | z10 | z11)) {
                    final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k11 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
                    final PopupProperties popupProperties13 = popupProperties4;
                    objComponentActivity4 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m3939invoke() {
                            popupLayout.updateParameters(r8lambdardpfsr94j4iebcwx_kpqzpm8k11, popupProperties13, str, layoutDirection);
                        }

                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m3939invoke();
                            return createFromParcel.INSTANCE;
                        }
                    };
                    getpostalcode.write(objComponentActivity4);
                } else {
                    final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k12 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
                    final PopupProperties popupProperties14 = popupProperties4;
                    objComponentActivity4 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m3939invoke() {
                            popupLayout.updateParameters(r8lambdardpfsr94j4iebcwx_kpqzpm8k12, popupProperties14, str, layoutDirection);
                        }

                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public /* bridge */ /* synthetic */ Object invoke() {
                            m3939invoke();
                            return createFromParcel.INSTANCE;
                        }
                    };
                    getpostalcode.write(objComponentActivity4);
                }
                getPhoneNumberNational.write((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity4, getpostalcode);
                zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(popupLayout);
                if ((i6 & 14) == 4) {
                    z12 = true;
                } else {
                    z12 = z3;
                }
                objComponentActivity5 = getpostalcode.ComponentActivity();
                if (!(zIconCompatParcelizer3 | z12)) {
                    objComponentActivity5 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public final getPersonMiddleInitial invoke(getPersonNamePrefix getpersonnameprefix) {
                            popupLayout.setPositionProvider(popupPositionProvider);
                            popupLayout.updatePosition();
                            return new getPersonMiddleInitial() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1$invoke$$inlined$onDispose$1
                                @Override // o.getPersonMiddleInitial
                                public void dispose() {
                                }
                            };
                        }
                    };
                    getpostalcode.write(objComponentActivity5);
                } else {
                    objComponentActivity5 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public final getPersonMiddleInitial invoke(getPersonNamePrefix getpersonnameprefix) {
                            popupLayout.setPositionProvider(popupPositionProvider);
                            popupLayout.updatePosition();
                            return new getPersonMiddleInitial() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1$invoke$$inlined$onDispose$1
                                @Override // o.getPersonMiddleInitial
                                public void dispose() {
                                }
                            };
                        }
                    };
                    getpostalcode.write(objComponentActivity5);
                }
                getPhoneNumberNational.serializer(popupPositionProvider, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity5, getpostalcode);
                zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(popupLayout);
                objComponentActivity6 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer4) {
                    th = null;
                    objComponentActivity6 = new AndroidPopup_androidKt$Popup$5$1(popupLayout, null);
                    getpostalcode.write(objComponentActivity6);
                } else {
                    th = null;
                    objComponentActivity6 = new AndroidPopup_androidKt$Popup$5$1(popupLayout, null);
                    getpostalcode.write(objComponentActivity6);
                }
                getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, popupLayout, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity6);
                Modifier.Companion companion4 = Modifier.Companion;
                zIconCompatParcelizer5 = getpostalcode.IconCompatParcelizer(popupLayout);
                objComponentActivity7 = getpostalcode.ComponentActivity();
                if (!zIconCompatParcelizer5) {
                    objComponentActivity7 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
                        {
                            super(1);
                        }

                        public final void invoke(LayoutCoordinates layoutCoordinates) {
                            LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
                            parentLayoutCoordinates.getClass();
                            popupLayout.updateParentLayoutCoordinates(parentLayoutCoordinates);
                        }

                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((LayoutCoordinates) obj);
                            return createFromParcel.INSTANCE;
                        }
                    };
                    getpostalcode.write(objComponentActivity7);
                } else {
                    objComponentActivity7 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
                        {
                            super(1);
                        }

                        public final void invoke(LayoutCoordinates layoutCoordinates) {
                            LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
                            parentLayoutCoordinates.getClass();
                            popupLayout.updateParentLayoutCoordinates(parentLayoutCoordinates);
                        }

                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((LayoutCoordinates) obj);
                            return createFromParcel.INSTANCE;
                        }
                    };
                    getpostalcode.write(objComponentActivity7);
                }
                Modifier modifierOnGloballyPositioned3 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity7);
                zIconCompatParcelizer6 = getpostalcode.IconCompatParcelizer(popupLayout);
                z13 = getpostalcode.read(layoutDirection.ordinal());
                objComponentActivity8 = getpostalcode.ComponentActivity();
                if (!(zIconCompatParcelizer6 | z13)) {
                    objComponentActivity8 = new MeasurePolicy() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        /* JADX INFO: renamed from: measure-3p2s80s */
                        public final MeasureResult mo6measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                            popupLayout.setParentLayoutDirection(layoutDirection);
                            return MeasureScope.layout$default(measureScope, 0, 0, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1.1
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
                    getpostalcode.write(objComponentActivity8);
                } else {
                    objComponentActivity8 = new MeasurePolicy() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        /* JADX INFO: renamed from: measure-3p2s80s */
                        public final MeasureResult mo6measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                            popupLayout.setParentLayoutDirection(layoutDirection);
                            return MeasureScope.layout$default(measureScope, 0, 0, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1.1
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
                    getpostalcode.write(objComponentActivity8);
                }
                measurePolicy = (MeasurePolicy) objComponentActivity8;
                iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierOnGloballyPositioned3);
                companion = ComposeUiNode.Companion;
                constructor = companion.getConstructor();
                if (getpostalcode.read != null) {
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                    getpostalcode.IconCompatParcelizer(true);
                    r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
                    popupProperties3 = popupProperties4;
                } else {
                    SentryUUID.write();
                    throw th;
                }
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                popupProperties3 = popupProperties2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt.Popup.9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void invoke(getBirthDateFull getbirthdatefull2, int i11) throws Throwable {
                        AndroidPopup_androidKt.Popup(popupPositionProvider, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, popupProperties3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                    }

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                        invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                        return createFromParcel.INSTANCE;
                    }
                };
            }
        }
        i3 |= 384;
        popupProperties2 = popupProperties;
        if ((i & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                i9 = Fields.CameraDistance;
            } else {
                i9 = Fields.RotationZ;
            }
            i3 |= i9;
        }
        i6 = i3;
        if ((i6 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i6 & 1, z)) {
            if (i10 != 0) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = null;
            } else {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
            }
            if (i4 != 0) {
                popupProperties4 = new PopupProperties(false, false, false, false, false, 31, (DefaultConstructorMarker) null);
            } else {
                popupProperties4 = popupProperties2;
            }
            view = (View) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalView());
            density = (Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
            str = (String) getpostalcode.write((getNewPassword) LocalPopupTestTag);
            layoutDirection = (LayoutDirection) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalLayoutDirection());
            gapComposer$CompositionContextImplRemoteActionCompatParcelizer = SentryUUID.RemoteActionCompatParcelizer(getpostalcode);
            populateViewStructure_androidKtpopulate7Serializer = CompositionKt.serializer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getpostalcode);
            Object[] objArr4 = new Object[0];
            objComponentActivity = getpostalcode.ComponentActivity();
            androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1$1
                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final UUID invoke() {
                        return UUID.randomUUID();
                    }
                };
                getpostalcode.write(objComponentActivity);
            }
            uuid = (UUID) getEventType.IconCompatParcelizer(objArr4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 48);
            zBooleanValue = ((Boolean) getpostalcode.write((getNewPassword) LocalIsInPopupLayout)).booleanValue();
            objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                z3 = false;
                final PopupLayout popupLayout5 = new PopupLayout(r8lambdardpfsr94j4iebcwx_kpqzpm8k2, popupProperties4, str, view, density, popupPositionProvider, uuid, zBooleanValue, null, Fields.RotationX, null);
                z2 = true;
                popupLayout5.setContent(gapComposer$CompositionContextImplRemoteActionCompatParcelizer, new DragAndDropTargetModifierNode(new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void invoke(getBirthDateFull getbirthdatefull2, int i11) {
                        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                        if (getpostalcode2.write(i11 & 1, (i11 & 3) != 2)) {
                            hideTranslatedText hidetranslatedtextWrite = AndroidPopup_androidKt.getLocalIsInPopupLayout().write(Boolean.TRUE);
                            final PopupLayout popupLayout6 = popupLayout5;
                            final onViewAttachedToWindow onviewattachedtowindow = populateViewStructure_androidKtpopulate7Serializer;
                            AndroidContentCaptureManagerCompanion.read(hidetranslatedtextWrite, ExtrasKt.write(1022273628, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                public final void invoke(getBirthDateFull getbirthdatefull3, int i12) {
                                    getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull3;
                                    if (getpostalcode3.write(i12 & 1, (i12 & 3) != 2)) {
                                        Modifier.Companion companion5 = Modifier.Companion;
                                        Object objComponentActivity9 = getpostalcode3.ComponentActivity();
                                        AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
                                        if (objComponentActivity9 == androidContentCaptureManager2) {
                                            objComponentActivity9 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$1$1
                                                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                                    invoke((SemanticsPropertyReceiver) obj);
                                                    return createFromParcel.INSTANCE;
                                                }

                                                public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                                    SemanticsPropertiesKt.popup(semanticsPropertyReceiver);
                                                }
                                            };
                                            getpostalcode3.write(objComponentActivity9);
                                        }
                                        Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion5, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity9, 1, null);
                                        boolean zIconCompatParcelizer7 = getpostalcode3.IconCompatParcelizer(popupLayout6);
                                        final PopupLayout popupLayout7 = popupLayout6;
                                        Object objComponentActivity10 = getpostalcode3.ComponentActivity();
                                        if (zIconCompatParcelizer7 || objComponentActivity10 == androidContentCaptureManager2) {
                                            objComponentActivity10 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1$1$2$1
                                                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                                public /* synthetic */ Object invoke(Object obj) {
                                                    m3940invokeozmzZPI(((IntSize) obj).m3848unboximpl());
                                                    return createFromParcel.INSTANCE;
                                                }

                                                /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
                                                public final void m3940invokeozmzZPI(long j) {
                                                    popupLayout7.m3943setPopupContentSizefhxjrPA(IntSize.m3836boximpl(j));
                                                    popupLayout7.updatePosition();
                                                }

                                                {
                                                    super(1);
                                                }
                                            };
                                            getpostalcode3.write(objComponentActivity10);
                                        }
                                        Modifier modifierAlpha = AlphaKt.alpha(OnRemeasuredModifierKt.onSizeChanged(modifierSemantics$default, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity10), popupLayout6.getCanCalculatePosition() ? 1.0f : 0.0f);
                                        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0Popup$lambda$0 = AndroidPopup_androidKt.Popup$lambda$0(onviewattachedtowindow);
                                        Object objComponentActivity11 = getpostalcode3.ComponentActivity();
                                        if (objComponentActivity11 == androidContentCaptureManager2) {
                                            objComponentActivity11 = AndroidPopup_androidKt$SimpleStack$1$1.INSTANCE;
                                            getpostalcode3.write(objComponentActivity11);
                                        }
                                        MeasurePolicy measurePolicy2 = (MeasurePolicy) objComponentActivity11;
                                        int iHashCode2 = Long.hashCode(getpostalcode3.RatingCompat);
                                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode3.serializer();
                                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode3, modifierAlpha);
                                        ComposeUiNode.Companion companion6 = ComposeUiNode.Companion;
                                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion6.getConstructor();
                                        if (getpostalcode3.read != null) {
                                            getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                                            if (getpostalcode3.ComponentActivity) {
                                                getpostalcode3.serializer(constructor2);
                                            } else {
                                                getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                                            }
                                            af$$ExternalSyntheticOutline0.m(companion6, getpostalcode3, measurePolicy2, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                                            AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion6, getpostalcode3, Integer.valueOf(iHashCode2), getpostalcode3));
                                            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0Popup$lambda$0.invoke(getpostalcode3, 0);
                                            getpostalcode3.IconCompatParcelizer(true);
                                            return;
                                        }
                                        SentryUUID.write();
                                        throw null;
                                    }
                                    getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                                }

                                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                                    invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                                    return createFromParcel.INSTANCE;
                                }
                            }, getpostalcode2), getpostalcode2, 56);
                            return;
                        }
                        getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                        return createFromParcel.INSTANCE;
                    }
                }, true, -297523940));
                getpostalcode.write(popupLayout5);
                objComponentActivity2 = popupLayout5;
            } else {
                z2 = true;
                z3 = false;
            }
            popupLayout = (PopupLayout) objComponentActivity2;
            zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(popupLayout);
            i7 = i6 & 112;
            if (i7 == 32) {
                z4 = z2;
            } else {
                z4 = z3;
            }
            i8 = i6 & 896;
            if (i8 == 256) {
                z5 = z2;
            } else {
                z5 = z3;
            }
            z6 = getpostalcode.read(str);
            z7 = getpostalcode.read(layoutDirection.ordinal());
            objComponentActivity3 = getpostalcode.ComponentActivity();
            if (!(zIconCompatParcelizer | z4 | z5 | z6 | z7)) {
                final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k13 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
                final PopupProperties popupProperties15 = popupProperties4;
                objComponentActivity3 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final getPersonMiddleInitial invoke(getPersonNamePrefix getpersonnameprefix) {
                        popupLayout.show();
                        popupLayout.updateParameters(r8lambdardpfsr94j4iebcwx_kpqzpm8k13, popupProperties15, str, layoutDirection);
                        final PopupLayout popupLayout6 = popupLayout;
                        return new getPersonMiddleInitial() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1
                            @Override // o.getPersonMiddleInitial
                            public void dispose() {
                                popupLayout6.disposeComposition();
                                popupLayout6.dismiss();
                            }
                        };
                    }
                };
                getpostalcode.write(objComponentActivity3);
            } else {
                final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k14 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
                final PopupProperties popupProperties16 = popupProperties4;
                objComponentActivity3 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final getPersonMiddleInitial invoke(getPersonNamePrefix getpersonnameprefix) {
                        popupLayout.show();
                        popupLayout.updateParameters(r8lambdardpfsr94j4iebcwx_kpqzpm8k14, popupProperties16, str, layoutDirection);
                        final PopupLayout popupLayout6 = popupLayout;
                        return new getPersonMiddleInitial() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1
                            @Override // o.getPersonMiddleInitial
                            public void dispose() {
                                popupLayout6.disposeComposition();
                                popupLayout6.dismiss();
                            }
                        };
                    }
                };
                getpostalcode.write(objComponentActivity3);
            }
            getPhoneNumberNational.serializer(popupLayout, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, getpostalcode);
            zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(popupLayout);
            if (i7 == 32) {
                z8 = true;
            } else {
                z8 = z3;
            }
            if (i8 == 256) {
                z9 = true;
            } else {
                z9 = z3;
            }
            z10 = getpostalcode.read(str);
            z11 = getpostalcode.read(layoutDirection.ordinal());
            objComponentActivity4 = getpostalcode.ComponentActivity();
            if (!(zIconCompatParcelizer2 | z8 | z9 | z10 | z11)) {
                final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k15 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
                final PopupProperties popupProperties17 = popupProperties4;
                objComponentActivity4 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m3939invoke() {
                        popupLayout.updateParameters(r8lambdardpfsr94j4iebcwx_kpqzpm8k15, popupProperties17, str, layoutDirection);
                    }

                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m3939invoke();
                        return createFromParcel.INSTANCE;
                    }
                };
                getpostalcode.write(objComponentActivity4);
            } else {
                final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k16 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
                final PopupProperties popupProperties18 = popupProperties4;
                objComponentActivity4 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m3939invoke() {
                        popupLayout.updateParameters(r8lambdardpfsr94j4iebcwx_kpqzpm8k16, popupProperties18, str, layoutDirection);
                    }

                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m3939invoke();
                        return createFromParcel.INSTANCE;
                    }
                };
                getpostalcode.write(objComponentActivity4);
            }
            getPhoneNumberNational.write((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity4, getpostalcode);
            zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(popupLayout);
            if ((i6 & 14) == 4) {
                z12 = true;
            } else {
                z12 = z3;
            }
            objComponentActivity5 = getpostalcode.ComponentActivity();
            if (!(zIconCompatParcelizer3 | z12)) {
                objComponentActivity5 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final getPersonMiddleInitial invoke(getPersonNamePrefix getpersonnameprefix) {
                        popupLayout.setPositionProvider(popupPositionProvider);
                        popupLayout.updatePosition();
                        return new getPersonMiddleInitial() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1$invoke$$inlined$onDispose$1
                            @Override // o.getPersonMiddleInitial
                            public void dispose() {
                            }
                        };
                    }
                };
                getpostalcode.write(objComponentActivity5);
            } else {
                objComponentActivity5 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final getPersonMiddleInitial invoke(getPersonNamePrefix getpersonnameprefix) {
                        popupLayout.setPositionProvider(popupPositionProvider);
                        popupLayout.updatePosition();
                        return new getPersonMiddleInitial() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1$invoke$$inlined$onDispose$1
                            @Override // o.getPersonMiddleInitial
                            public void dispose() {
                            }
                        };
                    }
                };
                getpostalcode.write(objComponentActivity5);
            }
            getPhoneNumberNational.serializer(popupPositionProvider, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity5, getpostalcode);
            zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(popupLayout);
            objComponentActivity6 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer4) {
                th = null;
                objComponentActivity6 = new AndroidPopup_androidKt$Popup$5$1(popupLayout, null);
                getpostalcode.write(objComponentActivity6);
            } else {
                th = null;
                objComponentActivity6 = new AndroidPopup_androidKt$Popup$5$1(popupLayout, null);
                getpostalcode.write(objComponentActivity6);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, popupLayout, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity6);
            Modifier.Companion companion5 = Modifier.Companion;
            zIconCompatParcelizer5 = getpostalcode.IconCompatParcelizer(popupLayout);
            objComponentActivity7 = getpostalcode.ComponentActivity();
            if (!zIconCompatParcelizer5) {
                objComponentActivity7 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
                    {
                        super(1);
                    }

                    public final void invoke(LayoutCoordinates layoutCoordinates) {
                        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
                        parentLayoutCoordinates.getClass();
                        popupLayout.updateParentLayoutCoordinates(parentLayoutCoordinates);
                    }

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((LayoutCoordinates) obj);
                        return createFromParcel.INSTANCE;
                    }
                };
                getpostalcode.write(objComponentActivity7);
            } else {
                objComponentActivity7 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
                    {
                        super(1);
                    }

                    public final void invoke(LayoutCoordinates layoutCoordinates) {
                        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
                        parentLayoutCoordinates.getClass();
                        popupLayout.updateParentLayoutCoordinates(parentLayoutCoordinates);
                    }

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((LayoutCoordinates) obj);
                        return createFromParcel.INSTANCE;
                    }
                };
                getpostalcode.write(objComponentActivity7);
            }
            Modifier modifierOnGloballyPositioned4 = OnGloballyPositionedModifierKt.onGloballyPositioned(companion5, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity7);
            zIconCompatParcelizer6 = getpostalcode.IconCompatParcelizer(popupLayout);
            z13 = getpostalcode.read(layoutDirection.ordinal());
            objComponentActivity8 = getpostalcode.ComponentActivity();
            if (!(zIconCompatParcelizer6 | z13)) {
                objComponentActivity8 = new MeasurePolicy() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final MeasureResult mo6measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                        popupLayout.setParentLayoutDirection(layoutDirection);
                        return MeasureScope.layout$default(measureScope, 0, 0, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1.1
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
                getpostalcode.write(objComponentActivity8);
            } else {
                objComponentActivity8 = new MeasurePolicy() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final MeasureResult mo6measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
                        popupLayout.setParentLayoutDirection(layoutDirection);
                        return MeasureScope.layout$default(measureScope, 0, 0, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1.1
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
                getpostalcode.write(objComponentActivity8);
            }
            measurePolicy = (MeasurePolicy) objComponentActivity8;
            iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierOnGloballyPositioned4);
            companion = ComposeUiNode.Companion;
            constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                getpostalcode.IconCompatParcelizer(true);
                r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
                popupProperties3 = popupProperties4;
            } else {
                SentryUUID.write();
                throw th;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            popupProperties3 = popupProperties2;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt.Popup.9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void invoke(getBirthDateFull getbirthdatefull2, int i11) throws Throwable {
                    AndroidPopup_androidKt.Popup(popupPositionProvider, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, popupProperties3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1), i2);
                }

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
                    invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                    return createFromParcel.INSTANCE;
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int createFlags(boolean z, SecureFlagPolicy secureFlagPolicy, boolean z2) {
        int i = !z ? 262152 : 262144;
        if (secureFlagPolicy == SecureFlagPolicy.SecureOn) {
            i |= 8192;
        }
        return !z2 ? i | Fields.RotationY : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int flagsWithSecureFlagInherited(PopupProperties popupProperties, boolean z) {
        if (popupProperties.getInheritSecurePolicy$ui() && z) {
            return popupProperties.getFlags$ui() | 8192;
        }
        return (!popupProperties.getInheritSecurePolicy$ui() || z) ? popupProperties.getFlags$ui() : popupProperties.getFlags$ui() & (-8193);
    }
}
