package androidx.lifecycle;

import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.foundation.CombinedClickableNode;
import androidx.compose.foundation.FocusableNode;
import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.ThumbNode;
import androidx.compose.ui.graphics.Fields;
import androidx.room.InvalidationTracker;
import androidx.work.CoroutineWorker;
import com.deliveryhero.chatui.view.root.CustomerChatViewModel;
import com.deliveryhero.contract.datastore.ChatConfigurationDataStoreHelperImpl;
import com.deliveryhero.customerchat.datastore.UserPropertiesDataStoreHelperImpl;
import com.deliveryhero.customerchat.service.ChatService;
import com.deliveryhero.performance.core.calculator.PerformanceClassCalculatorImpl;
import com.deliveryhero.perseus.data.local.PerseusUserLocalDataStoreImpl;
import com.deliveryhero.selfServiceChat.data.chat.url.datastore.ChatUrlDataStoreHelperImpl;
import com.mapbox.navigation.core.MapboxNavigation$parsing$2;
import com.sentiance.core.model.thrift.k$c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.BezierKtWhenMappings;
import o.LazyLayoutItemAnimatorDisplayingDisappearingItemsNode;
import o.PagerState;
import o.PlatformSelectionBehaviorsImpl;
import o.ShortNewsContentCardView;
import o.ZIndexModifierKt;
import o.accessgetGreencp;
import o.colorResource;
import o.createFromParcel;
import o.getCenter;
import o.getContentViewGroupParentLayout;
import o.getTouchaOaMEAU;
import o.getTraverseKey;
import o.getType4ZHQPSE;
import o.obtainSizePxVpY3zN4;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.swap;

/* JADX INFO: loaded from: classes.dex */
public final class BlockRunner$cancel$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockRunner$cancel$1(LazyListState lazyListState, int i, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = 7;
        this.serializer = lazyListState;
        this.read = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BlockRunner$cancel$1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.serializer = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = write + 101;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.RemoteActionCompatParcelizer;
        Object obj2 = this.serializer;
        int i6 = 21;
        Object obj3 = null;
        switch (i5) {
            case 0:
                return new BlockRunner$cancel$1((BlockRunner) obj2, shortNewsContentCardView, 0);
            case 1:
                return new BlockRunner$cancel$1((SeekableTransitionState) obj2, shortNewsContentCardView, 1);
            case 2:
                return new BlockRunner$cancel$1((CombinedClickableNode) obj2, shortNewsContentCardView, i);
            case 3:
                return new BlockRunner$cancel$1((LazyLayoutItemAnimatorDisplayingDisappearingItemsNode) obj2, shortNewsContentCardView, 3);
            case 4:
                return new BlockRunner$cancel$1((FocusableNode) obj2, shortNewsContentCardView, 4);
            case 5:
                return new BlockRunner$cancel$1((PagerState) obj2, shortNewsContentCardView, 5);
            case 6:
                BlockRunner$cancel$1 blockRunner$cancel$1 = new BlockRunner$cancel$1((MouseWheelScrollingLogic) obj2, shortNewsContentCardView, 6);
                int i7 = write + 107;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    return blockRunner$cancel$1;
                }
                obj3.hashCode();
                throw null;
            case 7:
                return new BlockRunner$cancel$1((LazyListState) obj2, this.read, shortNewsContentCardView);
            case 8:
                return new BlockRunner$cancel$1((accessgetGreencp) obj2, shortNewsContentCardView, 8);
            case 9:
                return new BlockRunner$cancel$1((getTraverseKey) obj2, shortNewsContentCardView, 9);
            case 10:
                return new BlockRunner$cancel$1((getCenter) obj2, shortNewsContentCardView, 10);
            case 11:
                return new BlockRunner$cancel$1((ZIndexModifierKt) obj2, shortNewsContentCardView, 11);
            case 12:
                return new BlockRunner$cancel$1((ThumbNode) obj2, shortNewsContentCardView, 12);
            case 13:
                return new BlockRunner$cancel$1((MapboxNavigation$parsing$2) obj2, shortNewsContentCardView, 13);
            case 14:
                return new BlockRunner$cancel$1((BezierKtWhenMappings) obj2, shortNewsContentCardView, 14);
            case 15:
                return new BlockRunner$cancel$1((InvalidationTracker) obj2, shortNewsContentCardView, 15);
            case 16:
                return new BlockRunner$cancel$1((CoroutineWorker) obj2, shortNewsContentCardView, 16);
            case 17:
                return new BlockRunner$cancel$1((CustomerChatViewModel) obj2, shortNewsContentCardView, 17);
            case 18:
                return new BlockRunner$cancel$1((ChatConfigurationDataStoreHelperImpl) obj2, shortNewsContentCardView, 18);
            case 19:
                return new BlockRunner$cancel$1((UserPropertiesDataStoreHelperImpl) obj2, shortNewsContentCardView, 19);
            case 20:
                BlockRunner$cancel$1 blockRunner$cancel$2 = new BlockRunner$cancel$1((ChatService) obj2, shortNewsContentCardView, 20);
                int i8 = IconCompatParcelizer + 21;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return blockRunner$cancel$2;
            case 21:
                return new BlockRunner$cancel$1((PerformanceClassCalculatorImpl) obj2, shortNewsContentCardView, i6);
            case 22:
                return new BlockRunner$cancel$1((PerseusUserLocalDataStoreImpl) obj2, shortNewsContentCardView, 22);
            case 23:
                return new BlockRunner$cancel$1((ChatUrlDataStoreHelperImpl) obj2, shortNewsContentCardView, 23);
            case 24:
                return new BlockRunner$cancel$1((obtainSizePxVpY3zN4) obj2, shortNewsContentCardView, 24);
            case 25:
                BlockRunner$cancel$1 blockRunner$cancel$3 = new BlockRunner$cancel$1((k$c) obj2, shortNewsContentCardView, 25);
                int i10 = IconCompatParcelizer + 57;
                write = i10 % Fields.SpotShadowColor;
                if (i10 % 2 == 0) {
                    return blockRunner$cancel$3;
                }
                obj3.hashCode();
                throw null;
            case 26:
                return new BlockRunner$cancel$1((getTouchaOaMEAU) obj2, shortNewsContentCardView, 26);
            case 27:
                return new BlockRunner$cancel$1((getType4ZHQPSE) obj2, shortNewsContentCardView, 27);
            case 28:
                return new BlockRunner$cancel$1((colorResource) obj2, shortNewsContentCardView, 28);
            default:
                return new BlockRunner$cancel$1((swap) obj2, shortNewsContentCardView, 29);
        }
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        switch (i2) {
            case 0:
                return ((BlockRunner$cancel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 1:
                return ((BlockRunner$cancel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 2:
                return ((BlockRunner$cancel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 3:
                Object objInvokeSuspend = ((BlockRunner$cancel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i3 = write + 31;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return objInvokeSuspend;
            case 4:
                return ((BlockRunner$cancel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 5:
                return ((BlockRunner$cancel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 6:
                return ((BlockRunner$cancel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 7:
                ((BlockRunner$cancel$1) create((PlatformSelectionBehaviorsImpl) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 8:
                return ((BlockRunner$cancel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 9:
                return ((BlockRunner$cancel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 10:
                return ((BlockRunner$cancel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 11:
                return ((BlockRunner$cancel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 12:
                return ((BlockRunner$cancel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 13:
                return ((BlockRunner$cancel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 14:
                return ((BlockRunner$cancel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 15:
                return ((BlockRunner$cancel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 16:
                ((BlockRunner$cancel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                return createfromparcel;
            case 17:
                return ((BlockRunner$cancel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 18:
                return ((BlockRunner$cancel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 19:
                return ((BlockRunner$cancel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 20:
                return ((BlockRunner$cancel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 21:
                return ((BlockRunner$cancel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 22:
                return ((BlockRunner$cancel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 23:
                return ((BlockRunner$cancel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 24:
                return ((BlockRunner$cancel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 25:
                Object objInvokeSuspend2 = ((BlockRunner$cancel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
                int i5 = write + 1;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return objInvokeSuspend2;
            case 26:
                return ((BlockRunner$cancel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 27:
                return ((BlockRunner$cancel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            case 28:
                return ((BlockRunner$cancel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            default:
                return ((BlockRunner$cancel$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
    }

    /* JADX WARN: Code duplicated, block: B:277:0x051b  */
    /* JADX WARN: Code duplicated, block: B:279:0x051f  */
    /* JADX WARN: Code duplicated, block: B:282:0x0528  */
    /* JADX WARN: Code duplicated, block: B:284:0x052c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:283:0x052a -> B:277:0x051b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:285:0x0545 -> B:288:0x0549). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.BlockRunner$cancel$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
