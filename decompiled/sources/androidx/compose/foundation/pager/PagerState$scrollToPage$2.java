package androidx.compose.foundation.pager;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.ontheway.deliverynotes.presentation.DeliveryNotesUiModelImpl;
import com.roadrunner.freelancing.data.GoAndStartDataStoreImpl$set$2;
import com.roadrunner.freelancing.data.GoAndStartRepository;
import com.roadrunner.freelancing.presentation.goandstartinfo.GoAndStartInformationUiModelImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.AndroidFontListTypeface;
import o.PlatformSelectionBehaviorsImpl;
import o.SheetBottomTokens;
import o.ShortNewsContentCardView;
import o.SmallIconButtonTokens;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.makeContentView;
import o.makeHeadsUpContentView;
import o.pauseWebviewIfNecessarylambda10;
import o.performCustomExitMxy_nc0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class PagerState$scrollToPage$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int serializer;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public int read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PagerState$scrollToPage$2(Object obj, int i, ShortNewsContentCardView shortNewsContentCardView, int i2) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i2;
        this.IconCompatParcelizer = obj;
        this.write = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$scrollToPage$2(GoAndStartInformationUiModelImpl goAndStartInformationUiModelImpl, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = 3;
        this.IconCompatParcelizer = goAndStartInformationUiModelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = serializer + 89;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.RemoteActionCompatParcelizer;
        Object obj2 = this.IconCompatParcelizer;
        if (i5 == 0) {
            return new PagerState$scrollToPage$2((PagerState) obj2, this.write, shortNewsContentCardView, 0);
        }
        int i6 = 1;
        if (i5 == 1) {
            PagerState$scrollToPage$2 pagerState$scrollToPage$2 = new PagerState$scrollToPage$2((SheetBottomTokens) obj2, this.write, shortNewsContentCardView, i6);
            int i7 = serializer + 125;
            MediaBrowserCompatMediaItem = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                return pagerState$scrollToPage$2;
            }
            throw null;
        }
        if (i5 == 2) {
            return new PagerState$scrollToPage$2((AndroidFontListTypeface) obj2, this.write, shortNewsContentCardView, i);
        }
        PagerState$scrollToPage$2 pagerState$scrollToPage$3 = new PagerState$scrollToPage$2((GoAndStartInformationUiModelImpl) obj2, shortNewsContentCardView);
        int i8 = MediaBrowserCompatMediaItem + 45;
        serializer = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        return pagerState$scrollToPage$3;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 121;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        if (i3 == 0) {
            return ((PagerState$scrollToPage$2) create((PlatformSelectionBehaviorsImpl) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
        }
        if (i3 != 1) {
            return i3 != 2 ? ((PagerState$scrollToPage$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2) : ((PagerState$scrollToPage$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((PagerState$scrollToPage$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
        int i4 = MediaBrowserCompatMediaItem + 59;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        makeContentView makecontentview;
        boolean z;
        int i;
        int i2 = 2 % 2;
        int i3 = this.RemoteActionCompatParcelizer;
        Object obj2 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj3 = null;
        if (i3 == 0) {
            PagerState pagerState = (PagerState) obj2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.read;
            if (i4 != 0) {
                int i5 = MediaBrowserCompatMediaItem + 97;
                serializer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i7 = MediaBrowserCompatMediaItem + 33;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.read = 1;
                if (pagerState.awaitScrollDependencies(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            pagerState.RemoteActionCompatParcelizer(0.0f, pagerState.serializer(this.write), true);
            return createfromparcel;
        }
        if (i3 == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i9 = this.read;
            if (i9 != 0) {
                if (i9 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            SmallIconButtonTokens smallIconButtonTokens = ((SheetBottomTokens) obj2).MediaSessionCompatQueueItem;
            int i10 = this.write;
            this.read = 1;
            return smallIconButtonTokens.scrollToItem(i10, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
        }
        if (i3 == 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i11 = this.read;
            if (i11 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                AndroidFontListTypeface androidFontListTypeface = (AndroidFontListTypeface) obj2;
                performCustomExitMxy_nc0 performcustomexitmxy_nc0 = androidFontListTypeface.RemoteActionCompatParcelizer;
                DeliveryNotesUiModelImpl.AnonymousClass1 anonymousClass1 = new DeliveryNotesUiModelImpl.AnonymousClass1(this.write, androidFontListTypeface, (ShortNewsContentCardView) null);
                this.read = 1;
                return pauseWebviewIfNecessarylambda10.serializer(performcustomexitmxy_nc0, anonymousClass1, this) == coroutineSingletons3 ? coroutineSingletons3 : createfromparcel;
            }
            int i12 = MediaBrowserCompatMediaItem + 39;
            serializer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 == 0 ? i11 != 1 : i11 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i13 = MediaBrowserCompatMediaItem + 35;
                serializer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i15 = MediaBrowserCompatMediaItem + 15;
            serializer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            return createfromparcel;
        }
        GoAndStartInformationUiModelImpl goAndStartInformationUiModelImpl = (GoAndStartInformationUiModelImpl) obj2;
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i17 = this.write;
        if (i17 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Object obj4 = goAndStartInformationUiModelImpl.IconCompatParcelizer.read();
            if (obj4 instanceof makeContentView) {
                int i18 = MediaBrowserCompatMediaItem + 3;
                serializer = i18 % Fields.SpotShadowColor;
                if (i18 % 2 != 0) {
                    obj3.hashCode();
                    throw null;
                }
                makecontentview = (makeContentView) obj4;
            } else {
                makecontentview = null;
            }
            if (makecontentview != null) {
                int i19 = serializer + 121;
                MediaBrowserCompatMediaItem = i19 % Fields.SpotShadowColor;
                int i20 = i19 % 2;
                z = makecontentview.write;
            } else {
                z = false;
            }
            i = z;
            GoAndStartRepository goAndStartRepository = goAndStartInformationUiModelImpl.RemoteActionCompatParcelizer;
            this.read = i;
            this.write = 1;
            Object objSerializer = pauseWebviewIfNecessarylambda10.serializer((performCustomExitMxy_nc0) goAndStartRepository.read.serializer.MediaSessionCompatResultReceiverWrapper(), new GoAndStartDataStoreImpl$set$2(goAndStartRepository.RemoteActionCompatParcelizer, i, null), this);
            if (objSerializer != coroutineSingletons4) {
                objSerializer = createfromparcel;
            }
            if (objSerializer != coroutineSingletons4) {
                objSerializer = createfromparcel;
            }
            if (objSerializer != coroutineSingletons4) {
            }
            return coroutineSingletons4;
        }
        if (i17 != 1) {
            if (i17 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = this.read;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        goAndStartInformationUiModelImpl.IconCompatParcelizer.IconCompatParcelizer(makeHeadsUpContentView.RemoteActionCompatParcelizer);
        String str = goAndStartInformationUiModelImpl.MediaSessionCompatQueueItem;
        this.read = i;
        this.write = 2;
        if (GoAndStartInformationUiModelImpl.access$executeGoAndStart(goAndStartInformationUiModelImpl, str, this) != coroutineSingletons4) {
            return createfromparcel;
        }
        return coroutineSingletons4;
    }
}
