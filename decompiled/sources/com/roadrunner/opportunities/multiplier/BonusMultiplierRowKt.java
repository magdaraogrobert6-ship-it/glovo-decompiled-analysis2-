package com.roadrunner.opportunities.multiplier;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.opportunities.multiplier.BonusMultiplierRowKt;
import io.sentry.SentryUUID;
import java.util.Iterator;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.TextFieldDefaults;
import o.buildMapping;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.p2;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.supportingTextPaddinga9UjIt4material3default;
import o.t2ExternalSyntheticLambda5;
import o.t3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BonusMultiplierRowKt {
    private static int read = 1;
    private static int serializer;

    public static final void BonusMultiplierRow(t3 t3Var, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        long jM732unboximpl;
        long jM732unboximpl2;
        int i3 = 2 % 2;
        t3Var.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1838821970);
        if ((i & 6) == 0) {
            int i4 = serializer + 27;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i2 = ((i & 8) == 0 ? getpostalcode.read(t3Var) : getpostalcode.IconCompatParcelizer(t3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i6 = i2 | 48;
        if (getpostalcode.write(i6 & 1, (i6 & 19) != 18)) {
            int i7 = read + 87;
            serializer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            modifier = Modifier.Companion;
            Color color = t3Var.RemoteActionCompatParcelizer;
            if (color == null) {
                int i9 = read + 87;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                getpostalcode.serializer(1876360739);
                jM732unboximpl = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer();
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(1876359344);
                getpostalcode.IconCompatParcelizer(false);
                jM732unboximpl = color.m732unboximpl();
            }
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifier, jM732unboximpl, RectangleShapeKt.getRectangleShape());
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getCenterVertically(), getpostalcode, 48);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i11 = read + 9;
            serializer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z = getpostalcode.ComponentActivity;
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!getpostalcode.ComponentActivity) {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            } else {
                getpostalcode.serializer(constructor);
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            String str = t3Var.serializer;
            r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = t3Var.write;
            Color color2 = t3Var.IconCompatParcelizer;
            if (color2 == null) {
                int i12 = serializer + 63;
                read = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                getpostalcode.serializer(-1235507033);
                jM732unboximpl2 = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer();
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-1235508490);
                getpostalcode.IconCompatParcelizer(false);
                jM732unboximpl2 = color2.m732unboximpl();
            }
            int i14 = read + 113;
            serializer = i14 % Fields.SpotShadowColor;
            if (i14 % 2 != 0) {
                m4995MultiplierIndicatorT042LqI(str, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, jM732unboximpl2, null, t3Var.read, getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                m4995MultiplierIndicatorT042LqI(str, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, jM732unboximpl2, null, t3Var.read, getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(true);
            }
            int i15 = serializer + 29;
            read = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p2(i, 23, t3Var, modifier);
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0233  */
    /* JADX WARN: Code duplicated, block: B:69:0x0266 A[LOOP:1: B:67:0x0260->B:69:0x0266, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x0288  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX INFO: renamed from: MultiplierIndicator-T042LqI, reason: not valid java name */
    public static final void m4995MultiplierIndicatorT042LqI(final String str, final r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, final long j, Modifier modifier, final boolean z, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        Modifier modifier2;
        ?? r0;
        Iterator<E> it;
        int i3;
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        int i7 = read + 69;
        serializer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        str.getClass();
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-289914422);
        if ((i & 6) == 0) {
            if (getpostalcode.read(str)) {
                int i9 = serializer + 15;
                read = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (!((i & 64) == 0 ? getpostalcode.read(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) : getpostalcode.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk))) {
                int i11 = read + 73;
                serializer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i3 = 16;
            } else {
                int i13 = read + 93;
                serializer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i3 = 32;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= !getpostalcode.serializer(j) ? Fields.SpotShadowColor : Fields.RotationX;
        }
        int i15 = i2 | 3072;
        if ((i & 24576) == 0) {
            i15 |= getpostalcode.write(z) ? Fields.Clip : 8192;
        }
        int i16 = i15;
        if (getpostalcode.write(i16 & 1, (i16 & 9363) != 9362)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM75height3ABfNKs = SizeKt.m75height3ABfNKs(companion, Dimensions.setHasNonEmbeddedTabs);
            float f = Dimensions.setPadding;
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(BorderKt.write(BackgroundKt.m20backgroundbw27NRU(modifierM75height3ABfNKs, j, RoundedCornerShapeKt.IconCompatParcelizer(f)), Dimensions.write, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPopupTheme(), RoundedCornerShapeKt.IconCompatParcelizer(f)), 0.0f, Dimensions.setPrimaryBackground, 1);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getCenterVertically(), getpostalcode, 48);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM73paddingVpY3zN4$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i17 = read + 75;
                serializer = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m83size3ABfNKs(companion, Dimensions.setSplitBackground)});
            if (!z || r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.isEmpty()) {
                modifier2 = companion;
                r0 = 0;
                getpostalcode.serializer(192093908);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                int i19 = serializer + 9;
                read = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                getpostalcode.serializer(191745065);
                getpostalcode.serializer(421828190);
                Iterator<E> it2 = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
                while (it2.hasNext()) {
                    int i21 = read + 29;
                    serializer = i21 % Fields.SpotShadowColor;
                    int i22 = i21 % i5;
                    t2ExternalSyntheticLambda5 t2externalsyntheticlambda5 = (t2ExternalSyntheticLambda5) it2.next();
                    IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(t2externalsyntheticlambda5.RemoteActionCompatParcelizer, getpostalcode, 0), "", Modifier.Companion, t2externalsyntheticlambda5.write, getpostalcode, Painter.$stable | 432, 0);
                    companion = companion;
                    i5 = 2;
                }
                modifier2 = companion;
                r0 = 0;
                getpostalcode.IconCompatParcelizer(false);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m83size3ABfNKs(Modifier.Companion, Dimensions.setPrimaryBackground)});
                getpostalcode.IconCompatParcelizer(false);
            }
            TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(), getpostalcode, i16 & 14, 0, 131066);
            if (z) {
                getpostalcode.serializer(192651412);
                getpostalcode.IconCompatParcelizer((boolean) r0);
            } else {
                int i23 = serializer + 71;
                read = i23 % Fields.SpotShadowColor;
                if (i23 % 2 == 0) {
                    int i24 = 75 / r0;
                    if (r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.isEmpty()) {
                        getpostalcode.serializer(192651412);
                        getpostalcode.IconCompatParcelizer((boolean) r0);
                    } else {
                        getpostalcode.serializer(192302569);
                        ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m83size3ABfNKs(Modifier.Companion, Dimensions.setPrimaryBackground)});
                        it = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
                        while (it.hasNext()) {
                            t2ExternalSyntheticLambda5 t2externalsyntheticlambda6 = (t2ExternalSyntheticLambda5) it.next();
                            IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(t2externalsyntheticlambda6.RemoteActionCompatParcelizer, getpostalcode, r0), "", Modifier.Companion, t2externalsyntheticlambda6.write, getpostalcode, Painter.$stable | 432, 0);
                        }
                        getpostalcode.IconCompatParcelizer((boolean) r0);
                    }
                } else if (r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.isEmpty()) {
                    getpostalcode.serializer(192651412);
                    getpostalcode.IconCompatParcelizer((boolean) r0);
                } else {
                    getpostalcode.serializer(192302569);
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m83size3ABfNKs(Modifier.Companion, Dimensions.setPrimaryBackground)});
                    it = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
                    while (it.hasNext()) {
                        t2ExternalSyntheticLambda5 t2externalsyntheticlambda7 = (t2ExternalSyntheticLambda5) it.next();
                        IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(t2externalsyntheticlambda7.RemoteActionCompatParcelizer, getpostalcode, r0), "", Modifier.Companion, t2externalsyntheticlambda7.write, getpostalcode, Painter.$stable | 432, 0);
                    }
                    getpostalcode.IconCompatParcelizer((boolean) r0);
                }
            }
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m83size3ABfNKs(Modifier.Companion, Dimensions.setSplitBackground)});
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            final Modifier modifier3 = modifier2;
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.xg
                private static int MediaSessionCompatQueueItem = 1;
                private static int RatingCompat;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i25 = 2 % 2;
                    int i26 = MediaSessionCompatQueueItem + 101;
                    RatingCompat = i26 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i27 = i26 % 2;
                    ((Integer) obj2).getClass();
                    BonusMultiplierRowKt.m4995MultiplierIndicatorT042LqI(str, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, j, modifier3, z, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i28 = RatingCompat + 73;
                    MediaSessionCompatQueueItem = i28 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i28 % 2 != 0) {
                        return createfromparcel;
                    }
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
            };
        }
    }
}
