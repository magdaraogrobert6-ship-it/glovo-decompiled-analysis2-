package com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.DeliveryDetailsKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.GalleryScreenKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.ImageDetailsKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.ReportBottomSheetKt;
import com.roadrunner.delivery.state.pudo.TagColorToken;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.forms.pattern.LoadingFullScreenKt;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import java.util.Iterator;
import java.util.WeakHashMap;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.InputMethodManager;
import o.RecordingInputConnection;
import o.TextFieldDefaults;
import o.buildMapping;
import o.canReadPlayIds;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getImm;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.isNestedScrollingEnabled;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.populateViewStructure;
import o.r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambday_zuDuH0rSLU3Q7PVVGz8MXtiaM;
import o.removeNodeAtDepth;
import o.setCarryoverInAppMessage;
import o.setCurrentSemanticsNodesui;
import o.showSoftInput;
import o.supportingTextPaddinga9UjIt4material3default;
import o.updateExtractedText;

/* JADX INFO: loaded from: classes3.dex */
public abstract class GalleryScreenKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;

    static {
        InputMethodManager inputMethodManager = new InputMethodManager("1", "", true, removeNodeAtDepth.serializer(new isNestedScrollingEnabled(TagColorToken.NaturalPale)), "From our community", "10 days ago", new getImm("1.4K", false), new getImm("2", false));
        r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysqSerializer = removeNodeAtDepth.serializer(inputMethodManager, inputMethodManager);
        String strRemoteActionCompatParcelizer = setCarryoverInAppMessage.RemoteActionCompatParcelizer(2, "Dirckenstraße 143, Berlin, 10178\u2028Building: Blossom • Floor: 5\u2028Entrance: Main Entrance • Intercom:2B • Apartment: 304 • Floor: 3rd • Company: Berlin • Tech Hub • Block: A");
        showSoftInput showsoftinput = showSoftInput.EXPANDED;
        r8lambdaiidsddyirtymdul5lt6pmt2zysqSerializer.getClass();
        strRemoteActionCompatParcelizer.getClass();
        int i = RemoteActionCompatParcelizer + 35;
        write = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 83 / 0;
        }
    }

    public static final void IconCompatParcelizer(ScrollState scrollState, boolean z, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z2;
        boolean z3;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1082860642);
        boolean z4 = true;
        if ((i & 6) == 0) {
            if (!(!getpostalcode.read(scrollState))) {
                int i5 = read + 39;
                serializer = i5 % Fields.SpotShadowColor;
                i3 = i5 % 2 == 0 ? 3 : 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.write(z) ? 32 : 16;
        }
        if ((i2 & 19) != 18) {
            int i6 = serializer + 49;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (getpostalcode.write(i2 & 1, z2)) {
            int i8 = serializer + 63;
            int i9 = i8 % Fields.SpotShadowColor;
            read = i9;
            int i10 = i8 % 2;
            if ((i2 & 112) == 32) {
                int i11 = i9 + 107;
                serializer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i2 & 14) == 4) {
                int i13 = serializer + 75;
                read = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
            } else {
                z4 = false;
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((z3 | z4) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new GalleryScreenKt$ScrollAnimation$1$1(z, scrollState, null, 0);
                getpostalcode.write(objComponentActivity);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, Boolean.valueOf(z), (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new RecordingInputConnection(scrollState, z, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    public static final void AddPhotoButton(String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        getPostalCode getpostalcode;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1500301137);
        if ((i & 6) == 0) {
            if (!(!getpostalcode2.read(str))) {
                int i6 = serializer + 99;
                read = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    i4 = 2;
                } else {
                    i4 = 4;
                }
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        int i7 = i2;
        if (getpostalcode2.write(i7 & 1, (i7 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion;
            companion.getClass();
            Modifier modifierClip = ClipKt.clip(companion, RoundedCornerShapeKt.IconCompatParcelizer);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(canReadPlayIds.read(BackgroundKt.m20backgroundbw27NRU(modifierClip, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getCustomSelectionActionModeCallback(), RectangleShapeKt.getRectangleShape()), null, false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode2, 63), Dimensions.setActionBarVisibilityCallback, Dimensions.setMenu);
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer(Dimensions.getNestedScrollAxes), Alignment.Companion.getCenterVertically(), getpostalcode2, 48);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierRemoteActionCompatParcelizer);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read != null) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!getpostalcode2.ComponentActivity) {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                } else {
                    int i8 = serializer + 71;
                    read = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    getpostalcode2.serializer(constructor);
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_camera, getpostalcode2, 0), (String) null, SizeKt.m83size3ABfNKs(companion, Dimensions.setHideOnContentScrollEnabled), ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), getpostalcode2, Painter.$stable | 48, 0);
                TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode2, i7 & 14, 0, 131066);
                getpostalcode = getpostalcode2;
                i3 = 1;
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            i3 = 1;
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambday_zuDuH0rSLU3Q7PVVGz8MXtiaM(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003e  */
    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:14:0x0043 A[PHI: r4 r6
  0x0043: PHI (r4v9 o.getPostalCode) = (r4v5 o.getPostalCode), (r4v11 o.getPostalCode) binds: [B:8:0x0036, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]
  0x0043: PHI (r6v13 o.getAddressCountry) = (r6v2 o.getAddressCountry), (r6v14 o.getAddressCountry) binds: [B:8:0x0036, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x009f  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:9:0x0038 A[PHI: r4 r6
  0x0038: PHI (r4v6 o.getPostalCode) = (r4v5 o.getPostalCode), (r4v11 o.getPostalCode) binds: [B:8:0x0036, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]
  0x0038: PHI (r6v3 o.getAddressCountry) = (r6v2 o.getAddressCountry), (r6v14 o.getAddressCountry) binds: [B:8:0x0036, B:5:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void Header(String str, boolean z, boolean z2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        getAddressCountry getaddresscountry;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = serializer + 17;
        read = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1701287994);
            getaddresscountry = getpostalcode.read;
            if ((i & 101) == 0) {
                if (getpostalcode.read(str)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1701287994);
            getaddresscountry = getpostalcode.read;
            if ((i & 6) == 0) {
                if (getpostalcode.read(str)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            int i8 = read + 87;
            serializer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i3 |= getpostalcode.write(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= getpostalcode.write(z2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            int i10 = read + 35;
            serializer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                    i5 = Fields.Clip;
                } else {
                    i5 = 8192;
                }
            } else {
                int i11 = 40 / 0;
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                    i5 = Fields.Clip;
                } else {
                    i5 = 8192;
                }
            }
            i3 |= i5;
        }
        if ((196608 & i) == 0) {
            i3 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            if (!getpostalcode.read(modifier)) {
                i4 = Fields.BlendMode;
            } else {
                int i12 = serializer + 43;
                read = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i4 = 1048576;
            }
            i3 |= i4;
        }
        int i14 = i3;
        if ((i14 & 599187) != 599186) {
            int i15 = read + 81;
            serializer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            z3 = true;
        } else {
            z3 = false;
        }
        if (getpostalcode.write(i14 & 1, z3)) {
            Arrangement$Center$1 arrangement$Center$1 = Arrangement.read;
            Alignment.Companion companion = Alignment.Companion;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Modifier modifierZIndex = ZIndexModifierKt.zIndex(PaddingKt.m73paddingVpY3zN4$default(SizeKt.write(modifier, 1.0f), Dimensions.setActionBarVisibilityCallback, 0.0f, 2), 1.0f);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(arrangement$Center$1, centerVertically, getpostalcode, 54);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierZIndex);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            Object obj = null;
            if (getaddresscountry != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                Modifier.Companion companion3 = Modifier.Companion;
                companion3.getClass();
                HeaderKt.read(R.drawable.ic_bold_medium_cancel_thin, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, companion3, false, null, getpostalcode, ((i14 >> 6) & 112) | 384, 24);
                supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer2 = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, companion.getCenterVertically(), getpostalcode, 48);
                int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, companion3);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    int i17 = read + 31;
                    serializer = i17 % Fields.SpotShadowColor;
                    if (i17 % 2 != 0) {
                        getpostalcode.serializer(constructor2);
                    } else {
                        getpostalcode.serializer(constructor2);
                        obj.hashCode();
                        throw null;
                    }
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                if (z2) {
                    getpostalcode.serializer(1405858635);
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_exclamation_octagon, getpostalcode, 0);
                    long supportBackgroundTintMode = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode();
                    getPostalCode getpostalcode2 = getpostalcode;
                    z4 = false;
                    Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(canReadPlayIds.read(companion3, null, false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, getpostalcode2, 63), 0.0f, 0.0f, Dimensions.getActionBarHideOffset, 0.0f, 11);
                    modifierM74paddingqDBjuR0$default.getClass();
                    IconKt.m116Iconww6aTOc(painterPainterResource, (String) null, modifierM74paddingqDBjuR0$default, supportBackgroundTintMode, getpostalcode2, Painter.$stable | 48, 0);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    z4 = false;
                    getpostalcode.serializer(1406292480);
                    getpostalcode.IconCompatParcelizer(false);
                }
                if (z) {
                    int i18 = read + 81;
                    serializer = i18 % Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                    getpostalcode.serializer(1406328967);
                    AddPhotoButton(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getpostalcode, (i14 & 14) | ((i14 >> 9) & 112));
                    getpostalcode.IconCompatParcelizer(z4);
                } else {
                    getpostalcode.serializer(1406414496);
                    getpostalcode.IconCompatParcelizer(z4);
                }
                getpostalcode.IconCompatParcelizer(true);
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new populateViewStructure(str, z, z2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, modifier, i);
        }
    }

    public static final void read(final updateExtractedText updateextractedtext, Modifier modifier, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k5, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k6, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k7, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k8, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k9, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k10, getBirthDateFull getbirthdatefull, final int i, final int i2) {
        int i3;
        int i4;
        boolean z;
        getPostalCode getpostalcode;
        final Modifier modifier2;
        int i5;
        int i6;
        boolean zIconCompatParcelizer;
        int i7;
        int i8 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-490821854);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                int i9 = read + 93;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                zIconCompatParcelizer = getpostalcode2.read(updateextractedtext);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(updateextractedtext);
            }
            if (zIconCompatParcelizer) {
                int i11 = serializer + 107;
                read = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i;
        } else {
            i3 = i;
        }
        int i13 = i3 | 48;
        if ((i & 384) == 0) {
            i13 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i13 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i13 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? Fields.Clip : 8192;
        }
        if ((i & 196608) == 0) {
            i13 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i13 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i13 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            int i14 = serializer + 71;
            read = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            i13 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k3) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k4)) {
                int i16 = serializer + 89;
                read = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                i6 = 536870912;
            } else {
                i6 = 268435456;
            }
            i13 |= i6;
        }
        if ((i2 & 6) == 0) {
            i4 = (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k5) ? 4 : 2) | i2;
        } else {
            int i18 = read + 65;
            serializer = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k6) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k7)) {
                int i20 = serializer + 87;
                read = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                i5 = Fields.RotationX;
            } else {
                int i22 = serializer + 35;
                read = i22 % Fields.SpotShadowColor;
                int i23 = i22 % 2;
                i5 = Fields.SpotShadowColor;
            }
            i4 |= i5;
        }
        if ((i2 & 3072) == 0) {
            i4 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k8) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i2 & 24576) == 0) {
            i4 |= getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm4) ? Fields.Clip : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k9) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            int i24 = serializer + 37;
            read = i24 % Fields.SpotShadowColor;
            if (i24 % 2 != 0) {
                getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k10);
                throw null;
            }
            i4 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k10) ? 1048576 : 524288;
        }
        if ((306783379 & i13) == 306783378 && (599187 & i4) == 599186) {
            int i25 = read + 121;
            serializer = i25 % Fields.SpotShadowColor;
            int i26 = i25 % 2;
            z = false;
        } else {
            z = true;
        }
        if (getpostalcode2.write(i13 & 1, z)) {
            final Modifier.Companion companion = Modifier.Companion;
            getpostalcode = getpostalcode2;
            LoadingFullScreenKt.m5039LoadingFullScreenSj8uqqQ(updateextractedtext.MediaDescriptionCompat, null, null, null, ExtrasKt.write(-776693590, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.PlatformTextInputService
                private static int ResultReceiver = 0;
                private static int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    boolean z2;
                    final boolean z3;
                    boolean z4;
                    boolean z5;
                    int i27 = 2 % 2;
                    final updateExtractedText updateextractedtext2 = updateextractedtext;
                    r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = updateextractedtext2.MediaSessionCompatQueueItem;
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if ((iIntValue & 3) != 2) {
                        int i28 = ResultReceiver + 15;
                        int i29 = i28 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i29;
                        int i30 = i28 % 2;
                        int i31 = i29 + 107;
                        ResultReceiver = i31 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i32 = i31 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull2;
                    if (getpostalcode3.write(iIntValue & 1, z2)) {
                        androidx.compose.ui.Modifier modifierM20backgroundbw27NRU = androidx.compose.foundation.BackgroundKt.m20backgroundbw27NRU(companion.then(androidx.compose.foundation.layout.SizeKt.read), ((buildMapping) getpostalcode3.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer(), androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape());
                        WeakHashMap weakHashMap = TooltipKt.serializer;
                        androidx.compose.ui.Modifier modifierWindowInsetsPadding = androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(modifierM20backgroundbw27NRU, new ThumbNodemeasure1(setRoundRectOutlineTNW_H78default.read(getpostalcode3).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, setRoundRectOutlineTNW_H78default.read(getpostalcode3).PlaybackStateCompat));
                        androidx.compose.ui.layout.MeasurePolicy measurePolicy = androidx.compose.foundation.layout.BoxKt.read(androidx.compose.ui.Alignment.Companion.getTopStart(), false);
                        int iHashCode = Long.hashCode(getpostalcode3.RatingCompat);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode3.serializer();
                        androidx.compose.ui.Modifier modifierMaterializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode3, modifierWindowInsetsPadding);
                        androidx.compose.ui.node.ComposeUiNode.Companion companion2 = androidx.compose.ui.node.ComposeUiNode.Companion;
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
                        if (getpostalcode3.read == null) {
                            SentryUUID.write();
                            throw null;
                        }
                        getpostalcode3.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode3.ComponentActivity) {
                            int i33 = ResultReceiver + 63;
                            r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i33 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i34 = i33 % 2;
                            getpostalcode3.serializer(constructor);
                        } else {
                            getpostalcode3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        af$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, measurePolicy, getpostalcode3, dragAndDropNodestartDragAndDropTransfer1Serializer);
                        AndroidContentCaptureManagerCompanion.write(getpostalcode3, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode3, Integer.valueOf(iHashCode), getpostalcode3));
                        final float f = Dimensions.setCustomView;
                        final float f2 = Dimensions.setTabContainer;
                        Iterator it = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
                        int i35 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i35 = -1;
                                break;
                            }
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((InputMethodManager) it.next()).RemoteActionCompatParcelizer, updateextractedtext2.PlaybackStateCompat}, getCieXyz.write())).booleanValue()) {
                                break;
                            }
                            i35++;
                        }
                        int i36 = i35 < 0 ? 0 : i35;
                        final InputMethodManager inputMethodManager = (InputMethodManager) r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.get(i36);
                        GalleryScreenKt.Header(updateextractedtext2.RemoteActionCompatParcelizer, updateextractedtext2.IconCompatParcelizer, inputMethodManager.MediaDescriptionCompat, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, androidx.compose.foundation.layout.SizeKt.m75height3ABfNKs(androidx.compose.foundation.layout.PaddingKt.m74paddingqDBjuR0$default(androidx.compose.ui.Modifier.Companion, 0.0f, f2, 0.0f, 0.0f, 13), f), getpostalcode3, 0);
                        if (updateextractedtext2.MediaBrowserCompatMediaItem == showSoftInput.EXPANDED) {
                            int i37 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 57;
                            ResultReceiver = i37 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i38 = i37 % 2;
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        final androidx.compose.foundation.ScrollState scrollState = PagerWrapperFlingBehavior.read(0, getpostalcode3, 1);
                        GalleryScreenKt.IconCompatParcelizer(scrollState, z3, getpostalcode3, 0);
                        boolean z6 = updateextractedtext2.MediaMetadataCompat;
                        final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm5 = r8lambdaunavo3sxub_pc9xroryotnrlvsm3;
                        final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k11 = r8lambdardpfsr94j4iebcwx_kpqzpm8k6;
                        final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k12 = r8lambdardpfsr94j4iebcwx_kpqzpm8k7;
                        final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm6 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                        final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm7 = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
                        final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k13 = r8lambdardpfsr94j4iebcwx_kpqzpm8k3;
                        final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k14 = r8lambdardpfsr94j4iebcwx_kpqzpm8k4;
                        final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k15 = r8lambdardpfsr94j4iebcwx_kpqzpm8k5;
                        final int i39 = i36;
                        androidx.compose.animation.AnimatedContentKt.write(Boolean.valueOf(z6), null, null, null, null, null, coil3.ExtrasKt.write(1049074753, new r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds() { // from class: o.showSoftwareKeyboard
                            private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 1;
                            private static int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;

                            @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
                            public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                                int i40 = 2 % 2;
                                final boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                                getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj5;
                                ((Integer) obj6).getClass();
                                ((sendDragEventEu1f8Dk) obj3).getClass();
                                final float f3 = f;
                                final float f4 = f2;
                                final androidx.compose.foundation.ScrollState scrollState2 = scrollState;
                                final boolean z7 = z3;
                                final int i41 = i39;
                                final updateExtractedText updateextractedtext3 = updateextractedtext2;
                                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm8 = r8lambdaunavo3sxub_pc9xroryotnrlvsm5;
                                final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k16 = r8lambdardpfsr94j4iebcwx_kpqzpm8k11;
                                final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k17 = r8lambdardpfsr94j4iebcwx_kpqzpm8k12;
                                final InputMethodManager inputMethodManager2 = inputMethodManager;
                                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm9 = r8lambdaunavo3sxub_pc9xroryotnrlvsm6;
                                final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm10 = r8lambdaunavo3sxub_pc9xroryotnrlvsm7;
                                final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k18 = r8lambdardpfsr94j4iebcwx_kpqzpm8k13;
                                final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k19 = r8lambdardpfsr94j4iebcwx_kpqzpm8k14;
                                final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k20 = r8lambdardpfsr94j4iebcwx_kpqzpm8k15;
                                Iconww6aTOc.serializer(null, null, false, coil3.ExtrasKt.write(1899463063, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: o.updateState
                                    private static int ComponentActivity = 1;
                                    private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys;

                                    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
                                    public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                        float fM3673constructorimpl;
                                        androidx.compose.ui.Modifier modifierM75height3ABfNKs;
                                        int i42 = 2 % 2;
                                        getShouldCreateCompositionOnAttachedToWindow getshouldcreatecompositiononattachedtowindow = (getShouldCreateCompositionOnAttachedToWindow) obj7;
                                        getBirthDateFull getbirthdatefull4 = (getBirthDateFull) obj8;
                                        int iIntValue2 = ((Integer) obj9).intValue();
                                        getshouldcreatecompositiononattachedtowindow.getClass();
                                        if ((iIntValue2 & 6) == 0) {
                                            int i43 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 13;
                                            ComponentActivity = i43 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            int i44 = i43 % 2;
                                            iIntValue2 |= ((getPostalCode) getbirthdatefull4).read(getshouldcreatecompositiononattachedtowindow) ? 4 : 2;
                                            int i45 = ComponentActivity + 99;
                                            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i45 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            int i46 = i45 % 2;
                                        }
                                        getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull4;
                                        boolean zWrite = getpostalcode4.write(iIntValue2 & 1, (iIntValue2 & 19) != 18);
                                        getAddressCountry getaddresscountry = getpostalcode4.read;
                                        if (zWrite) {
                                            boolean z8 = zBooleanValue;
                                            if (!(!z8)) {
                                                fM3673constructorimpl = Dimensions.getActionView;
                                            } else {
                                                int i47 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 57;
                                                ComponentActivity = i47 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                int i48 = i47 % 2;
                                                fM3673constructorimpl = androidx.compose.ui.unit.Dp.m3673constructorimpl(androidx.compose.ui.unit.Dp.m3673constructorimpl(Dimensions.setVisibility + f3) + f4);
                                            }
                                            float f5 = fM3673constructorimpl;
                                            getWindow getwindow = (getWindow) getshouldcreatecompositiononattachedtowindow;
                                            float fSerializer = getwindow.serializer();
                                            if (!z8) {
                                                fSerializer = androidx.compose.ui.unit.Dp.m3673constructorimpl(fSerializer * 0.5f);
                                            }
                                            float fM3673constructorimpl2 = androidx.compose.ui.unit.Dp.m3673constructorimpl(androidx.compose.ui.unit.Dp.m3673constructorimpl(getwindow.serializer() - f5) - fSerializer);
                                            androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.Companion;
                                            androidx.compose.ui.Modifier modifierThen = companion3.then(androidx.compose.foundation.layout.SizeKt.read);
                                            androidx.compose.foundation.ScrollState scrollState3 = scrollState2;
                                            boolean z9 = z7;
                                            androidx.compose.ui.Modifier modifierIconCompatParcelizer = PagerWrapperFlingBehavior.IconCompatParcelizer(modifierThen, scrollState3, z9, 12);
                                            FlingCancellationException flingCancellationException = androidx.compose.foundation.layout.Arrangement.MediaDescriptionCompat;
                                            androidx.compose.ui.Alignment.Companion companion4 = androidx.compose.ui.Alignment.Companion;
                                            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion4.getStart(), getpostalcode4, 0);
                                            int iHashCode2 = Long.hashCode(getpostalcode4.RatingCompat);
                                            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode4.serializer();
                                            androidx.compose.ui.Modifier modifierMaterializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode4, modifierIconCompatParcelizer);
                                            androidx.compose.ui.node.ComposeUiNode.Companion companion5 = androidx.compose.ui.node.ComposeUiNode.Companion;
                                            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion5.getConstructor();
                                            Object obj10 = null;
                                            if (getaddresscountry == null) {
                                                SentryUUID.write();
                                                throw null;
                                            }
                                            getpostalcode4.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                                            if (getpostalcode4.ComponentActivity) {
                                                getpostalcode4.serializer(constructor2);
                                            } else {
                                                getpostalcode4.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                                            }
                                            c8$$ExternalSyntheticOutline0.m(companion5, getpostalcode4, modalBottomSheetYbuCTN8Serializer, getpostalcode4, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                                            AndroidContentCaptureManagerCompanion.write(getpostalcode4, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion5, getpostalcode4, Integer.valueOf(iHashCode2), getpostalcode4));
                                            updateExtractedText updateextractedtext4 = updateextractedtext3;
                                            r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2 = updateextractedtext4.MediaSessionCompatQueueItem;
                                            androidx.compose.ui.Modifier modifierM75height3ABfNKs2 = androidx.compose.foundation.layout.SizeKt.m75height3ABfNKs(androidx.compose.foundation.layout.PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, f5, 0.0f, 0.0f, 13), fSerializer);
                                            int i49 = i41;
                                            com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.ImageKt.Pager(i49, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk2, z8, r8lambdaunavo3sxub_pc9xroryotnrlvsm8, r8lambdardpfsr94j4iebcwx_kpqzpm8k16, r8lambdardpfsr94j4iebcwx_kpqzpm8k17, modifierM75height3ABfNKs2, getpostalcode4, 64);
                                            if (z8) {
                                                getpostalcode4.serializer(1797763765);
                                                getpostalcode4.IconCompatParcelizer(false);
                                            } else {
                                                int i50 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 61;
                                                ComponentActivity = i50 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                if (i50 % 2 == 0) {
                                                    getpostalcode4.serializer(1796526958);
                                                    obj10.hashCode();
                                                    throw null;
                                                }
                                                getpostalcode4.serializer(1796526958);
                                                if (z9) {
                                                    modifierM75height3ABfNKs = androidx.compose.foundation.layout.SizeKt.serializer(companion3, 1.0f);
                                                    int i51 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 9;
                                                    ComponentActivity = i51 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                                    int i52 = i51 % 2;
                                                } else {
                                                    modifierM75height3ABfNKs = androidx.compose.foundation.layout.SizeKt.m75height3ABfNKs(companion3, fM3673constructorimpl2);
                                                }
                                                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion4.getCenterHorizontally(), getpostalcode4, 48);
                                                int iHashCode3 = Long.hashCode(getpostalcode4.RatingCompat);
                                                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode4.serializer();
                                                androidx.compose.ui.Modifier modifierMaterializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode4, modifierM75height3ABfNKs);
                                                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion5.getConstructor();
                                                getpostalcode4.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                                                if (!(!getpostalcode4.ComponentActivity)) {
                                                    getpostalcode4.serializer(constructor3);
                                                } else {
                                                    getpostalcode4.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                                                }
                                                c8$$ExternalSyntheticOutline0.m(companion5, getpostalcode4, modalBottomSheetYbuCTN8Serializer2, getpostalcode4, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                                                AndroidContentCaptureManagerCompanion.write(getpostalcode4, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion5, getpostalcode4, Integer.valueOf(iHashCode3), getpostalcode4));
                                                com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.ImageKt.PageIndicator(updateextractedtext4.MediaSessionCompatQueueItem.size(), i49, companion3, getpostalcode4, 384);
                                                ImageDetailsKt.ImageDetailsRow(inputMethodManager2, r8lambdaunavo3sxub_pc9xroryotnrlvsm9, r8lambdaunavo3sxub_pc9xroryotnrlvsm10, null, getpostalcode4, 8);
                                                DeliveryDetailsKt.DetailsSection(updateextractedtext4, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k18, r8lambdardpfsr94j4iebcwx_kpqzpm8k19, r8lambdardpfsr94j4iebcwx_kpqzpm8k20, getpostalcode4, 8);
                                                getpostalcode4.IconCompatParcelizer(true);
                                                getpostalcode4.IconCompatParcelizer(false);
                                            }
                                            getpostalcode4.IconCompatParcelizer(true);
                                        } else {
                                            getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                                        }
                                        return createFromParcel.INSTANCE;
                                    }
                                }, getbirthdatefull3), getbirthdatefull3, 3072, 7);
                                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                int i42 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 85;
                                r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i42 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i43 = i42 % 2;
                                return createfromparcel;
                            }
                        }, getpostalcode3), getpostalcode3, 1572864, 62);
                        hideSoftInput hidesoftinput = updateextractedtext2.ParcelableVolumeInfo;
                        if (hidesoftinput == null) {
                            int i40 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 23;
                            ResultReceiver = i40 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i40 % 2 != 0) {
                                getpostalcode3.serializer(-1558536100);
                                z5 = true;
                                getpostalcode3.IconCompatParcelizer(true);
                                z4 = false;
                            } else {
                                z5 = true;
                                getpostalcode3.serializer(-1558536100);
                                z4 = false;
                                getpostalcode3.IconCompatParcelizer(false);
                            }
                        } else {
                            z4 = false;
                            z5 = true;
                            getpostalcode3.serializer(-1558536099);
                            ReportBottomSheetKt.write(hidesoftinput, r8lambdardpfsr94j4iebcwx_kpqzpm8k8, r8lambdaunavo3sxub_pc9xroryotnrlvsm4, r8lambdardpfsr94j4iebcwx_kpqzpm8k9, r8lambdardpfsr94j4iebcwx_kpqzpm8k10, null, getpostalcode3, 0);
                            getpostalcode3.IconCompatParcelizer(false);
                        }
                        int i41 = ResultReceiver + 55;
                        r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i41 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i41 % 2 == 0) {
                            getpostalcode3.IconCompatParcelizer(z4);
                        } else {
                            getpostalcode3.IconCompatParcelizer(z5);
                        }
                    } else {
                        getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                    return createFromParcel.INSTANCE;
                }
            }, getpostalcode), getpostalcode, 24576, 14);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.PlatformImeOptions
                private static int ComponentActivity = 0;
                private static int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i27 = 2 % 2;
                    int i28 = ComponentActivity + 117;
                    r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i28 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i29 = i28 % 2;
                    ((Integer) obj2).getClass();
                    int iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                    int iRemoteActionCompatParcelizer2 = ContentType_androidKt.RemoteActionCompatParcelizer(i2);
                    GalleryScreenKt.read(updateextractedtext, modifier2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, r8lambdardpfsr94j4iebcwx_kpqzpm8k5, r8lambdardpfsr94j4iebcwx_kpqzpm8k6, r8lambdardpfsr94j4iebcwx_kpqzpm8k7, r8lambdardpfsr94j4iebcwx_kpqzpm8k8, r8lambdaunavo3sxub_pc9xroryotnrlvsm4, r8lambdardpfsr94j4iebcwx_kpqzpm8k9, r8lambdardpfsr94j4iebcwx_kpqzpm8k10, (getBirthDateFull) obj, iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer2);
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i30 = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + 57;
                    ComponentActivity = i30 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i30 % 2 != 0) {
                        int i31 = 61 / 0;
                    }
                    return createfromparcel;
                }
            };
        }
    }
}
