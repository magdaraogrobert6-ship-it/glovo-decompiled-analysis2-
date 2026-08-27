package com.roadrunner.customerchat.legacy.core.manager;

import androidx.compose.ui.graphics.Fields;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl$applyTo$1;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.room.Room;
import bo.app.b8$$ExternalSyntheticLambda4;
import coil3.ExtrasKt;
import com.deliveryhero.customerchat.CustomerChatModule;
import com.deliveryhero.customerchat.commons.CustomerChatNotInitializedException;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.logger.PerseusLogger$w$1;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.fireWithUpdatedRectui;
import o.getContentViewGroupParentLayout;
import o.getGlobalChangeEntries;
import o.getMinDebounceDeadline;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomerChatProviderImpl$getUnreadCounts$3 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 1;
    private static int write;
    public int IconCompatParcelizer;
    public final /* synthetic */ CustomerChatProviderImpl RemoteActionCompatParcelizer;
    public final /* synthetic */ ArrayList read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerChatProviderImpl$getUnreadCounts$3(CustomerChatProviderImpl customerChatProviderImpl, ArrayList arrayList, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = customerChatProviderImpl;
        this.read = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        CustomerChatProviderImpl$getUnreadCounts$3 customerChatProviderImpl$getUnreadCounts$3 = new CustomerChatProviderImpl$getUnreadCounts$3(this.RemoteActionCompatParcelizer, this.read, shortNewsContentCardView);
        customerChatProviderImpl$getUnreadCounts$3.serializer = obj;
        int i2 = MediaDescriptionCompat + 103;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return customerChatProviderImpl$getUnreadCounts$3;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws CLParsingException, InterruptedException, IOException {
        int i = 2 % 2;
        int i2 = write + 17;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objInvokeSuspend = ((CustomerChatProviderImpl$getUnreadCounts$3) create((InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i4 = write + 23;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
        return objInvokeSuspend;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d5 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws CLParsingException, InterruptedException, IOException {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat + 21;
        write = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 = (InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) this.serializer;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        int i5 = 1;
        if (i4 != 0) {
            if (i4 != 1) {
                int i6 = MediaDescriptionCompat + 49;
                write = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                if (i4 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            return createfromparcel2;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        CustomerChatProviderImpl customerChatProviderImpl = this.RemoteActionCompatParcelizer;
        boolean zWrite = customerChatProviderImpl.MediaBrowserCompatMediaItem.write();
        ArrayList arrayList = this.read;
        if (zWrite) {
            InitializeAppStartupItemsImpl initializeAppStartupItemsImpl = customerChatProviderImpl.MediaSessionCompatQueueItem;
            BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) initializeAppStartupItemsImpl.serializer, null, null, new PerseusLogger$w$1(initializeAppStartupItemsImpl, new getGlobalChangeEntries(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, arrayList, 0), new getMinDebounceDeadline(customerChatProviderImpl, inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, arrayList, 0), null, 12), 3);
            this.serializer = null;
            this.IconCompatParcelizer = 2;
            if (Room.awaitClose(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, new b8$$ExternalSyntheticLambda4(1), this) != coroutineSingletons2) {
                return createfromparcel2;
            }
        } else {
            CustomerChatManagerImpl customerChatManagerImpl = customerChatProviderImpl.read;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((fireWithUpdatedRectui) obj2).RemoteActionCompatParcelizer.length() > 0) {
                    arrayList2.add(obj2);
                }
            }
            getGlobalChangeEntries getglobalchangeentries = new getGlobalChangeEntries(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, arrayList, 1);
            getMinDebounceDeadline getmindebouncedeadline = new getMinDebounceDeadline(customerChatProviderImpl, inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, arrayList, i5);
            this.serializer = inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
            this.IconCompatParcelizer = 1;
            CustomerChatModule customerChatModule = customerChatManagerImpl.read();
            ConstraintSetForInlineDsl$applyTo$1 constraintSetForInlineDsl$applyTo$1 = new ConstraintSetForInlineDsl$applyTo$1(customerChatModule, getglobalchangeentries, getmindebouncedeadline, i);
            if (customerChatModule.PlaybackStateCompat.get()) {
                int i8 = write + 91;
                MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                constraintSetForInlineDsl$applyTo$1.invoke();
            } else {
                getmindebouncedeadline.invoke(new CustomerChatNotInitializedException());
            }
            if (createfromparcel2 != coroutineSingletons2) {
                obj = createfromparcel2;
            }
        }
        return coroutineSingletons2;
        this.serializer = null;
        this.IconCompatParcelizer = 2;
        if (Room.awaitClose(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, new b8$$ExternalSyntheticLambda4(1), this) != coroutineSingletons2) {
            return coroutineSingletons2;
        }
        return createfromparcel2;
    }
}
