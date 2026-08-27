package com.roadrunner.delivery.ontheway.crowdsourcing.sharing.presentation.compose;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.compose.AsyncImagePainter;
import com.braze.ui.support.ViewUtils$$ExternalSyntheticLambda6;
import com.huawei.riemann.location.common.utils.Constant;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.database.dao.SessionDao_Impl$$ExternalSyntheticLambda1;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.rrds.compose.component.dialog.messagedialog.MessagePopUpKt;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import java.util.Iterator;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidFontTypefaceLoader;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.DefaultLazyKey;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.LinearGradientShaderVjE6UOUdefault;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PagerWrapperFlingBehavior;
import o.PopulateViewStructure_androidKtpopulate7;
import o.ShaderKt;
import o.ShadowCompanion;
import o.TextFieldDefaults;
import o.accessgetLayerBlockp;
import o.accessgetMorphcp;
import o.accessgetOnImeActionPerformedp;
import o.buildMapping;
import o.computeDirection;
import o.computeHorizontalScrollExtent;
import o.computeVerticalScrollExtent;
import o.equalEnum;
import o.generatePOSTBodyString;
import o.getAddressCountry;
import o.getBaseInputConnection;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getNonZeroRgk1Os;
import o.getOffsetF1C5BW0annotations;
import o.getPostalCode;
import o.getStore;
import o.getTopLeftannotations;
import o.handleUrlOverridelambda1;
import o.isInvalidIndex;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.processInputCommandsapplyToState;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaaawFTjN5WDWgcOgLP5ubNLgfVTw;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.restartInputImmediately;
import o.setCurrentSemanticsNodesui;
import o.setOnRequestDisallowInterceptTouchEventui;
import o.setTransformQ8lPUPs;
import o.show;
import o.snapElevation;
import o.supportingTextPaddinga9UjIt4material3default;
import okio.Okio;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ContentSharingContentKt {
    private static int IconCompatParcelizer = 1;
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    public static final float RemoteActionCompatParcelizer = Dp.m3673constructorimpl(75.0f);
    private static int read;
    public static final getTopLeftannotations serializer;
    public static final float write;

    static {
        float f = Dimensions.read;
        write = Dimensions.setVisibility;
        serializer = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.setItemInvoker);
        int i = IconCompatParcelizer + 5;
        read = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i2 = 1 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    public static final void AddMoreImageCell(int i, getBirthDateFull getbirthdatefull, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        int i5 = MediaDescriptionCompat + 57;
        MediaMetadataCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1955160509);
        if ((i & 6) == 0) {
            int i7 = MediaMetadataCompat + 5;
            MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i9 = MediaMetadataCompat + 21;
                MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i3 = 4;
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
        if ((i2 & 19) != 18) {
            int i11 = MediaDescriptionCompat + 101;
            MediaMetadataCompat = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            int i12 = MediaDescriptionCompat + 81;
            MediaMetadataCompat = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            float f = Dimensions.read;
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            long popupTheme = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPopupTheme();
            getTopLeftannotations gettopleftannotations = serializer;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(ClipKt.clip(BorderKt.write(modifier, f, popupTheme, gettopleftannotations), gettopleftannotations), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).serializer(), RectangleShapeKt.getRectangleShape());
            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getCenter(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i14 = MediaDescriptionCompat + 71;
            MediaMetadataCompat = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                int i16 = MediaMetadataCompat + 31;
                MediaDescriptionCompat = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
            }
            af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            float f2 = write;
            equalEnum.IconCompatParcelizer(R.drawable.ic_bold_medium_add_default, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, false, null, f2, f2, getpostalcode, ((i2 << 3) & 112) | 1769472, 28);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaaawFTjN5WDWgcOgLP5ubNLgfVTw(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, i, 8);
        }
    }

    public static final void ImageGrid(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean zIconCompatParcelizer;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1503981891);
        if ((i & 6) == 0) {
            int i6 = MediaMetadataCompat + 103;
            MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0 ? (i & 8) == 0 : (i & 57) == 0) {
                zIconCompatParcelizer = getpostalcode.read(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
            }
            if (zIconCompatParcelizer) {
                int i7 = MediaDescriptionCompat + 63;
                MediaMetadataCompat = i7 % Fields.SpotShadowColor;
                i3 = i7 % 2 == 0 ? 5 : 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= !(getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ^ true) ? 256 : Fields.SpotShadowColor;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            Modifier modifierWrite = SizeKt.write(Modifier.Companion, 1.0f);
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer(Dimensions.setActionBarVisibilityCallback), Alignment.Companion.getTop(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                getpostalcode.serializer(447810108);
                Iterator<E> it = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
                int i8 = 0;
                while (!(!it.hasNext())) {
                    Object next = it.next();
                    if (i8 >= 0) {
                        int i9 = MediaDescriptionCompat + 117;
                        MediaMetadataCompat = i9 % Fields.SpotShadowColor;
                        if (i9 % i4 != 0) {
                            restartInputImmediately restartinputimmediately = (restartInputImmediately) next;
                            Modifier modifierM83size3ABfNKs = SizeKt.m83size3ABfNKs(Modifier.Companion, RemoteActionCompatParcelizer);
                            if (restartinputimmediately instanceof processInputCommandsapplyToState) {
                                getpostalcode.serializer(1615629917);
                                processInputCommandsapplyToState processinputcommandsapplytostate = (processInputCommandsapplyToState) restartinputimmediately;
                                String str = processinputcommandsapplytostate.IconCompatParcelizer;
                                boolean z = (i2 & 896) == 256;
                                boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(restartinputimmediately);
                                Object objComponentActivity = getpostalcode.ComponentActivity();
                                if ((zIconCompatParcelizer2 | z) || objComponentActivity == getCreditCardExpirationMonth.write) {
                                    objComponentActivity = new ViewUtils$$ExternalSyntheticLambda6(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 20, processinputcommandsapplytostate);
                                    getpostalcode.write(objComponentActivity);
                                }
                                modifierM83size3ABfNKs.getClass();
                                CapturedImageThumbnail(0, getpostalcode, modifierM83size3ABfNKs, str, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity);
                                getpostalcode.IconCompatParcelizer(false);
                            } else if (restartinputimmediately instanceof accessgetOnImeActionPerformedp) {
                                getpostalcode.serializer(1615640652);
                                modifierM83size3ABfNKs.getClass();
                                AddMoreImageCell(((i2 >> 3) & 14) | 48, getpostalcode, modifierM83size3ABfNKs, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                                getpostalcode.IconCompatParcelizer(false);
                            } else {
                                throw d$$ExternalSyntheticOutline0.m(getpostalcode, 1615627305, false);
                            }
                            i8++;
                            i4 = 2;
                        } else {
                            SizeKt.m83size3ABfNKs(Modifier.Companion, RemoteActionCompatParcelizer);
                            boolean z2 = ((restartInputImmediately) next) instanceof processInputCommandsapplyToState;
                            throw null;
                        }
                    } else {
                        SQLite.serializer();
                        throw null;
                    }
                }
                getpostalcode.IconCompatParcelizer(false);
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getStore(i, 6, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0046  */
    /* JADX WARN: Code duplicated, block: B:17:0x0052 A[PHI: r3 r4
  0x0052: PHI (r3v9 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v11 o.getPostalCode) binds: [B:8:0x002f, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r4v19 o.getAddressCountry) = (r4v2 o.getAddressCountry), (r4v20 o.getAddressCountry) binds: [B:8:0x002f, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0031 A[PHI: r3 r4
  0x0031: PHI (r3v6 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v11 o.getPostalCode) binds: [B:8:0x002f, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r4v3 o.getAddressCountry) = (r4v2 o.getAddressCountry), (r4v20 o.getAddressCountry) binds: [B:8:0x002f, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void SubjectInfo(setOnRequestDisallowInterceptTouchEventui setonrequestdisallowintercepttoucheventui, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        getAddressCountry getaddresscountry;
        int i2;
        int i3;
        int i4;
        Modifier modifier2;
        int i5 = 2 % 2;
        int i6 = MediaMetadataCompat + 125;
        MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(545127708);
            getaddresscountry = getpostalcode.read;
            if ((i & 11) == 0) {
                if (!getpostalcode.IconCompatParcelizer(setonrequestdisallowintercepttoucheventui)) {
                    i3 = 2;
                } else {
                    i2 = MediaMetadataCompat + 123;
                    MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        i3 = 2;
                    } else {
                        i3 = 4;
                    }
                }
                i4 = i3 | i;
                int i7 = MediaDescriptionCompat + 7;
                MediaMetadataCompat = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            } else {
                i4 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(545127708);
            getaddresscountry = getpostalcode.read;
            if ((i & 6) == 0) {
                if (!getpostalcode.IconCompatParcelizer(setonrequestdisallowintercepttoucheventui)) {
                    i3 = 2;
                } else {
                    i2 = MediaMetadataCompat + 123;
                    MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        i3 = 2;
                    } else {
                        i3 = 4;
                    }
                }
                i4 = i3 | i;
                int i9 = MediaDescriptionCompat + 7;
                MediaMetadataCompat = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
            } else {
                i4 = i;
            }
        }
        int i11 = i4 | 48;
        Object obj = null;
        if (getpostalcode.write(i11 & 1, (i11 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = SizeKt.write(companion, 1.0f);
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            snapElevation snapelevationIconCompatParcelizer = Arrangement.IconCompatParcelizer(Dimensions.setMenu);
            Alignment.Companion companion2 = Alignment.Companion;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(snapelevationIconCompatParcelizer, companion2.getTop(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                modifier2 = companion;
                getNonZeroRgk1Os.write(Integer.valueOf(R.drawable.ic_info_circle), null, SizeKt.m83size3ABfNKs(companion, Dimensions.removeMenuProvider), Okio.RemoteActionCompatParcelizer(R.drawable.ic_info_circle, getpostalcode, 0), null, null, null, null, null, null, getpostalcode, (Painter.$stable << 9) | 48, 0, 32752);
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer(Dimensions.getNestedScrollAxes), companion2.getStart(), getpostalcode, 0);
                int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifier2);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!getpostalcode.ComponentActivity) {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                } else {
                    int i12 = MediaMetadataCompat + 45;
                    MediaDescriptionCompat = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    getpostalcode.serializer(constructor2);
                }
                c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                String str = setonrequestdisallowintercepttoucheventui.title;
                TextStyle textStyle = (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer());
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                getPostalCode getpostalcode2 = getpostalcode;
                TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode2, 0, 0, 131066);
                TextKt.m131TextNvy7gAk(setonrequestdisallowintercepttoucheventui.subtitle, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode2, 0, 0, 131066);
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        int i14 = MediaMetadataCompat + 55;
        int i15 = i14 % Fields.SpotShadowColor;
        MediaDescriptionCompat = i15;
        int i16 = i14 % 2;
        int i17 = i15 + 59;
        MediaMetadataCompat = i17 % Fields.SpotShadowColor;
        if (i17 % 2 != 0) {
            getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidFontTypefaceLoader(i, 3, setonrequestdisallowintercepttoucheventui, modifier2);
                return;
            }
            return;
        }
        getpostalcode.MediaDescriptionCompat();
        obj.hashCode();
        throw null;
    }

    public static final void CapturedImageThumbnail(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-334820698);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= !getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 16 : 32;
        }
        Object obj = null;
        if ((i & 384) == 0) {
            int i4 = MediaMetadataCompat + 13;
            MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                getpostalcode.read(modifier);
                obj.hashCode();
                throw null;
            }
            i2 |= getpostalcode.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i5 = i2;
        if (!getpostalcode.write(i5 & 1, (i5 & 147) != 146)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i6 = MediaDescriptionCompat + 35;
            MediaMetadataCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            int i8 = MediaDescriptionCompat + 9;
            MediaMetadataCompat = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                getpostalcode.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                obj.hashCode();
                throw null;
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager2 = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager2) {
                objComponentActivity = CompositionKt.RemoteActionCompatParcelizer("");
                getpostalcode.write(objComponentActivity);
                int i9 = MediaMetadataCompat + 25;
                MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity;
            float fMo48toPx0680j_4 = ((Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity())).mo48toPx0680j_4(Dimensions.setItemInvoker);
            int iMo48toPx0680j_4 = (int) ((Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity())).mo48toPx0680j_4(RemoteActionCompatParcelizer);
            Context context = (Context) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext());
            int i11 = i5 & 14;
            boolean z2 = i11 == 4;
            boolean z3 = getpostalcode.read(iMo48toPx0680j_4);
            boolean zSerializer = getpostalcode.serializer(fMo48toPx0680j_4);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if ((z2 | z3 | zSerializer) || objComponentActivity2 == androidContentCaptureManager2) {
                setTransformQ8lPUPs settransformq8lpups = new setTransformQ8lPUPs(context);
                settransformq8lpups.IconCompatParcelizer = str;
                DefaultContentCardsUpdateHandlerCompanionCREATOR1.read(iMo48toPx0680j_4);
                ShadowCompanion shadowCompanion = new ShadowCompanion(iMo48toPx0680j_4);
                DefaultContentCardsUpdateHandlerCompanionCREATOR1.read(iMo48toPx0680j_4);
                settransformq8lpups.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new getOffsetF1C5BW0annotations(new accessgetLayerBlockp(shadowCompanion, new ShadowCompanion(iMo48toPx0680j_4)));
                LinearGradientShaderVjE6UOUdefault.serializer(settransformq8lpups, new accessgetMorphcp(fMo48toPx0680j_4));
                LinearGradientShaderVjE6UOUdefault.write(settransformq8lpups);
                objComponentActivity2 = settransformq8lpups.IconCompatParcelizer();
                getpostalcode.write(objComponentActivity2);
            }
            ShaderKt shaderKt = (ShaderKt) objComponentActivity2;
            if (i11 == 4) {
                int i12 = MediaDescriptionCompat + 25;
                MediaMetadataCompat = i12 % Fields.SpotShadowColor;
                if (i12 % 2 == 0) {
                    int i13 = 5 / 2;
                }
                z = true;
            } else {
                z = false;
            }
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (z || objComponentActivity3 == androidContentCaptureManager2) {
                objComponentActivity3 = new SessionDao_Impl$$ExternalSyntheticLambda1(str, 20, populateViewStructure_androidKtpopulate7);
                getpostalcode.write(objComponentActivity3);
            }
            AsyncImagePainter asyncImagePainterRemoteActionCompatParcelizer = computeDirection.RemoteActionCompatParcelizer(shaderKt, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, null, getpostalcode, 0, 26);
            float f = Dimensions.read;
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            long popupTheme = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPopupTheme();
            getTopLeftannotations gettopleftannotations = serializer;
            Modifier modifierClip = ClipKt.clip(BorderKt.write(modifier, f, popupTheme, gettopleftannotations), gettopleftannotations);
            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getCenter(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierClip);
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
            ImageKt.Image(asyncImagePainterRemoteActionCompatParcelizer, (String) populateViewStructure_androidKtpopulate7.getValue(), BackgroundKt.m20backgroundbw27NRU(Modifier.Companion.then(SizeKt.read), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).serializer(), RectangleShapeKt.getRectangleShape()), null, ContentScale.Companion.getCrop(), 0.0f, null, getpostalcode, 24576, 104);
            float f2 = write;
            equalEnum.IconCompatParcelizer(R.drawable.ic_trash, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, false, null, f2, f2, getpostalcode, (i5 & 112) | 1769472, 28);
            getpostalcode.IconCompatParcelizer(true);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new computeHorizontalScrollExtent(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, i, 7);
        }
    }

    public static final void ContentSharingContent(getBaseInputConnection getbaseinputconnection, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        Modifier.Companion companion;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = MediaMetadataCompat + 57;
        MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k3.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k4.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1317458396);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            if (getpostalcode.IconCompatParcelizer(getbaseinputconnection)) {
                int i10 = MediaMetadataCompat + 111;
                MediaDescriptionCompat = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        Object obj = null;
        if ((i & 384) == 0) {
            int i12 = MediaMetadataCompat + 109;
            MediaDescriptionCompat = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                obj.hashCode();
                throw null;
            }
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                i5 = Fields.RotationX;
            } else {
                int i13 = MediaDescriptionCompat + 47;
                MediaMetadataCompat = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i5 = Fields.SpotShadowColor;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k3)) {
                i4 = Fields.RenderEffect;
            } else {
                int i15 = MediaMetadataCompat + 123;
                MediaDescriptionCompat = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                i4 = 65536;
            }
            i2 |= i4;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k4) ? 1048576 : Fields.BlendMode;
        }
        int i17 = i2 | 12582912;
        if ((4793491 & i17) != 4793490) {
            int i18 = MediaDescriptionCompat + 43;
            MediaMetadataCompat = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i17 & 1, z)) {
            Modifier.Companion companion2 = Modifier.Companion;
            if (getbaseinputconnection.MediaBrowserCompatMediaItem) {
                getpostalcode.serializer(992292856);
                generatePOSTBodyString generatepostbodystring = getbaseinputconnection.RemoteActionCompatParcelizer;
                companion2.getClass();
                companion = companion2;
                i3 = 0;
                MessagePopUpKt.serializer(generatepostbodystring, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, companion, false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, null, getpostalcode, ((i17 >> 12) & 112) | 384 | ((i17 << 3) & 458752) | ((i17 << 6) & 29360128), 344);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                companion = companion2;
                i3 = 0;
                getpostalcode.serializer(992619782);
                getpostalcode.IconCompatParcelizer(false);
            }
            Modifier.Companion companion3 = companion;
            Modifier modifierThen = companion3.then(SizeKt.read);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifierThen, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).IconCompatParcelizer(), RectangleShapeKt.getRectangleShape());
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion4 = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion4.getStart(), getpostalcode, i3);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion5.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            int i20 = MediaDescriptionCompat + 107;
            MediaMetadataCompat = i20 % Fields.SpotShadowColor;
            int i21 = i20 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion5, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion5, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            HeaderKt.serializer(null, getbaseinputconnection.MediaMetadataCompat, 0L, null, ExtrasKt.write(-1596250059, new DefaultLazyKey(6, r8lambdardpfsr94j4iebcwx_kpqzpm8k1), getpostalcode), null, null, getpostalcode, 196608, Constant.ERROR_WSS_NO_DATA);
            float f = Dimensions.setActionBarVisibilityCallback;
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(PagerWrapperFlingBehavior.IconCompatParcelizer(PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, f, 0.0f, 0.0f, 13).then(new show(1.0f, true)), PagerWrapperFlingBehavior.read(0, getpostalcode, 1), false, 14), f, 0.0f, 2);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion4.getStart(), getpostalcode, 0);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM73paddingVpY3zN4$default);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion5.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!getpostalcode.ComponentActivity) {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            } else {
                getpostalcode.serializer(constructor2);
            }
            c8$$ExternalSyntheticOutline0.m(companion5, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion5, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            TextKt.m131TextNvy7gAk(getbaseinputconnection.serializer, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode, 0, 0, 131066);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, Dimensions.getNestedScrollAxes)});
            ImageGrid(getbaseinputconnection.write, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, getpostalcode, i17 & 1008);
            setOnRequestDisallowInterceptTouchEventui setonrequestdisallowintercepttoucheventui = getbaseinputconnection.RatingCompat;
            if (setonrequestdisallowintercepttoucheventui == null) {
                getpostalcode.serializer(-1927629337);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-1927629336);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, f)});
                SubjectInfo(setonrequestdisallowintercepttoucheventui, null, getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(false);
            }
            int i22 = MediaDescriptionCompat + 105;
            MediaMetadataCompat = i22 % Fields.SpotShadowColor;
            int i23 = i22 % 2;
            getpostalcode.IconCompatParcelizer(true);
            Modifier modifierWrite = PaddingKt.write(BackgroundKt.m20backgroundbw27NRU(ShadowKt.m317shadows4CzXII$default(SizeKt.write(companion3, 1.0f), Dimensions.getTabContainer, null, false, 0L, 0L, 30, null), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).IconCompatParcelizer(), RectangleShapeKt.getRectangleShape()), f);
            MeasurePolicy measurePolicy = BoxKt.read(companion4.getTopStart(), false);
            int iHashCode3 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion5.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor3);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion5, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion5, getpostalcode, Integer.valueOf(iHashCode3), getpostalcode));
            PrimaryKt.write(getbaseinputconnection.MediaSessionCompatQueueItem, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, SizeKt.write(companion3, 1.0f), false, false, null, null, null, null, null, getpostalcode, ((i17 >> 15) & 112) | 384, 0, 2040);
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(true);
            int i24 = MediaDescriptionCompat + 29;
            MediaMetadataCompat = i24 % Fields.SpotShadowColor;
            int i25 = i24 % 2;
            modifier2 = companion3;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new computeVerticalScrollExtent((Object) getbaseinputconnection, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, (isInvalidIndex) r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, modifier2, i, 6);
        }
    }
}
