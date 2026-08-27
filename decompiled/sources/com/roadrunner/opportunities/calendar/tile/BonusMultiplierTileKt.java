package com.roadrunner.opportunities.calendar.tile;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.compose.Measurer2;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.opportunities.multiplier.BonusMultiplierRowKt;
import io.sentry.SentryUUID;
import o.ActivityPackageSender1;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DrawBackgroundModifier;
import o.DrawBehindElement;
import o.IActivityPackageSender;
import o.IActivityPackageSenderResponseDataCallbackSubscriber;
import o.PopulateViewStructure_androidKtpopulate7;
import o.buildMapping;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.uf;
import o.v6ExternalSyntheticLambda7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BonusMultiplierTileKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;

    public static final void BonusMultiplierTile(v6ExternalSyntheticLambda7 v6externalsyntheticlambda7, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifierM20backgroundbw27NRU;
        int i3;
        int i4 = 2 % 2;
        v6externalsyntheticlambda7.getClass();
        long j = v6externalsyntheticlambda7.MediaDescriptionCompat;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(385211098);
        if ((i & 6) == 0) {
            int i5 = serializer + 73;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if ((i & 8) == 0 ? getpostalcode.read(v6externalsyntheticlambda7) : getpostalcode.IconCompatParcelizer(v6externalsyntheticlambda7)) {
                int i7 = RemoteActionCompatParcelizer + 83;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(modifier) ? 32 : 16;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 19) != 18)) {
            int i9 = RemoteActionCompatParcelizer + 47;
            serializer = i9 % Fields.SpotShadowColor;
            Object obj = null;
            if (i9 % 2 != 0) {
                boolean z = v6externalsyntheticlambda7.serializer;
                obj.hashCode();
                throw null;
            }
            if (v6externalsyntheticlambda7.serializer) {
                getpostalcode.serializer(-328608547);
                Modifier.Companion companion = Modifier.Companion;
                float f = Dimensions.write;
                modifierM20backgroundbw27NRU = BorderKt.write(BackgroundKt.m20backgroundbw27NRU(companion, j, RoundedCornerShapeKt.IconCompatParcelizer(f)), f, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).read(), RoundedCornerShapeKt.IconCompatParcelizer(f));
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-328282334);
                getpostalcode.IconCompatParcelizer(false);
                modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(Modifier.Companion, j, RectangleShapeKt.getRectangleShape());
            }
            Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(modifier.then(modifierM20backgroundbw27NRU), Dimensions.setSplitBackground, Dimensions.setStackedBackground);
            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getCenterStart(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
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
            af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            BonusMultiplierRowKt.m4995MultiplierIndicatorT042LqI(v6externalsyntheticlambda7.read, v6externalsyntheticlambda7.write, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer(), null, true, getpostalcode, 24576);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new uf(v6externalsyntheticlambda7, modifier, i, 1);
            int i10 = RemoteActionCompatParcelizer + 57;
            serializer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    public static final void RemoteActionCompatParcelizer(v6ExternalSyntheticLambda7 v6externalsyntheticlambda7, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        boolean zIconCompatParcelizer;
        int i4;
        int i5 = 2 % 2;
        v6externalsyntheticlambda7.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-636845259);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode.read(v6externalsyntheticlambda7);
                int i6 = serializer + 47;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(v6externalsyntheticlambda7);
            }
            if (!zIconCompatParcelizer) {
                i4 = 2;
            } else {
                int i8 = serializer + 93;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i4 = 4;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= !(getpostalcode.read(modifier) ^ true) ? 32 : 16;
        }
        if ((i2 & 19) != 18) {
            int i10 = RemoteActionCompatParcelizer + 109;
            serializer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
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
            }
            DrawBehindElement drawBehindElement = (DrawBehindElement) objComponentActivity2;
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (objComponentActivity3 == androidContentCaptureManager) {
                int i11 = RemoteActionCompatParcelizer + 115;
                serializer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                objComponentActivity3 = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                getpostalcode.write(objComponentActivity3);
                int i13 = serializer + 39;
                RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity3;
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new DrawBackgroundModifier(drawBehindElement);
                getpostalcode.write(objComponentActivity4);
            }
            DrawBackgroundModifier drawBackgroundModifier = (DrawBackgroundModifier) objComponentActivity4;
            Object objComponentActivity5 = getpostalcode.ComponentActivity();
            if (objComponentActivity5 == androidContentCaptureManager) {
                objComponentActivity5 = CompositionKt.serializer(createFromParcel.INSTANCE, AndroidContentCaptureManager.RemoteActionCompatParcelizer);
                getpostalcode.write(objComponentActivity5);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity5;
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(measurer2);
            boolean z2 = getpostalcode.read(257);
            Object objComponentActivity6 = getpostalcode.ComponentActivity();
            if ((zIconCompatParcelizer2 | z2) || objComponentActivity6 == androidContentCaptureManager) {
                objComponentActivity6 = new ActivityPackageSender1(populateViewStructure_androidKtpopulate8, measurer2, drawBackgroundModifier, populateViewStructure_androidKtpopulate7, 8);
                getpostalcode.write(objComponentActivity6);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objComponentActivity6;
            Object objComponentActivity7 = getpostalcode.ComponentActivity();
            if (objComponentActivity7 == androidContentCaptureManager) {
                objComponentActivity7 = new IActivityPackageSender(populateViewStructure_androidKtpopulate7, drawBackgroundModifier, 8);
                getpostalcode.write(objComponentActivity7);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity7;
            boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(measurer2);
            Object objComponentActivity8 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer3 || objComponentActivity8 == androidContentCaptureManager) {
                objComponentActivity8 = new IActivityPackageSenderResponseDataCallbackSubscriber(measurer2, 8);
                getpostalcode.write(objComponentActivity8);
            }
            i3 = 0;
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierWrite, false, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity8, 1, null), ExtrasKt.write(1200550679, new BonusMultiplierTileKt$BonusMultiplierWithTime$$inlined$ConstraintLayout$5(populateViewStructure_androidKtpopulate8, drawBehindElement, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, v6externalsyntheticlambda7, 0), getpostalcode), measurePolicy, getpostalcode, 48, 0);
            getpostalcode.IconCompatParcelizer(false);
        } else {
            i3 = 0;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new uf(v6externalsyntheticlambda7, modifier, i, i3);
        }
    }
}
