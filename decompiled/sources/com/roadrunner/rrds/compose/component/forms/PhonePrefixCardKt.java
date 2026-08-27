package com.roadrunner.rrds.compose.component.forms;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.unit.Dp;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.DefaultPagerNestedScrollConnection;
import o.baseUrlChoices;
import o.buildMapping;
import o.getBirthDateFull;
import o.getCurrentSessionimpl;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.getTopLeftannotations;
import o.performMeasureDjhGOtQ;
import o.position;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PhonePrefixCardKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    public static final getTopLeftannotations read;
    private static int serializer;
    private static int write;

    static {
        float f = Dimensions.read;
        read = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
        int i = serializer + 3;
        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 74 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0098  */
    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:53:0x0106  */
    /* JADX WARN: Code duplicated, block: B:55:0x0139  */
    /* JADX WARN: Code duplicated, block: B:58:0x0143  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    public static final void PhonePrefixCard(final String str, Modifier modifier, boolean z, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        final boolean z4;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        final long popupTheme;
        position positionVar;
        int i5;
        int i6 = 2 % 2;
        str.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(833561170);
        Object obj = null;
        if ((i & 6) == 0) {
            int i7 = IconCompatParcelizer + 81;
            write = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                getpostalcode.read(str);
                obj.hashCode();
                throw null;
            }
            i3 = (getpostalcode.read(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i8 = IconCompatParcelizer + 17;
            write = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i3 |= getpostalcode.read(modifier) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                if (getpostalcode.write(z2)) {
                    int i11 = write + 37;
                    IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    i4 = Fields.RotationX;
                } else {
                    i4 = Fields.SpotShadowColor;
                }
                i3 |= i4;
            }
            if ((i3 & 147) != 146) {
                i5 = write + 13;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else {
                z3 = false;
            }
            if (getpostalcode.write(i3 & 1, z3)) {
                if (i10 != 0) {
                    int i13 = IconCompatParcelizer + 91;
                    write = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    z4 = false;
                } else {
                    z4 = z2;
                }
                if (z4) {
                    getpostalcode.serializer(-2106594365);
                    popupTheme = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer();
                } else {
                    getpostalcode.serializer(-2106593413);
                    popupTheme = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPopupTheme();
                }
                getpostalcode.IconCompatParcelizer(false);
                int i15 = IconCompatParcelizer + 123;
                write = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                if (z4) {
                    getpostalcode.serializer(-2106591763);
                    position positionVarSerializer = DefaultPagerNestedScrollConnection.serializer(Dp.m3673constructorimpl(2.0f), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportCompoundDrawablesTintList());
                    getpostalcode.IconCompatParcelizer(false);
                    positionVar = positionVarSerializer;
                } else {
                    getpostalcode.serializer(-879772437);
                    getpostalcode.IconCompatParcelizer(false);
                    positionVar = null;
                }
                getCurrentSessionimpl.read(BackgroundKt.m20backgroundbw27NRU(SizeKt.IconCompatParcelizer(modifier, null, 3), Color.Companion.m757getTransparent0d7_KjU(), RectangleShapeKt.getRectangleShape()), read, null, null, positionVar, ExtrasKt.write(1886183584, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: o.subscriptionUrlChoices
                    private static int IconCompatParcelizer = 0;
                    private static int serializer = 1;

                    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i17 = 2 % 2;
                        int i18 = IconCompatParcelizer + 51;
                        serializer = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i19 = i18 % 2;
                        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        ((ModalBottomSheetDialogWrapper) obj2).getClass();
                        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                        if (!getpostalcode2.write(iIntValue & 1, (iIntValue & 17) != 16)) {
                            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        } else {
                            int i20 = IconCompatParcelizer + 93;
                            serializer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i21 = i20 % 2;
                            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
                            androidx.compose.ui.Modifier modifierWrite = androidx.compose.foundation.layout.PaddingKt.write(androidx.compose.foundation.BackgroundKt.m20backgroundbw27NRU(androidx.compose.foundation.layout.SizeKt.serializer(androidx.compose.foundation.layout.SizeKt.read(companion), 1.0f), popupTheme, androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape()), Dimensions.setTabContainer);
                            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(androidx.compose.foundation.layout.Arrangement.IconCompatParcelizer, androidx.compose.ui.Alignment.Companion.getCenterVertically(), getpostalcode2, 54);
                            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
                            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
                            androidx.compose.ui.Modifier modifierMaterializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
                            androidx.compose.ui.node.ComposeUiNode.Companion companion2 = androidx.compose.ui.node.ComposeUiNode.Companion;
                            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
                            if (getpostalcode2.read != null) {
                                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                                if (getpostalcode2.ComponentActivity) {
                                    getpostalcode2.serializer(constructor);
                                } else {
                                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                                }
                                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                                androidx.compose.ui.text.TextStyle textStyleMediaBrowserCompatMediaItem = performLayout.MediaBrowserCompatMediaItem();
                                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                                androidx.compose.material3.TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleMediaBrowserCompatMediaItem, getpostalcode2, 0, 0, 131066);
                                if (z4) {
                                    getpostalcode2.serializer(-934006897);
                                    androidx.compose.material3.IconKt.m116Iconww6aTOc(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.logistics.rider.glovo.R.drawable.ic_chevron_down, getpostalcode2, 0), (String) null, androidx.compose.foundation.layout.SizeKt.read(androidx.compose.foundation.layout.PaddingKt.m74paddingqDBjuR0$default(companion, Dimensions.setSplitBackground, 0.0f, 0.0f, 0.0f, 14)), ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), getpostalcode2, androidx.compose.ui.graphics.painter.Painter.$stable | 48, 0);
                                    getpostalcode2.IconCompatParcelizer(false);
                                } else {
                                    getpostalcode2.serializer(-933601882);
                                    getpostalcode2.IconCompatParcelizer(false);
                                }
                                getpostalcode2.IconCompatParcelizer(true);
                            } else {
                                SentryUUID.write();
                                throw null;
                            }
                        }
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        int i22 = IconCompatParcelizer + 93;
                        serializer = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i23 = i22 % 2;
                        return createfromparcel;
                    }
                }, getpostalcode), getpostalcode, 196656, 12);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                z4 = z2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new baseUrlChoices(str, modifier, z4, i, i2, 0);
            }
        }
        int i17 = IconCompatParcelizer + 81;
        write = i17 % Fields.SpotShadowColor;
        i3 = i17 % 2 != 0 ? i3 | 1948 : i3 | 384;
        z2 = z;
        if ((i3 & 147) != 146) {
            i5 = write + 13;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                z3 = false;
            } else {
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (getpostalcode.write(i3 & 1, z3)) {
            if (i10 != 0) {
                int i18 = IconCompatParcelizer + 91;
                write = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                z4 = false;
            } else {
                z4 = z2;
            }
            if (z4) {
                getpostalcode.serializer(-2106594365);
                popupTheme = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer();
            } else {
                getpostalcode.serializer(-2106593413);
                popupTheme = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPopupTheme();
            }
            getpostalcode.IconCompatParcelizer(false);
            int i110 = IconCompatParcelizer + 123;
            write = i110 % Fields.SpotShadowColor;
            int i111 = i110 % 2;
            if (z4) {
                getpostalcode.serializer(-2106591763);
                position positionVarSerializer2 = DefaultPagerNestedScrollConnection.serializer(Dp.m3673constructorimpl(2.0f), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportCompoundDrawablesTintList());
                getpostalcode.IconCompatParcelizer(false);
                positionVar = positionVarSerializer2;
            } else {
                getpostalcode.serializer(-879772437);
                getpostalcode.IconCompatParcelizer(false);
                positionVar = null;
            }
            getCurrentSessionimpl.read(BackgroundKt.m20backgroundbw27NRU(SizeKt.IconCompatParcelizer(modifier, null, 3), Color.Companion.m757getTransparent0d7_KjU(), RectangleShapeKt.getRectangleShape()), read, null, null, positionVar, ExtrasKt.write(1886183584, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: o.subscriptionUrlChoices
                private static int IconCompatParcelizer = 0;
                private static int serializer = 1;

                @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    int i112 = 2 % 2;
                    int i113 = IconCompatParcelizer + 51;
                    serializer = i113 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i114 = i113 % 2;
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ((ModalBottomSheetDialogWrapper) obj2).getClass();
                    getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                    if (!getpostalcode2.write(iIntValue & 1, (iIntValue & 17) != 16)) {
                        getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    } else {
                        int i20 = IconCompatParcelizer + 93;
                        serializer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i21 = i20 % 2;
                        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
                        androidx.compose.ui.Modifier modifierWrite = androidx.compose.foundation.layout.PaddingKt.write(androidx.compose.foundation.BackgroundKt.m20backgroundbw27NRU(androidx.compose.foundation.layout.SizeKt.serializer(androidx.compose.foundation.layout.SizeKt.read(companion), 1.0f), popupTheme, androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape()), Dimensions.setTabContainer);
                        supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(androidx.compose.foundation.layout.Arrangement.IconCompatParcelizer, androidx.compose.ui.Alignment.Companion.getCenterVertically(), getpostalcode2, 54);
                        int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
                        androidx.compose.ui.Modifier modifierMaterializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
                        androidx.compose.ui.node.ComposeUiNode.Companion companion2 = androidx.compose.ui.node.ComposeUiNode.Companion;
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
                        if (getpostalcode2.read != null) {
                            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                            if (getpostalcode2.ComponentActivity) {
                                getpostalcode2.serializer(constructor);
                            } else {
                                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                            }
                            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                            androidx.compose.ui.text.TextStyle textStyleMediaBrowserCompatMediaItem = performLayout.MediaBrowserCompatMediaItem();
                            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                            androidx.compose.material3.TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleMediaBrowserCompatMediaItem, getpostalcode2, 0, 0, 131066);
                            if (z4) {
                                getpostalcode2.serializer(-934006897);
                                androidx.compose.material3.IconKt.m116Iconww6aTOc(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.logistics.rider.glovo.R.drawable.ic_chevron_down, getpostalcode2, 0), (String) null, androidx.compose.foundation.layout.SizeKt.read(androidx.compose.foundation.layout.PaddingKt.m74paddingqDBjuR0$default(companion, Dimensions.setSplitBackground, 0.0f, 0.0f, 0.0f, 14)), ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), getpostalcode2, androidx.compose.ui.graphics.painter.Painter.$stable | 48, 0);
                                getpostalcode2.IconCompatParcelizer(false);
                            } else {
                                getpostalcode2.serializer(-933601882);
                                getpostalcode2.IconCompatParcelizer(false);
                            }
                            getpostalcode2.IconCompatParcelizer(true);
                        } else {
                            SentryUUID.write();
                            throw null;
                        }
                    }
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i22 = IconCompatParcelizer + 93;
                    serializer = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i23 = i22 % 2;
                    return createfromparcel;
                }
            }, getpostalcode), getpostalcode, 196656, 12);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            z4 = z2;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new baseUrlChoices(str, modifier, z4, i, i2, 0);
        }
    }
}
