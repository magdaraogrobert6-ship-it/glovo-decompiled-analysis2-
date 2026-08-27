package o;

import androidx.compose.foundation.layout.Arrangement$Center$1;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda2;
import com.deliveryhero.perseus.RemoteFunctionKt$onRemoteFunction$1;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.forms.PasswordFieldKt$PasswordField$5$1;
import io.sentry.SentryUUID;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mergeZ1GrekI {
    private static int serializer = 0;
    private static int write = 1;

    public static final void IconCompatParcelizer(final String str, final float f, final androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        str.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1047146999);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.serializer(f)) {
                int i6 = serializer + 27;
                write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                i4 = i6 % 2 == 0 ? 90 : 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (!(!getpostalcode.read(modifier))) {
                int i7 = write + 85;
                serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = androidx.compose.ui.graphics.Fields.RotationX;
            } else {
                i3 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        if (getpostalcode.write(i2 & 1, !((i2 & 147) == 146))) {
            AndroidContentCaptureManagerCompanion.read(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection().write(androidx.compose.ui.unit.LayoutDirection.Ltr), coil3.ExtrasKt.write(527843657, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.TextStyleCompanion
                private static int read = 0;
                private static int write = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i9 = 2 % 2;
                    int i10 = write + 93;
                    read = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                    boolean zWrite = getpostalcode2.write(iIntValue & 1, (iIntValue & 3) != 2);
                    getAddressCountry getaddresscountry = getpostalcode2.read;
                    if (zWrite) {
                        int i12 = write + 5;
                        read = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i13 = i12 % 2;
                        androidx.compose.ui.Alignment.Companion companion = androidx.compose.ui.Alignment.Companion;
                        androidx.compose.ui.layout.MeasurePolicy measurePolicy = androidx.compose.foundation.layout.BoxKt.read(companion.getCenter(), false);
                        int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
                        androidx.compose.ui.Modifier modifierMaterializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode2, modifier);
                        androidx.compose.ui.node.ComposeUiNode.Companion companion2 = androidx.compose.ui.node.ComposeUiNode.Companion;
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
                        if (getaddresscountry != null) {
                            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                            if (getpostalcode2.ComponentActivity) {
                                getpostalcode2.serializer(constructor);
                            } else {
                                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                            }
                            af$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                            mergeZ1GrekI.RemoteActionCompatParcelizer(f, getpostalcode2, 0);
                            androidx.compose.ui.Alignment.Vertical centerVertically = companion.getCenterVertically();
                            Arrangement$Center$1 arrangement$Center$1 = androidx.compose.foundation.layout.Arrangement.IconCompatParcelizer;
                            androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.Companion;
                            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(arrangement$Center$1, centerVertically, getpostalcode2, 54);
                            int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
                            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
                            androidx.compose.ui.Modifier modifierMaterializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode2, companion3);
                            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
                            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                            if (!getpostalcode2.ComponentActivity) {
                                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                            } else {
                                int i14 = read + 3;
                                write = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                if (i14 % 2 != 0) {
                                    getpostalcode2.serializer(constructor2);
                                } else {
                                    getpostalcode2.serializer(constructor2);
                                    throw null;
                                }
                            }
                            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
                            mergeZ1GrekI.IconCompatParcelizer(str, getpostalcode2, 6);
                            androidx.compose.material3.TextKt.m131TextNvy7gAk("%", null, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onPrepareSupportNavigateUpTaskStack(), 0L, null, null, 0L, null, 0L, androidx.compose.ui.text.style.TextOverflow.Companion.m3569getEllipsisgIe3tQ8(), false, 1, 0, null, performLayout.MediaSessionCompatResultReceiverWrapper(), getpostalcode2, 6, 24960, 110586);
                            getpostalcode2.IconCompatParcelizer(true);
                            getpostalcode2.IconCompatParcelizer(true);
                        } else {
                            SentryUUID.write();
                            throw null;
                        }
                    } else {
                        getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                    return createFromParcel.INSTANCE;
                }
            }, getpostalcode), getpostalcode, 56);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new SingleThreadCachedScheduler2(str, f, modifier, i, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x011f  */
    public static final void RemoteActionCompatParcelizer(final float f, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = serializer + 105;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1930293378);
        if ((i & 6) == 0) {
            if (getpostalcode.serializer(f)) {
                int i7 = write + 13;
                serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if (!getpostalcode.write(i2 & 1, (i2 & 3) != 2)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            int i9 = write + 119;
            serializer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i10 = i9 % 2;
            final onViewAttachedToWindow onviewattachedtowindowIconCompatParcelizer = TapGestureDetectorKtprocessTapGestureresetJob1.IconCompatParcelizer(f, (requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{Integer.valueOf(LocationRequest.PRIORITY_INDOOR), 0, null, 6}), null, null, getpostalcode, (i2 & 14) | 48, 28);
            final float fMo48toPx0680j_4 = ((androidx.compose.ui.unit.Density) getpostalcode.write((getNewPassword) androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity())).mo48toPx0680j_4(Dimensions.handleOnBackPressed);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            final long jAddObserverForBackInvoker = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).addObserverForBackInvoker();
            final long jEnsureViewModelStore = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).ensureViewModelStore();
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new androidx.compose.ui.graphics.drawscope.Stroke(fMo48toPx0680j_4, 0.0f, androidx.compose.ui.graphics.StrokeCap.Companion.m1100getRoundKaPHkGw(), 0, null, 26, null);
                getpostalcode.write(objComponentActivity);
            }
            final androidx.compose.ui.graphics.drawscope.Stroke stroke = (androidx.compose.ui.graphics.drawscope.Stroke) objComponentActivity;
            androidx.compose.ui.Modifier modifierThen = androidx.compose.ui.Modifier.Companion.then(androidx.compose.foundation.layout.SizeKt.read);
            boolean zSerializer = getpostalcode.serializer(fMo48toPx0680j_4);
            boolean zSerializer2 = getpostalcode.serializer(jAddObserverForBackInvoker);
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(stroke);
            boolean z = getpostalcode.read(onviewattachedtowindowIconCompatParcelizer);
            boolean zSerializer3 = getpostalcode.serializer(jEnsureViewModelStore);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (!(zSerializer | zSerializer2 | zIconCompatParcelizer | z) && !zSerializer3) {
                int i11 = write + 105;
                serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i12 = i11 % 2;
                if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.getDefaultannotations
                        private static int MediaMetadataCompat = 0;
                        private static int RatingCompat = 1;

                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public final Object invoke(Object obj) {
                            int i13 = 2 % 2;
                            int i14 = MediaMetadataCompat + 43;
                            RatingCompat = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i15 = i14 % 2;
                            androidx.compose.ui.graphics.drawscope.DrawScope drawScope = (androidx.compose.ui.graphics.drawscope.DrawScope) obj;
                            drawScope.getClass();
                            float f2 = fMo48toPx0680j_4 / 2.0f;
                            float fM544getMaxDimensionimpl = (androidx.compose.ui.geometry.Size.m544getMaxDimensionimpl(drawScope.mo1304getSizeNHjbRc()) / 2.0f) - f2;
                            long j = jAddObserverForBackInvoker;
                            androidx.compose.ui.graphics.drawscope.Stroke stroke2 = stroke;
                            androidx.compose.ui.graphics.drawscope.DrawScope.m1285drawCircleVaOC9Bg$default(drawScope, j, fM544getMaxDimensionimpl, 0L, 0.0f, stroke2, null, 0, ActivityIdentificationData.RUNNING, null);
                            float fFloatValue = ((Number) onviewattachedtowindowIconCompatParcelizer.getValue()).floatValue();
                            float f3 = fM544getMaxDimensionimpl * 2.0f;
                            androidx.compose.ui.graphics.drawscope.DrawScope.m1283drawArcyD3GUKo$default(drawScope, jEnsureViewModelStore, 270.0f, 360.0f * fFloatValue, false, androidx.compose.ui.geometry.Offset.m482plusMKHz9U(androidx.compose.ui.geometry.Offset.Companion.m493getZeroF1C5BW0(), androidx.compose.ui.geometry.Offset.m469constructorimpl((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L))), androidx.compose.ui.geometry.Size.m537constructorimpl((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L)), 0.0f, stroke2, null, 0, 832, null);
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            int i16 = RatingCompat + 77;
                            MediaMetadataCompat = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            if (i16 % 2 != 0) {
                                int i17 = 85 / 0;
                            }
                            return createfromparcel;
                        }
                    };
                    getpostalcode.write(objComponentActivity2);
                }
            } else {
                objComponentActivity2 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.getDefaultannotations
                    private static int MediaMetadataCompat = 0;
                    private static int RatingCompat = 1;

                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                    public final Object invoke(Object obj) {
                        int i13 = 2 % 2;
                        int i14 = MediaMetadataCompat + 43;
                        RatingCompat = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i15 = i14 % 2;
                        androidx.compose.ui.graphics.drawscope.DrawScope drawScope = (androidx.compose.ui.graphics.drawscope.DrawScope) obj;
                        drawScope.getClass();
                        float f2 = fMo48toPx0680j_4 / 2.0f;
                        float fM544getMaxDimensionimpl = (androidx.compose.ui.geometry.Size.m544getMaxDimensionimpl(drawScope.mo1304getSizeNHjbRc()) / 2.0f) - f2;
                        long j = jAddObserverForBackInvoker;
                        androidx.compose.ui.graphics.drawscope.Stroke stroke2 = stroke;
                        androidx.compose.ui.graphics.drawscope.DrawScope.m1285drawCircleVaOC9Bg$default(drawScope, j, fM544getMaxDimensionimpl, 0L, 0.0f, stroke2, null, 0, ActivityIdentificationData.RUNNING, null);
                        float fFloatValue = ((Number) onviewattachedtowindowIconCompatParcelizer.getValue()).floatValue();
                        float f3 = fM544getMaxDimensionimpl * 2.0f;
                        androidx.compose.ui.graphics.drawscope.DrawScope.m1283drawArcyD3GUKo$default(drawScope, jEnsureViewModelStore, 270.0f, 360.0f * fFloatValue, false, androidx.compose.ui.geometry.Offset.m482plusMKHz9U(androidx.compose.ui.geometry.Offset.Companion.m493getZeroF1C5BW0(), androidx.compose.ui.geometry.Offset.m469constructorimpl((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L))), androidx.compose.ui.geometry.Size.m537constructorimpl((((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L)), 0.0f, stroke2, null, 0, 832, null);
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        int i16 = RatingCompat + 77;
                        MediaMetadataCompat = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i16 % 2 != 0) {
                            int i17 = 85 / 0;
                        }
                        return createfromparcel;
                    }
                };
                getpostalcode.write(objComponentActivity2);
            }
            AwaitFirstLayoutModifier.serializer(modifierThen, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode, 6);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.createPlatformTextStyleInternal
                private static int read = 0;
                private static int serializer = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    getBirthDateFull getbirthdatefull2;
                    int iRemoteActionCompatParcelizer;
                    float f2;
                    int i13 = 2 % 2;
                    int i14 = read + 43;
                    serializer = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i14 % 2 == 0) {
                        getbirthdatefull2 = (getBirthDateFull) obj;
                        ((Integer) obj2).intValue();
                        iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i);
                        f2 = f;
                    } else {
                        getbirthdatefull2 = (getBirthDateFull) obj;
                        ((Integer) obj2).intValue();
                        iRemoteActionCompatParcelizer = ContentType_androidKt.RemoteActionCompatParcelizer(i | 1);
                        f2 = f;
                    }
                    mergeZ1GrekI.RemoteActionCompatParcelizer(f2, getbirthdatefull2, iRemoteActionCompatParcelizer);
                    return createFromParcel.INSTANCE;
                }
            };
        }
        int i13 = write + 79;
        serializer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    public static final void write(androidx.compose.ui.Modifier modifier, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        boolean z;
        getPostalCode getpostalcode;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        int i5;
        int i6 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-871198434);
        if ((i2 & 6) == 0) {
            int i7 = serializer + 123;
            write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                if (getpostalcode2.read(i)) {
                    i5 = 4;
                } else {
                    i5 = 2;
                }
            } else {
                int i8 = 99 / 0;
                if (getpostalcode2.read(i)) {
                    i5 = 4;
                } else {
                    i5 = 2;
                }
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        int i9 = i3 | 48;
        if ((i9 & 19) != 18) {
            int i10 = write;
            int i11 = i10 + 31;
            serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i12 = i11 % 2;
            int i13 = i10 + 103;
            serializer = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i14 = i13 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i9 & 1, z)) {
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                int i15 = write + 89;
                serializer = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i16 = i15 % 2;
                objComponentActivity = androidx.compose.runtime.CompositionKt.read(i);
                getpostalcode2.write(objComponentActivity);
            }
            getPlatformAndroidManager getplatformandroidmanager = (getPlatformAndroidManager) objComponentActivity;
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2);
                getpostalcode2.write(objComponentActivity2);
            }
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objComponentActivity2;
            int i17 = i9 & 14;
            boolean z2 = i17 == 4;
            Object objComponentActivity3 = getpostalcode2.ComponentActivity();
            if (z2 || objComponentActivity3 == androidContentCaptureManager) {
                if (((i - ((onHideTranslationui) getplatformandroidmanager).serializer()) + 10) % 10 < 6) {
                    int i18 = write + 13;
                    serializer = i18 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                    i4 = 1;
                } else {
                    int i20 = serializer + 19;
                    write = i20 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i21 = i20 % 2;
                    i4 = -1;
                }
                objComponentActivity3 = Integer.valueOf(i4);
                getpostalcode2.write(objComponentActivity3);
            }
            int iIntValue = ((Number) objComponentActivity3).intValue();
            boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(getcontentviewgroupparentlayout);
            boolean z3 = i17 == 4;
            boolean z4 = getpostalcode2.read(iIntValue);
            Object objComponentActivity4 = getpostalcode2.ComponentActivity();
            if ((z4 | z3 | zIconCompatParcelizer) || objComponentActivity4 == androidContentCaptureManager) {
                RemoteFunctionKt$onRemoteFunction$1 remoteFunctionKt$onRemoteFunction$1 = new RemoteFunctionKt$onRemoteFunction$1(getcontentviewgroupparentlayout, i, iIntValue, getplatformandroidmanager, null);
                getpostalcode2.write(remoteFunctionKt$onRemoteFunction$1);
                objComponentActivity4 = remoteFunctionKt$onRemoteFunction$1;
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2, Integer.valueOf(i), (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity4);
            int iSerializer = ((onHideTranslationui) getplatformandroidmanager).serializer();
            Object objComponentActivity5 = getpostalcode2.ComponentActivity();
            if (objComponentActivity5 == androidContentCaptureManager) {
                objComponentActivity5 = new accessgetTextCentercp(18);
                getpostalcode2.write(objComponentActivity5);
            }
            getpostalcode = getpostalcode2;
            androidx.compose.animation.AnimatedContentKt.write(Integer.valueOf(iSerializer), companion, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity5, null, null, null, resolveDefaults.write, getpostalcode, (i9 & 112) | 1573248, 56);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new SingleThreadFutureScheduler2(i, i2, 2, modifier2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0123  */
    /* JADX WARN: Code duplicated, block: B:77:0x013d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0176  */
    public static final void IconCompatParcelizer(String str, getBirthDateFull getbirthdatefull, int i) {
        int iDigit;
        boolean z;
        boolean z2;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1979944252);
        int i5 = (i & 6) == 0 ? (getpostalcode.read(TextFieldKt.read) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            if (!(!getpostalcode.read(str))) {
                int i6 = write + 53;
                serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i2 = 32;
            } else {
                i2 = 16;
            }
            i5 |= i2;
        }
        int i8 = i5;
        if (!(!getpostalcode.write(i8 & 1, (i8 & 19) != 18))) {
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            Object obj = null;
            if (objComponentActivity == androidContentCaptureManager) {
                int i9 = serializer + 59;
                write = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    getpostalcode.write(androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(str));
                    obj.hashCode();
                    throw null;
                }
                objComponentActivity = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(str);
                getpostalcode.write(objComponentActivity);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity;
            int i10 = i8 & 112;
            boolean z3 = i10 == 32;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            Object obj2 = objComponentActivity2;
            if (z3 || objComponentActivity2 == androidContentCaptureManager) {
                ArrayList arrayList = new ArrayList(str.length());
                for (int i11 = 0; i11 < str.length(); i11++) {
                    int i12 = write + 97;
                    serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    arrayList.add((i12 % 2 == 0 ? (iDigit = Character.digit((int) str.charAt(i11), 10)) < 0 : (iDigit = Character.digit((int) str.charAt(i11), 42)) < 0) ? null : Integer.valueOf(iDigit));
                }
                getpostalcode.write(arrayList);
                obj2 = arrayList;
            }
            List list = (List) obj2;
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (objComponentActivity3 == androidContentCaptureManager) {
                String str2 = (String) populateViewStructure_androidKtpopulate7.getValue();
                ArrayList arrayList2 = new ArrayList(str2.length());
                for (int i13 = 0; i13 < str2.length(); i13++) {
                    int i14 = serializer + 69;
                    write = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    int iDigit2 = Character.digit((int) str2.charAt(i13), 10);
                    arrayList2.add(iDigit2 >= 0 ? Integer.valueOf(iDigit2) : null);
                }
                getpostalcode.write(arrayList2);
                objComponentActivity3 = arrayList2;
            }
            List list2 = (List) objComponentActivity3;
            if (i10 == 32) {
                int i16 = write + 99;
                serializer = i16 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i16 % 2 != 0) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (z) {
                objComponentActivity4 = new PasswordFieldKt$PasswordField$5$1(str, populateViewStructure_androidKtpopulate7, null, 1);
                getpostalcode.write(objComponentActivity4);
            } else {
                int i17 = write + 57;
                serializer = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i17 % 2 != 0) {
                    Object obj3 = null;
                    obj3.hashCode();
                    throw null;
                }
                if (objComponentActivity4 == androidContentCaptureManager) {
                    objComponentActivity4 = new PasswordFieldKt$PasswordField$5$1(str, populateViewStructure_androidKtpopulate7, null, 1);
                    getpostalcode.write(objComponentActivity4);
                }
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, str, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity4);
            int i18 = 0;
            for (int iMax = Math.max(list.size(), list2.size()); i18 < iMax; iMax = iMax) {
                Integer num = (Integer) onContentCardDismissed.read(i18, list);
                Integer num2 = (Integer) onContentCardDismissed.read(i18, list2);
                if (num != null) {
                    int i19 = write + 21;
                    serializer = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i20 = i19 % i3;
                    if (num2 != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                i3 = 2;
                androidx.compose.animation.AnimatedVisibilityKt.IconCompatParcelizer(z2, null, onKeyEventZmokQxo.serializer((requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{0, 0, null, 7}), i3), onKeyEventZmokQxo.write((requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{Integer.valueOf(LocationRequest.PRIORITY_INDOOR), 0, null, 6}), 2).read(onKeyEventZmokQxo.RemoteActionCompatParcelizer((requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{200, 0, null, 6}), 14)), null, coil3.ExtrasKt.write(1143287234, new SubcomposeAsyncImageKt$$ExternalSyntheticLambda2(7, num), getpostalcode), getpostalcode, (14 & i8) | 1600512, 18);
                i18++;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new a7ExternalSyntheticLambda3(str, i, 1);
        }
    }
}
