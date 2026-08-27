package com.roadrunner.delivery.ontheway.deliverynotes.presentation.compose;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.GapComposerKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.sqlite.SQLite;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.ontheway.deliverynotes.api.DeliveryNotesLinkUiModel;
import com.roadrunner.delivery.ontheway.deliverynotes.presentation.DeliveryNotesLinkUiModelImpl;
import com.roadrunner.delivery.ontheway.navigation.presentation.compose.NavigationButtonKt$NavigationButton$2$1;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.actions.links.LinkKt;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidLocaleDelegateAPI24;
import o.AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.TextFieldDefaults;
import o.TextInputServiceAndroidonImeActionPerformed1;
import o.TextInputServiceAndroidstopInput2;
import o.buildMapping;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getHasCamera;
import o.getLifecycleRegistry;
import o.getNewPassword;
import o.getPostalCode;
import o.getQueryContext;
import o.invokeKlQnJC8;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.registerInAppMessageManagerlambda0;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DeliveryNotesLinkKt {
    private static int serializer = 1;
    private static int write;

    public static final void RemoteActionCompatParcelizer(TextInputServiceAndroidstopInput2 textInputServiceAndroidstopInput2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        boolean zIconCompatParcelizer;
        int i3;
        int i4 = 2 % 2;
        int i5 = write + 23;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(2046889190);
        if ((i & 6) == 0) {
            int i7 = serializer + 3;
            write = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0 ? (i & 8) == 0 : (i & 80) == 0) {
                zIconCompatParcelizer = getpostalcode.read(textInputServiceAndroidstopInput2);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(textInputServiceAndroidstopInput2);
            }
            if (zIconCompatParcelizer) {
                int i8 = serializer + 49;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i3 = 4;
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
            int i10 = serializer + 101;
            write = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                i2 |= getpostalcode.read(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
            } else {
                getpostalcode.read(modifier);
                throw null;
            }
        }
        if ((i2 & 147) != 146) {
            int i11 = serializer + 5;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            SurfaceKt.m126SurfaceT9BRK9s(SizeKt.write(modifier, 1.0f), null, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer(), 0L, 0.0f, 0.0f, null, ExtrasKt.write(-523070165, new GapComposerKt$$ExternalSyntheticLambda0(textInputServiceAndroidstopInput2, 23, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode), getpostalcode, 12582912, 122);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidLocaleDelegateAPI24(textInputServiceAndroidstopInput2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, i, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fa A[PHI: r0
  0x00fa: PHI (r0v21 o.TextInputServiceAndroidstopInput2) = (r0v20 o.TextInputServiceAndroidstopInput2), (r0v33 o.TextInputServiceAndroidstopInput2) binds: [B:55:0x00f8, B:52:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x00fd A[PHI: r0
  0x00fd: PHI (r0v31 o.TextInputServiceAndroidstopInput2) = (r0v20 o.TextInputServiceAndroidstopInput2), (r0v33 o.TextInputServiceAndroidstopInput2) binds: [B:55:0x00f8, B:52:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void DeliveryNotesLink(DeliveryNotesLinkUiModel deliveryNotesLinkUiModel, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        TextInputServiceAndroidstopInput2 textInputServiceAndroidstopInput2;
        TextInputServiceAndroidstopInput2 textInputServiceAndroidstopInput3;
        boolean z;
        Modifier.Companion companion;
        int i3;
        int i4 = 2 % 2;
        deliveryNotesLinkUiModel.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(2005048206);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(deliveryNotesLinkUiModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i5 = serializer + 47;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry)) {
                int i7 = serializer + 121;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2) ? 256 : Fields.SpotShadowColor;
        }
        int i9 = i2 | 3072;
        if (getpostalcode.write(i9 & 1, (i9 & 1171) != 1170)) {
            Modifier.Companion companion2 = Modifier.Companion;
            DeliveryNotesLinkUiModelImpl deliveryNotesLinkUiModelImpl = (DeliveryNotesLinkUiModelImpl) deliveryNotesLinkUiModel;
            getQueryContext getquerycontext = deliveryNotesLinkUiModelImpl.serializer;
            boolean z2 = (i9 & 896) == 256;
            boolean z3 = (i9 & 112) == 32;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (z3 || z2) {
                objComponentActivity = new getLifecycleRegistry(2, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry);
                getpostalcode.write(objComponentActivity);
            } else {
                int i10 = serializer + 35;
                write = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new getLifecycleRegistry(2, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry);
                    getpostalcode.write(objComponentActivity);
                }
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 8);
            TextInputServiceAndroidonImeActionPerformed1 textInputServiceAndroidonImeActionPerformed1 = (TextInputServiceAndroidonImeActionPerformed1) ExtrasKt.write(deliveryNotesLinkUiModelImpl.IconCompatParcelizer, getpostalcode, 0).getValue();
            if (textInputServiceAndroidonImeActionPerformed1 instanceof invokeKlQnJC8) {
                int i12 = write + 15;
                serializer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                getpostalcode.serializer(-1588963310);
                getpostalcode.IconCompatParcelizer(false);
                companion = companion2;
            } else {
                if (!(textInputServiceAndroidonImeActionPerformed1 instanceof TextInputServiceAndroidstopInput2)) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1588967053, false);
                }
                int i14 = serializer + 83;
                write = i14 % Fields.SpotShadowColor;
                if (i14 % 2 != 0) {
                    getpostalcode.serializer(-2013155020);
                    textInputServiceAndroidstopInput2 = (TextInputServiceAndroidstopInput2) textInputServiceAndroidonImeActionPerformed1;
                    if ((i9 & 55) == 2) {
                        textInputServiceAndroidstopInput3 = textInputServiceAndroidstopInput2;
                        z = true;
                    } else {
                        textInputServiceAndroidstopInput3 = textInputServiceAndroidstopInput2;
                        z = false;
                    }
                } else {
                    getpostalcode.serializer(-2013155020);
                    textInputServiceAndroidstopInput2 = (TextInputServiceAndroidstopInput2) textInputServiceAndroidonImeActionPerformed1;
                    if ((i9 & 14) == 4) {
                        textInputServiceAndroidstopInput3 = textInputServiceAndroidstopInput2;
                        z = true;
                    } else {
                        textInputServiceAndroidstopInput3 = textInputServiceAndroidstopInput2;
                        z = false;
                    }
                }
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (z || objComponentActivity2 == androidContentCaptureManager) {
                    NavigationButtonKt$NavigationButton$2$1 navigationButtonKt$NavigationButton$2$1 = new NavigationButtonKt$NavigationButton$2$1(0, deliveryNotesLinkUiModel, DeliveryNotesLinkUiModel.class, "onLinkClicked", "onLinkClicked()V", 0, 13);
                    getpostalcode.write(navigationButtonKt$NavigationButton$2$1);
                    int i15 = serializer + 123;
                    write = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    objComponentActivity2 = navigationButtonKt$NavigationButton$2$1;
                }
                companion = companion2;
                RemoteActionCompatParcelizer(textInputServiceAndroidstopInput3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity2), companion, getpostalcode, (i9 >> 3) & 896);
                getpostalcode.IconCompatParcelizer(false);
            }
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getHasCamera((Object) deliveryNotesLinkUiModel, (Object) r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, (Object) r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2, modifier2, i, 16);
        }
    }

    public static final void DeliveryNotesContent(TextInputServiceAndroidstopInput2 textInputServiceAndroidstopInput2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-837823112);
        if ((i & 6) == 0) {
            int i6 = write + 55;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if ((i & 8) == 0 ? getpostalcode.read(textInputServiceAndroidstopInput2) : getpostalcode.IconCompatParcelizer(textInputServiceAndroidstopInput2)) {
                int i8 = write + 45;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i10 = write + 39;
                serializer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i12 = i2 | 384;
        if ((i12 & 147) != 146) {
            int i13 = serializer + 125;
            write = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i12 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            float f = Dimensions.setMenu;
            Alignment.Companion companion2 = Alignment.Companion;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.serializer(f, companion2.getStart()), companion2.getTop(), getpostalcode, 48);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i15 = serializer + 87;
            write = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
                int i17 = serializer + 85;
                write = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_bold_large_file_new_note, getpostalcode, 0), "image description", null, null, ContentScale.Companion.getNone(), 0.0f, ColorFilter.Companion.m763tintxETnrds$default(ColorFilter.Companion, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0, 2, null), getpostalcode, Painter.$stable | 24624, 44);
            String str = textInputServiceAndroidstopInput2.serializer;
            if (str == null) {
                str = "";
            }
            boolean z2 = (i12 & 112) == 32;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (z2 || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new AndroidTextContextMenuToolbarProviderTextActionModeCallbackImpl(15, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode.write(objComponentActivity);
            }
            LinkKt.serializer(str, null, null, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 6);
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidLocaleDelegateAPI24(textInputServiceAndroidstopInput2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, i, 1);
            int i19 = write + 105;
            serializer = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
        }
    }
}
