package o;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class InfiniteAnimationPolicy {
    public static final HashMap RemoteActionCompatParcelizer;
    public static final HashMap read;
    public final int[] serializer;
    public final int write;

    public InfiniteAnimationPolicy(int[] iArr, int i) {
        this.write = i;
        this.serializer = iArr;
    }

    static {
        int[] iArr = {48, 57};
        int[] iArr2 = {9, 10, 12, 13, 32, 32};
        int[] iArr3 = {48, 57, 65, 90, 95, 95, 97, 122};
        HashMap map = new HashMap();
        RemoteActionCompatParcelizer = map;
        map.put("\\d", new InfiniteAnimationPolicy(iArr, 1));
        map.put("\\D", new InfiniteAnimationPolicy(iArr, -1));
        map.put("\\s", new InfiniteAnimationPolicy(iArr2, 1));
        map.put("\\S", new InfiniteAnimationPolicy(iArr2, -1));
        map.put("\\w", new InfiniteAnimationPolicy(iArr3, 1));
        map.put("\\W", new InfiniteAnimationPolicy(iArr3, -1));
        int[] iArr4 = {48, 57, 65, 90, 97, 122};
        int[] iArr5 = {65, 90, 97, 122};
        int[] iArr6 = {0, 127};
        int[] iArr7 = {9, 9, 32, 32};
        int[] iArr8 = {0, 31, 127, 127};
        int[] iArr9 = {48, 57};
        int[] iArr10 = {33, 126};
        int[] iArr11 = {97, 122};
        int[] iArr12 = {32, 126};
        int[] iArr13 = {33, 47, 58, 64, 91, 96, 123, 126};
        int[] iArr14 = {9, 13, 32, 32};
        int[] iArr15 = {65, 90};
        int[] iArr16 = {48, 57, 65, 90, 95, 95, 97, 122};
        int[] iArr17 = {48, 57, 65, 70, 97, 102};
        HashMap map2 = new HashMap();
        read = map2;
        map2.put("[:alnum:]", new InfiniteAnimationPolicy(iArr4, 1));
        map2.put("[:^alnum:]", new InfiniteAnimationPolicy(iArr4, -1));
        map2.put("[:alpha:]", new InfiniteAnimationPolicy(iArr5, 1));
        map2.put("[:^alpha:]", new InfiniteAnimationPolicy(iArr5, -1));
        map2.put("[:ascii:]", new InfiniteAnimationPolicy(iArr6, 1));
        map2.put("[:^ascii:]", new InfiniteAnimationPolicy(iArr6, -1));
        map2.put("[:blank:]", new InfiniteAnimationPolicy(iArr7, 1));
        map2.put("[:^blank:]", new InfiniteAnimationPolicy(iArr7, -1));
        map2.put("[:cntrl:]", new InfiniteAnimationPolicy(iArr8, 1));
        map2.put("[:^cntrl:]", new InfiniteAnimationPolicy(iArr8, -1));
        map2.put("[:digit:]", new InfiniteAnimationPolicy(iArr9, 1));
        map2.put("[:^digit:]", new InfiniteAnimationPolicy(iArr9, -1));
        map2.put("[:graph:]", new InfiniteAnimationPolicy(iArr10, 1));
        map2.put("[:^graph:]", new InfiniteAnimationPolicy(iArr10, -1));
        map2.put("[:lower:]", new InfiniteAnimationPolicy(iArr11, 1));
        map2.put("[:^lower:]", new InfiniteAnimationPolicy(iArr11, -1));
        map2.put("[:print:]", new InfiniteAnimationPolicy(iArr12, 1));
        map2.put("[:^print:]", new InfiniteAnimationPolicy(iArr12, -1));
        map2.put("[:punct:]", new InfiniteAnimationPolicy(iArr13, 1));
        map2.put("[:^punct:]", new InfiniteAnimationPolicy(iArr13, -1));
        map2.put("[:space:]", new InfiniteAnimationPolicy(iArr14, 1));
        map2.put("[:^space:]", new InfiniteAnimationPolicy(iArr14, -1));
        map2.put("[:upper:]", new InfiniteAnimationPolicy(iArr15, 1));
        map2.put("[:^upper:]", new InfiniteAnimationPolicy(iArr15, -1));
        map2.put("[:word:]", new InfiniteAnimationPolicy(iArr16, 1));
        map2.put("[:^word:]", new InfiniteAnimationPolicy(iArr16, -1));
        map2.put("[:xdigit:]", new InfiniteAnimationPolicy(iArr17, 1));
        map2.put("[:^xdigit:]", new InfiniteAnimationPolicy(iArr17, -1));
    }
}
