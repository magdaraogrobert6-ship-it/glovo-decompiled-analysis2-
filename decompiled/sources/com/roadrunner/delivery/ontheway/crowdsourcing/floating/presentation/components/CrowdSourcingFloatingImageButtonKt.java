package com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.components;

import android.content.Context;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.b8$$ExternalSyntheticLambda4;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.accept.presentation.compose.AutoAcceptOptionKt$AutoAcceptOption$1$1;
import com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.components.CrowdSourcingFloatingImageButtonKt;
import com.roadrunner.delivery.ontheway.deliverynotes.presentation.DeliveryNotesUiModelImpl;
import com.roadrunner.delivery.pickupdropoff.codescanner.BarcodeAnalyzer$$ExternalSyntheticLambda0;
import com.roadrunner.home.floatingbutton.LoadingFloatingButtonKt$$ExternalSyntheticLambda0;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.ImeOptionsCompanion;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShortNewsContentCardView;
import o.UiMediaScopeImpl;
import o.copyYTHSh70;
import o.copyYTHSh70default;
import o.copyuxg59PA;
import o.copywBHncE4default;
import o.createFromParcel;
import o.finishComposingText;
import o.getBirthDateFull;
import o.getCapitalizationIUNYP9k;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getHintLocales;
import o.getImeActioneUduSuo;
import o.getKeyboardTypePjHm6EE;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getPushDeliveryManagerandroid_sdk_base_release;
import o.getQueryContext;
import o.performContextMenuAction;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafDO76o9OYYvjKpysJSsx90eBs8;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CrowdSourcingFloatingImageButtonKt {
    private static int IconCompatParcelizer = 1;
    private static int read;

    /* JADX WARN: Code duplicated, block: B:83:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:86:0x01da  */
    /* JADX WARN: Code duplicated, block: B:88:0x0210  */
    /* JADX WARN: Code duplicated, block: B:90:0x0215  */
    /* JADX WARN: Code duplicated, block: B:92:0x0221  */
    /* JADX WARN: Code duplicated, block: B:94:0x022b  */
    /* JADX WARN: Code duplicated, block: B:95:0x022f  */
    /* JADX WARN: Code duplicated, block: B:97:0x025d  */
    /* JADX WARN: Code duplicated, block: B:99:0x026a  */
    public static final void read(copyYTHSh70 copyythsh70, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        String strStringResource;
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode;
        int i3;
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode2;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-615575365);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(copyythsh70) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i8 = IconCompatParcelizer + 15;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i6 = Fields.RotationX;
            } else {
                i6 = Fields.SpotShadowColor;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (!getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                int i10 = IconCompatParcelizer + 31;
                read = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    int i11 = 5 % 4;
                }
                i5 = Fields.RotationZ;
            } else {
                int i12 = read + 75;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                i5 = i12 % 2 == 0 ? 8285 : Fields.CameraDistance;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2)) {
                i4 = Fields.Clip;
            } else {
                int i13 = read + 115;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i4 = 8192;
            }
            i2 |= i4;
        }
        Object obj = null;
        if ((196608 & i) == 0) {
            int i15 = read + 45;
            IconCompatParcelizer = i15 % Fields.SpotShadowColor;
            if (i15 % 2 != 0) {
                i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k3) ? Fields.RenderEffect : 65536;
            } else {
                getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k3);
                obj.hashCode();
                throw null;
            }
        }
        int i16 = i2 | 1572864;
        if ((599187 & i16) != 599186) {
            int i17 = IconCompatParcelizer + 99;
            read = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i16 & 1, z)) {
            modifier2 = Modifier.Companion;
            getImeActioneUduSuo getimeactioneudusuoRemoteActionCompatParcelizer = copyythsh70.RemoteActionCompatParcelizer();
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getimeactioneudusuoRemoteActionCompatParcelizer, getCapitalizationIUNYP9k.serializer}, getCieXyz.write())).booleanValue()) {
                getpostalcode.serializer(1137575367);
                strStringResource = StringResources_androidKt.stringResource(R.string.df_crowdsourcing_tooltip_photo_addition, getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getimeactioneudusuoRemoteActionCompatParcelizer, getKeyboardTypePjHm6EE.read}, getCieXyz.write())).booleanValue()) {
                    getpostalcode.serializer(1137581032);
                    strStringResource = StringResources_androidKt.stringResource(R.string.df_crowdsourcing_tooltip_entrance_photos, getpostalcode, 0);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getimeactioneudusuoRemoteActionCompatParcelizer, ImeOptionsCompanion.serializer}, getCieXyz.write())).booleanValue()) {
                        int i19 = IconCompatParcelizer + 107;
                        read = i19 % Fields.SpotShadowColor;
                        if (i19 % 2 != 0) {
                            getpostalcode.serializer(1137586536);
                            strStringResource = StringResources_androidKt.stringResource(R.string.df_crowdsourcing_tooltip_image_reviewing, getpostalcode, 0);
                            getpostalcode.IconCompatParcelizer(true);
                        } else {
                            getpostalcode.serializer(1137586536);
                            strStringResource = StringResources_androidKt.stringResource(R.string.df_crowdsourcing_tooltip_image_reviewing, getpostalcode, 0);
                            getpostalcode.IconCompatParcelizer(false);
                        }
                    } else {
                        throw d$$ExternalSyntheticOutline0.m(getpostalcode, 1137572065, false);
                    }
                }
            }
            String str = strStringResource;
            int i20 = read;
            int i21 = i20 + 87;
            IconCompatParcelizer = i21 % Fields.SpotShadowColor;
            if (i21 % 2 != 0) {
                if (copyythsh70 instanceof copyuxg59PA) {
                    getpostalcode.serializer(1137594033);
                    if (((copyuxg59PA) copyythsh70).MediaMetadataCompat) {
                        dragAndDropTargetModifierNode = finishComposingText.RemoteActionCompatParcelizer;
                    } else {
                        dragAndDropTargetModifierNode = null;
                    }
                    FloatingImageButtonKt.FloatingImageButton(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, dragAndDropTargetModifierNode, ExtrasKt.write(1080810538, new getPushDeliveryManagerandroid_sdk_base_release(copyythsh70, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdardpfsr94j4iebcwx_kpqzpm8k2), getpostalcode), getpostalcode, ((i16 >> 3) & 14) | 3072 | ((i16 >> 15) & 112));
                    getpostalcode.IconCompatParcelizer(false);
                } else if (copyythsh70 instanceof getHintLocales) {
                    i3 = i20 + 33;
                    IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        getpostalcode.serializer(1137640544);
                        if (((getHintLocales) copyythsh70).write) {
                            dragAndDropTargetModifierNode2 = finishComposingText.write;
                        } else {
                            dragAndDropTargetModifierNode2 = null;
                        }
                        FloatingImageButtonKt.FloatingImageButton(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, dragAndDropTargetModifierNode2, ExtrasKt.write(730197473, new LoadingFloatingButtonKt$$ExternalSyntheticLambda0((Object) copyythsh70, (Object) str, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, 3), getpostalcode), getpostalcode, ((i16 >> 3) & 14) | 3072 | ((i16 >> 15) & 112));
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(1137640544);
                        boolean z2 = ((getHintLocales) copyythsh70).write;
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                } else {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 1137592221, false);
                }
            } else {
                int i22 = 71 / 0;
                if (copyythsh70 instanceof copyuxg59PA) {
                    getpostalcode.serializer(1137594033);
                    if (((copyuxg59PA) copyythsh70).MediaMetadataCompat) {
                        dragAndDropTargetModifierNode = finishComposingText.RemoteActionCompatParcelizer;
                    } else {
                        dragAndDropTargetModifierNode = null;
                    }
                    FloatingImageButtonKt.FloatingImageButton(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, dragAndDropTargetModifierNode, ExtrasKt.write(1080810538, new getPushDeliveryManagerandroid_sdk_base_release(copyythsh70, str, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdardpfsr94j4iebcwx_kpqzpm8k2), getpostalcode), getpostalcode, ((i16 >> 3) & 14) | 3072 | ((i16 >> 15) & 112));
                    getpostalcode.IconCompatParcelizer(false);
                } else if (copyythsh70 instanceof getHintLocales) {
                    i3 = i20 + 33;
                    IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                    if (i3 % 2 != 0) {
                        getpostalcode.serializer(1137640544);
                        if (((getHintLocales) copyythsh70).write) {
                            dragAndDropTargetModifierNode2 = finishComposingText.write;
                        } else {
                            dragAndDropTargetModifierNode2 = null;
                        }
                        FloatingImageButtonKt.FloatingImageButton(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, dragAndDropTargetModifierNode2, ExtrasKt.write(730197473, new LoadingFloatingButtonKt$$ExternalSyntheticLambda0((Object) copyythsh70, (Object) str, (Object) r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, 3), getpostalcode), getpostalcode, ((i16 >> 3) & 14) | 3072 | ((i16 >> 15) & 112));
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(1137640544);
                        boolean z3 = ((getHintLocales) copyythsh70).write;
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                } else {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 1137592221, false);
                }
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new UiMediaScopeImpl(copyythsh70, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, modifier2, i, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0039  */
    /* JADX WARN: Code duplicated, block: B:12:0x003b  */
    /* JADX WARN: Code duplicated, block: B:14:0x003f A[PHI: r0
  0x003f: PHI (r0v46 o.getPostalCode) = (r0v5 o.getPostalCode), (r0v48 o.getPostalCode) binds: [B:8:0x0031, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:55:0x0115  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:9:0x0033 A[PHI: r0
  0x0033: PHI (r0v6 o.getPostalCode) = (r0v5 o.getPostalCode), (r0v48 o.getPostalCode) binds: [B:8:0x0031, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14, types: [o.getBirthDateFull, o.getPostalCode] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v3, types: [o.getPostalCode] */
    public static final void CrowdSourcingFloatingImageButton(final copywBHncE4default copywbhnce4default, Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        getPostalCode getpostalcode2;
        final ?? r0;
        final Modifier modifier2;
        ?? r2;
        boolean z;
        boolean z2;
        int i4;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        int i5 = 2 % 2;
        int i6 = read + 25;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            copywbhnce4default.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(599654379);
            if ((i & 121) == 0) {
                if (getpostalcode.read(copywbhnce4default)) {
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
            copywbhnce4default.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(599654379);
            if ((i & 6) == 0) {
                if (getpostalcode.read(copywbhnce4default)) {
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
        int i7 = i3 | 48;
        final int i8 = 0;
        int i9 = 1;
        if (getpostalcode2.write(i7 & 1, (i7 & 19) != 18)) {
            final Modifier.Companion companion = Modifier.Companion;
            Context context = (Context) getpostalcode2.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext());
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write(copywbhnce4default.write(), getpostalcode2, 0);
            copyYTHSh70default copyythsh70default = (copyYTHSh70default) ExtrasKt.write(copywbhnce4default.RemoteActionCompatParcelizer(), getpostalcode2, 0).getValue();
            if (copyythsh70default instanceof copyYTHSh70) {
                getQueryContext getquerycontext = copywbhnce4default.read();
                int i10 = i7 & 14;
                boolean z3 = i10 == 4;
                boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(context);
                Object objComponentActivity = getpostalcode2.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (z3 | zIconCompatParcelizer) {
                    objComponentActivity = new performContextMenuAction(copywbhnce4default, context);
                    getpostalcode2.write(objComponentActivity);
                } else {
                    int i11 = IconCompatParcelizer + 53;
                    read = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    if (objComponentActivity == androidContentCaptureManager) {
                        objComponentActivity = new performContextMenuAction(copywbhnce4default, context);
                        getpostalcode2.write(objComponentActivity);
                    }
                }
                SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode2, 8);
                boolean zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(context);
                boolean z4 = i10 == 4;
                Object objComponentActivity2 = getpostalcode2.ComponentActivity();
                if ((zIconCompatParcelizer2 | z4) || objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new performContextMenuAction(context, copywbhnce4default);
                    getpostalcode2.write(objComponentActivity2);
                }
                getPhoneNumberNational.serializer(createFromParcel.INSTANCE, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode2);
                copyYTHSh70 copyythsh70 = (copyYTHSh70) copyythsh70default;
                getImeActioneUduSuo getimeactioneudusuoRemoteActionCompatParcelizer = copyythsh70.RemoteActionCompatParcelizer();
                boolean zSerializer = copyythsh70.serializer();
                String strIconCompatParcelizer = copyythsh70.IconCompatParcelizer();
                boolean z5 = getpostalcode2.read(copyythsh70default);
                if (i10 == 4) {
                    int i13 = read + 35;
                    IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                    if (i13 % 2 == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                Object objComponentActivity3 = getpostalcode2.ComponentActivity();
                boolean z6 = z | z5;
                ShortNewsContentCardView shortNewsContentCardView = null;
                if (z6 || objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new DeliveryNotesUiModelImpl.AnonymousClass1(copyythsh70, copywbhnce4default, shortNewsContentCardView, i9);
                    getpostalcode2.write(objComponentActivity3);
                }
                getPhoneNumberNational.RemoteActionCompatParcelizer(getimeactioneudusuoRemoteActionCompatParcelizer, Boolean.valueOf(zSerializer), strIconCompatParcelizer, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity3, getpostalcode2);
                boolean z7 = getpostalcode2.read(populateViewStructure_androidKtpopulate7Write);
                Object objComponentActivity4 = getpostalcode2.ComponentActivity();
                if (z7 || objComponentActivity4 == androidContentCaptureManager) {
                    objComponentActivity4 = new r8lambdafDO76o9OYYvjKpysJSsx90eBs8(populateViewStructure_androidKtpopulate7Write, 8);
                    getpostalcode2.write(objComponentActivity4);
                }
                Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4);
                MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
                int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierGraphicsLayer);
                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
                if (getpostalcode2.read != null) {
                    int i14 = read + 101;
                    IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode2.ComponentActivity) {
                        getpostalcode2.serializer(constructor);
                    } else {
                        getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    af$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                    if (i10 == 4) {
                        int i16 = IconCompatParcelizer + 73;
                        read = i16 % Fields.SpotShadowColor;
                        if (i16 % 2 != 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                    } else {
                        z2 = false;
                    }
                    Object objComponentActivity5 = getpostalcode2.ComponentActivity();
                    if (z2 || objComponentActivity5 == androidContentCaptureManager) {
                        AutoAcceptOptionKt$AutoAcceptOption$1$1 autoAcceptOptionKt$AutoAcceptOption$1$1 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(0, copywbhnce4default, copywBHncE4default.class, "onClick", "onClick()V", 0, 19);
                        getpostalcode2.write(autoAcceptOptionKt$AutoAcceptOption$1$1);
                        objComponentActivity5 = autoAcceptOptionKt$AutoAcceptOption$1$1;
                    }
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity5);
                    boolean z8 = i10 == 4;
                    Object objComponentActivity6 = getpostalcode2.ComponentActivity();
                    if (!z8) {
                        int i17 = read + 69;
                        IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                        int i18 = i17 % 2;
                        if (objComponentActivity6 == androidContentCaptureManager) {
                            objComponentActivity6 = new BarcodeAnalyzer$$ExternalSyntheticLambda0(17, copywbhnce4default);
                            getpostalcode2.write(objComponentActivity6);
                        }
                    } else {
                        objComponentActivity6 = new BarcodeAnalyzer$$ExternalSyntheticLambda0(17, copywbhnce4default);
                        getpostalcode2.write(objComponentActivity6);
                    }
                    r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity6;
                    Object objComponentActivity7 = getpostalcode2.ComponentActivity();
                    if (objComponentActivity7 == androidContentCaptureManager) {
                        i4 = 1;
                        objComponentActivity7 = new b8$$ExternalSyntheticLambda4(1);
                        getpostalcode2.write(objComponentActivity7);
                    } else {
                        i4 = 1;
                    }
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity7;
                    Object objComponentActivity8 = getpostalcode2.ComponentActivity();
                    if (objComponentActivity8 == androidContentCaptureManager) {
                        objComponentActivity8 = new b8$$ExternalSyntheticLambda4(i4);
                        getpostalcode2.write(objComponentActivity8);
                    }
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity8;
                    Object objComponentActivity9 = getpostalcode2.ComponentActivity();
                    if (objComponentActivity9 == androidContentCaptureManager) {
                        objComponentActivity9 = new b8$$ExternalSyntheticLambda4(i4);
                        getpostalcode2.write(objComponentActivity9);
                    }
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity9;
                    modifier2 = companion;
                    ?? r1 = i4;
                    ?? r3 = getpostalcode2;
                    read(copyythsh70, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, null, r3, 224256);
                    r3.IconCompatParcelizer(r1);
                    r0 = r1;
                    r2 = r3;
                } else {
                    SentryUUID.write();
                    throw null;
                }
            } else {
                int i19 = read + 47;
                IconCompatParcelizer = i19 % Fields.SpotShadowColor;
                if (i19 % 2 == 0) {
                    gethandleruiannotationsMediaDescriptionCompat = getpostalcode2.MediaDescriptionCompat();
                    int i20 = 73 / 0;
                    if (gethandleruiannotationsMediaDescriptionCompat == null) {
                        return;
                    }
                } else {
                    gethandleruiannotationsMediaDescriptionCompat = getpostalcode2.MediaDescriptionCompat();
                    if (gethandleruiannotationsMediaDescriptionCompat == null) {
                        return;
                    }
                }
                gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getExtractedText
                    private static int MediaMetadataCompat = 1;
                    private static int RemoteActionCompatParcelizer;

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        int i21 = 2 % 2;
                        int i22 = MediaMetadataCompat + 21;
                        RemoteActionCompatParcelizer = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i23 = i22 % 2;
                        int i24 = i8;
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        int i25 = i;
                        androidx.compose.ui.Modifier modifier3 = companion;
                        copywBHncE4default copywbhnce4default2 = copywbhnce4default;
                        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                        ((Integer) obj2).getClass();
                        if (i24 != 0) {
                            CrowdSourcingFloatingImageButtonKt.CrowdSourcingFloatingImageButton(copywbhnce4default2, modifier3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i25 | 1));
                            return createfromparcel;
                        }
                        CrowdSourcingFloatingImageButtonKt.CrowdSourcingFloatingImageButton(copywbhnce4default2, modifier3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i25 | 1));
                        int i26 = MediaMetadataCompat + 81;
                        RemoteActionCompatParcelizer = i26 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i27 = i26 % 2;
                        return createfromparcel;
                    }
                };
                return;
            }
        } else {
            r0 = 1;
            getPostalCode getpostalcode3 = getpostalcode2;
            getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            r2 = getpostalcode3;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat2 = r2.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat2 != null) {
            gethandleruiannotationsMediaDescriptionCompat2.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.getExtractedText
                private static int MediaMetadataCompat = 1;
                private static int RemoteActionCompatParcelizer;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i21 = 2 % 2;
                    int i22 = MediaMetadataCompat + 21;
                    RemoteActionCompatParcelizer = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i23 = i22 % 2;
                    int i24 = r0;
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i25 = i;
                    androidx.compose.ui.Modifier modifier3 = modifier2;
                    copywBHncE4default copywbhnce4default2 = copywbhnce4default;
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                    ((Integer) obj2).getClass();
                    if (i24 != 0) {
                        CrowdSourcingFloatingImageButtonKt.CrowdSourcingFloatingImageButton(copywbhnce4default2, modifier3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i25 | 1));
                        return createfromparcel;
                    }
                    CrowdSourcingFloatingImageButtonKt.CrowdSourcingFloatingImageButton(copywbhnce4default2, modifier3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i25 | 1));
                    int i26 = MediaMetadataCompat + 81;
                    RemoteActionCompatParcelizer = i26 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i27 = i26 % 2;
                    return createfromparcel;
                }
            };
        }
    }
}
