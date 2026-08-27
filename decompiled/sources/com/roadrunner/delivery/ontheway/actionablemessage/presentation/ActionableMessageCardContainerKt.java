package com.roadrunner.delivery.ontheway.actionablemessage.presentation;

import android.os.Build;
import android.view.View;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerDefaults$$ExternalSyntheticLambda0;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.font.PlatformFontVariationSettings_androidKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda2;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda12;
import com.roadrunner.delivery.ontheway.actionablemessage.presentation.ActionableMessageCardContainerKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import java.util.List;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidFontTypefaceLoader;
import o.AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl;
import o.ArrangementVertical;
import o.BoxMeasurePolicy;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PopulateViewStructure_androidKtpopulate7;
import o.SweepGradientShader9KIMszo;
import o.SystemLifecycle;
import o.TapGestureDetectorKt;
import o.TapGestureDetectorKtprocessTapGestureresetJob1;
import o.UiMediaScopeImpl;
import o.accessgetTextCentercp;
import o.buildMapping;
import o.foregroundOrElseBackgroundCached;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getCurrentSessionimpl;
import o.getHandleruiannotations;
import o.getImplui_graphics;
import o.getNewPassword;
import o.getPointerPrecisionfpxItnM;
import o.getPostalCode;
import o.getQueryParameterslambda2;
import o.getTabletopm18o9QQ;
import o.getTopLeftnOccac;
import o.handleUrlOverridelambda1;
import o.invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2;
import o.isReleased;
import o.onKeyEventZmokQxo;
import o.onViewAttachedToWindow;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafDO76o9OYYvjKpysJSsx90eBs8;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.recordmLhObY;
import o.releaseui_graphics;
import o.requiredWidth3ABfNKs;
import o.requiredWidthInVpY3zN4default;
import o.setPivotOffsetk4lQ0M;
import o.tryMinWidthJN0ABg;
import o.width;
import o.withSessionCancellingPreviousimpl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ActionableMessageCardContainerKt {
    private static int IconCompatParcelizer = 1;
    public static final /* synthetic */ int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write;

    static {
        getImplui_graphics getimplui_graphics = new getImplui_graphics("Text of the message", "1 min ago");
        SQLite.read("Okay", "Sure, will be there", "Almost there");
        int iSerializer = getQueryParameterslambda2.serializer();
        int iSerializer2 = getQueryParameterslambda2.serializer();
        int iSerializer3 = getQueryParameterslambda2.serializer();
        int iSerializer4 = getQueryParameterslambda2.serializer();
        int iSerializer5 = getQueryParameterslambda2.serializer();
        int iSerializer6 = getQueryParameterslambda2.serializer();
        int iSerializer7 = getQueryParameterslambda2.serializer();
        int iSerializer8 = getQueryParameterslambda2.serializer();
        int i = IconCompatParcelizer + 5;
        read = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    public static final void BackgroundCard(getTopLeftnOccac gettopleftnoccac, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean zIconCompatParcelizer;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1446378166);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode.read(gettopleftnoccac);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(gettopleftnoccac);
                int i6 = serializer + 97;
                write = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            }
            if (zIconCompatParcelizer) {
                int i8 = serializer + 123;
                write = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    i3 = 2;
                } else {
                    i3 = 4;
                }
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(modifier) ? 32 : 16;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 19) != 18)) {
            getCurrentSessionimpl.read(PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(modifier, 1.0f), Dimensions.setLogo, 0.0f, Dimensions.getNestedScrollAxes, 0.0f, 10), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.accessensureViewModelStore), withSessionCancellingPreviousimpl.serializer(((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).MediaDescriptionCompat(), getpostalcode, 0), withSessionCancellingPreviousimpl.RemoteActionCompatParcelizer(Dimensions.read, 62), null, ExtrasKt.write(-1541266648, new SubcomposeAsyncImageKt$$ExternalSyntheticLambda2(12, gettopleftnoccac), getpostalcode), getpostalcode, 196608, 16);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidFontTypefaceLoader(i, i4, gettopleftnoccac, modifier);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX WARN: Code duplicated, block: B:12:0x0039  */
    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Code duplicated, block: B:15:0x004a  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e A[PHI: r1
  0x004e: PHI (r1v18 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v20 o.getPostalCode) binds: [B:8:0x002e, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0030 A[PHI: r1
  0x0030: PHI (r1v6 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v20 o.getPostalCode) binds: [B:8:0x002e, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void serializer(getTopLeftnOccac gettopleftnoccac, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        getPostalCode getpostalcode2;
        getPostalCode getpostalcode3;
        Modifier modifier2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        int i9 = serializer + 49;
        write = i9 % Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1087353748);
            if ((i & 127) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(gettopleftnoccac);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(gettopleftnoccac);
                }
                if (zIconCompatParcelizer) {
                    int i10 = write + 57;
                    serializer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1087353748);
            if ((i & 6) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(gettopleftnoccac);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(gettopleftnoccac);
                }
                if (zIconCompatParcelizer) {
                    int i12 = write + 57;
                    serializer = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode2.write(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (!(!getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0))) {
                int i14 = serializer + 83;
                write = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                i7 = Fields.RotationX;
            } else {
                i7 = Fields.SpotShadowColor;
            }
            i3 |= i7;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i16 = serializer + 65;
                write = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                i6 = Fields.CameraDistance;
            } else {
                i6 = Fields.RotationZ;
            }
            i3 |= i6;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2)) {
                int i18 = serializer + 63;
                write = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                i5 = Fields.Clip;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        }
        if ((196608 & i) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                int i20 = serializer + 89;
                write = i20 % Fields.SpotShadowColor;
                if (i20 % 2 != 0) {
                    int i21 = 29 / 0;
                }
                i4 = Fields.RenderEffect;
            } else {
                i4 = 65536;
            }
            i3 |= i4;
        }
        int i22 = 1572864 | i3;
        if (getpostalcode2.write(i22 & 1, (599187 & i22) != 599186)) {
            modifier2 = Modifier.Companion;
            int i23 = i22 >> 3;
            AnimatedVisibilityKt.RemoteActionCompatParcelizer(z, null, onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) null, 3), TapGestureDetectorKt.RemoteActionCompatParcelizer, null, ExtrasKt.write(1661133420, new PagerDefaults$$ExternalSyntheticLambda0(gettopleftnoccac, 9, r8lambdardpfsr94j4iebcwx_kpqzpm8k1), getpostalcode2), getpostalcode2, (i23 & 14) | 196992, 18);
            if (!z) {
                getpostalcode2.serializer(712823731);
                getpostalcode3 = getpostalcode2;
                CardContent(gettopleftnoccac, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier2, getpostalcode3, (i23 & 896) | (i22 & 14) | (i23 & 112) | (i23 & 7168) | ((i22 >> 6) & 57344));
                getpostalcode3.IconCompatParcelizer(false);
            } else {
                getpostalcode3 = getpostalcode2;
                getpostalcode3.serializer(713095694);
                getpostalcode3.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode3 = getpostalcode2;
            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode3.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getTabletopm18o9QQ(gettopleftnoccac, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0085  */
    /* JADX WARN: Code duplicated, block: B:40:0x0088  */
    public static final void CardContent(getTopLeftnOccac gettopleftnoccac, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        boolean zIconCompatParcelizer;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1135985375);
        if ((i & 6) == 0) {
            int i6 = serializer + 19;
            write = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0 ? (i & 8) == 0 : (i & 15) == 0) {
                zIconCompatParcelizer = getpostalcode.read(gettopleftnoccac);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(gettopleftnoccac);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i7 = serializer + 113;
            write = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                    i4 = 32;
                } else {
                    i4 = 16;
                }
            } else {
                int i8 = 93 / 0;
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                    i4 = 32;
                } else {
                    i4 = 16;
                }
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            int i9 = serializer + 31;
            write = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                    i3 = Fields.RotationX;
                } else {
                    i3 = Fields.SpotShadowColor;
                }
            } else {
                int i10 = 89 / 0;
                if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                    i3 = Fields.RotationX;
                } else {
                    i3 = Fields.SpotShadowColor;
                }
            }
            i2 |= i3;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.Clip : 8192;
        }
        if (!(!getpostalcode.write(i2 & 1, (i2 & 9363) != 9362))) {
            float f = Dimensions.getNestedScrollAxes;
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(modifier, 0.0f, f, 0.0f, 0.0f, 13);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM74paddingqDBjuR0$default);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                boolean z2 = gettopleftnoccac instanceof recordmLhObY;
                if (z2) {
                    getpostalcode.serializer(1932652997);
                    ActionableMessageCardComponentsKt.CustomerHeaderRow((recordmLhObY) gettopleftnoccac, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, Dimensions.setHideOnContentScrollEnabled, 0.0f, f, 0.0f, 10), getpostalcode, i2 & 126);
                    getpostalcode.IconCompatParcelizer(false);
                } else if (gettopleftnoccac instanceof setPivotOffsetk4lQ0M) {
                    getpostalcode.serializer(1933092949);
                    ActionableMessageCardComponentsKt.DispatcherHeaderRow((i2 >> 3) & 14, getpostalcode, PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(Modifier.Companion, 1.0f), Dimensions.setHideOnContentScrollEnabled, 0.0f, 0.0f, 0.0f, 14), ((setPivotOffsetk4lQ0M) gettopleftnoccac).write, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 62341338, false);
                }
                Modifier.Companion companion2 = Modifier.Companion;
                int i11 = i2 & 14;
                ActionableMessageCardComponentsKt.MessageRow(gettopleftnoccac, r8lambdaunavo3sxub_pc9xroryotnrlvsm, PaddingKt.m74paddingqDBjuR0$default(companion2, Dimensions.setHideOnContentScrollEnabled, 0.0f, Dimensions.setMenu, 0.0f, 10), getpostalcode, ((i2 >> 3) & 112) | i11);
                if (z2) {
                    getpostalcode.serializer(1933830966);
                    recordmLhObY recordmlhoby = (recordmLhObY) gettopleftnoccac;
                    List list = recordmlhoby.serializer;
                    if (list != null && !list.isEmpty()) {
                        getpostalcode.serializer(1933949820);
                        ActionableMessageCardComponentsKt.QuickRepliesRow(recordmlhoby, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, null, getpostalcode, ((i2 >> 6) & 112) | i11);
                        z = false;
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(62392542);
                        ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, PaddingKt.m74paddingqDBjuR0$default(companion2, 0.0f, 0.0f, f, f, 3)});
                        z = false;
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    getpostalcode.IconCompatParcelizer(z);
                } else if (gettopleftnoccac instanceof setPivotOffsetk4lQ0M) {
                    int i12 = write + 47;
                    serializer = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    getpostalcode.serializer(1934322564);
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, PaddingKt.m74paddingqDBjuR0$default(companion2, 0.0f, 0.0f, f, Dimensions.setActionBarVisibilityCallback, 3)});
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 62379098, false);
                }
                int i14 = write + 105;
                serializer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getPointerPrecisionfpxItnM((Object) gettopleftnoccac, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier, i, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0044  */
    /* JADX WARN: Code duplicated, block: B:12:0x0049  */
    /* JADX WARN: Code duplicated, block: B:14:0x004f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0051  */
    /* JADX WARN: Code duplicated, block: B:17:0x0055 A[PHI: r1
  0x0055: PHI (r1v77 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v79 o.getPostalCode) binds: [B:8:0x003e, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0040 A[PHI: r1
  0x0040: PHI (r1v6 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v79 o.getPostalCode) binds: [B:8:0x003e, B:5:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void ActionableMessageCardContainer(getTopLeftnOccac gettopleftnoccac, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, Modifier modifier, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        getPostalCode getpostalcode2;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = write + 63;
        serializer = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-504167476);
            if ((i & 1) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(gettopleftnoccac);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(gettopleftnoccac);
                }
                if (zIconCompatParcelizer) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        } else {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-504167476);
            if ((i & 6) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(gettopleftnoccac);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(gettopleftnoccac);
                }
                if (zIconCompatParcelizer) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                getpostalcode2 = getpostalcode;
            } else {
                getpostalcode2 = getpostalcode;
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i9 = write + 25;
            serializer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2)) {
                int i11 = serializer + 103;
                write = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i6 = Fields.CameraDistance;
            } else {
                i6 = Fields.RotationZ;
            }
            i3 |= i6;
            int i13 = serializer + 3;
            write = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode2.read(modifier)) {
                int i15 = write + 119;
                serializer = i15 % Fields.SpotShadowColor;
                i5 = i15 % 2 == 0 ? 5377 : Fields.Clip;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        }
        if ((196608 & i) == 0) {
            i3 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2)) {
                int i16 = serializer + 87;
                write = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                i4 = 1048576;
            } else {
                i4 = Fields.BlendMode;
            }
            i3 |= i4;
        }
        if (getpostalcode2.write(i3 & 1, (599187 & i3) != 599186)) {
            int i18 = write + 21;
            serializer = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            final Density density = (Density) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
            int iMo42roundToPx0680j_4 = density.mo42roundToPx0680j_4(Dimensions.getNestedScrollAxes);
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                int i20 = write + 19;
                serializer = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                objComponentActivity = CompositionKt.RemoteActionCompatParcelizer(Dp.m3671boximpl(Dimensions.getActionView));
                getpostalcode2.write(objComponentActivity);
            }
            final PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity;
            Alignment.Companion companion = Alignment.Companion;
            Alignment bottomCenter = companion.getBottomCenter();
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            MeasurePolicy measurePolicy = BoxKt.read(bottomCenter, false);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!getpostalcode2.ComponentActivity) {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            } else {
                getpostalcode2.serializer(constructor);
            }
            af$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            if ((!(gettopleftnoccac instanceof recordmLhObY)) || !(((recordmLhObY) gettopleftnoccac).RatingCompat instanceof isReleased)) {
                z = false;
            } else {
                int i22 = serializer + 39;
                write = i22 % Fields.SpotShadowColor;
                int i23 = i22 % 2;
                z = true;
            }
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierWrite2 = SizeKt.write(companion3, 1.0f);
            Alignment bottomCenter2 = companion.getBottomCenter();
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.serializer;
            Modifier modifierAlign = boxScopeInstance.align(modifierWrite2, bottomCenter2);
            Alignment bottomCenter3 = companion.getBottomCenter();
            SweepGradientShader9KIMszo sweepGradientShader9KIMszo = new SweepGradientShader9KIMszo(iMo42roundToPx0680j_4, 4);
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new accessgetTextCentercp(27);
                getpostalcode2.write(objComponentActivity2);
            }
            int i24 = (i3 & 14) | 1797120;
            final boolean z3 = z;
            AnimatedContentKt.write(gettopleftnoccac, modifierAlign, sweepGradientShader9KIMszo, bottomCenter3, "Message Received Bg Animation", (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, ExtrasKt.write(-1503175621, new foregroundOrElseBackgroundCached(z, populateViewStructure_androidKtpopulate7), getpostalcode2), getpostalcode2, i24, 0);
            Modifier modifierAlign2 = boxScopeInstance.align(SizeKt.write(companion3, 1.0f), companion.getBottomCenter());
            Alignment bottomCenter4 = companion.getBottomCenter();
            SweepGradientShader9KIMszo sweepGradientShader9KIMszo2 = new SweepGradientShader9KIMszo(iMo42roundToPx0680j_4, 3);
            Object objComponentActivity3 = getpostalcode2.ComponentActivity();
            if (objComponentActivity3 == androidContentCaptureManager) {
                z2 = true;
                objComponentActivity3 = new invokeSuspendcomroadrunnercustomerchatselfservicedataimageImageCacheResolverImplcacheImageFile2(1);
                getpostalcode2.write(objComponentActivity3);
            } else {
                z2 = true;
            }
            AnimatedContentKt.write(gettopleftnoccac, modifierAlign2, sweepGradientShader9KIMszo2, bottomCenter4, "Message Received Animation", (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, ExtrasKt.write(778527282, new r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds() { // from class: o.hasCompositionui_text
                private static int MediaDescriptionCompat = 0;
                private static int RatingCompat = 1;

                /* JADX WARN: Code duplicated, block: B:6:0x0039  */
                /* JADX WARN: Code duplicated, block: B:8:0x003d  */
                /* JADX WARN: Code duplicated, block: B:9:0x003f  */
                @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    boolean z4;
                    int i25 = 2 % 2;
                    getTopLeftnOccac gettopleftnoccac2 = (getTopLeftnOccac) obj2;
                    int iIntValue = ((Integer) obj4).intValue();
                    ((sendDragEventEu1f8Dk) obj).getClass();
                    gettopleftnoccac2.getClass();
                    androidx.compose.ui.Modifier.Companion companion4 = androidx.compose.ui.Modifier.Companion;
                    getPostalCode getpostalcode3 = (getPostalCode) ((getBirthDateFull) obj3);
                    androidx.compose.ui.unit.Density density2 = density;
                    boolean z5 = getpostalcode3.read(density2);
                    if (((iIntValue & 112) ^ 48) > 32) {
                        int i26 = MediaDescriptionCompat + 93;
                        RatingCompat = i26 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i27 = i26 % 2;
                        if (getpostalcode3.IconCompatParcelizer(gettopleftnoccac2)) {
                            z4 = true;
                        } else if ((iIntValue & 48) == 32) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    } else if ((iIntValue & 48) == 32) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    Object objComponentActivity4 = getpostalcode3.ComponentActivity();
                    if ((z5 | z4) || objComponentActivity4 == getCreditCardExpirationMonth.write) {
                        objComponentActivity4 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(density2, gettopleftnoccac2, populateViewStructure_androidKtpopulate7, 27);
                        getpostalcode3.write(objComponentActivity4);
                        int i28 = RatingCompat + 93;
                        MediaDescriptionCompat = i28 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i28 % 2 != 0) {
                            int i29 = 4 % 4;
                        }
                    }
                    ActionableMessageCardContainerKt.ActionableMessageCard(gettopleftnoccac2, z3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, androidx.compose.ui.layout.OnRemeasuredModifierKt.onSizeChanged(companion4, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4), getpostalcode3, (iIntValue >> 3) & 14);
                    return createFromParcel.INSTANCE;
                }
            }, getpostalcode2), getpostalcode2, i24, 0);
            getpostalcode2.IconCompatParcelizer(z2);
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode2.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new UiMediaScopeImpl(gettopleftnoccac, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, i, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:123:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:124:0x0202  */
    /* JADX WARN: Code duplicated, block: B:139:0x0253  */
    /* JADX WARN: Code duplicated, block: B:140:0x0256  */
    /* JADX WARN: Code duplicated, block: B:144:0x0264  */
    public static final void ActionableMessageCard(final getTopLeftnOccac gettopleftnoccac, final boolean z, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        boolean z2;
        int i3;
        onViewAttachedToWindow onviewattachedtowindowWrite;
        float f;
        boolean z3;
        Object objComponentActivity;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-750248401);
        if ((i & 6) == 0) {
            int i8 = write + 87;
            serializer = i8 % Fields.SpotShadowColor;
            i2 = ((i8 % 2 != 0 ? (i & 8) != 0 : (i & 74) != 0) ? getpostalcode2.IconCompatParcelizer(gettopleftnoccac) : getpostalcode2.read(gettopleftnoccac) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.write(z) ? 32 : 16;
        }
        Object obj = null;
        if ((i & 384) == 0) {
            int i9 = write + 51;
            serializer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                obj.hashCode();
                throw null;
            }
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i10 = write + 13;
                serializer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i6 = Fields.RotationX;
            } else {
                i6 = Fields.SpotShadowColor;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            int i12 = write + 115;
            serializer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 == 0) {
                getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                obj.hashCode();
                throw null;
            }
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2)) {
                int i13 = write + 87;
                serializer = i13 % Fields.SpotShadowColor;
                if (i13 % 2 == 0) {
                    int i14 = 5 / 4;
                }
                i5 = Fields.Clip;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            int i15 = serializer + 25;
            write = i15 % Fields.SpotShadowColor;
            if (i15 % 2 != 0) {
                getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                throw null;
            }
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                int i16 = write + 33;
                int i17 = i16 % Fields.SpotShadowColor;
                serializer = i17;
                int i18 = i16 % 2;
                int i19 = i17 + 125;
                write = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                i4 = Fields.RenderEffect;
            } else {
                i4 = 65536;
            }
            i2 |= i4;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i2 |= getpostalcode2.read(modifier) ? 8388608 : 4194304;
        }
        if (getpostalcode2.write(i2 & 1, (4793491 & i2) != 4793490)) {
            int i21 = (i2 & 14) | ((i2 >> 15) & 112);
            gettopleftnoccac.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
            boolean z4 = (gettopleftnoccac instanceof recordmLhObY) && (((recordmLhObY) gettopleftnoccac).RatingCompat instanceof releaseui_graphics);
            if (z4) {
                getpostalcode2.serializer(-1624708441);
                if (Build.VERSION.SDK_INT >= 30) {
                    getpostalcode2.serializer(-1624649045);
                    ((View) getpostalcode2.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalView())).performHapticFeedback(17);
                    getpostalcode2.IconCompatParcelizer(false);
                } else {
                    getpostalcode2.serializer(-1624530842);
                    getpostalcode2.IconCompatParcelizer(false);
                }
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                getpostalcode2.serializer(-1624524890);
                getpostalcode2.IconCompatParcelizer(false);
            }
            Density density = (Density) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
            long jM3795constructorimpl = z4 ? IntOffset.m3795constructorimpl(4294967296L) : IntOffset.m3795constructorimpl(0L);
            boolean z5 = getpostalcode2.read(density);
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z5 || objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new PlatformFontVariationSettings_androidKt$$ExternalSyntheticLambda0(density, 1);
                getpostalcode2.write(objComponentActivity2);
            }
            tryMinWidthJN0ABg tryminwidthjn0abg = new tryMinWidthJN0ABg();
            ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2).invoke(tryminwidthjn0abg);
            o.BoxScopeInstance boxScopeInstance = new o.BoxScopeInstance(new ArrangementVertical(tryminwidthjn0abg), BoxMeasurePolicy.Restart, 0L);
            if (((i21 & 112) ^ 48) > 32) {
                int i22 = serializer + 9;
                write = i22 % Fields.SpotShadowColor;
                if (i22 % 2 != 0) {
                    getpostalcode2.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k2);
                    throw null;
                }
                if (getpostalcode2.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k2)) {
                    z2 = true;
                } else if ((i21 & 48) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else if ((i21 & 48) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object objComponentActivity3 = getpostalcode2.ComponentActivity();
            if (z2) {
                i3 = 0;
            } else {
                int i23 = write + 47;
                serializer = i23 % Fields.SpotShadowColor;
                if (i23 % 2 == 0) {
                    i3 = 0;
                    int i24 = 72 / 0;
                    if (objComponentActivity3 == androidContentCaptureManager) {
                    }
                } else {
                    i3 = 0;
                    if (objComponentActivity3 == androidContentCaptureManager) {
                    }
                }
                width widthVar = TapGestureDetectorKtprocessTapGestureresetJob1.IconCompatParcelizer;
                int i25 = i3;
                onviewattachedtowindowWrite = TapGestureDetectorKtprocessTapGestureresetJob1.write(IntOffset.m3792boximpl(jM3795constructorimpl), requiredWidth3ABfNKs.serializer, boxScopeInstance, null, "IntOffsetAnimation", (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, getpostalcode2, 0, 8);
                if (gettopleftnoccac.IconCompatParcelizer() != null) {
                    f = Dimensions.RemoteActionCompatParcelizer;
                } else {
                    f = Dimensions.read;
                }
                z3 = getpostalcode2.read(onviewattachedtowindowWrite);
                objComponentActivity = getpostalcode2.ComponentActivity();
                if (z3 || objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new r8lambdafDO76o9OYYvjKpysJSsx90eBs8(onviewattachedtowindowWrite, 6);
                    getpostalcode2.write(objComponentActivity);
                }
                Modifier modifierWrite = SizeKt.write(OffsetKt.read(modifier, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity), 1.0f);
                float f2 = Dimensions.getNestedScrollAxes;
                float f3 = Dimensions.setActionBarVisibilityCallback;
                getpostalcode = getpostalcode2;
                getCurrentSessionimpl.read(PaddingKt.m74paddingqDBjuR0$default(modifierWrite, f3, 0.0f, f3, f2, 2), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.accessensureViewModelStore), withSessionCancellingPreviousimpl.serializer(((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).MediaDescriptionCompat(), getpostalcode2, i25), withSessionCancellingPreviousimpl.RemoteActionCompatParcelizer(f, 62), null, ExtrasKt.write(1498125309, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: o.replaceui_text
                    private static int MediaDescriptionCompat = 1;
                    private static int MediaSessionCompatQueueItem;

                    /* JADX WARN: Code duplicated, block: B:17:0x007f  */
                    /* JADX WARN: Code duplicated, block: B:18:0x0083  */
                    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i26 = 2 % 2;
                        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        ((ModalBottomSheetDialogWrapper) obj2).getClass();
                        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull2;
                        if (getpostalcode3.write(iIntValue & 1, (iIntValue & 17) != 16)) {
                            int i27 = MediaSessionCompatQueueItem + 27;
                            MediaDescriptionCompat = i27 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i28 = i27 % 2;
                            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
                            androidx.compose.ui.Alignment.Companion companion2 = androidx.compose.ui.Alignment.Companion;
                            androidx.compose.ui.Modifier modifier2 = androidx.compose.animation.AnimationModifierKt.read(companion, companion2.getBottomStart());
                            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(androidx.compose.foundation.layout.Arrangement.MediaDescriptionCompat, companion2.getStart(), getpostalcode3, 0);
                            int iHashCode = Long.hashCode(getpostalcode3.RatingCompat);
                            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
                            androidx.compose.ui.Modifier modifierMaterializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode3, modifier2);
                            androidx.compose.ui.node.ComposeUiNode.Companion companion3 = androidx.compose.ui.node.ComposeUiNode.Companion;
                            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
                            if (getpostalcode3.read == null) {
                                SentryUUID.write();
                                throw null;
                            }
                            int i29 = MediaDescriptionCompat + 117;
                            MediaSessionCompatQueueItem = i29 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i29 % 2 != 0) {
                                getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                                int i30 = 0 / 0;
                                if (!(!getpostalcode3.ComponentActivity)) {
                                    getpostalcode3.serializer(constructor);
                                } else {
                                    getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                                }
                            } else {
                                getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                                if (getpostalcode3.ComponentActivity) {
                                    getpostalcode3.serializer(constructor);
                                } else {
                                    getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                                }
                            }
                            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode3, modalBottomSheetYbuCTN8Serializer, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
                            AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode3, Integer.valueOf(iHashCode), getpostalcode3));
                            ActionableMessageCardContainerKt.serializer(gettopleftnoccac, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, null, getpostalcode3, 0);
                            getpostalcode3.IconCompatParcelizer(true);
                        } else {
                            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                            int i31 = MediaSessionCompatQueueItem + 123;
                            MediaDescriptionCompat = i31 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i32 = i31 % 2;
                        }
                        return createFromParcel.INSTANCE;
                    }
                }, getpostalcode), getpostalcode, 196608, 16);
            }
            objComponentActivity3 = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(8, r8lambdardpfsr94j4iebcwx_kpqzpm8k2);
            getpostalcode2.write(objComponentActivity3);
            width widthVar2 = TapGestureDetectorKtprocessTapGestureresetJob1.IconCompatParcelizer;
            int i26 = i3;
            onviewattachedtowindowWrite = TapGestureDetectorKtprocessTapGestureresetJob1.write(IntOffset.m3792boximpl(jM3795constructorimpl), requiredWidth3ABfNKs.serializer, boxScopeInstance, null, "IntOffsetAnimation", (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, getpostalcode2, 0, 8);
            if (gettopleftnoccac.IconCompatParcelizer() != null) {
                f = Dimensions.RemoteActionCompatParcelizer;
            } else {
                f = Dimensions.read;
            }
            z3 = getpostalcode2.read(onviewattachedtowindowWrite);
            objComponentActivity = getpostalcode2.ComponentActivity();
            if (z3) {
                objComponentActivity = new r8lambdafDO76o9OYYvjKpysJSsx90eBs8(onviewattachedtowindowWrite, 6);
                getpostalcode2.write(objComponentActivity);
            } else {
                objComponentActivity = new r8lambdafDO76o9OYYvjKpysJSsx90eBs8(onviewattachedtowindowWrite, 6);
                getpostalcode2.write(objComponentActivity);
            }
            Modifier modifierWrite2 = SizeKt.write(OffsetKt.read(modifier, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity), 1.0f);
            float f4 = Dimensions.getNestedScrollAxes;
            float f5 = Dimensions.setActionBarVisibilityCallback;
            getpostalcode = getpostalcode2;
            getCurrentSessionimpl.read(PaddingKt.m74paddingqDBjuR0$default(modifierWrite2, f5, 0.0f, f5, f4, 2), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.accessensureViewModelStore), withSessionCancellingPreviousimpl.serializer(((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).MediaDescriptionCompat(), getpostalcode2, i26), withSessionCancellingPreviousimpl.RemoteActionCompatParcelizer(f, 62), null, ExtrasKt.write(1498125309, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: o.replaceui_text
                private static int MediaDescriptionCompat = 1;
                private static int MediaSessionCompatQueueItem;

                /* JADX WARN: Code duplicated, block: B:17:0x007f  */
                /* JADX WARN: Code duplicated, block: B:18:0x0083  */
                @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i27 = 2 % 2;
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ((ModalBottomSheetDialogWrapper) obj2).getClass();
                    getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull2;
                    if (getpostalcode3.write(iIntValue & 1, (iIntValue & 17) != 16)) {
                        int i28 = MediaSessionCompatQueueItem + 27;
                        MediaDescriptionCompat = i28 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i29 = i28 % 2;
                        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
                        androidx.compose.ui.Alignment.Companion companion2 = androidx.compose.ui.Alignment.Companion;
                        androidx.compose.ui.Modifier modifier2 = androidx.compose.animation.AnimationModifierKt.read(companion, companion2.getBottomStart());
                        ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(androidx.compose.foundation.layout.Arrangement.MediaDescriptionCompat, companion2.getStart(), getpostalcode3, 0);
                        int iHashCode = Long.hashCode(getpostalcode3.RatingCompat);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
                        androidx.compose.ui.Modifier modifierMaterializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode3, modifier2);
                        androidx.compose.ui.node.ComposeUiNode.Companion companion3 = androidx.compose.ui.node.ComposeUiNode.Companion;
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
                        if (getpostalcode3.read == null) {
                            SentryUUID.write();
                            throw null;
                        }
                        int i210 = MediaDescriptionCompat + 117;
                        MediaSessionCompatQueueItem = i210 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i210 % 2 != 0) {
                            getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                            int i30 = 0 / 0;
                            if (!(!getpostalcode3.ComponentActivity)) {
                                getpostalcode3.serializer(constructor);
                            } else {
                                getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                            }
                        } else {
                            getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                            if (getpostalcode3.ComponentActivity) {
                                getpostalcode3.serializer(constructor);
                            } else {
                                getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                            }
                        }
                        c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode3, modalBottomSheetYbuCTN8Serializer, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
                        AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode3, Integer.valueOf(iHashCode), getpostalcode3));
                        ActionableMessageCardContainerKt.serializer(gettopleftnoccac, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, null, getpostalcode3, 0);
                        getpostalcode3.IconCompatParcelizer(true);
                    } else {
                        getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        int i31 = MediaSessionCompatQueueItem + 123;
                        MediaDescriptionCompat = i31 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i32 = i31 % 2;
                    }
                    return createFromParcel.INSTANCE;
                }
            }, getpostalcode), getpostalcode, 196608, 16);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new SystemLifecycle(gettopleftnoccac, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, modifier, i);
        }
    }
}
