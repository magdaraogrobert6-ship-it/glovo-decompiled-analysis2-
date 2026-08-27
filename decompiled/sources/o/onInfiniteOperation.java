package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class onInfiniteOperation {
    public static final int[] IconCompatParcelizer = {0, 9, 11, 1114111};
    public static final int[] serializer = {0, 1114111};
    public Object write;

    public InfiniteAnimationPolicyDefaultImpls IconCompatParcelizer() {
        InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImplsWrite = write(7);
        infiniteAnimationPolicyDefaultImplsWrite.RemoteActionCompatParcelizer = infiniteAnimationPolicyDefaultImplsWrite.serializer << 1;
        return infiniteAnimationPolicyDefaultImplsWrite;
    }

    public InfiniteAnimationPolicyDefaultImpls RemoteActionCompatParcelizer(int i) {
        InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImplsWrite = write(4);
        isActive isactive = (isActive) this.write;
        int i2 = infiniteAnimationPolicyDefaultImplsWrite.serializer;
        ((onSingleTapUp[]) isactive.RemoteActionCompatParcelizer)[i2].write = i;
        infiniteAnimationPolicyDefaultImplsWrite.RemoteActionCompatParcelizer = i2 << 1;
        return infiniteAnimationPolicyDefaultImplsWrite;
    }

    public InfiniteAnimationPolicyDefaultImpls RemoteActionCompatParcelizer(InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImpls, boolean z) {
        InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImplsWrite = write(1);
        isActive isactive = (isActive) this.write;
        int i = infiniteAnimationPolicyDefaultImplsWrite.serializer;
        onSingleTapUp onsingletapup = ((onSingleTapUp[]) isactive.RemoteActionCompatParcelizer)[i];
        if (z) {
            onsingletapup.write = infiniteAnimationPolicyDefaultImpls.serializer;
            infiniteAnimationPolicyDefaultImplsWrite.RemoteActionCompatParcelizer = i << 1;
        } else {
            onsingletapup.RemoteActionCompatParcelizer = infiniteAnimationPolicyDefaultImpls.serializer;
            infiniteAnimationPolicyDefaultImplsWrite.RemoteActionCompatParcelizer = (i << 1) | 1;
        }
        isactive.serializer(infiniteAnimationPolicyDefaultImpls.RemoteActionCompatParcelizer, i);
        return infiniteAnimationPolicyDefaultImplsWrite;
    }

    public InfiniteAnimationPolicyDefaultImpls read(int i) {
        InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImplsWrite = write(3);
        int i2 = infiniteAnimationPolicyDefaultImplsWrite.serializer;
        infiniteAnimationPolicyDefaultImplsWrite.RemoteActionCompatParcelizer = i2 << 1;
        isActive isactive = (isActive) this.write;
        ((onSingleTapUp[]) isactive.RemoteActionCompatParcelizer)[i2].write = i;
        int i3 = i + 1;
        if (isactive.read < i3) {
            isactive.read = i3;
        }
        return infiniteAnimationPolicyDefaultImplsWrite;
    }

    public InfiniteAnimationPolicyDefaultImpls read(int[] iArr, int i) {
        InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImplsWrite = write(8);
        isActive isactive = (isActive) this.write;
        int i2 = infiniteAnimationPolicyDefaultImplsWrite.serializer;
        onSingleTapUp onsingletapup = ((onSingleTapUp[]) isactive.RemoteActionCompatParcelizer)[i2];
        onsingletapup.read = iArr;
        int i3 = i & 1;
        if (iArr.length != 1 || InspectableValue.read(iArr[0]) == iArr[0]) {
            i3 = 0;
        }
        onsingletapup.write = i3;
        infiniteAnimationPolicyDefaultImplsWrite.RemoteActionCompatParcelizer = i2 << 1;
        if (((i3 & 1) == 0 && iArr.length == 1) || (iArr.length == 2 && iArr[0] == iArr[1])) {
            onsingletapup.IconCompatParcelizer = 9;
            return infiniteAnimationPolicyDefaultImplsWrite;
        }
        if (iArr.length == 2 && iArr[0] == 0 && iArr[1] == 1114111) {
            onsingletapup.IconCompatParcelizer = 10;
            return infiniteAnimationPolicyDefaultImplsWrite;
        }
        if (iArr.length == 4 && iArr[0] == 0 && iArr[1] == 9 && iArr[2] == 11 && iArr[3] == 1114111) {
            onsingletapup.IconCompatParcelizer = 11;
        }
        return infiniteAnimationPolicyDefaultImplsWrite;
    }

    public InfiniteAnimationPolicyDefaultImpls serializer(InputMethodSessioncreateInputConnection11 inputMethodSessioncreateInputConnection11) {
        int i;
        isActive isactive = (isActive) this.write;
        InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImpls = null;
        int i2 = 0;
        switch (accessgetKeyjd.RemoteActionCompatParcelizer[inputMethodSessioncreateInputConnection11.MediaMetadataCompat.ordinal()]) {
            case 1:
                return new InfiniteAnimationPolicyDefaultImpls(0, 0);
            case 2:
                return IconCompatParcelizer();
            case 3:
                int[] iArr = inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem;
                if (iArr.length == 0) {
                    return IconCompatParcelizer();
                }
                int length = iArr.length;
                while (i2 < length) {
                    InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImplsWrite = read(new int[]{iArr[i2]}, inputMethodSessioncreateInputConnection11.RemoteActionCompatParcelizer);
                    if (infiniteAnimationPolicyDefaultImpls != null) {
                        infiniteAnimationPolicyDefaultImplsWrite = write(infiniteAnimationPolicyDefaultImpls, infiniteAnimationPolicyDefaultImplsWrite);
                    }
                    infiniteAnimationPolicyDefaultImpls = infiniteAnimationPolicyDefaultImplsWrite;
                    i2++;
                }
                return infiniteAnimationPolicyDefaultImpls;
            case 4:
                return read(inputMethodSessioncreateInputConnection11.MediaSessionCompatQueueItem, inputMethodSessioncreateInputConnection11.RemoteActionCompatParcelizer);
            case 5:
                return read(IconCompatParcelizer, 0);
            case 6:
                return read(serializer, 0);
            case 7:
                return RemoteActionCompatParcelizer(1);
            case 8:
                return RemoteActionCompatParcelizer(2);
            case 9:
                return RemoteActionCompatParcelizer(4);
            case 10:
                return RemoteActionCompatParcelizer(8);
            case 11:
                return RemoteActionCompatParcelizer(16);
            case 12:
                return RemoteActionCompatParcelizer(32);
            case 13:
                return write(write(read(inputMethodSessioncreateInputConnection11.read << 1), serializer(inputMethodSessioncreateInputConnection11.MediaBrowserCompatMediaItem[0])), read((inputMethodSessioncreateInputConnection11.read << 1) | 1));
            case 14:
                return RemoteActionCompatParcelizer(serializer(inputMethodSessioncreateInputConnection11.MediaBrowserCompatMediaItem[0]), (inputMethodSessioncreateInputConnection11.RemoteActionCompatParcelizer & 32) != 0);
            case 15:
                InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImplsSerializer = serializer(inputMethodSessioncreateInputConnection11.MediaBrowserCompatMediaItem[0]);
                return new InfiniteAnimationPolicyDefaultImpls(infiniteAnimationPolicyDefaultImplsSerializer.serializer, RemoteActionCompatParcelizer(infiniteAnimationPolicyDefaultImplsSerializer, (inputMethodSessioncreateInputConnection11.RemoteActionCompatParcelizer & 32) != 0).RemoteActionCompatParcelizer);
            case 16:
                InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImplsSerializer2 = serializer(inputMethodSessioncreateInputConnection11.MediaBrowserCompatMediaItem[0]);
                i2 = (inputMethodSessioncreateInputConnection11.RemoteActionCompatParcelizer & 32) != 0 ? 1 : 0;
                InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImplsWrite2 = write(1);
                int i3 = infiniteAnimationPolicyDefaultImplsWrite2.serializer;
                onSingleTapUp onsingletapup = ((onSingleTapUp[]) isactive.RemoteActionCompatParcelizer)[i3];
                if (i2 != 0) {
                    onsingletapup.write = infiniteAnimationPolicyDefaultImplsSerializer2.serializer;
                    infiniteAnimationPolicyDefaultImplsWrite2.RemoteActionCompatParcelizer = i3 << 1;
                } else {
                    onsingletapup.RemoteActionCompatParcelizer = infiniteAnimationPolicyDefaultImplsSerializer2.serializer;
                    infiniteAnimationPolicyDefaultImplsWrite2.RemoteActionCompatParcelizer = (i3 << 1) | 1;
                }
                infiniteAnimationPolicyDefaultImplsWrite2.RemoteActionCompatParcelizer = isactive.IconCompatParcelizer(infiniteAnimationPolicyDefaultImplsWrite2.RemoteActionCompatParcelizer, infiniteAnimationPolicyDefaultImplsSerializer2.RemoteActionCompatParcelizer);
                return infiniteAnimationPolicyDefaultImplsWrite2;
            case 17:
                InputMethodSessioncreateInputConnection11[] inputMethodSessioncreateInputConnection11Arr = inputMethodSessioncreateInputConnection11.MediaBrowserCompatMediaItem;
                if (inputMethodSessioncreateInputConnection11Arr.length == 0) {
                    return IconCompatParcelizer();
                }
                int length2 = inputMethodSessioncreateInputConnection11Arr.length;
                while (i2 < length2) {
                    InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImplsSerializer3 = serializer(inputMethodSessioncreateInputConnection11Arr[i2]);
                    if (infiniteAnimationPolicyDefaultImpls != null) {
                        infiniteAnimationPolicyDefaultImplsSerializer3 = write(infiniteAnimationPolicyDefaultImpls, infiniteAnimationPolicyDefaultImplsSerializer3);
                    }
                    infiniteAnimationPolicyDefaultImpls = infiniteAnimationPolicyDefaultImplsSerializer3;
                    i2++;
                }
                return infiniteAnimationPolicyDefaultImpls;
            case 18:
                InputMethodSessioncreateInputConnection11[] inputMethodSessioncreateInputConnection11Arr2 = inputMethodSessioncreateInputConnection11.MediaBrowserCompatMediaItem;
                if (inputMethodSessioncreateInputConnection11Arr2.length == 0) {
                    return IconCompatParcelizer();
                }
                int length3 = inputMethodSessioncreateInputConnection11Arr2.length;
                while (i2 < length3) {
                    InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImplsSerializer4 = serializer(inputMethodSessioncreateInputConnection11Arr2[i2]);
                    if (infiniteAnimationPolicyDefaultImpls == null || (i = infiniteAnimationPolicyDefaultImpls.serializer) == 0) {
                        infiniteAnimationPolicyDefaultImpls = infiniteAnimationPolicyDefaultImplsSerializer4;
                    } else if (infiniteAnimationPolicyDefaultImplsSerializer4.serializer != 0) {
                        InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImplsWrite3 = write(1);
                        onSingleTapUp onsingletapup2 = ((onSingleTapUp[]) isactive.RemoteActionCompatParcelizer)[infiniteAnimationPolicyDefaultImplsWrite3.serializer];
                        onsingletapup2.RemoteActionCompatParcelizer = i;
                        onsingletapup2.write = infiniteAnimationPolicyDefaultImplsSerializer4.serializer;
                        infiniteAnimationPolicyDefaultImplsWrite3.RemoteActionCompatParcelizer = isactive.IconCompatParcelizer(infiniteAnimationPolicyDefaultImpls.RemoteActionCompatParcelizer, infiniteAnimationPolicyDefaultImplsSerializer4.RemoteActionCompatParcelizer);
                        infiniteAnimationPolicyDefaultImpls = infiniteAnimationPolicyDefaultImplsWrite3;
                    }
                    i2++;
                }
                return infiniteAnimationPolicyDefaultImpls;
            default:
                ScreenStartObserver$$ExternalSyntheticLambda0.write("regexp: unhandled case in compile");
                return null;
        }
    }

    public InfiniteAnimationPolicyDefaultImpls write(int i) {
        isActive isactive = (isActive) this.write;
        int i2 = isactive.write;
        onSingleTapUp[] onsingletapupArr = (onSingleTapUp[]) isactive.RemoteActionCompatParcelizer;
        if (i2 >= onsingletapupArr.length) {
            isactive.RemoteActionCompatParcelizer = (onSingleTapUp[]) Arrays.copyOf(onsingletapupArr, onsingletapupArr.length * 2);
        }
        onSingleTapUp[] onsingletapupArr2 = (onSingleTapUp[]) isactive.RemoteActionCompatParcelizer;
        int i3 = isactive.write;
        onSingleTapUp onsingletapup = new onSingleTapUp();
        onsingletapup.IconCompatParcelizer = i;
        onsingletapupArr2[i3] = onsingletapup;
        isactive.write = i3 + 1;
        return new InfiniteAnimationPolicyDefaultImpls(i3, 0);
    }

    public InfiniteAnimationPolicyDefaultImpls write(InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImpls, InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImpls2) {
        int i;
        int i2 = infiniteAnimationPolicyDefaultImpls.serializer;
        if (i2 == 0 || (i = infiniteAnimationPolicyDefaultImpls2.serializer) == 0) {
            return new InfiniteAnimationPolicyDefaultImpls(0, 0);
        }
        ((isActive) this.write).serializer(infiniteAnimationPolicyDefaultImpls.RemoteActionCompatParcelizer, i);
        return new InfiniteAnimationPolicyDefaultImpls(i2, infiniteAnimationPolicyDefaultImpls2.RemoteActionCompatParcelizer);
    }
}
