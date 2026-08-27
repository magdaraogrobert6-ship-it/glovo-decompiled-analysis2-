package o;

import io.reactivex.subjects.BehaviorSubject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class onViewRemoved implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ int read;
    public final /* synthetic */ BehaviorSubject write;

    public /* synthetic */ onViewRemoved(BehaviorSubject behaviorSubject, int i) {
        this.read = i;
        this.write = behaviorSubject;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 67;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        BehaviorSubject behaviorSubject = this.write;
        if (i4 == 0) {
            behaviorSubject.onNext(new getSceneString(obj));
            int i5 = IconCompatParcelizer + 61;
            serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return createfromparcel;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        if (i4 != 1) {
            Throwable th = (Throwable) obj;
            th.getClass();
            behaviorSubject.onNext(new getMaxWidth(th));
            return createfromparcel;
        }
        Throwable th2 = (Throwable) obj;
        th2.getClass();
        behaviorSubject.onNext(new getMaxWidth(th2));
        return createfromparcel;
    }
}
