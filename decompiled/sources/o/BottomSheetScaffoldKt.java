package o;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BottomSheetScaffoldKt implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ cancelPendingWebViewPauselambda0 RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ float write;

    public /* synthetic */ BottomSheetScaffoldKt(float f, cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda0, Object obj, Object obj2, int i) {
        this.IconCompatParcelizer = i;
        this.write = f;
        this.RemoteActionCompatParcelizer = cancelpendingwebviewpauselambda0;
        this.read = obj;
        this.serializer = obj2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.serializer;
        Object obj3 = this.read;
        cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda0 = this.RemoteActionCompatParcelizer;
        float f = this.write;
        if (i == 0) {
            PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl = (PlatformSelectionBehaviorsImpl) obj3;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2;
            TransformGestureDetectorKt transformGestureDetectorKt = (TransformGestureDetectorKt) obj;
            float fAbs = Math.abs(((Number) ((onShowTranslationui) transformGestureDetectorKt.MediaBrowserCompatMediaItem).getValue()).floatValue());
            float fAbs2 = Math.abs(f);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = transformGestureDetectorKt.MediaBrowserCompatMediaItem;
            if (fAbs >= fAbs2) {
                float fRemoteActionCompatParcelizer = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.RemoteActionCompatParcelizer(((Number) ((onShowTranslationui) populateViewStructure_androidKtpopulate7).getValue()).floatValue(), f);
                androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.write(transformGestureDetectorKt, platformSelectionBehaviorsImpl, r8lambdaunavo3sxub_pc9xroryotnrlvsm, fRemoteActionCompatParcelizer - cancelpendingwebviewpauselambda0.write);
                transformGestureDetectorKt.write();
                cancelpendingwebviewpauselambda0.write = fRemoteActionCompatParcelizer;
            } else {
                onShowTranslationui onshowtranslationui = (onShowTranslationui) populateViewStructure_androidKtpopulate7;
                androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.write(transformGestureDetectorKt, platformSelectionBehaviorsImpl, r8lambdaunavo3sxub_pc9xroryotnrlvsm, ((Number) onshowtranslationui.getValue()).floatValue() - cancelpendingwebviewpauselambda0.write);
                cancelpendingwebviewpauselambda0.write = ((Number) onshowtranslationui.getValue()).floatValue();
            }
            return createfromparcel;
        }
        float f2 = 0.0f;
        if (i == 1) {
            PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl2 = (PlatformSelectionBehaviorsImpl) obj3;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj2;
            TransformGestureDetectorKt transformGestureDetectorKt2 = (TransformGestureDetectorKt) obj;
            float fRemoteActionCompatParcelizer2 = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.RemoteActionCompatParcelizer(((Number) ((onShowTranslationui) transformGestureDetectorKt2.MediaBrowserCompatMediaItem).getValue()).floatValue(), f);
            float f3 = fRemoteActionCompatParcelizer2 - cancelpendingwebviewpauselambda0.write;
            try {
                f2 = platformSelectionBehaviorsImpl2.read(f3);
            } catch (CancellationException unused) {
                transformGestureDetectorKt2.write();
            }
            r8lambdaunavo3sxub_pc9xroryotnrlvsm2.invoke(Float.valueOf(f2));
            if (Math.abs(f3 - f2) > 0.5f || fRemoteActionCompatParcelizer2 != ((Number) ((onShowTranslationui) transformGestureDetectorKt2.MediaBrowserCompatMediaItem).getValue()).floatValue()) {
                transformGestureDetectorKt2.write();
            }
            cancelpendingwebviewpauselambda0.write += f2;
            return createfromparcel;
        }
        HeightInLinesNode heightInLinesNode = (HeightInLinesNode) obj3;
        cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda1 = (cancelPendingWebViewPauselambda0) obj2;
        TransformGestureDetectorKt transformGestureDetectorKt3 = (TransformGestureDetectorKt) obj;
        onShowTranslationui onshowtranslationui2 = (onShowTranslationui) transformGestureDetectorKt3.MediaBrowserCompatMediaItem;
        if ((((Number) onshowtranslationui2.getValue()).floatValue() >= f || cancelpendingwebviewpauselambda0.write <= f) && (((Number) onshowtranslationui2.getValue()).floatValue() <= f || cancelpendingwebviewpauselambda0.write >= f)) {
            heightInLinesNode.read(((Number) onshowtranslationui2.getValue()).floatValue(), ((Number) transformGestureDetectorKt3.MediaMetadataCompat()).floatValue());
            cancelpendingwebviewpauselambda1.write = ((Number) transformGestureDetectorKt3.MediaMetadataCompat()).floatValue();
            cancelpendingwebviewpauselambda0.write = ((Number) onshowtranslationui2.getValue()).floatValue();
        } else {
            float fFloatValue = ((Number) onshowtranslationui2.getValue()).floatValue();
            accessisRelatedToAutoCommit accessisrelatedtoautocommit = androidx.compose.foundation.gestures.AnchoredDraggableKt.serializer;
            if (f == 0.0f) {
                f = 0.0f;
            } else if (f <= 0.0f ? fFloatValue >= f : fFloatValue <= f) {
                f = fFloatValue;
            }
            heightInLinesNode.read(f, ((Number) transformGestureDetectorKt3.MediaMetadataCompat()).floatValue());
            cancelpendingwebviewpauselambda1.write = Float.isNaN(((Number) transformGestureDetectorKt3.MediaMetadataCompat()).floatValue()) ? 0.0f : ((Number) transformGestureDetectorKt3.MediaMetadataCompat()).floatValue();
            cancelpendingwebviewpauselambda0.write = f;
            transformGestureDetectorKt3.write();
        }
        return createfromparcel;
    }
}
