package com.roadrunner.delivery.ontheway.crowdsourcing.navigation.presentation.compose;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.b8$$ExternalSyntheticLambda4;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.ontheway.crowdsourcing.common.presentation.ImageFromUrlKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.common.presentation.PicturesCounterKt;
import com.roadrunner.delivery.ontheway.navigation.presentation.compose.NavigationButtonKt$NavigationButton$2$1;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DefaultPagerNestedScrollConnection;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.KeyboardCapitalizationCompanion;
import o.PaddingValuesYgX7TsAdefault;
import o.accessgetCharacterscp;
import o.buildMapping;
import o.canReadPlayIds;
import o.equalEnum;
import o.getBirthDateFull;
import o.getCharactersIUNYP9kannotations;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getHasCamera;
import o.getNewPassword;
import o.getNoneIUNYP9kannotations;
import o.getPostalCode;
import o.getQueryContext;
import o.getStore;
import o.getUnspecifiedIUNYP9kannotations;
import o.performMeasureDjhGOtQ;
import o.position;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdaaawFTjN5WDWgcOgLP5ubNLgfVTw;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;
import o.sendSynthesizedKeyEvent;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NavigationCrowdsourcingKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    public static final void read(int i, getBirthDateFull getbirthdatefull, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1035391735);
        if ((i & 6) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i6 = write + 121;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                i4 = i6 % 2 != 0 ? 3 : 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            int i7 = RemoteActionCompatParcelizer + 117;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.read(modifier)) {
                int i9 = write + 103;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if (getpostalcode.write(i2 & 1, !((i2 & 19) == 18))) {
            float f = Dimensions.setCustomView;
            equalEnum.IconCompatParcelizer(R.drawable.ic_bold_large_file_image_portrait, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, false, null, f, f, getpostalcode, (i2 << 3) & 1008, 24);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaaawFTjN5WDWgcOgLP5ubNLgfVTw(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, i, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x016a  */
    public static final void NavigationCrowdsourcing(accessgetCharacterscp accessgetcharacterscp, Modifier modifier, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = RemoteActionCompatParcelizer + 61;
        write = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        accessgetcharacterscp.getClass();
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1555152742);
        if ((i & 6) == 0) {
            if (getpostalcode.read(accessgetcharacterscp)) {
                int i8 = RemoteActionCompatParcelizer + 11;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        int i10 = i2 | 48;
        if ((i & 384) == 0) {
            int i11 = RemoteActionCompatParcelizer + 125;
            write = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                    int i12 = write + 29;
                    RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                    i3 = i12 % 2 != 0 ? 22858 : Fields.RotationX;
                } else {
                    i3 = Fields.SpotShadowColor;
                }
                i10 |= i3;
            } else {
                getpostalcode.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
                throw null;
            }
        }
        int i13 = i10;
        if ((i13 & 147) != 146) {
            int i14 = RemoteActionCompatParcelizer + 25;
            write = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!getpostalcode.write(i13 & 1, z))) {
            int i16 = write + 41;
            RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            Modifier.Companion companion = Modifier.Companion;
            sendSynthesizedKeyEvent sendsynthesizedkeyevent = (sendSynthesizedKeyEvent) accessgetcharacterscp;
            getUnspecifiedIUNYP9kannotations getunspecifiediunyp9kannotations = (getUnspecifiedIUNYP9kannotations) ExtrasKt.write(sendsynthesizedkeyevent.MediaBrowserCompatMediaItem, getpostalcode, 0).getValue();
            boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getunspecifiediunyp9kannotations, getNoneIUNYP9kannotations.write}, getCieXyz.write())).booleanValue();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (zBooleanValue) {
                getpostalcode.serializer(146843486);
                getpostalcode.IconCompatParcelizer(false);
                androidContentCaptureManager = androidContentCaptureManager;
                sendsynthesizedkeyevent = sendsynthesizedkeyevent;
                companion = companion;
            } else if (getunspecifiediunyp9kannotations instanceof KeyboardCapitalizationCompanion) {
                getpostalcode.serializer(146845768);
                boolean z2 = (i13 & 14) == 4;
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if (z2 || objComponentActivity == androidContentCaptureManager) {
                    NavigationButtonKt$NavigationButton$2$1 navigationButtonKt$NavigationButton$2$1 = new NavigationButtonKt$NavigationButton$2$1(0, accessgetcharacterscp, accessgetCharacterscp.class, "onClick", "onClick()V", 0, 1);
                    getpostalcode.write(navigationButtonKt$NavigationButton$2$1);
                    objComponentActivity = navigationButtonKt$NavigationButton$2$1;
                }
                read(i13 & 112, getpostalcode, companion, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity));
                getpostalcode.IconCompatParcelizer(false);
            } else {
                androidContentCaptureManager = androidContentCaptureManager;
                sendsynthesizedkeyevent = sendsynthesizedkeyevent;
                companion = companion;
                if (getunspecifiediunyp9kannotations instanceof getCharactersIUNYP9kannotations) {
                    getpostalcode.serializer(146851404);
                    getCharactersIUNYP9kannotations getcharactersiunyp9kannotations = (getCharactersIUNYP9kannotations) getunspecifiediunyp9kannotations;
                    boolean z3 = (i13 & 14) == 4;
                    Object objComponentActivity2 = getpostalcode.ComponentActivity();
                    if (z3) {
                        NavigationButtonKt$NavigationButton$2$1 navigationButtonKt$NavigationButton$2$2 = new NavigationButtonKt$NavigationButton$2$1(0, accessgetcharacterscp, accessgetCharacterscp.class, "onClick", "onClick()V", 0, 2);
                        getpostalcode.write(navigationButtonKt$NavigationButton$2$2);
                        objComponentActivity2 = navigationButtonKt$NavigationButton$2$2;
                    } else {
                        int i18 = write + 31;
                        RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
                        if (i18 % 2 != 0) {
                            int i19 = 49 / 0;
                            if (objComponentActivity2 == androidContentCaptureManager) {
                                NavigationButtonKt$NavigationButton$2$1 navigationButtonKt$NavigationButton$2$3 = new NavigationButtonKt$NavigationButton$2$1(0, accessgetcharacterscp, accessgetCharacterscp.class, "onClick", "onClick()V", 0, 2);
                                getpostalcode.write(navigationButtonKt$NavigationButton$2$3);
                                objComponentActivity2 = navigationButtonKt$NavigationButton$2$3;
                            }
                        } else if (objComponentActivity2 == androidContentCaptureManager) {
                            NavigationButtonKt$NavigationButton$2$1 navigationButtonKt$NavigationButton$2$4 = new NavigationButtonKt$NavigationButton$2$1(0, accessgetcharacterscp, accessgetCharacterscp.class, "onClick", "onClick()V", 0, 2);
                            getpostalcode.write(navigationButtonKt$NavigationButton$2$4);
                            objComponentActivity2 = navigationButtonKt$NavigationButton$2$4;
                        }
                    }
                    NavigationCrowdsourcingWithImage(getcharactersiunyp9kannotations, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity2), companion, null, getpostalcode, (i13 << 3) & 896);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 146839785, false);
                }
            }
            getQueryContext getquerycontext = sendsynthesizedkeyevent.IconCompatParcelizer;
            boolean z4 = (i13 & 896) == 256;
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (z4 || objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new PaddingValuesYgX7TsAdefault(1, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
                getpostalcode.write(objComponentActivity3);
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, getpostalcode, 8);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getStore(i, 5, modifier2, (Object) accessgetcharacterscp, (Object) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        }
    }

    public static final void NavigationCrowdsourcingWithImage(getCharactersIUNYP9kannotations getcharactersiunyp9kannotations, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
        boolean zIconCompatParcelizer;
        int i3 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1213746384);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode.read(getcharactersiunyp9kannotations);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getcharactersiunyp9kannotations);
                int i4 = write + 37;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i6 = RemoteActionCompatParcelizer + 59;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i8 = write + 115;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i2 |= !(getpostalcode.read(modifier) ^ true) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i10 = i2 | 3072;
        if (!getpostalcode.write(i10 & 1, (i10 & 1171) != 1170)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        } else {
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new b8$$ExternalSyntheticLambda4(1);
                getpostalcode.write(objComponentActivity);
                int i11 = write + 71;
                RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity;
            float f = Dimensions.onPictureInPictureUiStateChanged;
            Modifier modifierM83size3ABfNKs = SizeKt.m83size3ABfNKs(modifier, f);
            float f2 = Dimensions.setGroupDividerEnabled;
            float f3 = Dimensions._init_lambda3;
            Modifier modifierM317shadows4CzXII$default = ShadowKt.m317shadows4CzXII$default(modifierM83size3ABfNKs, f2, RoundedCornerShapeKt.IconCompatParcelizer(f3), false, 0L, 0L, 28, null);
            position positionVarSerializer = DefaultPagerNestedScrollConnection.serializer(Dimensions.MediaBrowserCompatMediaItem, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).removeOnContextAvailableListener());
            Modifier modifier2 = canReadPlayIds.read(BorderKt.write(modifierM317shadows4CzXII$default, positionVarSerializer.read, positionVarSerializer.IconCompatParcelizer, RoundedCornerShapeKt.IconCompatParcelizer(f3)), null, false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode, 63);
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(companion.getCenter(), false);
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
            if (!getpostalcode.ComponentActivity) {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            } else {
                getpostalcode.serializer(constructor);
            }
            af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            String str = getcharactersiunyp9kannotations.write;
            int i13 = getcharactersiunyp9kannotations.IconCompatParcelizer;
            String str2 = getcharactersiunyp9kannotations.read;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new b8$$ExternalSyntheticLambda4(1);
                getpostalcode.write(objComponentActivity2);
            }
            Modifier.Companion companion3 = Modifier.Companion;
            ImageFromUrlKt.serializer((i10 & 7168) | 384, getpostalcode, SizeKt.m83size3ABfNKs(companion3, f), str, str2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3);
            if (i13 > 1) {
                getpostalcode.serializer(1675509014);
                float f4 = Dimensions.getActionBarHideOffset;
                PicturesCounterKt.PicturesCounter(BoxScopeInstance.serializer.align(PaddingKt.m74paddingqDBjuR0$default(companion3, f4, 0.0f, f4, f4, 2), companion.getBottomStart()), getpostalcode, i13, 0);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(1675776172);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(true);
            r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k3;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getHasCamera(getcharactersiunyp9kannotations, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, i, 14);
        }
    }
}
