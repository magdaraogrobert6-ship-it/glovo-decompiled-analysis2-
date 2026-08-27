package com.roadrunner.home.nest;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics$$ExternalSyntheticLambda0;
import androidx.compose.ui.tooling.data.SlotTreeKt$$ExternalSyntheticLambda0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda2;
import com.huawei.location.Vw$Vw;
import com.huawei.wisesecurity.ucs_credential.n0;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.home.nest.component.empty.EmptyContentKt;
import com.roadrunner.rider.state.ondemand.api.bonus.OnDemandWithBonusUiModel;
import com.roadrunner.rider.state.ondemand.api.presentation.OnDemandUiModel;
import com.roadrunner.settings.ui.components.ComposableSingletons$PreferenceItemKt$$ExternalSyntheticLambda1;
import com.roadrunner.tnc.TncComposableFactoryImpl$$ExternalSyntheticLambda0;
import com.sentiance.core.model.events.C$b;
import com.sentiance.core.model.events.N$b;
import io.sentry.SentryUUID;
import io.sentry.util.network.NetworkBody;
import java.util.Iterator;
import o.AdjustInstanceExternalSyntheticLambda1;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.BaselineShiftCompanion;
import o.ChildHelper;
import o.DividerItemDecoration;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.GridLayoutManager;
import o.LinearLayoutManager;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.ProfileInstallerInitializer;
import o.TwoStatePreferenceSavedState;
import o.clearView;
import o.decryptAndGetPasswordBWLJW6A;
import o.findChildView;
import o.foregroundOrElseBackgroundCached;
import o.getAppVersion;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getMeasurementApiStatussuspendImpl;
import o.getMoveThreshold;
import o.getPointerPrecisionfpxItnM;
import o.getPostalCode;
import o.getStoreIdFromSystem;
import o.getStoreInfoFromClient;
import o.getSwipeThreshold;
import o.invokegIAlus;
import o.makeFlag;
import o.onAnimation;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.saveInteger;
import o.savePushToken;
import o.sendAttributionRequest;
import o.setCountrylambda1;
import o.setDivider;
import o.setHttpsURLConnectionProvider;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NestItemsContentKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;

    /* JADX WARN: Code duplicated, block: B:11:0x005a  */
    /* JADX WARN: Code duplicated, block: B:12:0x005f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0065  */
    /* JADX WARN: Code duplicated, block: B:17:0x0071  */
    /* JADX WARN: Code duplicated, block: B:18:0x0073  */
    /* JADX WARN: Code duplicated, block: B:20:0x0076 A[PHI: r0 r7
  0x0076: PHI (r0v15 java.lang.Integer) = (r0v5 int), (r0v17 int) binds: [B:8:0x0054, B:5:0x0036] A[DONT_GENERATE, DONT_INLINE]
  0x0076: PHI (r7v5 o.getPostalCode) = (r7v1 o.getPostalCode), (r7v7 o.getPostalCode) binds: [B:8:0x0054, B:5:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:9:0x0056 A[PHI: r0 r7
  0x0056: PHI (r0v6 java.lang.Integer) = (r0v5 int), (r0v17 int) binds: [B:8:0x0054, B:5:0x0036] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r7v2 o.getPostalCode) = (r7v1 o.getPostalCode), (r7v7 o.getPostalCode) binds: [B:8:0x0054, B:5:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void NestItemsContent(invokegIAlus invokegialus, setCountrylambda1 setcountrylambda1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i3;
        int i4;
        int i5;
        boolean z;
        Modifier modifier2;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds;
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
        r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2;
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3;
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4;
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry5;
        r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds3;
        boolean z2;
        int i6;
        int i7 = 2 % 2;
        int i8 = RemoteActionCompatParcelizer + 53;
        serializer = i8 % Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            i2 = 78;
            invokegialus.getClass();
            setcountrylambda1.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1309702698);
            if ((i & 3) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(invokegialus);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(invokegialus);
                }
                if (zIconCompatParcelizer) {
                    i5 = RemoteActionCompatParcelizer + 53;
                    serializer = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        i3 = 2;
                    } else {
                        i3 = 4;
                    }
                } else {
                    i3 = 2;
                }
                i4 = i3 | i;
            } else {
                i4 = i;
            }
        } else {
            i2 = 48;
            invokegialus.getClass();
            setcountrylambda1.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1309702698);
            if ((i & 6) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(invokegialus);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(invokegialus);
                }
                if (zIconCompatParcelizer) {
                    i5 = RemoteActionCompatParcelizer + 53;
                    serializer = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        i3 = 2;
                    } else {
                        i3 = 4;
                    }
                } else {
                    i3 = 2;
                }
                i4 = i3 | i;
            } else {
                i4 = i;
            }
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(setcountrylambda1)) {
                int i9 = RemoteActionCompatParcelizer + 23;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        if ((i & 384) == 0) {
            i4 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i4 |= getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i4 & 1171) != 1170) {
            int i11 = RemoteActionCompatParcelizer + 61;
            serializer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode.write(i4 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                DragAndDropTargetModifierNode dragAndDropTargetModifierNode = new DragAndDropTargetModifierNode(new ComposableSingletons$PreferenceItemKt$$ExternalSyntheticLambda1(11), true, -36497937);
                getpostalcode.write(dragAndDropTargetModifierNode);
                objComponentActivity = dragAndDropTargetModifierNode;
            }
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new DragAndDropTargetModifierNode(new AndroidParagraphIntrinsics$$ExternalSyntheticLambda0(13, (getAppVersion) setcountrylambda1.RemoteActionCompatParcelizer), true, 266573250);
                getpostalcode.write(objComponentActivity2);
            }
            r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds4 = (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) objComponentActivity2;
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new DragAndDropTargetModifierNode(new AndroidParagraphIntrinsics$$ExternalSyntheticLambda0(12, (sendAttributionRequest) setcountrylambda1.read), true, 639788280);
                getpostalcode.write(objComponentActivity3);
            }
            r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds5 = (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) objComponentActivity3;
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new DragAndDropTargetModifierNode(new SubcomposeAsyncImageKt$$ExternalSyntheticLambda2(17, (n0) setcountrylambda1.write), true, -1946383668);
                getpostalcode.write(objComponentActivity4);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry6 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity4;
            Object objComponentActivity5 = getpostalcode.ComponentActivity();
            if (objComponentActivity5 == androidContentCaptureManager) {
                objComponentActivity5 = new DragAndDropTargetModifierNode(new SubcomposeAsyncImageKt$$ExternalSyntheticLambda2(28, (N$b) setcountrylambda1.MediaSessionCompatQueueItem), true, -951431976);
                getpostalcode.write(objComponentActivity5);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry7 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity5;
            Object objComponentActivity6 = getpostalcode.ComponentActivity();
            if (objComponentActivity6 == androidContentCaptureManager) {
                objComponentActivity6 = getMoveThreshold.IconCompatParcelizer;
                getpostalcode.write(objComponentActivity6);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry8 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity6;
            Object objComponentActivity7 = getpostalcode.ComponentActivity();
            if (objComponentActivity7 == androidContentCaptureManager) {
                objComponentActivity7 = TwoStatePreferenceSavedState.RemoteActionCompatParcelizer;
                getpostalcode.write(objComponentActivity7);
            }
            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity7;
            Object objComponentActivity8 = getpostalcode.ComponentActivity();
            if (objComponentActivity8 == androidContentCaptureManager) {
                objComponentActivity8 = new DragAndDropTargetModifierNode(new SlotTreeKt$$ExternalSyntheticLambda0(15, (SendTestPushUseCase) setcountrylambda1.MediaMetadataCompat), true, -1894948377);
                getpostalcode.write(objComponentActivity8);
            }
            r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds6 = (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) objComponentActivity8;
            Object objComponentActivity9 = getpostalcode.ComponentActivity();
            if (objComponentActivity9 == androidContentCaptureManager) {
                objComponentActivity9 = new DragAndDropTargetModifierNode(new foregroundOrElseBackgroundCached((getStoreIdFromSystem) setcountrylambda1.RatingCompat, false), true, 420680168);
                getpostalcode.write(objComponentActivity9);
            }
            r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds7 = (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) objComponentActivity9;
            Object objComponentActivity10 = getpostalcode.ComponentActivity();
            if (objComponentActivity10 == androidContentCaptureManager) {
                objComponentActivity10 = savePushToken.RemoteActionCompatParcelizer;
                getpostalcode.write(objComponentActivity10);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry9 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity10;
            Object objComponentActivity11 = getpostalcode.ComponentActivity();
            if (objComponentActivity11 == androidContentCaptureManager) {
                objComponentActivity11 = new DragAndDropTargetModifierNode(new TncComposableFactoryImpl$$ExternalSyntheticLambda0(5, (NetworkBody) setcountrylambda1.PlaybackStateCompatCustomAction), true, -881351504);
                getpostalcode.write(objComponentActivity11);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry10 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity11;
            Object objComponentActivity12 = getpostalcode.ComponentActivity();
            if (objComponentActivity12 == androidContentCaptureManager) {
                objComponentActivity12 = new DragAndDropTargetModifierNode(new SubcomposeAsyncImageKt$$ExternalSyntheticLambda2(29, (Vw$Vw) setcountrylambda1.IconCompatParcelizer), true, -1218889042);
                getpostalcode.write(objComponentActivity12);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity12;
            Object objComponentActivity13 = getpostalcode.ComponentActivity();
            if (objComponentActivity13 == androidContentCaptureManager) {
                objComponentActivity13 = new DragAndDropTargetModifierNode(new SlotTreeKt$$ExternalSyntheticLambda0(17, (C$b) setcountrylambda1.serializer), true, 1964779275);
                getpostalcode.write(objComponentActivity13);
            }
            r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds8 = (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) objComponentActivity13;
            Object objComponentActivity14 = getpostalcode.ComponentActivity();
            if (objComponentActivity14 == androidContentCaptureManager) {
                objComponentActivity14 = new DragAndDropTargetModifierNode(new SubcomposeAsyncImageKt$$ExternalSyntheticLambda2(27, (clearView) setcountrylambda1.MediaBrowserCompatMediaItem), true, -1944987711);
                getpostalcode.write(objComponentActivity14);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry12 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity14;
            Object objComponentActivity15 = getpostalcode.ComponentActivity();
            if (objComponentActivity15 == androidContentCaptureManager) {
                objComponentActivity15 = new DragAndDropTargetModifierNode(new SubcomposeAsyncImageKt$$ExternalSyntheticLambda2(26, (GridLayoutManager) setcountrylambda1.MediaDescriptionCompat), true, -628251797);
                getpostalcode.write(objComponentActivity15);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry13 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity15;
            Object objComponentActivity16 = getpostalcode.ComponentActivity();
            if (objComponentActivity16 == androidContentCaptureManager) {
                objComponentActivity16 = getMeasurementApiStatussuspendImpl.serializer;
                getpostalcode.write(objComponentActivity16);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry14 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity16;
            Iterator it = invokegialus.read.iterator();
            while (it.hasNext()) {
                decryptAndGetPasswordBWLJW6A decryptandgetpasswordbwljw6a = (decryptAndGetPasswordBWLJW6A) it.next();
                if (!(decryptandgetpasswordbwljw6a instanceof setDivider)) {
                    if (decryptandgetpasswordbwljw6a instanceof OnDemandUiModel) {
                        getpostalcode.serializer(-1816174805);
                        r8lambdafbccdpyn0hhvaib8bd2sxm5rsds4.invoke(decryptandgetpasswordbwljw6a, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getpostalcode, Integer.valueOf(((i4 >> 6) & 112) | 384));
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        if (decryptandgetpasswordbwljw6a instanceof OnDemandWithBonusUiModel) {
                            getpostalcode.serializer(-1816170860);
                            r8lambdafbccdpyn0hhvaib8bd2sxm5rsds5.invoke(decryptandgetpasswordbwljw6a, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getpostalcode, Integer.valueOf(((i4 >> 6) & 112) | 384));
                            z2 = false;
                            getpostalcode.IconCompatParcelizer(false);
                        } else {
                            z2 = false;
                            if (decryptandgetpasswordbwljw6a instanceof BaselineShiftCompanion) {
                                getpostalcode.serializer(-1816166864);
                                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry6.invoke(decryptandgetpasswordbwljw6a, getpostalcode, i2);
                                getpostalcode.IconCompatParcelizer(false);
                            } else if (decryptandgetpasswordbwljw6a instanceof LinearLayoutManager) {
                                getpostalcode.serializer(-1816163853);
                                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry7.invoke(decryptandgetpasswordbwljw6a, getpostalcode, i2);
                                getpostalcode.IconCompatParcelizer(false);
                            } else if (decryptandgetpasswordbwljw6a instanceof getSwipeThreshold) {
                                int i12 = RemoteActionCompatParcelizer + 97;
                                serializer = i12 % Fields.SpotShadowColor;
                                int i13 = i12 % 2;
                                getpostalcode.serializer(-1816160848);
                                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry8.invoke(decryptandgetpasswordbwljw6a, getpostalcode, i2);
                                getpostalcode.IconCompatParcelizer(false);
                            } else if (decryptandgetpasswordbwljw6a instanceof ProfileInstallerInitializer) {
                                int i14 = serializer + 47;
                                RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                                int i15 = i14 % 2;
                                getpostalcode.serializer(-1816158138);
                                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
                                r8lambdaa6_tctqmksh3fk6hjgcbkuvde2.invoke(getpostalcode, 6);
                                getpostalcode.IconCompatParcelizer(false);
                                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry8;
                                r8lambdafbccdpyn0hhvaib8bd2sxm5rsds4 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds4;
                                r8lambdafbccdpyn0hhvaib8bd2sxm5rsds5 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds5;
                                it = it;
                                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry7 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry7;
                                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde2;
                                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11;
                                r8lambdafbccdpyn0hhvaib8bd2sxm5rsds = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds6;
                                r8lambdafbccdpyn0hhvaib8bd2sxm5rsds3 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds7;
                                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry10;
                                r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds8;
                                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry6;
                                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry5 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry9;
                            } else {
                                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
                                if (decryptandgetpasswordbwljw6a instanceof DividerItemDecoration) {
                                    getpostalcode.serializer(-1816156564);
                                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry8;
                                    r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds9 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds6;
                                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry6;
                                    r8lambdafbccdpyn0hhvaib8bd2sxm5rsds9.invoke(decryptandgetpasswordbwljw6a, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode, Integer.valueOf(((i4 >> 3) & 112) | 384));
                                    getpostalcode.IconCompatParcelizer(false);
                                    r8lambdafbccdpyn0hhvaib8bd2sxm5rsds = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds9;
                                    r8lambdafbccdpyn0hhvaib8bd2sxm5rsds4 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds4;
                                    r8lambdafbccdpyn0hhvaib8bd2sxm5rsds5 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds5;
                                    it = it;
                                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry7 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry7;
                                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
                                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11;
                                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry5 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry9;
                                    r8lambdafbccdpyn0hhvaib8bd2sxm5rsds3 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds7;
                                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry10;
                                    r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds8;
                                } else {
                                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry8;
                                    r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds10 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds6;
                                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry6;
                                    if (decryptandgetpasswordbwljw6a instanceof getStoreInfoFromClient) {
                                        getpostalcode.serializer(-466148961);
                                        Modifier.Companion companion2 = Modifier.Companion;
                                        float f = Dimensions.getAnimatedVisibility;
                                        Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion2, f, 0.0f, f, Dimensions.setTabContainer, 2);
                                        r8lambdafbccdpyn0hhvaib8bd2sxm5rsds = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds10;
                                        r8lambdafbccdpyn0hhvaib8bd2sxm5rsds4 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds4;
                                        ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
                                        int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM74paddingqDBjuR0$default);
                                        r8lambdafbccdpyn0hhvaib8bd2sxm5rsds5 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds5;
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                                        it = it;
                                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
                                        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry7 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry7;
                                        if (getpostalcode.read == null) {
                                            SentryUUID.write();
                                            throw null;
                                        }
                                        getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                                        if (!getpostalcode.ComponentActivity) {
                                            getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                                        } else {
                                            int i16 = RemoteActionCompatParcelizer + 113;
                                            serializer = i16 % Fields.SpotShadowColor;
                                            if (i16 % 2 != 0) {
                                                getpostalcode.serializer(constructor);
                                                throw null;
                                            }
                                            getpostalcode.serializer(constructor);
                                        }
                                        c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                                        AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                                        r8lambdafbccdpyn0hhvaib8bd2sxm5rsds3 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds7;
                                        r8lambdafbccdpyn0hhvaib8bd2sxm5rsds3.invoke(decryptandgetpasswordbwljw6a, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getpostalcode, Integer.valueOf(((i4 >> 6) & 112) | 384));
                                        getpostalcode.IconCompatParcelizer(true);
                                        getpostalcode.IconCompatParcelizer(false);
                                        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry5 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry9;
                                    } else {
                                        r8lambdafbccdpyn0hhvaib8bd2sxm5rsds = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds10;
                                        r8lambdafbccdpyn0hhvaib8bd2sxm5rsds4 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds4;
                                        r8lambdafbccdpyn0hhvaib8bd2sxm5rsds5 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds5;
                                        it = it;
                                        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry7 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry7;
                                        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
                                        r8lambdafbccdpyn0hhvaib8bd2sxm5rsds3 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds7;
                                        if (decryptandgetpasswordbwljw6a instanceof AdjustInstanceExternalSyntheticLambda1) {
                                            getpostalcode.serializer(-1816136877);
                                            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry5 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry9;
                                            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry5.invoke(decryptandgetpasswordbwljw6a, getpostalcode, i2);
                                            getpostalcode.IconCompatParcelizer(false);
                                        } else {
                                            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry5 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry9;
                                            if (decryptandgetpasswordbwljw6a instanceof setHttpsURLConnectionProvider) {
                                                getpostalcode.serializer(-1816133806);
                                                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry10;
                                                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2.invoke(decryptandgetpasswordbwljw6a, getpostalcode, i2);
                                                getpostalcode.IconCompatParcelizer(false);
                                                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11;
                                            } else {
                                                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry10;
                                                if (decryptandgetpasswordbwljw6a instanceof onAnimation) {
                                                    getpostalcode.serializer(-1816130766);
                                                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11;
                                                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11.invoke(decryptandgetpasswordbwljw6a, getpostalcode, i2);
                                                    getpostalcode.IconCompatParcelizer(false);
                                                } else {
                                                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11;
                                                    if (decryptandgetpasswordbwljw6a instanceof saveInteger) {
                                                        getpostalcode.serializer(-1816127465);
                                                        r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds8;
                                                        r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2.invoke(decryptandgetpasswordbwljw6a, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getpostalcode, Integer.valueOf(((i4 >> 6) & 112) | 384));
                                                        getpostalcode.IconCompatParcelizer(false);
                                                    } else {
                                                        r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds8;
                                                        if (decryptandgetpasswordbwljw6a instanceof makeFlag) {
                                                            int i17 = RemoteActionCompatParcelizer + 13;
                                                            serializer = i17 % Fields.SpotShadowColor;
                                                            int i18 = i17 % 2;
                                                            getpostalcode.serializer(-1816123311);
                                                            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry12.invoke(decryptandgetpasswordbwljw6a, getpostalcode, i2);
                                                            getpostalcode.IconCompatParcelizer(false);
                                                        } else if (decryptandgetpasswordbwljw6a instanceof findChildView) {
                                                            getpostalcode.serializer(-1816120401);
                                                            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry13.invoke(decryptandgetpasswordbwljw6a, getpostalcode, i2);
                                                            getpostalcode.IconCompatParcelizer(false);
                                                        } else if (decryptandgetpasswordbwljw6a instanceof ChildHelper) {
                                                            getpostalcode.serializer(-1816117322);
                                                            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry14.invoke(decryptandgetpasswordbwljw6a, getpostalcode, i2);
                                                            getpostalcode.IconCompatParcelizer(false);
                                                        } else {
                                                            getpostalcode.serializer(-464997435);
                                                            getpostalcode.IconCompatParcelizer(false);
                                                        }
                                                    }
                                                }
                                            }
                                            r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds8;
                                        }
                                    }
                                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry10;
                                    r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds8;
                                }
                            }
                        }
                        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11;
                        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
                        r8lambdafbccdpyn0hhvaib8bd2sxm5rsds = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds6;
                        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry10;
                        r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds8;
                        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry8;
                        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry6;
                        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry5 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry9;
                        r8lambdafbccdpyn0hhvaib8bd2sxm5rsds3 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds7;
                    }
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11;
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
                    r8lambdafbccdpyn0hhvaib8bd2sxm5rsds = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds6;
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry10;
                    r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds8;
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry8;
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry6;
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry5 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry9;
                    r8lambdafbccdpyn0hhvaib8bd2sxm5rsds3 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds7;
                } else {
                    r8lambdafbccdpyn0hhvaib8bd2sxm5rsds4 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds4;
                    r8lambdafbccdpyn0hhvaib8bd2sxm5rsds5 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds5;
                    it = it;
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry7 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry7;
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11;
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde1;
                    r8lambdafbccdpyn0hhvaib8bd2sxm5rsds = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds6;
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry10;
                    r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds8;
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry8;
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry6;
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry5 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry9;
                    r8lambdafbccdpyn0hhvaib8bd2sxm5rsds3 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds7;
                    getpostalcode.serializer(-1816182805);
                    EmptyContentKt.EmptyContent(0, getpostalcode, null, ((setDivider) decryptandgetpasswordbwljw6a).write.write);
                    getpostalcode.IconCompatParcelizer(false);
                }
                r8lambdafbccdpyn0hhvaib8bd2sxm5rsds7 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds3;
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry9 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry5;
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11;
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry10 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
                r8lambdafbccdpyn0hhvaib8bd2sxm5rsds8 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds2;
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry8 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3;
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry6 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4;
                r8lambdafbccdpyn0hhvaib8bd2sxm5rsds4 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds4;
                r8lambdafbccdpyn0hhvaib8bd2sxm5rsds6 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds;
                r8lambdafbccdpyn0hhvaib8bd2sxm5rsds5 = r8lambdafbccdpyn0hhvaib8bd2sxm5rsds5;
                it = it;
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry7 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry7;
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
            }
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getPointerPrecisionfpxItnM((Object) invokegialus, (Object) setcountrylambda1, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, modifier2, i, 28);
            int i19 = serializer + 81;
            RemoteActionCompatParcelizer = i19 % Fields.SpotShadowColor;
            if (i19 % 2 == 0) {
                int i20 = 4 % 2;
            }
        }
    }
}
