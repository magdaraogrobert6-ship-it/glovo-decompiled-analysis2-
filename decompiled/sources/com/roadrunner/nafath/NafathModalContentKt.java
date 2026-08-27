package com.roadrunner.nafath;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.VectorResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.message.BannerMessageKt;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidContentDataType;
import o.AndroidPathIterator_androidKtWhenMappings;
import o.DefaultPagerNestedScrollConnection;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PagerWrapperFlingBehavior;
import o.SessionMutex;
import o.buildMapping;
import o.enableBridgeSecurity;
import o.getAddressCountry;
import o.getAndroidAutofillType;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getCurrentSessionimpl;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.p2;
import o.p4;
import o.p6;
import o.p7;
import o.p9;
import o.pa;
import o.pb;
import o.performMeasureDjhGOtQ;
import o.pf;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.registerInAppMessageManagerlambda0;
import o.setCurrentSemanticsNodesui;
import o.show;
import o.withSessionCancellingPreviousimpl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NafathModalContentKt {
    private static int IconCompatParcelizer = 0;
    private static int RatingCompat = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public static final float serializer = Dp.m3673constructorimpl(100.0f);
    public static final float write = Dp.m3673constructorimpl(8.0f);

    static {
        int i = RemoteActionCompatParcelizer + 3;
        read = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 62 / 0;
        }
    }

    public static final void NafathRestrictionBanner(String str, AnnotatedString annotatedString, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-2091269979);
        if ((i & 6) == 0) {
            if (getpostalcode.read(str)) {
                i3 = 4;
            } else {
                int i5 = IconCompatParcelizer + 81;
                RatingCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(annotatedString) ? 32 : 16;
        }
        if ((i2 & 19) != 18) {
            int i7 = RatingCompat + 37;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            BannerMessageKt.IconCompatParcelizer(SizeKt.write(Modifier.Companion, 1.0f), VectorResources_androidKt.vectorResource(ImageVector.Companion, R.drawable.ic_exclamation_circle, getpostalcode, 6), str, (String) null, annotatedString, (String) null, (enableBridgeSecurity) null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) null, getpostalcode, 6 | ((i2 << 9) & 7168) | ((i2 << 12) & 458752), 468);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p2(i, 0, str, annotatedString);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0079  */
    public static final void NafathModal(pb pbVar, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        int i5 = IconCompatParcelizer + 27;
        RatingCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        pbVar.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1956051067);
        if ((i & 6) == 0) {
            int i7 = RatingCompat + 31;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (getpostalcode.IconCompatParcelizer(pbVar)) {
                int i9 = IconCompatParcelizer + 31;
                RatingCompat = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i11 = i2 | 48;
        if (getpostalcode.write(i11 & 1, (i11 & 19) != 18)) {
            modifier2 = Modifier.Companion;
            pf pfVar = (pf) ExtrasKt.write(pbVar.MediaSessionCompatQueueItem, getpostalcode, 0).getValue();
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(pbVar);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (zIconCompatParcelizer) {
                NafathModalContentKt$NafathModal$1$1 nafathModalContentKt$NafathModal$1$1 = new NafathModalContentKt$NafathModal$1$1(0, pbVar, pb.class, "onOpenNafathAppClicked", "onOpenNafathAppClicked()V", 0, 0);
                getpostalcode.write(nafathModalContentKt$NafathModal$1$1);
                objComponentActivity = nafathModalContentKt$NafathModal$1$1;
            } else {
                int i12 = IconCompatParcelizer + 59;
                RatingCompat = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                if (objComponentActivity == androidContentCaptureManager) {
                    NafathModalContentKt$NafathModal$1$1 nafathModalContentKt$NafathModal$1$2 = new NafathModalContentKt$NafathModal$1$1(0, pbVar, pb.class, "onOpenNafathAppClicked", "onOpenNafathAppClicked()V", 0, 0);
                    getpostalcode.write(nafathModalContentKt$NafathModal$1$2);
                    objComponentActivity = nafathModalContentKt$NafathModal$1$2;
                }
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity);
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(pbVar);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer2 || objComponentActivity2 == androidContentCaptureManager) {
                NafathModalContentKt$NafathModal$1$1 nafathModalContentKt$NafathModal$1$3 = new NafathModalContentKt$NafathModal$1$1(0, pbVar, pb.class, "onDismissedClicked", "onDismissedClicked()V", 0, 15);
                getpostalcode.write(nafathModalContentKt$NafathModal$1$3);
                objComponentActivity2 = nafathModalContentKt$NafathModal$1$3;
            }
            NafathModalContent(pfVar, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity2), modifier2, getpostalcode, (i11 << 6) & 7168);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p2(i, 21, pbVar, modifier2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    public static final void serializer(String str, boolean z, String str2, String str3, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = IconCompatParcelizer + 99;
        RatingCompat = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(622158321);
        if ((i & 6) == 0) {
            int i8 = IconCompatParcelizer + 89;
            RatingCompat = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                int i9 = 55 / 0;
                if (getpostalcode2.read(str)) {
                    i4 = 4;
                } else {
                    i4 = 2;
                }
            } else if (getpostalcode2.read(str)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.write(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode2.read(str2) ? Fields.RotationX : Fields.SpotShadowColor;
            int i10 = RatingCompat + 95;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode2.read(str3)) {
                int i12 = RatingCompat + 119;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                i3 = i12 % 2 != 0 ? 15387 : Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        if (getpostalcode2.write(i2 & 1, (i2 & 1171) != 1170)) {
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            SessionMutex sessionMutexSerializer = withSessionCancellingPreviousimpl.serializer(((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).IconCompatParcelizer(), getpostalcode2, 0);
            getpostalcode = getpostalcode2;
            getCurrentSessionimpl.read(null, RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.setLogo), sessionMutexSerializer, null, DefaultPagerNestedScrollConnection.serializer(Dimensions.write, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPopupTheme()), ExtrasKt.write(2088959843, new p4(0, str3, str, str2, z), getpostalcode2), getpostalcode2, 196608, 9);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p6(str, z, str2, str3, i, 0);
        }
    }

    public static final void NafathPendingContent(pf pfVar, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i3 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1464905951);
        if ((i & 6) == 0) {
            int i4 = IconCompatParcelizer + 19;
            int i5 = i4 % Fields.SpotShadowColor;
            RatingCompat = i5;
            int i6 = i4 % 2;
            if ((i & 8) == 0) {
                int i7 = i5 + 75;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                zIconCompatParcelizer = getpostalcode2.read(pfVar);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(pfVar);
            }
            i2 = (!zIconCompatParcelizer ? 2 : 4) | i;
        } else {
            int i9 = IconCompatParcelizer + 99;
            RatingCompat = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            i2 = i;
        }
        if (getpostalcode2.write(i2 & 1, (i2 & 3) != 2)) {
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            Modifier.Companion companion = Modifier.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, centerHorizontally, getpostalcode2, 48);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            TextKt.m131TextNvy7gAk(pfVar.read, null, 0L, 0L, null, null, 0L, TextAlign.m3504boximpl(TextAlign.Companion.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ((getAndroidAutofillType) getpostalcode2.write((getNewPassword) AndroidContentDataType.RemoteActionCompatParcelizer)).serializer, getpostalcode2, 0, 0, 130046);
            float f = Dimensions.setStackedBackground;
            getpostalcode = getpostalcode2;
            Object[] objArr = {getpostalcode, SizeKt.m75height3ABfNKs(companion, f)};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr);
            serializer(pfVar.MediaSessionCompatToken, pfVar.IconCompatParcelizer, pfVar.write, pfVar.MediaDescriptionCompat, getpostalcode, 0);
            Object[] objArr2 = {getpostalcode, SizeKt.m75height3ABfNKs(companion, f)};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr2);
            NafathRestrictionBanner(pfVar.RatingCompat, pfVar.PlaybackStateCompat, getpostalcode, 0);
            getpostalcode.IconCompatParcelizer(true);
            int i11 = IconCompatParcelizer + 117;
            RatingCompat = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPathIterator_androidKtWhenMappings(pfVar, i, 24);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cd  */
    public static final void NafathPendingFooter(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, String str2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-706231008);
        if ((i & 6) == 0) {
            if (getpostalcode.write(z)) {
                int i9 = RatingCompat + 91;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                i7 = i9 % 2 != 0 ? 5 : 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (!getpostalcode.read(str)) {
                i6 = 16;
            } else {
                int i10 = IconCompatParcelizer + 43;
                RatingCompat = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i6 = 32;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.read(str2)) {
                int i12 = RatingCompat + 49;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i5 = Fields.RotationX;
            } else {
                i5 = Fields.SpotShadowColor;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            i2 |= !getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationZ : Fields.CameraDistance;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                int i14 = IconCompatParcelizer + 97;
                int i15 = i14 % Fields.SpotShadowColor;
                RatingCompat = i15;
                i4 = i14 % 2 == 0 ? 21988 : Fields.Clip;
                int i16 = i15 + 39;
                IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            int i18 = RatingCompat + 81;
            IconCompatParcelizer = i18 % Fields.SpotShadowColor;
            if (i18 % 2 == 0) {
                if (getpostalcode.read(modifier)) {
                    i3 = Fields.RenderEffect;
                } else {
                    i3 = 65536;
                }
            } else {
                int i19 = 12 / 0;
                if (getpostalcode.read(modifier)) {
                    i3 = Fields.RenderEffect;
                } else {
                    i3 = 65536;
                }
            }
            i2 |= i3;
        }
        if (getpostalcode.write(i2 & 1, (74899 & i2) != 74898)) {
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!getpostalcode.ComponentActivity) {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                } else {
                    int i20 = IconCompatParcelizer + 9;
                    RatingCompat = i20 % Fields.SpotShadowColor;
                    if (i20 % 2 == 0) {
                        getpostalcode.serializer(constructor);
                        int i21 = 90 / 0;
                    } else {
                        getpostalcode.serializer(constructor);
                    }
                }
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                Modifier.Companion companion2 = Modifier.Companion;
                Modifier modifierM75height3ABfNKs = SizeKt.m75height3ABfNKs(SizeKt.write(companion2, 1.0f), write);
                Brush.Companion companion3 = Brush.Companion;
                Color.Companion companion4 = Color.Companion;
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, BackgroundKt.background$default(modifierM75height3ABfNKs, Brush.Companion.m677verticalGradient8A3gB4$default(companion3, SQLite.read(Color.m712boximpl(companion4.m757getTransparent0d7_KjU()), Color.m712boximpl(Color.m721copywmQWz5c$default(companion4.m748getBlack0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null))), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6)});
                getCurrentSessionimpl.read(SizeKt.write(companion2, 1.0f), null, withSessionCancellingPreviousimpl.serializer(((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer(), getpostalcode, 0), null, null, ExtrasKt.write(1549499448, new p9(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, z, str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1), getpostalcode), getpostalcode, 196614, 26);
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new pa(z, str, str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier, i);
        }
    }

    public static final void NafathModalContent(pf pfVar, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = RatingCompat + 85;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        pfVar.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1409866756);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            int i7 = IconCompatParcelizer + 49;
            RatingCompat = i7 % Fields.SpotShadowColor;
            if ((i7 % 2 != 0 ? (i & 8) != 0 : (i & 59) != 0) ? getpostalcode.IconCompatParcelizer(pfVar) : getpostalcode.read(pfVar)) {
                i3 = 4;
            } else {
                int i8 = RatingCompat + 39;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 != 0) {
                    int i9 = 5 % 2;
                }
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i10 = IconCompatParcelizer + 115;
            RatingCompat = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
            int i12 = IconCompatParcelizer + 17;
            RatingCompat = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
        }
        if ((i & 384) == 0) {
            int i14 = RatingCompat + 79;
            IconCompatParcelizer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i16 = i2;
        if (getpostalcode.write(i16 & 1, (i16 & 1171) != 1170)) {
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifier.then(SizeKt.read), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer(), RectangleShapeKt.getRectangleShape());
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i17 = RatingCompat + 39;
                IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            HeaderKt.m5063HeaderbbrV0mI(null, pfVar.MediaMetadataCompat, null, 0L, Dimensions.setForceShowIcon, null, null, null, null, getpostalcode, 0, 493);
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierIconCompatParcelizer = PagerWrapperFlingBehavior.IconCompatParcelizer(PaddingKt.write(companion3, Dimensions.setTabContainer).then(new show(1.0f, true)), PagerWrapperFlingBehavior.read(0, getpostalcode, 1), false, 14);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, centerHorizontally, getpostalcode, 48);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierIconCompatParcelizer);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.img_large_brand_nafath_logo, getpostalcode, 0), null, SizeKt.m83size3ABfNKs(companion3, serializer), null, null, 0.0f, null, getpostalcode, Painter.$stable | 432, 120);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, Dimensions.setStackedBackground)});
            NafathPendingContent(pfVar, getpostalcode, i16 & 14);
            getpostalcode.IconCompatParcelizer(true);
            int i19 = i16 << 6;
            NafathPendingFooter((i19 & 7168) | 196608 | (i19 & 57344), getpostalcode, SizeKt.write(companion3, 1.0f), pfVar.MediaBrowserCompatMediaItem, pfVar.RemoteActionCompatParcelizer, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, pfVar.MediaSessionCompatQueueItem);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p7((Object) pfVar, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier, i, 0);
        }
    }
}
