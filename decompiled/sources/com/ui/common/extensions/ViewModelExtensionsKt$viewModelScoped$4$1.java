package com.ui.common.extensions;

import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import com.logistics.rider.glovo.R;
import com.roadrunner.customerchat.selfservice.presentation.SelfServiceCustomerChatActivity;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.ContainsAlllambda0;
import o.Paint29;
import o.PaintExtensions_androidKt;
import o.ShortNewsContentCardView;
import o.StaticLayoutFactoryDefault;
import o.TextLayoutInput;
import o.TextLayout_androidKt;
import o.createFromParcel;
import o.drawPaint;
import o.drawPosText;
import o.extendWith;
import o.f8;
import o.f9;
import o.fh;
import o.g0ExternalSyntheticLambda1;
import o.g5;
import o.getDrawFilter;
import o.getTextBounds;
import o.isInvalidIndex;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafHcIMtqslO5nN2ofGE631aElY;
import o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ViewModelExtensionsKt$viewModelScoped$4$1 implements FlowCollector, r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object write;

    public /* synthetic */ ViewModelExtensionsKt$viewModelScoped$4$1(int i, Object obj) {
        this.RemoteActionCompatParcelizer = i;
        this.write = obj;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = read + 83;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        if (i3 == 0) {
            return getFunctionDelegate().hashCode();
        }
        if (i3 != 1) {
            return i3 != 2 ? getFunctionDelegate().hashCode() : getFunctionDelegate().hashCode();
        }
        int iHashCode = getFunctionDelegate().hashCode();
        int i4 = read + 25;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    @Override // o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ
    public final isInvalidIndex getFunctionDelegate() {
        int i = 2 % 2;
        int i2 = read + 71;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        Object obj = this.write;
        if (i4 == 0) {
            return new FunctionReferenceImpl(2, 0, TextStreamsKt.class, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj, "suspendConversion0", "invokeSuspend$suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }
        if (i4 == 1) {
            return new AdaptedFunctionReference(2, 4, SelfServiceCustomerChatActivity.class, (SelfServiceCustomerChatActivity) obj, "sendHostMessage", "sendHostMessage(Ljava/lang/String;)V");
        }
        if (i4 == 2) {
            return new AdaptedFunctionReference(2, 4, StaticLayoutFactoryDefault.class, (StaticLayoutFactoryDefault) obj, "calculateUiState", "calculateUiState(Lcom/roadrunner/delivery/accept/backToBackOrder/api/presentation/banner/BackToBackOrdersState;)V");
        }
        AdaptedFunctionReference adaptedFunctionReference = new AdaptedFunctionReference(2, 4, TextLayout_androidKt.class, (TextLayout_androidKt) obj, "updateMapLayer", "updateMapLayer(Lcom/roadrunner/delivery/accept/laststop/api/domain/LastStopLocationState;)V");
        int i5 = IconCompatParcelizer + 75;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return adaptedFunctionReference;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 7;
        int i4 = i3 % Fields.SpotShadowColor;
        read = i4;
        int i5 = i3 % 2;
        int i6 = this.RemoteActionCompatParcelizer;
        if (i6 == 0) {
            if ((obj instanceof FlowCollector) && (obj instanceof r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ)) {
                return getFunctionDelegate().equals(((r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ) obj).getFunctionDelegate());
            }
            return false;
        }
        if (i6 == 1) {
            if ((obj instanceof FlowCollector) && (obj instanceof r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ)) {
                return getFunctionDelegate().equals(((r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ) obj).getFunctionDelegate());
            }
            return false;
        }
        if (i6 != 2) {
            if (!(obj instanceof FlowCollector) || !(obj instanceof r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ)) {
                return false;
            }
            int i7 = i4 + 101;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return getFunctionDelegate().equals(((r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ) obj).getFunctionDelegate());
        }
        if (!(obj instanceof FlowCollector)) {
            return false;
        }
        int i9 = i2 + 117;
        read = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        if (obj instanceof r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ) {
            return getFunctionDelegate().equals(((r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ) obj).getFunctionDelegate());
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009c  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00af  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bf  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        boolean z;
        int i;
        List list;
        Object obj2;
        int i2 = 2 % 2;
        int i3 = read + 13;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        Object obj3 = null;
        if (i3 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        Object obj4 = this.write;
        if (i4 == 0) {
            ((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj4).invoke(obj);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return createfromparcel2;
        }
        if (i4 == 1) {
            SelfServiceCustomerChatActivity.serializer((SelfServiceCustomerChatActivity) obj4, (String) obj);
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = read + 85;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return createfromparcel2;
        }
        if (i4 != 2) {
            drawPosText drawpostext = (drawPosText) obj;
            TextLayout_androidKt textLayout_androidKt = (TextLayout_androidKt) obj4;
            if (drawpostext instanceof drawPaint) {
                int i7 = TextLayout_androidKt.read;
                getDrawFilter getdrawfilter = ((drawPaint) drawpostext).write;
                list = SQLite.read(new g0ExternalSyntheticLambda1(g5.NEVER), new fh(new f8(getdrawfilter.serializer, getdrawfilter.read), g5.ALWAYS));
            } else {
                list = textLayout_androidKt.MediaBrowserCompatMediaItem;
            }
            List list2 = list;
            int i8 = read + 103;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            MutableStateFlow mutableStateFlow = textLayout_androidKt.IconCompatParcelizer;
            do {
                obj2 = mutableStateFlow.read();
                ((f9) obj2).getClass();
                list2.getClass();
            } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj2, new f9(list2)));
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            return createfromparcel2;
        }
        ContainsAlllambda0 containsAlllambda0 = (ContainsAlllambda0) obj;
        StaticLayoutFactoryDefault staticLayoutFactoryDefault = (StaticLayoutFactoryDefault) obj4;
        Object paint29 = (PaintExtensions_androidKt) staticLayoutFactoryDefault.MediaBrowserCompatMediaItem.read();
        if (paint29 instanceof getTextBounds) {
            int i10 = IconCompatParcelizer + 43;
            read = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                boolean z2 = containsAlllambda0 instanceof r8lambdafHcIMtqslO5nN2ofGE631aElY;
                obj3.hashCode();
                throw null;
            }
            if (!(containsAlllambda0 instanceof r8lambdafHcIMtqslO5nN2ofGE631aElY)) {
                z = containsAlllambda0 instanceof TextLayoutInput;
                extendWith extendwith = extendWith.serializer;
                if (z) {
                    i = IconCompatParcelizer + 125;
                    read = i % Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        staticLayoutFactoryDefault.read.logEvent("back_to_back_order_redispatched_overlay", null);
                        throw null;
                    }
                    staticLayoutFactoryDefault.read.logEvent("back_to_back_order_redispatched_overlay", null);
                } else if (containsAlllambda0 instanceof r8lambdafHcIMtqslO5nN2ofGE631aElY) {
                    r8lambdafHcIMtqslO5nN2ofGE631aElY r8lambdafhcimtqslo5nn2ofge631aely = (r8lambdafHcIMtqslO5nN2ofGE631aElY) containsAlllambda0;
                    paint29 = new Paint29(r8lambdafhcimtqslo5nn2ofge631aely.IconCompatParcelizer, r8lambdafhcimtqslo5nn2ofge631aely.serializer, R.raw.rate_equipment);
                }
                paint29 = extendwith;
            }
        } else {
            z = containsAlllambda0 instanceof TextLayoutInput;
            extendWith extendwith2 = extendWith.serializer;
            if (z) {
                i = IconCompatParcelizer + 125;
                read = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    staticLayoutFactoryDefault.read.logEvent("back_to_back_order_redispatched_overlay", null);
                    throw null;
                }
                staticLayoutFactoryDefault.read.logEvent("back_to_back_order_redispatched_overlay", null);
            } else if (containsAlllambda0 instanceof r8lambdafHcIMtqslO5nN2ofGE631aElY) {
                r8lambdafHcIMtqslO5nN2ofGE631aElY r8lambdafhcimtqslo5nn2ofge631aely2 = (r8lambdafHcIMtqslO5nN2ofGE631aElY) containsAlllambda0;
                paint29 = new Paint29(r8lambdafhcimtqslo5nn2ofge631aely2.IconCompatParcelizer, r8lambdafhcimtqslo5nn2ofge631aely2.serializer, R.raw.rate_equipment);
            }
            paint29 = extendwith2;
        }
        staticLayoutFactoryDefault.IconCompatParcelizer.IconCompatParcelizer(paint29);
        staticLayoutFactoryDefault.write.IconCompatParcelizer(Boolean.valueOf(paint29 instanceof Paint29));
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        return createfromparcel2;
    }
}
