package com.braze.ui;

import android.content.Context;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.Placeable;
import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.braze.BrazeUser;
import com.roadrunner.startworking.oneclick.OneClickStartWorkingViewModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import o.BlockRunner;
import o.BlurFilter;
import o.PopulateViewStructure_androidKtpopulate7;
import o.SemanticsOwner;
import o.SemanticsOwnerKt;
import o.createFromParcel;
import o.getLength;
import o.getPersonNamePrefix;
import o.getRootInfoui;
import o.getUnmergedRootSemanticsNode;
import o.handleUrlOverridelambda1;
import o.lambda318;
import o.obtainTint8_81llA;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class UserJavascriptInterfaceBase$$ExternalSyntheticLambda26 implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ boolean f$3;

    public /* synthetic */ UserJavascriptInterfaceBase$$ExternalSyntheticLambda26(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, boolean z, ImageBitmap imageBitmap, ColorFilter colorFilter) {
        this.$r8$classId = 2;
        this.f$0 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.f$3 = z;
        this.f$1 = imageBitmap;
        this.f$2 = colorFilter;
    }

    public /* synthetic */ UserJavascriptInterfaceBase$$ExternalSyntheticLambda26(Object obj, Serializable serializable, Object obj2, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = serializable;
        this.f$2 = obj2;
        this.f$3 = z;
    }

    public /* synthetic */ UserJavascriptInterfaceBase$$ExternalSyntheticLambda26(boolean z, Object obj, Object obj2, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, int i) {
        this.$r8$classId = i;
        this.f$3 = z;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = populateViewStructure_androidKtpopulate7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 41;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        boolean z = this.f$3;
        if (i4 == 0) {
            return UserJavascriptInterfaceBase.setCustomUserAttributeJSON$lambda$0((UserJavascriptInterfaceBase) obj4, (String) obj3, (String) obj2, z, (BrazeUser) obj);
        }
        int i5 = 1;
        if (i4 == 1) {
            ((Placeable.PlacementScope) obj).withMotionFrameOfReferencePlacement(new getLength((ArrayList) obj3, (List) obj2, z, i5));
            ((PopulateViewStructure_androidKtpopulate7) obj4).getValue();
            return createfromparcel;
        }
        if (i4 == 2) {
            ImageBitmap imageBitmap = (ImageBitmap) obj3;
            ColorFilter colorFilter = (ColorFilter) obj2;
            ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
            contentDrawScope.drawContent();
            if (((Boolean) ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4).invoke()).booleanValue()) {
                if (z) {
                    long jMo1303getCenterF1C5BW0 = contentDrawScope.mo1303getCenterF1C5BW0();
                    DrawContext drawContext = contentDrawScope.getDrawContext();
                    long jMo1225getSizeNHjbRc = drawContext.mo1225getSizeNHjbRc();
                    drawContext.getCanvas().save();
                    try {
                        drawContext.getTransform().mo1232scale0AR0LA0(-1.0f, 1.0f, jMo1303getCenterF1C5BW0);
                        DrawScope.m1288drawImagegbVJVH8$default(contentDrawScope, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
                    } finally {
                        c8$$ExternalSyntheticOutline0.m(drawContext, jMo1225getSizeNHjbRc);
                    }
                } else {
                    DrawScope.m1288drawImagegbVJVH8$default(contentDrawScope, imageBitmap, 0L, 0.0f, null, colorFilter, 0, 46, null);
                }
            }
            return createfromparcel;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                lambda318 lambda318Var = (lambda318) obj4;
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3;
                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) obj2;
                ((getPersonNamePrefix) obj).getClass();
                if (z) {
                    Boolean bool = Boolean.TRUE;
                    populateViewStructure_androidKtpopulate7.setValue(bool);
                    ((getRootInfoui) ((SemanticsOwner) lambda318Var.MediaDescriptionCompat.IconCompatParcelizer)).write("start_working_time_to_interactive");
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(bool);
                }
                return new BlockRunner(11);
            }
            OneClickStartWorkingViewModel oneClickStartWorkingViewModel = (OneClickStartWorkingViewModel) obj4;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3;
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8 = (PopulateViewStructure_androidKtpopulate7) obj2;
            ((getPersonNamePrefix) obj).getClass();
            if (!(!z)) {
                int i6 = read + 89;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                Boolean bool2 = Boolean.TRUE;
                populateViewStructure_androidKtpopulate8.setValue(bool2);
                ((getRootInfoui) ((SemanticsOwner) oneClickStartWorkingViewModel.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.IconCompatParcelizer)).write("start_working_time_to_interactive");
                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(bool2);
            }
            return new BlockRunner(12);
        }
        Context context = (Context) obj4;
        SemanticsOwnerKt semanticsOwnerKt = (SemanticsOwnerKt) obj3;
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate9 = (PopulateViewStructure_androidKtpopulate7) obj2;
        ((getPersonNamePrefix) obj).getClass();
        if (z) {
            Boolean bool3 = Boolean.TRUE;
            populateViewStructure_androidKtpopulate9.setValue(bool3);
            ModuleDSLKt.RemoteActionCompatParcelizer(context, bool3);
            if (context instanceof obtainTint8_81llA) {
                int iRemoteActionCompatParcelizer = handleUrlOverridelambda1.RemoteActionCompatParcelizer();
                ExtrasKt.read(662558831, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -662558827, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, new Object[]{(obtainTint8_81llA) context, bool3});
                int i8 = RemoteActionCompatParcelizer + 97;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
            }
            getUnmergedRootSemanticsNode getunmergedrootsemanticsnode = (getUnmergedRootSemanticsNode) semanticsOwnerKt;
            BlurFilter blurFilter = getunmergedrootsemanticsnode.write.ParcelableVolumeInfo;
            blurFilter.RemoteActionCompatParcelizer("app_start_to_interactive", "destinationScreen", "countrySelection");
            blurFilter.write("app_start_to_interactive");
            getRootInfoui getrootinfoui = (getRootInfoui) getunmergedrootsemanticsnode.IconCompatParcelizer.write;
            getrootinfoui.RemoteActionCompatParcelizer("app_start_to_interactive_sentry", "destinationScreen", "countrySelection");
            getrootinfoui.write("app_start_to_interactive_sentry");
        }
        return new BlockRunner(7);
    }
}
