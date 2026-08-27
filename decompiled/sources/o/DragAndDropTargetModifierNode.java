package o;

import androidx.compose.runtime.internal.ComposableLambdaImpl$invoke$1;
import io.reactivex.subjects.BehaviorSubject;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class DragAndDropTargetModifierNode implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY, r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds, r8lambdagdus9EWsajL31FKA79xR2Pb0c4E, r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM, r8lambdai4uHhuxI_lBaIwBHW2e2KANuhE, r8lambdam6kPPA3z8dHTentc0gq2uQ_Iyco, r8lambdaqPv61rwIX7fwpHZY40hphRHQpZ8, r8lambdaVqRQRvr3UKPhHK_x9arK0s264, r8lambdaSQFu6AOFqpylmZRPZ50Z2TfR8UU, r8lambdaScekM2iB8lXAlFjjGbW7nu5ca8, r8lambdaWdJYQE7cd1YBN9rgKqoaFXB53ZM, r8lambdaW56WpyG3s7kCZVcDp3X2mz4mIY, r8lambdaZx3OXZoJJt1_BxZ4i_bdHj3NXM, r8lambdaWQlfmPfdJgpWJx7DDyi7sXvAlE, r8lambdaXQ9HBHyk0gHyCZjWaVGo09mEILs, r8lambdad2q08SPBZCTm0GxNUbGIRJJROyA, r8lambdadYjcH1_xGPFG3XH7gbXy_OXfQ, r8lambdafVx7XI7bO6Xm15vIIzhK9Uk9E {
    public final int IconCompatParcelizer;
    public getHandleruiannotations RemoteActionCompatParcelizer;
    public final boolean read;
    public ArrayList serializer;
    public Object write;

    public final Object read(Object obj, Object obj2, Boolean bool, Object obj3, Object obj4, Object obj5, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(this.IconCompatParcelizer);
        read(getpostalcode);
        int i2 = getpostalcode.read(this) ? coil3.ExtrasKt.read(2, 6) : coil3.ExtrasKt.read(1, 6);
        Object obj6 = this.write;
        obj6.getClass();
        pauseWebviewIfNecessarylambda10.read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{8, obj6}, BehaviorSubject.BehaviorDisposable.write(), BehaviorSubject.BehaviorDisposable.write(), -722072991, 722072991, BehaviorSubject.BehaviorDisposable.write());
        Object objRemoteActionCompatParcelizer = ((r8lambdam6kPPA3z8dHTentc0gq2uQ_Iyco) obj6).RemoteActionCompatParcelizer(obj, obj2, bool, obj3, obj4, obj5, getpostalcode, Integer.valueOf(i | i2));
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new UiMediaScopeImpl(this, obj, obj2, bool, obj3, obj4, obj5, i, 1);
        }
        return objRemoteActionCompatParcelizer;
    }

    public DragAndDropTargetModifierNode(Object obj, boolean z, int i) {
        this.IconCompatParcelizer = i;
        this.read = z;
        this.write = obj;
    }

    public final void read(getBirthDateFull getbirthdatefull) {
        getHandleruiannotations gethandleruiannotationsMediaSessionCompatResultReceiverWrapper;
        if (!this.read || (gethandleruiannotationsMediaSessionCompatResultReceiverWrapper = ((getPostalCode) getbirthdatefull).MediaSessionCompatResultReceiverWrapper()) == null) {
            return;
        }
        gethandleruiannotationsMediaSessionCompatResultReceiverWrapper.write |= 1;
        getHandleruiannotations gethandleruiannotations = this.RemoteActionCompatParcelizer;
        if (gethandleruiannotations != null && gethandleruiannotations.IconCompatParcelizer() && gethandleruiannotations != gethandleruiannotationsMediaSessionCompatResultReceiverWrapper) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{gethandleruiannotations.read, gethandleruiannotationsMediaSessionCompatResultReceiverWrapper.read}, getCieXyz.write())).booleanValue()) {
                ArrayList arrayList = this.serializer;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList();
                    this.serializer = arrayList2;
                    arrayList2.add(gethandleruiannotationsMediaSessionCompatResultReceiverWrapper);
                    return;
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    getHandleruiannotations gethandleruiannotations2 = (getHandleruiannotations) arrayList.get(i);
                    if (gethandleruiannotations2 != null && gethandleruiannotations2.IconCompatParcelizer() && gethandleruiannotations2 != gethandleruiannotationsMediaSessionCompatResultReceiverWrapper) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{gethandleruiannotations2.read, gethandleruiannotationsMediaSessionCompatResultReceiverWrapper.read}, getCieXyz.write())).booleanValue()) {
                        }
                    }
                    arrayList.set(i, gethandleruiannotationsMediaSessionCompatResultReceiverWrapper);
                    return;
                }
                arrayList.add(gethandleruiannotationsMediaSessionCompatResultReceiverWrapper);
                return;
            }
        }
        this.RemoteActionCompatParcelizer = gethandleruiannotationsMediaSessionCompatResultReceiverWrapper;
    }

    @Override // o.r8lambdam6kPPA3z8dHTentc0gq2uQ_Iyco
    public final /* synthetic */ Object RemoteActionCompatParcelizer(Object obj, Object obj2, Boolean bool, Object obj3, Object obj4, Object obj5, getPostalCode getpostalcode, Integer num) {
        return read(obj, obj2, bool, obj3, obj4, obj5, getpostalcode, num.intValue());
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return RemoteActionCompatParcelizer(obj, (getBirthDateFull) obj2, ((Number) obj3).intValue());
    }

    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return serializer(obj, obj2, (getBirthDateFull) obj3, ((Number) obj4).intValue());
    }

    @Override // o.r8lambdagdus9EWsajL31FKA79xR2Pb0c4E
    public final /* synthetic */ Object serializer(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return write(obj, obj2, obj3, (getBirthDateFull) obj4, ((Number) obj5).intValue());
    }

    @Override // o.r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM
    public final /* synthetic */ Object read(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return RemoteActionCompatParcelizer(obj, obj2, obj3, obj4, (getBirthDateFull) obj5, ((Number) obj6).intValue());
    }

    @Override // o.r8lambdai4uHhuxI_lBaIwBHW2e2KANuhE
    public final /* synthetic */ Object RemoteActionCompatParcelizer(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
        return IconCompatParcelizer(obj, obj2, obj3, obj4, obj5, (getBirthDateFull) obj6, ((Number) serializable).intValue());
    }

    public final Object serializer(getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(this.IconCompatParcelizer);
        read(getpostalcode);
        if (getpostalcode.read(this)) {
            i2 = coil3.ExtrasKt.read(2, 0);
        } else {
            i2 = coil3.ExtrasKt.read(1, 0);
        }
        Object obj = this.write;
        obj.getClass();
        int iWrite = BehaviorSubject.BehaviorDisposable.write();
        int iWrite2 = BehaviorSubject.BehaviorDisposable.write();
        pauseWebviewIfNecessarylambda10.read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{2, obj}, BehaviorSubject.BehaviorDisposable.write(), iWrite, -722072991, 722072991, iWrite2);
        Object objInvoke = ((r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj).invoke(getpostalcode, Integer.valueOf(i | i2));
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new ComposableLambdaImpl$invoke$1(2, this, DragAndDropTargetModifierNode.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return objInvoke;
    }

    public final Object RemoteActionCompatParcelizer(Object obj, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(this.IconCompatParcelizer);
        read(getpostalcode);
        if (getpostalcode.read(this)) {
            i2 = coil3.ExtrasKt.read(2, 1);
        } else {
            i2 = coil3.ExtrasKt.read(1, 1);
        }
        Object obj2 = this.write;
        obj2.getClass();
        int iWrite = BehaviorSubject.BehaviorDisposable.write();
        int iWrite2 = BehaviorSubject.BehaviorDisposable.write();
        pauseWebviewIfNecessarylambda10.read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{3, obj2}, BehaviorSubject.BehaviorDisposable.write(), iWrite, -722072991, 722072991, iWrite2);
        Object objInvoke = ((r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj2).invoke(obj, getpostalcode, Integer.valueOf(i2 | i));
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new SizeKt(i, 4, this, obj);
        }
        return objInvoke;
    }

    public final Object serializer(Object obj, Object obj2, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(this.IconCompatParcelizer);
        read(getpostalcode);
        if (getpostalcode.read(this)) {
            i2 = coil3.ExtrasKt.read(2, 2);
        } else {
            i2 = coil3.ExtrasKt.read(1, 2);
        }
        Object obj3 = this.write;
        obj3.getClass();
        int iWrite = BehaviorSubject.BehaviorDisposable.write();
        int iWrite2 = BehaviorSubject.BehaviorDisposable.write();
        pauseWebviewIfNecessarylambda10.read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{4, obj3}, BehaviorSubject.BehaviorDisposable.write(), iWrite, -722072991, 722072991, iWrite2);
        Object objInvoke = ((r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) obj3).invoke(obj, obj2, getpostalcode, Integer.valueOf(i2 | i));
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getInternalPaintui_graphics(i, 1, this, obj, obj2);
        }
        return objInvoke;
    }

    public final Object write(Object obj, Object obj2, Object obj3, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(this.IconCompatParcelizer);
        read(getpostalcode);
        if (getpostalcode.read(this)) {
            i2 = coil3.ExtrasKt.read(2, 3);
        } else {
            i2 = coil3.ExtrasKt.read(1, 3);
        }
        Object obj4 = this.write;
        obj4.getClass();
        int iWrite = BehaviorSubject.BehaviorDisposable.write();
        int iWrite2 = BehaviorSubject.BehaviorDisposable.write();
        pauseWebviewIfNecessarylambda10.read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{5, obj4}, BehaviorSubject.BehaviorDisposable.write(), iWrite, -722072991, 722072991, iWrite2);
        Object objSerializer = ((r8lambdagdus9EWsajL31FKA79xR2Pb0c4E) obj4).serializer(obj, obj2, obj3, getpostalcode, Integer.valueOf(i2 | i));
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getHasCamera(this, obj, obj2, obj3, i, 3);
        }
        return objSerializer;
    }

    public final Object RemoteActionCompatParcelizer(Object obj, Object obj2, Object obj3, Object obj4, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(this.IconCompatParcelizer);
        read(getpostalcode);
        if (getpostalcode.read(this)) {
            i2 = coil3.ExtrasKt.read(2, 4);
        } else {
            i2 = coil3.ExtrasKt.read(1, 4);
        }
        Object obj5 = this.write;
        obj5.getClass();
        int iWrite = BehaviorSubject.BehaviorDisposable.write();
        int iWrite2 = BehaviorSubject.BehaviorDisposable.write();
        pauseWebviewIfNecessarylambda10.read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{6, obj5}, BehaviorSubject.BehaviorDisposable.write(), iWrite, -722072991, 722072991, iWrite2);
        Object obj6 = ((r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM) obj5).read(obj, obj2, obj3, obj4, getpostalcode, Integer.valueOf(i | i2));
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new findNearestNeighbor(this, obj, obj2, obj3, obj4, i, 1);
        }
        return obj6;
    }

    public final Object IconCompatParcelizer(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(this.IconCompatParcelizer);
        read(getpostalcode);
        if (getpostalcode.read(this)) {
            i2 = coil3.ExtrasKt.read(2, 5);
        } else {
            i2 = coil3.ExtrasKt.read(1, 5);
        }
        Object obj6 = this.write;
        obj6.getClass();
        int iWrite = BehaviorSubject.BehaviorDisposable.write();
        int iWrite2 = BehaviorSubject.BehaviorDisposable.write();
        pauseWebviewIfNecessarylambda10.read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{7, obj6}, BehaviorSubject.BehaviorDisposable.write(), iWrite, -722072991, 722072991, iWrite2);
        Object objRemoteActionCompatParcelizer = ((r8lambdai4uHhuxI_lBaIwBHW2e2KANuhE) obj6).RemoteActionCompatParcelizer(obj, obj2, obj3, obj4, obj5, getpostalcode, Integer.valueOf(i | i2));
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new DragAndDropSourceModifierNode(this, obj, obj2, obj3, obj4, obj5, i, 0);
        }
        return objRemoteActionCompatParcelizer;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return serializer((getBirthDateFull) obj, ((Number) obj2).intValue());
    }
}
