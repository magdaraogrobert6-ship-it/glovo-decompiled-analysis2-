package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ComposeViewAdapterExternalSyntheticLambda6 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    /* JADX WARN: Code duplicated, block: B:14:0x003f A[PHI: r1
  0x003f: PHI (r1v9 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v11 o.getPostalCode) binds: [B:8:0x0030, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00be  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00da  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:63:0x0105  */
    /* JADX WARN: Code duplicated, block: B:65:0x0119  */
    /* JADX WARN: Code duplicated, block: B:67:0x015d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0167  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0032 A[PHI: r1
  0x0032: PHI (r1v6 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v11 o.getPostalCode) binds: [B:8:0x0030, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void IconCompatParcelizer(final String str, boolean z, final String str2, androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i, int i2) {
        getPostalCode getpostalcode;
        int i3;
        int i4;
        androidx.compose.ui.Modifier modifier2;
        boolean z2;
        androidx.compose.ui.Modifier modifier3;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        int i5;
        androidx.compose.ui.Modifier modifier4;
        androidx.compose.ui.text.TextStyle textStyle;
        long popupTheme;
        int i6;
        int i7;
        int i8;
        int i9 = 2 % 2;
        int i10 = IconCompatParcelizer + 65;
        RemoteActionCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i10 % 2 == 0) {
            str.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1325785937);
            if ((i & 55) == 0) {
                if (getpostalcode.read(str)) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i;
            } else {
                i4 = i;
            }
        } else {
            str.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1325785937);
            if ((i & 6) == 0) {
                if (getpostalcode.read(str)) {
                    i3 = 4;
                } else {
                    i3 = 2;
                }
                i4 = i3 | i;
            } else {
                i4 = i;
            }
        }
        if ((i & 48) == 0) {
            if (getpostalcode.write(z)) {
                int i11 = RemoteActionCompatParcelizer + 29;
                IconCompatParcelizer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i8 = 32;
            } else {
                i8 = 16;
            }
            i4 |= i8;
        }
        if ((i & 384) == 0) {
            if (!getpostalcode.read(str2)) {
                i7 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
            } else {
                int i13 = RemoteActionCompatParcelizer + 83;
                IconCompatParcelizer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i7 = androidx.compose.ui.graphics.Fields.RotationX;
            }
            i4 |= i7;
            int i15 = IconCompatParcelizer + 47;
            RemoteActionCompatParcelizer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i16 = i15 % 2;
        }
        int i17 = i2 & 8;
        if (i17 == 0) {
            if ((i & 3072) == 0) {
                int i18 = RemoteActionCompatParcelizer + 1;
                IconCompatParcelizer = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i19 = i18 % 2;
                modifier2 = modifier;
                i4 |= getpostalcode.read(modifier2) ? androidx.compose.ui.graphics.Fields.CameraDistance : androidx.compose.ui.graphics.Fields.RotationZ;
            }
            if ((i4 & 1171) != 1170) {
                int i20 = IconCompatParcelizer + 37;
                RemoteActionCompatParcelizer = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                z2 = i20 % 2 != 0;
            }
            if (getpostalcode.write(i4 & 1, z2)) {
                i5 = IconCompatParcelizer + 59;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i21 = 68 / 0;
                    if (i17 != 0) {
                        modifier4 = androidx.compose.ui.Modifier.Companion;
                    } else {
                        modifier4 = modifier2;
                    }
                } else if (i17 != 0) {
                    modifier4 = androidx.compose.ui.Modifier.Companion;
                } else {
                    modifier4 = modifier2;
                }
                if (z) {
                    i6 = IconCompatParcelizer + 81;
                    RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i6 % 2 == 0) {
                        textStyle = (androidx.compose.ui.text.TextStyle) performLayout.getLifecycle.MediaSessionCompatResultReceiverWrapper();
                        int i22 = 51 / 0;
                    } else {
                        textStyle = (androidx.compose.ui.text.TextStyle) performLayout.getLifecycle.MediaSessionCompatResultReceiverWrapper();
                    }
                } else {
                    textStyle = (androidx.compose.ui.text.TextStyle) performLayout.addOnContextAvailableListener.MediaSessionCompatResultReceiverWrapper();
                }
                final androidx.compose.ui.text.TextStyle textStyle2 = textStyle;
                if (z) {
                    getpostalcode.serializer(1525010939);
                    popupTheme = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setDropDownBackgroundResource();
                } else {
                    getpostalcode.serializer(1525011736);
                    popupTheme = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme();
                }
                final long j = popupTheme;
                getpostalcode.IconCompatParcelizer(false);
                getCurrentSessionimpl.read(modifier4, androidx.compose.foundation.shape.RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.setPadding), null, null, null, coil3.ExtrasKt.write(-1831407619, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: o.ComposeViewAdapterFakeOnBackPressedDispatcherOwner1
                    private static int MediaBrowserCompatMediaItem = 1;
                    private static int serializer;

                    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        boolean z3;
                        int i23 = 2 % 2;
                        int i24 = serializer + 19;
                        MediaBrowserCompatMediaItem = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i25 = i24 % 2;
                        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((ModalBottomSheetDialogWrapper) obj).getClass();
                        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                        boolean zWrite = getpostalcode2.write(iIntValue & 1, (iIntValue & 17) != 16);
                        getAddressCountry getaddresscountry = getpostalcode2.read;
                        if (!zWrite) {
                            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        } else {
                            int i26 = MediaBrowserCompatMediaItem + 47;
                            serializer = i26 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i27 = i26 % 2;
                            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
                            androidx.compose.ui.Modifier modifierRemoteActionCompatParcelizer = androidx.compose.foundation.layout.PaddingKt.RemoteActionCompatParcelizer(androidx.compose.foundation.BackgroundKt.m20backgroundbw27NRU(companion, j, androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape()), Dimensions.setActionBarVisibilityCallback, Dimensions.getNestedScrollAxes);
                            androidx.compose.ui.Alignment.Companion companion2 = androidx.compose.ui.Alignment.Companion;
                            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(androidx.compose.foundation.layout.Arrangement.MediaDescriptionCompat, companion2.getCenterHorizontally(), getpostalcode2, 48);
                            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
                            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
                            androidx.compose.ui.Modifier modifierMaterializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode2, modifierRemoteActionCompatParcelizer);
                            androidx.compose.ui.node.ComposeUiNode.Companion companion3 = androidx.compose.ui.node.ComposeUiNode.Companion;
                            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
                            Object obj4 = null;
                            if (getaddresscountry == null) {
                                SentryUUID.write();
                                throw null;
                            }
                            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                            if (getpostalcode2.ComponentActivity) {
                                getpostalcode2.serializer(constructor);
                            } else {
                                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                                int i28 = serializer + 93;
                                MediaBrowserCompatMediaItem = i28 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i29 = i28 % 2;
                            }
                            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                            androidx.compose.material3.TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, androidx.compose.ui.text.style.TextAlign.m3504boximpl(androidx.compose.ui.text.style.TextAlign.Companion.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, textStyle2, getpostalcode2, 0, 0, 130042);
                            String str3 = str2;
                            if (str3 == null) {
                                int i30 = MediaBrowserCompatMediaItem + 45;
                                serializer = i30 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i31 = i30 % 2;
                                getpostalcode2.serializer(1865929745);
                                getpostalcode2.IconCompatParcelizer(false);
                                z3 = true;
                            } else {
                                getpostalcode2.serializer(1865929746);
                                supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(androidx.compose.foundation.layout.Arrangement.MediaBrowserCompatMediaItem, companion2.getCenterVertically(), getpostalcode2, 48);
                                int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
                                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
                                androidx.compose.ui.Modifier modifierMaterializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode2, companion);
                                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
                                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                                if (!getpostalcode2.ComponentActivity) {
                                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                                } else {
                                    int i32 = MediaBrowserCompatMediaItem + 51;
                                    serializer = i32 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i32 % 2 != 0) {
                                        getpostalcode2.serializer(constructor2);
                                        obj4.hashCode();
                                        throw null;
                                    }
                                    getpostalcode2.serializer(constructor2);
                                }
                                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
                                androidx.compose.material3.IconKt.m116Iconww6aTOc(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.logistics.rider.glovo.R.drawable.ic_bold_large_tick_circle_complete, getpostalcode2, 0), (String) null, (androidx.compose.ui.Modifier) null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setSupportBackgroundTintList(), getpostalcode2, androidx.compose.ui.graphics.painter.Painter.$stable | 48, 4);
                                Object[] objArr = {getpostalcode2, androidx.compose.foundation.layout.SizeKt.m86width3ABfNKs(companion, Dimensions.setPrimaryBackground)};
                                coil3.ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr);
                                androidx.compose.material3.TextKt.m131TextNvy7gAk(str3, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setSupportBackgroundTintList(), 0L, androidx.compose.ui.text.font.FontWeight.Companion.getW700(), null, 0L, null, 0L, 0, false, 0, 0, null, (androidx.compose.ui.text.TextStyle) performLayout.onBackPressedInput_delegatelambda0.MediaSessionCompatResultReceiverWrapper(), getpostalcode2, 1572864, 0, 131002);
                                z3 = true;
                                getpostalcode2.IconCompatParcelizer(true);
                                getpostalcode2.IconCompatParcelizer(false);
                            }
                            getpostalcode2.IconCompatParcelizer(z3);
                        }
                        return createFromParcel.INSTANCE;
                    }
                }, getpostalcode), getpostalcode, ((i4 >> 9) & 14) | 196608, 28);
                modifier3 = modifier4;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier3 = modifier2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new fieldToString(str, z, str2, modifier3, i, i2);
            }
        }
        i4 |= 3072;
        modifier2 = modifier;
        if ((i4 & 1171) != 1170) {
            int i23 = IconCompatParcelizer + 37;
            RemoteActionCompatParcelizer = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i23 % 2 != 0) {
            }
        }
        if (getpostalcode.write(i4 & 1, z2)) {
            i5 = IconCompatParcelizer + 59;
            RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                int i24 = 68 / 0;
                if (i17 != 0) {
                    modifier4 = androidx.compose.ui.Modifier.Companion;
                } else {
                    modifier4 = modifier2;
                }
            } else if (i17 != 0) {
                modifier4 = androidx.compose.ui.Modifier.Companion;
            } else {
                modifier4 = modifier2;
            }
            if (z) {
                i6 = IconCompatParcelizer + 81;
                RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    textStyle = (androidx.compose.ui.text.TextStyle) performLayout.getLifecycle.MediaSessionCompatResultReceiverWrapper();
                    int i25 = 51 / 0;
                } else {
                    textStyle = (androidx.compose.ui.text.TextStyle) performLayout.getLifecycle.MediaSessionCompatResultReceiverWrapper();
                }
            } else {
                textStyle = (androidx.compose.ui.text.TextStyle) performLayout.addOnContextAvailableListener.MediaSessionCompatResultReceiverWrapper();
            }
            final androidx.compose.ui.text.TextStyle textStyle3 = textStyle;
            if (z) {
                getpostalcode.serializer(1525010939);
                popupTheme = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setDropDownBackgroundResource();
            } else {
                getpostalcode.serializer(1525011736);
                popupTheme = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme();
            }
            final long j2 = popupTheme;
            getpostalcode.IconCompatParcelizer(false);
            getCurrentSessionimpl.read(modifier4, androidx.compose.foundation.shape.RoundedCornerShapeKt.IconCompatParcelizer(Dimensions.setPadding), null, null, null, coil3.ExtrasKt.write(-1831407619, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: o.ComposeViewAdapterFakeOnBackPressedDispatcherOwner1
                private static int MediaBrowserCompatMediaItem = 1;
                private static int serializer;

                @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z3;
                    int i26 = 2 % 2;
                    int i27 = serializer + 19;
                    MediaBrowserCompatMediaItem = i27 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i28 = i27 % 2;
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((ModalBottomSheetDialogWrapper) obj).getClass();
                    getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                    boolean zWrite = getpostalcode2.write(iIntValue & 1, (iIntValue & 17) != 16);
                    getAddressCountry getaddresscountry = getpostalcode2.read;
                    if (!zWrite) {
                        getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    } else {
                        int i29 = MediaBrowserCompatMediaItem + 47;
                        serializer = i29 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i210 = i29 % 2;
                        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
                        androidx.compose.ui.Modifier modifierRemoteActionCompatParcelizer = androidx.compose.foundation.layout.PaddingKt.RemoteActionCompatParcelizer(androidx.compose.foundation.BackgroundKt.m20backgroundbw27NRU(companion, j2, androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape()), Dimensions.setActionBarVisibilityCallback, Dimensions.getNestedScrollAxes);
                        androidx.compose.ui.Alignment.Companion companion2 = androidx.compose.ui.Alignment.Companion;
                        ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(androidx.compose.foundation.layout.Arrangement.MediaDescriptionCompat, companion2.getCenterHorizontally(), getpostalcode2, 48);
                        int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
                        androidx.compose.ui.Modifier modifierMaterializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode2, modifierRemoteActionCompatParcelizer);
                        androidx.compose.ui.node.ComposeUiNode.Companion companion3 = androidx.compose.ui.node.ComposeUiNode.Companion;
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
                        Object obj4 = null;
                        if (getaddresscountry == null) {
                            SentryUUID.write();
                            throw null;
                        }
                        getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode2.ComponentActivity) {
                            getpostalcode2.serializer(constructor);
                        } else {
                            getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                            int i211 = serializer + 93;
                            MediaBrowserCompatMediaItem = i211 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i212 = i211 % 2;
                        }
                        c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                        AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                        setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                        androidx.compose.material3.TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, androidx.compose.ui.text.style.TextAlign.m3504boximpl(androidx.compose.ui.text.style.TextAlign.Companion.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, textStyle3, getpostalcode2, 0, 0, 130042);
                        String str3 = str2;
                        if (str3 == null) {
                            int i30 = MediaBrowserCompatMediaItem + 45;
                            serializer = i30 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i31 = i30 % 2;
                            getpostalcode2.serializer(1865929745);
                            getpostalcode2.IconCompatParcelizer(false);
                            z3 = true;
                        } else {
                            getpostalcode2.serializer(1865929746);
                            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(androidx.compose.foundation.layout.Arrangement.MediaBrowserCompatMediaItem, companion2.getCenterVertically(), getpostalcode2, 48);
                            int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
                            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
                            androidx.compose.ui.Modifier modifierMaterializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode2, companion);
                            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
                            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                            if (!getpostalcode2.ComponentActivity) {
                                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                            } else {
                                int i32 = MediaBrowserCompatMediaItem + 51;
                                serializer = i32 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i32 % 2 != 0) {
                                    getpostalcode2.serializer(constructor2);
                                    obj4.hashCode();
                                    throw null;
                                }
                                getpostalcode2.serializer(constructor2);
                            }
                            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
                            androidx.compose.material3.IconKt.m116Iconww6aTOc(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.logistics.rider.glovo.R.drawable.ic_bold_large_tick_circle_complete, getpostalcode2, 0), (String) null, (androidx.compose.ui.Modifier) null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setSupportBackgroundTintList(), getpostalcode2, androidx.compose.ui.graphics.painter.Painter.$stable | 48, 4);
                            Object[] objArr = {getpostalcode2, androidx.compose.foundation.layout.SizeKt.m86width3ABfNKs(companion, Dimensions.setPrimaryBackground)};
                            coil3.ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr);
                            androidx.compose.material3.TextKt.m131TextNvy7gAk(str3, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setSupportBackgroundTintList(), 0L, androidx.compose.ui.text.font.FontWeight.Companion.getW700(), null, 0L, null, 0L, 0, false, 0, 0, null, (androidx.compose.ui.text.TextStyle) performLayout.onBackPressedInput_delegatelambda0.MediaSessionCompatResultReceiverWrapper(), getpostalcode2, 1572864, 0, 131002);
                            z3 = true;
                            getpostalcode2.IconCompatParcelizer(true);
                            getpostalcode2.IconCompatParcelizer(false);
                        }
                        getpostalcode2.IconCompatParcelizer(z3);
                    }
                    return createFromParcel.INSTANCE;
                }
            }, getpostalcode), getpostalcode, ((i4 >> 9) & 14) | 196608, 28);
            modifier3 = modifier4;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier3 = modifier2;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new fieldToString(str, z, str2, modifier3, i, i2);
        }
    }
}
