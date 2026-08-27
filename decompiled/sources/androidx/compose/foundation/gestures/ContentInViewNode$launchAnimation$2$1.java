package androidx.compose.foundation.gestures;

import bo.app.n$$ExternalSyntheticLambda3;
import coil3.ExtrasKt;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda12;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.SimpleLayoutKtSimpleLayout11;
import o.createFromParcel;
import o.getStringId9Hzcbyc;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;

/* JADX INFO: loaded from: classes.dex */
public final class ContentInViewNode$launchAnimation$2$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ long IconCompatParcelizer;
    public final /* synthetic */ ContentInViewNode MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public final /* synthetic */ getStringId9Hzcbyc RemoteActionCompatParcelizer;
    public final /* synthetic */ UpdatableAnimationState read;
    public final /* synthetic */ setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentInViewNode$launchAnimation$2$1(UpdatableAnimationState updatableAnimationState, ContentInViewNode contentInViewNode, getStringId9Hzcbyc getstringid9hzcbyc, long j, setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = updatableAnimationState;
        this.MediaDescriptionCompat = contentInViewNode;
        this.RemoteActionCompatParcelizer = getstringid9hzcbyc;
        this.IconCompatParcelizer = j;
        this.serializer = setallviewgroupchildrenasnonaccessibilityimportantlambda0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        ContentInViewNode$launchAnimation$2$1 contentInViewNode$launchAnimation$2$1 = new ContentInViewNode$launchAnimation$2$1(this.read, this.MediaDescriptionCompat, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.serializer, shortNewsContentCardView);
        contentInViewNode$launchAnimation$2$1.write = obj;
        return contentInViewNode$launchAnimation$2$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((ContentInViewNode$launchAnimation$2$1) create((SimpleLayoutKtSimpleLayout11) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.MediaMetadataCompat;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            SimpleLayoutKtSimpleLayout11 simpleLayoutKtSimpleLayout11 = (SimpleLayoutKtSimpleLayout11) this.write;
            long j = this.IconCompatParcelizer;
            ContentInViewNode contentInViewNode = this.MediaDescriptionCompat;
            getStringId9Hzcbyc getstringid9hzcbyc = this.RemoteActionCompatParcelizer;
            float fM26access$calculateScrollDeltaI_oMVgE = ContentInViewNode.m26access$calculateScrollDeltaI_oMVgE(contentInViewNode, getstringid9hzcbyc, j);
            UpdatableAnimationState updatableAnimationState = this.read;
            updatableAnimationState.IconCompatParcelizer = fM26access$calculateScrollDeltaI_oMVgE;
            UserJavascriptInterfaceBase$$ExternalSyntheticLambda12 userJavascriptInterfaceBase$$ExternalSyntheticLambda12 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(contentInViewNode, updatableAnimationState, this.serializer, simpleLayoutKtSimpleLayout11);
            n$$ExternalSyntheticLambda3 n__externalsyntheticlambda3 = new n$$ExternalSyntheticLambda3(contentInViewNode, updatableAnimationState, getstringid9hzcbyc, 1);
            this.MediaMetadataCompat = 1;
            if (updatableAnimationState.animateToZero(userJavascriptInterfaceBase$$ExternalSyntheticLambda12, n__externalsyntheticlambda3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        return createFromParcel.INSTANCE;
    }
}
