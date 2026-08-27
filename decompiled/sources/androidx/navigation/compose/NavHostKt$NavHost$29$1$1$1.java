package androidx.navigation.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.SeekableTransitionState$snapTo$2;
import androidx.compose.animation.core.Transition;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.location.logic.E5;
import com.roadrunner.rrds.compose.component.image.zoomable.ZoomState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.TrackpadScrollingLogic;
import o.createFromParcel;
import o.cubicTo;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.onShowTranslationui;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.tryMinHeightJN0ABg;
import o.width;

/* JADX INFO: loaded from: classes.dex */
public final class NavHostKt$NavHost$29$1$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ float serializer;
    public final /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$29$1$1$1(float f, SeekableTransitionState seekableTransitionState, cubicTo cubicto, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = 0;
        this.serializer = f;
        this.write = seekableTransitionState;
        this.RemoteActionCompatParcelizer = cubicto;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NavHostKt$NavHost$29$1$1$1(Object obj, float f, TrackpadScrollingLogic trackpadScrollingLogic, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.write = obj;
        this.serializer = f;
        this.RemoteActionCompatParcelizer = trackpadScrollingLogic;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RatingCompat + 97;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 == 0) {
            return ((NavHostKt$NavHost$29$1$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i4 != 1) {
            return ((NavHostKt$NavHost$29$1$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((NavHostKt$NavHost$29$1$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = MediaSessionCompatQueueItem + 53;
        RatingCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 42 / 0;
        }
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 89;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        Object obj2 = this.RemoteActionCompatParcelizer;
        Object obj3 = this.write;
        if (i4 != 0) {
            if (i4 != 1) {
                return new NavHostKt$NavHost$29$1$1$1((ZoomState) obj3, this.serializer, (width) obj2, shortNewsContentCardView, 2);
            }
            return new NavHostKt$NavHost$29$1$1$1((E5) obj3, this.serializer, (TrackpadScrollingLogic) obj2, shortNewsContentCardView, 1);
        }
        NavHostKt$NavHost$29$1$1$1 navHostKt$NavHost$29$1$1$1 = new NavHostKt$NavHost$29$1$1$1(this.serializer, (SeekableTransitionState) obj3, (cubicTo) obj2, shortNewsContentCardView);
        int i5 = RatingCompat + 55;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return navHostKt$NavHost$29$1$1$1;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0133  */
    /* JADX WARN: Code duplicated, block: B:53:0x0141  */
    /* JADX WARN: Code duplicated, block: B:55:0x0144  */
    /* JADX WARN: Code duplicated, block: B:58:0x0150  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i;
        int i2 = 2 % 2;
        int i3 = RatingCompat + 57;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.IconCompatParcelizer;
        Object obj3 = createFromParcel.INSTANCE;
        Object obj4 = this.RemoteActionCompatParcelizer;
        float f = this.serializer;
        Object obj5 = this.write;
        if (i5 != 0) {
            if (i5 != 1) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.read;
                if (i6 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.read = 1;
                    return Animatable.IconCompatParcelizer(((ZoomState) obj5).write, new Float(f), (width) obj4, this, 12) == coroutineSingletons ? coroutineSingletons : obj3;
                }
                if (i6 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj3;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i7 = this.read;
            if (i7 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.read = 1;
                return Animatable.IconCompatParcelizer((Animatable) ((E5) obj5).write, new Float(f), (TrackpadScrollingLogic) obj4, this, 12) == coroutineSingletons2 ? coroutineSingletons2 : obj3;
            }
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i8 = RatingCompat + 63;
            MediaSessionCompatQueueItem = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return obj3;
        }
        SeekableTransitionState seekableTransitionState = (SeekableTransitionState) obj5;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.read;
        if (i10 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (f > 0.0f) {
                this.read = 1;
                if (seekableTransitionState.seekTo(f, ((onShowTranslationui) seekableTransitionState.ResultReceiver).getValue(), this) == coroutineSingletons3) {
                    obj3 = coroutineSingletons3;
                }
            }
            i = RatingCompat + 11;
            MediaSessionCompatQueueItem = i % Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i11 = 14 / 0;
            }
            return obj3;
        }
        if (i10 != 1) {
            int i12 = MediaSessionCompatQueueItem + 23;
            RatingCompat = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0 ? i10 != 2 : i10 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                obj3 = null;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        i = RatingCompat + 11;
        MediaSessionCompatQueueItem = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i13 = 14 / 0;
        }
        return obj3;
        if (f == 0.0f) {
            int i14 = MediaSessionCompatQueueItem + 71;
            RatingCompat = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            cubicTo cubicto = (cubicTo) obj4;
            this.read = 2;
            Transition transition = seekableTransitionState.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            if (transition == null) {
                obj2 = obj3;
            } else {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((onShowTranslationui) seekableTransitionState.MediaBrowserCompatMediaItem).getValue(), cubicto}, getCieXyz.write())).booleanValue()) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((onShowTranslationui) seekableTransitionState.ResultReceiver).getValue(), cubicto}, getCieXyz.write())).booleanValue()) {
                        obj2 = obj3;
                    } else {
                        obj2 = tryMinHeightJN0ABg.read(seekableTransitionState.PlaybackStateCompat, new SeekableTransitionState$snapTo$2(seekableTransitionState, cubicto, transition, (ShortNewsContentCardView) null), this);
                        if (obj2 != coroutineSingletons3) {
                            obj2 = obj3;
                        }
                    }
                } else {
                    obj2 = tryMinHeightJN0ABg.read(seekableTransitionState.PlaybackStateCompat, new SeekableTransitionState$snapTo$2(seekableTransitionState, cubicto, transition, (ShortNewsContentCardView) null), this);
                    if (obj2 != coroutineSingletons3) {
                        obj2 = obj3;
                    }
                }
            }
            if (obj2 == coroutineSingletons3) {
                obj3 = coroutineSingletons3;
            }
        }
        i = RatingCompat + 11;
        MediaSessionCompatQueueItem = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            int i16 = 14 / 0;
        }
        return obj3;
    }
}
