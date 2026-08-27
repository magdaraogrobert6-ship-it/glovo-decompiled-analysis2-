package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Iterator;
import kotlin.collections.AbstractList;

/* JADX INFO: loaded from: classes4.dex */
public class r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44 implements Iterator, displayInAppMessagelambda121 {
    public final Object IconCompatParcelizer;
    public final /* synthetic */ int read = 2;
    public int serializer;

    public r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44(r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda) {
        this.IconCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda;
        this.serializer = r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.read;
        Object obj = this.IconCompatParcelizer;
        if (i == 0) {
            return this.serializer < ((Object[]) obj).length;
        }
        if (i == 1) {
            return this.serializer < ((AbstractList) obj).size();
        }
        if (i != 2) {
            return this.serializer > 0;
        }
        return ((Iterator) obj).hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.read;
        if (i == 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        if (i == 1) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        if (i == 2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.read;
        Object obj = this.IconCompatParcelizer;
        if (i == 0) {
            try {
                int i2 = this.serializer;
                this.serializer = i2 + 1;
                return ((Object[]) obj)[i2];
            } catch (ArrayIndexOutOfBoundsException e) {
                this.serializer--;
                DrawableTransformation.write(e.getMessage());
                return null;
            }
        }
        if (i == 1) {
            if (!hasNext()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.read();
                return null;
            }
            int i3 = this.serializer;
            this.serializer = i3 + 1;
            return ((AbstractList) obj).get(i3);
        }
        if (i != 2) {
            r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = (r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) obj;
            int iIconCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer();
            int i4 = this.serializer;
            this.serializer = i4 - 1;
            return r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(iIconCompatParcelizer - i4);
        }
        int i5 = this.serializer;
        this.serializer = i5 + 1;
        if (i5 >= 0) {
            return new isItemViewSwipeEnabled(i5, ((Iterator) obj).next());
        }
        androidx.sqlite.SQLite.serializer();
        throw null;
    }

    public r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44(Iterator it) {
        it.getClass();
        this.IconCompatParcelizer = it;
    }

    public r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44(AbstractList abstractList) {
        this.IconCompatParcelizer = abstractList;
    }

    public r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44(Object[] objArr) {
        objArr.getClass();
        this.IconCompatParcelizer = objArr;
    }
}
