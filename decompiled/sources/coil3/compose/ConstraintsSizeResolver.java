package coil3.compose;

import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.grpc.LoadBalancer$Helper;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.ShadowCompanion;
import o.ShortNewsContentCardView;
import o.SimpleGraphicsLayerModifierlayerBlock1;
import o.accessgetEvenOddcp;
import o.accessgetLayerBlockp;
import o.copyqcb84PM;
import o.copyqcb84PMdefault;
import o.cornerPathEffect;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.pauseWebviewIfNecessarylambda10;

/* JADX INFO: loaded from: classes.dex */
public final class ConstraintsSizeResolver implements SimpleGraphicsLayerModifierlayerBlock1, LayoutModifier {
    public long RemoteActionCompatParcelizer;
    public ArrayList write;

    public final void read(long j) {
        this.RemoteActionCompatParcelizer = j;
        if (Constraints.m3630isZeroimpl(j)) {
            return;
        }
        ArrayList arrayList = this.write;
        if (arrayList.isEmpty()) {
            return;
        }
        this.write = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ShortNewsContentCardView) it.next()).resumeWith(createFromParcel.INSTANCE);
        }
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo2235measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        read(j);
        Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(j);
        return MeasureScope.layout$default(measureScope, placeableMo2209measureBRTryo0.getWidth(), placeableMo2209measureBRTryo0.getHeight(), null, new accessgetEvenOddcp(placeableMo2209measureBRTryo0, 0), 4, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.SimpleGraphicsLayerModifierlayerBlock1
    public final Object size(ShortNewsContentCardView shortNewsContentCardView) throws Throwable {
        cornerPathEffect cornerpatheffect;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber;
        Throwable th;
        copyqcb84PMdefault shadowCompanion;
        if (shortNewsContentCardView instanceof cornerPathEffect) {
            cornerpatheffect = (cornerPathEffect) shortNewsContentCardView;
            int i = cornerpatheffect.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                cornerpatheffect.serializer = i - Integer.MIN_VALUE;
            } else {
                cornerpatheffect = new cornerPathEffect(this, (ContinuationImpl) shortNewsContentCardView);
            }
        } else {
            cornerpatheffect = new cornerPathEffect(this, (ContinuationImpl) shortNewsContentCardView);
        }
        Object obj = cornerpatheffect.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cornerpatheffect.serializer;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (Constraints.m3630isZeroimpl(this.RemoteActionCompatParcelizer)) {
                createInAppMessageEventSubscriber createinappmessageeventsubscriber2 = new createInAppMessageEventSubscriber();
                try {
                    cornerpatheffect.write = createinappmessageeventsubscriber2;
                    cornerpatheffect.serializer = 1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(cornerpatheffect));
                    cancellableContinuationImpl.read();
                    createinappmessageeventsubscriber2.IconCompatParcelizer = cancellableContinuationImpl;
                    this.write.add(cancellableContinuationImpl);
                    if (cancellableContinuationImpl.getResult() == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    createinappmessageeventsubscriber = createinappmessageeventsubscriber2;
                    pauseWebviewIfNecessarylambda10.RemoteActionCompatParcelizer(this.write).remove(createinappmessageeventsubscriber.IconCompatParcelizer);
                } catch (Throwable th2) {
                    createinappmessageeventsubscriber = createinappmessageeventsubscriber2;
                    th = th2;
                    pauseWebviewIfNecessarylambda10.RemoteActionCompatParcelizer(this.write).remove(createinappmessageeventsubscriber.IconCompatParcelizer);
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            createinappmessageeventsubscriber = cornerpatheffect.write;
            try {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                pauseWebviewIfNecessarylambda10.RemoteActionCompatParcelizer(this.write).remove(createinappmessageeventsubscriber.IconCompatParcelizer);
            } catch (Throwable th3) {
                th = th3;
                pauseWebviewIfNecessarylambda10.RemoteActionCompatParcelizer(this.write).remove(createinappmessageeventsubscriber.IconCompatParcelizer);
                throw th;
            }
        }
        long j = this.RemoteActionCompatParcelizer;
        int iM3626getMaxWidthimpl = Constraints.m3626getMaxWidthimpl(j);
        copyqcb84PMdefault shadowCompanion2 = copyqcb84PM.RemoteActionCompatParcelizer;
        if (iM3626getMaxWidthimpl != Integer.MAX_VALUE) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.read(iM3626getMaxWidthimpl);
            shadowCompanion = new ShadowCompanion(iM3626getMaxWidthimpl);
        } else {
            shadowCompanion = shadowCompanion2;
        }
        int iM3625getMaxHeightimpl = Constraints.m3625getMaxHeightimpl(j);
        if (iM3625getMaxHeightimpl != Integer.MAX_VALUE) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.read(iM3625getMaxHeightimpl);
            shadowCompanion2 = new ShadowCompanion(iM3625getMaxHeightimpl);
        }
        return new accessgetLayerBlockp(shadowCompanion, shadowCompanion2);
    }
}
