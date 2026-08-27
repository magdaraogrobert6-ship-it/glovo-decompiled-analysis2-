package com.roadrunner.delivery.ontheway.entrancepicture.floatingicon.presentation;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.tooling.PreviewActivity$$ExternalSyntheticLambda2;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.b8$$ExternalSyntheticLambda4;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.ontheway.navigation.presentation.compose.NavigationButtonKt$NavigationButton$2$1;
import com.roadrunner.rrds.compose.component.tooltip.TooltipKt;
import io.sentry.SentryUUID;
import o.AdjustBridgeUtil1;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.IconButtonKt;
import o.PopulateViewStructure_androidKtpopulate7;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getHasCamera;
import o.getNativeTypefacePYhJU0U;
import o.getPostalCode;
import o.getQueryContext;
import o.getStore;
import o.lambdainit2;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdanw7AWrZT1ZtNTucsvl4gTUEQRqg;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;
import o.setSpanStyle;
import o.toAccessibilitySpannableString;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EntrancePictureIconKt {
    private static int read = 0;
    private static int serializer = 1;

    public static final void RemoteActionCompatParcelizer(IconButtonKt iconButtonKt, boolean z, DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(282692514);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(iconButtonKt) ^ true ? 2 : 4) | i;
            int i6 = serializer + 13;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.write(z)) {
                int i8 = read + 13;
                serializer = i8 % Fields.SpotShadowColor;
                i4 = i8 % 2 == 0 ? 122 : 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
            int i9 = serializer + 15;
            read = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        if ((i & 384) == 0) {
            int i11 = serializer + 15;
            read = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                int i13 = serializer + 95;
                read = i13 % Fields.SpotShadowColor;
                i3 = i13 % 2 != 0 ? 3834 : Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            Modifier modifierAlign = iconButtonKt.align(Modifier.Companion, Alignment.Companion.getTopStart());
            AdjustBridgeUtil1 adjustBridgeUtil1 = AdjustBridgeUtil1.BOTTOM;
            String strStringResource = StringResources_androidKt.stringResource(R.string.entrance_images_available, getpostalcode, 0);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new b8$$ExternalSyntheticLambda4(1);
                getpostalcode.write(objComponentActivity);
            }
            TooltipKt.m5064TooltipgHHVGI(strStringResource, dragAndDropTargetModifierNode, modifierAlign, 0L, 0L, adjustBridgeUtil1, 0.0f, 0.0f, z, false, false, false, null, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, ((i2 >> 3) & 112) | 1572864 | ((i2 << 24) & 1879048192), 196608, 32184);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdanw7AWrZT1ZtNTucsvl4gTUEQRqg(iconButtonKt, z, dragAndDropTargetModifierNode, i, 4);
        }
    }

    public static final void write(getNativeTypefacePYhJU0U getnativetypefacepyhju0u, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        boolean z;
        int i3;
        boolean zIconCompatParcelizer;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1519084577);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode2.read(getnativetypefacepyhju0u);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(getnativetypefacepyhju0u);
            }
            if (zIconCompatParcelizer) {
                int i6 = serializer + 65;
                read = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i8 = serializer + 49;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i10 = read + 47;
                serializer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        Object obj = null;
        if ((i & 3072) == 0) {
            int i12 = serializer + 43;
            read = i12 % Fields.SpotShadowColor;
            if (i12 % 2 == 0) {
                i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? Fields.CameraDistance : Fields.RotationZ;
            } else {
                getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2);
                throw null;
            }
        }
        int i13 = i2;
        int i14 = serializer + 37;
        read = i14 % Fields.SpotShadowColor;
        int i15 = i14 % 2;
        if (getpostalcode2.write(i13 & 1, (i13 & 1171) != 1170)) {
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                int i16 = serializer + 61;
                read = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                objComponentActivity = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                getpostalcode2.write(objComponentActivity);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity;
            int i18 = getnativetypefacepyhju0u.IconCompatParcelizer;
            if (getnativetypefacepyhju0u.read && ((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue()) {
                int i19 = serializer + 113;
                read = i19 % Fields.SpotShadowColor;
                if (i19 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                z = true;
            } else {
                z = false;
            }
            getpostalcode = getpostalcode2;
            EntrancePictureCommonKt.write(i18, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, ExtrasKt.write(738610348, new PreviewActivity$$ExternalSyntheticLambda2(getnativetypefacepyhju0u, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, populateViewStructure_androidKtpopulate7, 3), getpostalcode2), getpostalcode2, ((i13 << 3) & 896) | 24576, 8);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getHasCamera(getnativetypefacepyhju0u, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, i, 17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:79:0x01cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x01ce  */
    public static final void EntrancePictureIcon(EntrancePictureIconUiModelImpl entrancePictureIconUiModelImpl, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        AndroidContentCaptureManager androidContentCaptureManager;
        AndroidContentCaptureManager androidContentCaptureManager2;
        boolean z;
        Object objComponentActivity;
        int i3;
        int i4 = 2 % 2;
        entrancePictureIconUiModelImpl.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(684746908);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(entrancePictureIconUiModelImpl) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i5 = i2 | 48;
        if ((i & 384) == 0) {
            i5 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 256 : Fields.SpotShadowColor;
        }
        if (getpostalcode.write(i5 & 1, (i5 & 147) != 146)) {
            int i6 = read + 91;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            Modifier.Companion companion = Modifier.Companion;
            getQueryContext getquerycontext = entrancePictureIconUiModelImpl.serializer;
            boolean z2 = (i5 & 896) == 256;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager3 = getCreditCardExpirationMonth.write;
            if (z2 || objComponentActivity2 == androidContentCaptureManager3) {
                objComponentActivity2 = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(21, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode.write(objComponentActivity2);
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 8);
            toAccessibilitySpannableString toaccessibilityspannablestring = (toAccessibilitySpannableString) ExtrasKt.write(entrancePictureIconUiModelImpl.ParcelableVolumeInfo, getpostalcode, 0).getValue();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{toaccessibilityspannablestring, setSpanStyle.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                if (toaccessibilityspannablestring instanceof getNativeTypefacePYhJU0U) {
                    getpostalcode.serializer(-1798969086);
                    float fFloatValue = ((Number) ExtrasKt.write(entrancePictureIconUiModelImpl.PlaybackStateCompatCustomAction, getpostalcode, 0).getValue()).floatValue();
                    boolean zSerializer = getpostalcode.serializer(fFloatValue);
                    Object objComponentActivity3 = getpostalcode.ComponentActivity();
                    if (zSerializer || objComponentActivity3 == androidContentCaptureManager3) {
                        objComponentActivity3 = new lambdainit2(fFloatValue, 1);
                        getpostalcode.write(objComponentActivity3);
                    }
                    Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3);
                    MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
                    int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierGraphicsLayer);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
                    if (getpostalcode.read != null) {
                        getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode.ComponentActivity) {
                            getpostalcode.serializer(constructor);
                        } else {
                            getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                        AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                        getNativeTypefacePYhJU0U getnativetypefacepyhju0u = (getNativeTypefacePYhJU0U) toaccessibilityspannablestring;
                        int i8 = i5 & 14;
                        boolean z3 = i8 == 4;
                        Object objComponentActivity4 = getpostalcode.ComponentActivity();
                        if (z3 || objComponentActivity4 == androidContentCaptureManager3) {
                            NavigationButtonKt$NavigationButton$2$1 navigationButtonKt$NavigationButton$2$1 = new NavigationButtonKt$NavigationButton$2$1(0, entrancePictureIconUiModelImpl, EntrancePictureIconUiModelImpl.class, "onClick", "onClick()V", 0, 18);
                            getpostalcode.write(navigationButtonKt$NavigationButton$2$1);
                            objComponentActivity4 = navigationButtonKt$NavigationButton$2$1;
                        }
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity4);
                        boolean z4 = i8 == 4;
                        Object objComponentActivity5 = getpostalcode.ComponentActivity();
                        if (z4) {
                            androidContentCaptureManager = androidContentCaptureManager3;
                        } else {
                            androidContentCaptureManager = androidContentCaptureManager3;
                            if (objComponentActivity5 != androidContentCaptureManager) {
                                androidContentCaptureManager2 = androidContentCaptureManager;
                            }
                            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity5);
                            if (i8 == 4) {
                                z = true;
                            } else {
                                z = false;
                            }
                            objComponentActivity = getpostalcode.ComponentActivity();
                            if (!z) {
                                NavigationButtonKt$NavigationButton$2$1 navigationButtonKt$NavigationButton$2$2 = new NavigationButtonKt$NavigationButton$2$1(0, entrancePictureIconUiModelImpl, EntrancePictureIconUiModelImpl.class, "logEntrancePictureLoadError", "logEntrancePictureLoadError()V", 0, 20);
                                getpostalcode.write(navigationButtonKt$NavigationButton$2$2);
                                objComponentActivity = navigationButtonKt$NavigationButton$2$2;
                            } else {
                                i3 = serializer + 35;
                                read = i3 % Fields.SpotShadowColor;
                                if (i3 % 2 != 0) {
                                    int i9 = 49 / 0;
                                    if (objComponentActivity == androidContentCaptureManager2) {
                                        NavigationButtonKt$NavigationButton$2$1 navigationButtonKt$NavigationButton$2$3 = new NavigationButtonKt$NavigationButton$2$1(0, entrancePictureIconUiModelImpl, EntrancePictureIconUiModelImpl.class, "logEntrancePictureLoadError", "logEntrancePictureLoadError()V", 0, 20);
                                        getpostalcode.write(navigationButtonKt$NavigationButton$2$3);
                                        objComponentActivity = navigationButtonKt$NavigationButton$2$3;
                                    }
                                } else if (objComponentActivity == androidContentCaptureManager2) {
                                    NavigationButtonKt$NavigationButton$2$1 navigationButtonKt$NavigationButton$2$4 = new NavigationButtonKt$NavigationButton$2$1(0, entrancePictureIconUiModelImpl, EntrancePictureIconUiModelImpl.class, "logEntrancePictureLoadError", "logEntrancePictureLoadError()V", 0, 20);
                                    getpostalcode.write(navigationButtonKt$NavigationButton$2$4);
                                    objComponentActivity = navigationButtonKt$NavigationButton$2$4;
                                }
                            }
                            write(getnativetypefacepyhju0u, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity), getpostalcode, 0);
                            getpostalcode.IconCompatParcelizer(true);
                            getpostalcode.IconCompatParcelizer(false);
                        }
                        androidContentCaptureManager2 = androidContentCaptureManager;
                        NavigationButtonKt$NavigationButton$2$1 navigationButtonKt$NavigationButton$2$5 = new NavigationButtonKt$NavigationButton$2$1(0, entrancePictureIconUiModelImpl, EntrancePictureIconUiModelImpl.class, "onTooltipShown", "onTooltipShown()V", 0, 19);
                        getpostalcode.write(navigationButtonKt$NavigationButton$2$5);
                        objComponentActivity5 = navigationButtonKt$NavigationButton$2$5;
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity5);
                        if (i8 == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objComponentActivity = getpostalcode.ComponentActivity();
                        if (!z) {
                            NavigationButtonKt$NavigationButton$2$1 navigationButtonKt$NavigationButton$2$6 = new NavigationButtonKt$NavigationButton$2$1(0, entrancePictureIconUiModelImpl, EntrancePictureIconUiModelImpl.class, "logEntrancePictureLoadError", "logEntrancePictureLoadError()V", 0, 20);
                            getpostalcode.write(navigationButtonKt$NavigationButton$2$6);
                            objComponentActivity = navigationButtonKt$NavigationButton$2$6;
                        } else {
                            i3 = serializer + 35;
                            read = i3 % Fields.SpotShadowColor;
                            if (i3 % 2 != 0) {
                                int i10 = 49 / 0;
                                if (objComponentActivity == androidContentCaptureManager2) {
                                    NavigationButtonKt$NavigationButton$2$1 navigationButtonKt$NavigationButton$2$7 = new NavigationButtonKt$NavigationButton$2$1(0, entrancePictureIconUiModelImpl, EntrancePictureIconUiModelImpl.class, "logEntrancePictureLoadError", "logEntrancePictureLoadError()V", 0, 20);
                                    getpostalcode.write(navigationButtonKt$NavigationButton$2$7);
                                    objComponentActivity = navigationButtonKt$NavigationButton$2$7;
                                }
                            } else if (objComponentActivity == androidContentCaptureManager2) {
                                NavigationButtonKt$NavigationButton$2$1 navigationButtonKt$NavigationButton$2$8 = new NavigationButtonKt$NavigationButton$2$1(0, entrancePictureIconUiModelImpl, EntrancePictureIconUiModelImpl.class, "logEntrancePictureLoadError", "logEntrancePictureLoadError()V", 0, 20);
                                getpostalcode.write(navigationButtonKt$NavigationButton$2$8);
                                objComponentActivity = navigationButtonKt$NavigationButton$2$8;
                            }
                        }
                        write(getnativetypefacepyhju0u, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity), getpostalcode, 0);
                        getpostalcode.IconCompatParcelizer(true);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        SentryUUID.write();
                        throw null;
                    }
                } else {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 911794056, false);
                }
            } else {
                int i11 = serializer + 5;
                read = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                getpostalcode.serializer(911797248);
                getpostalcode.IconCompatParcelizer(false);
                companion = companion;
            }
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getStore(i, 7, modifier2, (Object) entrancePictureIconUiModelImpl, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
    }
}
