package o;

/* JADX INFO: loaded from: classes4.dex */
public final class addInAppMessageViewToViewGrouplambda23 extends accessgetShouldIgnoreOpenAndCloseLifecycleCallbacksp {
    public final ContentCardsDividerItemDecoration write;

    public addInAppMessageViewToViewGrouplambda23(ContentCardsDividerItemDecoration contentCardsDividerItemDecoration) {
        this.write = contentCardsDividerItemDecoration;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.serializer;
        this.serializer = i + 2;
        Object[] objArr = this.RemoteActionCompatParcelizer;
        return new r8lambdaVZe7H5z6ClbV3hZjfK9rquExLiM(this.write, objArr[i], objArr[i + 1]);
    }
}
