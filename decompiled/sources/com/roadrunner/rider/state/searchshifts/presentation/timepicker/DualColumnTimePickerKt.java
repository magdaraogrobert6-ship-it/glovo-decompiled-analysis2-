package com.roadrunner.rider.state.searchshifts.presentation.timepicker;

import android.view.View;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.gestures.snapping.PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.nafath.logger.NafathLogger$$ExternalSyntheticLambda0;
import com.roadrunner.rider.state.searchshifts.presentation.timepicker.DualColumnTimePickerKt;
import com.roadrunner.sidemenu.photoId.PhotoIdUiModelImpl$1$1;
import com.roadrunner.tnc.TncComposableFactoryImpl$$ExternalSyntheticLambda0;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda1;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda2;
import io.sentry.SentryUUID;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.BottomSheetDefaults;
import o.BottomSheetScaffoldKtBottomSheetScaffoldLayout11;
import o.BrazeInAppMessageManagerExternalSyntheticLambda45;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ReferrerDetails;
import o.TapGestureDetectorKtprocessTapGesture3;
import o.TextFieldDefaults;
import o.accessanimateWithTarget;
import o.accessgetInstancedelegatecp;
import o.buildMapping;
import o.copyejIjP34;
import o.currentTimeMillis;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.hasNotBeenRead;
import o.markAsRead;
import o.onShowTranslationui;
import o.onViewAttachedToWindowlambda0;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdab6E1D0lY25DehDHETb0gPJfQmz4;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdapbG_fqEcit8CH1waoNmDxLhROlU;
import o.readContentProvider;
import o.removeNodeAtDepth;
import o.requiredWidthInVpY3zN4default;
import o.runSyncInPlayAdIdSchedulerWithTimeout;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DualColumnTimePickerKt {
    public static final /* synthetic */ int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    static {
        hasNotBeenRead hasnotbeenread = new hasNotBeenRead("11:00", "11:00");
        Boolean bool = Boolean.FALSE;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("13:00", bool);
        Boolean bool2 = Boolean.TRUE;
        removeNodeAtDepth.RemoteActionCompatParcelizer(SQLite.read(new markAsRead(hasnotbeenread, RemoteActionCompatParcelizer(onviewattachedtowindowlambda0, new onViewAttachedToWindowlambda0("13:30", bool2), new onViewAttachedToWindowlambda0("14:00", bool))), new markAsRead(new hasNotBeenRead("11:30", "11:30"), RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("13:30", bool), new onViewAttachedToWindowlambda0("14:00", bool2), new onViewAttachedToWindowlambda0("14:30", bool))), new markAsRead(new hasNotBeenRead("12:00", "12:00"), RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("14:00", bool), new onViewAttachedToWindowlambda0("14:30", bool2), new onViewAttachedToWindowlambda0("15:00", bool))), new markAsRead(new hasNotBeenRead("12:30", "12:30"), RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("14:30", bool), new onViewAttachedToWindowlambda0("15:00", bool2), new onViewAttachedToWindowlambda0("15:30", bool)))));
        int i = write + 33;
        serializer = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static final ArrayList RemoteActionCompatParcelizer(onViewAttachedToWindowlambda0... onviewattachedtowindowlambda0Arr) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList(onviewattachedtowindowlambda0Arr.length);
        for (onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 : onviewattachedtowindowlambda0Arr) {
            String str = (String) onviewattachedtowindowlambda0.serializer;
            arrayList.add(new readContentProvider(new hasNotBeenRead(str, str), ((Boolean) onviewattachedtowindowlambda0.write).booleanValue()));
        }
        int i2 = read + 63;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return arrayList;
    }

    public static final void IconCompatParcelizer(getBirthDateFull getbirthdatefull, int i) {
        boolean z;
        int i2 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1659704092);
        if (i != 0) {
            int i3 = read;
            int i4 = i3 + 19;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            int i6 = i3 + 45;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i & 1, z)) {
            int i8 = read + 89;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                Object[] objArr = {getpostalcode, SizeKt.m75height3ABfNKs(Modifier.Companion, DualColumnTimePickerDefaults.write)};
                int iRemoteActionCompatParcelizer = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, objArr);
                throw null;
            }
            Object[] objArr2 = {getpostalcode, SizeKt.m75height3ABfNKs(Modifier.Companion, DualColumnTimePickerDefaults.write)};
            int iRemoteActionCompatParcelizer2 = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, objArr2);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new runSyncInPlayAdIdSchedulerWithTimeout(i, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    public static final void TimePickerItem(int i, getBirthDateFull getbirthdatefull, String str, boolean z) {
        int i2;
        getPostalCode getpostalcode;
        long presenter;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1282884392);
        if ((i & 6) == 0) {
            if (getpostalcode2.read(str)) {
                int i5 = RemoteActionCompatParcelizer + 3;
                read = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
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
            i2 |= getpostalcode2.write(z) ? 32 : 16;
        }
        int i6 = i2;
        if (getpostalcode2.write(i6 & 1, (i6 & 19) != 18)) {
            int i7 = read + 1;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            Modifier modifierM75height3ABfNKs = SizeKt.m75height3ABfNKs(SizeKt.write(Modifier.Companion, 1.0f), DualColumnTimePickerDefaults.write);
            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getCenter(), false);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM75height3ABfNKs);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode2.read != null) {
                int i9 = read + 19;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                TextStyle textStyleMediaSessionCompatToken = performLayout.MediaSessionCompatToken();
                if (z) {
                    getpostalcode2.serializer(-1753398693);
                    presenter = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setBackgroundDrawable();
                } else {
                    getpostalcode2.serializer(-1753397864);
                    presenter = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter();
                }
                long j = presenter;
                getpostalcode2.IconCompatParcelizer(false);
                int i11 = RemoteActionCompatParcelizer + 1;
                read = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                TextKt.m131TextNvy7gAk(str, null, j, 0L, null, null, 0L, TextAlign.m3504boximpl(TextAlign.Companion.m3511getCentere0LSkKk()), 0L, 0, false, 1, 0, null, textStyleMediaSessionCompatToken, getpostalcode2, i6 & 14, 24576, 113658);
                getpostalcode = getpostalcode2;
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i13 = read + 79;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new currentTimeMillis(i, 3, str, z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:102:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:106:0x0208  */
    /* JADX WARN: Code duplicated, block: B:108:0x022d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0239  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:53:0x00af  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:58:0x00be  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:75:0x0126  */
    /* JADX WARN: Code duplicated, block: B:78:0x013f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0141  */
    /* JADX WARN: Code duplicated, block: B:82:0x0148  */
    /* JADX WARN: Code duplicated, block: B:83:0x014a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0153  */
    /* JADX WARN: Code duplicated, block: B:89:0x0160  */
    /* JADX WARN: Code duplicated, block: B:90:0x0167  */
    /* JADX WARN: Code duplicated, block: B:94:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:97:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e8  */
    public static final void TimePickerColumn(final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, final String str, final int i, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, final int i2, final int i3) {
        int i4;
        int i5;
        boolean z;
        getPostalCode getpostalcode;
        final Modifier modifier2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        Modifier modifier3;
        int i6;
        boolean z2;
        Object objComponentActivity;
        AndroidContentCaptureManager androidContentCaptureManager;
        LazyListState lazyListState;
        BottomSheetScaffoldKtBottomSheetScaffoldLayout11 bottomSheetScaffoldKtBottomSheetScaffoldLayout11;
        boolean z3;
        Object objComponentActivity2;
        BottomSheetDefaults bottomSheetDefaults;
        accessanimateWithTarget accessanimatewithtarget;
        boolean z4;
        boolean z5;
        boolean z6;
        Object objComponentActivity3;
        boolean z7;
        boolean z8;
        boolean z9;
        Object objComponentActivity4;
        int i7;
        View view;
        boolean zIconCompatParcelizer;
        Object objComponentActivity5;
        boolean z10;
        boolean z11;
        Object objComponentActivity6;
        int i8;
        int i9;
        int i10 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-324887844);
        if ((i2 & 6) == 0) {
            if (getpostalcode2.read(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk)) {
                int i11 = read + 115;
                RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                i9 = i11 % 2 == 0 ? 5 : 4;
            } else {
                i9 = 2;
            }
            i4 = i9 | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= getpostalcode2.read(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (getpostalcode2.read(i)) {
                int i12 = RemoteActionCompatParcelizer + 69;
                read = i12 % Fields.SpotShadowColor;
                i8 = i12 % 2 != 0 ? 4202 : Fields.RotationX;
            } else {
                i8 = Fields.SpotShadowColor;
            }
            i4 |= i8;
            int i13 = RemoteActionCompatParcelizer + 43;
            read = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
        }
        if ((i2 & 3072) == 0) {
            i4 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i15 = i3 & 16;
        if (i15 == 0) {
            if ((i2 & 24576) == 0) {
                i4 |= getpostalcode2.read(modifier) ? Fields.Clip : 8192;
            }
            i5 = i4;
            int i16 = read + 87;
            RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            if ((i5 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (getpostalcode2.write(i5 & 1, z)) {
                if (i15 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier;
                }
                i6 = i5 & 14;
                if (i6 == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objComponentActivity = getpostalcode2.ComponentActivity();
                Modifier modifier4 = modifier3;
                androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (z2) {
                    objComponentActivity = new LazyListState(i, 0);
                    getpostalcode2.write(objComponentActivity);
                } else {
                    int i18 = RemoteActionCompatParcelizer + 55;
                    read = i18 % Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                    if (objComponentActivity == androidContentCaptureManager) {
                        objComponentActivity = new LazyListState(i, 0);
                        getpostalcode2.write(objComponentActivity);
                    }
                }
                lazyListState = (LazyListState) objComponentActivity;
                bottomSheetScaffoldKtBottomSheetScaffoldLayout11 = BottomSheetScaffoldKtBottomSheetScaffoldLayout11.write;
                z3 = getpostalcode2.read(lazyListState);
                objComponentActivity2 = getpostalcode2.ComponentActivity();
                if (z3 || objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1(lazyListState, bottomSheetScaffoldKtBottomSheetScaffoldLayout11);
                    getpostalcode2.write(objComponentActivity2);
                }
                bottomSheetDefaults = (BottomSheetDefaults) objComponentActivity2;
                float f = SnapFlingBehaviorKt.read;
                Density density = (Density) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
                accessanimatewithtarget = TapGestureDetectorKtprocessTapGesture3.read(getpostalcode2);
                z4 = getpostalcode2.read(bottomSheetDefaults);
                z5 = getpostalcode2.read(accessanimatewithtarget);
                z6 = getpostalcode2.read(density);
                objComponentActivity3 = getpostalcode2.ComponentActivity();
                if (!(z4 | z5 | z6) || objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new SnapFlingBehavior(bottomSheetDefaults, accessanimatewithtarget, DelayKt.IconCompatParcelizer(0.0f, 400.0f, 5, (Object) null));
                    getpostalcode2.write(objComponentActivity3);
                }
                SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) objComponentActivity3;
                z7 = getpostalcode2.read(lazyListState);
                if (i6 == 4) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if ((i5 & 7168) == 2048) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                objComponentActivity4 = getpostalcode2.ComponentActivity();
                if (!(z7 | z8) && !z9) {
                    int i20 = read + 89;
                    RemoteActionCompatParcelizer = i20 % Fields.SpotShadowColor;
                    int i21 = i20 % 2;
                    if (objComponentActivity4 == androidContentCaptureManager) {
                        i7 = i6;
                        objComponentActivity4 = new RxConvertKt$asObservable$1$job$1(lazyListState, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, 1);
                        getpostalcode2.write(objComponentActivity4);
                    } else {
                        i7 = i6;
                    }
                } else {
                    i7 = i6;
                    objComponentActivity4 = new RxConvertKt$asObservable$1$job$1(lazyListState, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, 1);
                    getpostalcode2.write(objComponentActivity4);
                }
                getPhoneNumberNational.serializer(lazyListState, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity4, getpostalcode2);
                Modifier modifierDrawWithContent = DrawModifierKt.drawWithContent(GraphicsLayerModifierKt.graphicsLayer(SizeKt.m75height3ABfNKs(modifier4, Dp.m3673constructorimpl(DualColumnTimePickerDefaults.write * 3.0f)), new NafathLogger$$ExternalSyntheticLambda0(29)), new BrazeInAppMessageManagerExternalSyntheticLambda45(1));
                view = (View) getpostalcode2.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalView());
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(view);
                objComponentActivity5 = getpostalcode2.ComponentActivity();
                if (zIconCompatParcelizer || objComponentActivity5 == androidContentCaptureManager) {
                    objComponentActivity5 = new LazyLayoutPagerKt$dragDirectionDetector$1(10, view);
                    getpostalcode2.write(objComponentActivity5);
                }
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierDrawWithContent, view, (PointerInputEventHandler) objComponentActivity5);
                Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
                FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
                if (i7 == 4) {
                    int i22 = read + 21;
                    RemoteActionCompatParcelizer = i22 % Fields.SpotShadowColor;
                    int i23 = i22 % 2;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i5 & 112) == 32) {
                    int i24 = RemoteActionCompatParcelizer + 55;
                    read = i24 % Fields.SpotShadowColor;
                    int i25 = i24 % 2;
                    z11 = true;
                } else {
                    z11 = false;
                }
                objComponentActivity6 = getpostalcode2.ComponentActivity();
                if (!(z10 | z11) || objComponentActivity6 == androidContentCaptureManager) {
                    objComponentActivity6 = new TncContentKt$$ExternalSyntheticLambda1(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, 9, str);
                    getpostalcode2.write(objComponentActivity6);
                }
                getpostalcode = getpostalcode2;
                LazyDslKt.LazyColumn(modifierPointerInput, lazyListState, null, flingCancellationException, centerHorizontally, snapFlingBehavior, false, null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity6, getpostalcode, 221184, 396);
                modifier2 = modifier4;
            } else {
                getpostalcode = getpostalcode2;
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier2 = modifier;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.createInstance
                    private static int MediaDescriptionCompat = 0;
                    private static int RatingCompat = 1;

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        int i26 = 2 % 2;
                        int i27 = RatingCompat + 15;
                        MediaDescriptionCompat = i27 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i28 = i27 % 2;
                        ((Integer) obj2).getClass();
                        DualColumnTimePickerKt.TimePickerColumn(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, str, i, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier2, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i2 | 1), i3);
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        int i29 = MediaDescriptionCompat + 49;
                        RatingCompat = i29 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i30 = i29 % 2;
                        return createfromparcel;
                    }
                };
            }
        }
        i4 |= 24576;
        i5 = i4;
        int i110 = read + 87;
        RemoteActionCompatParcelizer = i110 % Fields.SpotShadowColor;
        int i111 = i110 % 2;
        if ((i5 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i5 & 1, z)) {
            if (i15 != 0) {
                modifier3 = Modifier.Companion;
            } else {
                modifier3 = modifier;
            }
            i6 = i5 & 14;
            if (i6 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            objComponentActivity = getpostalcode2.ComponentActivity();
            Modifier modifier5 = modifier3;
            androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z2) {
                int i112 = RemoteActionCompatParcelizer + 55;
                read = i112 % Fields.SpotShadowColor;
                int i113 = i112 % 2;
                if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new LazyListState(i, 0);
                    getpostalcode2.write(objComponentActivity);
                }
            } else {
                objComponentActivity = new LazyListState(i, 0);
                getpostalcode2.write(objComponentActivity);
            }
            lazyListState = (LazyListState) objComponentActivity;
            bottomSheetScaffoldKtBottomSheetScaffoldLayout11 = BottomSheetScaffoldKtBottomSheetScaffoldLayout11.write;
            z3 = getpostalcode2.read(lazyListState);
            objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (z3) {
                objComponentActivity2 = new PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1(lazyListState, bottomSheetScaffoldKtBottomSheetScaffoldLayout11);
                getpostalcode2.write(objComponentActivity2);
            } else {
                objComponentActivity2 = new PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1(lazyListState, bottomSheetScaffoldKtBottomSheetScaffoldLayout11);
                getpostalcode2.write(objComponentActivity2);
            }
            bottomSheetDefaults = (BottomSheetDefaults) objComponentActivity2;
            float f2 = SnapFlingBehaviorKt.read;
            Density density2 = (Density) getpostalcode2.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
            accessanimatewithtarget = TapGestureDetectorKtprocessTapGesture3.read(getpostalcode2);
            z4 = getpostalcode2.read(bottomSheetDefaults);
            z5 = getpostalcode2.read(accessanimatewithtarget);
            z6 = getpostalcode2.read(density2);
            objComponentActivity3 = getpostalcode2.ComponentActivity();
            if (!(z4 | z5) && !z6) {
                objComponentActivity3 = new SnapFlingBehavior(bottomSheetDefaults, accessanimatewithtarget, DelayKt.IconCompatParcelizer(0.0f, 400.0f, 5, (Object) null));
                getpostalcode2.write(objComponentActivity3);
            } else {
                objComponentActivity3 = new SnapFlingBehavior(bottomSheetDefaults, accessanimatewithtarget, DelayKt.IconCompatParcelizer(0.0f, 400.0f, 5, (Object) null));
                getpostalcode2.write(objComponentActivity3);
            }
            SnapFlingBehavior snapFlingBehavior2 = (SnapFlingBehavior) objComponentActivity3;
            z7 = getpostalcode2.read(lazyListState);
            if (i6 == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((i5 & 7168) == 2048) {
                z9 = true;
            } else {
                z9 = false;
            }
            objComponentActivity4 = getpostalcode2.ComponentActivity();
            if (!(z7 | z8) && !z9) {
                int i26 = read + 89;
                RemoteActionCompatParcelizer = i26 % Fields.SpotShadowColor;
                int i27 = i26 % 2;
                if (objComponentActivity4 == androidContentCaptureManager) {
                    i7 = i6;
                    objComponentActivity4 = new RxConvertKt$asObservable$1$job$1(lazyListState, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, 1);
                    getpostalcode2.write(objComponentActivity4);
                } else {
                    i7 = i6;
                }
            } else {
                i7 = i6;
                objComponentActivity4 = new RxConvertKt$asObservable$1$job$1(lazyListState, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdaunavo3sxub_pc9xroryotnrlvsm, null, 1);
                getpostalcode2.write(objComponentActivity4);
            }
            getPhoneNumberNational.serializer(lazyListState, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity4, getpostalcode2);
            Modifier modifierDrawWithContent2 = DrawModifierKt.drawWithContent(GraphicsLayerModifierKt.graphicsLayer(SizeKt.m75height3ABfNKs(modifier5, Dp.m3673constructorimpl(DualColumnTimePickerDefaults.write * 3.0f)), new NafathLogger$$ExternalSyntheticLambda0(29)), new BrazeInAppMessageManagerExternalSyntheticLambda45(1));
            view = (View) getpostalcode2.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalView());
            zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(view);
            objComponentActivity5 = getpostalcode2.ComponentActivity();
            if (zIconCompatParcelizer) {
                objComponentActivity5 = new LazyLayoutPagerKt$dragDirectionDetector$1(10, view);
                getpostalcode2.write(objComponentActivity5);
            } else {
                objComponentActivity5 = new LazyLayoutPagerKt$dragDirectionDetector$1(10, view);
                getpostalcode2.write(objComponentActivity5);
            }
            Modifier modifierPointerInput2 = SuspendingPointerInputFilterKt.pointerInput(modifierDrawWithContent2, view, (PointerInputEventHandler) objComponentActivity5);
            Alignment.Horizontal centerHorizontally2 = Alignment.Companion.getCenterHorizontally();
            FlingCancellationException flingCancellationException2 = Arrangement.MediaDescriptionCompat;
            if (i7 == 4) {
                int i28 = read + 21;
                RemoteActionCompatParcelizer = i28 % Fields.SpotShadowColor;
                int i29 = i28 % 2;
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i5 & 112) == 32) {
                int i210 = RemoteActionCompatParcelizer + 55;
                read = i210 % Fields.SpotShadowColor;
                int i211 = i210 % 2;
                z11 = true;
            } else {
                z11 = false;
            }
            objComponentActivity6 = getpostalcode2.ComponentActivity();
            if (!z10 && !z11) {
                objComponentActivity6 = new TncContentKt$$ExternalSyntheticLambda1(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, 9, str);
                getpostalcode2.write(objComponentActivity6);
            } else {
                objComponentActivity6 = new TncContentKt$$ExternalSyntheticLambda1(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, 9, str);
                getpostalcode2.write(objComponentActivity6);
            }
            getpostalcode = getpostalcode2;
            LazyDslKt.LazyColumn(modifierPointerInput2, lazyListState, null, flingCancellationException2, centerHorizontally2, snapFlingBehavior2, false, null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity6, getpostalcode, 221184, 396);
            modifier2 = modifier5;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.createInstance
                private static int MediaDescriptionCompat = 0;
                private static int RatingCompat = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i212 = 2 % 2;
                    int i213 = RatingCompat + 15;
                    MediaDescriptionCompat = i213 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i214 = i213 % 2;
                    ((Integer) obj2).getClass();
                    DualColumnTimePickerKt.TimePickerColumn(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, str, i, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier2, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i2 | 1), i3);
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i215 = MediaDescriptionCompat + 49;
                    RatingCompat = i215 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i30 = i215 % 2;
                    return createfromparcel;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0281  */
    /* JADX WARN: Code duplicated, block: B:102:0x028d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0296  */
    /* JADX WARN: Code duplicated, block: B:108:0x0358  */
    /* JADX WARN: Code duplicated, block: B:110:0x035d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0368  */
    /* JADX WARN: Code duplicated, block: B:115:0x0277 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0278 A[EDGE_INSN: B:116:0x0278->B:97:0x0278 BREAK  A[LOOP:0: B:90:0x0239->B:95:0x0274], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    /* JADX WARN: Code duplicated, block: B:12:0x0048  */
    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
    /* JADX WARN: Code duplicated, block: B:40:0x0098  */
    /* JADX WARN: Code duplicated, block: B:41:0x009b  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:63:0x010a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0116 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x0119  */
    /* JADX WARN: Code duplicated, block: B:68:0x011c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0121  */
    /* JADX WARN: Code duplicated, block: B:73:0x0160  */
    /* JADX WARN: Code duplicated, block: B:75:0x0167  */
    /* JADX WARN: Code duplicated, block: B:76:0x016b  */
    /* JADX WARN: Code duplicated, block: B:79:0x01de  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:84:0x0203  */
    /* JADX WARN: Code duplicated, block: B:87:0x021b A[LOOP:1: B:85:0x0215->B:87:0x021b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:92:0x023f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0274 A[LOOP:0: B:90:0x0239->B:95:0x0274, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x027a  */
    /* JADX WARN: Code duplicated, block: B:99:0x027d  */
    public static final void DualColumnTimePicker(ReferrerDetails referrerDetails, Modifier modifier, String str, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        String str2;
        int i4;
        int i5;
        boolean z;
        getPostalCode getpostalcode;
        String str3;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        Object obj;
        String str4;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Serializer;
        int i6;
        boolean z2;
        boolean z3;
        Object objComponentActivity;
        AndroidContentCaptureManager androidContentCaptureManager;
        Object photoIdUiModelImpl$1$1;
        float f;
        Alignment.Companion companion;
        MeasurePolicy measurePolicy;
        int iHashCode;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer;
        Modifier modifierMaterializeModifier;
        ComposeUiNode.Companion companion2;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2;
        boolean z4;
        Object objComponentActivity2;
        ArrayList arrayList;
        Iterator it;
        Iterator it2;
        int i7;
        int i8;
        int i9;
        boolean z5;
        Object objComponentActivity3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 2 % 2;
        referrerDetails.getClass();
        List list = referrerDetails.RemoteActionCompatParcelizer;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1992244882);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            int i15 = RemoteActionCompatParcelizer + 13;
            read = i15 % Fields.SpotShadowColor;
            if (i15 % 2 != 0) {
                int i16 = 46 / 0;
                if (getpostalcode2.read(referrerDetails)) {
                    int i17 = read + 57;
                    RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    i13 = 4;
                } else {
                    i13 = 2;
                }
            } else if (getpostalcode2.read(referrerDetails)) {
                int i19 = read + 57;
                RemoteActionCompatParcelizer = i19 % Fields.SpotShadowColor;
                int i110 = i19 % 2;
                i13 = 4;
            } else {
                i13 = 2;
            }
            i3 = i13 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode2.read(modifier) ? 32 : 16;
        }
        int i20 = i2 & 4;
        if (i20 == 0) {
            if ((i & 384) == 0) {
                int i21 = RemoteActionCompatParcelizer + 15;
                read = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
                str2 = str;
                if (getpostalcode2.read(str2)) {
                    int i23 = RemoteActionCompatParcelizer + 85;
                    read = i23 % Fields.SpotShadowColor;
                    i4 = i23 % 2 != 0 ? 1828 : Fields.RotationX;
                } else {
                    i4 = Fields.SpotShadowColor;
                }
                i3 |= i4;
            }
            if ((i & 3072) == 0) {
                if (getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                    i12 = Fields.CameraDistance;
                } else {
                    i12 = Fields.RotationZ;
                }
                i3 |= i12;
            }
            i5 = i3;
            if ((i5 & 1171) != 1170) {
                int i24 = RemoteActionCompatParcelizer + 81;
                read = i24 % Fields.SpotShadowColor;
                int i25 = i24 % 2;
                z = true;
            } else {
                z = false;
            }
            if (getpostalcode2.write(i5 & 1, z)) {
                obj = null;
                if (i20 != 0) {
                    i11 = read + 119;
                    RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                    if (i11 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                    str4 = "TO";
                } else {
                    str4 = str2;
                }
                populateViewStructure_androidKtpopulate7Serializer = CompositionKt.serializer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getpostalcode2);
                String strIconCompatParcelizer = referrerDetails.IconCompatParcelizer();
                String str5 = (String) ((onShowTranslationui) referrerDetails.write).getValue();
                i6 = i5 & 14;
                if (i6 == 4) {
                    int i26 = RemoteActionCompatParcelizer + 111;
                    read = i26 % Fields.SpotShadowColor;
                    int i27 = i26 % 2;
                    z2 = true;
                } else {
                    int i28 = RemoteActionCompatParcelizer + 39;
                    read = i28 % Fields.SpotShadowColor;
                    int i29 = i28 % 2;
                    z2 = false;
                }
                z3 = getpostalcode2.read(populateViewStructure_androidKtpopulate7Serializer);
                objComponentActivity = getpostalcode2.ComponentActivity();
                androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (!z2 && !z3) {
                    i10 = RemoteActionCompatParcelizer + 91;
                    read = i10 % Fields.SpotShadowColor;
                    if (i10 % 2 == 0) {
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    if (objComponentActivity == androidContentCaptureManager) {
                        photoIdUiModelImpl$1$1 = new PhotoIdUiModelImpl$1$1(referrerDetails, populateViewStructure_androidKtpopulate7Serializer, null, 18);
                        getpostalcode2.write(photoIdUiModelImpl$1$1);
                    } else {
                        photoIdUiModelImpl$1$1 = objComponentActivity;
                    }
                } else {
                    photoIdUiModelImpl$1$1 = new PhotoIdUiModelImpl$1$1(referrerDetails, populateViewStructure_androidKtpopulate7Serializer, null, 18);
                    getpostalcode2.write(photoIdUiModelImpl$1$1);
                }
                getPhoneNumberNational.serializer(strIconCompatParcelizer, str5, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) photoIdUiModelImpl$1$1, getpostalcode2);
                f = DualColumnTimePickerDefaults.write;
                Modifier modifierM75height3ABfNKs = SizeKt.m75height3ABfNKs(modifier, Dp.m3673constructorimpl(3.0f * f));
                companion = Alignment.Companion;
                measurePolicy = BoxKt.read(companion.getCenter(), false);
                iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM75height3ABfNKs);
                companion2 = ComposeUiNode.Companion;
                constructor = companion2.getConstructor();
                if (getaddresscountry != null) {
                    SentryUUID.write();
                    throw null;
                }
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                Modifier.Companion companion3 = Modifier.Companion;
                BoxKt.Box(BackgroundKt.m20backgroundbw27NRU(ClipKt.clip(SizeKt.m75height3ABfNKs(PaddingKt.m73paddingVpY3zN4$default(SizeKt.write(companion3, 1.0f), Dimensions.setActionBarVisibilityCallback, 0.0f, 2), f), RoundedCornerShapeKt.IconCompatParcelizer(Dp.m3673constructorimpl(f / 2.0f))), ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setKeyListener(), RectangleShapeKt.getRectangleShape()), getpostalcode2, 0);
                Modifier modifierThen = companion3.then(SizeKt.read);
                supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, companion.getCenterVertically(), getpostalcode2, 48);
                int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierThen);
                constructor2 = companion2.getConstructor();
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor2);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
                Modifier modifierWrite = copyejIjP34.write(companion3, 1.0f);
                z4 = getpostalcode2.read(list);
                objComponentActivity2 = getpostalcode2.ComponentActivity();
                if (z4 || objComponentActivity2 == androidContentCaptureManager) {
                    List list2 = list;
                    arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
                    it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((markAsRead) it.next()).serializer);
                    }
                    objComponentActivity2 = removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList);
                    getpostalcode2.write(objComponentActivity2);
                }
                r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) objComponentActivity2;
                String strIconCompatParcelizer2 = referrerDetails.IconCompatParcelizer();
                it2 = list.iterator();
                i7 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        i7 = -1;
                        break;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((markAsRead) it2.next()).serializer.read, referrerDetails.IconCompatParcelizer()}, getCieXyz.write())).booleanValue()) {
                        break;
                    } else {
                        i7++;
                    }
                }
                if (i7 < 0) {
                    i9 = 4;
                    i8 = 0;
                } else {
                    i8 = i7;
                    i9 = 4;
                }
                if (i6 == i9) {
                    int i30 = read + 103;
                    RemoteActionCompatParcelizer = i30 % Fields.SpotShadowColor;
                    int i31 = i30 % 2;
                    z5 = true;
                } else {
                    z5 = false;
                }
                objComponentActivity3 = getpostalcode2.ComponentActivity();
                if (z5 || objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new TncContentKt$$ExternalSyntheticLambda2(16, referrerDetails);
                    getpostalcode2.write(objComponentActivity3);
                }
                TimePickerColumn(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, strIconCompatParcelizer2, i8, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, modifierWrite, getpostalcode2, 0, 0);
                TextStyle textStyleR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = performLayout.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                long backgroundDrawable = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setBackgroundDrawable();
                int iM3511getCentere0LSkKk = TextAlign.Companion.m3511getCentere0LSkKk();
                Modifier.Companion companion4 = Modifier.Companion;
                Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(companion4, Dimensions.getNestedScrollAxes, 0.0f, 2);
                TextAlign textAlignM3504boximpl = TextAlign.m3504boximpl(iM3511getCentere0LSkKk);
                getpostalcode = getpostalcode2;
                TextKt.m131TextNvy7gAk(str4, modifierM73paddingVpY3zN4$default, backgroundDrawable, 0L, null, null, 0L, textAlignM3504boximpl, 0L, 0, false, 0, 0, null, textStyleR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, getpostalcode, (i5 >> 6) & 14, 0, 130040);
                CrossfadeKt.serializer(referrerDetails.IconCompatParcelizer(), copyejIjP34.write(companion4, 1.0f), (requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{150, 0, null, 6}), "endColumn", ExtrasKt.write(-1825847354, new TncComposableFactoryImpl$$ExternalSyntheticLambda0(6, referrerDetails), getpostalcode), getpostalcode, 28032, 0);
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(true);
                str3 = str4;
            } else {
                getpostalcode = getpostalcode2;
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                str3 = str2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdab6E1D0lY25DehDHETb0gPJfQmz4(referrerDetails, modifier, str3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, i, i2);
            }
        }
        i3 |= 384;
        str2 = str;
        if ((i & 3072) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                i12 = Fields.CameraDistance;
            } else {
                i12 = Fields.RotationZ;
            }
            i3 |= i12;
        }
        i5 = i3;
        if ((i5 & 1171) != 1170) {
            int i210 = RemoteActionCompatParcelizer + 81;
            read = i210 % Fields.SpotShadowColor;
            int i211 = i210 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i5 & 1, z)) {
            obj = null;
            if (i20 != 0) {
                i11 = read + 119;
                RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                str4 = "TO";
            } else {
                str4 = str2;
            }
            populateViewStructure_androidKtpopulate7Serializer = CompositionKt.serializer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getpostalcode2);
            String strIconCompatParcelizer3 = referrerDetails.IconCompatParcelizer();
            String str6 = (String) ((onShowTranslationui) referrerDetails.write).getValue();
            i6 = i5 & 14;
            if (i6 == 4) {
                int i212 = RemoteActionCompatParcelizer + 111;
                read = i212 % Fields.SpotShadowColor;
                int i213 = i212 % 2;
                z2 = true;
            } else {
                int i214 = RemoteActionCompatParcelizer + 39;
                read = i214 % Fields.SpotShadowColor;
                int i215 = i214 % 2;
                z2 = false;
            }
            z3 = getpostalcode2.read(populateViewStructure_androidKtpopulate7Serializer);
            objComponentActivity = getpostalcode2.ComponentActivity();
            androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (!z2 && !z3) {
                i10 = RemoteActionCompatParcelizer + 91;
                read = i10 % Fields.SpotShadowColor;
                if (i10 % 2 == 0) {
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                if (objComponentActivity == androidContentCaptureManager) {
                    photoIdUiModelImpl$1$1 = new PhotoIdUiModelImpl$1$1(referrerDetails, populateViewStructure_androidKtpopulate7Serializer, null, 18);
                    getpostalcode2.write(photoIdUiModelImpl$1$1);
                } else {
                    photoIdUiModelImpl$1$1 = objComponentActivity;
                }
            } else {
                photoIdUiModelImpl$1$1 = new PhotoIdUiModelImpl$1$1(referrerDetails, populateViewStructure_androidKtpopulate7Serializer, null, 18);
                getpostalcode2.write(photoIdUiModelImpl$1$1);
            }
            getPhoneNumberNational.serializer(strIconCompatParcelizer3, str6, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) photoIdUiModelImpl$1$1, getpostalcode2);
            f = DualColumnTimePickerDefaults.write;
            Modifier modifierM75height3ABfNKs2 = SizeKt.m75height3ABfNKs(modifier, Dp.m3673constructorimpl(3.0f * f));
            companion = Alignment.Companion;
            measurePolicy = BoxKt.read(companion.getCenter(), false);
            iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM75height3ABfNKs2);
            companion2 = ComposeUiNode.Companion;
            constructor = companion2.getConstructor();
            if (getaddresscountry != null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            Modifier.Companion companion5 = Modifier.Companion;
            BoxKt.Box(BackgroundKt.m20backgroundbw27NRU(ClipKt.clip(SizeKt.m75height3ABfNKs(PaddingKt.m73paddingVpY3zN4$default(SizeKt.write(companion5, 1.0f), Dimensions.setActionBarVisibilityCallback, 0.0f, 2), f), RoundedCornerShapeKt.IconCompatParcelizer(Dp.m3673constructorimpl(f / 2.0f))), ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setKeyListener(), RectangleShapeKt.getRectangleShape()), getpostalcode2, 0);
            Modifier modifierThen2 = companion5.then(SizeKt.read);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer2 = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, companion.getCenterVertically(), getpostalcode2, 48);
            int iHashCode3 = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierThen2);
            constructor2 = companion2.getConstructor();
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor2);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer2, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer3);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode3), getpostalcode2));
            Modifier modifierWrite2 = copyejIjP34.write(companion5, 1.0f);
            z4 = getpostalcode2.read(list);
            objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (z4) {
                List list3 = list;
                arrayList = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
                it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((markAsRead) it.next()).serializer);
                }
                objComponentActivity2 = removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList);
                getpostalcode2.write(objComponentActivity2);
            } else {
                List list4 = list;
                arrayList = new ArrayList(accessgetInstancedelegatecp.write(list4, 10));
                it = list4.iterator();
                while (it.hasNext()) {
                    arrayList.add(((markAsRead) it.next()).serializer);
                }
                objComponentActivity2 = removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList);
                getpostalcode2.write(objComponentActivity2);
            }
            r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2 = (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) objComponentActivity2;
            String strIconCompatParcelizer4 = referrerDetails.IconCompatParcelizer();
            it2 = list.iterator();
            i7 = 0;
            while (true) {
                if (it2.hasNext()) {
                    i7 = -1;
                    break;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((markAsRead) it2.next()).serializer.read, referrerDetails.IconCompatParcelizer()}, getCieXyz.write())).booleanValue()) {
                    break;
                    break;
                }
                i7++;
            }
            if (i7 < 0) {
                i9 = 4;
                i8 = 0;
            } else {
                i8 = i7;
                i9 = 4;
            }
            if (i6 == i9) {
                int i32 = read + 103;
                RemoteActionCompatParcelizer = i32 % Fields.SpotShadowColor;
                int i33 = i32 % 2;
                z5 = true;
            } else {
                z5 = false;
            }
            objComponentActivity3 = getpostalcode2.ComponentActivity();
            if (z5) {
                objComponentActivity3 = new TncContentKt$$ExternalSyntheticLambda2(16, referrerDetails);
                getpostalcode2.write(objComponentActivity3);
            } else {
                objComponentActivity3 = new TncContentKt$$ExternalSyntheticLambda2(16, referrerDetails);
                getpostalcode2.write(objComponentActivity3);
            }
            TimePickerColumn(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2, strIconCompatParcelizer4, i8, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, modifierWrite2, getpostalcode2, 0, 0);
            TextStyle textStyleR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = performLayout.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            long backgroundDrawable2 = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setBackgroundDrawable();
            int iM3511getCentere0LSkKk2 = TextAlign.Companion.m3511getCentere0LSkKk();
            Modifier.Companion companion6 = Modifier.Companion;
            Modifier modifierM73paddingVpY3zN4$default2 = PaddingKt.m73paddingVpY3zN4$default(companion6, Dimensions.getNestedScrollAxes, 0.0f, 2);
            TextAlign textAlignM3504boximpl2 = TextAlign.m3504boximpl(iM3511getCentere0LSkKk2);
            getpostalcode = getpostalcode2;
            TextKt.m131TextNvy7gAk(str4, modifierM73paddingVpY3zN4$default2, backgroundDrawable2, 0L, null, null, 0L, textAlignM3504boximpl2, 0L, 0, false, 0, 0, null, textStyleR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2, getpostalcode, (i5 >> 6) & 14, 0, 130040);
            CrossfadeKt.serializer(referrerDetails.IconCompatParcelizer(), copyejIjP34.write(companion6, 1.0f), (requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{150, 0, null, 6}), "endColumn", ExtrasKt.write(-1825847354, new TncComposableFactoryImpl$$ExternalSyntheticLambda0(6, referrerDetails), getpostalcode), getpostalcode, 28032, 0);
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(true);
            str3 = str4;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            str3 = str2;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdab6E1D0lY25DehDHETb0gPJfQmz4(referrerDetails, modifier, str3, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, i, i2);
        }
    }
}
