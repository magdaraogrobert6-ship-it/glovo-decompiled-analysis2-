package com.deliveryhero.selfServiceChat.ui;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.ShortNewsContentCardView;
import o.VectorPropertyPivotX;
import o.VectorPropertyScaleX;
import o.VectorPropertyStrokeAlpha;
import o.asComposePaint;
import o.createFromParcel;
import o.createVectorPainterFromImageVector;
import o.getConfig;
import o.getY2;
import o.mirror;
import o.obtainViewportSizePq9zytI;
import o.onViewAttachedToWindowlambda0;
import o.rememberVectorPainter;
import o.rememberVectorPaintermlNsNFs;
import o.rememberVectorPaintervIP8VLU;
import o.toBitmapConfig1JJdX4A;

/* JADX INFO: loaded from: classes2.dex */
public final class WebChatViewmodel$observeBridgeMessage$2 implements FlowCollector {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ WebChatViewmodel write;

    public /* synthetic */ WebChatViewmodel$observeBridgeMessage$2(WebChatViewmodel webChatViewmodel, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.write = webChatViewmodel;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public Object emit(onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0, ShortNewsContentCardView shortNewsContentCardView) {
        VectorPropertyStrokeAlpha vectorPropertyStrokeAlpha;
        Object obj;
        Object obj2;
        WebChatViewmodel$observeBridgeMessage$2 webChatViewmodel$observeBridgeMessage$2;
        Object obj3;
        Object obj4;
        Object obj5;
        WebChatViewmodel webChatViewmodel = this.write;
        MutableStateFlow mutableStateFlow = webChatViewmodel.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        if (shortNewsContentCardView instanceof VectorPropertyStrokeAlpha) {
            vectorPropertyStrokeAlpha = (VectorPropertyStrokeAlpha) shortNewsContentCardView;
            int i = vectorPropertyStrokeAlpha.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                vectorPropertyStrokeAlpha.IconCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                vectorPropertyStrokeAlpha = new VectorPropertyStrokeAlpha(this, shortNewsContentCardView);
            }
        } else {
            vectorPropertyStrokeAlpha = new VectorPropertyStrokeAlpha(this, shortNewsContentCardView);
        }
        Object obj6 = vectorPropertyStrokeAlpha.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = vectorPropertyStrokeAlpha.IconCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView2 = null;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj6);
            boolean zBooleanValue = ((Boolean) onviewattachedtowindowlambda0.serializer).booleanValue();
            createVectorPainterFromImageVector createvectorpainterfromimagevector = (createVectorPainterFromImageVector) onviewattachedtowindowlambda0.write;
            if (createvectorpainterfromimagevector instanceof obtainViewportSizePq9zytI) {
                do {
                    obj4 = mutableStateFlow.read();
                } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj4, VectorPropertyScaleX.serializer((VectorPropertyScaleX) obj4, null, false, zBooleanValue, null, false, 27)));
            } else if (createvectorpainterfromimagevector instanceof mirror) {
                do {
                    obj3 = mutableStateFlow.read();
                } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj3, VectorPropertyScaleX.serializer((VectorPropertyScaleX) obj3, null, true, zBooleanValue, null, false, 17)));
                asComposePaint ascomposepaintIconCompatParcelizer = toBitmapConfig1JJdX4A.IconCompatParcelizer(webChatViewmodel);
                BuildersKt.RemoteActionCompatParcelizer(ascomposepaintIconCompatParcelizer, new getConfig(ascomposepaintIconCompatParcelizer, webChatViewmodel, 2), null, new WebChatViewmodel$startTimerForTimeout$1$1(shortNewsContentCardView2, webChatViewmodel, 8), 2);
            } else if (createvectorpainterfromimagevector instanceof rememberVectorPaintervIP8VLU) {
                if (webChatViewmodel.RemoteActionCompatParcelizer()) {
                    vectorPropertyStrokeAlpha.serializer = this;
                    vectorPropertyStrokeAlpha.IconCompatParcelizer = 1;
                    if (webChatViewmodel.sendHostEncounteredErrorMessage("Handshaking for bridge connection timed out", vectorPropertyStrokeAlpha) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                webChatViewmodel$observeBridgeMessage$2 = this;
            } else if (createvectorpainterfromimagevector instanceof rememberVectorPainter) {
                do {
                    obj2 = mutableStateFlow.read();
                } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, VectorPropertyScaleX.serializer((VectorPropertyScaleX) obj2, null, false, false, VectorPropertyPivotX.serializer, false, 16)));
            } else if (createvectorpainterfromimagevector instanceof rememberVectorPaintermlNsNFs) {
                do {
                    obj = mutableStateFlow.read();
                } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj, VectorPropertyScaleX.serializer((VectorPropertyScaleX) obj, null, false, zBooleanValue, null, false, 27)));
            }
            return createFromParcel.INSTANCE;
        }
        if (i2 == 1) {
            webChatViewmodel$observeBridgeMessage$2 = vectorPropertyStrokeAlpha.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(obj6);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        MutableStateFlow mutableStateFlow2 = webChatViewmodel$observeBridgeMessage$2.write.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        do {
            obj5 = mutableStateFlow2.read();
        } while (!mutableStateFlow2.RemoteActionCompatParcelizer(obj5, VectorPropertyScaleX.serializer((VectorPropertyScaleX) obj5, null, false, false, VectorPropertyPivotX.RemoteActionCompatParcelizer, false, 23)));
        return createFromParcel.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        if (this.RemoteActionCompatParcelizer != 0) {
            return emit((onViewAttachedToWindowlambda0) obj, shortNewsContentCardView);
        }
        Object objAccess$handleMessage = WebChatViewmodel.access$handleMessage(this.write, (getY2) obj, shortNewsContentCardView);
        return objAccess$handleMessage == CoroutineSingletons.COROUTINE_SUSPENDED ? objAccess$handleMessage : createFromParcel.INSTANCE;
    }
}
