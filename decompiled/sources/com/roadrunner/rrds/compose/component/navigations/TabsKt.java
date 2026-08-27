package com.roadrunner.rrds.compose.component.navigations;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.pager.PagerDefaults$$ExternalSyntheticLambda0;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.viewinterop.AndroidViewBindingKt$$ExternalSyntheticLambda7;
import androidx.sqlite.SQLite;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import o.AdjustBridgeInstance2;
import o.AdjustBridgeInstance3;
import o.AdjustBridgeInstance5;
import o.AdjustBridgeInstance7;
import o.AdjustBridgeUtil;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.PagerWrapperFlingBehavior;
import o.SwitchDefaults;
import o.SwitchKt;
import o.TapGestureDetectorKtdetectTapGestures21;
import o.TextFieldDefaults;
import o.buildMapping;
import o.extractJsonLong;
import o.getBirthDateFull;
import o.getContentViewGroupParentLayout;
import o.getCreditCardExpirationMonth;
import o.getCurrentSessionimpl;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.onViewAttachedToWindow;
import o.performMeasureDjhGOtQ;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg;
import o.supportingTextPaddinga9UjIt4material3default;
import o.withSessionCancellingPreviousimpl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TabsKt {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;

    public static final void serializer(String str, AdjustBridgeInstance2 adjustBridgeInstance2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        long jOnConfigurationChanged;
        long primaryBackground;
        int i3 = 2 % 2;
        str.getClass();
        adjustBridgeInstance2.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(2144383755);
        boolean z2 = true;
        if ((i & 6) == 0) {
            int i4 = write + 117;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                getpostalcode.read(str);
                throw null;
            }
            i2 = (!(getpostalcode.read(str) ^ true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(adjustBridgeInstance2.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i5 = write + 113;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationX : Fields.SpotShadowColor;
            int i7 = IconCompatParcelizer + 37;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        int i9 = i2;
        if ((i9 & 147) != 146) {
            int i10 = IconCompatParcelizer + 119;
            write = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i9 & 1, z)) {
            int[] iArr = AdjustBridgeInstance7.serializer;
            int i12 = iArr[adjustBridgeInstance2.ordinal()];
            if (i12 == 1) {
                getpostalcode.serializer(-831507863);
                jOnConfigurationChanged = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onConfigurationChanged();
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (i12 != 2) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -831509366, false);
                }
                getpostalcode.serializer(-831505749);
                jOnConfigurationChanged = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).invalidateMenu();
                getpostalcode.IconCompatParcelizer(false);
            }
            onViewAttachedToWindow onviewattachedtowindowIconCompatParcelizer = TapGestureDetectorKtdetectTapGestures21.IconCompatParcelizer(jOnConfigurationChanged, null, null, null, getpostalcode, 0, 14);
            int i13 = iArr[adjustBridgeInstance2.ordinal()];
            if (i13 != 1) {
                int i14 = IconCompatParcelizer;
                int i15 = i14 + 1;
                write = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                if (i13 != 2) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -831501590, false);
                }
                int i17 = i14 + 63;
                write = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                getpostalcode.serializer(-831497915);
                primaryBackground = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getContentHeight();
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-831499965);
                primaryBackground = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPrimaryBackground();
                getpostalcode.IconCompatParcelizer(false);
            }
            onViewAttachedToWindow onviewattachedtowindowIconCompatParcelizer2 = TapGestureDetectorKtdetectTapGestures21.IconCompatParcelizer(primaryBackground, null, null, null, getpostalcode, 0, 14);
            Modifier.Companion companion = Modifier.Companion;
            if ((i9 & 896) != 256) {
                int i19 = IconCompatParcelizer + 59;
                write = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                z2 = false;
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (z2 || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new extractJsonLong(6, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode.write(objComponentActivity);
            }
            getCurrentSessionimpl.read(ClickableKt.RemoteActionCompatParcelizer(companion, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, 15), RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.fullyDrawnReporter_delegatelambda00), withSessionCancellingPreviousimpl.serializer(((Color) onviewattachedtowindowIconCompatParcelizer.getValue()).m732unboximpl(), getpostalcode, 0), null, null, ExtrasKt.write(511367549, new PagerDefaults$$ExternalSyntheticLambda0(str, 22, onviewattachedtowindowIconCompatParcelizer2), getpostalcode), getpostalcode, 196608, 24);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU(str, adjustBridgeInstance2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i, 15);
        }
    }

    public static final void ScrollableTabRow(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, PagerState pagerState, Modifier modifier, SwitchKt switchKt, Alignment.Horizontal horizontal, getBirthDateFull getbirthdatefull, int i) {
        SwitchKt switchKt2;
        Alignment.Horizontal horizontal2;
        SwitchKt switchDefaults;
        int i2;
        Alignment.Horizontal start;
        AdjustBridgeInstance2 adjustBridgeInstance2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        pagerState.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(855267652);
        int i5 = (i & 6) == 0 ? (getpostalcode.read(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            int i6 = write + 41;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (getpostalcode.read(pagerState)) {
                int i8 = write + 69;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i5 |= i3;
        }
        if ((i & 384) == 0) {
            i5 |= getpostalcode.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
            int i10 = IconCompatParcelizer + 13;
            write = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
        if ((i & 3072) == 0) {
            int i12 = IconCompatParcelizer + 113;
            write = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            i5 |= Fields.RotationZ;
        }
        int i14 = i5 | 24576;
        if (getpostalcode.write(i14 & 1, (i14 & 9363) != 9362)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) == 0 || getpostalcode.PlaybackStateCompat()) {
                float f = Dimensions.generateLayoutParams;
                switchDefaults = new SwitchDefaults(f, f, f, f);
                i2 = i14 & (-7169);
                start = Alignment.Companion.getStart();
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                i2 = i14 & (-7169);
                switchDefaults = switchKt;
                start = horizontal;
            }
            getpostalcode.RemoteActionCompatParcelizer();
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode);
                getpostalcode.write(objComponentActivity);
            }
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objComponentActivity;
            Modifier modifierIconCompatParcelizer = PaddingKt.IconCompatParcelizer(PagerWrapperFlingBehavior.serializer(modifier, PagerWrapperFlingBehavior.read(0, getpostalcode, 1), true, false), switchDefaults);
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.serializer(Dimensions.setMenu, start), Alignment.Companion.getTop(), getpostalcode, 0);
            switchKt2 = switchDefaults;
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierIconCompatParcelizer);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i15 = write + 77;
                IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            getpostalcode.serializer(1739457471);
            int i17 = 0;
            for (Object obj : r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) {
                if (i17 < 0) {
                    SQLite.serializer();
                    throw null;
                }
                String str = ((AdjustBridgeInstance5) obj).serializer;
                if (pagerState.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.RemoteActionCompatParcelizer() == i17) {
                    int i18 = write + 31;
                    IconCompatParcelizer = i18 % Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                    adjustBridgeInstance2 = AdjustBridgeInstance2.SELECTED;
                } else {
                    adjustBridgeInstance2 = AdjustBridgeInstance2.DESELECTED;
                }
                boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getcontentviewgroupparentlayout);
                if ((i2 & 112) == 32) {
                    int i20 = IconCompatParcelizer + 43;
                    write = i20 % Fields.SpotShadowColor;
                    int i21 = i20 % 2;
                    z = true;
                } else {
                    z = false;
                }
                boolean z2 = getpostalcode.read(i17);
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if ((zIconCompatParcelizer | z | z2) || objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new AdjustBridgeUtil(i17, pagerState, getcontentviewgroupparentlayout);
                    getpostalcode.write(objComponentActivity2);
                }
                serializer(str, adjustBridgeInstance2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, getpostalcode, 0);
                i17++;
            }
            getpostalcode.IconCompatParcelizer(false);
            getpostalcode.IconCompatParcelizer(true);
            horizontal2 = start;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            switchKt2 = switchKt;
            horizontal2 = horizontal;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, pagerState, modifier, switchKt2, horizontal2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:89:0x017f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0193  */
    public static final void ScrollableTabRow(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, SwitchDefaults switchDefaults, Alignment.Horizontal horizontal, getBirthDateFull getbirthdatefull, int i2) {
        AdjustBridgeInstance2 adjustBridgeInstance2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = IconCompatParcelizer + 105;
        write = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1077533442);
        int i8 = (i2 & 6) == 0 ? (getpostalcode.read(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i8 |= getpostalcode.read(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i8 |= !getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? Fields.SpotShadowColor : Fields.RotationX;
        }
        if ((i2 & 3072) == 0) {
            i8 |= getpostalcode.read(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i2 & 24576) == 0) {
            i8 |= getpostalcode.read(switchDefaults) ? Fields.Clip : 8192;
        }
        if ((196608 & i2) == 0) {
            if (!getpostalcode.read(horizontal)) {
                i4 = 65536;
            } else {
                int i9 = write + 57;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    throw null;
                }
                i4 = Fields.RenderEffect;
            }
            i8 |= i4;
        }
        if (getpostalcode.write(i8 & 1, (74899 & i8) != 74898)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i2 & 1) != 0 && !getpostalcode.PlaybackStateCompat()) {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            getpostalcode.RemoteActionCompatParcelizer();
            Modifier modifierIconCompatParcelizer = PaddingKt.IconCompatParcelizer(PagerWrapperFlingBehavior.serializer(modifier, PagerWrapperFlingBehavior.read(0, getpostalcode, 1), true, false), switchDefaults);
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.serializer(Dimensions.setMenu, horizontal), Alignment.Companion.getTop(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierIconCompatParcelizer);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i10 = write + 113;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!getpostalcode.ComponentActivity) {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            } else {
                getpostalcode.serializer(constructor);
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            getpostalcode.serializer(1276145055);
            int i12 = 0;
            for (Object obj : r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) {
                if (i12 < 0) {
                    SQLite.serializer();
                    throw null;
                }
                String str = ((AdjustBridgeInstance5) obj).serializer;
                if (i == i12) {
                    int i13 = write + 91;
                    IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    adjustBridgeInstance2 = AdjustBridgeInstance2.SELECTED;
                } else {
                    adjustBridgeInstance2 = AdjustBridgeInstance2.DESELECTED;
                }
                boolean z = (i8 & 896) == 256;
                boolean z2 = getpostalcode.read(i12);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if (!(z | z2)) {
                    int i15 = IconCompatParcelizer + 87;
                    write = i15 % Fields.SpotShadowColor;
                    if (i15 % 2 == 0) {
                        int i16 = 6 / 0;
                        if (objComponentActivity == getCreditCardExpirationMonth.write) {
                            int i17 = IconCompatParcelizer + 93;
                            write = i17 % Fields.SpotShadowColor;
                            int i18 = i17 % 2;
                        } else {
                            i3 = 0;
                        }
                    } else if (objComponentActivity == getCreditCardExpirationMonth.write) {
                        int i19 = IconCompatParcelizer + 93;
                        write = i19 % Fields.SpotShadowColor;
                        int i110 = i19 % 2;
                    } else {
                        i3 = 0;
                    }
                    serializer(str, adjustBridgeInstance2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, i3);
                    i12++;
                }
                i3 = 0;
                objComponentActivity = new AdjustBridgeInstance3(i12, 0, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                getpostalcode.write(objComponentActivity);
                serializer(str, adjustBridgeInstance2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, i3);
                i12++;
            }
            getpostalcode.IconCompatParcelizer(false);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidViewBindingKt$$ExternalSyntheticLambda7(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, i, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier, switchDefaults, horizontal, i2);
        }
    }
}
