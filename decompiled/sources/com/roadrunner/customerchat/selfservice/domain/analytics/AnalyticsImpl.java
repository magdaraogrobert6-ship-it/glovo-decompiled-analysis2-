package com.roadrunner.customerchat.selfservice.domain.analytics;

import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.roadrunner.customerchat.selfservice.data.remote.service.AnalyticsServiceResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.accessstartTrackingTable;
import o.addSpans;
import o.createFromParcel;
import o.fromHtml;
import o.getWidthXSAIIZE;
import o.handleAnnotationEnd;
import o.handleLiEnd;
import o.handleLiStart;
import o.handleUlEnd;
import o.startElement;
import o.toAnnotatedStringdefault;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class AnalyticsImpl {
    private static int read = 0;
    private static int serializer = 1;
    public final toAnnotatedStringdefault IconCompatParcelizer;
    public final ProtobufEncoder RemoteActionCompatParcelizer;

    public AnalyticsImpl(ProtobufEncoder protobufEncoder, toAnnotatedStringdefault toannotatedstringdefault) {
        protobufEncoder.getClass();
        toannotatedstringdefault.getClass();
        this.RemoteActionCompatParcelizer = protobufEncoder;
        this.IconCompatParcelizer = toannotatedstringdefault;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    public final Object track(getWidthXSAIIZE getwidthxsaiize, ContinuationImpl continuationImpl) {
        startElement startelement;
        int i = 2 % 2;
        int i2 = serializer + 109;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (!(continuationImpl instanceof startElement)) {
            startelement = new startElement(this, continuationImpl);
        } else {
            startelement = (startElement) continuationImpl;
            int i4 = startelement.read;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                startelement.read = i4 - Integer.MIN_VALUE;
            } else {
                startelement = new startElement(this, continuationImpl);
            }
        }
        Object objHandleApi = startelement.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = startelement.read;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i5 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objHandleApi);
            startelement.read = 1;
            ProtobufEncoder protobufEncoder = this.RemoteActionCompatParcelizer;
            protobufEncoder.getClass();
            objHandleApi = AnalyticsServiceResultKt.handleApi(new TooltipStateImpl.AnonymousClass2(protobufEncoder, getwidthxsaiize, shortNewsContentCardView, 10), startelement);
            if (objHandleApi == coroutineSingletons) {
                int i6 = serializer + 25;
                read = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    int i7 = 9 / 0;
                }
                return coroutineSingletons;
            }
        } else {
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i8 = serializer + 39;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objHandleApi);
            int i10 = serializer + 89;
            read = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                int i11 = 3 % 4;
            }
        }
        handleLiStart handlelistart = (handleLiStart) objHandleApi;
        if (handlelistart instanceof handleLiEnd) {
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Analytics tracking request successful", new Object[0]);
        } else {
            boolean z = handlelistart instanceof handleAnnotationEnd;
            toAnnotatedStringdefault toannotatedstringdefault = this.IconCompatParcelizer;
            if (z) {
                ((addSpans) toannotatedstringdefault).serializer(fromHtml.ERROR, "AnalyticsImpl", "Analytics tracking request failed.", new accessstartTrackingTable(5));
            } else {
                if (!(handlelistart instanceof handleUlEnd)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                int i12 = serializer + 99;
                read = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                handleUlEnd handleulend = (handleUlEnd) handlelistart;
                handleulend.IconCompatParcelizer().printStackTrace();
                ((addSpans) toannotatedstringdefault).serializer(fromHtml.ERROR, "AnalyticsImpl", "An exception was thrown while analytics.", handleulend.IconCompatParcelizer());
            }
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i14 = read + 77;
        serializer = i14 % Fields.SpotShadowColor;
        int i15 = i14 % 2;
        return createfromparcel;
    }
}
