package o;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class EmptyContentCardsAdapterNetworkUnavailableViewHolder implements Iterator, displayInAppMessagelambda121 {
    public final Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;
    public int write;

    public EmptyContentCardsAdapterNetworkUnavailableViewHolder(r8lambdazCd1z82txJou5vkO0oL_06hVCA r8lambdazcd1z82txjou5vko0ol_06hvca) {
        this.serializer = 6;
        this.RemoteActionCompatParcelizer = r8lambdazcd1z82txjou5vko0ol_06hvca;
        this.write = r8lambdazcd1z82txjou5vko0ol_06hvca.MediaDescriptionCompat;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.serializer;
        Object obj = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            return this.write < ((int[]) obj).length;
        }
        if (i == 1) {
            return this.write < ((accessprocessDragStart) obj).write();
        }
        if (i == 2) {
            return this.write < ((ViewGroup) obj).getChildCount();
        }
        if (i == 3) {
            return this.write < ((byte[]) obj).length;
        }
        if (i == 4) {
            return this.write < ((long[]) obj).length;
        }
        if (i != 5) {
            return this.write > 0;
        }
        return this.write < ((short[]) obj).length;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.serializer;
        if (i == 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        if (i == 1) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        if (i == 2) {
            ViewGroup viewGroup = (ViewGroup) this.RemoteActionCompatParcelizer;
            int i2 = this.write - 1;
            this.write = i2;
            viewGroup.removeViewAt(i2);
            return;
        }
        if (i == 3) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        if (i == 4) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        if (i == 5) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.serializer;
        Object obj = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            int i2 = this.write;
            int[] iArr = (int[]) obj;
            if (i2 < iArr.length) {
                this.write = i2 + 1;
                return new replaceCards(iArr[i2]);
            }
            DrawableTransformation.write(String.valueOf(i2));
            return null;
        }
        if (i == 1) {
            int i3 = this.write;
            this.write = i3 + 1;
            return ((accessprocessDragStart) obj).read(i3);
        }
        if (i == 2) {
            int i4 = this.write;
            this.write = i4 + 1;
            View childAt = ((ViewGroup) obj).getChildAt(i4);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }
        if (i == 3) {
            int i5 = this.write;
            byte[] bArr = (byte[]) obj;
            if (i5 < bArr.length) {
                this.write = i5 + 1;
                return new setImpressedCardIds(bArr[i5]);
            }
            DrawableTransformation.write(String.valueOf(i5));
            return null;
        }
        if (i == 4) {
            int i6 = this.write;
            long[] jArr = (long[]) obj;
            if (i6 < jArr.length) {
                this.write = i6 + 1;
                return new describeContents(jArr[i6]);
            }
            DrawableTransformation.write(String.valueOf(i6));
            return null;
        }
        if (i != 5) {
            r8lambdazCd1z82txJou5vkO0oL_06hVCA r8lambdazcd1z82txjou5vko0ol_06hvca = (r8lambdazCd1z82txJou5vkO0oL_06hVCA) obj;
            int i7 = r8lambdazcd1z82txjou5vko0ol_06hvca.MediaDescriptionCompat;
            int i8 = this.write;
            this.write = i8 - 1;
            return r8lambdazcd1z82txjou5vko0ol_06hvca.PlaybackStateCompat[i7 - i8];
        }
        int i9 = this.write;
        short[] sArr = (short[]) obj;
        if (i9 < sArr.length) {
            this.write = i9 + 1;
            return new DefaultContentCardsUpdateHandler(sArr[i9]);
        }
        DrawableTransformation.write(String.valueOf(i9));
        return null;
    }

    public /* synthetic */ EmptyContentCardsAdapterNetworkUnavailableViewHolder(int i, Object obj) {
        this.serializer = i;
        this.RemoteActionCompatParcelizer = obj;
    }
}
