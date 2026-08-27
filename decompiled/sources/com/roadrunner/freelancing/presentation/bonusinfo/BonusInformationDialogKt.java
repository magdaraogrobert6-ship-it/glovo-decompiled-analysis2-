package com.roadrunner.freelancing.presentation.bonusinfo;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda2;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.home.nest.NestScreenKt$NestScreen$1$1;
import com.roadrunner.rrds.compose.component.dialog.messagedialog.MessagePopUpKt;
import com.roadrunner.rrds.compose.component.layouts.DividerKt;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidFontTypefaceLoader;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.applyStandardTemplate;
import o.buildMapping;
import o.constructCompatStyleByName;
import o.createColoredBitmap;
import o.createIconWithBackground;
import o.dc;
import o.getBirthDateFull;
import o.getBoundingRects;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.internalPathIteratorPeek;
import o.lambda321;
import o.p2;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BonusInformationDialogKt {
    private static int IconCompatParcelizer = 1;
    private static int serializer;

    public static final void read(createIconWithBackground createiconwithbackground, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        boolean zIconCompatParcelizer;
        int i4 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1424777207);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode2.read(createiconwithbackground);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(createiconwithbackground);
                int i5 = IconCompatParcelizer + 3;
                serializer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        Object obj = null;
        if ((i & 48) == 0) {
            int i7 = IconCompatParcelizer + 49;
            serializer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
            } else {
                getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                throw null;
            }
        }
        if ((i & 384) == 0) {
            int i8 = IconCompatParcelizer + 107;
            serializer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                if (getpostalcode2.read(modifier)) {
                    int i9 = serializer + 107;
                    IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                    i3 = i9 % 2 == 0 ? 4571 : Fields.RotationX;
                } else {
                    i3 = Fields.SpotShadowColor;
                }
                i2 |= i3;
            } else {
                getpostalcode2.read(modifier);
                obj.hashCode();
                throw null;
            }
        }
        if (getpostalcode2.write(i2 & 1, (i2 & 147) != 146)) {
            getpostalcode = getpostalcode2;
            MessagePopUpKt.serializer(createiconwithbackground.write, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, false, ExtrasKt.write(-245244527, new SubcomposeAsyncImageKt$$ExternalSyntheticLambda2(24, createiconwithbackground), getpostalcode2), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, null, null, getpostalcode2, (i2 & 112) | 24576 | (i2 & 896) | ((i2 << 12) & 458752), 456);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new internalPathIteratorPeek(i, 5, createiconwithbackground, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0097  */
    public static final void BonusInformationDialog(getBoundingRects getboundingrects, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3 = 2 % 2;
        getboundingrects.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-446492265);
        if ((i & 6) == 0) {
            int i4 = 5;
            if (getpostalcode.IconCompatParcelizer(getboundingrects)) {
                int i5 = serializer + 19;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    i4 = 4;
                }
            } else {
                int i6 = serializer + 15;
                IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    int i7 = 2 / 5;
                }
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        int i8 = i2 | 48;
        if (!(!getpostalcode.write(i8 & 1, (i8 & 19) != 18))) {
            modifier2 = Modifier.Companion;
            createColoredBitmap createcoloredbitmap = (createColoredBitmap) ExtrasKt.write(getboundingrects.read, getpostalcode, 0).getValue();
            if (createcoloredbitmap instanceof createIconWithBackground) {
                int i9 = IconCompatParcelizer + 87;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                getpostalcode.serializer(62860209);
                createIconWithBackground createiconwithbackground = (createIconWithBackground) createcoloredbitmap;
                boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getboundingrects);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer) {
                    NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$1 = new NestScreenKt$NestScreen$1$1(0, getboundingrects, getBoundingRects.class, "onHideDialog", "onHideDialog()V", 0, 14);
                    getpostalcode.write(nestScreenKt$NestScreen$1$1);
                    objComponentActivity = nestScreenKt$NestScreen$1$1;
                } else {
                    int i11 = serializer + 17;
                    IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                    if (i11 % 2 == 0) {
                        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                        throw null;
                    }
                    if (objComponentActivity == getCreditCardExpirationMonth.write) {
                        NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$2 = new NestScreenKt$NestScreen$1$1(0, getboundingrects, getBoundingRects.class, "onHideDialog", "onHideDialog()V", 0, 14);
                        getpostalcode.write(nestScreenKt$NestScreen$1$2);
                        objComponentActivity = nestScreenKt$NestScreen$1$2;
                    }
                }
                read(createiconwithbackground, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity), modifier2, getpostalcode, (i8 << 3) & 896);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{createcoloredbitmap, applyStandardTemplate.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 417666712, false);
                }
                getpostalcode.serializer(417675355);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidFontTypefaceLoader(i, 29, getboundingrects, modifier2);
            int i12 = IconCompatParcelizer + 91;
            serializer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b5  */
    public static final void BonusInformationContent(constructCompatStyleByName constructcompatstylebyname, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1436359433);
        if ((i & 6) == 0) {
            int i5 = IconCompatParcelizer + 31;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if ((i & 8) == 0 ? getpostalcode.read(constructcompatstylebyname) : getpostalcode.IconCompatParcelizer(constructcompatstylebyname)) {
                int i7 = serializer + 117;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
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
        int i10 = 1;
        if ((i9 & 19) != 18) {
            int i11 = IconCompatParcelizer + 47;
            serializer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!getpostalcode.write(i9 & 1, z)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            modifier = Modifier.Companion;
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(modifier, 0.0f, Dimensions.setTransitioning, 1);
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer(Dimensions.setTabContainer), Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM73paddingVpY3zN4$default);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i13 = IconCompatParcelizer + 75;
            serializer = i13 % Fields.SpotShadowColor;
            if (i13 % 2 != 0) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                int i14 = 4 / 0;
                if (!(!getpostalcode.ComponentActivity)) {
                    int i15 = IconCompatParcelizer + 1;
                    serializer = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
            } else {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    int i17 = IconCompatParcelizer + 1;
                    serializer = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            BonusSection(0, getpostalcode, null, constructcompatstylebyname.write, constructcompatstylebyname.RemoteActionCompatParcelizer);
            DividerKt.read(0.0f, 0, 7, 0L, getpostalcode, null);
            BonusSection(0, getpostalcode, null, constructcompatstylebyname.IconCompatParcelizer, constructcompatstylebyname.read);
            DisclaimerBox(0, getpostalcode, null, constructcompatstylebyname.serializer);
            getpostalcode.IconCompatParcelizer(true);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p2(i, i10, constructcompatstylebyname, modifier);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    public static final void DisclaimerBox(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i3 = 2 % 2;
        int i4 = IconCompatParcelizer + 39;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(588232963);
        if ((i & 6) == 0) {
            i2 = (!(getpostalcode2.read(str) ^ true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i6 = i2 | 48;
        if ((i6 & 19) != 18) {
            int i7 = serializer + 57;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode2.write(i6 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierClip = ClipKt.clip(companion, RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.setTitle));
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifierClip, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).RemoteActionCompatParcelizer(), RectangleShapeKt.getRectangleShape());
            float f = Dimensions.setTabContainer;
            Modifier modifierWrite = PaddingKt.write(modifierM20backgroundbw27NRU, f);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer(f), Alignment.Companion.getTop(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i8 = serializer + 59;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_bold_medium_essentials_info_outline, getpostalcode2, 0), (String) null, (Modifier) null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).read(), getpostalcode2, Painter.$stable | 48, 4);
            TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode2, i6 & 14, 0, 131066);
            getpostalcode = getpostalcode2;
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i10 = IconCompatParcelizer + 119;
            serializer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new dc(i, str, modifier2, 11);
        }
    }

    public static final void BonusSection(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, String str2) {
        int i2;
        boolean z;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-501072926);
        if ((i & 6) == 0) {
            if (getpostalcode.read(str)) {
                int i5 = IconCompatParcelizer + 109;
                serializer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(str2) ? 32 : 16;
        }
        int i7 = i2 | 384;
        if ((i7 & 147) != 146) {
            int i8 = serializer + 81;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                int i9 = 3 / 5;
            }
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i7 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer(Dimensions.setSplitBackground), Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
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
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            TextStyle textStyle = (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer());
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode, i7 & 14, 0, 131066);
            TextKt.m131TextNvy7gAk(str2, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, (i7 >> 3) & 14, 0, 131066);
            getpostalcode = getpostalcode;
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new lambda321(str, str2, modifier2, i, 2);
        }
    }
}
