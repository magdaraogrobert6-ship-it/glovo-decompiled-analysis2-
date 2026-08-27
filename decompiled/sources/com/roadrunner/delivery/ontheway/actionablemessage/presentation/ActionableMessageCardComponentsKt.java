package com.roadrunner.delivery.ontheway.actionablemessage.presentation;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import bo.app.n$$ExternalSyntheticLambda3;
import coil3.ExtrasKt;
import com.braze.ui.support.ViewUtils$$ExternalSyntheticLambda6;
import com.incognia.internal.pcn;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rider.state.worksettings.presentation.SettingsInfoContentKt$SettingsInfoContent$$inlined$ConstraintLayout$5;
import com.roadrunner.rrds.compose.component.indicators.BadgeKt;
import com.roadrunner.rrds.compose.component.indicators.TagsKt;
import com.roadrunner.rrds.compose.component.layouts.DividerKt;
import io.sentry.SentryUUID;
import java.util.List;
import kotlinx.coroutines.DelayKt;
import o.ActivityPackageSender1;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.ClipKt;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DrawBackgroundModifier;
import o.DrawBehindElement;
import o.IActivityPackageSender;
import o.IActivityPackageSenderResponseDataCallbackSubscriber;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PagerWrapperFlingBehavior;
import o.PopulateViewStructure_androidKtpopulate7;
import o.TapGestureDetectorKtdetectTapGestures21;
import o.TextFieldDefaults;
import o.buildMapping;
import o.canReadPlayIds;
import o.clip;
import o.computeHorizontalScrollExtent;
import o.createFromParcel;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getBottomRightannotations;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getImplui_graphics;
import o.getLayers;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getSelectiond9O1mEEui_text;
import o.getStore;
import o.getTopLeftannotations;
import o.getTopLeftnOccac;
import o.handleUrlOverridelambda1;
import o.onBuildCache;
import o.onViewAttachedToWindow;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdapbG_fqEcit8CH1waoNmDxLhROlU;
import o.recordmLhObY;
import o.refreshFeatureFlags;
import o.removeNodeAtDepth;
import o.requiredWidthInVpY3zN4default;
import o.setCurrentSemanticsNodesui;
import o.setOnHierarchyChangeListener;
import o.setSizeuvyYCjk;
import o.supportingTextPaddinga9UjIt4material3default;
import o.v2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ActionableMessageCardComponentsKt {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    public static final void RemoteActionCompatParcelizer(Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(2117378356);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.serializer;
        if ((i & 6) == 0) {
            if (!getpostalcode.read(boxScopeInstance)) {
                i3 = 2;
            } else {
                int i5 = serializer + 115;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                i3 = i5 % 2 != 0 ? 3 : 4;
            }
            i2 = i3 | i;
            int i6 = serializer + 39;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            i2 = i;
        }
        int i8 = i2 | 48;
        if (getpostalcode.write(i8 & 1, (i8 & 19) != 18)) {
            int i9 = IconCompatParcelizer + 99;
            serializer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            modifier2 = Modifier.Companion;
            BoxKt.Box(BackgroundKt.background$default(SizeKt.m84sizeVpY3zN4(PaddingKt.m74paddingqDBjuR0$default(boxScopeInstance.align(modifier2, Alignment.Companion.getCenterStart()), Dimensions.setActionBarVisibilityCallback, 0.0f, 0.0f, 0.0f, 14), Dimensions.getNestedScrollAxes, Dimensions.setMenuPrepared), Brush.Companion.m669horizontalGradient8A3gB4$default(Brush.Companion, SQLite.read(Color.m712boximpl(((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).serializer()), Color.m712boximpl(Color.Companion.m757getTransparent0d7_KjU())), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6), getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getLayers(modifier2, i, 8);
        }
    }

    public static final void IconCompatParcelizer(Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        int i5 = serializer + 115;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(160465709);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.serializer;
        if ((i & 6) == 0) {
            if (getpostalcode.read(boxScopeInstance)) {
                int i7 = IconCompatParcelizer + 43;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i9 = i2 | 48;
        if (!(!getpostalcode.write(i9 & 1, (i9 & 19) != 18))) {
            modifier2 = Modifier.Companion;
            BoxKt.Box(BackgroundKt.background$default(SizeKt.m84sizeVpY3zN4(PaddingKt.m74paddingqDBjuR0$default(boxScopeInstance.align(modifier2, Alignment.Companion.getCenterEnd()), 0.0f, 0.0f, Dimensions.setActionBarVisibilityCallback, 0.0f, 11), Dimensions.getNestedScrollAxes, Dimensions.setMenuPrepared), Brush.Companion.m669horizontalGradient8A3gB4$default(Brush.Companion, SQLite.read(Color.m712boximpl(Color.Companion.m757getTransparent0d7_KjU()), Color.m712boximpl(((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).serializer())), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6), getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getLayers(modifier2, i, 9);
        }
        int i10 = serializer + 85;
        IconCompatParcelizer = i10 % Fields.SpotShadowColor;
        if (i10 % 2 != 0) {
            int i11 = 32 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    /* JADX WARN: Code duplicated, block: B:32:0x0079  */
    /* JADX WARN: Code duplicated, block: B:59:0x0129  */
    /* JADX WARN: Code duplicated, block: B:67:0x0166  */
    public static final void DispatcherHeaderRow(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = IconCompatParcelizer + 113;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(414209540);
        if ((i & 6) == 0) {
            int i7 = serializer + 35;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                throw null;
            }
            i2 = (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(str) ^ true ? 16 : 32;
        }
        if ((i & 384) == 0) {
            int i8 = IconCompatParcelizer + 83;
            serializer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                int i9 = 93 / 0;
                if (getpostalcode.read(modifier)) {
                    i3 = Fields.RotationX;
                } else {
                    i3 = Fields.SpotShadowColor;
                }
            } else if (getpostalcode.read(modifier)) {
                i3 = Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            getpostalcode.serializer(-1003410150);
            getpostalcode.serializer(212064437);
            getpostalcode.IconCompatParcelizer(false);
            Density density = (Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new Measurer2(density);
                getpostalcode.write(objComponentActivity);
            }
            Measurer2 measurer2 = (Measurer2) objComponentActivity;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new DrawBehindElement();
                getpostalcode.write(objComponentActivity2);
            }
            DrawBehindElement drawBehindElement = (DrawBehindElement) objComponentActivity2;
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                getpostalcode.write(objComponentActivity3);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity3;
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new DrawBackgroundModifier(drawBehindElement);
                getpostalcode.write(objComponentActivity4);
                int i10 = serializer + 67;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
            }
            DrawBackgroundModifier drawBackgroundModifier = (DrawBackgroundModifier) objComponentActivity4;
            Object objComponentActivity5 = getpostalcode.ComponentActivity();
            if (objComponentActivity5 == androidContentCaptureManager) {
                objComponentActivity5 = CompositionKt.serializer(createFromParcel.INSTANCE, AndroidContentCaptureManager.RemoteActionCompatParcelizer);
                getpostalcode.write(objComponentActivity5);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity5;
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(measurer2);
            boolean z = getpostalcode.read(257);
            Object objComponentActivity6 = getpostalcode.ComponentActivity();
            if (!zIconCompatParcelizer && !z) {
                int i12 = serializer + 71;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                if (objComponentActivity6 == androidContentCaptureManager) {
                    objComponentActivity6 = new ActivityPackageSender1(populateViewStructure_androidKtpopulate8, measurer2, drawBackgroundModifier, populateViewStructure_androidKtpopulate7, 3);
                    getpostalcode.write(objComponentActivity6);
                }
            } else {
                objComponentActivity6 = new ActivityPackageSender1(populateViewStructure_androidKtpopulate8, measurer2, drawBackgroundModifier, populateViewStructure_androidKtpopulate7, 3);
                getpostalcode.write(objComponentActivity6);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objComponentActivity6;
            Object objComponentActivity7 = getpostalcode.ComponentActivity();
            if (objComponentActivity7 == androidContentCaptureManager) {
                objComponentActivity7 = new IActivityPackageSender(populateViewStructure_androidKtpopulate7, drawBackgroundModifier, 3);
                getpostalcode.write(objComponentActivity7);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity7;
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(measurer2);
            Object objComponentActivity8 = getpostalcode.ComponentActivity();
            if (!zIconCompatParcelizer2) {
                int i14 = IconCompatParcelizer + 81;
                serializer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                if (objComponentActivity8 == androidContentCaptureManager) {
                    objComponentActivity8 = new IActivityPackageSenderResponseDataCallbackSubscriber(measurer2, 3);
                    getpostalcode.write(objComponentActivity8);
                }
            } else {
                objComponentActivity8 = new IActivityPackageSenderResponseDataCallbackSubscriber(measurer2, 3);
                getpostalcode.write(objComponentActivity8);
            }
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierWrite, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity8, 1, null), ExtrasKt.write(1200550679, new SettingsInfoContentKt$SettingsInfoContent$$inlined$ConstraintLayout$5(populateViewStructure_androidKtpopulate8, drawBehindElement, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 2), getpostalcode), measurePolicy, getpostalcode, 48, 0);
            getpostalcode.IconCompatParcelizer(false);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new computeHorizontalScrollExtent(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, str, modifier, i, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x013f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0184  */
    public static final void CustomerHeaderRow(recordmLhObY recordmlhoby, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        DrawBackgroundModifier drawBackgroundModifier;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7;
        int i3;
        int i4 = 2 % 2;
        recordmlhoby.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1318338848);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode.read(recordmlhoby) : getpostalcode.IconCompatParcelizer(recordmlhoby) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i5 = serializer + 111;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                getpostalcode.read(modifier);
                throw null;
            }
            if (getpostalcode.read(modifier)) {
                int i6 = IconCompatParcelizer + 113;
                serializer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i3 = Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            getpostalcode.serializer(-1003410150);
            getpostalcode.serializer(212064437);
            getpostalcode.IconCompatParcelizer(false);
            Density density = (Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new Measurer2(density);
                getpostalcode.write(objComponentActivity);
            }
            Measurer2 measurer2 = (Measurer2) objComponentActivity;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new DrawBehindElement();
                getpostalcode.write(objComponentActivity2);
            }
            DrawBehindElement drawBehindElement = (DrawBehindElement) objComponentActivity2;
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (objComponentActivity3 == androidContentCaptureManager) {
                int i8 = serializer + 105;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    objComponentActivity3 = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                    getpostalcode.write(objComponentActivity3);
                    int i9 = 28 / 0;
                } else {
                    objComponentActivity3 = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                    getpostalcode.write(objComponentActivity3);
                }
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity3;
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new DrawBackgroundModifier(drawBehindElement);
                getpostalcode.write(objComponentActivity4);
            }
            DrawBackgroundModifier drawBackgroundModifier2 = (DrawBackgroundModifier) objComponentActivity4;
            Object objComponentActivity5 = getpostalcode.ComponentActivity();
            if (objComponentActivity5 == androidContentCaptureManager) {
                objComponentActivity5 = CompositionKt.serializer(createFromParcel.INSTANCE, AndroidContentCaptureManager.RemoteActionCompatParcelizer);
                getpostalcode.write(objComponentActivity5);
                int i10 = IconCompatParcelizer + 5;
                serializer = i10 % Fields.SpotShadowColor;
                if (i10 % 2 == 0) {
                    int i11 = 5 / 4;
                }
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate9 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity5;
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(measurer2);
            boolean z = getpostalcode.read(257);
            Object objComponentActivity6 = getpostalcode.ComponentActivity();
            if (!zIconCompatParcelizer && !z) {
                int i12 = serializer + 81;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                if (objComponentActivity6 == androidContentCaptureManager) {
                    drawBackgroundModifier = drawBackgroundModifier2;
                    populateViewStructure_androidKtpopulate7 = populateViewStructure_androidKtpopulate8;
                    objComponentActivity6 = new ActivityPackageSender1(populateViewStructure_androidKtpopulate9, measurer2, drawBackgroundModifier, populateViewStructure_androidKtpopulate7, 2);
                    getpostalcode.write(objComponentActivity6);
                } else {
                    drawBackgroundModifier = drawBackgroundModifier2;
                    populateViewStructure_androidKtpopulate7 = populateViewStructure_androidKtpopulate8;
                }
            } else {
                drawBackgroundModifier = drawBackgroundModifier2;
                populateViewStructure_androidKtpopulate7 = populateViewStructure_androidKtpopulate8;
                objComponentActivity6 = new ActivityPackageSender1(populateViewStructure_androidKtpopulate9, measurer2, drawBackgroundModifier, populateViewStructure_androidKtpopulate7, 2);
                getpostalcode.write(objComponentActivity6);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objComponentActivity6;
            Object objComponentActivity7 = getpostalcode.ComponentActivity();
            if (objComponentActivity7 == androidContentCaptureManager) {
                objComponentActivity7 = new IActivityPackageSender(populateViewStructure_androidKtpopulate7, drawBackgroundModifier, 2);
                getpostalcode.write(objComponentActivity7);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity7;
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(measurer2);
            Object objComponentActivity8 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer2) {
                objComponentActivity8 = new IActivityPackageSenderResponseDataCallbackSubscriber(measurer2, 2);
                getpostalcode.write(objComponentActivity8);
            } else {
                int i14 = serializer + 79;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                if (i14 % 2 != 0) {
                    int i15 = 24 / 0;
                    if (objComponentActivity8 == androidContentCaptureManager) {
                        objComponentActivity8 = new IActivityPackageSenderResponseDataCallbackSubscriber(measurer2, 2);
                        getpostalcode.write(objComponentActivity8);
                    }
                } else if (objComponentActivity8 == androidContentCaptureManager) {
                    objComponentActivity8 = new IActivityPackageSenderResponseDataCallbackSubscriber(measurer2, 2);
                    getpostalcode.write(objComponentActivity8);
                }
            }
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierWrite, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity8, 1, null), ExtrasKt.write(1200550679, new SettingsInfoContentKt$SettingsInfoContent$$inlined$ConstraintLayout$5(populateViewStructure_androidKtpopulate9, drawBehindElement, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, recordmlhoby, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 1), getpostalcode), measurePolicy, getpostalcode, 48, 0);
            getpostalcode.IconCompatParcelizer(false);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new refreshFeatureFlags(recordmlhoby, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0143  */
    public static final void Message(final String str, final String str2, final String str3, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = IconCompatParcelizer + 79;
        serializer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-624653905);
        if ((i & 6) == 0) {
            if (getpostalcode.read(str)) {
                int i9 = serializer + 81;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.read(str2)) {
                int i11 = serializer + 91;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.read(str3) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            int i13 = IconCompatParcelizer + 77;
            serializer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            if (getpostalcode.read(modifier)) {
                int i15 = IconCompatParcelizer + 91;
                serializer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                i3 = Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 1171) != 1170)) {
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(modifier, 1.0f), 0.0f, 0.0f, Dimensions.write, 0.0f, 11);
            getpostalcode.serializer(-1003410150);
            getpostalcode.serializer(212064437);
            getpostalcode.IconCompatParcelizer(false);
            Density density = (Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new Measurer2(density);
                getpostalcode.write(objComponentActivity);
            }
            Measurer2 measurer2 = (Measurer2) objComponentActivity;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new DrawBehindElement();
                getpostalcode.write(objComponentActivity2);
            }
            final DrawBehindElement drawBehindElement = (DrawBehindElement) objComponentActivity2;
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                getpostalcode.write(objComponentActivity3);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity3;
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new DrawBackgroundModifier(drawBehindElement);
                getpostalcode.write(objComponentActivity4);
            }
            DrawBackgroundModifier drawBackgroundModifier = (DrawBackgroundModifier) objComponentActivity4;
            Object objComponentActivity5 = getpostalcode.ComponentActivity();
            if (objComponentActivity5 == androidContentCaptureManager) {
                objComponentActivity5 = CompositionKt.serializer(createFromParcel.INSTANCE, AndroidContentCaptureManager.RemoteActionCompatParcelizer);
                getpostalcode.write(objComponentActivity5);
            }
            final PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity5;
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(measurer2);
            boolean z = getpostalcode.read(257);
            Object objComponentActivity6 = getpostalcode.ComponentActivity();
            if (!(!(z | zIconCompatParcelizer))) {
                objComponentActivity6 = new ActivityPackageSender1(populateViewStructure_androidKtpopulate8, measurer2, drawBackgroundModifier, populateViewStructure_androidKtpopulate7, 4);
                getpostalcode.write(objComponentActivity6);
            } else {
                int i17 = serializer + 19;
                IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                if (objComponentActivity6 == androidContentCaptureManager) {
                    objComponentActivity6 = new ActivityPackageSender1(populateViewStructure_androidKtpopulate8, measurer2, drawBackgroundModifier, populateViewStructure_androidKtpopulate7, 4);
                    getpostalcode.write(objComponentActivity6);
                }
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objComponentActivity6;
            Object objComponentActivity7 = getpostalcode.ComponentActivity();
            if (objComponentActivity7 == androidContentCaptureManager) {
                objComponentActivity7 = new IActivityPackageSender(populateViewStructure_androidKtpopulate7, drawBackgroundModifier, 4);
                getpostalcode.write(objComponentActivity7);
            }
            final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity7;
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(measurer2);
            Object objComponentActivity8 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer2 || objComponentActivity8 == androidContentCaptureManager) {
                objComponentActivity8 = new IActivityPackageSenderResponseDataCallbackSubscriber(measurer2, 4);
                getpostalcode.write(objComponentActivity8);
            }
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierM74paddingqDBjuR0$default, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity8, 1, null), ExtrasKt.write(1200550679, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: com.roadrunner.delivery.ontheway.actionablemessage.presentation.ActionableMessageCardComponentsKt$Message$$inlined$ConstraintLayout$5
                private static int MediaBrowserCompatMediaItem = 1;
                private static int RatingCompat;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                /* JADX WARN: Code duplicated, block: B:46:0x01bf  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r13v3 */
                /* JADX WARN: Type inference failed for: r13v4, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r13v5 */
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) throws CLParsingException {
                    clip clipVar;
                    ClipKt clipKt;
                    ?? r13;
                    boolean z2;
                    int i19 = 2 % 2;
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    if ((iIntValue & 3) == 2) {
                        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                        if (getpostalcode2.MediaSessionCompatToken()) {
                            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                            int i20 = RatingCompat + 111;
                            MediaBrowserCompatMediaItem = i20 % Fields.SpotShadowColor;
                            if (i20 % 2 != 0) {
                                return createfromparcel;
                            }
                            throw null;
                        }
                    }
                    populateViewStructure_androidKtpopulate8.setValue(createfromparcel);
                    DrawBehindElement drawBehindElement2 = drawBehindElement;
                    int i21 = drawBehindElement2.MediaSessionCompatQueueItem;
                    drawBehindElement2.read();
                    getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull2;
                    getpostalcode3.serializer(-1347365008);
                    DrawBehindElement drawBehindElement3 = (DrawBehindElement) drawBehindElement2.serializer().serializer;
                    ClipKt clipKtRemoteActionCompatParcelizer = drawBehindElement3.RemoteActionCompatParcelizer();
                    ClipKt clipKtRemoteActionCompatParcelizer2 = drawBehindElement3.RemoteActionCompatParcelizer();
                    ClipKt clipKtRemoteActionCompatParcelizer3 = drawBehindElement3.RemoteActionCompatParcelizer();
                    String str4 = str2;
                    String str5 = str3;
                    if (str4 != null && str5 != null) {
                        clipVar = DrawBehindElement.read(drawBehindElement2, new onBuildCache[]{clipKtRemoteActionCompatParcelizer2, clipKtRemoteActionCompatParcelizer3});
                    } else if (str4 != null) {
                        clipVar = clipKtRemoteActionCompatParcelizer3.read;
                    } else {
                        clipVar = str5 != null ? clipKtRemoteActionCompatParcelizer2.read : null;
                    }
                    TextStyle textStyle = (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer());
                    setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                    long presenter = ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter();
                    int iM3569getEllipsisgIe3tQ8 = TextOverflow.Companion.m3569getEllipsisgIe3tQ8();
                    Modifier.Companion companion = Modifier.Companion;
                    boolean z3 = getpostalcode3.read(clipVar);
                    Object objComponentActivity9 = getpostalcode3.ComponentActivity();
                    Object obj3 = getCreditCardExpirationMonth.write;
                    if (z3 || objComponentActivity9 == obj3) {
                        objComponentActivity9 = new setSizeuvyYCjk(5, clipVar);
                        getpostalcode3.write(objComponentActivity9);
                    }
                    TextKt.m131TextNvy7gAk(str, DrawBehindElement.read(companion, clipKtRemoteActionCompatParcelizer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity9), presenter, 0L, null, null, 0L, null, 0L, iM3569getEllipsisgIe3tQ8, false, 2, 0, null, textStyle, getpostalcode3, 0, 24960, 110584);
                    if (str4 != null) {
                        getpostalcode3.serializer(-1346585266);
                        TextStyle textStyleRemoteActionCompatParcelizer = performLayout.RemoteActionCompatParcelizer();
                        long presenter2 = ((buildMapping) getpostalcode3.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter();
                        Object objComponentActivity10 = getpostalcode3.ComponentActivity();
                        if (objComponentActivity10 == obj3) {
                            objComponentActivity10 = getSelectiond9O1mEEui_text.RemoteActionCompatParcelizer;
                            getpostalcode3.write(objComponentActivity10);
                        }
                        clipKt = clipKtRemoteActionCompatParcelizer3;
                        TextKt.m131TextNvy7gAk(str2, DrawBehindElement.read(companion, clipKtRemoteActionCompatParcelizer3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity10), presenter2, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, textStyleRemoteActionCompatParcelizer, getpostalcode3, 0, 24576, 114680);
                        r13 = 0;
                        getpostalcode3.IconCompatParcelizer(false);
                    } else {
                        int i22 = RatingCompat + 27;
                        MediaBrowserCompatMediaItem = i22 % Fields.SpotShadowColor;
                        if (i22 % 2 == 0) {
                            getpostalcode3.serializer(-1346585267);
                            z2 = false;
                        } else {
                            z2 = false;
                            getpostalcode3.serializer(-1346585267);
                        }
                        getpostalcode3.IconCompatParcelizer(z2);
                        r13 = z2;
                        clipKt = clipKtRemoteActionCompatParcelizer3;
                    }
                    if (str5 == null) {
                        int i23 = RatingCompat + 17;
                        MediaBrowserCompatMediaItem = i23 % Fields.SpotShadowColor;
                        int i24 = i23 % 2;
                        getpostalcode3.serializer(-1346308871);
                        getpostalcode3.IconCompatParcelizer((boolean) r13);
                    } else {
                        getpostalcode3.serializer(-1346308870);
                        ClipKt clipKt2 = clipKt;
                        boolean z4 = getpostalcode3.read(clipKt2);
                        boolean z5 = getpostalcode3.read(clipKtRemoteActionCompatParcelizer);
                        Object objComponentActivity11 = getpostalcode3.ComponentActivity();
                        if (!(z4 | z5)) {
                            int i25 = MediaBrowserCompatMediaItem + 25;
                            RatingCompat = i25 % Fields.SpotShadowColor;
                            if (i25 % 2 != 0) {
                                int i26 = 51 / r13;
                                if (objComponentActivity11 == obj3) {
                                    objComponentActivity11 = new v2(clipKt2, clipKtRemoteActionCompatParcelizer, 6);
                                    getpostalcode3.write(objComponentActivity11);
                                }
                            } else if (objComponentActivity11 == obj3) {
                                objComponentActivity11 = new v2(clipKt2, clipKtRemoteActionCompatParcelizer, 6);
                                getpostalcode3.write(objComponentActivity11);
                            }
                        } else {
                            objComponentActivity11 = new v2(clipKt2, clipKtRemoteActionCompatParcelizer, 6);
                            getpostalcode3.write(objComponentActivity11);
                        }
                        Modifier modifier2 = DrawBehindElement.read(companion, clipKtRemoteActionCompatParcelizer2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity11);
                        MeasurePolicy measurePolicy2 = BoxKt.read(Alignment.Companion.getTopStart(), r13);
                        int iHashCode = Long.hashCode(getpostalcode3.RatingCompat);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode3, modifier2);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
                        if (getpostalcode3.read != null) {
                            getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                            if (getpostalcode3.ComponentActivity) {
                                int i27 = MediaBrowserCompatMediaItem + 81;
                                RatingCompat = i27 % Fields.SpotShadowColor;
                                int i28 = i27 % 2;
                                getpostalcode3.serializer(constructor);
                            } else {
                                getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                            }
                            af$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, measurePolicy2, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
                            AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, Integer.valueOf(iHashCode), getpostalcode3));
                            BadgeKt.RemoteActionCompatParcelizer(BoxScopeInstance.serializer, str3, null, getpostalcode3, 6, 2);
                            getpostalcode3.IconCompatParcelizer(true);
                            getpostalcode3.IconCompatParcelizer((boolean) r13);
                        } else {
                            SentryUUID.write();
                            throw null;
                        }
                    }
                    getpostalcode3.IconCompatParcelizer((boolean) r13);
                    if (drawBehindElement2.MediaSessionCompatQueueItem != i21) {
                        getPhoneNumberNational.write(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode3);
                    }
                    return createfromparcel;
                }
            }, getpostalcode), measurePolicy, getpostalcode, 48, 0);
            getpostalcode.IconCompatParcelizer(false);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new setOnHierarchyChangeListener(str, str2, str3, modifier, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d2  */
    public static final void MessageRow(getTopLeftnOccac gettopleftnoccac, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5 = 2 % 2;
        gettopleftnoccac.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1247515261);
        if ((i & 6) == 0) {
            if ((i & 8) == 0 ? getpostalcode.read(gettopleftnoccac) : getpostalcode.IconCompatParcelizer(gettopleftnoccac)) {
                int i6 = IconCompatParcelizer + 61;
                serializer = i6 % Fields.SpotShadowColor;
                i4 = i6 % 2 == 0 ? 5 : 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i7 = serializer + 115;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (getpostalcode.read(modifier)) {
                int i9 = IconCompatParcelizer + 113;
                serializer = i9 % Fields.SpotShadowColor;
                i3 = i9 % 2 == 0 ? 17190 : Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        int i10 = i2;
        if (getpostalcode.write(i10 & 1, (i10 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion;
            boolean z2 = (i10 & 112) == 32;
            if ((i10 & 14) != 4) {
                int i11 = IconCompatParcelizer + 113;
                serializer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                if ((i10 & 8) == 0 || !getpostalcode.IconCompatParcelizer(gettopleftnoccac)) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = true;
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (z || z2) {
                objComponentActivity = new ViewUtils$$ExternalSyntheticLambda6(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 16, gettopleftnoccac);
                getpostalcode.write(objComponentActivity);
            } else {
                int i13 = serializer + 19;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                if (i13 % 2 != 0) {
                    AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    throw null;
                }
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new ViewUtils$$ExternalSyntheticLambda6(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 16, gettopleftnoccac);
                    getpostalcode.write(objComponentActivity);
                }
            }
            Modifier modifier2 = canReadPlayIds.read(companion, null, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 63);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!(!getpostalcode.ComponentActivity)) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            getpostalcode.serializer(1785588258);
            getpostalcode.serializer(1785590170);
            int i14 = 0;
            for (Object obj : gettopleftnoccac.serializer()) {
                int i15 = serializer + 37;
                IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                if (i14 < 0) {
                    SQLite.serializer();
                    throw null;
                }
                getImplui_graphics getimplui_graphics = (getImplui_graphics) obj;
                if (i14 != SQLite.write(gettopleftnoccac.serializer())) {
                    getpostalcode.serializer(826190830);
                    Message(getimplui_graphics.serializer, getimplui_graphics.write, null, modifier, getpostalcode, ((i10 << 3) & 7168) | 384);
                    DividerKt.read(0.0f, 0, 6, 0L, getpostalcode, PaddingKt.m74paddingqDBjuR0$default(PaddingKt.m73paddingVpY3zN4$default(Modifier.Companion, 0.0f, Dimensions.getActionBarHideOffset, 1), Dimensions.setHideOnContentScrollEnabled, 0.0f, Dimensions.setActionBarVisibilityCallback, 0.0f, 10));
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(826650374);
                    Message(getimplui_graphics.serializer, gettopleftnoccac.serializer().size() == 1 ? null : getimplui_graphics.write, gettopleftnoccac.RemoteActionCompatParcelizer(), modifier, getpostalcode, (i10 << 3) & 7168);
                    getpostalcode.IconCompatParcelizer(false);
                }
                i14++;
            }
            af$$ExternalSyntheticOutline0.m(getpostalcode, false, false, true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getStore(i, 1, gettopleftnoccac, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, o.getBirthDateFull, o.getPostalCode] */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v28 */
    public static final void QuickRepliesRow(recordmLhObY recordmlhoby, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        Modifier.Companion companion;
        int i3;
        long jOnMultiWindowModeChanged;
        long subtitle;
        long jOnMultiWindowModeChanged2;
        boolean zIconCompatParcelizer;
        int i4 = 2 % 2;
        int i5 = IconCompatParcelizer + 85;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        recordmlhoby.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        ?? r1 = (getPostalCode) getbirthdatefull;
        r1.MediaSessionCompatQueueItem(1084774321);
        getAddressCountry getaddresscountry = r1.read;
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                int i7 = IconCompatParcelizer + 31;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                zIconCompatParcelizer = r1.read(recordmlhoby);
                int i9 = serializer + 15;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
            } else {
                zIconCompatParcelizer = r1.IconCompatParcelizer(recordmlhoby);
            }
            i2 = i | (zIconCompatParcelizer ? 4 : 2);
            int i11 = serializer + 119;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= r1.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 32 : 16;
        }
        int i13 = i2 | 384;
        ?? r14 = 0;
        if (r1.write(i13 & 1, (i13 & 147) != 146)) {
            int i14 = serializer + 97;
            IconCompatParcelizer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion2, 0.0f, Dimensions.getNestedScrollAxes, 0.0f, 0.0f, 13);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(companion3.getTopStart(), false);
            int iHashCode = Long.hashCode(r1.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = r1.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(r1, modifierM74paddingqDBjuR0$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion4.getConstructor();
            Object obj = null;
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            r1.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (r1.ComponentActivity) {
                r1.serializer(constructor);
            } else {
                r1.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion4, (getPostalCode) r1, measurePolicy, (getPostalCode) r1, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(r1, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion4, (getPostalCode) r1, Integer.valueOf(iHashCode), (getPostalCode) r1));
            ScrollState scrollState = PagerWrapperFlingBehavior.read(0, r1, 1);
            Alignment.Vertical centerVertically = companion3.getCenterVertically();
            Modifier modifierSerializer = PagerWrapperFlingBehavior.serializer(PaddingKt.RemoteActionCompatParcelizer(BackgroundKt.m20backgroundbw27NRU(SizeKt.write(BoxScopeInstance.serializer.align(companion2, companion3.getCenter()), 1.0f), ((buildMapping) r1.write(performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).serializer(), RectangleShapeKt.getRectangleShape()), Dimensions.setActionBarVisibilityCallback, Dimensions.setMenu), scrollState, true, false);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, centerVertically, r1, 48);
            int iHashCode2 = Long.hashCode(r1.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = r1.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(r1, modifierSerializer);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion4.getConstructor();
            r1.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!(!r1.ComponentActivity)) {
                r1.serializer(constructor2);
            } else {
                r1.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion4, r1, supportingtextpaddinga9ujit4material3defaultSerializer, r1, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(r1, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion4, (getPostalCode) r1, Integer.valueOf(iHashCode2), (getPostalCode) r1));
            Object objComponentActivity = r1.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            Object obj2 = objComponentActivity;
            if (objComponentActivity == androidContentCaptureManager) {
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer = CompositionKt.RemoteActionCompatParcelizer(null);
                r1.write(populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer);
                obj2 = populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer;
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) obj2;
            List<String> list = recordmlhoby.serializer;
            int i16 = 6;
            if (list == null) {
                r1.serializer(1877684603);
                r1.IconCompatParcelizer(false);
                companion = companion2;
                i3 = 6;
            } else {
                r1.serializer(1877684604);
                for (String str : list) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) populateViewStructure_androidKtpopulate7.getValue(), str}, getCieXyz.write())).booleanValue()) {
                        int i17 = serializer + 39;
                        IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                        int i18 = i17 % 2;
                        r1.serializer(-310030633);
                        jOnMultiWindowModeChanged = ((buildMapping) r1.write(performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onPictureInPictureUiStateChanged();
                    } else {
                        r1.serializer(-310029162);
                        jOnMultiWindowModeChanged = ((buildMapping) r1.write(performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onMultiWindowModeChanged();
                    }
                    r1.IconCompatParcelizer(r14);
                    requiredWidthInVpY3zN4default requiredwidthinvpy3zn4default = (requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{900, Integer.valueOf((int) r14), obj, Integer.valueOf(i16)});
                    Object objComponentActivity2 = r1.ComponentActivity();
                    Object obj3 = objComponentActivity2;
                    if (objComponentActivity2 == androidContentCaptureManager) {
                        setSizeuvyYCjk setsizeuvyycjk = new setSizeuvyYCjk(i16, populateViewStructure_androidKtpopulate7);
                        r1.write(setsizeuvyycjk);
                        obj3 = setsizeuvyycjk;
                    }
                    Modifier.Companion companion5 = companion2;
                    int i19 = i16;
                    onViewAttachedToWindow onviewattachedtowindowIconCompatParcelizer = TapGestureDetectorKtdetectTapGestures21.IconCompatParcelizer(jOnMultiWindowModeChanged, requiredwidthinvpy3zn4default, null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3, r1, 3120, 4);
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) populateViewStructure_androidKtpopulate7.getValue(), str}, getCieXyz.write())).booleanValue()) {
                        r1.serializer(-310020079);
                        subtitle = ((buildMapping) r1.write(performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setCustomView();
                    } else {
                        r1.serializer(-310018800);
                        subtitle = ((buildMapping) r1.write(performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSubtitle();
                    }
                    r1.IconCompatParcelizer(r14);
                    onViewAttachedToWindow onviewattachedtowindowIconCompatParcelizer2 = TapGestureDetectorKtdetectTapGestures21.IconCompatParcelizer(subtitle, (requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{900, Integer.valueOf((int) r14), null, Integer.valueOf(i19)}), null, null, r1, 48, 12);
                    if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) populateViewStructure_androidKtpopulate7.getValue(), str}, getCieXyz.write())).booleanValue())) {
                        r1.serializer(-310011881);
                        jOnMultiWindowModeChanged2 = ((buildMapping) r1.write(performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onPictureInPictureUiStateChanged();
                    } else {
                        r1.serializer(-310010410);
                        jOnMultiWindowModeChanged2 = ((buildMapping) r1.write(performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onMultiWindowModeChanged();
                    }
                    r1.IconCompatParcelizer(r14);
                    onViewAttachedToWindow onviewattachedtowindowIconCompatParcelizer3 = TapGestureDetectorKtdetectTapGestures21.IconCompatParcelizer(jOnMultiWindowModeChanged2, (requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{900, Integer.valueOf((int) r14), null, Integer.valueOf(i19)}), null, null, r1, 48, 12);
                    Modifier.Companion companion6 = Modifier.Companion;
                    ?? r7 = ((String) populateViewStructure_androidKtpopulate7.getValue()) == null ? 1 : r14;
                    boolean z = r1.read(str);
                    ?? r8 = (i13 & 112) == 32 ? 1 : r14;
                    Object objComponentActivity3 = r1.ComponentActivity();
                    if (((z ? 1 : 0) | r8) == 0) {
                        int i20 = IconCompatParcelizer + 37;
                        serializer = i20 % Fields.SpotShadowColor;
                        if (i20 % 2 == 0) {
                            throw null;
                        }
                        if (objComponentActivity3 == androidContentCaptureManager) {
                        }
                        Modifier modifierM74paddingqDBjuR0$default2 = PaddingKt.m74paddingqDBjuR0$default(canReadPlayIds.read(companion6, null, r7, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, r1, 61), Dimensions.getNestedScrollAxes, 0.0f, 0.0f, 0.0f, 14);
                        long jM732unboximpl = ((Color) onviewattachedtowindowIconCompatParcelizer.getValue()).m732unboximpl();
                        long jM732unboximpl2 = ((Color) onviewattachedtowindowIconCompatParcelizer2.getValue()).m732unboximpl();
                        long jM732unboximpl3 = ((Color) onviewattachedtowindowIconCompatParcelizer3.getValue()).m732unboximpl();
                        float f = Dimensions.onBackPressedDispatcher_delegatelambda010;
                        float f2 = Dimensions.generateLayoutParams;
                        getTopLeftannotations gettopleftannotations = RoundedCornerShapeKt.IconCompatParcelizer;
                        TagsKt.read(str, modifierM74paddingqDBjuR0$default2, 0, 0, jM732unboximpl, jM732unboximpl2, jM732unboximpl3, new getTopLeftannotations(new getBottomRightannotations(f), new getBottomRightannotations(f2), new getBottomRightannotations(f), new getBottomRightannotations(f)), r1, 0, 28);
                        i16 = i19;
                        i13 = i13;
                        r14 = r14 == true ? 1 : 0;
                        androidContentCaptureManager = androidContentCaptureManager;
                        companion2 = companion5;
                        obj = null;
                    }
                    objComponentActivity3 = new n$$ExternalSyntheticLambda3(str, r8lambdaunavo3sxub_pc9xroryotnrlvsm, populateViewStructure_androidKtpopulate7, 19);
                    r1.write(objComponentActivity3);
                    Modifier modifierM74paddingqDBjuR0$default3 = PaddingKt.m74paddingqDBjuR0$default(canReadPlayIds.read(companion6, null, r7, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, r1, 61), Dimensions.getNestedScrollAxes, 0.0f, 0.0f, 0.0f, 14);
                    long jM732unboximpl4 = ((Color) onviewattachedtowindowIconCompatParcelizer.getValue()).m732unboximpl();
                    long jM732unboximpl5 = ((Color) onviewattachedtowindowIconCompatParcelizer2.getValue()).m732unboximpl();
                    long jM732unboximpl6 = ((Color) onviewattachedtowindowIconCompatParcelizer3.getValue()).m732unboximpl();
                    float f3 = Dimensions.onBackPressedDispatcher_delegatelambda010;
                    float f4 = Dimensions.generateLayoutParams;
                    getTopLeftannotations gettopleftannotations2 = RoundedCornerShapeKt.IconCompatParcelizer;
                    TagsKt.read(str, modifierM74paddingqDBjuR0$default3, 0, 0, jM732unboximpl4, jM732unboximpl5, jM732unboximpl6, new getTopLeftannotations(new getBottomRightannotations(f3), new getBottomRightannotations(f4), new getBottomRightannotations(f3), new getBottomRightannotations(f3)), r1, 0, 28);
                    i16 = i19;
                    i13 = i13;
                    r14 = r14 == true ? 1 : 0;
                    androidContentCaptureManager = androidContentCaptureManager;
                    companion2 = companion5;
                    obj = null;
                }
                companion = companion2;
                i3 = i16;
                r1.IconCompatParcelizer(r14);
            }
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{r1, SizeKt.m86width3ABfNKs(Modifier.Companion, Dimensions.getNestedScrollAxes)});
            r1.IconCompatParcelizer(true);
            int i21 = i3;
            RemoteActionCompatParcelizer(null, r1, i21);
            IconCompatParcelizer(null, r1, i21);
            r1.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            r1.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = r1.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getStore(i, 2, recordmlhoby, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier2);
        }
    }
}
