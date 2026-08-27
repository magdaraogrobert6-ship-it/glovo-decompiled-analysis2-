package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdaTHTOEa14x1l8B0nOAgpnO_BTpFQ implements Iterator, displayInAppMessagelambda121 {
    public final accessgetShouldIgnoreOpenAndCloseLifecycleCallbacksp[] RemoteActionCompatParcelizer;
    public int serializer;
    public boolean write;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.write;
    }

    public final int write(int i) {
        accessgetShouldIgnoreOpenAndCloseLifecycleCallbacksp[] accessgetshouldignoreopenandcloselifecyclecallbackspArr = this.RemoteActionCompatParcelizer;
        accessgetShouldIgnoreOpenAndCloseLifecycleCallbacksp accessgetshouldignoreopenandcloselifecyclecallbacksp = accessgetshouldignoreopenandcloselifecyclecallbackspArr[i];
        int i2 = accessgetshouldignoreopenandcloselifecyclecallbacksp.serializer;
        if (i2 < accessgetshouldignoreopenandcloselifecyclecallbacksp.read) {
            return i;
        }
        Object[] objArr = accessgetshouldignoreopenandcloselifecyclecallbacksp.RemoteActionCompatParcelizer;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        r8lambdazCa9f5hibLISCeY3u5lKyCauzY r8lambdazca9f5hibliscey3u5lkycauzy = (r8lambdazCa9f5hibLISCeY3u5lKyCauzY) obj;
        if (i == 6) {
            accessgetShouldIgnoreOpenAndCloseLifecycleCallbacksp accessgetshouldignoreopenandcloselifecyclecallbacksp2 = accessgetshouldignoreopenandcloselifecyclecallbackspArr[i + 1];
            Object[] objArr2 = r8lambdazca9f5hibliscey3u5lkycauzy.IconCompatParcelizer;
            int length2 = objArr2.length;
            accessgetshouldignoreopenandcloselifecyclecallbacksp2.getClass();
            accessgetshouldignoreopenandcloselifecyclecallbacksp2.RemoteActionCompatParcelizer = objArr2;
            accessgetshouldignoreopenandcloselifecyclecallbacksp2.read = length2;
            accessgetshouldignoreopenandcloselifecyclecallbacksp2.serializer = 0;
        } else {
            accessgetShouldIgnoreOpenAndCloseLifecycleCallbacksp accessgetshouldignoreopenandcloselifecyclecallbacksp3 = accessgetshouldignoreopenandcloselifecyclecallbackspArr[i + 1];
            Object[] objArr3 = r8lambdazca9f5hibliscey3u5lkycauzy.IconCompatParcelizer;
            int iBitCount = Integer.bitCount(r8lambdazca9f5hibliscey3u5lkycauzy.RemoteActionCompatParcelizer);
            accessgetshouldignoreopenandcloselifecyclecallbacksp3.getClass();
            objArr3.getClass();
            accessgetshouldignoreopenandcloselifecyclecallbacksp3.RemoteActionCompatParcelizer = objArr3;
            accessgetshouldignoreopenandcloselifecyclecallbacksp3.read = iBitCount * 2;
            accessgetshouldignoreopenandcloselifecyclecallbacksp3.serializer = 0;
        }
        return write(i + 1);
    }

    public final void write() {
        int i = this.serializer;
        accessgetShouldIgnoreOpenAndCloseLifecycleCallbacksp[] accessgetshouldignoreopenandcloselifecyclecallbackspArr = this.RemoteActionCompatParcelizer;
        accessgetShouldIgnoreOpenAndCloseLifecycleCallbacksp accessgetshouldignoreopenandcloselifecyclecallbacksp = accessgetshouldignoreopenandcloselifecyclecallbackspArr[i];
        if (accessgetshouldignoreopenandcloselifecyclecallbacksp.serializer < accessgetshouldignoreopenandcloselifecyclecallbacksp.read) {
            return;
        }
        while (-1 < i) {
            int iWrite = write(i);
            if (iWrite == -1) {
                accessgetShouldIgnoreOpenAndCloseLifecycleCallbacksp accessgetshouldignoreopenandcloselifecyclecallbacksp2 = accessgetshouldignoreopenandcloselifecyclecallbackspArr[i];
                int i2 = accessgetshouldignoreopenandcloselifecyclecallbacksp2.serializer;
                Object[] objArr = accessgetshouldignoreopenandcloselifecyclecallbacksp2.RemoteActionCompatParcelizer;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    accessgetshouldignoreopenandcloselifecyclecallbacksp2.serializer = i2 + 1;
                    iWrite = write(i);
                }
            }
            if (iWrite != -1) {
                this.serializer = iWrite;
                return;
            }
            if (i > 0) {
                accessgetShouldIgnoreOpenAndCloseLifecycleCallbacksp accessgetshouldignoreopenandcloselifecyclecallbacksp3 = accessgetshouldignoreopenandcloselifecyclecallbackspArr[i - 1];
                int i3 = accessgetshouldignoreopenandcloselifecyclecallbacksp3.serializer;
                int length2 = accessgetshouldignoreopenandcloselifecyclecallbacksp3.RemoteActionCompatParcelizer.length;
                accessgetshouldignoreopenandcloselifecyclecallbacksp3.serializer = i3 + 1;
            }
            accessgetShouldIgnoreOpenAndCloseLifecycleCallbacksp accessgetshouldignoreopenandcloselifecyclecallbacksp4 = accessgetshouldignoreopenandcloselifecyclecallbackspArr[i];
            Object[] objArr2 = r8lambdazCa9f5hibLISCeY3u5lKyCauzY.read.IconCompatParcelizer;
            accessgetshouldignoreopenandcloselifecyclecallbacksp4.getClass();
            objArr2.getClass();
            accessgetshouldignoreopenandcloselifecyclecallbacksp4.RemoteActionCompatParcelizer = objArr2;
            accessgetshouldignoreopenandcloselifecyclecallbacksp4.read = 0;
            accessgetshouldignoreopenandcloselifecyclecallbacksp4.serializer = 0;
            i--;
        }
        this.write = false;
    }

    public r8lambdaTHTOEa14x1l8B0nOAgpnO_BTpFQ(r8lambdazCa9f5hibLISCeY3u5lKyCauzY r8lambdazca9f5hibliscey3u5lkycauzy, accessgetShouldIgnoreOpenAndCloseLifecycleCallbacksp[] accessgetshouldignoreopenandcloselifecyclecallbackspArr) {
        r8lambdazca9f5hibliscey3u5lkycauzy.getClass();
        this.RemoteActionCompatParcelizer = accessgetshouldignoreopenandcloselifecyclecallbackspArr;
        this.write = true;
        accessgetShouldIgnoreOpenAndCloseLifecycleCallbacksp accessgetshouldignoreopenandcloselifecyclecallbacksp = accessgetshouldignoreopenandcloselifecyclecallbackspArr[0];
        Object[] objArr = r8lambdazca9f5hibliscey3u5lkycauzy.IconCompatParcelizer;
        int iBitCount = Integer.bitCount(r8lambdazca9f5hibliscey3u5lkycauzy.RemoteActionCompatParcelizer);
        accessgetshouldignoreopenandcloselifecyclecallbacksp.getClass();
        objArr.getClass();
        accessgetshouldignoreopenandcloselifecyclecallbacksp.RemoteActionCompatParcelizer = objArr;
        accessgetshouldignoreopenandcloselifecyclecallbacksp.read = iBitCount * 2;
        accessgetshouldignoreopenandcloselifecyclecallbacksp.serializer = 0;
        this.serializer = 0;
        write();
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.write) {
            ScreenStartObserver$$ExternalSyntheticLambda0.read();
            return null;
        }
        Object next = this.RemoteActionCompatParcelizer[this.serializer].next();
        write();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
