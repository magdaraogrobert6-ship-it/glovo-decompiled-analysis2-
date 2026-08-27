package com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.zoom;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.braze.ui.support.ViewUtils$$ExternalSyntheticLambda6;
import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.zoom.ZoomControlKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import java.util.Iterator;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.TextFieldDefaults;
import o.buildMapping;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.p6;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.supportingTextPaddinga9UjIt4material3default;
import o.updateTextLayoutResult;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ZoomControlKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    public static final float serializer;
    private static int write = 1;

    static {
        float f = Dimensions.read;
        serializer = Dimensions.invokeSuspend;
        int i = RemoteActionCompatParcelizer + 109;
        IconCompatParcelizer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static final void ZoomChip(String str, String str2, boolean z, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        long jM757getTransparent0d7_KjU;
        Modifier modifierM83size3ABfNKs;
        int i3;
        int i4 = 2 % 2;
        int i5 = write + 67;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-2065476980);
        Object obj = null;
        if ((i & 6) == 0) {
            int i7 = write + 99;
            read = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                i2 = (getpostalcode2.read(str) ? 4 : 2) | i;
            } else {
                getpostalcode2.read(str);
                obj.hashCode();
                throw null;
            }
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i8 = read + 85;
            write = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i2 |= getpostalcode2.read(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode2.write(z)) {
                int i10 = read + 19;
                int i11 = i10 % Fields.SpotShadowColor;
                write = i11;
                int i12 = i10 % 2;
                int i13 = i11 + 65;
                read = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i3 = Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        if ((i & 3072) == 0) {
            int i15 = write + 51;
            read = i15 % Fields.SpotShadowColor;
            if (i15 % 2 == 0) {
                i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.CameraDistance : Fields.RotationZ;
            } else {
                getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                obj.hashCode();
                throw null;
            }
        }
        int i16 = i2;
        if (!getpostalcode2.write(i16 & 1, (i16 & 1171) != 1170)) {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            int i17 = write + 59;
            read = i17 % Fields.SpotShadowColor;
            if (i17 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (z) {
                getpostalcode2.serializer(1371881865);
                jM757getTransparent0d7_KjU = Color.m721copywmQWz5c$default(((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null);
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                getpostalcode2.serializer(1371962837);
                getpostalcode2.IconCompatParcelizer(false);
                jM757getTransparent0d7_KjU = Color.Companion.m757getTransparent0d7_KjU();
            }
            float f = serializer;
            if (z) {
                modifierM83size3ABfNKs = PaddingKt.m73paddingVpY3zN4$default(SizeKt.write(Modifier.Companion, f, f), Dimensions.setTabContainer, 0.0f, 2);
            } else {
                modifierM83size3ABfNKs = SizeKt.m83size3ABfNKs(Modifier.Companion, f);
            }
            Alignment center = Alignment.Companion.getCenter();
            Modifier modifierThen = ClickableKt.RemoteActionCompatParcelizer(BackgroundKt.m20backgroundbw27NRU(ClipKt.clip(Modifier.Companion, RoundedCornerShapeKt.IconCompatParcelizer), jM757getTransparent0d7_KjU, RectangleShapeKt.getRectangleShape()), false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 15).then(modifierM83size3ABfNKs);
            "zoomChip_".concat(str2);
            modifierThen.getClass();
            MeasurePolicy measurePolicy = BoxKt.read(center, false);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierThen);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode2.read != null) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!(!getpostalcode2.ComponentActivity)) {
                    int i18 = write + 27;
                    read = i18 % Fields.SpotShadowColor;
                    if (i18 % 2 != 0) {
                        getpostalcode2.serializer(constructor);
                        int i19 = 80 / 0;
                    } else {
                        getpostalcode2.serializer(constructor);
                    }
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.write.MediaSessionCompatResultReceiverWrapper(), getpostalcode2, i16 & 14, 0, 131066);
                getpostalcode = getpostalcode2;
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p6(str, str2, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b0  */
    public static final void ZoomControl(final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, final String str, final String str2, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        boolean z;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        String str3;
        boolean z2;
        int i3;
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        str.getClass();
        str2.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1907481493);
        if ((i & 6) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk)) {
                int i7 = write + 95;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i9 = read + 91;
            write = i9 % Fields.SpotShadowColor;
            if (i9 % 2 == 0) {
                getpostalcode.read(str2);
                throw null;
            }
            i2 |= getpostalcode.read(str2) ? Fields.RotationX : Fields.SpotShadowColor;
            int i10 = read + 111;
            write = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                int i11 = 3 / 4;
            }
        }
        if ((i & 3072) == 0) {
            int i12 = read + 75;
            write = i12 % Fields.SpotShadowColor;
            if (i12 % 2 == 0) {
                int i13 = 75 / 0;
                if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                    i3 = Fields.CameraDistance;
                } else {
                    i3 = Fields.RotationZ;
                }
            } else if (!(!getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm))) {
                i3 = Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        if ((i & 24576) == 0) {
            int i14 = write + 101;
            read = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            i2 |= getpostalcode.read(modifier) ? Fields.Clip : 8192;
        }
        int i16 = i2;
        if ((i16 & 9363) != 9362) {
            int i17 = write + 41;
            read = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i16 & 1, z)) {
            if (r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.size() <= 1) {
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat == null) {
                    return;
                }
                final int i19 = 0;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.requestUpdate
                    private static int MediaMetadataCompat = 0;
                    private static int RatingCompat = 1;

                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        int i20 = 2 % 2;
                        int i21 = MediaMetadataCompat + 95;
                        RatingCompat = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i21 % 2 == 0) {
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            throw null;
                        }
                        int i22 = i19;
                        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                        int i23 = i;
                        if (i22 == 0) {
                            ((Integer) obj2).getClass();
                            ZoomControlKt.ZoomControl(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, str, str2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i23 | 1));
                            return createfromparcel2;
                        }
                        ((Integer) obj2).getClass();
                        ZoomControlKt.ZoomControl(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, str, str2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i23 | 1));
                        int i24 = RatingCompat + 23;
                        MediaMetadataCompat = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i24 % 2 != 0) {
                            int i25 = 39 / 0;
                        }
                        return createfromparcel2;
                    }
                };
            } else {
                Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(ClipKt.clip(modifier, RoundedCornerShapeKt.IconCompatParcelizer), Color.m721copywmQWz5c$default(((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), RectangleShapeKt.getRectangleShape());
                float f = Dimensions.setPrimaryBackground;
                Modifier modifierWrite = PaddingKt.write(modifierM20backgroundbw27NRU, f);
                modifierWrite.getClass();
                supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer(f), Alignment.Companion.getCenterVertically(), getpostalcode, 48);
                int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
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
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                getpostalcode.serializer(1804074750);
                Iterator<E> it = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
                while (it.hasNext()) {
                    updateTextLayoutResult updatetextlayoutresult = (updateTextLayoutResult) it.next();
                    String str4 = updatetextlayoutresult.read;
                    String str5 = updatetextlayoutresult.read;
                    boolean zEquals = str4.equals(str);
                    if (zEquals) {
                        int i20 = write + 51;
                        read = i20 % Fields.SpotShadowColor;
                        int i21 = i20 % i5;
                        str3 = str2;
                    } else {
                        str3 = str5;
                    }
                    if ((i16 & 7168) == 2048) {
                        int i22 = read + 27;
                        write = i22 % Fields.SpotShadowColor;
                        if (i22 % i5 == 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                    } else {
                        z2 = false;
                    }
                    boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(updatetextlayoutresult);
                    Object objComponentActivity = getpostalcode.ComponentActivity();
                    if ((z2 | zIconCompatParcelizer) || objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = new ViewUtils$$ExternalSyntheticLambda6(r8lambdaunavo3sxub_pc9xroryotnrlvsm, 15, updatetextlayoutresult);
                        getpostalcode.write(objComponentActivity);
                    }
                    ZoomChip(str3, str5, zEquals, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 0);
                    i16 = i16;
                    i5 = 2;
                }
                getpostalcode.IconCompatParcelizer(false);
                getpostalcode.IconCompatParcelizer(true);
            }
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }
        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            final int i23 = 1;
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.requestUpdate
                private static int MediaMetadataCompat = 0;
                private static int RatingCompat = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i24 = 2 % 2;
                    int i25 = MediaMetadataCompat + 95;
                    RatingCompat = i25 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i25 % 2 == 0) {
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        throw null;
                    }
                    int i26 = i23;
                    createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                    int i27 = i;
                    if (i26 == 0) {
                        ((Integer) obj2).getClass();
                        ZoomControlKt.ZoomControl(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, str, str2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i27 | 1));
                        return createfromparcel2;
                    }
                    ((Integer) obj2).getClass();
                    ZoomControlKt.ZoomControl(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, str, str2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i27 | 1));
                    int i28 = RatingCompat + 23;
                    MediaMetadataCompat = i28 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i28 % 2 != 0) {
                        int i29 = 39 / 0;
                    }
                    return createfromparcel2;
                }
            };
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        }
    }
}
