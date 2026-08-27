package androidx.compose.runtime;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.backwardFocusSearch;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.isItemDismissable;
import o.notifySubtreeStateChangeIfNeeded;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.requireParentFragment;
import o.setArguments;

/* JADX INFO: loaded from: classes.dex */
public final class Recomposer$join$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;
    public /* synthetic */ Object read;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Recomposer$join$2(int i, int i2, ShortNewsContentCardView shortNewsContentCardView) {
        super(i, shortNewsContentCardView);
        this.write = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = serializer + 97;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.write;
        if (i5 == 0) {
            Recomposer$join$2 recomposer$join$2 = new Recomposer$join$2(i, 0, shortNewsContentCardView);
            recomposer$join$2.read = obj;
            int i6 = RemoteActionCompatParcelizer + 17;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return recomposer$join$2;
        }
        int i8 = 1;
        if (i5 == 1) {
            Recomposer$join$2 recomposer$join$3 = new Recomposer$join$2(i, i8, shortNewsContentCardView);
            recomposer$join$3.read = obj;
            return recomposer$join$3;
        }
        if (i5 == 2) {
            Recomposer$join$2 recomposer$join$4 = new Recomposer$join$2(i, i, shortNewsContentCardView);
            recomposer$join$4.read = obj;
            return recomposer$join$4;
        }
        int i9 = 3;
        if (i5 != 3) {
            Recomposer$join$2 recomposer$join$5 = new Recomposer$join$2(i, 4, shortNewsContentCardView);
            recomposer$join$5.read = obj;
            return recomposer$join$5;
        }
        Recomposer$join$2 recomposer$join$6 = new Recomposer$join$2(i, i9, shortNewsContentCardView);
        recomposer$join$6.read = obj;
        return recomposer$join$6;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = serializer + 81;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i4 == 0) {
            return ((Recomposer$join$2) create((notifySubtreeStateChangeIfNeeded) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
        if (i4 == 1) {
            return ((Recomposer$join$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
        if (i4 == 2) {
            return ((Recomposer$join$2) create((requireParentFragment) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }
        if (i4 != 3) {
            ((Recomposer$join$2) create((backwardFocusSearch) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
            int i5 = serializer + 109;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return createfromparcel;
        }
        Object objInvokeSuspend = ((Recomposer$join$2) create((setArguments) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        int i7 = RemoteActionCompatParcelizer + 21;
        serializer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object isitemdismissable;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 95;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        boolean z = false;
        int length = 1;
        if (i4 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return Boolean.valueOf(((notifySubtreeStateChangeIfNeeded) this.read) == notifySubtreeStateChangeIfNeeded.ShutDown);
        }
        if (i4 == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
            try {
                File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(new FileFilter() { // from class: o.InnerShadowRendererProviderCompanionDefault1
                    @Override // java.io.FileFilter
                    public final boolean accept(File file) {
                        return Pattern.matches("cpu[0-9]+", file.getName());
                    }
                });
                if (fileArrListFiles != null) {
                    int i5 = serializer + 45;
                    RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    length = fileArrListFiles.length;
                }
                isitemdismissable = new Integer(Math.max(iAvailableProcessors, length));
            } catch (Throwable th) {
                isitemdismissable = new isItemDismissable(th);
            }
            Integer num = new Integer(iAvailableProcessors);
            if (!(isitemdismissable instanceof isItemDismissable)) {
                return isitemdismissable;
            }
            int i7 = serializer + 31;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return num;
        }
        if (i4 == 2) {
            requireParentFragment requireparentfragment = (requireParentFragment) this.read;
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (requireparentfragment == requireParentFragment.PICK_UP_DROP_OFF) {
                int i9 = RemoteActionCompatParcelizer + 83;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (i4 == 3) {
            setArguments setarguments = (setArguments) this.read;
            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return Boolean.valueOf(setarguments != null);
        }
        backwardFocusSearch backwardfocussearch = (backwardFocusSearch) this.read;
        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        backwardfocussearch.write();
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i11 = RemoteActionCompatParcelizer + 1;
        serializer = i11 % Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return createfromparcel;
    }
}
