package io.sentry.android.core;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss extends CopyOnWriteArrayList {
    public final /* synthetic */ r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg IconCompatParcelizer;

    public r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss(r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg) {
        this.IconCompatParcelizer = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8 = (r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) obj;
        boolean zAdd = super.add(r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8);
        if (Boolean.FALSE.equals(this.IconCompatParcelizer.read.read)) {
            r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8.RemoteActionCompatParcelizer();
            return zAdd;
        }
        if (Boolean.TRUE.equals(this.IconCompatParcelizer.read.read)) {
            r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8.D_();
        }
        return zAdd;
    }
}
