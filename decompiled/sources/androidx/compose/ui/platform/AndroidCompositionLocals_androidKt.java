package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.res.ImageVectorCache;
import androidx.compose.ui.res.ResourceIdCache;
import kotlin.KotlinNothingValueException;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.getCreditCardNumber;
import o.getPersonFullName;
import o.getPhoneNumber;
import o.getUnspecified0d7_KjU;
import o.onItemDismisslambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setCurrentSemanticsNodesui;
import o.setInternalPaintui_graphics;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {
    private static final ProvidableCompositionLocal LocalConfiguration = new getPhoneNumber(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalConfiguration$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final Configuration invoke() {
            AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalConfiguration");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal LocalContext = new setCurrentSemanticsNodesui(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalContext$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final Context invoke() {
            AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalContext");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal LocalResources = new getPhoneNumber(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalResources$1
        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Resources invoke(getCreditCardNumber getcreditcardnumber) {
            ProvidableCompositionLocal localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1 = (DragAndDropNodestartDragAndDropTransfer1) getcreditcardnumber;
            dragAndDropNodestartDragAndDropTransfer1.getClass();
            getPersonFullName.write(dragAndDropNodestartDragAndDropTransfer1, localConfiguration);
            return ((Context) getPersonFullName.write(dragAndDropNodestartDragAndDropTransfer1, AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        }
    });
    private static final ProvidableCompositionLocal LocalImageVectorCache = new setCurrentSemanticsNodesui(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalImageVectorCache$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final ImageVectorCache invoke() {
            AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalImageVectorCache");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal LocalResourceIdCache = new setCurrentSemanticsNodesui(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalResourceIdCache$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final ResourceIdCache invoke() {
            AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalResourceIdCache");
            throw new KotlinNothingValueException();
        }
    });
    private static final ProvidableCompositionLocal LocalView = new setCurrentSemanticsNodesui(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$LocalView$1
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final View invoke() {
            AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalView");
            throw new KotlinNothingValueException();
        }
    });

    public static final ProvidableCompositionLocal getLocalConfiguration() {
        return LocalConfiguration;
    }

    public static final ProvidableCompositionLocal getLocalContext() {
        return LocalContext;
    }

    public static final ProvidableCompositionLocal getLocalImageVectorCache() {
        return LocalImageVectorCache;
    }

    public static final ProvidableCompositionLocal getLocalLifecycleOwner() {
        return setInternalPaintui_graphics.write;
    }

    @onItemDismisslambda0
    public static /* synthetic */ void getLocalLifecycleOwner$annotations() {
    }

    public static final ProvidableCompositionLocal getLocalResourceIdCache() {
        return LocalResourceIdCache;
    }

    public static final ProvidableCompositionLocal getLocalResources() {
        return LocalResources;
    }

    public static final ProvidableCompositionLocal getLocalSavedStateRegistryOwner() {
        return getUnspecified0d7_KjU.IconCompatParcelizer;
    }

    @onItemDismisslambda0
    public static /* synthetic */ void getLocalSavedStateRegistryOwner$annotations() {
    }

    public static final ProvidableCompositionLocal getLocalView() {
        return LocalView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void noLocalProvidedFor(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
