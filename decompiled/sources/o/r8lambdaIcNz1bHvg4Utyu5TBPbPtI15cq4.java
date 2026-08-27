package o;

import com.braze.IBraze$$ExternalSyntheticBUOutline0;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdaIcNz1bHvg4Utyu5TBPbPtI15cq4 implements r8lambdahI3Gyneb8JrZ6jncRc55ARFUQkE {
    public r8lambdahI3Gyneb8JrZ6jncRc55ARFUQkE[] write;

    @Override // o.r8lambdahI3Gyneb8JrZ6jncRc55ARFUQkE
    public final boolean IconCompatParcelizer(Class cls) {
        for (r8lambdahI3Gyneb8JrZ6jncRc55ARFUQkE r8lambdahi3gyneb8jrz6jncrc55arfuqke : this.write) {
            if (r8lambdahi3gyneb8jrz6jncrc55arfuqke.IconCompatParcelizer(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // o.r8lambdahI3Gyneb8JrZ6jncRc55ARFUQkE
    public final DataStoreValueType write(Class cls) {
        for (r8lambdahI3Gyneb8JrZ6jncRc55ARFUQkE r8lambdahi3gyneb8jrz6jncrc55arfuqke : this.write) {
            if (r8lambdahi3gyneb8jrz6jncrc55arfuqke.IconCompatParcelizer(cls)) {
                return r8lambdahi3gyneb8jrz6jncrc55arfuqke.write(cls);
            }
        }
        IBraze$$ExternalSyntheticBUOutline0.m("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }
}
