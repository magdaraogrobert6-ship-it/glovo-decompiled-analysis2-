package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.re2j.Machine$Queue;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class withInfiniteAnimationFrameNanos {
    public boolean IconCompatParcelizer;
    public final Machine$Queue MediaBrowserCompatMediaItem;
    public final Machine$Queue MediaDescriptionCompat;
    public final InspectableModifierEnd MediaMetadataCompat;
    public final isActive RatingCompat;
    public int RemoteActionCompatParcelizer;
    public int[] read;
    public int serializer;
    public InfiniteAnimationPolicyKt[] write = new InfiniteAnimationPolicyKt[10];

    public final void IconCompatParcelizer(Machine$Queue machine$Queue, int i) {
        int i2 = this.serializer + (machine$Queue.read - i);
        InfiniteAnimationPolicyKt[] infiniteAnimationPolicyKtArr = this.write;
        if (infiniteAnimationPolicyKtArr.length < i2) {
            this.write = (InfiniteAnimationPolicyKt[]) Arrays.copyOf(infiniteAnimationPolicyKtArr, Math.max(infiniteAnimationPolicyKtArr.length * 2, i2));
        }
        while (i < machine$Queue.read) {
            InfiniteAnimationPolicyKt infiniteAnimationPolicyKt = ((InfiniteAnimationPolicyKt[]) machine$Queue.IconCompatParcelizer)[i];
            if (infiniteAnimationPolicyKt != null) {
                InfiniteAnimationPolicyKt[] infiniteAnimationPolicyKtArr2 = this.write;
                int i3 = this.serializer;
                infiniteAnimationPolicyKtArr2[i3] = infiniteAnimationPolicyKt;
                this.serializer = i3 + 1;
            }
            i++;
        }
        machine$Queue.read = 0;
    }

    public withInfiniteAnimationFrameNanos(InspectableModifierEnd inspectableModifierEnd) {
        isActive isactive = inspectableModifierEnd.MediaSessionCompatQueueItem;
        this.RatingCompat = isactive;
        this.MediaMetadataCompat = inspectableModifierEnd;
        this.MediaDescriptionCompat = new Machine$Queue(isactive.write);
        this.MediaBrowserCompatMediaItem = new Machine$Queue(isactive.write);
        int i = isactive.read;
        this.read = new int[i < 2 ? 2 : i];
    }

    public final InfiniteAnimationPolicyKt RemoteActionCompatParcelizer(Machine$Queue machine$Queue, int i, int i2, int[] iArr, int i3, InfiniteAnimationPolicyKt infiniteAnimationPolicyKt) {
        int[] iArr2;
        InfiniteAnimationPolicyKt infiniteAnimationPolicyKt2;
        InfiniteAnimationPolicyKt infiniteAnimationPolicyKt3 = infiniteAnimationPolicyKt;
        if (i != 0) {
            int[] iArr3 = (int[]) machine$Queue.write;
            InfiniteAnimationPolicyKt[] infiniteAnimationPolicyKtArr = (InfiniteAnimationPolicyKt[]) machine$Queue.IconCompatParcelizer;
            int[] iArr4 = (int[]) machine$Queue.serializer;
            int i4 = iArr3[i];
            int i5 = machine$Queue.read;
            if (i4 >= i5 || iArr4[i4] != i) {
                machine$Queue.read = i5 + 1;
                iArr3[i] = i5;
                infiniteAnimationPolicyKtArr[i5] = null;
                iArr4[i5] = i;
                onSingleTapUp onsingletapup = ((onSingleTapUp[]) this.RatingCompat.RemoteActionCompatParcelizer)[i];
                switch (onsingletapup.IconCompatParcelizer) {
                    case 1:
                    case 2:
                        return RemoteActionCompatParcelizer(machine$Queue, onsingletapup.write, i2, iArr, i3, RemoteActionCompatParcelizer(machine$Queue, onsingletapup.RemoteActionCompatParcelizer, i2, iArr, i3, infiniteAnimationPolicyKt));
                    case 3:
                        int i6 = onsingletapup.write;
                        if (i6 < this.RemoteActionCompatParcelizer) {
                            int i7 = iArr[i6];
                            iArr[i6] = i2;
                            RemoteActionCompatParcelizer(machine$Queue, onsingletapup.RemoteActionCompatParcelizer, i2, iArr, i3, null);
                            iArr[onsingletapup.write] = i7;
                            return infiniteAnimationPolicyKt3;
                        }
                        return RemoteActionCompatParcelizer(machine$Queue, onsingletapup.RemoteActionCompatParcelizer, i2, iArr, i3, infiniteAnimationPolicyKt);
                    case 4:
                        if ((onsingletapup.write & (~i3)) == 0) {
                            return RemoteActionCompatParcelizer(machine$Queue, onsingletapup.RemoteActionCompatParcelizer, i2, iArr, i3, infiniteAnimationPolicyKt);
                        }
                    case 5:
                        return infiniteAnimationPolicyKt3;
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        if (infiniteAnimationPolicyKt3 == null) {
                            int i8 = this.serializer;
                            if (i8 > 0) {
                                int i9 = i8 - 1;
                                this.serializer = i9;
                                infiniteAnimationPolicyKt2 = this.write[i9];
                            } else {
                                int length = this.read.length;
                                InfiniteAnimationPolicyKt infiniteAnimationPolicyKt4 = new InfiniteAnimationPolicyKt();
                                infiniteAnimationPolicyKt4.RemoteActionCompatParcelizer = new int[length];
                                infiniteAnimationPolicyKt2 = infiniteAnimationPolicyKt4;
                            }
                            infiniteAnimationPolicyKt2.write = onsingletapup;
                            infiniteAnimationPolicyKt3 = infiniteAnimationPolicyKt2;
                        } else {
                            infiniteAnimationPolicyKt3.write = onsingletapup;
                        }
                        int i10 = this.RemoteActionCompatParcelizer;
                        if (i10 > 0 && (iArr2 = infiniteAnimationPolicyKt3.RemoteActionCompatParcelizer) != iArr) {
                            System.arraycopy(iArr, 0, iArr2, 0, i10);
                        }
                        infiniteAnimationPolicyKtArr[i5] = infiniteAnimationPolicyKt3;
                        return null;
                    case 7:
                        return RemoteActionCompatParcelizer(machine$Queue, onsingletapup.RemoteActionCompatParcelizer, i2, iArr, i3, infiniteAnimationPolicyKt);
                    default:
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("unhandled");
                        return null;
                }
            }
        }
        return infiniteAnimationPolicyKt3;
    }

    public final void serializer(InfiniteAnimationPolicyKt infiniteAnimationPolicyKt) {
        InfiniteAnimationPolicyKt[] infiniteAnimationPolicyKtArr = this.write;
        if (infiniteAnimationPolicyKtArr.length <= this.serializer) {
            this.write = (InfiniteAnimationPolicyKt[]) Arrays.copyOf(infiniteAnimationPolicyKtArr, infiniteAnimationPolicyKtArr.length * 2);
        }
        InfiniteAnimationPolicyKt[] infiniteAnimationPolicyKtArr2 = this.write;
        int i = this.serializer;
        infiniteAnimationPolicyKtArr2[i] = infiniteAnimationPolicyKt;
        this.serializer = i + 1;
    }
}
