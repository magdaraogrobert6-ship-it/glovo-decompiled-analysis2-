package com.roadrunner.delivery.accept.glowBoxBanner.presentation;

import androidx.cardview.widget.CardView$1;
import androidx.compose.animation.EnterExitTransitionKt$slideInVertically$2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.room.RoomDatabase$$ExternalSyntheticLambda2;
import androidx.room.RoomDatabase$$ExternalSyntheticLambda4;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.Extras$Key;
import coil3.ExtrasKt;
import coil3.util.IntPair;
import com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1;
import com.roadrunner.delivery.accept.glowBoxBanner.presentation.GlowBoxBannerContainerKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.home.expandedbubblelayer.presentation.ExpandedBubbleUiModelImpl;
import io.sentry.SentryUUID;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.sync.MutexImpl;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.Iconww6aTOc;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PaintExtensions_androidKt;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes3.dex */
public abstract class GlowBoxBannerContainerKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read = 0;
    public static final MapApiError$$ExternalSyntheticLambda1 serializer = new MapApiError$$ExternalSyntheticLambda1(8);
    private static int write = 1;

    static {
        int i = RemoteActionCompatParcelizer + 85;
        read = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static final void GlowBoxBannerContainer(final PaintExtensions_androidKt paintExtensions_androidKt, final boolean z, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        getPostalCode getpostalcode;
        final Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        paintExtensions_androidKt.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(95697323);
        if ((i & 6) == 0) {
            i2 = (!(((i & 8) == 0 ? getpostalcode2.read(paintExtensions_androidKt) : getpostalcode2.IconCompatParcelizer(paintExtensions_androidKt)) ^ true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.write(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i5 = IconCompatParcelizer + 15;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                i3 = Fields.RotationX;
            } else {
                int i7 = IconCompatParcelizer + 7;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ^ true ? Fields.RotationZ : Fields.CameraDistance;
        }
        int i9 = i2 | 24576;
        if (getpostalcode2.write(i9 & 1, (i9 & 9363) != 9362)) {
            Modifier.Companion companion = Modifier.Companion;
            final float f = Dimensions.setTabContainer;
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion, 0.0f, Dp.m3673constructorimpl(IntPair.RemoteActionCompatParcelizer(getpostalcode2) + f), 0.0f, 0.0f, 13);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getCenterHorizontally(), getpostalcode2, 48);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM74paddingqDBjuR0$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i10 = IconCompatParcelizer + 91;
            write = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
                int i12 = write + 103;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            getpostalcode = getpostalcode2;
            Iconww6aTOc.serializer(null, null, false, ExtrasKt.write(1666478687, new r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY() { // from class: o.setUseLineSpacingFromFallbacks
                private static int MediaDescriptionCompat = 0;
                private static int MediaMetadataCompat = 1;

                /* JADX WARN: Code duplicated, block: B:46:0x01a9 A[Catch: all -> 0x0197, PHI: r12 r14
  0x01a9: PHI (r12v12 o.HeightInLinesNode) = (r12v11 o.HeightInLinesNode), (r12v13 o.HeightInLinesNode) binds: [B:45:0x01a7, B:40:0x0194] A[DONT_GENERATE, DONT_INLINE]
  0x01a9: PHI (r14v8 float) = (r14v7 float), (r14v10 float) binds: [B:45:0x01a7, B:40:0x0194] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0197, blocks: (B:38:0x0182, B:46:0x01a9, B:47:0x01b2, B:44:0x0199), top: B:74:0x0180 }] */
                /* JADX WARN: Code duplicated, block: B:62:0x0209  */
                @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Object value;
                    HeightInLinesNode heightInLinesNode;
                    float fSerializer;
                    int i14 = 2 % 2;
                    getShouldCreateCompositionOnAttachedToWindow getshouldcreatecompositiononattachedtowindow = (getShouldCreateCompositionOnAttachedToWindow) obj;
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    getshouldcreatecompositiononattachedtowindow.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((getPostalCode) getbirthdatefull2).read(getshouldcreatecompositiononattachedtowindow) ? 4 : 2;
                    }
                    getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull2;
                    boolean zWrite = getpostalcode3.write(iIntValue & 1, (iIntValue & 19) != 18);
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    if (!zWrite) {
                        getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        return createfromparcel;
                    }
                    androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) getpostalcode3.write((getNewPassword) androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
                    Object objComponentActivity = getpostalcode3.ComponentActivity();
                    AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    if (objComponentActivity == androidContentCaptureManager) {
                        int i15 = MediaMetadataCompat + 111;
                        MediaDescriptionCompat = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i16 = i15 % 2;
                        objComponentActivity = Float.valueOf((density.mo48toPx0680j_4(((getWindow) getshouldcreatecompositiononattachedtowindow).serializer()) / 2.0f) + density.mo48toPx0680j_4(f));
                        getpostalcode3.write(objComponentActivity);
                    }
                    float fFloatValue = ((Number) objComponentActivity).floatValue();
                    Object objComponentActivity2 = getpostalcode3.ComponentActivity();
                    if (objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = new setJustificationMode(fFloatValue);
                        getpostalcode3.write(objComponentActivity2);
                    }
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2;
                    Object objComponentActivity3 = getpostalcode3.ComponentActivity();
                    Object obj4 = null;
                    if (objComponentActivity3 == androidContentCaptureManager) {
                        getCharSequenceBounds getcharsequencebounds = getCharSequenceBounds.DISMISSED;
                        requiredWidthInVpY3zN4default requiredwidthinvpy3zn4default = (requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{0, 0, null, 7});
                        accessanimateWithTarget accessanimatewithtarget = new accessanimateWithTarget(new Extras$Key(density));
                        RoomDatabase$$ExternalSyntheticLambda4 roomDatabase$$ExternalSyntheticLambda4 = new RoomDatabase$$ExternalSyntheticLambda4(1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                        accessisRelatedToAutoCommit accessisrelatedtoautocommit = androidx.compose.foundation.gestures.AnchoredDraggableKt.serializer;
                        androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState = new androidx.compose.foundation.gestures.AnchoredDraggableState(getcharsequencebounds, roomDatabase$$ExternalSyntheticLambda4);
                        anchoredDraggableState.MediaDescriptionCompat = GlowBoxBannerContainerKt.serializer;
                        anchoredDraggableState.PlaybackStateCompatCustomAction = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
                        anchoredDraggableState.MediaSessionCompatResultReceiverWrapper = requiredwidthinvpy3zn4default;
                        anchoredDraggableState.read = accessanimatewithtarget;
                        CardView$1 cardView$1 = new CardView$1(2);
                        cardView$1.IconCompatParcelizer(getCharSequenceBounds.ANCHORED, 0.0f);
                        cardView$1.IconCompatParcelizer(getcharsequencebounds, -fFloatValue);
                        ArrayList arrayList = (ArrayList) cardView$1.RemoteActionCompatParcelizer;
                        float[] fArr = (float[]) cardView$1.IconCompatParcelizer;
                        int size = arrayList.size();
                        fArr.getClass();
                        coil3.util.IntPair.write(size, fArr.length);
                        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size);
                        fArrCopyOfRange.getClass();
                        TextFieldCursor_androidKt textFieldCursor_androidKt = new TextFieldCursor_androidKt(arrayList, fArrCopyOfRange);
                        boolean zIsNaN = Float.isNaN(anchoredDraggableState.RemoteActionCompatParcelizer());
                        getPersonLastName getpersonlastname = anchoredDraggableState.ParcelableVolumeInfo;
                        if (zIsNaN || (value = textFieldCursor_androidKt.read(anchoredDraggableState.RemoteActionCompatParcelizer())) == null) {
                            value = getpersonlastname.getValue();
                        }
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{anchoredDraggableState.IconCompatParcelizer(), textFieldCursor_androidKt}, getCieXyz.write())).booleanValue()) {
                            ((onShowTranslationui) anchoredDraggableState.RemoteActionCompatParcelizer).setValue(textFieldCursor_androidKt);
                            awaitScrollDependencies awaitscrolldependencies = anchoredDraggableState.MediaSessionCompatQueueItem;
                            MutexImpl mutexImpl = awaitscrolldependencies.RemoteActionCompatParcelizer;
                            MutexImpl mutexImpl2 = awaitscrolldependencies.RemoteActionCompatParcelizer;
                            boolean zWrite2 = mutexImpl.write();
                            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = anchoredDraggableState.MediaMetadataCompat;
                            if (zWrite2) {
                                int i17 = MediaMetadataCompat + 17;
                                MediaDescriptionCompat = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                try {
                                    if (i17 % 2 != 0) {
                                        heightInLinesNode = anchoredDraggableState.write;
                                        fSerializer = anchoredDraggableState.IconCompatParcelizer().serializer(value);
                                        int i18 = 71 / 0;
                                        if (!Float.isNaN(fSerializer)) {
                                            heightInLinesNode.read(fSerializer, 0.0f);
                                            ((onShowTranslationui) populateViewStructure_androidKtpopulate7).setValue(null);
                                        }
                                    } else {
                                        heightInLinesNode = anchoredDraggableState.write;
                                        fSerializer = anchoredDraggableState.IconCompatParcelizer().serializer(value);
                                        if (!Float.isNaN(fSerializer)) {
                                            heightInLinesNode.read(fSerializer, 0.0f);
                                            ((onShowTranslationui) populateViewStructure_androidKtpopulate7).setValue(null);
                                        }
                                    }
                                    anchoredDraggableState.RemoteActionCompatParcelizer(value);
                                    ((onShowTranslationui) anchoredDraggableState.PlaybackStateCompat).setValue(value);
                                    mutexImpl2.write(null);
                                } catch (Throwable th) {
                                    mutexImpl2.write(null);
                                    throw th;
                                }
                            }
                            if (!zWrite2) {
                                int i19 = MediaMetadataCompat + 51;
                                MediaDescriptionCompat = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i20 = i19 % 2;
                                ((onShowTranslationui) populateViewStructure_androidKtpopulate7).setValue(value);
                                int i21 = MediaMetadataCompat + 93;
                                MediaDescriptionCompat = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i22 = i21 % 2;
                            }
                        }
                        getpostalcode3.write(anchoredDraggableState);
                        objComponentActivity3 = anchoredDraggableState;
                    }
                    androidx.compose.foundation.gestures.AnchoredDraggableState anchoredDraggableState2 = (androidx.compose.foundation.gestures.AnchoredDraggableState) objComponentActivity3;
                    Object value2 = ((onShowTranslationui) anchoredDraggableState2.IconCompatParcelizer).getValue();
                    boolean z2 = z;
                    boolean zWrite3 = getpostalcode3.write(z2);
                    Object objComponentActivity4 = getpostalcode3.ComponentActivity();
                    if (zWrite3) {
                        objComponentActivity4 = new ExpandedBubbleUiModelImpl.AnonymousClass1(z2, anchoredDraggableState2, null);
                        getpostalcode3.write(objComponentActivity4);
                    } else {
                        int i23 = MediaMetadataCompat + 51;
                        MediaDescriptionCompat = i23 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        if (i23 % 2 != 0) {
                            obj4.hashCode();
                            throw null;
                        }
                        if (objComponentActivity4 == androidContentCaptureManager) {
                            objComponentActivity4 = new ExpandedBubbleUiModelImpl.AnonymousClass1(z2, anchoredDraggableState2, null);
                            getpostalcode3.write(objComponentActivity4);
                        }
                    }
                    PaintExtensions_androidKt paintExtensions_androidKt2 = paintExtensions_androidKt;
                    getPhoneNumberNational.serializer(value2, paintExtensions_androidKt2, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity4, getpostalcode3);
                    androidx.compose.animation.core.CubicBezierEasing cubicBezierEasing = SnapFlingBehaviorKt.serializer;
                    requiredWidthInVpY3zN4default requiredwidthinvpy3zn4default2 = new requiredWidthInVpY3zN4default(750, 25, cubicBezierEasing);
                    Object objComponentActivity5 = getpostalcode3.ComponentActivity();
                    if (objComponentActivity5 == androidContentCaptureManager) {
                        objComponentActivity5 = new MapApiError$$ExternalSyntheticLambda1(10);
                        getpostalcode3.write(objComponentActivity5);
                    }
                    ScrollingLogicdoFlingAnimation2reverseScope1 scrollingLogicdoFlingAnimation2reverseScope1 = onKeyEventZmokQxo.read(requiredwidthinvpy3zn4default2, new EnterExitTransitionKt$slideInVertically$2((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity5, 0));
                    requiredWidthInVpY3zN4default requiredwidthinvpy3zn4default3 = (requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), new Object[]{750, 0, cubicBezierEasing, 2});
                    Object objComponentActivity6 = getpostalcode3.ComponentActivity();
                    if (objComponentActivity6 == androidContentCaptureManager) {
                        objComponentActivity6 = new MapApiError$$ExternalSyntheticLambda1(11);
                        getpostalcode3.write(objComponentActivity6);
                    }
                    TapGestureDetectorKt tapGestureDetectorKt = new TapGestureDetectorKt(new getPostSlopOffsetqto3Fdw((consumeUntilUp) null, new TouchSlopDetector(requiredwidthinvpy3zn4default3, new EnterExitTransitionKt$slideInVertically$2((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity6, 1)), (tryAwaitRelease) null, (waitForUpOrCancellation) null, (LinkedHashMap) null, 125));
                    androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.Companion;
                    Object objComponentActivity7 = getpostalcode3.ComponentActivity();
                    if (objComponentActivity7 == androidContentCaptureManager) {
                        objComponentActivity7 = new RoomDatabase$$ExternalSyntheticLambda2(18, anchoredDraggableState2);
                        getpostalcode3.write(objComponentActivity7);
                        int i24 = MediaMetadataCompat + 77;
                        MediaDescriptionCompat = i24 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i25 = i24 % 2;
                    }
                    androidx.compose.ui.Modifier modifierRemoteActionCompatParcelizer = androidx.compose.foundation.layout.OffsetKt.RemoteActionCompatParcelizer(companion3, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity7);
                    modifierRemoteActionCompatParcelizer.getClass();
                    androidx.compose.animation.AnimatedVisibilityKt.serializer(z2, androidx.compose.foundation.gestures.AnchoredDraggableKt.write(modifierRemoteActionCompatParcelizer, anchoredDraggableState2, SelectionHandleIcon.Vertical), scrollingLogicdoFlingAnimation2reverseScope1, tapGestureDetectorKt, null, coil3.ExtrasKt.write(-1653370233, new forEachGesturableIntersection(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, 3, paintExtensions_androidKt2), getpostalcode3), getpostalcode3, 1572864, 16);
                    return createfromparcel;
                }
            }, getpostalcode2), getpostalcode2, 3072, 7);
            getpostalcode.IconCompatParcelizer(true);
            int i14 = IconCompatParcelizer + 35;
            write = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.StaticLayoutFactory26
                private static int MediaDescriptionCompat = 0;
                private static int MediaSessionCompatQueueItem = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i16 = 2 % 2;
                    int i17 = MediaSessionCompatQueueItem + 39;
                    MediaDescriptionCompat = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    ((Integer) obj2).getClass();
                    GlowBoxBannerContainerKt.GlowBoxBannerContainer(paintExtensions_androidKt, z, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, modifier2, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i19 = MediaDescriptionCompat + 41;
                    MediaSessionCompatQueueItem = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i19 % 2 != 0) {
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
