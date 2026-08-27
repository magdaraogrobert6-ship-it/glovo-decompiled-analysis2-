package o;

import androidx.navigation.compose.NavHostKt$NavHost$29$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class isBoring implements FlowCollector {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ BoringLayoutFactory33ExternalSyntheticApiModelOutline0 IconCompatParcelizer;
    public final /* synthetic */ int write;

    public /* synthetic */ isBoring(BoringLayoutFactory33ExternalSyntheticApiModelOutline0 boringLayoutFactory33ExternalSyntheticApiModelOutline0, int i) {
        this.write = i;
        this.IconCompatParcelizer = boringLayoutFactory33ExternalSyntheticApiModelOutline0;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        BoringLayoutFactory33ExternalSyntheticApiModelOutline0 boringLayoutFactory33ExternalSyntheticApiModelOutline0 = this.IconCompatParcelizer;
        if (i2 != 0) {
            getOptimizationLevel getoptimizationlevel = (getOptimizationLevel) obj;
            if (getoptimizationlevel instanceof onViewAdded) {
                BoringLayoutFactory33ExternalSyntheticApiModelOutline0.RemoteActionCompatParcelizer(boringLayoutFactory33ExternalSyntheticApiModelOutline0, true);
                return createfromparcel;
            }
            if (getoptimizationlevel instanceof getSceneString) {
                int i3 = serializer + 23;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                BoringLayoutFactory33ExternalSyntheticApiModelOutline0.RemoteActionCompatParcelizer(boringLayoutFactory33ExternalSyntheticApiModelOutline0, false);
                boringLayoutFactory33ExternalSyntheticApiModelOutline0.IconCompatParcelizer();
                return createfromparcel;
            }
            if (!(getoptimizationlevel instanceof getMaxWidth)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            BoringLayoutFactory33ExternalSyntheticApiModelOutline0.RemoteActionCompatParcelizer(boringLayoutFactory33ExternalSyntheticApiModelOutline0, false);
            boringLayoutFactory33ExternalSyntheticApiModelOutline0.MediaSessionCompatQueueItem.serializer(CanvasCompatM.serializer);
            return createfromparcel;
        }
        VerbatimTtsAnnotation verbatimTtsAnnotation = (VerbatimTtsAnnotation) obj;
        BrazeLogger brazeLogger = boringLayoutFactory33ExternalSyntheticApiModelOutline0.MediaSessionCompatToken;
        com.huawei.wisesecurity.ucs_credential.g0 g0Var = boringLayoutFactory33ExternalSyntheticApiModelOutline0.MediaMetadataCompat;
        if (verbatimTtsAnnotation == null) {
            int i5 = RemoteActionCompatParcelizer + 25;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            boringLayoutFactory33ExternalSyntheticApiModelOutline0.IconCompatParcelizer();
        } else if (verbatimTtsAnnotation instanceof TtsAnnotation) {
            int i7 = serializer + 103;
            RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            g0Var.getClass();
            TextStyleKt textStyleKtIconCompatParcelizer = com.huawei.wisesecurity.ucs_credential.g0.IconCompatParcelizer(verbatimTtsAnnotation);
            brazeLogger.getClass();
            TtsAnnotation ttsAnnotation = (TtsAnnotation) verbatimTtsAnnotation;
            brazeLogger.IconCompatParcelizer.RemoteActionCompatParcelizer(clipOutRect.IconCompatParcelizer((clipOutRect) brazeLogger.write(), ttsAnnotation.IconCompatParcelizer(), ttsAnnotation.write(), textStyleKtIconCompatParcelizer, null, 8));
            if (((clipOutRect) brazeLogger.write()).IconCompatParcelizer == null) {
                BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(boringLayoutFactory33ExternalSyntheticApiModelOutline0), null, null, new NavHostKt$NavHost$29$1(ttsAnnotation, boringLayoutFactory33ExternalSyntheticApiModelOutline0, null, 20), 3);
            }
        } else if (!(verbatimTtsAnnotation instanceof r8lambda8Qf6Vtl1pxlFHiMZeMUbAdi_ww)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            createfromparcel = null;
        } else {
            brazeLogger.getClass();
            AndroidGraphicsContext2 androidGraphicsContext2 = brazeLogger.IconCompatParcelizer;
            clipOutRect clipoutrect = (clipOutRect) brazeLogger.write();
            g0Var.getClass();
            TextStyleKt textStyleKtIconCompatParcelizer2 = com.huawei.wisesecurity.ucs_credential.g0.IconCompatParcelizer(verbatimTtsAnnotation);
            r8lambda8Qf6Vtl1pxlFHiMZeMUbAdi_ww r8lambda8qf6vtl1pxlfhimzemubadi_ww = (r8lambda8Qf6Vtl1pxlFHiMZeMUbAdi_ww) verbatimTtsAnnotation;
            androidGraphicsContext2.RemoteActionCompatParcelizer(clipOutRect.IconCompatParcelizer(clipoutrect, r8lambda8qf6vtl1pxlfhimzemubadi_ww.IconCompatParcelizer(), r8lambda8qf6vtl1pxlfhimzemubadi_ww.write(), textStyleKtIconCompatParcelizer2, null, 8));
        }
        int i9 = serializer + 83;
        RemoteActionCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return createfromparcel;
    }
}
