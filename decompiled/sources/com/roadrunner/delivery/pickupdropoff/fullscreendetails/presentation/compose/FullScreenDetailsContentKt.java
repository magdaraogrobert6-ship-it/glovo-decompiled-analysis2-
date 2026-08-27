package com.roadrunner.delivery.pickupdropoff.fullscreendetails.presentation.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.compose.Measurer2;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.pickupdropoff.fullscreendetails.models.FullscreenDetailUi;
import com.roadrunner.delivery.pickupdropoff.fullscreendetails.presentation.compose.FullScreenDetailsContentKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rider.state.worksettings.presentation.SettingsInfoContentKt$SettingsInfoContent$$inlined$ConstraintLayout$5;
import io.sentry.SentryUUID;
import java.util.ArrayList;
import java.util.ListIterator;
import o.ActivityPackageSender1;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidPathIterator_androidKtWhenMappings;
import o.ComposeViewAdapterExternalSyntheticLambda6;
import o.ComposeViewAdapterFakeViewModelStoreOwner1;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DrawBackgroundModifier;
import o.DrawBehindElement;
import o.IActivityPackageSender;
import o.IActivityPackageSenderResponseDataCallbackSubscriber;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PagerWrapperFlingBehavior;
import o.PopulateViewStructure_androidKtpopulate7;
import o.accessgetInstancedelegatecp;
import o.buildMapping;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.hideCurrentlyDisplayingInAppMessage;
import o.performMeasureDjhGOtQ;
import o.r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FullScreenDetailsContentKt {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    public static final void write(r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1262965848);
        if ((i & 6) == 0) {
            i2 = (((i & 8) == 0 ? getpostalcode.read(r8lambdaiidsddyirtymdul5lt6pmt2zysq) : getpostalcode.IconCompatParcelizer(r8lambdaiidsddyirtymdul5lt6pmt2zysq)) ^ true ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            int i4 = RemoteActionCompatParcelizer + 53;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(r8lambdaiidsddyirtymdul5lt6pmt2zysq, 10));
            ListIterator<Object> listIterator = r8lambdaiidsddyirtymdul5lt6pmt2zysq.listIterator(0);
            while (listIterator.hasNext()) {
                int i5 = RemoteActionCompatParcelizer + 67;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                FullscreenDetailUi fullscreenDetailUi = (FullscreenDetailUi) listIterator.next();
                String str = fullscreenDetailUi.RemoteActionCompatParcelizer;
                String str2 = fullscreenDetailUi.read;
                if (str2 == null) {
                    z2 = true;
                } else if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2)) {
                    int i7 = RemoteActionCompatParcelizer + 73;
                    IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                ComposeViewAdapterExternalSyntheticLambda6.IconCompatParcelizer(str, !z2, str2, null, getpostalcode, 0, 8);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(Modifier.Companion, Dimensions.getAnimatedVisibility)});
                arrayList.add(createFromParcel.INSTANCE);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPathIterator_androidKtWhenMappings(r8lambdaiidsddyirtymdul5lt6pmt2zysq, i, 15);
            int i9 = IconCompatParcelizer + 123;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
    }

    public static final void RemoteActionCompatParcelizer(FullscreenDetailUi fullscreenDetailUi, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        int i5 = RemoteActionCompatParcelizer + 35;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1766010794);
        if ((i & 6) == 0) {
            if ((i & 8) == 0 ? getpostalcode.read(fullscreenDetailUi) : getpostalcode.IconCompatParcelizer(fullscreenDetailUi)) {
                int i7 = IconCompatParcelizer + 103;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                i3 = i7 % 2 == 0 ? 3 : 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            int i8 = RemoteActionCompatParcelizer + 61;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            z = false;
        }
        if (!getpostalcode.write(i2 & 1, z)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            String str = fullscreenDetailUi.RemoteActionCompatParcelizer;
            String str2 = fullscreenDetailUi.read;
            boolean z2 = str2 == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2);
            Modifier.Companion companion = Modifier.Companion;
            companion.getClass();
            ComposeViewAdapterExternalSyntheticLambda6.IconCompatParcelizer(str, !z2, str2, companion, getpostalcode, 3072, 0);
            String str3 = fullscreenDetailUi.write;
            if (str3 == null) {
                int i10 = IconCompatParcelizer + 11;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                getpostalcode.serializer(-2121405783);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-2121405782);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion, Dimensions.setTabContainer)});
                ComposeViewAdapterFakeViewModelStoreOwner1.serializer(432, getpostalcode, companion, null, str3);
                getpostalcode.IconCompatParcelizer(false);
            }
            String str4 = fullscreenDetailUi.IconCompatParcelizer;
            if (str4 == null) {
                int i12 = IconCompatParcelizer + 111;
                RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                getpostalcode.serializer(-2121108741);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-2121108740);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion, Dimensions.setTabContainer)});
                ComposeViewAdapterFakeViewModelStoreOwner1.serializer(384, getpostalcode, companion, Integer.valueOf(R.drawable.ic_bold_large_bag_single_order), str4);
                getpostalcode.IconCompatParcelizer(false);
            }
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPathIterator_androidKtWhenMappings(fullscreenDetailUi, i, 14);
        }
    }

    public static final void FullScreenDetailsContent(final r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        boolean z;
        final Modifier modifier2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        DrawBackgroundModifier drawBackgroundModifier;
        boolean zIconCompatParcelizer;
        int i3;
        int i4 = 2 % 2;
        r8lambdaiidsddyirtymdul5lt6pmt2zysq.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-894218482);
        if ((i & 6) == 0) {
            int i5 = RemoteActionCompatParcelizer + 125;
            int i6 = i5 % Fields.SpotShadowColor;
            IconCompatParcelizer = i6;
            if (i5 % 2 == 0 ? (i & 8) != 0 : (i & 3) != 0) {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(r8lambdaiidsddyirtymdul5lt6pmt2zysq);
            } else {
                int i7 = i6 + 115;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    getpostalcode.read(r8lambdaiidsddyirtymdul5lt6pmt2zysq);
                    throw null;
                }
                zIconCompatParcelizer = getpostalcode.read(r8lambdaiidsddyirtymdul5lt6pmt2zysq);
            }
            if (zIconCompatParcelizer) {
                int i8 = IconCompatParcelizer + 47;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                i3 = i8 % 2 == 0 ? 3 : 4;
            } else {
                i3 = 2;
            }
            i2 = i | i3;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
            int i9 = RemoteActionCompatParcelizer + 9;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        }
        int i11 = i2 | 384;
        if ((i11 & 147) != 146) {
            int i12 = IconCompatParcelizer + 55;
            RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i11 & 1, z)) {
            int i14 = RemoteActionCompatParcelizer + 47;
            IconCompatParcelizer = i14 % Fields.SpotShadowColor;
            if (i14 % 2 != 0) {
                Modifier.Companion companion = Modifier.Companion;
                r8lambdaiidsddyirtymdul5lt6pmt2zysq.isEmpty();
                throw null;
            }
            final Modifier.Companion companion2 = Modifier.Companion;
            if (r8lambdaiidsddyirtymdul5lt6pmt2zysq.isEmpty()) {
                Timber.RemoteActionCompatParcelizer.read("FullScreenDetailsContent items are empty.", new Object[0]);
                gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
                if (gethandleruiannotationsMediaDescriptionCompat != null) {
                    final int i15 = 0;
                    r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.ComposeViewAdapterFakeActivityResultRegistryOwner1
                        private static int MediaBrowserCompatMediaItem = 0;
                        private static int MediaDescriptionCompat = 1;

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj, Object obj2) {
                            int i16 = 2 % 2;
                            int i17 = MediaDescriptionCompat + 121;
                            MediaBrowserCompatMediaItem = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i18 = i17 % 2;
                            int i19 = i15;
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            int i20 = i;
                            androidx.compose.ui.Modifier modifier3 = companion2;
                            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
                            r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq2 = r8lambdaiidsddyirtymdul5lt6pmt2zysq;
                            getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                            ((Integer) obj2).getClass();
                            if (i19 == 0) {
                                FullScreenDetailsContentKt.FullScreenDetailsContent(r8lambdaiidsddyirtymdul5lt6pmt2zysq2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i20 | 1));
                                return createfromparcel;
                            }
                            FullScreenDetailsContentKt.FullScreenDetailsContent(r8lambdaiidsddyirtymdul5lt6pmt2zysq2, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i20 | 1));
                            int i21 = MediaBrowserCompatMediaItem + 121;
                            MediaDescriptionCompat = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i22 = i21 % 2;
                            return createfromparcel;
                        }
                    };
                    gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
                    return;
                }
                int i16 = RemoteActionCompatParcelizer + 75;
                IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
            }
            FillElement fillElement = SizeKt.read;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(companion2.then(fillElement), Color.Companion.m757getTransparent0d7_KjU(), RectangleShapeKt.getRectangleShape());
            modifierM20backgroundbw27NRU.getClass();
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
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
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Modifier modifierIconCompatParcelizer = PagerWrapperFlingBehavior.IconCompatParcelizer(BackgroundKt.m20backgroundbw27NRU(companion2.then(fillElement), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).write(), RectangleShapeKt.getRectangleShape()), PagerWrapperFlingBehavior.read(0, getpostalcode, 1), false, 14);
            getpostalcode.serializer(-1003410150);
            getpostalcode.serializer(212064437);
            getpostalcode.IconCompatParcelizer(false);
            Density density = (Density) getpostalcode.write((getNewPassword) CompositionLocalsKt.getLocalDensity());
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new Measurer2(density);
                getpostalcode.write(objComponentActivity);
            }
            Measurer2 measurer2 = (Measurer2) objComponentActivity;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new DrawBehindElement();
                getpostalcode.write(objComponentActivity2);
                int i18 = IconCompatParcelizer + 85;
                RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
            }
            DrawBehindElement drawBehindElement = (DrawBehindElement) objComponentActivity2;
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                getpostalcode.write(objComponentActivity3);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity3;
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new DrawBackgroundModifier(drawBehindElement);
                getpostalcode.write(objComponentActivity4);
            }
            DrawBackgroundModifier drawBackgroundModifier2 = (DrawBackgroundModifier) objComponentActivity4;
            Object objComponentActivity5 = getpostalcode.ComponentActivity();
            if (objComponentActivity5 == androidContentCaptureManager) {
                objComponentActivity5 = CompositionKt.serializer(createFromParcel.INSTANCE, AndroidContentCaptureManager.RemoteActionCompatParcelizer);
                getpostalcode.write(objComponentActivity5);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity5;
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(measurer2);
            boolean z2 = getpostalcode.read(257);
            Object objComponentActivity6 = getpostalcode.ComponentActivity();
            if ((zIconCompatParcelizer2 || z2) || objComponentActivity6 == androidContentCaptureManager) {
                drawBackgroundModifier = drawBackgroundModifier2;
                objComponentActivity6 = new ActivityPackageSender1(populateViewStructure_androidKtpopulate8, measurer2, drawBackgroundModifier, populateViewStructure_androidKtpopulate7, 6);
                getpostalcode.write(objComponentActivity6);
            } else {
                drawBackgroundModifier = drawBackgroundModifier2;
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objComponentActivity6;
            Object objComponentActivity7 = getpostalcode.ComponentActivity();
            if (objComponentActivity7 == androidContentCaptureManager) {
                objComponentActivity7 = new IActivityPackageSender(populateViewStructure_androidKtpopulate7, drawBackgroundModifier, 6);
                getpostalcode.write(objComponentActivity7);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity7;
            boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(measurer2);
            Object objComponentActivity8 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer3 || objComponentActivity8 == androidContentCaptureManager) {
                objComponentActivity8 = new IActivityPackageSenderResponseDataCallbackSubscriber(measurer2, 6);
                getpostalcode.write(objComponentActivity8);
            }
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierIconCompatParcelizer, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity8, 1, null), ExtrasKt.write(1200550679, new SettingsInfoContentKt$SettingsInfoContent$$inlined$ConstraintLayout$5(populateViewStructure_androidKtpopulate8, drawBehindElement, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaiidsddyirtymdul5lt6pmt2zysq), getpostalcode), measurePolicy, getpostalcode, 48, 0);
            getpostalcode.IconCompatParcelizer(false);
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion2;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            final int i20 = 1;
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.ComposeViewAdapterFakeActivityResultRegistryOwner1
                private static int MediaBrowserCompatMediaItem = 0;
                private static int MediaDescriptionCompat = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i110 = 2 % 2;
                    int i111 = MediaDescriptionCompat + 121;
                    MediaBrowserCompatMediaItem = i111 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i112 = i111 % 2;
                    int i113 = i20;
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i21 = i;
                    androidx.compose.ui.Modifier modifier3 = modifier2;
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
                    r8lambdaIIDSddYIrTyMDUl5lt6pmt2zYsQ r8lambdaiidsddyirtymdul5lt6pmt2zysq2 = r8lambdaiidsddyirtymdul5lt6pmt2zysq;
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                    ((Integer) obj2).getClass();
                    if (i113 == 0) {
                        FullScreenDetailsContentKt.FullScreenDetailsContent(r8lambdaiidsddyirtymdul5lt6pmt2zysq2, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, modifier3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i21 | 1));
                        return createfromparcel;
                    }
                    FullScreenDetailsContentKt.FullScreenDetailsContent(r8lambdaiidsddyirtymdul5lt6pmt2zysq2, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, modifier3, getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i21 | 1));
                    int i22 = MediaBrowserCompatMediaItem + 121;
                    MediaDescriptionCompat = i22 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i23 = i22 % 2;
                    return createfromparcel;
                }
            };
            gethandleruiannotationsMediaDescriptionCompat.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
            return;
        }
        int i110 = RemoteActionCompatParcelizer + 75;
        IconCompatParcelizer = i110 % Fields.SpotShadowColor;
        int i111 = i110 % 2;
    }
}
